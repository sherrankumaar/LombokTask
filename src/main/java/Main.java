public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("GLE", "Mercedes", 2023, 350_000, 2);
        Car c2 = new Car("GLE", "Mercedes", 2023, 350_000, 2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("Are these objects equal? " + c1.equals(c2));
        System.out.println("The hashcode of this object is: " + c1.hashCode());
        System.out.println("The hashcode of this object is: " + c2.hashCode());
    }
}
