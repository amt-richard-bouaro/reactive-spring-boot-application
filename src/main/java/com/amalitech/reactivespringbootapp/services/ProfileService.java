package com.amalitech.reactivespringbootapp.services;

import com.amalitech.reactivespringbootapp.entities.Profile;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProfileService {
  Flux<Profile> findAllProfiles();
  Mono<Profile> saveProfile(Profile profile);

  Mono<Profile> findProfileById(Integer profileId);
}
