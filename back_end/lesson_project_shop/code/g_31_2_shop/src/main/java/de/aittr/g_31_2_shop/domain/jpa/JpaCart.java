package de.aittr.g_31_2_shop.domain.jpa;

import de.aittr.g_31_2_shop.domain.interfaces.Cart;
import de.aittr.g_31_2_shop.domain.interfaces.Customer;
import de.aittr.g_31_2_shop.domain.interfaces.Product;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "cart")
public class JpaCart implements Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToMany
    @JoinTable(
            name = "cart_product",
            joinColumns = @JoinColumn(name = "cart_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public JpaCart() {
    }

    public JpaCart(int id, List<Product> products) {
        this.id = id;
        this.products = products;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public void deleteProductById(int productId) {

    }

    @Override
    public void clear() {

    }

    @Override
    public double getTotalPrice() {
        return 0;
    }

    @Override
    public double getAveragePrice() {
        return 0;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JpaCart jpaCart = (JpaCart) o;
        return id == jpaCart.id && Objects.equals(products, jpaCart.products) && Objects.equals(customer, jpaCart.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, products, customer);
    }

    @Override
    public String toString() {
        return "JpaCart{" +
                "id=" + id +
                ", products=" + products +
                ", customer=" + customer +
                '}';
    }
}