package com.kafka.springbootkafka.payload;

public class User {
    private int id;
    private String firstname;
    private String lastname;

    public void  setFirstname(String name ){
        this.firstname=name;

    }

    public String getFirstname(){
        return firstname;
    }
    public void  setLastname(String name ){
        this.lastname=name;

    }
    public String getlasttname(){
        return lastname;
    }

    public int getId(){
        return id;
    }
    public void  getId(int id ){
        this.id=id;

    }






}


