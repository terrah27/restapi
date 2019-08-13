package me.taraboyle.restapi.repository;

import me.taraboyle.restapi.entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DogRepository extends CrudRepository<Dog, Long> {
    @Query("select d.id, d.name, d.breed, d.origin from Dog d where d.id=:id")
    String findBreedById(Long id);

    @Query("select id, breed from Dog")
    List<String> findAllBreed();

    @Query("select id, name from Dog")
    List<String> findAllName();
}
