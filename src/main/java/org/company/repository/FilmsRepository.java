package org.company.repository;

import org.company.entity.Film;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FilmsRepository extends CrudRepository<Film, Long> {

   @Query(
           value = "select * from films where ?1 = any (films.genre_ids)",
           nativeQuery = true)
   List<Film> getFilmsByGenreIds(int genreId);

}
