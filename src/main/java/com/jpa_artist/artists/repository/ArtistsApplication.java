package com.jpa_artist.artists.repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.util.Collections;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArtistsApplication {

	public static void initDb() throws ParseException, FileNotFoundException {

		JSONObject artistObj = new JSONObject(new JSONTokener(
			new FileReader("C:/Users/pc/Desktop/java/SpringBoot/jpa_artists/artists/src/main/java/com/jpa_artist/artists/json/Artists.json")));
		//System.out.println(artistObj);
		
		JSONObject ArtworksObj2 = new JSONObject(new JSONTokener(
			new FileReader("C:/Users/pc/Desktop/java/SpringBoot/jpa_artists/artists/src/main/java/com/jpa_artist/artists/json/Artworks.json")));
		//System.out.println(ArtworksObj2);	
	}

	public static void main(String[] args) throws ParseException, FileNotFoundException{
		final SpringApplication app = new SpringApplication(ArtistsApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "7777"));
		app.run(args);
		initDb();
	}

}
