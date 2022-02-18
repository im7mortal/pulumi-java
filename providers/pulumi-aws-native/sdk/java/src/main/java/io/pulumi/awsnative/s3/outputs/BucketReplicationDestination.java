// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.enums.BucketReplicationDestinationStorageClass;
import io.pulumi.awsnative.s3.outputs.BucketAccessControlTranslation;
import io.pulumi.awsnative.s3.outputs.BucketEncryptionConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketMetrics;
import io.pulumi.awsnative.s3.outputs.BucketReplicationTime;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketReplicationDestination {
    private final @Nullable BucketAccessControlTranslation accessControlTranslation;
    private final @Nullable String account;
    private final String bucket;
    private final @Nullable BucketEncryptionConfiguration encryptionConfiguration;
    private final @Nullable BucketMetrics metrics;
    private final @Nullable BucketReplicationTime replicationTime;
    /**
     * The storage class to use when replicating objects, such as S3 Standard or reduced redundancy.
     * 
     */
    private final @Nullable BucketReplicationDestinationStorageClass storageClass;

    @OutputCustomType.Constructor({"accessControlTranslation","account","bucket","encryptionConfiguration","metrics","replicationTime","storageClass"})
    private BucketReplicationDestination(
        @Nullable BucketAccessControlTranslation accessControlTranslation,
        @Nullable String account,
        String bucket,
        @Nullable BucketEncryptionConfiguration encryptionConfiguration,
        @Nullable BucketMetrics metrics,
        @Nullable BucketReplicationTime replicationTime,
        @Nullable BucketReplicationDestinationStorageClass storageClass) {
        this.accessControlTranslation = accessControlTranslation;
        this.account = account;
        this.bucket = Objects.requireNonNull(bucket);
        this.encryptionConfiguration = encryptionConfiguration;
        this.metrics = metrics;
        this.replicationTime = replicationTime;
        this.storageClass = storageClass;
    }

    public Optional<BucketAccessControlTranslation> getAccessControlTranslation() {
        return Optional.ofNullable(this.accessControlTranslation);
    }
    public Optional<String> getAccount() {
        return Optional.ofNullable(this.account);
    }
    public String getBucket() {
        return this.bucket;
    }
    public Optional<BucketEncryptionConfiguration> getEncryptionConfiguration() {
        return Optional.ofNullable(this.encryptionConfiguration);
    }
    public Optional<BucketMetrics> getMetrics() {
        return Optional.ofNullable(this.metrics);
    }
    public Optional<BucketReplicationTime> getReplicationTime() {
        return Optional.ofNullable(this.replicationTime);
    }
    /**
     * The storage class to use when replicating objects, such as S3 Standard or reduced redundancy.
     * 
     */
    public Optional<BucketReplicationDestinationStorageClass> getStorageClass() {
        return Optional.ofNullable(this.storageClass);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BucketAccessControlTranslation accessControlTranslation;
        private @Nullable String account;
        private String bucket;
        private @Nullable BucketEncryptionConfiguration encryptionConfiguration;
        private @Nullable BucketMetrics metrics;
        private @Nullable BucketReplicationTime replicationTime;
        private @Nullable BucketReplicationDestinationStorageClass storageClass;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControlTranslation = defaults.accessControlTranslation;
    	      this.account = defaults.account;
    	      this.bucket = defaults.bucket;
    	      this.encryptionConfiguration = defaults.encryptionConfiguration;
    	      this.metrics = defaults.metrics;
    	      this.replicationTime = defaults.replicationTime;
    	      this.storageClass = defaults.storageClass;
        }

        public Builder setAccessControlTranslation(@Nullable BucketAccessControlTranslation accessControlTranslation) {
            this.accessControlTranslation = accessControlTranslation;
            return this;
        }

        public Builder setAccount(@Nullable String account) {
            this.account = account;
            return this;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setEncryptionConfiguration(@Nullable BucketEncryptionConfiguration encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }

        public Builder setMetrics(@Nullable BucketMetrics metrics) {
            this.metrics = metrics;
            return this;
        }

        public Builder setReplicationTime(@Nullable BucketReplicationTime replicationTime) {
            this.replicationTime = replicationTime;
            return this;
        }

        public Builder setStorageClass(@Nullable BucketReplicationDestinationStorageClass storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        public BucketReplicationDestination build() {
            return new BucketReplicationDestination(accessControlTranslation, account, bucket, encryptionConfiguration, metrics, replicationTime, storageClass);
        }
    }
}
