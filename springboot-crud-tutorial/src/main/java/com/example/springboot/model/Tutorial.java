package com.example.springboot.model;

import jakarta.persistence.*;


@Entity //indicates that class is a persistant Java Class
@Table(name = "tutorials") //names the Table when created
public class Tutorial {

    //Auto generates the ID(primary key) whenever creating a new tutorial entry
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    //@Column annotation used to define column in database
    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "published")
    private boolean published;

    public Tutorial(){

    }

    //Basic Constructors, Getters, and Setters
    public Tutorial(String title, String description, boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }

    public Tutorial(long id, String title, String description, boolean published) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.published = published;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    //toString method
    @Override
    public String toString() {
        return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
    }
}
