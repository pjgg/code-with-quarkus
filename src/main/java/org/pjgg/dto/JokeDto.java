package org.pjgg.dto;

import org.pjgg.model.Joke;

public class JokeDto {

    private String ID;
    private String value;

    public static JokeDto fromJoke(final Joke joke){
        return new JokeDto(joke.getID(), joke.getValue());
    }

    public JokeDto(String ID, String value) {
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
