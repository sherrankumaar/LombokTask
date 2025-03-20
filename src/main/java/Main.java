public class Main {
    public static void main(String[] args) {
        // 1) Create two different cars, as shown in your screenshot
        CarWithLombok carWithLombok1 = new CarWithLombok("GLE", "Mercedes", 2020, 350000, "white", 5);
        CarWithLombok carWithLombok2 = new CarWithLombok("GLC", "Mercedes", 2023, 200000, "silver", 3);

        // 2) Print them (Lombok's toString())
        System.out.println(carWithLombok1);
        System.out.println(carWithLombok2);

        // 3) Print the color of the first car
        System.out.println(carWithLombok1.getColor());

        // 4) Make the second car identical to the first (so equals() is true)
        carWithLombok2.setModel("GLE");
        carWithLombok2.setYear(2020);
        carWithLombok2.setPrice(350000);
        carWithLombok2.setColor("white");
        carWithLombok2.setQuantity(5);

        // 5) Now both are the same; print equality & matching hash codes
        System.out.println("Are these objects equal? " + carWithLombok1.equals(carWithLombok2));
        System.out.println("The HashCode of this object is: " + carWithLombok1.hashCode());
        System.out.println("The HashCode of this object is: " + carWithLombok2.hashCode());
    }
}
