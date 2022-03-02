// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTable;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PreventionJobTriggerInspectJobActionSaveFindingsOutputConfig {
    /**
     * Schema used for writing the findings for Inspect jobs. This field is only used for
     * Inspect and must be unspecified for Risk jobs. Columns are derived from the Finding
     * object. If appending to an existing table, any columns from the predefined schema
     * that are missing will be added. No columns in the existing table will be deleted.
     * If unspecified, then all available columns will be used for a new table or an (existing)
     * table with no schema, and no changes will be made to an existing table that has a schema.
     * Only for use with external storage.
     * Possible values are `BASIC_COLUMNS`, `GCS_COLUMNS`, `DATASTORE_COLUMNS`, `BIG_QUERY_COLUMNS`, and `ALL_COLUMNS`.
     * 
     */
    private final @Nullable String outputSchema;
    /**
     * Information on the location of the target BigQuery Table.
     * Structure is documented below.
     * 
     */
    private final PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTable table;

    @OutputCustomType.Constructor({"outputSchema","table"})
    private PreventionJobTriggerInspectJobActionSaveFindingsOutputConfig(
        @Nullable String outputSchema,
        PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTable table) {
        this.outputSchema = outputSchema;
        this.table = Objects.requireNonNull(table);
    }

    /**
     * Schema used for writing the findings for Inspect jobs. This field is only used for
     * Inspect and must be unspecified for Risk jobs. Columns are derived from the Finding
     * object. If appending to an existing table, any columns from the predefined schema
     * that are missing will be added. No columns in the existing table will be deleted.
     * If unspecified, then all available columns will be used for a new table or an (existing)
     * table with no schema, and no changes will be made to an existing table that has a schema.
     * Only for use with external storage.
     * Possible values are `BASIC_COLUMNS`, `GCS_COLUMNS`, `DATASTORE_COLUMNS`, `BIG_QUERY_COLUMNS`, and `ALL_COLUMNS`.
     * 
    */
    public Optional<String> getOutputSchema() {
        return Optional.ofNullable(this.outputSchema);
    }
    /**
     * Information on the location of the target BigQuery Table.
     * Structure is documented below.
     * 
    */
    public PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTable getTable() {
        return this.table;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobActionSaveFindingsOutputConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String outputSchema;
        private PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTable table;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobActionSaveFindingsOutputConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.outputSchema = defaults.outputSchema;
    	      this.table = defaults.table;
        }

        public Builder setOutputSchema(@Nullable String outputSchema) {
            this.outputSchema = outputSchema;
            return this;
        }

        public Builder setTable(PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTable table) {
            this.table = Objects.requireNonNull(table);
            return this;
        }
        public PreventionJobTriggerInspectJobActionSaveFindingsOutputConfig build() {
            return new PreventionJobTriggerInspectJobActionSaveFindingsOutputConfig(outputSchema, table);
        }
    }
}
