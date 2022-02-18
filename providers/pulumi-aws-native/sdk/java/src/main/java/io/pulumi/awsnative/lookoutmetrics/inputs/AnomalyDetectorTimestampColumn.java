// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AnomalyDetectorTimestampColumn extends io.pulumi.resources.InvokeArgs {

    public static final AnomalyDetectorTimestampColumn Empty = new AnomalyDetectorTimestampColumn();

    /**
     * A timestamp format for the timestamps in the dataset
     * 
     */
    @InputImport(name="columnFormat")
    private final @Nullable String columnFormat;

    public Optional<String> getColumnFormat() {
        return this.columnFormat == null ? Optional.empty() : Optional.ofNullable(this.columnFormat);
    }

    @InputImport(name="columnName")
    private final @Nullable String columnName;

    public Optional<String> getColumnName() {
        return this.columnName == null ? Optional.empty() : Optional.ofNullable(this.columnName);
    }

    public AnomalyDetectorTimestampColumn(
        @Nullable String columnFormat,
        @Nullable String columnName) {
        this.columnFormat = columnFormat;
        this.columnName = columnName;
    }

    private AnomalyDetectorTimestampColumn() {
        this.columnFormat = null;
        this.columnName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorTimestampColumn defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String columnFormat;
        private @Nullable String columnName;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorTimestampColumn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnFormat = defaults.columnFormat;
    	      this.columnName = defaults.columnName;
        }

        public Builder setColumnFormat(@Nullable String columnFormat) {
            this.columnFormat = columnFormat;
            return this;
        }

        public Builder setColumnName(@Nullable String columnName) {
            this.columnName = columnName;
            return this;
        }

        public AnomalyDetectorTimestampColumn build() {
            return new AnomalyDetectorTimestampColumn(columnFormat, columnName);
        }
    }
}
