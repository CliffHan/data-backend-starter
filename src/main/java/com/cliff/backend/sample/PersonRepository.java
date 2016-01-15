package com.cliff.backend.sample;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * Created by Cliff on 16-1-5.
 */
@Repository
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findByLastName(@Param("name") String name);
    List<Person> findByFirstName(@Param("name") String name);

}