package com.pk.memory;

public class MemoryLeakApp {
    /*
    One of the quickest ways to assert that you indeed have a memory leak is to enable verbose garbage collection.
    Memory constraint problems can usually be identified by examining patterns in the verbose gc output.

    --------
    Memory leaks in Java occur when objects are no longer in use by the application but
    the garbage collector fails to recognize them as eligible for removal,
    thus retaining them in memory. Several coding practices can lead to this issue:

    Static fields:
    Static variables persist throughout the application's lifecycle.
    If a static field holds a reference to a large object or a collection that continuously
    grows without elements being removed, it prevents the garbage collector from reclaiming the memory.

    Java
    public class StaticReferenceLeak {
        public static List<Integer> numbers = new ArrayList<>();
        public void addBatch() {
            for (int i = 0; i < 100000; i++) {
                numbers.add(i);
            }
        }

        public static void main(String[] args) throws Exception {
            for (int i = 0; i < 1000000; i++) {
                (new StaticReferenceLeak()).addBatch();
                System.gc();
                Thread.sleep(10000);
            }
        }
    }

    Unclosed resources:
    Failing to close resources like database connections,
    file streams, and network sockets after use keeps them active and prevents the associated memory from being released.

    Java
    public void readFile() throws IOException {
        File file = new File("example.txt");
        FileInputStream fis = new FileInputStream(file);
        try {
            // Read from the file
        } finally {
            fis.close(); // Ensure the stream is closed
        }
    }

    Inner classes: Non-static inner classes hold an implicit reference to their outer class.
    If an instance of the inner class outlives the outer class,
    it can prevent the outer class instance from being garbage collected.

    Java
    public class Outer {
        private class Inner {
            // Inner class logic
        }

        public Inner createInner() {
            return new Inner();
        }
    }

    equals() and hashCode():
    Incorrect implementations of these methods can lead to duplicate objects being created in collections like HashSet and HashMap, causing unnecessary memory consumption.

    Finalizers:
    Overriding the finalize() method can delay garbage collection,
    as objects with finalizers are not immediately collected.

    String interning:
    Before Java 7, repeated interning of strings could fill the PermGen space (now Metaspace),
    leading to memory issues.

    Collections:
    Adding objects to collections without removing them when they are no longer needed,
    especially in static collections or caches without eviction policies, can lead to memory leaks.
     */
}
