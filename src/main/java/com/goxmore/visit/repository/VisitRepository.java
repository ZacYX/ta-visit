package com.goxmore.visit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goxmore.visit.model.Visit;

@Repository
public interface VisitRepository extends JpaRepository<Visit, Long> {
}
