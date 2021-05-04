package Examples.ooConcepts.polimorphism;

// Java program for Method overriding

class Parent {
    void Print() {
        System.out.println("parent class");
    }

    void Something() {
    }
}

class child1 extends Parent {
    void Print() {
        System.out.println("subclass1");
    }
}

class child2 extends Parent {

    void Print() {
        System.out.println("subclass2");
    }
}

class TestPolymorphism3 {
    public static void main(String[] args) {
        /**
         *  instantiated var of Parent class
         */
        Parent parent;
        /**
         *instantiated the object of Parent class and assigned that object ot the variable
         */
        parent = new Parent();
        /**
         * Wea re just using the method og the object here
         */
        parent.Print();

        /**
         * we are reassigning var with the new object.
         */
        parent = new child1();
        /**
         * We are using the method from our child class. It's here!!!!!111
         */
        parent.Print();
    }
}