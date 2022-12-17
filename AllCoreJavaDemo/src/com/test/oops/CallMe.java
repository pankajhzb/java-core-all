package com.test.oops;

public class CallMe implements InterestingEvent {
    private EventNotifier en;

    public CallMe() {
        // Create the event notifier and pass ourself to it.
        en = new EventNotifier(this);
    }

    // Define the actual handler for the event.
    public boolean interestingEvent() {
        // Wow!  Something really interesting must have occurred!
        // Do something...
        System.out.println("Wow!  Something really interesting must have occurred!");
        return true;
    }
    //...
}