package ch.axa.its.punchclock.domain;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.AssertTrue;

@Entity
@Table(name = "entry")
public class Entry {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private String id;

  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @Column(nullable = false)
  private LocalDateTime checkIn;

  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @Column(nullable = false)
  private LocalDateTime checkOut;

  private String description;

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LocalDateTime getCheckIn() {
    return checkIn;
  }

  public void setCheckIn(LocalDateTime checkIn) {
    this.checkIn = checkIn;
  }

  public LocalDateTime getCheckOut() {
    return checkOut;
  }

  public void setCheckOut(LocalDateTime checkOut) {
    this.checkOut = checkOut;
  }
}
