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
    }
}