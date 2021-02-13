package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField(){
        this.id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        if(value == null || value.length()<2){
            this.value = "Data not available";
        } else {
            this.value = value;
        }
    }

    @Override
    public String toString() { return value; }
    @Override
    public int hashCode() { return Objects.hash(getId()); }

    // Getters and Setters:

    public int getId() { return id; }
    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }
}
