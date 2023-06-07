package com.pk.design.structural;

public class ProxyPattern {
    public static void main(String[] string){
        Foo foo = (Foo) DebugProxy.newInstance(new FooImpl());
        try {
            Object result = foo.bar("Pranjal");
            System.out.println(result.toString());
        } catch (BazException e) {
            throw new RuntimeException(e);
        }

    }
}
