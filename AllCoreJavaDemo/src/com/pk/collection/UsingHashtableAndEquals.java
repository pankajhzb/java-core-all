package com.pk.collection;

import java.util.HashMap;
import java.util.Map;

public class UsingHashtableAndEquals {
    public static void main(String[] args) {
        ConcreteBean ob1 = new ConcreteBean("Pankaj", 32);
        ConcreteBean ob2 = new ConcreteBean("Alok", 35);
        ConcreteBean ob3 = new ConcreteBean("Alok", 35);
        ConcreteBean ob4 = ob1;
        ConcreteBean ob5 = null;
        ConcreteBean ob6 = null;

        Map<ConcreteBean, String> mapObj = new HashMap<ConcreteBean, String>();
        mapObj.put(ob1, "sun");
        mapObj.put(ob2, "moon");

        //here ob2 and ob3 is two object but have same attibute and we dont want to repeatig as a key
        //so we have override equals, and checks for name and age.
        //now map keep only last object value
        mapObj.put(ob3, "earth");

        //If object reference refer to same object repeating as a key, then last
        //kept value will be accessible.
        mapObj.put(ob4, "mars");
        mapObj.put(ob5, "naptune");

        //If object reference refer to null repeating as a key, then last
        //kept value will be accessible.
        mapObj.put(ob6, "saturn");

        System.out.println("size:" + mapObj.size());
        System.out.println("value:" + mapObj.get(ob1));
        System.out.println("value:" + mapObj.get(ob2));
        System.out.println("value:" + mapObj.get(ob3));
        System.out.println("value:" + mapObj.get(ob4));
        System.out.println("value:" + mapObj.get(ob5));
        System.out.println("value:" + mapObj.get(ob6));
    }
}
