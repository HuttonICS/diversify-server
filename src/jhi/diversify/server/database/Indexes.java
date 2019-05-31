/*
 * This file is generated by jOOQ.
 */
package jhi.diversify.server.database;


import javax.annotation.Generated;

import jhi.diversify.server.database.tables.Crops;
import jhi.diversify.server.database.tables.Datasets;
import jhi.diversify.server.database.tables.Partners;
import jhi.diversify.server.database.tables.Plantpartners;
import jhi.diversify.server.database.tables.Plotdata;
import jhi.diversify.server.database.tables.Plots;
import jhi.diversify.server.database.tables.Sites;
import jhi.diversify.server.database.tables.Speciesdata;
import jhi.diversify.server.database.tables.Traits;
import jhi.diversify.server.database.tables.Varieties;
import jhi.diversify.server.database.tables.Varietyinplot;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>diversify3</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index CROPS_PLANTPARTNER_ID = Indexes0.CROPS_PLANTPARTNER_ID;
    public static final Index CROPS_PRIMARY = Indexes0.CROPS_PRIMARY;
    public static final Index DATASETS_PRIMARY = Indexes0.DATASETS_PRIMARY;
    public static final Index PARTNERS_PRIMARY = Indexes0.PARTNERS_PRIMARY;
    public static final Index PLANTPARTNERS_PRIMARY = Indexes0.PLANTPARTNERS_PRIMARY;
    public static final Index PLOTDATA_DATASET_ID = Indexes0.PLOTDATA_DATASET_ID;
    public static final Index PLOTDATA_PLOT_ID = Indexes0.PLOTDATA_PLOT_ID;
    public static final Index PLOTDATA_PRIMARY = Indexes0.PLOTDATA_PRIMARY;
    public static final Index PLOTDATA_TRAIT_ID = Indexes0.PLOTDATA_TRAIT_ID;
    public static final Index PLOTS_PRIMARY = Indexes0.PLOTS_PRIMARY;
    public static final Index PLOTS_SITE_ID = Indexes0.PLOTS_SITE_ID;
    public static final Index SITES_PARTNER_ID = Indexes0.SITES_PARTNER_ID;
    public static final Index SITES_PRIMARY = Indexes0.SITES_PRIMARY;
    public static final Index SPECIESDATA_DATASET_ID = Indexes0.SPECIESDATA_DATASET_ID;
    public static final Index SPECIESDATA_PRIMARY = Indexes0.SPECIESDATA_PRIMARY;
    public static final Index SPECIESDATA_TRAIT_ID = Indexes0.SPECIESDATA_TRAIT_ID;
    public static final Index SPECIESDATA_VARIETYINPLOT_ID = Indexes0.SPECIESDATA_VARIETYINPLOT_ID;
    public static final Index TRAITS_PRIMARY = Indexes0.TRAITS_PRIMARY;
    public static final Index VARIETIES_CROP_ID = Indexes0.VARIETIES_CROP_ID;
    public static final Index VARIETIES_PRIMARY = Indexes0.VARIETIES_PRIMARY;
    public static final Index VARIETYINPLOT_PLOT_ID = Indexes0.VARIETYINPLOT_PLOT_ID;
    public static final Index VARIETYINPLOT_PRIMARY = Indexes0.VARIETYINPLOT_PRIMARY;
    public static final Index VARIETYINPLOT_VARIETY_ID = Indexes0.VARIETYINPLOT_VARIETY_ID;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index CROPS_PLANTPARTNER_ID = Internal.createIndex("plantpartner_id", Crops.CROPS, new OrderField[] { Crops.CROPS.PLANTPARTNER_ID }, false);
        public static Index CROPS_PRIMARY = Internal.createIndex("PRIMARY", Crops.CROPS, new OrderField[] { Crops.CROPS.ID }, true);
        public static Index DATASETS_PRIMARY = Internal.createIndex("PRIMARY", Datasets.DATASETS, new OrderField[] { Datasets.DATASETS.ID }, true);
        public static Index PARTNERS_PRIMARY = Internal.createIndex("PRIMARY", Partners.PARTNERS, new OrderField[] { Partners.PARTNERS.ID }, true);
        public static Index PLANTPARTNERS_PRIMARY = Internal.createIndex("PRIMARY", Plantpartners.PLANTPARTNERS, new OrderField[] { Plantpartners.PLANTPARTNERS.ID }, true);
        public static Index PLOTDATA_DATASET_ID = Internal.createIndex("dataset_id", Plotdata.PLOTDATA, new OrderField[] { Plotdata.PLOTDATA.DATASET_ID }, false);
        public static Index PLOTDATA_PLOT_ID = Internal.createIndex("plot_id", Plotdata.PLOTDATA, new OrderField[] { Plotdata.PLOTDATA.PLOT_ID }, false);
        public static Index PLOTDATA_PRIMARY = Internal.createIndex("PRIMARY", Plotdata.PLOTDATA, new OrderField[] { Plotdata.PLOTDATA.ID }, true);
        public static Index PLOTDATA_TRAIT_ID = Internal.createIndex("trait_id", Plotdata.PLOTDATA, new OrderField[] { Plotdata.PLOTDATA.TRAIT_ID }, false);
        public static Index PLOTS_PRIMARY = Internal.createIndex("PRIMARY", Plots.PLOTS, new OrderField[] { Plots.PLOTS.ID }, true);
        public static Index PLOTS_SITE_ID = Internal.createIndex("site_id", Plots.PLOTS, new OrderField[] { Plots.PLOTS.SITE_ID }, false);
        public static Index SITES_PARTNER_ID = Internal.createIndex("partner_id", Sites.SITES, new OrderField[] { Sites.SITES.PARTNER_ID }, false);
        public static Index SITES_PRIMARY = Internal.createIndex("PRIMARY", Sites.SITES, new OrderField[] { Sites.SITES.ID }, true);
        public static Index SPECIESDATA_DATASET_ID = Internal.createIndex("dataset_id", Speciesdata.SPECIESDATA, new OrderField[] { Speciesdata.SPECIESDATA.DATASET_ID }, false);
        public static Index SPECIESDATA_PRIMARY = Internal.createIndex("PRIMARY", Speciesdata.SPECIESDATA, new OrderField[] { Speciesdata.SPECIESDATA.ID }, true);
        public static Index SPECIESDATA_TRAIT_ID = Internal.createIndex("trait_id", Speciesdata.SPECIESDATA, new OrderField[] { Speciesdata.SPECIESDATA.TRAIT_ID }, false);
        public static Index SPECIESDATA_VARIETYINPLOT_ID = Internal.createIndex("varietyinplot_id", Speciesdata.SPECIESDATA, new OrderField[] { Speciesdata.SPECIESDATA.VARIETYINPLOT_ID }, false);
        public static Index TRAITS_PRIMARY = Internal.createIndex("PRIMARY", Traits.TRAITS, new OrderField[] { Traits.TRAITS.ID }, true);
        public static Index VARIETIES_CROP_ID = Internal.createIndex("crop_id", Varieties.VARIETIES, new OrderField[] { Varieties.VARIETIES.CROP_ID }, false);
        public static Index VARIETIES_PRIMARY = Internal.createIndex("PRIMARY", Varieties.VARIETIES, new OrderField[] { Varieties.VARIETIES.ID }, true);
        public static Index VARIETYINPLOT_PLOT_ID = Internal.createIndex("plot_id", Varietyinplot.VARIETYINPLOT, new OrderField[] { Varietyinplot.VARIETYINPLOT.PLOT_ID }, false);
        public static Index VARIETYINPLOT_PRIMARY = Internal.createIndex("PRIMARY", Varietyinplot.VARIETYINPLOT, new OrderField[] { Varietyinplot.VARIETYINPLOT.ID }, true);
        public static Index VARIETYINPLOT_VARIETY_ID = Internal.createIndex("variety_id", Varietyinplot.VARIETYINPLOT, new OrderField[] { Varietyinplot.VARIETYINPLOT.VARIETY_ID }, false);
    }
}
