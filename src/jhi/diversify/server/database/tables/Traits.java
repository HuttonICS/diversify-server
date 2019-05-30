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
public class Traits extends TableImpl<TraitsRecord> {

    /**
     * The reference instance of <code>diversify3.traits</code>
     */
    public static final Traits TRAITS = new Traits();
    private static final long serialVersionUID = -2078115347;
    /**
     * The column <code>diversify3.traits.id</code>.
     */
    public final TableField<TraitsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");
    /**
     * The column <code>diversify3.traits.traitname</code>.
     */
    public final TableField<TraitsRecord, String> TRAITNAME = createField("traitname", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");
    /**
     * The column <code>diversify3.traits.traitcode</code>.
     */
    public final TableField<TraitsRecord, String> TRAITCODE = createField("traitcode", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");
    /**
     * The column <code>diversify3.traits.unit</code>.
     */
    public final TableField<TraitsRecord, String> UNIT = createField("unit", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");
    /**
     * The column <code>diversify3.traits.created_on</code>.
     */
    public final TableField<TraitsRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");
    /**
     * The column <code>diversify3.traits.updated_on</code>.
     */
    public final TableField<TraitsRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>diversify3.traits</code> table reference
     */
    public Traits() {
        this(DSL.name("traits"), null);
    }

    /**
     * Create an aliased <code>diversify3.traits</code> table reference
     */
    public Traits(String alias) {
        this(DSL.name(alias), TRAITS);
    }

    /**
     * Create an aliased <code>diversify3.traits</code> table reference
     */
    public Traits(Name alias) {
        this(alias, TRAITS);
    }

    private Traits(Name alias, Table<TraitsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Traits(Name alias, Table<TraitsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Traits(Table<O> child, ForeignKey<O, TraitsRecord> key) {
        super(child, key, TRAITS);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TraitsRecord> getRecordType() {
        return TraitsRecord.class;
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
        return Arrays.<Index>asList(Indexes.TRAITS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TraitsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TRAITS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TraitsRecord> getPrimaryKey() {
        return Keys.KEY_TRAITS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TraitsRecord>> getKeys() {
        return Arrays.<UniqueKey<TraitsRecord>>asList(Keys.KEY_TRAITS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Traits as(String alias) {
        return new Traits(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Traits as(Name alias) {
        return new Traits(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Traits rename(String name) {
        return new Traits(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Traits rename(Name name) {
        return new Traits(name, null);
    }
}
