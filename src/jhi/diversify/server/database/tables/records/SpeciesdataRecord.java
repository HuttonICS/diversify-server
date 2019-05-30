/*
 * This file is generated by jOOQ.
 */
package jhi.diversify.server.database.tables.records;


import org.jooq.*;
import org.jooq.impl.*;

import java.sql.*;

import javax.annotation.*;

import jhi.diversify.server.database.tables.*;


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
public class SpeciesdataRecord extends UpdatableRecordImpl<SpeciesdataRecord> implements Record8<Integer, Integer, Integer, Integer, Integer, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -144180960;

    /**
     * Create a detached SpeciesdataRecord
     */
    public SpeciesdataRecord() {
        super(Speciesdata.SPECIESDATA);
    }

    /**
     * Create a detached, initialised SpeciesdataRecord
     */
    public SpeciesdataRecord(Integer id, Integer datasetId, Integer traitId, Integer varietyinplotId, Integer rep, String value, Timestamp createdOn, Timestamp updatedOn) {
        super(Speciesdata.SPECIESDATA);

        set(0, id);
        set(1, datasetId);
        set(2, traitId);
        set(3, varietyinplotId);
        set(4, rep);
        set(5, value);
        set(6, createdOn);
        set(7, updatedOn);
    }

    /**
     * Getter for <code>diversify3.speciesdata.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>diversify3.speciesdata.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>diversify3.speciesdata.dataset_id</code>.
     */
    public Integer getDatasetId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>diversify3.speciesdata.dataset_id</code>.
     */
    public void setDatasetId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>diversify3.speciesdata.trait_id</code>.
     */
    public Integer getTraitId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>diversify3.speciesdata.trait_id</code>.
     */
    public void setTraitId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>diversify3.speciesdata.varietyinplot_id</code>.
     */
    public Integer getVarietyinplotId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>diversify3.speciesdata.varietyinplot_id</code>.
     */
    public void setVarietyinplotId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>diversify3.speciesdata.rep</code>.
     */
    public Integer getRep() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>diversify3.speciesdata.rep</code>.
     */
    public void setRep(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>diversify3.speciesdata.value</code>.
     */
    public String getValue() {
        return (String) get(5);
    }

    /**
     * Setter for <code>diversify3.speciesdata.value</code>.
     */
    public void setValue(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>diversify3.speciesdata.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>diversify3.speciesdata.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(6, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>diversify3.speciesdata.updated_on</code>.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>diversify3.speciesdata.updated_on</code>.
     */
    public void setUpdatedOn(Timestamp value) {
        set(7, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, Integer, Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, Integer, Integer, String, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Speciesdata.SPECIESDATA.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Speciesdata.SPECIESDATA.DATASET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Speciesdata.SPECIESDATA.TRAIT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Speciesdata.SPECIESDATA.VARIETYINPLOT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Speciesdata.SPECIESDATA.REP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Speciesdata.SPECIESDATA.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Speciesdata.SPECIESDATA.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Speciesdata.SPECIESDATA.UPDATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getDatasetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getTraitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getVarietyinplotId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getRep();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getDatasetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getTraitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getVarietyinplotId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getRep();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpeciesdataRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpeciesdataRecord value2(Integer value) {
        setDatasetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpeciesdataRecord value3(Integer value) {
        setTraitId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpeciesdataRecord value4(Integer value) {
        setVarietyinplotId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpeciesdataRecord value5(Integer value) {
        setRep(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpeciesdataRecord value6(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpeciesdataRecord value7(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public SpeciesdataRecord value8(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpeciesdataRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, String value6, Timestamp value7, Timestamp value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }
}