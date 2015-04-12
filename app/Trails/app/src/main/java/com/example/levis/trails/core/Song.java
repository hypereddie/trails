package com.example.levis.trails.core;

public class Song {

    private long id=0;

    private String name="";

    private String artist="";

    private long user_id=0;

    private double latitude=0;

    private double longitude=0;

    private long timePosted=0;

    private String[] genre=null;

    private Song() { }

    public long getId() {
        return id;
    }

    public String getSongName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public long getUser_id() {
        return user_id;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public long getTimePosted() {
        return timePosted;
    }

    public String[] getGenre() {
        return genre;
    }
}
