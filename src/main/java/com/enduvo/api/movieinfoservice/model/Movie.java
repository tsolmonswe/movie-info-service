package com.enduvo.api.movieinfoservice.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    String title;
    String overview;
    String releaseDate;
    String adult;
    String original_language;
    String popularity;
    String vote_average;
    String vote_count;
    String backdrop_path;
    String poster_path;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setAdult(String adult) {
        this.adult = adult;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public void setVote_average(String vote_average) {
        this.vote_average = vote_average;
    }

    public void setVote_count(String vote_count) {
        this.vote_count = vote_count;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getAdult() {
        return adult;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public String getPopularity() {
        return popularity;
    }

    public String getVote_average() {
        return vote_average;
    }

    public String getVote_count() {
        return vote_count;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public String getPoster_path() {
        return poster_path;
    }
}
