/*
 * This file is generated by jOOQ.
 */
package jhi.diversify.server.database.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.diversify.server.database.tables.Plotdata;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


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
public class PlotdataRecord extends UpdatableRecordImpl<PlotdataRecord> implements Record8<Integer, Integer, Integer, Integer, Integer, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 752210592;

    /**
     * Create a detached PlotdataRecord
     */
    public PlotdataRecord() {
        super(Plotdata.PLOTDATA);
    }

    /**
     * Getter for <code>diversify3.plotdata.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Create a detached, initialised PlotdataRecord
     */
    public PlotdataRecord(Integer id, Integer datasetId, Integer plotId, Integer traitId, Integer rep, String value, Timestamp createdOn, Timestamp updatedOn) {
        super(Plotdata.PLOTDATA);

        set(0, id);
        set(1, datasetId);
        set(2, plotId);
        set(3, traitId);
        set(4, rep);
        set(5, value);
        set(6, createdOn);
        set(7, updatedOn);
    }

    /**
     * Getter for <code>diversify3.plotdata.dataset_id</code>.
     */
    public Integer getDatasetId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>diversify3.plotdata.plot_id</code>.
     */
    public void setPlotId(Integer value) {
        set(2, value);
    }

    /**
     * Setter for <code>diversify3.plotdata.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Setter for <code>diversify3.plotdata.trait_id</code>.
     */
    public void setTraitId(Integer value) {
        set(3, value);
    }

    /**
     * Setter for <code>diversify3.plotdata.dataset_id</code>.
     */
    public void setDatasetId(Integer value) {
        set(1, value);
    }

    /**
     * Setter for <code>diversify3.plotdata.rep</code>.
     */
    public void setRep(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>diversify3.plotdata.plot_id</code>.
     */
    public Integer getPlotId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>diversify3.plotdata.value</code>.
     */
    public void setValue(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>diversify3.plotdata.trait_id</code>.
     */
    public Integer getTraitId() {
        return (Integer) get(3);
    }

    /**
     * Getter for <code>diversify3.plotdata.rep</code>.
     */
    public Integer getRep() {
        return (Integer) get(4);
    }

    /**
     * Getter for <code>diversify3.plotdata.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(6);
    }

    /**
     * Getter for <code>diversify3.plotdata.value</code>.
     */
    public String getValue() {
        return (String) get(5);
    }

    /**
     * Getter for <code>diversify3.plotdata.updated_on</code>.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

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
        return Plotdata.PLOTDATA.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Plotdata.PLOTDATA.DATASET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Plotdata.PLOTDATA.PLOT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Plotdata.PLOTDATA.TRAIT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Plotdata.PLOTDATA.REP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Plotdata.PLOTDATA.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Plotdata.PLOTDATA.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Plotdata.PLOTDATA.UPDATED_ON;
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
        return getPlotId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getTraitId();
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
        return getPlotId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getTraitId();
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
    public PlotdataRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlotdataRecord value2(Integer value) {
        setDatasetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlotdataRecord value3(Integer value) {
        setPlotId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlotdataRecord value4(Integer value) {
        setTraitId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlotdataRecord value5(Integer value) {
        setRep(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlotdataRecord value6(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlotdataRecord value7(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlotdataRecord value8(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlotdataRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, String value6, Timestamp value7, Timestamp value8) {
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

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>diversify3.plotdata.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(6, value);
    }

    /**
     * Setter for <code>diversify3.plotdata.updated_on</code>.
     */
    public void setUpdatedOn(Timestamp value) {
        set(7, value);
    }
}
