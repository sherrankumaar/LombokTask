import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "brand") // Only compare brand for equals() and hashCode()
public class CarWithLombok {
    private String model;
    private String brand;
    private int year;
    private int price;
    private String color;
    private int quantity;
}
