package com.agavianSoft.springtest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agavianSoft.springtest.models.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
	
	List<Movie> findAll();
}
