// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault {
    /**
     * The AWS KMS master key ID used for the SSE-KMS encryption. This can only be used when you set the value of `sse_algorithm` as `aws:kms`. The default `aws/s3` AWS KMS master key is used if this element is absent while the `sse_algorithm` is `aws:kms`.
     * 
     */
    private final @Nullable String kmsMasterKeyId;
    /**
     * The server-side encryption algorithm to use. Valid values are `AES256` and `aws:kms`
     * 
     */
    private final String sseAlgorithm;

    @OutputCustomType.Constructor({"kmsMasterKeyId","sseAlgorithm"})
    private BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault(
        @Nullable String kmsMasterKeyId,
        String sseAlgorithm) {
        this.kmsMasterKeyId = kmsMasterKeyId;
        this.sseAlgorithm = Objects.requireNonNull(sseAlgorithm);
    }

    /**
     * The AWS KMS master key ID used for the SSE-KMS encryption. This can only be used when you set the value of `sse_algorithm` as `aws:kms`. The default `aws/s3` AWS KMS master key is used if this element is absent while the `sse_algorithm` is `aws:kms`.
     * 
    */
    public Optional<String> getKmsMasterKeyId() {
        return Optional.ofNullable(this.kmsMasterKeyId);
    }
    /**
     * The server-side encryption algorithm to use. Valid values are `AES256` and `aws:kms`
     * 
    */
    public String getSseAlgorithm() {
        return this.sseAlgorithm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kmsMasterKeyId;
        private String sseAlgorithm;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsMasterKeyId = defaults.kmsMasterKeyId;
    	      this.sseAlgorithm = defaults.sseAlgorithm;
        }

        public Builder setKmsMasterKeyId(@Nullable String kmsMasterKeyId) {
            this.kmsMasterKeyId = kmsMasterKeyId;
            return this;
        }

        public Builder setSseAlgorithm(String sseAlgorithm) {
            this.sseAlgorithm = Objects.requireNonNull(sseAlgorithm);
            return this;
        }
        public BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault build() {
            return new BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault(kmsMasterKeyId, sseAlgorithm);
        }
    }
}
