package com.fatihhernn.ecommerce.dao;

import com.fatihhernn.ecommerce.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "countries" ,path = "countries")
public interface CountryRepository extends JpaRepository<Country,Integer> {

}
