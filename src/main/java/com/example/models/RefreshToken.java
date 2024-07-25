package com.example.models;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

import javax.persistence.*;

@Entity(name = "refreshtoken")
@Getter
@Setter
public class RefreshToken extends AbstractAuditor {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @OneToOne
  @JoinColumn(name = "user_id", referencedColumnName = "id")
  private User user;

  @Column(nullable = false, unique = true)
  private String token;

  @Column(nullable = false)
  private Instant expiryDate;

}
