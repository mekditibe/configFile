package edu.miu.Service;

import edu.miu.Entity.Product;
import edu.miu.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository userRepository;

    @Override
    public List<Product> findAllProduct() {
        return userRepository.findAll();
    }
}
