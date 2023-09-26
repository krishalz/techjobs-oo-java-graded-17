package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField(String value) {
        this.id = nextId;
        nextId++;
        this.value = value;
    }

    public JobField(int id) {
          this.id = nextId;
          nextId++;
    }


    public JobField(int id, String value) {
        this.id = id;
        this.value = value;
    }
    @Override
    public String toString() {
        return getValue();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    //    @Override
//    public int hashCode() {
//        return Objects.hash(getId(), getValue());
//    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField that)) return false;
        return getId() == that.getId();
    }
    public int getId() {
        return id;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
}
