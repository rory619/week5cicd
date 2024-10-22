package ie.atu.week6cicd;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class ProductService {
    private List<Product> myList = new ArrayList<>();

    public List<Product> addProduct(Product product)
    {
        //Do buisness like retrieving details from database, generating files, pdf's
        myList.add(product);
        return myList;
    }

}
