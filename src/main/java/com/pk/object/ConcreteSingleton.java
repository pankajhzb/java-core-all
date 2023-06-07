package com.pk.object;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class ConcreteSingleton implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    private static ConcreteSingleton concreteSingleton = null;
    int i;
    String red;

    /**
     * Create class constructor private. In this way outside of the class,
     * object can not be created with the help of new keyword.
     */
    private ConcreteSingleton() {
        this.i = 10;
        this.red = "RED";
    }

    /**
     * To get object of the class create a static method to
     * get object which has been created only once for every client .
     *
     * @return
     */
    public static ConcreteSingleton getInstance() {
        if (concreteSingleton == null) {
            //In the above getInstance() method, think if more than one thread access simultaneously
            //what will happen? More than one object can be created. So to ensure that only one object
            //will be created, we need to use synchronized block. Check the below code.
            synchronized (ConcreteSingleton.class) {
                if (concreteSingleton == null) {
                    concreteSingleton = new ConcreteSingleton();
                }
            }
        }
        return concreteSingleton;
    }

    //An object can have more than one clone. Every clone can act as independent object,
    //so singleton does not persist, if clone is called on the object.
    //Now what can be done? We can override clone method and throw exception in the implementation.
    //See below code snippet.
    public Object clone() throws CloneNotSupportedException {
        return new CloneNotSupportedException();
    }

    //If class is serialized and then de-serialized , we can get new object of the class.
    //So still we have not created 100% Singleton class. Now what can be done?
    //What happens in de-serialization is that it calls readResolve method for how the object will be created.
    //Now we will implement this method to return the same object. Check the implementation.
    private Object readResolve() throws ObjectStreamException {
        return concreteSingleton;

    }
}
