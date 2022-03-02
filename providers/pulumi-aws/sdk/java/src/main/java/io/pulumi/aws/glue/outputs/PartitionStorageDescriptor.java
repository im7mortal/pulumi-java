// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.aws.glue.outputs.PartitionStorageDescriptorColumn;
import io.pulumi.aws.glue.outputs.PartitionStorageDescriptorSerDeInfo;
import io.pulumi.aws.glue.outputs.PartitionStorageDescriptorSkewedInfo;
import io.pulumi.aws.glue.outputs.PartitionStorageDescriptorSortColumn;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PartitionStorageDescriptor {
    /**
     * A list of reducer grouping columns, clustering columns, and bucketing columns in the table.
     * 
     */
    private final @Nullable List<String> bucketColumns;
    /**
     * A list of the Columns in the table.
     * 
     */
    private final @Nullable List<PartitionStorageDescriptorColumn> columns;
    /**
     * True if the data in the table is compressed, or False if not.
     * 
     */
    private final @Nullable Boolean compressed;
    /**
     * The input format: SequenceFileInputFormat (binary), or TextInputFormat, or a custom format.
     * 
     */
    private final @Nullable String inputFormat;
    /**
     * The physical location of the table. By default this takes the form of the warehouse location, followed by the database location in the warehouse, followed by the table name.
     * 
     */
    private final @Nullable String location;
    /**
     * Must be specified if the table contains any dimension columns.
     * 
     */
    private final @Nullable Integer numberOfBuckets;
    /**
     * The output format: SequenceFileOutputFormat (binary), or IgnoreKeyTextOutputFormat, or a custom format.
     * 
     */
    private final @Nullable String outputFormat;
    /**
     * A map of initialization parameters for the SerDe, in key-value form.
     * 
     */
    private final @Nullable Map<String,String> parameters;
    /**
     * Serialization/deserialization (SerDe) information.
     * 
     */
    private final @Nullable PartitionStorageDescriptorSerDeInfo serDeInfo;
    /**
     * Information about values that appear very frequently in a column (skewed values).
     * 
     */
    private final @Nullable PartitionStorageDescriptorSkewedInfo skewedInfo;
    /**
     * A list of Order objects specifying the sort order of each bucket in the table.
     * 
     */
    private final @Nullable List<PartitionStorageDescriptorSortColumn> sortColumns;
    /**
     * True if the table data is stored in subdirectories, or False if not.
     * 
     */
    private final @Nullable Boolean storedAsSubDirectories;

    @OutputCustomType.Constructor({"bucketColumns","columns","compressed","inputFormat","location","numberOfBuckets","outputFormat","parameters","serDeInfo","skewedInfo","sortColumns","storedAsSubDirectories"})
    private PartitionStorageDescriptor(
        @Nullable List<String> bucketColumns,
        @Nullable List<PartitionStorageDescriptorColumn> columns,
        @Nullable Boolean compressed,
        @Nullable String inputFormat,
        @Nullable String location,
        @Nullable Integer numberOfBuckets,
        @Nullable String outputFormat,
        @Nullable Map<String,String> parameters,
        @Nullable PartitionStorageDescriptorSerDeInfo serDeInfo,
        @Nullable PartitionStorageDescriptorSkewedInfo skewedInfo,
        @Nullable List<PartitionStorageDescriptorSortColumn> sortColumns,
        @Nullable Boolean storedAsSubDirectories) {
        this.bucketColumns = bucketColumns;
        this.columns = columns;
        this.compressed = compressed;
        this.inputFormat = inputFormat;
        this.location = location;
        this.numberOfBuckets = numberOfBuckets;
        this.outputFormat = outputFormat;
        this.parameters = parameters;
        this.serDeInfo = serDeInfo;
        this.skewedInfo = skewedInfo;
        this.sortColumns = sortColumns;
        this.storedAsSubDirectories = storedAsSubDirectories;
    }

    /**
     * A list of reducer grouping columns, clustering columns, and bucketing columns in the table.
     * 
    */
    public List<String> getBucketColumns() {
        return this.bucketColumns == null ? List.of() : this.bucketColumns;
    }
    /**
     * A list of the Columns in the table.
     * 
    */
    public List<PartitionStorageDescriptorColumn> getColumns() {
        return this.columns == null ? List.of() : this.columns;
    }
    /**
     * True if the data in the table is compressed, or False if not.
     * 
    */
    public Optional<Boolean> getCompressed() {
        return Optional.ofNullable(this.compressed);
    }
    /**
     * The input format: SequenceFileInputFormat (binary), or TextInputFormat, or a custom format.
     * 
    */
    public Optional<String> getInputFormat() {
        return Optional.ofNullable(this.inputFormat);
    }
    /**
     * The physical location of the table. By default this takes the form of the warehouse location, followed by the database location in the warehouse, followed by the table name.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Must be specified if the table contains any dimension columns.
     * 
    */
    public Optional<Integer> getNumberOfBuckets() {
        return Optional.ofNullable(this.numberOfBuckets);
    }
    /**
     * The output format: SequenceFileOutputFormat (binary), or IgnoreKeyTextOutputFormat, or a custom format.
     * 
    */
    public Optional<String> getOutputFormat() {
        return Optional.ofNullable(this.outputFormat);
    }
    /**
     * A map of initialization parameters for the SerDe, in key-value form.
     * 
    */
    public Map<String,String> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Serialization/deserialization (SerDe) information.
     * 
    */
    public Optional<PartitionStorageDescriptorSerDeInfo> getSerDeInfo() {
        return Optional.ofNullable(this.serDeInfo);
    }
    /**
     * Information about values that appear very frequently in a column (skewed values).
     * 
    */
    public Optional<PartitionStorageDescriptorSkewedInfo> getSkewedInfo() {
        return Optional.ofNullable(this.skewedInfo);
    }
    /**
     * A list of Order objects specifying the sort order of each bucket in the table.
     * 
    */
    public List<PartitionStorageDescriptorSortColumn> getSortColumns() {
        return this.sortColumns == null ? List.of() : this.sortColumns;
    }
    /**
     * True if the table data is stored in subdirectories, or False if not.
     * 
    */
    public Optional<Boolean> getStoredAsSubDirectories() {
        return Optional.ofNullable(this.storedAsSubDirectories);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PartitionStorageDescriptor defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> bucketColumns;
        private @Nullable List<PartitionStorageDescriptorColumn> columns;
        private @Nullable Boolean compressed;
        private @Nullable String inputFormat;
        private @Nullable String location;
        private @Nullable Integer numberOfBuckets;
        private @Nullable String outputFormat;
        private @Nullable Map<String,String> parameters;
        private @Nullable PartitionStorageDescriptorSerDeInfo serDeInfo;
        private @Nullable PartitionStorageDescriptorSkewedInfo skewedInfo;
        private @Nullable List<PartitionStorageDescriptorSortColumn> sortColumns;
        private @Nullable Boolean storedAsSubDirectories;

        public Builder() {
    	      // Empty
        }

        public Builder(PartitionStorageDescriptor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketColumns = defaults.bucketColumns;
    	      this.columns = defaults.columns;
    	      this.compressed = defaults.compressed;
    	      this.inputFormat = defaults.inputFormat;
    	      this.location = defaults.location;
    	      this.numberOfBuckets = defaults.numberOfBuckets;
    	      this.outputFormat = defaults.outputFormat;
    	      this.parameters = defaults.parameters;
    	      this.serDeInfo = defaults.serDeInfo;
    	      this.skewedInfo = defaults.skewedInfo;
    	      this.sortColumns = defaults.sortColumns;
    	      this.storedAsSubDirectories = defaults.storedAsSubDirectories;
        }

        public Builder setBucketColumns(@Nullable List<String> bucketColumns) {
            this.bucketColumns = bucketColumns;
            return this;
        }

        public Builder setColumns(@Nullable List<PartitionStorageDescriptorColumn> columns) {
            this.columns = columns;
            return this;
        }

        public Builder setCompressed(@Nullable Boolean compressed) {
            this.compressed = compressed;
            return this;
        }

        public Builder setInputFormat(@Nullable String inputFormat) {
            this.inputFormat = inputFormat;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setNumberOfBuckets(@Nullable Integer numberOfBuckets) {
            this.numberOfBuckets = numberOfBuckets;
            return this;
        }

        public Builder setOutputFormat(@Nullable String outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,String> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setSerDeInfo(@Nullable PartitionStorageDescriptorSerDeInfo serDeInfo) {
            this.serDeInfo = serDeInfo;
            return this;
        }

        public Builder setSkewedInfo(@Nullable PartitionStorageDescriptorSkewedInfo skewedInfo) {
            this.skewedInfo = skewedInfo;
            return this;
        }

        public Builder setSortColumns(@Nullable List<PartitionStorageDescriptorSortColumn> sortColumns) {
            this.sortColumns = sortColumns;
            return this;
        }

        public Builder setStoredAsSubDirectories(@Nullable Boolean storedAsSubDirectories) {
            this.storedAsSubDirectories = storedAsSubDirectories;
            return this;
        }
        public PartitionStorageDescriptor build() {
            return new PartitionStorageDescriptor(bucketColumns, columns, compressed, inputFormat, location, numberOfBuckets, outputFormat, parameters, serDeInfo, skewedInfo, sortColumns, storedAsSubDirectories);
        }
    }
}
