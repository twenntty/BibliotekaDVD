package org.example;

public class DVD extends Item{
    private String director;
    private int duration;

    public DVD(int id, String title, String director, int duration) {
        super(id, title);
        this.director = director;
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public  int getDuration(){
        return duration;
    }
}
