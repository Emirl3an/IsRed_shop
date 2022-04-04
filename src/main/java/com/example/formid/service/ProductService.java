package com.example.formid.service;

//import com.example.formid.entity.Product;
//import com.example.formid.repository.ProductRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//
//@Service
//public class ProductService {
//
//    private final ProductRepository productRepository;
//
//    @Autowired
//    public ProductService(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }
////    public Films findById(Long id){
////        return filmsRepository.getOne(id);
////    }
//
//    public List<Product> findAll(){
//        return ProductRepository.findAll();
//    }
//
//    public void saveProduct(Product product) {
//        ProductRepository.save(product);
//    }
//
//    public void deleteById(Long id){
//        ProductRepository.deleteById(id);
//    }
//
//
//}


import com.example.formid.entity.Product;
import com.example.formid.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository filmsRepository;

    @Autowired
    public ProductService(ProductRepository filmsRepository) {
        this.filmsRepository = filmsRepository;
    }

    public List<Product> findAll(){
        return filmsRepository.findAll();
    }

    public void saveProduct(Product film) {
        filmsRepository.save(film);
    }

    public void deleteById(Long id){
        filmsRepository.deleteById(id);
    }
}