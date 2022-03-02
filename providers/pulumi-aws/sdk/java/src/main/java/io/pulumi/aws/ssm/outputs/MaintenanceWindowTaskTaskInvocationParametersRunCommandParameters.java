// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.outputs;

import io.pulumi.aws.ssm.outputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfig;
import io.pulumi.aws.ssm.outputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig;
import io.pulumi.aws.ssm.outputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters {
    /**
     * Configuration options for sending command output to CloudWatch Logs. Documented below.
     * 
     */
    private final @Nullable MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfig cloudwatchConfig;
    /**
     * Information about the command(s) to execute.
     * 
     */
    private final @Nullable String comment;
    /**
     * The SHA-256 or SHA-1 hash created by the system when the document was created. SHA-1 hashes have been deprecated.
     * 
     */
    private final @Nullable String documentHash;
    /**
     * SHA-256 or SHA-1. SHA-1 hashes have been deprecated. Valid values: `Sha256` and `Sha1`
     * 
     */
    private final @Nullable String documentHashType;
    /**
     * The version of an Automation document to use during task execution.
     * 
     */
    private final @Nullable String documentVersion;
    /**
     * Configurations for sending notifications about command status changes on a per-instance basis. Documented below.
     * 
     */
    private final @Nullable MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig notificationConfig;
    /**
     * The name of the Amazon S3 bucket.
     * 
     */
    private final @Nullable String outputS3Bucket;
    /**
     * The Amazon S3 bucket subfolder.
     * 
     */
    private final @Nullable String outputS3KeyPrefix;
    /**
     * The parameters for the RUN_COMMAND task execution. Documented below.
     * 
     */
    private final @Nullable List<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter> parameters;
    /**
     * The IAM service role to assume during task execution.
     * 
     */
    private final @Nullable String serviceRoleArn;
    /**
     * If this time is reached and the command has not already started executing, it doesn't run.
     * 
     */
    private final @Nullable Integer timeoutSeconds;

    @OutputCustomType.Constructor({"cloudwatchConfig","comment","documentHash","documentHashType","documentVersion","notificationConfig","outputS3Bucket","outputS3KeyPrefix","parameters","serviceRoleArn","timeoutSeconds"})
    private MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters(
        @Nullable MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfig cloudwatchConfig,
        @Nullable String comment,
        @Nullable String documentHash,
        @Nullable String documentHashType,
        @Nullable String documentVersion,
        @Nullable MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig notificationConfig,
        @Nullable String outputS3Bucket,
        @Nullable String outputS3KeyPrefix,
        @Nullable List<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter> parameters,
        @Nullable String serviceRoleArn,
        @Nullable Integer timeoutSeconds) {
        this.cloudwatchConfig = cloudwatchConfig;
        this.comment = comment;
        this.documentHash = documentHash;
        this.documentHashType = documentHashType;
        this.documentVersion = documentVersion;
        this.notificationConfig = notificationConfig;
        this.outputS3Bucket = outputS3Bucket;
        this.outputS3KeyPrefix = outputS3KeyPrefix;
        this.parameters = parameters;
        this.serviceRoleArn = serviceRoleArn;
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * Configuration options for sending command output to CloudWatch Logs. Documented below.
     * 
    */
    public Optional<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfig> getCloudwatchConfig() {
        return Optional.ofNullable(this.cloudwatchConfig);
    }
    /**
     * Information about the command(s) to execute.
     * 
    */
    public Optional<String> getComment() {
        return Optional.ofNullable(this.comment);
    }
    /**
     * The SHA-256 or SHA-1 hash created by the system when the document was created. SHA-1 hashes have been deprecated.
     * 
    */
    public Optional<String> getDocumentHash() {
        return Optional.ofNullable(this.documentHash);
    }
    /**
     * SHA-256 or SHA-1. SHA-1 hashes have been deprecated. Valid values: `Sha256` and `Sha1`
     * 
    */
    public Optional<String> getDocumentHashType() {
        return Optional.ofNullable(this.documentHashType);
    }
    /**
     * The version of an Automation document to use during task execution.
     * 
    */
    public Optional<String> getDocumentVersion() {
        return Optional.ofNullable(this.documentVersion);
    }
    /**
     * Configurations for sending notifications about command status changes on a per-instance basis. Documented below.
     * 
    */
    public Optional<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig> getNotificationConfig() {
        return Optional.ofNullable(this.notificationConfig);
    }
    /**
     * The name of the Amazon S3 bucket.
     * 
    */
    public Optional<String> getOutputS3Bucket() {
        return Optional.ofNullable(this.outputS3Bucket);
    }
    /**
     * The Amazon S3 bucket subfolder.
     * 
    */
    public Optional<String> getOutputS3KeyPrefix() {
        return Optional.ofNullable(this.outputS3KeyPrefix);
    }
    /**
     * The parameters for the RUN_COMMAND task execution. Documented below.
     * 
    */
    public List<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter> getParameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }
    /**
     * The IAM service role to assume during task execution.
     * 
    */
    public Optional<String> getServiceRoleArn() {
        return Optional.ofNullable(this.serviceRoleArn);
    }
    /**
     * If this time is reached and the command has not already started executing, it doesn't run.
     * 
    */
    public Optional<Integer> getTimeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfig cloudwatchConfig;
        private @Nullable String comment;
        private @Nullable String documentHash;
        private @Nullable String documentHashType;
        private @Nullable String documentVersion;
        private @Nullable MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig notificationConfig;
        private @Nullable String outputS3Bucket;
        private @Nullable String outputS3KeyPrefix;
        private @Nullable List<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter> parameters;
        private @Nullable String serviceRoleArn;
        private @Nullable Integer timeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchConfig = defaults.cloudwatchConfig;
    	      this.comment = defaults.comment;
    	      this.documentHash = defaults.documentHash;
    	      this.documentHashType = defaults.documentHashType;
    	      this.documentVersion = defaults.documentVersion;
    	      this.notificationConfig = defaults.notificationConfig;
    	      this.outputS3Bucket = defaults.outputS3Bucket;
    	      this.outputS3KeyPrefix = defaults.outputS3KeyPrefix;
    	      this.parameters = defaults.parameters;
    	      this.serviceRoleArn = defaults.serviceRoleArn;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        public Builder setCloudwatchConfig(@Nullable MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfig cloudwatchConfig) {
            this.cloudwatchConfig = cloudwatchConfig;
            return this;
        }

        public Builder setComment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }

        public Builder setDocumentHash(@Nullable String documentHash) {
            this.documentHash = documentHash;
            return this;
        }

        public Builder setDocumentHashType(@Nullable String documentHashType) {
            this.documentHashType = documentHashType;
            return this;
        }

        public Builder setDocumentVersion(@Nullable String documentVersion) {
            this.documentVersion = documentVersion;
            return this;
        }

        public Builder setNotificationConfig(@Nullable MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig notificationConfig) {
            this.notificationConfig = notificationConfig;
            return this;
        }

        public Builder setOutputS3Bucket(@Nullable String outputS3Bucket) {
            this.outputS3Bucket = outputS3Bucket;
            return this;
        }

        public Builder setOutputS3KeyPrefix(@Nullable String outputS3KeyPrefix) {
            this.outputS3KeyPrefix = outputS3KeyPrefix;
            return this;
        }

        public Builder setParameters(@Nullable List<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setServiceRoleArn(@Nullable String serviceRoleArn) {
            this.serviceRoleArn = serviceRoleArn;
            return this;
        }

        public Builder setTimeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters build() {
            return new MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters(cloudwatchConfig, comment, documentHash, documentHashType, documentVersion, notificationConfig, outputS3Bucket, outputS3KeyPrefix, parameters, serviceRoleArn, timeoutSeconds);
        }
    }
}
