package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
    //id, nextId, value all fields in common
    protected int id;
    protected static int nextId = 1;
    protected String value;

    //same constructors: sets id,nextId and that sets value (empty constructor)
    public JobField() {
            id = nextId;
            nextId++;
        }

    public JobField(String value) {
        this();
        this.value = value;
        }

    //common getters/setters: getValue, setValue, getId

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    //common custom methods: toString(), equals(), hashcode()
    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
