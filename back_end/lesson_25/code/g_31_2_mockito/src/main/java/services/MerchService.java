package services;

import domain.Product;

public interface MerchService {

    boolean withoutSupplierInfo();

    double getMarkup();

    void setArticle(Product product);

    boolean fullDeletion();
}