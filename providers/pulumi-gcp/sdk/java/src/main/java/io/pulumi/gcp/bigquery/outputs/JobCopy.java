// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.bigquery.outputs.JobCopyDestinationEncryptionConfiguration;
import io.pulumi.gcp.bigquery.outputs.JobCopyDestinationTable;
import io.pulumi.gcp.bigquery.outputs.JobCopySourceTable;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobCopy {
    /**
     * Specifies whether the job is allowed to create new tables. The following values are supported:
     * CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table.
     * CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in the job result.
     * Creation, truncation and append actions occur as one atomic update upon job completion
     * Default value is `CREATE_IF_NEEDED`.
     * Possible values are `CREATE_IF_NEEDED` and `CREATE_NEVER`.
     * 
     */
    private final @Nullable String createDisposition;
    /**
     * Custom encryption configuration (e.g., Cloud KMS keys)
     * Structure is documented below.
     * 
     */
    private final @Nullable JobCopyDestinationEncryptionConfiguration destinationEncryptionConfiguration;
    /**
     * The destination table.
     * Structure is documented below.
     * 
     */
    private final @Nullable JobCopyDestinationTable destinationTable;
    /**
     * Source tables to copy.
     * Structure is documented below.
     * 
     */
    private final List<JobCopySourceTable> sourceTables;
    /**
     * Specifies the action that occurs if the destination table already exists. The following values are supported:
     * WRITE_TRUNCATE: If the table already exists, BigQuery overwrites the table data and uses the schema from the query result.
     * WRITE_APPEND: If the table already exists, BigQuery appends the data to the table.
     * WRITE_EMPTY: If the table already exists and contains data, a 'duplicate' error is returned in the job result.
     * Each action is atomic and only occurs if BigQuery is able to complete the job successfully.
     * Creation, truncation and append actions occur as one atomic update upon job completion.
     * Default value is `WRITE_EMPTY`.
     * Possible values are `WRITE_TRUNCATE`, `WRITE_APPEND`, and `WRITE_EMPTY`.
     * 
     */
    private final @Nullable String writeDisposition;

    @OutputCustomType.Constructor({"createDisposition","destinationEncryptionConfiguration","destinationTable","sourceTables","writeDisposition"})
    private JobCopy(
        @Nullable String createDisposition,
        @Nullable JobCopyDestinationEncryptionConfiguration destinationEncryptionConfiguration,
        @Nullable JobCopyDestinationTable destinationTable,
        List<JobCopySourceTable> sourceTables,
        @Nullable String writeDisposition) {
        this.createDisposition = createDisposition;
        this.destinationEncryptionConfiguration = destinationEncryptionConfiguration;
        this.destinationTable = destinationTable;
        this.sourceTables = Objects.requireNonNull(sourceTables);
        this.writeDisposition = writeDisposition;
    }

    /**
     * Specifies whether the job is allowed to create new tables. The following values are supported:
     * CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table.
     * CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in the job result.
     * Creation, truncation and append actions occur as one atomic update upon job completion
     * Default value is `CREATE_IF_NEEDED`.
     * Possible values are `CREATE_IF_NEEDED` and `CREATE_NEVER`.
     * 
    */
    public Optional<String> getCreateDisposition() {
        return Optional.ofNullable(this.createDisposition);
    }
    /**
     * Custom encryption configuration (e.g., Cloud KMS keys)
     * Structure is documented below.
     * 
    */
    public Optional<JobCopyDestinationEncryptionConfiguration> getDestinationEncryptionConfiguration() {
        return Optional.ofNullable(this.destinationEncryptionConfiguration);
    }
    /**
     * The destination table.
     * Structure is documented below.
     * 
    */
    public Optional<JobCopyDestinationTable> getDestinationTable() {
        return Optional.ofNullable(this.destinationTable);
    }
    /**
     * Source tables to copy.
     * Structure is documented below.
     * 
    */
    public List<JobCopySourceTable> getSourceTables() {
        return this.sourceTables;
    }
    /**
     * Specifies the action that occurs if the destination table already exists. The following values are supported:
     * WRITE_TRUNCATE: If the table already exists, BigQuery overwrites the table data and uses the schema from the query result.
     * WRITE_APPEND: If the table already exists, BigQuery appends the data to the table.
     * WRITE_EMPTY: If the table already exists and contains data, a 'duplicate' error is returned in the job result.
     * Each action is atomic and only occurs if BigQuery is able to complete the job successfully.
     * Creation, truncation and append actions occur as one atomic update upon job completion.
     * Default value is `WRITE_EMPTY`.
     * Possible values are `WRITE_TRUNCATE`, `WRITE_APPEND`, and `WRITE_EMPTY`.
     * 
    */
    public Optional<String> getWriteDisposition() {
        return Optional.ofNullable(this.writeDisposition);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobCopy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String createDisposition;
        private @Nullable JobCopyDestinationEncryptionConfiguration destinationEncryptionConfiguration;
        private @Nullable JobCopyDestinationTable destinationTable;
        private List<JobCopySourceTable> sourceTables;
        private @Nullable String writeDisposition;

        public Builder() {
    	      // Empty
        }

        public Builder(JobCopy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createDisposition = defaults.createDisposition;
    	      this.destinationEncryptionConfiguration = defaults.destinationEncryptionConfiguration;
    	      this.destinationTable = defaults.destinationTable;
    	      this.sourceTables = defaults.sourceTables;
    	      this.writeDisposition = defaults.writeDisposition;
        }

        public Builder setCreateDisposition(@Nullable String createDisposition) {
            this.createDisposition = createDisposition;
            return this;
        }

        public Builder setDestinationEncryptionConfiguration(@Nullable JobCopyDestinationEncryptionConfiguration destinationEncryptionConfiguration) {
            this.destinationEncryptionConfiguration = destinationEncryptionConfiguration;
            return this;
        }

        public Builder setDestinationTable(@Nullable JobCopyDestinationTable destinationTable) {
            this.destinationTable = destinationTable;
            return this;
        }

        public Builder setSourceTables(List<JobCopySourceTable> sourceTables) {
            this.sourceTables = Objects.requireNonNull(sourceTables);
            return this;
        }

        public Builder setWriteDisposition(@Nullable String writeDisposition) {
            this.writeDisposition = writeDisposition;
            return this;
        }
        public JobCopy build() {
            return new JobCopy(createDisposition, destinationEncryptionConfiguration, destinationTable, sourceTables, writeDisposition);
        }
    }
}
