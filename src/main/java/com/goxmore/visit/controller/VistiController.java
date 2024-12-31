package com.goxmore.visit.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.goxmore.visit.model.Visit;
import com.goxmore.visit.service.VisitService;

import java.util.List;

@RestController
@RequestMapping("apitavt")
public class VistiController {
  private final VisitService visitService;

  public VistiController(VisitService visitService) {
    this.visitService = visitService;
  }

  @PostMapping("/logvisit")
  public Visit logVisit(@RequestBody Visit visit) {
    return visitService.logVist(visit);

  }

  @GetMapping("/getvisits")
  public List<Visit> getVisits() {
    return visitService.getVisits();
  }

  @GetMapping("/test")
  public String getTest() {
    return "get test1";
  }

}
