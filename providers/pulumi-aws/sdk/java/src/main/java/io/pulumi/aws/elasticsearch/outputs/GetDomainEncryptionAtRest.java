// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetDomainEncryptionAtRest {
    /**
     * Whether node to node encryption is enabled.
     * 
     */
    private final Boolean enabled;
    /**
     * The KMS key id used to encrypt data at rest.
     * 
     */
    private final String kmsKeyId;

    @OutputCustomType.Constructor({"enabled","kmsKeyId"})
    private GetDomainEncryptionAtRest(
        Boolean enabled,
        String kmsKeyId) {
        this.enabled = Objects.requireNonNull(enabled);
        this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
    }

    /**
     * Whether node to node encryption is enabled.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The KMS key id used to encrypt data at rest.
     * 
    */
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainEncryptionAtRest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private String kmsKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainEncryptionAtRest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.kmsKeyId = defaults.kmsKeyId;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setKmsKeyId(String kmsKeyId) {
            this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
            return this;
        }
        public GetDomainEncryptionAtRest build() {
            return new GetDomainEncryptionAtRest(enabled, kmsKeyId);
        }
    }
}
