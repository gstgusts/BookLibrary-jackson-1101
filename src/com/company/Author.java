package com.company;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class Author {
    private String name;
    private String surname;
    @JacksonXmlProperty(isAttribute=true)
    //@JsonProperty("nick")
    //@JsonIgnore
    //
    private String nickName;

    public Author(String name, String surname, String nickName) {
        this.name = name;
        this.surname = surname;
        this.nickName = nickName;
    }

    public Author() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
