package ie.atu.week6cicd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    private int id;
    private String name;
    private double price;


}
