/*
 * This file is generated by jOOQ.
 */
package jhi.diversify.server.database.tables;


import org.jooq.*;
import org.jooq.impl.*;

import java.sql.*;
import java.util.*;

import javax.annotation.*;

import jhi.diversify.server.database.*;
import jhi.diversify.server.database.tables.records.*;


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
public class Crops extends TableImpl<CropsRecord> {

    /**
     * The reference instance of <code>diversify3.crops</code>
     */
    public static final Crops CROPS = new Crops();
    private static final long serialVersionUID = 1637249301;
    /**
     * The column <code>diversify3.crops.id</code>.
     */
    public final TableField<CropsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");
    /**
     * The column <code>diversify3.crops.cropcommonname</code>.
     */
    public final TableField<CropsRecord, String> CROPCOMMONNAME = createField("cropcommonname", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");
    /**
     * The column <code>diversify3.crops.croplatinname</code>.
     */
    public final TableField<CropsRecord, String> CROPLATINNAME = createField("croplatinname", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");
    /**
     * The column <code>diversify3.crops.plantpartner_id</code>.
     */
    public final TableField<CropsRecord, Integer> PLANTPARTNER_ID = createField("plantpartner_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>diversify3.crops.created_on</code>.
     */
    public final TableField<CropsRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");
    /**
     * The column <code>diversify3.crops.updated_on</code>.
     */
    public final TableField<CropsRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>diversify3.crops</code> table reference
     */
    public Crops() {
        this(DSL.name("crops"), null);
    }

    /**
     * Create an aliased <code>diversify3.crops</code> table reference
     */
    public Crops(String alias) {
        this(DSL.name(alias), CROPS);
    }

    /**
     * Create an aliased <code>diversify3.crops</code> table reference
     */
    public Crops(Name alias) {
        this(alias, CROPS);
    }

    private Crops(Name alias, Table<CropsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Crops(Name alias, Table<CropsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Crops(Table<O> child, ForeignKey<O, CropsRecord> key) {
        super(child, key, CROPS);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CropsRecord> getRecordType() {
        return CropsRecord.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Diversify3.DIVERSIFY3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CROPS_PLANTPARTNER_ID, Indexes.CROPS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CropsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CROPS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CropsRecord> getPrimaryKey() {
        return Keys.KEY_CROPS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CropsRecord>> getKeys() {
        return Arrays.<UniqueKey<CropsRecord>>asList(Keys.KEY_CROPS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CropsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CropsRecord, ?>>asList(Keys.CROPS_IBFK_1);
    }

    public Plantpartners plantpartners() {
        return new Plantpartners(this, Keys.CROPS_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Crops as(String alias) {
        return new Crops(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Crops as(Name alias) {
        return new Crops(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Crops rename(String name) {
        return new Crops(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Crops rename(Name name) {
        return new Crops(name, null);
    }
}