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
public class Plantpartners implements Serializable {

    private static final long serialVersionUID = -2083674143;

    private Integer   id;
    private String    plantpartnername;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Plantpartners() {}

    public Plantpartners(Plantpartners value) {
        this.id = value.id;
        this.plantpartnername = value.plantpartnername;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Plantpartners(
        Integer   id,
        String    plantpartnername,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.plantpartnername = plantpartnername;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlantpartnername() {
        return this.plantpartnername;
    }

    public void setPlantpartnername(String plantpartnername) {
        this.plantpartnername = plantpartnername;
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
        StringBuilder sb = new StringBuilder("Plantpartners (");

        sb.append(id);
        sb.append(", ").append(plantpartnername);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
}