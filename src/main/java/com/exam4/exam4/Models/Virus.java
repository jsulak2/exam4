package com.exam4.exam4.Models;
import javax.persistence.*;


@Entity
@Table(name = "virus")
public class Virus
{
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "symptoms")
    private String symptoms;
    @Column(name = "duration")
    private String duration;
    @Column(name = "mortalityrate")
    private String mortalityRate;
    @Column(name = "imageaddress")
    private String imageAddress;

    public Virus(){}

    public Virus(String id, String name, String description, String symptoms, String duration, String mortalityRate, String imageAddress)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.symptoms = symptoms;
        this.duration = duration;
        this.mortalityRate = mortalityRate;
        this.imageAddress = imageAddress;
    }

    public String getId() { return id; }

    public String getName() { return name; }

    public String getDescription() { return description; }

    public String getSymptoms() { return symptoms; }

    public String getDuration() { return duration; }

    public String getMortalityRate() { return mortalityRate; }

    public String getImageAddress() { return imageAddress; }
}
