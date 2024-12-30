package com.goxmore.visit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.goxmore.visit.model.Visit;
import com.goxmore.visit.repository.VisitRepository;

@Service
public class VisitService {
  private final VisitRepository visitRepository;

  public VisitService(VisitRepository visitRepository) {
    this.visitRepository = visitRepository;
  }

  public Visit logVist(Visit visit) {
    System.out.println(visit);
    return visitRepository.save(visit);
  }

  public List<Visit> getVisits() {
    return visitRepository.findAll();
  }

}
