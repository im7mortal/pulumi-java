// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudMlV1__EncryptionConfigResponse {
    private final String kmsKeyName;

    @OutputCustomType.Constructor({"kmsKeyName"})
    private GoogleCloudMlV1__EncryptionConfigResponse(String kmsKeyName) {
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
    }

    public String getKmsKeyName() {
        return this.kmsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__EncryptionConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__EncryptionConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        public Builder setKmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }

        public GoogleCloudMlV1__EncryptionConfigResponse build() {
            return new GoogleCloudMlV1__EncryptionConfigResponse(kmsKeyName);
        }
    }
}