// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs Empty = new SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs();

    /**
     * Describes the Cloud KMS encryption key that will be used to protect destination secret.
     * 
     */
    @InputImport(name="kmsKeyName", required=true)
    private final Input<String> kmsKeyName;

    public Input<String> getKmsKeyName() {
        return this.kmsKeyName;
    }

    public SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs(Input<String> kmsKeyName) {
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName, "expected parameter 'kmsKeyName' to be non-null");
    }

    private SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs() {
        this.kmsKeyName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> kmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        public Builder setKmsKeyName(Input<String> kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }

        public Builder setKmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Input.of(Objects.requireNonNull(kmsKeyName));
            return this;
        }

        public SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs build() {
            return new SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs(kmsKeyName);
        }
    }
}