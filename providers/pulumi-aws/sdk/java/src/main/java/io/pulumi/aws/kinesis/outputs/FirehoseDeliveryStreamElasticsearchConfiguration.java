// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptions;
import io.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration;
import io.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamElasticsearchConfigurationVpcConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FirehoseDeliveryStreamElasticsearchConfiguration {
    /**
     * Buffer incoming data for the specified period of time, in seconds between 60 to 900, before delivering it to the destination.  The default value is 300s.
     * 
     */
    private final @Nullable Integer bufferingInterval;
    /**
     * Buffer incoming data to the specified size, in MBs between 1 to 100, before delivering it to the destination.  The default value is 5MB.
     * 
     */
    private final @Nullable Integer bufferingSize;
    /**
     * The CloudWatch Logging Options for the delivery stream. More details are given below
     * 
     */
    private final @Nullable FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions;
    /**
     * The endpoint to use when communicating with the cluster. Conflicts with `domain_arn`.
     * 
     */
    private final @Nullable String clusterEndpoint;
    /**
     * The ARN of the Amazon ES domain.  The IAM role must have permission for `DescribeElasticsearchDomain`, `DescribeElasticsearchDomains`, and `DescribeElasticsearchDomainConfig` after assuming `RoleARN`.  The pattern needs to be `arn:.*`. Conflicts with `cluster_endpoint`.
     * 
     */
    private final @Nullable String domainArn;
    /**
     * The Elasticsearch index name.
     * 
     */
    private final String indexName;
    /**
     * The Elasticsearch index rotation period.  Index rotation appends a timestamp to the IndexName to facilitate expiration of old data.  Valid values are `NoRotation`, `OneHour`, `OneDay`, `OneWeek`, and `OneMonth`.  The default value is `OneDay`.
     * 
     */
    private final @Nullable String indexRotationPeriod;
    /**
     * The data processing configuration.  More details are given below.
     * 
     */
    private final @Nullable FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration processingConfiguration;
    /**
     * After an initial failure to deliver to Amazon Elasticsearch, the total amount of time, in seconds between 0 to 7200, during which Firehose re-attempts delivery (including the first attempt).  After this time has elapsed, the failed documents are written to Amazon S3.  The default value is 300s.  There will be no retry if the value is 0.
     * 
     */
    private final @Nullable Integer retryDuration;
    /**
     * The ARN of the IAM role to be assumed by Firehose for calling the Amazon ES Configuration API and for indexing documents.  The pattern needs to be `arn:.*`.
     * 
     */
    private final String roleArn;
    /**
     * Defines how documents should be delivered to Amazon S3.  Valid values are `FailedDocumentsOnly` and `AllDocuments`.  Default value is `FailedDocumentsOnly`.
     * 
     */
    private final @Nullable String s3BackupMode;
    /**
     * The Elasticsearch type name with maximum length of 100 characters.
     * 
     */
    private final @Nullable String typeName;
    /**
     * The VPC configuration for the delivery stream to connect to Elastic Search associated with the VPC. More details are given below
     * 
     */
    private final @Nullable FirehoseDeliveryStreamElasticsearchConfigurationVpcConfig vpcConfig;

    @OutputCustomType.Constructor({"bufferingInterval","bufferingSize","cloudwatchLoggingOptions","clusterEndpoint","domainArn","indexName","indexRotationPeriod","processingConfiguration","retryDuration","roleArn","s3BackupMode","typeName","vpcConfig"})
    private FirehoseDeliveryStreamElasticsearchConfiguration(
        @Nullable Integer bufferingInterval,
        @Nullable Integer bufferingSize,
        @Nullable FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions,
        @Nullable String clusterEndpoint,
        @Nullable String domainArn,
        String indexName,
        @Nullable String indexRotationPeriod,
        @Nullable FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration processingConfiguration,
        @Nullable Integer retryDuration,
        String roleArn,
        @Nullable String s3BackupMode,
        @Nullable String typeName,
        @Nullable FirehoseDeliveryStreamElasticsearchConfigurationVpcConfig vpcConfig) {
        this.bufferingInterval = bufferingInterval;
        this.bufferingSize = bufferingSize;
        this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
        this.clusterEndpoint = clusterEndpoint;
        this.domainArn = domainArn;
        this.indexName = Objects.requireNonNull(indexName);
        this.indexRotationPeriod = indexRotationPeriod;
        this.processingConfiguration = processingConfiguration;
        this.retryDuration = retryDuration;
        this.roleArn = Objects.requireNonNull(roleArn);
        this.s3BackupMode = s3BackupMode;
        this.typeName = typeName;
        this.vpcConfig = vpcConfig;
    }

    /**
     * Buffer incoming data for the specified period of time, in seconds between 60 to 900, before delivering it to the destination.  The default value is 300s.
     * 
    */
    public Optional<Integer> getBufferingInterval() {
        return Optional.ofNullable(this.bufferingInterval);
    }
    /**
     * Buffer incoming data to the specified size, in MBs between 1 to 100, before delivering it to the destination.  The default value is 5MB.
     * 
    */
    public Optional<Integer> getBufferingSize() {
        return Optional.ofNullable(this.bufferingSize);
    }
    /**
     * The CloudWatch Logging Options for the delivery stream. More details are given below
     * 
    */
    public Optional<FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptions> getCloudwatchLoggingOptions() {
        return Optional.ofNullable(this.cloudwatchLoggingOptions);
    }
    /**
     * The endpoint to use when communicating with the cluster. Conflicts with `domain_arn`.
     * 
    */
    public Optional<String> getClusterEndpoint() {
        return Optional.ofNullable(this.clusterEndpoint);
    }
    /**
     * The ARN of the Amazon ES domain.  The IAM role must have permission for `DescribeElasticsearchDomain`, `DescribeElasticsearchDomains`, and `DescribeElasticsearchDomainConfig` after assuming `RoleARN`.  The pattern needs to be `arn:.*`. Conflicts with `cluster_endpoint`.
     * 
    */
    public Optional<String> getDomainArn() {
        return Optional.ofNullable(this.domainArn);
    }
    /**
     * The Elasticsearch index name.
     * 
    */
    public String getIndexName() {
        return this.indexName;
    }
    /**
     * The Elasticsearch index rotation period.  Index rotation appends a timestamp to the IndexName to facilitate expiration of old data.  Valid values are `NoRotation`, `OneHour`, `OneDay`, `OneWeek`, and `OneMonth`.  The default value is `OneDay`.
     * 
    */
    public Optional<String> getIndexRotationPeriod() {
        return Optional.ofNullable(this.indexRotationPeriod);
    }
    /**
     * The data processing configuration.  More details are given below.
     * 
    */
    public Optional<FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration> getProcessingConfiguration() {
        return Optional.ofNullable(this.processingConfiguration);
    }
    /**
     * After an initial failure to deliver to Amazon Elasticsearch, the total amount of time, in seconds between 0 to 7200, during which Firehose re-attempts delivery (including the first attempt).  After this time has elapsed, the failed documents are written to Amazon S3.  The default value is 300s.  There will be no retry if the value is 0.
     * 
    */
    public Optional<Integer> getRetryDuration() {
        return Optional.ofNullable(this.retryDuration);
    }
    /**
     * The ARN of the IAM role to be assumed by Firehose for calling the Amazon ES Configuration API and for indexing documents.  The pattern needs to be `arn:.*`.
     * 
    */
    public String getRoleArn() {
        return this.roleArn;
    }
    /**
     * Defines how documents should be delivered to Amazon S3.  Valid values are `FailedDocumentsOnly` and `AllDocuments`.  Default value is `FailedDocumentsOnly`.
     * 
    */
    public Optional<String> getS3BackupMode() {
        return Optional.ofNullable(this.s3BackupMode);
    }
    /**
     * The Elasticsearch type name with maximum length of 100 characters.
     * 
    */
    public Optional<String> getTypeName() {
        return Optional.ofNullable(this.typeName);
    }
    /**
     * The VPC configuration for the delivery stream to connect to Elastic Search associated with the VPC. More details are given below
     * 
    */
    public Optional<FirehoseDeliveryStreamElasticsearchConfigurationVpcConfig> getVpcConfig() {
        return Optional.ofNullable(this.vpcConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamElasticsearchConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer bufferingInterval;
        private @Nullable Integer bufferingSize;
        private @Nullable FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions;
        private @Nullable String clusterEndpoint;
        private @Nullable String domainArn;
        private String indexName;
        private @Nullable String indexRotationPeriod;
        private @Nullable FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration processingConfiguration;
        private @Nullable Integer retryDuration;
        private String roleArn;
        private @Nullable String s3BackupMode;
        private @Nullable String typeName;
        private @Nullable FirehoseDeliveryStreamElasticsearchConfigurationVpcConfig vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamElasticsearchConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bufferingInterval = defaults.bufferingInterval;
    	      this.bufferingSize = defaults.bufferingSize;
    	      this.cloudwatchLoggingOptions = defaults.cloudwatchLoggingOptions;
    	      this.clusterEndpoint = defaults.clusterEndpoint;
    	      this.domainArn = defaults.domainArn;
    	      this.indexName = defaults.indexName;
    	      this.indexRotationPeriod = defaults.indexRotationPeriod;
    	      this.processingConfiguration = defaults.processingConfiguration;
    	      this.retryDuration = defaults.retryDuration;
    	      this.roleArn = defaults.roleArn;
    	      this.s3BackupMode = defaults.s3BackupMode;
    	      this.typeName = defaults.typeName;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        public Builder setBufferingInterval(@Nullable Integer bufferingInterval) {
            this.bufferingInterval = bufferingInterval;
            return this;
        }

        public Builder setBufferingSize(@Nullable Integer bufferingSize) {
            this.bufferingSize = bufferingSize;
            return this;
        }

        public Builder setCloudwatchLoggingOptions(@Nullable FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
            return this;
        }

        public Builder setClusterEndpoint(@Nullable String clusterEndpoint) {
            this.clusterEndpoint = clusterEndpoint;
            return this;
        }

        public Builder setDomainArn(@Nullable String domainArn) {
            this.domainArn = domainArn;
            return this;
        }

        public Builder setIndexName(String indexName) {
            this.indexName = Objects.requireNonNull(indexName);
            return this;
        }

        public Builder setIndexRotationPeriod(@Nullable String indexRotationPeriod) {
            this.indexRotationPeriod = indexRotationPeriod;
            return this;
        }

        public Builder setProcessingConfiguration(@Nullable FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration processingConfiguration) {
            this.processingConfiguration = processingConfiguration;
            return this;
        }

        public Builder setRetryDuration(@Nullable Integer retryDuration) {
            this.retryDuration = retryDuration;
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setS3BackupMode(@Nullable String s3BackupMode) {
            this.s3BackupMode = s3BackupMode;
            return this;
        }

        public Builder setTypeName(@Nullable String typeName) {
            this.typeName = typeName;
            return this;
        }

        public Builder setVpcConfig(@Nullable FirehoseDeliveryStreamElasticsearchConfigurationVpcConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }
        public FirehoseDeliveryStreamElasticsearchConfiguration build() {
            return new FirehoseDeliveryStreamElasticsearchConfiguration(bufferingInterval, bufferingSize, cloudwatchLoggingOptions, clusterEndpoint, domainArn, indexName, indexRotationPeriod, processingConfiguration, retryDuration, roleArn, s3BackupMode, typeName, vpcConfig);
        }
    }
}
