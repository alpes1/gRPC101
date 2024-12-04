package com.alpes.grpcserver.dao;


import com.alpes.Creator;

public class Video {

    private String id;
    private String title;
    private String description;
    private String url;
    private int durationSeconds;
    private Creator creator;

    // Getters et setters (ou utilise Lombok)
    // Constructeurs, etc.

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Autres getters et setters
}

