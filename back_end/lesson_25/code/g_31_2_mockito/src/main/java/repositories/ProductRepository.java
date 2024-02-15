package repositories;

import domain.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {

    private Map<Integer, Product> products = new HashMap<>();
    private int currentId;

    public Product save(Product product) {
        product.setId(++currentId);
        products.put(currentId, product);
        return product;
    }

    public List<Product> getAll() {
        return new ArrayList<>(products.values());
    }

    public Product getById(int id) {
        return products.get(id);
    }

    public void deleteById(int id) {
        products.remove(id);
    }
}