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
public class Varieties implements Serializable {

    private static final long serialVersionUID = 902163175;

    private Integer   id;
    private String    varietyname;
    private Integer   cropId;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Varieties() {}

    public Varieties(Varieties value) {
        this.id = value.id;
        this.varietyname = value.varietyname;
        this.cropId = value.cropId;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Varieties(
        Integer   id,
        String    varietyname,
        Integer   cropId,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.varietyname = varietyname;
        this.cropId = cropId;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVarietyname() {
        return this.varietyname;
    }

    public void setVarietyname(String varietyname) {
        this.varietyname = varietyname;
    }

    public Integer getCropId() {
        return this.cropId;
    }

    public void setCropId(Integer cropId) {
        this.cropId = cropId;
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
        StringBuilder sb = new StringBuilder("Varieties (");

        sb.append(id);
        sb.append(", ").append(varietyname);
        sb.append(", ").append(cropId);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
}