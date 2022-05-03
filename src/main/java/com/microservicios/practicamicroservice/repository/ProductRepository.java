package com.microservicios.practicamicroservice.repository;

import com.microservicios.practicamicroservice.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity,String> {

}
