public class Main {
    public static void main(String[] args) {

        CarWithLombok car1 = new CarWithLombok("GLE", "Mercedes", 2020, 350000, "white", 5);
        CarWithLombok car2 = new CarWithLombok("GLC", "Mercedes", 2023, 200000, "silver", 3);

        System.out.println("Before update:");
        System.out.println("Car 1: " + car1);
        System.out.println("Car 2: " + car2);

        car2.setModel("GLE");
        car2.setYear(2020);
        car2.setPrice(350000);
        car2.setColor("white");
        car2.setQuantity(5);

        System.out.println("\nAfter update:");
        System.out.println("Car 1: " + car1);
        System.out.println("Car 2: " + car2);

        System.out.println("Are both cars equal? " + car1.equals(car2));
        System.out.println("Car 1 HashCode: " + car1.hashCode());
        System.out.println("Car 2 HashCode: " + car2.hashCode());
    }
}
