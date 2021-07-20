package com.example.magic;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("magicians")
public class Magician {

    private String name;
    private String sname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
