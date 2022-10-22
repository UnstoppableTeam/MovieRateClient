package org.company.repository;

import org.company.entity.Genre;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface GenresRepository extends CrudRepository<Genre, Integer> {

}