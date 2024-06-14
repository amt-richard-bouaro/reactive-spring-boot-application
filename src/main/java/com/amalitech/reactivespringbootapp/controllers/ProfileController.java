package com.amalitech.reactivespringbootapp.controllers;

import com.amalitech.reactivespringbootapp.entities.Profile;
import com.amalitech.reactivespringbootapp.services.ProfileService;
import java.time.Duration;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/profiles")
public class ProfileController {

  private final ProfileService profileService;

  @GetMapping(value = "/{id}")
  public Mono<Profile> getProfile(@PathVariable Integer id){
    return profileService.findProfileById(id);
  }

  @GetMapping(value = {"/", ""}, produces = MediaType.TEXT_EVENT_STREAM_VALUE)
  public Flux<Profile> getAllProfiles(){
    return profileService.findAllProfiles();
  }

  @PostMapping(value = "/save")
  public Mono<Profile> saveProfile(@RequestBody Profile profile){
    return profileService.saveProfile(profile);
  }

}
