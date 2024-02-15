package services;

import domain.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import repositories.ProductRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class ProductServiceTest {

    private ProductService service;
    private ProductRepository repository;
    private MerchService merchService;

    @BeforeEach
    public void init() {
        repository = new ProductRepository();
        repository.save(new Product("Banana", null, 100, "Best Bananas", true));
        repository.save(new Product("Apple", null, 80, "Best Apples", true));
        repository.save(new Product("Orange", null, 200, "Best Oranges", true));
        service = new ProductService(repository);

        merchService = Mockito.mock(MerchService.class);
        service.setMerchService(merchService);
    }

    @Test
    public void checkIfSupplierInfoIsNull() {
        when(merchService.withoutSupplierInfo()).thenReturn(true);
        List<Product> products = service.getAll();
        for (Product product : products) {
            assertNull(product.getSupplier());
        }
    }

    @Test
    public void checkIfSupplierInfoIsNotNull() {
        List<Product> products = service.getAll();
        for (Product product : products) {
            assertNotNull(product.getSupplier());
        }
    }

    @Test
    public void checkIfCorrectArticleWasSet() {
        Product product = new Product();
        String article = "Test777";

        Mockito.doAnswer(x -> {
            Product product1 = x.getArgument(0);
            product1.setArticle(article);
            return product1;
        }).when(merchService).setArticle(product);

        Product savedProduct = service.save(product);
        savedProduct = repository.getById(savedProduct.getId());

        assertNotNull(savedProduct);
        assertEquals(article, savedProduct.getArticle());
    }
}