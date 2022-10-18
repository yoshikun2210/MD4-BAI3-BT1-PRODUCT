package rikkei.academy.service;

import org.springframework.stereotype.Service;
import rikkei.academy.model.Product;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductServiceIMPL implements IProductService{
    public static List<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product(1,"Sữa",10000,"tốt","vinamil"));
        productList.add(new Product(2,"Kẹo",5000,"ngọt","Hammer"));
        productList.add(new Product(3,"Bánh",20000,"ngon","Kinh đô"));
        productList.add(new Product(4,"Bim Bim",10000,"cay","oscar"));
        productList.add(new Product(5,"Mỳ",30000,"ngon","Hảo hảo"));
        productList.add(new Product(6,"Kem",15000,"ngọt","Tràng Tiền"));
    }


    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {



    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void delete(int id, Product product) {

    }


}
