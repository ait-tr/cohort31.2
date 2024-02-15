package services;

import domain.Product;
import repositories.ProductRepository;

import java.util.List;

public class ProductService {

    private MerchService merchService;
    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public void setMerchService(MerchService merchService) {
        this.merchService = merchService;
    }

    // Запрос всех продуктов
    // Запрашиваем у стороннего сервиса, нужна ли информация о поставщике
    // Если нет - удаляем эту информацию
    public List<Product> getAll() {
        List<Product> products = repository.getAll();

        if (merchService.withoutSupplierInfo()) {
            products.forEach(p -> p.setSupplier(null));
        }

        return products;
    }

    // Запрос одного продукта
    // Запрашиваем у стороннего сервиса наценку и применяем её к продукту
    public Product getById(int id) {
        Product product = repository.getById(id);

        if (product != null) {
            double markup = merchService.getMarkup();
            double newPrice = product.getPrice() * (100 + markup) / 100;
            product.setPrice(newPrice);
        }

        return product;
    }

    // Сохранение продукта
    // Обратиться к стороннему сервису для формирования артикула
    public Product save(Product product) {
        merchService.setArticle(product);
        return repository.save(product);
    }

    // Удаление продукта
    // Запрашиваем у стороннего сервиса, нужно ли полное удаление
    // или нужно просто сделать продукт неактивным
    public void deleteById(int id) {
        if (merchService.fullDeletion()) {
            repository.deleteById(id);
        } else {
            Product product = repository.getById(id);

            if (product != null) {
                product.setActive(false);
            }
        }
    }
}