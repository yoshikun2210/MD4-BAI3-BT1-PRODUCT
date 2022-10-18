package rikkei.academy.service;

import rikkei.academy.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void save (Product product);
    Product findById(int id);
//    Product deleteById(int id);
    void update(int id, Product product);
    void delete(int id,Product product);
}
