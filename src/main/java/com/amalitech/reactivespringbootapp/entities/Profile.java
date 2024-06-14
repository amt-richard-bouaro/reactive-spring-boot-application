package com.amalitech.reactivespringbootapp.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
@Table(name = "profile_tb_v2")
public class Profile {
  @Id
  private Integer id;
  private String firstName;
  private String lastName;
  private String email;


}
