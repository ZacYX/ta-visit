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

  private String userAgent;

  private LocalDateTime accessTime;

  private String pageUrl;

  private String ipAddress;

  public Visit() {
  }



  public Visit(Long id, String userAgent, LocalDateTime accessTime, String pageUrl, String ipAddress) {
    this.id = id;
    this.userAgent = userAgent;
    this.accessTime = accessTime;
    this.pageUrl = pageUrl;
    this.ipAddress = ipAddress;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUserAgent() {
    return this.userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  public LocalDateTime getAccessTime() {
    return this.accessTime;
  }

  public void setAccessTime(LocalDateTime accessTime) {
    this.accessTime = accessTime;
  }

  public String getPageUrl() {
    return this.pageUrl;
  }

  public void setPageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
  }

  public String getIpAddress() {
    return this.ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

}
