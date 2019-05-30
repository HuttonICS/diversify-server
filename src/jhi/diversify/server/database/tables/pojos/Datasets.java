/*
 * This file is generated by jOOQ.
 */
package jhi.diversify.server.database.tables.pojos;


import java.io.*;
import java.sql.*;

import javax.annotation.*;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Datasets implements Serializable {

    private static final long serialVersionUID = 936189926;

    private Integer   id;
    private String    name;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Datasets() {}

    public Datasets(Datasets value) {
        this.id = value.id;
        this.name = value.name;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Datasets(
        Integer   id,
        String    name,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.name = name;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public Timestamp getUpdatedOn() {
        return this.updatedOn;
    }

    public void setUpdatedOn(Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Datasets (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
}
