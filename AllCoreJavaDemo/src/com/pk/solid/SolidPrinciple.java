package com.pk.solid;

public class SolidPrinciple {

    public static void main(String[] args) {
        // 1. https://howtodoinjava.com/best-practices/solid-principles/
        // 2. in 28 minutes

        /** SRP - Single responsibility principle */
        /*
         * “One class should have one and only one responsibility”
         *
         * A class should have only one reason to change.If a class do multiple
         * task then not good only one method/ or similar functional method will
         * be better.
         */
        /** OCP - Open closed principle */
        /*
         * “Software components should be open for extension, but closed for
         * modification”.
         *
         * Example : In Spring framework we can not change their core logic and
         * request processing, but we modify the desired application flow just
         * by extending some classes and plug-in them in configuration files.
         */
        /** LSP Liskov substitution principle */
        /*
         * “Derived types must be completely substitutable for their base
         * types”.
         *
         * This is important when we resort to polymorphic behavior through
         * inheritance.
         *
         *
         */
        /** ISP - Interface segregation principle */
        /*
         * “Clients should not be forced to implement unnecessary methods which
         * they will not use”. Solution is to create two interfaces by breaking
         * the existing one. They should be like PdfReportable and
         * ExcelReportable. This will give the flexibility to users to use only
         * the required functionality only.
         *
         */

        /** DIP Dependency inversion principle */
        /*
         * “Depend on abstractions, not on concretions” we should design our
         * software in such a way that various modules can be separated from
         * each other using an abstract layer to bind them together.
         */

    }

}
