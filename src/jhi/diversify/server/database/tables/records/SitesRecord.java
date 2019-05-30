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
public class SitesRecord extends UpdatableRecordImpl<SitesRecord> implements Record8<Integer, String, String, Integer, BigDecimal, BigDecimal, Timestamp, Timestamp> {

    private static final long serialVersionUID = 2073108835;

    /**
     * Create a detached SitesRecord
     */
    public SitesRecord() {
        super(Sites.SITES);
    }

    /**
     * Create a detached, initialised SitesRecord
     */
    public SitesRecord(Integer id, String sitename, String othername, Integer partnerId, BigDecimal latitude, BigDecimal longitude, Timestamp createdOn, Timestamp updatedOn) {
        super(Sites.SITES);

        set(0, id);
        set(1, sitename);
        set(2, othername);
        set(3, partnerId);
        set(4, latitude);
        set(5, longitude);
        set(6, createdOn);
        set(7, updatedOn);
    }

    /**
     * Getter for <code>diversify3.sites.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>diversify3.sites.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>diversify3.sites.sitename</code>.
     */
    public String getSitename() {
        return (String) get(1);
    }

    /**
     * Setter for <code>diversify3.sites.sitename</code>.
     */
    public void setSitename(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>diversify3.sites.othername</code>.
     */
    public String getOthername() {
        return (String) get(2);
    }

    /**
     * Setter for <code>diversify3.sites.othername</code>.
     */
    public void setOthername(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>diversify3.sites.partner_id</code>.
     */
    public Integer getPartnerId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>diversify3.sites.partner_id</code>.
     */
    public void setPartnerId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>diversify3.sites.latitude</code>.
     */
    public BigDecimal getLatitude() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>diversify3.sites.latitude</code>.
     */
    public void setLatitude(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>diversify3.sites.longitude</code>.
     */
    public BigDecimal getLongitude() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>diversify3.sites.longitude</code>.
     */
    public void setLongitude(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>diversify3.sites.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>diversify3.sites.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(6, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>diversify3.sites.updated_on</code>.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>diversify3.sites.updated_on</code>.
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
    public Row8<Integer, String, String, Integer, BigDecimal, BigDecimal, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, Integer, BigDecimal, BigDecimal, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Sites.SITES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Sites.SITES.SITENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Sites.SITES.OTHERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Sites.SITES.PARTNER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return Sites.SITES.LATITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return Sites.SITES.LONGITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Sites.SITES.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Sites.SITES.UPDATED_ON;
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
        return getSitename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getOthername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getPartnerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getLongitude();
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
    public String value2() {
        return getSitename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getOthername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getPartnerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getLongitude();
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
    public SitesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SitesRecord value2(String value) {
        setSitename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SitesRecord value3(String value) {
        setOthername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SitesRecord value4(Integer value) {
        setPartnerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SitesRecord value5(BigDecimal value) {
        setLatitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SitesRecord value6(BigDecimal value) {
        setLongitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SitesRecord value7(Timestamp value) {
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
    public SitesRecord value8(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SitesRecord values(Integer value1, String value2, String value3, Integer value4, BigDecimal value5, BigDecimal value6, Timestamp value7, Timestamp value8) {
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