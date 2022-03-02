// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dms.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EndpointS3Settings {
    /**
     * S3 Bucket Object prefix.
     * 
     */
    private final @Nullable String bucketFolder;
    /**
     * S3 Bucket name.
     * 
     */
    private final @Nullable String bucketName;
    /**
     * Set to compress target files. Defaults to `NONE`. Valid values are `GZIP` and `NONE`.
     * 
     */
    private final @Nullable String compressionType;
    /**
     * Delimiter used to separate columns in the source files. Defaults to `,`.
     * 
     */
    private final @Nullable String csvDelimiter;
    /**
     * Delimiter used to separate rows in the source files. Defaults to `\n`.
     * 
     */
    private final @Nullable String csvRowDelimiter;
    /**
     * The output format for the files that AWS DMS uses to create S3 objects. Defaults to `csv`. Valid values are `csv` and `parquet`.
     * 
     */
    private final @Nullable String dataFormat;
    /**
     * Partition S3 bucket folders based on transaction commit dates. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean datePartitionEnabled;
    /**
     * The server-side encryption mode that you want to encrypt your .csv or .parquet object files copied to S3. Defaults to `SSE_S3`. Valid values are `SSE_S3` and `SSE_KMS`.
     * 
     */
    private final @Nullable String encryptionMode;
    /**
     * JSON document that describes how AWS DMS should interpret the data.
     * 
     */
    private final @Nullable String externalTableDefinition;
    /**
     * - Specifies the precision of any TIMESTAMP column values written to an S3 object file in .parquet format. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean parquetTimestampInMillisecond;
    /**
     * The version of the .parquet file format. Defaults to `parquet-1-0`. Valid values are `parquet-1-0` and `parquet-2-0`.
     * 
     */
    private final @Nullable String parquetVersion;
    /**
     * If you set encryptionMode to `SSE_KMS`, set this parameter to the Amazon Resource Name (ARN) for the AWS KMS key.
     * 
     */
    private final @Nullable String serverSideEncryptionKmsKeyId;
    /**
     * Amazon Resource Name (ARN) of the IAM Role with permissions to read from or write to the S3 Bucket.
     * 
     */
    private final @Nullable String serviceAccessRoleArn;

    @OutputCustomType.Constructor({"bucketFolder","bucketName","compressionType","csvDelimiter","csvRowDelimiter","dataFormat","datePartitionEnabled","encryptionMode","externalTableDefinition","parquetTimestampInMillisecond","parquetVersion","serverSideEncryptionKmsKeyId","serviceAccessRoleArn"})
    private EndpointS3Settings(
        @Nullable String bucketFolder,
        @Nullable String bucketName,
        @Nullable String compressionType,
        @Nullable String csvDelimiter,
        @Nullable String csvRowDelimiter,
        @Nullable String dataFormat,
        @Nullable Boolean datePartitionEnabled,
        @Nullable String encryptionMode,
        @Nullable String externalTableDefinition,
        @Nullable Boolean parquetTimestampInMillisecond,
        @Nullable String parquetVersion,
        @Nullable String serverSideEncryptionKmsKeyId,
        @Nullable String serviceAccessRoleArn) {
        this.bucketFolder = bucketFolder;
        this.bucketName = bucketName;
        this.compressionType = compressionType;
        this.csvDelimiter = csvDelimiter;
        this.csvRowDelimiter = csvRowDelimiter;
        this.dataFormat = dataFormat;
        this.datePartitionEnabled = datePartitionEnabled;
        this.encryptionMode = encryptionMode;
        this.externalTableDefinition = externalTableDefinition;
        this.parquetTimestampInMillisecond = parquetTimestampInMillisecond;
        this.parquetVersion = parquetVersion;
        this.serverSideEncryptionKmsKeyId = serverSideEncryptionKmsKeyId;
        this.serviceAccessRoleArn = serviceAccessRoleArn;
    }

    /**
     * S3 Bucket Object prefix.
     * 
    */
    public Optional<String> getBucketFolder() {
        return Optional.ofNullable(this.bucketFolder);
    }
    /**
     * S3 Bucket name.
     * 
    */
    public Optional<String> getBucketName() {
        return Optional.ofNullable(this.bucketName);
    }
    /**
     * Set to compress target files. Defaults to `NONE`. Valid values are `GZIP` and `NONE`.
     * 
    */
    public Optional<String> getCompressionType() {
        return Optional.ofNullable(this.compressionType);
    }
    /**
     * Delimiter used to separate columns in the source files. Defaults to `,`.
     * 
    */
    public Optional<String> getCsvDelimiter() {
        return Optional.ofNullable(this.csvDelimiter);
    }
    /**
     * Delimiter used to separate rows in the source files. Defaults to `\n`.
     * 
    */
    public Optional<String> getCsvRowDelimiter() {
        return Optional.ofNullable(this.csvRowDelimiter);
    }
    /**
     * The output format for the files that AWS DMS uses to create S3 objects. Defaults to `csv`. Valid values are `csv` and `parquet`.
     * 
    */
    public Optional<String> getDataFormat() {
        return Optional.ofNullable(this.dataFormat);
    }
    /**
     * Partition S3 bucket folders based on transaction commit dates. Defaults to `false`.
     * 
    */
    public Optional<Boolean> getDatePartitionEnabled() {
        return Optional.ofNullable(this.datePartitionEnabled);
    }
    /**
     * The server-side encryption mode that you want to encrypt your .csv or .parquet object files copied to S3. Defaults to `SSE_S3`. Valid values are `SSE_S3` and `SSE_KMS`.
     * 
    */
    public Optional<String> getEncryptionMode() {
        return Optional.ofNullable(this.encryptionMode);
    }
    /**
     * JSON document that describes how AWS DMS should interpret the data.
     * 
    */
    public Optional<String> getExternalTableDefinition() {
        return Optional.ofNullable(this.externalTableDefinition);
    }
    /**
     * - Specifies the precision of any TIMESTAMP column values written to an S3 object file in .parquet format. Defaults to `false`.
     * 
    */
    public Optional<Boolean> getParquetTimestampInMillisecond() {
        return Optional.ofNullable(this.parquetTimestampInMillisecond);
    }
    /**
     * The version of the .parquet file format. Defaults to `parquet-1-0`. Valid values are `parquet-1-0` and `parquet-2-0`.
     * 
    */
    public Optional<String> getParquetVersion() {
        return Optional.ofNullable(this.parquetVersion);
    }
    /**
     * If you set encryptionMode to `SSE_KMS`, set this parameter to the Amazon Resource Name (ARN) for the AWS KMS key.
     * 
    */
    public Optional<String> getServerSideEncryptionKmsKeyId() {
        return Optional.ofNullable(this.serverSideEncryptionKmsKeyId);
    }
    /**
     * Amazon Resource Name (ARN) of the IAM Role with permissions to read from or write to the S3 Bucket.
     * 
    */
    public Optional<String> getServiceAccessRoleArn() {
        return Optional.ofNullable(this.serviceAccessRoleArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointS3Settings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bucketFolder;
        private @Nullable String bucketName;
        private @Nullable String compressionType;
        private @Nullable String csvDelimiter;
        private @Nullable String csvRowDelimiter;
        private @Nullable String dataFormat;
        private @Nullable Boolean datePartitionEnabled;
        private @Nullable String encryptionMode;
        private @Nullable String externalTableDefinition;
        private @Nullable Boolean parquetTimestampInMillisecond;
        private @Nullable String parquetVersion;
        private @Nullable String serverSideEncryptionKmsKeyId;
        private @Nullable String serviceAccessRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointS3Settings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketFolder = defaults.bucketFolder;
    	      this.bucketName = defaults.bucketName;
    	      this.compressionType = defaults.compressionType;
    	      this.csvDelimiter = defaults.csvDelimiter;
    	      this.csvRowDelimiter = defaults.csvRowDelimiter;
    	      this.dataFormat = defaults.dataFormat;
    	      this.datePartitionEnabled = defaults.datePartitionEnabled;
    	      this.encryptionMode = defaults.encryptionMode;
    	      this.externalTableDefinition = defaults.externalTableDefinition;
    	      this.parquetTimestampInMillisecond = defaults.parquetTimestampInMillisecond;
    	      this.parquetVersion = defaults.parquetVersion;
    	      this.serverSideEncryptionKmsKeyId = defaults.serverSideEncryptionKmsKeyId;
    	      this.serviceAccessRoleArn = defaults.serviceAccessRoleArn;
        }

        public Builder setBucketFolder(@Nullable String bucketFolder) {
            this.bucketFolder = bucketFolder;
            return this;
        }

        public Builder setBucketName(@Nullable String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        public Builder setCompressionType(@Nullable String compressionType) {
            this.compressionType = compressionType;
            return this;
        }

        public Builder setCsvDelimiter(@Nullable String csvDelimiter) {
            this.csvDelimiter = csvDelimiter;
            return this;
        }

        public Builder setCsvRowDelimiter(@Nullable String csvRowDelimiter) {
            this.csvRowDelimiter = csvRowDelimiter;
            return this;
        }

        public Builder setDataFormat(@Nullable String dataFormat) {
            this.dataFormat = dataFormat;
            return this;
        }

        public Builder setDatePartitionEnabled(@Nullable Boolean datePartitionEnabled) {
            this.datePartitionEnabled = datePartitionEnabled;
            return this;
        }

        public Builder setEncryptionMode(@Nullable String encryptionMode) {
            this.encryptionMode = encryptionMode;
            return this;
        }

        public Builder setExternalTableDefinition(@Nullable String externalTableDefinition) {
            this.externalTableDefinition = externalTableDefinition;
            return this;
        }

        public Builder setParquetTimestampInMillisecond(@Nullable Boolean parquetTimestampInMillisecond) {
            this.parquetTimestampInMillisecond = parquetTimestampInMillisecond;
            return this;
        }

        public Builder setParquetVersion(@Nullable String parquetVersion) {
            this.parquetVersion = parquetVersion;
            return this;
        }

        public Builder setServerSideEncryptionKmsKeyId(@Nullable String serverSideEncryptionKmsKeyId) {
            this.serverSideEncryptionKmsKeyId = serverSideEncryptionKmsKeyId;
            return this;
        }

        public Builder setServiceAccessRoleArn(@Nullable String serviceAccessRoleArn) {
            this.serviceAccessRoleArn = serviceAccessRoleArn;
            return this;
        }
        public EndpointS3Settings build() {
            return new EndpointS3Settings(bucketFolder, bucketName, compressionType, csvDelimiter, csvRowDelimiter, dataFormat, datePartitionEnabled, encryptionMode, externalTableDefinition, parquetTimestampInMillisecond, parquetVersion, serverSideEncryptionKmsKeyId, serviceAccessRoleArn);
        }
    }
}
