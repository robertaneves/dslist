package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "tb_game")
public class Game {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "game_year")

    private Long id;
    private String title;
    private String genre;
    private Integer year;
    private String platform;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public Game (Long id, Integer year, String title, String genre, String platform,
                String imgUrl, String shortDescription, String longDescription) {

        this.id = id;
        this.year = year;
        this.title = title;
        this.genre = genre;
        this.platform = platform;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }


    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescripition() {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }
    
    public void setLongDescription() {
        this.longDescription = longDescription;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (this == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Game other = (Game) obj;
        return Objects.equals(id, other.id);
    }





}
