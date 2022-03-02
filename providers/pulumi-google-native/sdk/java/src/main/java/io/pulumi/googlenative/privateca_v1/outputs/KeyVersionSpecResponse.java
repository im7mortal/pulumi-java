// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class KeyVersionSpecResponse {
    /**
     * The algorithm to use for creating a managed Cloud KMS key for a for a simplified experience. All managed keys will be have their ProtectionLevel as `HSM`.
     * 
     */
    private final String algorithm;
    /**
     * The resource name for an existing Cloud KMS CryptoKeyVersion in the format `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*{@literal /}cryptoKeyVersions/*`. This option enables full flexibility in the key's capabilities and properties.
     * 
     */
    private final String cloudKmsKeyVersion;

    @OutputCustomType.Constructor({"algorithm","cloudKmsKeyVersion"})
    private KeyVersionSpecResponse(
        String algorithm,
        String cloudKmsKeyVersion) {
        this.algorithm = Objects.requireNonNull(algorithm);
        this.cloudKmsKeyVersion = Objects.requireNonNull(cloudKmsKeyVersion);
    }

    /**
     * The algorithm to use for creating a managed Cloud KMS key for a for a simplified experience. All managed keys will be have their ProtectionLevel as `HSM`.
     * 
    */
    public String getAlgorithm() {
        return this.algorithm;
    }
    /**
     * The resource name for an existing Cloud KMS CryptoKeyVersion in the format `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*{@literal /}cryptoKeyVersions/*`. This option enables full flexibility in the key's capabilities and properties.
     * 
    */
    public String getCloudKmsKeyVersion() {
        return this.cloudKmsKeyVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVersionSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String algorithm;
        private String cloudKmsKeyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVersionSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.cloudKmsKeyVersion = defaults.cloudKmsKeyVersion;
        }

        public Builder setAlgorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }

        public Builder setCloudKmsKeyVersion(String cloudKmsKeyVersion) {
            this.cloudKmsKeyVersion = Objects.requireNonNull(cloudKmsKeyVersion);
            return this;
        }
        public KeyVersionSpecResponse build() {
            return new KeyVersionSpecResponse(algorithm, cloudKmsKeyVersion);
        }
    }
}
