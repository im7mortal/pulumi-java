// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Csv options
 * 
 */
public final class DatasetCsvOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetCsvOptionsArgs Empty = new DatasetCsvOptionsArgs();

    @InputImport(name="delimiter")
    private final @Nullable Input<String> delimiter;

    public Input<String> getDelimiter() {
        return this.delimiter == null ? Input.empty() : this.delimiter;
    }

    @InputImport(name="headerRow")
    private final @Nullable Input<Boolean> headerRow;

    public Input<Boolean> getHeaderRow() {
        return this.headerRow == null ? Input.empty() : this.headerRow;
    }

    public DatasetCsvOptionsArgs(
        @Nullable Input<String> delimiter,
        @Nullable Input<Boolean> headerRow) {
        this.delimiter = delimiter;
        this.headerRow = headerRow;
    }

    private DatasetCsvOptionsArgs() {
        this.delimiter = Input.empty();
        this.headerRow = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetCsvOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> delimiter;
        private @Nullable Input<Boolean> headerRow;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetCsvOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delimiter = defaults.delimiter;
    	      this.headerRow = defaults.headerRow;
        }

        public Builder setDelimiter(@Nullable Input<String> delimiter) {
            this.delimiter = delimiter;
            return this;
        }

        public Builder setDelimiter(@Nullable String delimiter) {
            this.delimiter = Input.ofNullable(delimiter);
            return this;
        }

        public Builder setHeaderRow(@Nullable Input<Boolean> headerRow) {
            this.headerRow = headerRow;
            return this;
        }

        public Builder setHeaderRow(@Nullable Boolean headerRow) {
            this.headerRow = Input.ofNullable(headerRow);
            return this;
        }

        public DatasetCsvOptionsArgs build() {
            return new DatasetCsvOptionsArgs(delimiter, headerRow);
        }
    }
}