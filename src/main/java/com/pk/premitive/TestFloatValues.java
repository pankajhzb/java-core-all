package com.pk.premitive;

public class TestFloatValues {
    public static void main(String[] args) {
        float value = new TestFloatValues().f(53, 0);
        System.out.println("float value is :" + value);
    }

    public float f(int x, int y) {
        if (y == 0)
            try {
                throw new Exception("abc");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        return x / y;
    }

}
