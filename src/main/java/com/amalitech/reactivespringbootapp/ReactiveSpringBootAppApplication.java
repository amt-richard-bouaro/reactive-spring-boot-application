package com.amalitech.reactivespringbootapp;

import com.amalitech.reactivespringbootapp.entities.Profile;
import com.amalitech.reactivespringbootapp.services.ProfileService;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReactiveSpringBootAppApplication {

  public static void main(String[] args) {
    SpringApplication.run(ReactiveSpringBootAppApplication.class, args);
  }


//  @Bean
//  public CommandLineRunner commandLineRunner(
//      ProfileService profileService
//  ){
//    return args -> {
//      for(int i = 0; i < 100; i++) {
//
//        profileService.saveProfile(
//            Profile.builder()
//                .firstName("King Mac " + i)
//                .lastName("Arthur " + i)
//                .email("macking" + i + "@gmail.com")
//                .build()).subscribe();
//      }
//    };
//  }

}
