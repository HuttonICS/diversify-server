/*
 * This file is generated by jOOQ.
 */
package jhi.diversify.server.database.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.diversify.server.database.tables.ViewSpeciesdataTraits;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


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
public class ViewSpeciesdataTraitsRecord extends TableRecordImpl<ViewSpeciesdataTraitsRecord> implements Record8<Integer, String, String, String, Timestamp, Timestamp, Long, Long> {

    private static final long serialVersionUID = 475983382;

    /**
     * Setter for <code>diversify3.view_speciesdata_traits.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Create a detached ViewSpeciesdataTraitsRecord
     */
    public ViewSpeciesdataTraitsRecord() {
        super(ViewSpeciesdataTraits.VIEW_SPECIESDATA_TRAITS);
    }

    /**
     * Setter for <code>diversify3.view_speciesdata_traits.traitname</code>.
     */
    public void setTraitname(String value) {
        set(1, value);
    }

    /**
     * Create a detached, initialised ViewSpeciesdataTraitsRecord
     */
    public ViewSpeciesdataTraitsRecord(Integer id, String traitname, String traitcode, String unit, Timestamp createdOn, Timestamp updatedOn, Long datapoints, Long plots) {
        super(ViewSpeciesdataTraits.VIEW_SPECIESDATA_TRAITS);

        set(0, id);
        set(1, traitname);
        set(2, traitcode);
        set(3, unit);
        set(4, createdOn);
        set(5, updatedOn);
        set(6, datapoints);
        set(7, plots);
    }

    /**
     * Setter for <code>diversify3.view_speciesdata_traits.traitcode</code>.
     */
    public void setTraitcode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>diversify3.view_speciesdata_traits.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>diversify3.view_speciesdata_traits.unit</code>.
     */
    public void setUnit(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>diversify3.view_speciesdata_traits.traitname</code>.
     */
    public String getTraitname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>diversify3.view_speciesdata_traits.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>diversify3.view_speciesdata_traits.traitcode</code>.
     */
    public String getTraitcode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>diversify3.view_speciesdata_traits.updated_on</code>.
     */
    public void setUpdatedOn(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>diversify3.view_speciesdata_traits.unit</code>.
     */
    public String getUnit() {
        return (String) get(3);
    }

    /**
     * Setter for <code>diversify3.view_speciesdata_traits.datapoints</code>.
     */
    public void setDatapoints(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>diversify3.view_speciesdata_traits.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(4);
    }

    /**
     * Getter for <code>diversify3.view_speciesdata_traits.updated_on</code>.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(5);
    }

    /**
     * Getter for <code>diversify3.view_speciesdata_traits.plots</code>.
     */
    public Long getPlots() {
        return (Long) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, Timestamp, Timestamp, Long, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, Timestamp, Timestamp, Long, Long> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ViewSpeciesdataTraits.VIEW_SPECIESDATA_TRAITS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ViewSpeciesdataTraits.VIEW_SPECIESDATA_TRAITS.TRAITNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ViewSpeciesdataTraits.VIEW_SPECIESDATA_TRAITS.TRAITCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ViewSpeciesdataTraits.VIEW_SPECIESDATA_TRAITS.UNIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return ViewSpeciesdataTraits.VIEW_SPECIESDATA_TRAITS.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return ViewSpeciesdataTraits.VIEW_SPECIESDATA_TRAITS.UPDATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return ViewSpeciesdataTraits.VIEW_SPECIESDATA_TRAITS.DATAPOINTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return ViewSpeciesdataTraits.VIEW_SPECIESDATA_TRAITS.PLOTS;
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
    public String component2() {
        return getTraitname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTraitcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getUnit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
        return getDatapoints();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component8() {
        return getPlots();
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
    public String value2() {
        return getTraitname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTraitcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUnit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getDatapoints();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getPlots();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewSpeciesdataTraitsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewSpeciesdataTraitsRecord value2(String value) {
        setTraitname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewSpeciesdataTraitsRecord value3(String value) {
        setTraitcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewSpeciesdataTraitsRecord value4(String value) {
        setUnit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewSpeciesdataTraitsRecord value5(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewSpeciesdataTraitsRecord value6(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewSpeciesdataTraitsRecord value7(Long value) {
        setDatapoints(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewSpeciesdataTraitsRecord value8(Long value) {
        setPlots(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewSpeciesdataTraitsRecord values(Integer value1, String value2, String value3, String value4, Timestamp value5, Timestamp value6, Long value7, Long value8) {
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
     * Getter for <code>diversify3.view_speciesdata_traits.datapoints</code>.
     */
    public Long getDatapoints() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>diversify3.view_speciesdata_traits.plots</code>.
     */
    public void setPlots(Long value) {
        set(7, value);
    }
}
