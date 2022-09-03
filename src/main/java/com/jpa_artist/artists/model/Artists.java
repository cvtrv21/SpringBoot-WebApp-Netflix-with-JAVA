package com.jpa_artist.artists.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Artists")
public class Artists{
    @Id
    @GeneratedValue
    @Column
    Long ConstituentID; //primaryKey

    @Column
    String DisplayName;

    @Column
    String ArtistBio;

    @Column
    String Nationality;

    @Column
    String Gender;

    @Column
    int BeginDate;

    @Column
    int EndDate;

    @Column
    String WikiQID;

    @Column
    String ULAN;

    public Artists(Long constituentID, String displayName, String artistBio, String nationality, String gender,
            int beginDate, int endDate, String wikiQID, String uLAN) {
        ConstituentID = constituentID;
        DisplayName = displayName;
        ArtistBio = artistBio;
        Nationality = nationality;
        Gender = gender;
        BeginDate = beginDate;
        EndDate = endDate;
        WikiQID = wikiQID;
        ULAN = uLAN;
    }

    public Artists() {
    }

    public Long getConstituentID() {
        return ConstituentID;
    }

    public void setConstituentID(Long constituentID) {
        ConstituentID = constituentID;
    }

    public String getDisplayName() {
        return DisplayName;
    }

    public void setDisplayName(String displayName) {
        DisplayName = displayName;
    }

    public String getArtistBio() {
        return ArtistBio;
    }

    public void setArtistBio(String artistBio) {
        ArtistBio = artistBio;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getBeginDate() {
        return BeginDate;
    }

    public void setBeginDate(int beginDate) {
        BeginDate = beginDate;
    }

    public int getEndDate() {
        return EndDate;
    }

    public void setEndDate(int endDate) {
        EndDate = endDate;
    }

    public String getWikiQID() {
        return WikiQID;
    }

    public void setWikiQID(String wikiQID) {
        WikiQID = wikiQID;
    }

    public String getULAN() {
        return ULAN;
    }

    public void setULAN(String uLAN) {
        ULAN = uLAN;
    }

    
}