package com.ecomproject.service.impl;

import com.ecomproject.model.Category;
import com.ecomproject.model.Product;
import com.ecomproject.model.Seller;
import com.ecomproject.repository.CategoryRepository;
import com.ecomproject.repository.ProductRepository;
import com.ecomproject.request.CreateProductRequest;
import com.ecomproject.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    @Override
    public Product createProduct(CreateProductRequest req, Seller seller) {

        Category category1 = categoryRepository.findByCategoryId(req.getCategory());

        if(category1 == null) {
            Category newCategory = new Category();
            newCategory.setCategoryId(req.getCategory());
            newCategory.setLevel(1);
            category1 = categoryRepository.save(newCategory);
        }

        Category category2 = categoryRepository.findByCategoryId(req.getCategory2());

        if(category2 == null) {
            Category newCategory = new Category();
            newCategory.setCategoryId(req.getCategory2());
            newCategory.setLevel(2);
            newCategory.setParentCategory(category1);
            category2 = categoryRepository.save(newCategory);
        }

        Category category3 = categoryRepository.findByCategoryId(req.getCategory3());

        if(category3 == null) {
            Category newCategory = new Category();
            newCategory.setCategoryId(req.getCategory3());
            newCategory.setLevel(3);
            newCategory.setParentCategory(category2);
            category3 = categoryRepository.save(newCategory);
        }

        Product product = new Product();
        product.setSeller(seller);

        return null;
    }

    @Override
    public void deleteProduct(Long productId) {

    }

    @Override
    public Product updateProduct(Long productId, Product product) {
        return null;
    }

    @Override
    public Product findProductById(Long productId) {
        return null;
    }

    @Override
    public List<Product> searchProduct() {
        return List.of();
    }

    @Override
    public Page<Product> getAllProducts(String category, String brand, String colors, String sizes, Integer minPrice, Integer maxPrice, Integer minDiscount, String sort, String stock, Integer pageNumber) {
        return null;
    }

    @Override
    public List<Product> getProductsBySellerId(String sellerId) {
        return List.of();
    }
}
