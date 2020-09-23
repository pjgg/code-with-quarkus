package org.pjgg.model;

public class Joke {

    private String ID;
    private String value;

    public Joke(String ID, String value) {
        this.ID = ID;
        this.value = value;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
