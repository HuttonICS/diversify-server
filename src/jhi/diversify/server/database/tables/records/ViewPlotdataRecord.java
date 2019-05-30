/*
 * This file is generated by jOOQ.
 */
package jhi.diversify.server.database.tables.records;


import org.jooq.*;
import org.jooq.impl.*;

import java.math.*;
import java.sql.*;

import javax.annotation.*;

import jhi.diversify.server.database.tables.*;


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
public class ViewPlotdataRecord extends TableRecordImpl<ViewPlotdataRecord> implements Record16<String, Integer, String, Integer, Integer, Integer, Integer, BigDecimal, Timestamp, Timestamp, Integer, String, Integer, String, String, String> {

    private static final long serialVersionUID = 654408466;

    /**
     * Create a detached ViewPlotdataRecord
     */
    public ViewPlotdataRecord() {
        super(ViewPlotdata.VIEW_PLOTDATA);
    }

    /**
     * Create a detached, initialised ViewPlotdataRecord
     */
    public ViewPlotdataRecord(String plotcode, Integer siteid, String sitename, Integer id, Integer plotId, Integer traitId, Integer rep, BigDecimal value, Timestamp createdOn, Timestamp updatedOn, Integer datasetid, String datasetname, Integer year, String traitname, String traitcode, String unit) {
        super(ViewPlotdata.VIEW_PLOTDATA);

        set(0, plotcode);
        set(1, siteid);
        set(2, sitename);
        set(3, id);
        set(4, plotId);
        set(5, traitId);
        set(6, rep);
        set(7, value);
        set(8, createdOn);
        set(9, updatedOn);
        set(10, datasetid);
        set(11, datasetname);
        set(12, year);
        set(13, traitname);
        set(14, traitcode);
        set(15, unit);
    }

    /**
     * Getter for <code>diversify3.view_plotdata.plotcode</code>.
     */
    public String getPlotcode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>diversify3.view_plotdata.plotcode</code>.
     */
    public void setPlotcode(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>diversify3.view_plotdata.siteId</code>.
     */
    public Integer getSiteid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>diversify3.view_plotdata.siteId</code>.
     */
    public void setSiteid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>diversify3.view_plotdata.sitename</code>.
     */
    public String getSitename() {
        return (String) get(2);
    }

    /**
     * Setter for <code>diversify3.view_plotdata.sitename</code>.
     */
    public void setSitename(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>diversify3.view_plotdata.id</code>.
     */
    public Integer getId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>diversify3.view_plotdata.id</code>.
     */
    public void setId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>diversify3.view_plotdata.plot_id</code>.
     */
    public Integer getPlotId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>diversify3.view_plotdata.plot_id</code>.
     */
    public void setPlotId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>diversify3.view_plotdata.trait_id</code>.
     */
    public Integer getTraitId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>diversify3.view_plotdata.trait_id</code>.
     */
    public void setTraitId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>diversify3.view_plotdata.rep</code>.
     */
    public Integer getRep() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>diversify3.view_plotdata.rep</code>.
     */
    public void setRep(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>diversify3.view_plotdata.value</code>.
     */
    public BigDecimal getValue() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>diversify3.view_plotdata.value</code>.
     */
    public void setValue(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>diversify3.view_plotdata.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>diversify3.view_plotdata.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>diversify3.view_plotdata.updated_on</code>.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>diversify3.view_plotdata.updated_on</code>.
     */
    public void setUpdatedOn(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>diversify3.view_plotdata.datasetid</code>.
     */
    public Integer getDatasetid() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>diversify3.view_plotdata.datasetid</code>.
     */
    public void setDatasetid(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>diversify3.view_plotdata.datasetname</code>.
     */
    public String getDatasetname() {
        return (String) get(11);
    }

    /**
     * Setter for <code>diversify3.view_plotdata.datasetname</code>.
     */
    public void setDatasetname(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>diversify3.view_plotdata.year</code>.
     */
    public Integer getYear() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>diversify3.view_plotdata.year</code>.
     */
    public void setYear(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>diversify3.view_plotdata.traitname</code>.
     */
    public String getTraitname() {
        return (String) get(13);
    }

    /**
     * Setter for <code>diversify3.view_plotdata.traitname</code>.
     */
    public void setTraitname(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>diversify3.view_plotdata.traitcode</code>.
     */
    public String getTraitcode() {
        return (String) get(14);
    }

    /**
     * Setter for <code>diversify3.view_plotdata.traitcode</code>.
     */
    public void setTraitcode(String value) {
        set(14, value);
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>diversify3.view_plotdata.unit</code>.
     */
    public String getUnit() {
        return (String) get(15);
    }

    /**
     * Setter for <code>diversify3.view_plotdata.unit</code>.
     */
    public void setUnit(String value) {
        set(15, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<String, Integer, String, Integer, Integer, Integer, Integer, BigDecimal, Timestamp, Timestamp, Integer, String, Integer, String, String, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<String, Integer, String, Integer, Integer, Integer, Integer, BigDecimal, Timestamp, Timestamp, Integer, String, Integer, String, String, String> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ViewPlotdata.VIEW_PLOTDATA.PLOTCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ViewPlotdata.VIEW_PLOTDATA.SITEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ViewPlotdata.VIEW_PLOTDATA.SITENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ViewPlotdata.VIEW_PLOTDATA.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ViewPlotdata.VIEW_PLOTDATA.PLOT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return ViewPlotdata.VIEW_PLOTDATA.TRAIT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return ViewPlotdata.VIEW_PLOTDATA.REP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return ViewPlotdata.VIEW_PLOTDATA.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return ViewPlotdata.VIEW_PLOTDATA.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return ViewPlotdata.VIEW_PLOTDATA.UPDATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return ViewPlotdata.VIEW_PLOTDATA.DATASETID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return ViewPlotdata.VIEW_PLOTDATA.DATASETNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return ViewPlotdata.VIEW_PLOTDATA.YEAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return ViewPlotdata.VIEW_PLOTDATA.TRAITNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return ViewPlotdata.VIEW_PLOTDATA.TRAITCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return ViewPlotdata.VIEW_PLOTDATA.UNIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getPlotcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getSiteid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSitename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getPlotId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getTraitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getRep();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getDatasetid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getDatasetname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component13() {
        return getYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getTraitname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getTraitcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getUnit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getPlotcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getSiteid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSitename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getPlotId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getTraitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getRep();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getDatasetid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getDatasetname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getTraitname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getTraitcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getUnit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value1(String value) {
        setPlotcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value2(Integer value) {
        setSiteid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value3(String value) {
        setSitename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value4(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value5(Integer value) {
        setPlotId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value6(Integer value) {
        setTraitId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value7(Integer value) {
        setRep(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value8(BigDecimal value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value9(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value10(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value11(Integer value) {
        setDatasetid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value12(String value) {
        setDatasetname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value13(Integer value) {
        setYear(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value14(String value) {
        setTraitname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value15(String value) {
        setTraitcode(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value16(String value) {
        setUnit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord values(String value1, Integer value2, String value3, Integer value4, Integer value5, Integer value6, Integer value7, BigDecimal value8, Timestamp value9, Timestamp value10, Integer value11, String value12, Integer value13, String value14, String value15, String value16) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }
}
