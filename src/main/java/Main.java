public class Main {
    public static void main(String[] args) {

        CarWithLombok carWithLombok1 = new CarWithLombok("GLE", "Mercedes", 2020, 350000, "white", 5);
        CarWithLombok carWithLombok2 = new CarWithLombok("GLC", "Mercedes", 2023, 200000, "silver", 3);

        System.out.println(carWithLombok1);
        System.out.println(carWithLombok2);

        System.out.println(carWithLombok1.getColor());

        carWithLombok2.setModel("GLE");
        carWithLombok2.setYear(2020);
        carWithLombok2.setPrice(350000);
        carWithLombok2.setColor("white");
        carWithLombok2.setQuantity(5);


        System.out.println("Are these objects equal? " + carWithLombok1.equals(carWithLombok2));
        System.out.println("The HashCode of this object is: " + carWithLombok1.hashCode());
        System.out.println("The HashCode of this object is: " + carWithLombok2.hashCode());
    }
}
