package com.amalitech.reactivespringbootapp.repositories;

import com.amalitech.reactivespringbootapp.entities.Profile;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;


@Repository
public interface ProfileRepository extends ReactiveCrudRepository<Profile, Integer> {
    Flux<Profile> findProfileByFirstNameIgnoreCase(String firstName);
}
