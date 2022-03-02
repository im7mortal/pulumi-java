// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TableView {
    /**
     * A query whose result is persisted.
     * 
     */
    private final String query;
    /**
     * Specifies whether to use BigQuery's legacy SQL for this view.
     * The default value is true. If set to false, the view will use BigQuery's standard SQL.
     * 
     */
    private final @Nullable Boolean useLegacySql;

    @OutputCustomType.Constructor({"query","useLegacySql"})
    private TableView(
        String query,
        @Nullable Boolean useLegacySql) {
        this.query = Objects.requireNonNull(query);
        this.useLegacySql = useLegacySql;
    }

    /**
     * A query whose result is persisted.
     * 
    */
    public String getQuery() {
        return this.query;
    }
    /**
     * Specifies whether to use BigQuery's legacy SQL for this view.
     * The default value is true. If set to false, the view will use BigQuery's standard SQL.
     * 
    */
    public Optional<Boolean> getUseLegacySql() {
        return Optional.ofNullable(this.useLegacySql);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableView defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String query;
        private @Nullable Boolean useLegacySql;

        public Builder() {
    	      // Empty
        }

        public Builder(TableView defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.query = defaults.query;
    	      this.useLegacySql = defaults.useLegacySql;
        }

        public Builder setQuery(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }

        public Builder setUseLegacySql(@Nullable Boolean useLegacySql) {
            this.useLegacySql = useLegacySql;
            return this;
        }
        public TableView build() {
            return new TableView(query, useLegacySql);
        }
    }
}
