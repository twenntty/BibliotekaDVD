package org.example;

public class Client {
    private int id;
    private String name;
    private String address;
    private String number;

    public Client(int id, String name, String address, String number) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getNumber(){
        return number;
    }
}
