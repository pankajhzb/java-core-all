package com.pk.solidPrinciple;

/**
 * 1. https://howtodoinjava.com/best-practices/solid-principles/
 * 2. in 28 minutes
 * 3. https://www.baeldung.com/java-liskov-substitution-principle
 */
public class SolidPrincipleDefinition {

    public static void main(String[] args) {
        /** 1. SRP - Single responsibility principle */
        /*
         * “One class should have one and only one responsibility”
         *
         * A class should have only one reason to change.If a class do multiple
         * task then not good only one method/ or similar functional method will
         * be better.
         *
         * Example:
         */

        /** 2. OCP - Open closed principle */
        /*
         * “Software components should be open for extension, but closed for
         * modification”.
         *
         * Example : In Spring framework we can not change their core logic and
         * request processing, but we modify the desired application flow just
         * by extending some classes and plug-in them in configuration files.
         *
         * Example: OCP
         * Our banking application supports two account types – “current” and “savings”.
         * These are represented by the classes CurrentAccount and SavingsAccount respectively.
         * The BankingAppWithdrawalService serves the withdrawal functionality to its users:
         * Unfortunately, there is a problem with extending this design.
         * The BankingAppWithdrawalService is aware of the two concrete implementations of account.
         * Therefore, the BankingAppWithdrawalService would need to be changed every time a new account type is introduced.
         *
         * Let’s redesign the solution to comply with the Open/Closed principle.
         * We’ll close BankingAppWithdrawalService from modification when new account types are needed,
         * by using an Account base class instead:
         * Here, we introduced a new abstract Account class that CurrentAccount and SavingsAccount extend.
         * The BankingAppWithdrawalService no longer depends on concrete account classes.
         * Because it now depends only on the abstract class, it need not be changed when a new account type is introduced.
         * Consequently, the BankingAppWithdrawalService is open for the extension with new account types,
         * but closed for modification, in that the new types don’t require it to change in order to integrate.
         */

        /** LSP Liskov substitution principle */
        /*
         * “Derived types must be completely substitutable for their base
         * types”.
         *
         * This is important when we resort to polymorphic behavior through
         * inheritance.
         *
         * For the Open/Closed Principle to work well,
         * all subtypes must be substitutable for their supertype without ever having to modify the client code.
         * Adhering to the Liskov Substitution Principle ensures this substitutability.
         *
         * Example:
         */

        /** ISP - Interface segregation principle */
        /*
         * “Clients should not be forced to implement unnecessary methods which
         * they will not use”.
         *
         * Solution is to create two interfaces by breaking the existing one.
         *
         * They should be like PdfReportable and ExcelReportable. This will give the flexibility to users to use only
         * the required functionality only.
         *
         * Example:
         */

        /** DIP Dependency inversion principle */
        /*
         * “Depend on abstractions, not on concretions” we should design our
         * software in such a way that various modules can be separated from
         * each other using an abstract layer to bind them together.
         *
         * Example:
         */

    }

}
