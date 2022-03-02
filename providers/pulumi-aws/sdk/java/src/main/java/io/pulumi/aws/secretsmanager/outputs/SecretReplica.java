// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.secretsmanager.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SecretReplica {
    /**
     * ARN, Key ID, or Alias of the AWS KMS key within the region secret is replicated to. If one is not specified, then Secrets Manager defaults to using the AWS account's default KMS key (`aws/secretsmanager`) in the region or creates one for use if non-existent.
     * 
     */
    private final @Nullable String kmsKeyId;
    /**
     * Date that you last accessed the secret in the Region.
     * 
     */
    private final @Nullable String lastAccessedDate;
    /**
     * Region for replicating the secret.
     * 
     */
    private final String region;
    /**
     * Status can be `InProgress`, `Failed`, or `InSync`.
     * 
     */
    private final @Nullable String status;
    /**
     * Message such as `Replication succeeded` or `Secret with this name already exists in this region`.
     * 
     */
    private final @Nullable String statusMessage;

    @OutputCustomType.Constructor({"kmsKeyId","lastAccessedDate","region","status","statusMessage"})
    private SecretReplica(
        @Nullable String kmsKeyId,
        @Nullable String lastAccessedDate,
        String region,
        @Nullable String status,
        @Nullable String statusMessage) {
        this.kmsKeyId = kmsKeyId;
        this.lastAccessedDate = lastAccessedDate;
        this.region = Objects.requireNonNull(region);
        this.status = status;
        this.statusMessage = statusMessage;
    }

    /**
     * ARN, Key ID, or Alias of the AWS KMS key within the region secret is replicated to. If one is not specified, then Secrets Manager defaults to using the AWS account's default KMS key (`aws/secretsmanager`) in the region or creates one for use if non-existent.
     * 
    */
    public Optional<String> getKmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    /**
     * Date that you last accessed the secret in the Region.
     * 
    */
    public Optional<String> getLastAccessedDate() {
        return Optional.ofNullable(this.lastAccessedDate);
    }
    /**
     * Region for replicating the secret.
     * 
    */
    public String getRegion() {
        return this.region;
    }
    /**
     * Status can be `InProgress`, `Failed`, or `InSync`.
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * Message such as `Replication succeeded` or `Secret with this name already exists in this region`.
     * 
    */
    public Optional<String> getStatusMessage() {
        return Optional.ofNullable(this.statusMessage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretReplica defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kmsKeyId;
        private @Nullable String lastAccessedDate;
        private String region;
        private @Nullable String status;
        private @Nullable String statusMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretReplica defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.lastAccessedDate = defaults.lastAccessedDate;
    	      this.region = defaults.region;
    	      this.status = defaults.status;
    	      this.statusMessage = defaults.statusMessage;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setLastAccessedDate(@Nullable String lastAccessedDate) {
            this.lastAccessedDate = lastAccessedDate;
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setStatusMessage(@Nullable String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public SecretReplica build() {
            return new SecretReplica(kmsKeyId, lastAccessedDate, region, status, statusMessage);
        }
    }
}
