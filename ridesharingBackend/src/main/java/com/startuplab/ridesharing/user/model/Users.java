package com.startuplab.ridesharing.user.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Users {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long Id;
    @JsonProperty
    private String userName;
    @JsonProperty
    private String password;
    @JsonProperty
    private String firstName;
    @JsonProperty
    private String lastName;
    @JsonProperty
    private String type;
    @JsonProperty
    private String email;
    @JsonProperty
    private String intStatus;
}
