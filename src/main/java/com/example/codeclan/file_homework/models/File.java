package com.example.codeclan.file_homework.models;

import javax.persistence.*;

@Entity
@Table(name = "files")
public class File {

    @Column(name = "name")
    private String name;

    @Column(name = "extension")
    private String extension;

    @Column(name = "size")
    private double size;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public File(){

    }

    public File(String name, String extension, double size){
        this.name = name;
        this.extension = extension;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
