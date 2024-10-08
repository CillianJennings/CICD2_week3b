package ie.atu.week3_recap_partb;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class InventoryService {
    private final List<Product> inventoryList = new ArrayList<>();

    public String addProduct(Product product) {
        inventoryList.add(product);
        return "Product added successfully to warehouse";
    }
}
