package mundi.a.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import mundi.a.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
