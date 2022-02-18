// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobLoadTimePartitioningArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobLoadTimePartitioningArgs Empty = new JobLoadTimePartitioningArgs();

    /**
     * Number of milliseconds for which to keep the storage for a partition. A wrapper is used here because 0 is an invalid value.
     * 
     */
    @InputImport(name="expirationMs")
    private final @Nullable Input<String> expirationMs;

    public Input<String> getExpirationMs() {
        return this.expirationMs == null ? Input.empty() : this.expirationMs;
    }

    /**
     * If not set, the table is partitioned by pseudo column '_PARTITIONTIME'; if set, the table is partitioned by this field.
     * The field must be a top-level TIMESTAMP or DATE field. Its mode must be NULLABLE or REQUIRED.
     * A wrapper is used here because an empty string is an invalid value.
     * 
     */
    @InputImport(name="field")
    private final @Nullable Input<String> field;

    public Input<String> getField() {
        return this.field == null ? Input.empty() : this.field;
    }

    /**
     * The only type supported is DAY, which will generate one partition per day. Providing an empty string used to cause an error,
     * but in OnePlatform the field will be treated as unset.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public JobLoadTimePartitioningArgs(
        @Nullable Input<String> expirationMs,
        @Nullable Input<String> field,
        Input<String> type) {
        this.expirationMs = expirationMs;
        this.field = field;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private JobLoadTimePartitioningArgs() {
        this.expirationMs = Input.empty();
        this.field = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobLoadTimePartitioningArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> expirationMs;
        private @Nullable Input<String> field;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(JobLoadTimePartitioningArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationMs = defaults.expirationMs;
    	      this.field = defaults.field;
    	      this.type = defaults.type;
        }

        public Builder setExpirationMs(@Nullable Input<String> expirationMs) {
            this.expirationMs = expirationMs;
            return this;
        }

        public Builder setExpirationMs(@Nullable String expirationMs) {
            this.expirationMs = Input.ofNullable(expirationMs);
            return this;
        }

        public Builder setField(@Nullable Input<String> field) {
            this.field = field;
            return this;
        }

        public Builder setField(@Nullable String field) {
            this.field = Input.ofNullable(field);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public JobLoadTimePartitioningArgs build() {
            return new JobLoadTimePartitioningArgs(expirationMs, field, type);
        }
    }
}