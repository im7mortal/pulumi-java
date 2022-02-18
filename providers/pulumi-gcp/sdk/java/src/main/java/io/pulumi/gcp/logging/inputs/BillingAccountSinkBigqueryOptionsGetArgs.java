// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class BillingAccountSinkBigqueryOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BillingAccountSinkBigqueryOptionsGetArgs Empty = new BillingAccountSinkBigqueryOptionsGetArgs();

    /**
     * Whether to use [BigQuery's partition tables](https://cloud.google.com/bigquery/docs/partitioned-tables).
     * By default, Logging creates dated tables based on the log entries' timestamps, e.g. syslog_20170523. With partitioned
     * tables the date suffix is no longer present and [special query syntax](https://cloud.google.com/bigquery/docs/querying-partitioned-tables)
     * has to be used instead. In both cases, tables are sharded based on UTC timezone.
     * 
     */
    @InputImport(name="usePartitionedTables", required=true)
    private final Input<Boolean> usePartitionedTables;

    public Input<Boolean> getUsePartitionedTables() {
        return this.usePartitionedTables;
    }

    public BillingAccountSinkBigqueryOptionsGetArgs(Input<Boolean> usePartitionedTables) {
        this.usePartitionedTables = Objects.requireNonNull(usePartitionedTables, "expected parameter 'usePartitionedTables' to be non-null");
    }

    private BillingAccountSinkBigqueryOptionsGetArgs() {
        this.usePartitionedTables = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BillingAccountSinkBigqueryOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> usePartitionedTables;

        public Builder() {
    	      // Empty
        }

        public Builder(BillingAccountSinkBigqueryOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.usePartitionedTables = defaults.usePartitionedTables;
        }

        public Builder setUsePartitionedTables(Input<Boolean> usePartitionedTables) {
            this.usePartitionedTables = Objects.requireNonNull(usePartitionedTables);
            return this;
        }

        public Builder setUsePartitionedTables(Boolean usePartitionedTables) {
            this.usePartitionedTables = Input.of(Objects.requireNonNull(usePartitionedTables));
            return this;
        }

        public BillingAccountSinkBigqueryOptionsGetArgs build() {
            return new BillingAccountSinkBigqueryOptionsGetArgs(usePartitionedTables);
        }
    }
}