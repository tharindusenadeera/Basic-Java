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
    }
}