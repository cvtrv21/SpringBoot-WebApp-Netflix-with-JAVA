package com.jpa_artist.artists.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jpa_artist.artists.model.Artworks;

public interface ArtworksRepository extends CrudRepository<Artworks, Long> {

    Artworks getArtworksById(Long ObjectID);

    @Query(value = "SELECT a FROM Artworks a", nativeQuery = false)
    ArrayList<Artworks> getAllArtworks();

    
}
