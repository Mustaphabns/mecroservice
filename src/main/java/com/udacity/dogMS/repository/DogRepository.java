package com.udacity.dogMS.repository;

import com.udacity.dogMS.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog,Long> {
}
