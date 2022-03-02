// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kms.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GrantConstraint {
    /**
     * A list of key-value pairs that must match the encryption context in subsequent cryptographic operation requests. The grant allows the operation only when the encryption context in the request is the same as the encryption context specified in this constraint. Conflicts with `encryption_context_subset`.
     * 
     */
    private final @Nullable Map<String,String> encryptionContextEquals;
    /**
     * A list of key-value pairs that must be included in the encryption context of subsequent cryptographic operation requests. The grant allows the cryptographic operation only when the encryption context in the request includes the key-value pairs specified in this constraint, although it can include additional key-value pairs. Conflicts with `encryption_context_equals`.
     * 
     */
    private final @Nullable Map<String,String> encryptionContextSubset;

    @OutputCustomType.Constructor({"encryptionContextEquals","encryptionContextSubset"})
    private GrantConstraint(
        @Nullable Map<String,String> encryptionContextEquals,
        @Nullable Map<String,String> encryptionContextSubset) {
        this.encryptionContextEquals = encryptionContextEquals;
        this.encryptionContextSubset = encryptionContextSubset;
    }

    /**
     * A list of key-value pairs that must match the encryption context in subsequent cryptographic operation requests. The grant allows the operation only when the encryption context in the request is the same as the encryption context specified in this constraint. Conflicts with `encryption_context_subset`.
     * 
    */
    public Map<String,String> getEncryptionContextEquals() {
        return this.encryptionContextEquals == null ? Map.of() : this.encryptionContextEquals;
    }
    /**
     * A list of key-value pairs that must be included in the encryption context of subsequent cryptographic operation requests. The grant allows the cryptographic operation only when the encryption context in the request includes the key-value pairs specified in this constraint, although it can include additional key-value pairs. Conflicts with `encryption_context_equals`.
     * 
    */
    public Map<String,String> getEncryptionContextSubset() {
        return this.encryptionContextSubset == null ? Map.of() : this.encryptionContextSubset;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrantConstraint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> encryptionContextEquals;
        private @Nullable Map<String,String> encryptionContextSubset;

        public Builder() {
    	      // Empty
        }

        public Builder(GrantConstraint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionContextEquals = defaults.encryptionContextEquals;
    	      this.encryptionContextSubset = defaults.encryptionContextSubset;
        }

        public Builder setEncryptionContextEquals(@Nullable Map<String,String> encryptionContextEquals) {
            this.encryptionContextEquals = encryptionContextEquals;
            return this;
        }

        public Builder setEncryptionContextSubset(@Nullable Map<String,String> encryptionContextSubset) {
            this.encryptionContextSubset = encryptionContextSubset;
            return this;
        }
        public GrantConstraint build() {
            return new GrantConstraint(encryptionContextEquals, encryptionContextSubset);
        }
    }
}
