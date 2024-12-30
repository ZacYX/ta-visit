package com.goxmore.visit.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;

@Entity
public class Visit {
  @Id
  @GeneratedValue
  private Long id;

  private String name;

  @Email
  private String email;

  @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
  private LocalDateTime accessTime;

  private String page;

  private String ipAddress;

  public Visit() {
  }

  public Visit(Long id, String name, String email, LocalDateTime accessTime, String page, String ipAddress) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.accessTime = accessTime;
    this.page = page;
    this.ipAddress = ipAddress;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LocalDateTime getAccessTime() {
    return this.accessTime;
  }

  public void setAccessTime(LocalDateTime accessTime) {
    this.accessTime = accessTime;
  }

  public String getPage() {
    return this.page;
  }

  public void setPage(String page) {
    this.page = page;
  }

  public String getIpAddress() {
    return this.ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

}
