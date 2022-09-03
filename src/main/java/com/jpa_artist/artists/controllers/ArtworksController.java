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

import com.jpa_artist.artists.model.Artworks;
import com.jpa_artist.artists.repository.ArtworksRepository;

@RestController
@RequestMapping("api")
public class ArtworksController {

    @Autowired
    ArtworksRepository artworksRepository;
     //--------------------------------------------------------------------------------Get Artwork
     @GetMapping(path = "get-artwork", produces = MediaType.APPLICATION_JSON_VALUE)
     public ResponseEntity<Artworks> getArtwork(@RequestParam(name="id", required = true) 
     Long id){
 
         Artworks artworks = artworksRepository.getArtworksById(id);
 
         return new ResponseEntity<Artworks>(artworks, HttpStatus.OK);
     }
     
     //-------------------------------------------------------------------------------Get Artworks
     @GetMapping(path = "get-artworks", produces = MediaType.APPLICATION_JSON_VALUE)
     public ArrayList<Artworks> getArtworks(){         
         return artworksRepository.getAllArtworks();
     }
    
}
