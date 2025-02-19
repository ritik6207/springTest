package com.agavianSoft.springtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agavianSoft.springtest.models.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long>{
}
