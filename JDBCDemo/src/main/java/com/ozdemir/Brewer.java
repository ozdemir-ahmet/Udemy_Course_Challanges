package com.ozdemir;

public class Brewer {
    private int Id;
    private String name;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Brewer{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
