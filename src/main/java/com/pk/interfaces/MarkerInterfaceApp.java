package com.pk.interfaces;

public class MarkerInterfaceApp {
/*
    Marker interfaces in Java are interfaces that contain no methods. They act as a "tag" or "marker" to the compiler or JVM, indicating that a class implementing the interface has certain characteristics or behaviors. The garbage collector (GC) in Java does not directly interact with marker interfaces in the way some might expect.
    Here's a more detailed explanation:
    Purpose of Marker Interfaces:
    Marker interfaces are used to signal specific characteristics to the compiler or JVM. For example, the Serializable interface indicates that a class can be serialized, while Cloneable indicates that a class supports cloning.
    How the GC interacts:
    The GC is responsible for automatically reclaiming memory occupied by objects that are no longer in use. It doesn't directly use marker interfaces to determine which objects are eligible for garbage collection.
    Marker interfaces and GC:
    When a class implements a marker interface, the compiler or JVM might use this information to perform specific actions or modify the behavior of the class. However, the GC itself typically uses graph traversal and other mechanisms to determine which objects are reachable and therefore not eligible for garbage collection.
    Example: Serializable:
    A class implementing Serializable is marked for serialization. The serialization process (using ObjectOutputStream) handles the object's internal state and converts it into a byte stream, which is then stored or transmitted. The GC does not intervene in this process, and the Serializable interface itself doesn't have any methods that the GC would directly use.
    In essence: Marker interfaces primarily serve as tags or indicators to the compiler and JVM for runtime behavior, but they do not directly control the GC's memory management.
*/
}
