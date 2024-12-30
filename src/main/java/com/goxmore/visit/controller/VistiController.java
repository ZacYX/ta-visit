package com.goxmore.visit.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.goxmore.visit.model.Visit;
import com.goxmore.visit.service.VisitService;

import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class VistiController {
  private final VisitService visitService;

  public VistiController(VisitService visitService) {
    this.visitService = visitService;
  }

  @PostMapping("/api/visit")
  public Visit logVisit(@RequestBody Visit visit) {
    return visitService.logVist(visit);

  }

  @GetMapping("/api/visit")
  public List<Visit> getVisits() {
    return visitService.getVisits();
  }

}
