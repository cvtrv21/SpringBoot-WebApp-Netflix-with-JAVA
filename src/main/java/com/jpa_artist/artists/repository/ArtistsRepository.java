package com.jpa_artist.artists.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jpa_artist.artists.model.Artists;

public interface ArtistsRepository extends CrudRepository<Artists, Long> {

    Artists getArtistsById(Long id);

    @Query(value = "SELECT a FROM Artists a", nativeQuery = false)
    ArrayList<Artists> getAllArtists();

    
}
