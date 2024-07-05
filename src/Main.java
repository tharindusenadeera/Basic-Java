public class Main {
    public static void main(String[] args) {

        Car carNumOne = new Car();
        carNumOne.model = "Toyota Corolla AE 100";
        carNumOne.color = "Grey";
        carNumOne.seats = 4;
        carNumOne.display();

        Car carNumTwo = new Car();
        carNumTwo.model = "Toyota Corolla 121";
        carNumTwo.color = "Maroon";
        carNumTwo.seats = 4;
        carNumTwo.display();
    }
}