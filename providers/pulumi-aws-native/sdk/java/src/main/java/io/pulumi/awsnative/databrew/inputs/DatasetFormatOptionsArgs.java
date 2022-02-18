// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.DatasetCsvOptionsArgs;
import io.pulumi.awsnative.databrew.inputs.DatasetExcelOptionsArgs;
import io.pulumi.awsnative.databrew.inputs.DatasetJsonOptionsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Format options for dataset
 * 
 */
public final class DatasetFormatOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetFormatOptionsArgs Empty = new DatasetFormatOptionsArgs();

    @InputImport(name="csv")
    private final @Nullable Input<DatasetCsvOptionsArgs> csv;

    public Input<DatasetCsvOptionsArgs> getCsv() {
        return this.csv == null ? Input.empty() : this.csv;
    }

    @InputImport(name="excel")
    private final @Nullable Input<DatasetExcelOptionsArgs> excel;

    public Input<DatasetExcelOptionsArgs> getExcel() {
        return this.excel == null ? Input.empty() : this.excel;
    }

    @InputImport(name="json")
    private final @Nullable Input<DatasetJsonOptionsArgs> json;

    public Input<DatasetJsonOptionsArgs> getJson() {
        return this.json == null ? Input.empty() : this.json;
    }

    public DatasetFormatOptionsArgs(
        @Nullable Input<DatasetCsvOptionsArgs> csv,
        @Nullable Input<DatasetExcelOptionsArgs> excel,
        @Nullable Input<DatasetJsonOptionsArgs> json) {
        this.csv = csv;
        this.excel = excel;
        this.json = json;
    }

    private DatasetFormatOptionsArgs() {
        this.csv = Input.empty();
        this.excel = Input.empty();
        this.json = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetFormatOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DatasetCsvOptionsArgs> csv;
        private @Nullable Input<DatasetExcelOptionsArgs> excel;
        private @Nullable Input<DatasetJsonOptionsArgs> json;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetFormatOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.csv = defaults.csv;
    	      this.excel = defaults.excel;
    	      this.json = defaults.json;
        }

        public Builder setCsv(@Nullable Input<DatasetCsvOptionsArgs> csv) {
            this.csv = csv;
            return this;
        }

        public Builder setCsv(@Nullable DatasetCsvOptionsArgs csv) {
            this.csv = Input.ofNullable(csv);
            return this;
        }

        public Builder setExcel(@Nullable Input<DatasetExcelOptionsArgs> excel) {
            this.excel = excel;
            return this;
        }

        public Builder setExcel(@Nullable DatasetExcelOptionsArgs excel) {
            this.excel = Input.ofNullable(excel);
            return this;
        }

        public Builder setJson(@Nullable Input<DatasetJsonOptionsArgs> json) {
            this.json = json;
            return this;
        }

        public Builder setJson(@Nullable DatasetJsonOptionsArgs json) {
            this.json = Input.ofNullable(json);
            return this;
        }

        public DatasetFormatOptionsArgs build() {
            return new DatasetFormatOptionsArgs(csv, excel, json);
        }
    }
}
