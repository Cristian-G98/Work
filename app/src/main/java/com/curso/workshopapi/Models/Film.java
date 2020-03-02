package com.curso.workshopapi.Models;

//Developed by Cristian 2020

public class Film {

    String title;
    int epidose_id;
    String opening_clawl;
    String director;
    String producer;
    String release_date;

    String[] characters;
    String[] planets;
    String[] startships;
    String[] vehicles;
    String[] species;

    String created;
    String edited;
    String url;

    public Film(){}

    public String getTitle() {
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public int getEpidose_id() {
        return epidose_id;
    }

    public void setEpidose_id(int epidose_id) {
        this.epidose_id = epidose_id;
    }

    public String getOpening_clawl() {
        return opening_clawl;
    }

    public void setOpening_clawl(String opening_clawl) {
        this.opening_clawl = opening_clawl;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String[] getCharacters() {
        return characters;
    }

    public void setCharacters(String[] characters) {
        this.characters = characters;
    }

    public String[] getPlanets() {
        return planets;
    }

    public void setPlanets(String[] planets) {
        this.planets = planets;
    }

    public String[] getStartships() {
        return startships;
    }

    public void setStartships(String[] startships) {
        this.startships = startships;
    }

    public String[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(String[] vehicles) {
        this.vehicles = vehicles;
    }

    public String[] getSpecies() {
        return species;
    }

    public void setSpecies(String[] species) {
        this.species = species;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
