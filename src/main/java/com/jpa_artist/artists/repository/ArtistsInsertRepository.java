package com.jpa_artist.artists.repository;

import org.springframework.stereotype.Repository;

import com.jpa_artist.artists.model.Artists;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class ArtistsInsertRepository {

    @PersistenceContext
    private EntityManager entityManager;


    //-----------------------Inserimento con QUERY
    @Transactional
    public void insertWithQuery(Artists artist){
        entityManager.createNativeQuery("INSERT INTO Artists(DisplayName, ArtistBio, Nationality, Gender, BeginDate, EndDate")
        .setParameter(1, artist.getDisplayName())
        .setParameter(2, artist.getArtistBio())
        .setParameter(3, artist.getNationality())
        .setParameter(4, artist.getGender())
        .setParameter(5, artist.getBeginDate())
        .setParameter(6, artist.getEndDate());
    }
    
    
}
