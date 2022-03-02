// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class EncryptionConfigResponse {
    /**
     * Optional. The Cloud KMS key name to use for PD disk encryption for all instances in the cluster.
     * 
     */
    private final String gcePdKmsKeyName;

    @OutputCustomType.Constructor({"gcePdKmsKeyName"})
    private EncryptionConfigResponse(String gcePdKmsKeyName) {
        this.gcePdKmsKeyName = Objects.requireNonNull(gcePdKmsKeyName);
    }

    /**
     * Optional. The Cloud KMS key name to use for PD disk encryption for all instances in the cluster.
     * 
    */
    public String getGcePdKmsKeyName() {
        return this.gcePdKmsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gcePdKmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcePdKmsKeyName = defaults.gcePdKmsKeyName;
        }

        public Builder setGcePdKmsKeyName(String gcePdKmsKeyName) {
            this.gcePdKmsKeyName = Objects.requireNonNull(gcePdKmsKeyName);
            return this;
        }
        public EncryptionConfigResponse build() {
            return new EncryptionConfigResponse(gcePdKmsKeyName);
        }
    }
}
