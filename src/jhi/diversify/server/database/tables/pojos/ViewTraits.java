/*
 * This file is generated by jOOQ.
 */
package jhi.diversify.server.database.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTraits implements Serializable {

    private static final long serialVersionUID = 944060348;

    private Integer   id;
    private String    traitname;
    private String    traitcode;
    private String    unit;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    private Long      speciesDataPoints;
    private Long      plotDataPoints;

    public ViewTraits() {}

    public ViewTraits(ViewTraits value) {
        this.id = value.id;
        this.traitname = value.traitname;
        this.traitcode = value.traitcode;
        this.unit = value.unit;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
        this.speciesDataPoints = value.speciesDataPoints;
        this.plotDataPoints = value.plotDataPoints;
    }

    public ViewTraits(
        Integer   id,
        String    traitname,
        String    traitcode,
        String    unit,
        Timestamp createdOn,
        Timestamp updatedOn,
        Long      speciesDataPoints,
        Long      plotDataPoints
    ) {
        this.id = id;
        this.traitname = traitname;
        this.traitcode = traitcode;
        this.unit = unit;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.speciesDataPoints = speciesDataPoints;
        this.plotDataPoints = plotDataPoints;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTraitname() {
        return this.traitname;
    }

    public void setTraitname(String traitname) {
        this.traitname = traitname;
    }

    public String getTraitcode() {
        return this.traitcode;
    }

    public void setTraitcode(String traitcode) {
        this.traitcode = traitcode;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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

    public Long getSpeciesDataPoints() {
        return this.speciesDataPoints;
    }

    public void setSpeciesDataPoints(Long speciesDataPoints) {
        this.speciesDataPoints = speciesDataPoints;
    }

    public Long getPlotDataPoints() {
        return this.plotDataPoints;
    }

    public void setPlotDataPoints(Long plotDataPoints) {
        this.plotDataPoints = plotDataPoints;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewTraits (");

        sb.append(id);
        sb.append(", ").append(traitname);
        sb.append(", ").append(traitcode);
        sb.append(", ").append(unit);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);
        sb.append(", ").append(speciesDataPoints);
        sb.append(", ").append(plotDataPoints);

        sb.append(")");
        return sb.toString();
    }
}