package com.thymeleaf.st.service;

import org.springframework.data.repository.CrudRepository;
import com.thymeleaf.st.model.Product;

public interface ProductService extends CrudRepository<Product,Long> {}
