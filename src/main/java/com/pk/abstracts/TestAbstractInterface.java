package com.pk.abstracts;

public class TestAbstractInterface {

    //Abstract Interface
    AbsI1 absI1 = new AbsI1() {
        public void a() {

        }

        public void b() {

        }

        public int c() {
            return 0;
        }
    };
    //Interface
    I1 i1 = new I1() {
        public void add() {
        }

        public int sub() {
            return 0;
        }
    };

    public static void main(String[] args) {
        System.out.println("absI1 value : " + new TestAbstractInterface().absI1.c());
        System.out.println("absI1 value : " + new TestAbstractInterface().i1.sub());
    }

    public AbsI1 getAbsI1() {
        return absI1;
    }

    public void setAbsI1(AbsI1 absI1) {
        this.absI1 = absI1;
    }

}
