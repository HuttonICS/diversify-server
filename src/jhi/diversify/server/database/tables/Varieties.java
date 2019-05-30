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
public class Varieties extends TableImpl<VarietiesRecord> {

    /**
     * The reference instance of <code>diversify3.varieties</code>
     */
    public static final Varieties VARIETIES = new Varieties();
    private static final long serialVersionUID = -344121786;
    /**
     * The column <code>diversify3.varieties.id</code>.
     */
    public final TableField<VarietiesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");
    /**
     * The column <code>diversify3.varieties.varietyname</code>.
     */
    public final TableField<VarietiesRecord, String> VARIETYNAME = createField("varietyname", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");
    /**
     * The column <code>diversify3.varieties.crop_id</code>.
     */
    public final TableField<VarietiesRecord, Integer> CROP_ID = createField("crop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>diversify3.varieties.created_on</code>.
     */
    public final TableField<VarietiesRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");
    /**
     * The column <code>diversify3.varieties.updated_on</code>.
     */
    public final TableField<VarietiesRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>diversify3.varieties</code> table reference
     */
    public Varieties() {
        this(DSL.name("varieties"), null);
    }

    /**
     * Create an aliased <code>diversify3.varieties</code> table reference
     */
    public Varieties(String alias) {
        this(DSL.name(alias), VARIETIES);
    }

    /**
     * Create an aliased <code>diversify3.varieties</code> table reference
     */
    public Varieties(Name alias) {
        this(alias, VARIETIES);
    }

    private Varieties(Name alias, Table<VarietiesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Varieties(Name alias, Table<VarietiesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Varieties(Table<O> child, ForeignKey<O, VarietiesRecord> key) {
        super(child, key, VARIETIES);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VarietiesRecord> getRecordType() {
        return VarietiesRecord.class;
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
        return Arrays.<Index>asList(Indexes.VARIETIES_CROP_ID, Indexes.VARIETIES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<VarietiesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_VARIETIES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<VarietiesRecord> getPrimaryKey() {
        return Keys.KEY_VARIETIES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<VarietiesRecord>> getKeys() {
        return Arrays.<UniqueKey<VarietiesRecord>>asList(Keys.KEY_VARIETIES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<VarietiesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<VarietiesRecord, ?>>asList(Keys.VARIETIES_IBFK_1);
    }

    public Crops crops() {
        return new Crops(this, Keys.VARIETIES_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Varieties as(String alias) {
        return new Varieties(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Varieties as(Name alias) {
        return new Varieties(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Varieties rename(String name) {
        return new Varieties(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Varieties rename(Name name) {
        return new Varieties(name, null);
    }
}