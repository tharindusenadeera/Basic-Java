public class Main {
    public static void main(String[] args) {

        /* There are 2 ways to initialize instance variables
        * At the time of declaration
        * Method
        * From main class using reference variable
        * */

        // At the time of declaration
        Lorry lorryNumOne = new Lorry();
        lorryNumOne.display();

        // Method
        Bus busNumOne = new Bus();
        busNumOne.initialize("Isuzu", "White", 39);
        busNumOne.display();


        // From main class using reference variable
        Car carNumOne = new Car();
        carNumOne.model = "Toyota Corolla";
        carNumOne.color = "Grey";
        carNumOne.seats = 4;
        carNumOne.display();

        // constructor initialization
        Bike bikeNumOne = new Bike("Honda C90", "Grey", 2);
        bikeNumOne.display();

        /* Inheritance Types
        * Single Inheritance
        * Hierarchical Inheritance
        * Multi Level Inheritance
        * Multiple Inheritance
        * Hybrid Inheritance
        * */

        // Single Inheritance
        SingleInheritanceA singleInheritanceA = new SingleInheritanceA();
        singleInheritanceA.singleInhMethodA();

        SingleInheritanceB singleInheritanceB = new SingleInheritanceB();
        singleInheritanceB.singleInhMethodB();
        singleInheritanceB.singleInhMethodA();

        SingleInheritanceA singleInheritanceA1 = new SingleInheritanceB();
        singleInheritanceA1.singleInhMethodA();
        //singleInheritanceA1.singleInhMethodB(); Cannot be used

        //Hierarchical Inheritance
        HierarchicalInheritanceA hierarchicalInheritanceA = new HierarchicalInheritanceA();
        hierarchicalInheritanceA.hierarchicalInhMethodA();

        HierarchicalInheritanceB hierarchicalInheritanceB = new HierarchicalInheritanceB();
        hierarchicalInheritanceB.hierarchicalInhMethodB();
        hierarchicalInheritanceB.hierarchicalInhMethodA();

        HierarchicalInheritanceC hierarchicalInheritanceC = new HierarchicalInheritanceC();
        hierarchicalInheritanceC.hierarchicalInhMethodC();
        hierarchicalInheritanceC.hierarchicalInhMethodA();

        // Multilevel Inheritance
        MultilevelInheritanceA multilevelInheritanceA = new MultilevelInheritanceA();
        multilevelInheritanceA.multilevelInhMethodA();

        MultilevelInheritanceB multilevelInheritanceB = new MultilevelInheritanceB();
        multilevelInheritanceB.multilevelInhMethodB();
        multilevelInheritanceB.multilevelInhMethodA();

        MultilevelInheritanceC multilevelInheritanceC = new MultilevelInheritanceC();
        multilevelInheritanceC.multilevelInhMethodC();
        multilevelInheritanceC.multilevelInhMethodB();
        multilevelInheritanceC.multilevelInhMethodA();


        /* Polymorphism
        *  Method Overloading
        *  Method Overriding */

        /* Method Overloading (3 ways)
        *
        * By number of parameters
        * By data type of the parameter
        * By order of the parameter
        *
        * */

        MethodOverloading methodOverloading = new MethodOverloading();

        // By number of parameters
        methodOverloading.numberOfParameters();
        methodOverloading.numberOfParameters(10);

        //By data type of the parameter
        methodOverloading.dataType(10);
        methodOverloading.dataType(10f);

        //By order of the parameter
        methodOverloading.orderOfParameter(10f, 10);
        methodOverloading.orderOfParameters(10,10f);

        // Constructor overloading
        ConstructorOverloading constructorOverloading = new ConstructorOverloading(10);

        // Polymorphism - Method Overriding
        SingleInheritanceA a = new SingleInheritanceB();
        a.singleInhMethodA();
        System.out.println("variable " + a.i); // Cannot achieve by data members

        // Instanceof
        Main main = new Main();
        System.out.println(main instanceof Main);

        // Abstraction
        Bank1 bank1 = new Bank1();
        bank1.getInterest();

        //Interfaces
        PaperA6 paperA6 = new PaperA6();
        paperA6.print();

        //Multiple inheritance
        PaperA4 paperA4 = new PaperA4();
        paperA4.draw();
        paperA4.print();

        //Interface inheritance
        PaperA3 paperA3 = new PaperA3();
        paperA3.show();
        paperA3.print();

        // Encapsulation
        EncapsulationA encapsulationA = new EncapsulationA();
        encapsulationA.setName("Tharindu");
        System.out.println("Name is " + encapsulationA.getName());

    }
}