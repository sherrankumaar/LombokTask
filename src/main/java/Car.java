import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private int quantity;
}
