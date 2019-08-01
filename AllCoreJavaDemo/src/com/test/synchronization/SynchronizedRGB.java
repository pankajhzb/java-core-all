package com.test.synchronization;

public class SynchronizedRGB {
	 // Values must be between 0 and 255.
    private int red;
    private int green;
    private int blue;
    private String name;

    private void check(int red,int green,int blue) {
        if (red < 0 || red > 255|| green < 0 || green > 255|| blue < 0 || blue > 255) 
        {
            throw new IllegalArgumentException();
        }
    }
//initialize the attribute, and check bound 
    public SynchronizedRGB(int red,int green,int blue,String name) {
        check(red, green, blue);
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.name = name;
    }
    
//set the values, check bonds, and synchronized calling object so that no other thread set that time.
    public synchronized void set(int red,int green,int blue,String name) {
        
    	//method check is outside the synchronized block, so that other thread can check.
    	check(red, green, blue);
    	//sets the values synchronously,ie no other thread can access during setting the values.
        synchronized (this) {
            this.red = red;
            this.green = green;
            this.blue = blue;
            this.name = name;
            try {
            	//Causes the currently executing thread to sleep (temporarily cease execution) for 
            	//the specified number of milliseconds, subject to the precision and accuracy of system timers and 
            	//schedulers. The thread does not lose ownership of any monitors.
            	//Thread.sleep(1111);
            	
            	//Causes the current thread to wait until either another thread invokes the java.lang.Object.notify() method or 
            	//the java.lang.Object.notifyAll() method for this object, or a specified amount of time has elapsed. 
            	//The current thread must own this object's monitor. 
				wait(0);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
    }

    //test with add or remove synchronized
    public synchronized int getRGB() {
        return ((red << 16) | (green << 8) | blue);
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void invert() {
        red = 255 - red;
        green = 255 - green;
        blue = 255 - blue;
        name = "Inverse of " + name;
    }
	
	public static void main(String[] args) {
		//if we use SynchronizedRGB, the color object is not immutable,
		//ie state of the object is not immutable if set color, after getting it.
		final SynchronizedRGB color = new SynchronizedRGB(233, 255, 223, "mycolor");
		final SynchronizedRGB color1 = new SynchronizedRGB(222, 235, 223, "mycolor1");
		final SynchronizedRGB color2 = new SynchronizedRGB(232, 205, 222, "mycolor2");
		
		//here check for valid input.
		//color.set(2, 256, 6, "mycolor2");
		
		//Thread 1
		new Thread(new Runnable(){
			@Override
			public void run() {
				//Cannot refer to a non-final variable color inside an inner class defined in a different method
				color.set(231, 222, 123, "mycolor");
				color1.set(201, 222, 163, "mycolor1");
				color2.set(251, 242, 223, "mycolor2");

			}
		}).start();
		
		//Thread 2
		new Thread(new Runnable(){
			@Override
			public void run() {
				color.set(23, 22, 23, "mycolor");
				color.set(231, 22, 23, "mycolor");
				color.set(21, 22, 23, "mycolor");
				
				//Cannot refer to a non-final variable color inside an inner class defined in a different method
				//Print values
								
				System.out.println("Color Name:"+color.getName() + ","+color.getRGB());
				System.out.println("Color Name1:"+color1.getName() + ","+color1.getRGB());
				System.out.println("Color Name2:"+color2.getName() + ","+color2.getRGB());
			}
		}).start();
	}
}

//synchronized (color) {
//int myColorInt = color.getRGB();
//color.set(1, 2, 3, "SynchronizedRGB color");
//String myColorName = color.getName();
//System.out.println("Color value:"+myColorInt);
//System.out.println("Color Name:"+myColorName);
//} 

//int myColorInt = color.getRGB();      //Statement 1
//String myColorName = color.getName(); //Statement 2

// if use ImmutableRGB class which is final then we can get immutable object ,
//ie no matter to first get or set.

//ImmutableRGB  color1 = new ImmutableRGB(1,2,3,"Pitch Black");
//int myColorInt1 = color1.getRGB();      //Statement 1
//color1.invert();
//String myColorName1 = color1.getName(); //Statement 2
//System.out.println("_________________________________");
//System.out.println("Color value:"+myColorInt1);
//System.out.println("Color Name:"+myColorName1);







