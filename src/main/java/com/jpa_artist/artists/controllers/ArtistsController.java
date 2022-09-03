package com.jpa_artist.artists.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jpa_artist.artists.model.Artists;
import com.jpa_artist.artists.repository.ArtistsRepository;

@RestController
@RequestMapping("api")
public class ArtistsController {

    @Autowired
    ArtistsRepository artistsRepository;

    //--------------------------------------------------------------------------------Get Artist
    @GetMapping(path = "get-artist", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Artists> getArtists(@RequestParam(name="id", required = true) 
    Long id){

        Artists artist = artistsRepository.getArtistsById(id);

        return new ResponseEntity<Artists>(artist, HttpStatus.OK);
    }

    @GetMapping(path = "get-artists", produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<Artists> getArtists(){
        
        return artistsRepository.getAllArtists();
    }

    

    
}
