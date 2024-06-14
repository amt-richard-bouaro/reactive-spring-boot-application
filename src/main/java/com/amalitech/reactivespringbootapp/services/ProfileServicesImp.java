package com.amalitech.reactivespringbootapp.services;

import com.amalitech.reactivespringbootapp.entities.Profile;
import com.amalitech.reactivespringbootapp.repositories.ProfileRepository;
import java.time.Duration;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
@RequiredArgsConstructor
public class ProfileServicesImp implements ProfileService{

  private final ProfileRepository profileRepository;

  @Override
  public Flux<Profile> findAllProfiles() {
    return profileRepository.findAll().delayElements(Duration.ofSeconds(1));
  }

  @Override
  public Mono<Profile> saveProfile(Profile profile) {
    return profileRepository.save(profile);
  }


  @Override
  public Mono<Profile> findProfileById(Integer profileId) {
    return profileRepository.findById(profileId);
  }
}
