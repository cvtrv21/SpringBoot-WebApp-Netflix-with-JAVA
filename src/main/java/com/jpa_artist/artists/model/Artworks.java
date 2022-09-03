package com.jpa_artist.artists.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Artworks")
public class Artworks {
    
    @Column
    Long ConstituentID; 

    @Column
    String Title;

    @Column(name = "ConstituenID")
    String id;

    @Column
    String ArtistBio;

    @Column
    String Nationality;

    @Column
    String BeginDate;

    @Column
    String EndDate;

    @Column
    String Gender;

    @Column
    String Date;

    @Column
    String Medium;

    @Column
    String Department;

    @Column
    String Cataloged;

    @Id
    @GeneratedValue
    @Column
    Long ObjectID;

    @Column
    String ThumbnailURL;

    @Column
    Long Height;

    @Column
    Long Width;

    public Artworks() {
    }

    public Artworks(Long constituentID, String title, String id, String artistBio, String nationality, String beginDate,
            String endDate, String gender, String date, String medium, String department, String cataloged,
            Long objectID, String thumbnailURL, Long height, Long width) {
        ConstituentID = constituentID;
        Title = title;
        this.id = id;
        ArtistBio = artistBio;
        Nationality = nationality;
        BeginDate = beginDate;
        EndDate = endDate;
        Gender = gender;
        Date = date;
        Medium = medium;
        Department = department;
        Cataloged = cataloged;
        ObjectID = objectID;
        ThumbnailURL = thumbnailURL;
        Height = height;
        Width = width;
    }

    public Long getConstituentID() {
        return ConstituentID;
    }

    public void setConstituentID(Long constituentID) {
        ConstituentID = constituentID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getBeginDate() {
        return BeginDate;
    }

    public void setBeginDate(String beginDate) {
        BeginDate = beginDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getMedium() {
        return Medium;
    }

    public void setMedium(String medium) {
        Medium = medium;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getCataloged() {
        return Cataloged;
    }

    public void setCataloged(String cataloged) {
        Cataloged = cataloged;
    }

    public Long getObjectID() {
        return ObjectID;
    }

    public void setObjectID(Long objectID) {
        ObjectID = objectID;
    }

    public String getThumbnailURL() {
        return ThumbnailURL;
    }

    public void setThumbnailURL(String thumbnailURL) {
        ThumbnailURL = thumbnailURL;
    }

    public Long getHeight() {
        return Height;
    }

    public void setHeight(Long height) {
        Height = height;
    }

    public Long getWidth() {
        return Width;
    }

    public void setWidth(Long width) {
        Width = width;
    }



    

    
}
