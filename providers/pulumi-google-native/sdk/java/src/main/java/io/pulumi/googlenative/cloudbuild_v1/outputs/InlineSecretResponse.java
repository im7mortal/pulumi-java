// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class InlineSecretResponse {
    /**
     * Map of environment variable name to its encrypted value. Secret environment variables must be unique across all of a build's secrets, and must be used by at least one build step. Values can be at most 64 KB in size. There can be at most 100 secret values across all of a build's secrets.
     * 
     */
    private final Map<String,String> envMap;
    /**
     * Resource name of Cloud KMS crypto key to decrypt the encrypted value. In format: projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*
     * 
     */
    private final String kmsKeyName;

    @OutputCustomType.Constructor({"envMap","kmsKeyName"})
    private InlineSecretResponse(
        Map<String,String> envMap,
        String kmsKeyName) {
        this.envMap = Objects.requireNonNull(envMap);
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
    }

    /**
     * Map of environment variable name to its encrypted value. Secret environment variables must be unique across all of a build's secrets, and must be used by at least one build step. Values can be at most 64 KB in size. There can be at most 100 secret values across all of a build's secrets.
     * 
    */
    public Map<String,String> getEnvMap() {
        return this.envMap;
    }
    /**
     * Resource name of Cloud KMS crypto key to decrypt the encrypted value. In format: projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*
     * 
    */
    public String getKmsKeyName() {
        return this.kmsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InlineSecretResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> envMap;
        private String kmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(InlineSecretResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.envMap = defaults.envMap;
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        public Builder setEnvMap(Map<String,String> envMap) {
            this.envMap = Objects.requireNonNull(envMap);
            return this;
        }

        public Builder setKmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }
        public InlineSecretResponse build() {
            return new InlineSecretResponse(envMap, kmsKeyName);
        }
    }
}
