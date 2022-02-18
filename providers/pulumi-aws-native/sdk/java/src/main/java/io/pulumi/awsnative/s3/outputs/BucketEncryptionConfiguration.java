// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BucketEncryptionConfiguration {
    /**
     * Specifies the ID (Key ARN or Alias ARN) of the customer managed customer master key (CMK) stored in AWS Key Management Service (KMS) for the destination bucket.
     * 
     */
    private final String replicaKmsKeyID;

    @OutputCustomType.Constructor({"replicaKmsKeyID"})
    private BucketEncryptionConfiguration(String replicaKmsKeyID) {
        this.replicaKmsKeyID = Objects.requireNonNull(replicaKmsKeyID);
    }

    /**
     * Specifies the ID (Key ARN or Alias ARN) of the customer managed customer master key (CMK) stored in AWS Key Management Service (KMS) for the destination bucket.
     * 
     */
    public String getReplicaKmsKeyID() {
        return this.replicaKmsKeyID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketEncryptionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String replicaKmsKeyID;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketEncryptionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicaKmsKeyID = defaults.replicaKmsKeyID;
        }

        public Builder setReplicaKmsKeyID(String replicaKmsKeyID) {
            this.replicaKmsKeyID = Objects.requireNonNull(replicaKmsKeyID);
            return this;
        }

        public BucketEncryptionConfiguration build() {
            return new BucketEncryptionConfiguration(replicaKmsKeyID);
        }
    }
}
