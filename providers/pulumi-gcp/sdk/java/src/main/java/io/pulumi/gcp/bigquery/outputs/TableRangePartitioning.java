// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.bigquery.outputs.TableRangePartitioningRange;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TableRangePartitioning {
    /**
     * The field used to determine how to create a range-based
     * partition.
     * 
     */
    private final String field;
    /**
     * Information required to partition based on ranges.
     * Structure is documented below.
     * 
     */
    private final TableRangePartitioningRange range;

    @OutputCustomType.Constructor({"field","range"})
    private TableRangePartitioning(
        String field,
        TableRangePartitioningRange range) {
        this.field = Objects.requireNonNull(field);
        this.range = Objects.requireNonNull(range);
    }

    /**
     * The field used to determine how to create a range-based
     * partition.
     * 
    */
    public String getField() {
        return this.field;
    }
    /**
     * Information required to partition based on ranges.
     * Structure is documented below.
     * 
    */
    public TableRangePartitioningRange getRange() {
        return this.range;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableRangePartitioning defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String field;
        private TableRangePartitioningRange range;

        public Builder() {
    	      // Empty
        }

        public Builder(TableRangePartitioning defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.range = defaults.range;
        }

        public Builder setField(String field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }

        public Builder setRange(TableRangePartitioningRange range) {
            this.range = Objects.requireNonNull(range);
            return this;
        }
        public TableRangePartitioning build() {
            return new TableRangePartitioning(field, range);
        }
    }
}
