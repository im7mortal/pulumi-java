// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecretArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretArgs Empty = new SecretArgs();

    @InputImport(name="kmsKeyName")
    private final @Nullable Input<String> kmsKeyName;

    public Input<String> getKmsKeyName() {
        return this.kmsKeyName == null ? Input.empty() : this.kmsKeyName;
    }

    @InputImport(name="secretEnv")
    private final @Nullable Input<Map<String,String>> secretEnv;

    public Input<Map<String,String>> getSecretEnv() {
        return this.secretEnv == null ? Input.empty() : this.secretEnv;
    }

    public SecretArgs(
        @Nullable Input<String> kmsKeyName,
        @Nullable Input<Map<String,String>> secretEnv) {
        this.kmsKeyName = kmsKeyName;
        this.secretEnv = secretEnv;
    }

    private SecretArgs() {
        this.kmsKeyName = Input.empty();
        this.secretEnv = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kmsKeyName;
        private @Nullable Input<Map<String,String>> secretEnv;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.secretEnv = defaults.secretEnv;
        }

        public Builder setKmsKeyName(@Nullable Input<String> kmsKeyName) {
            this.kmsKeyName = kmsKeyName;
            return this;
        }

        public Builder setKmsKeyName(@Nullable String kmsKeyName) {
            this.kmsKeyName = Input.ofNullable(kmsKeyName);
            return this;
        }

        public Builder setSecretEnv(@Nullable Input<Map<String,String>> secretEnv) {
            this.secretEnv = secretEnv;
            return this;
        }

        public Builder setSecretEnv(@Nullable Map<String,String> secretEnv) {
            this.secretEnv = Input.ofNullable(secretEnv);
            return this;
        }

        public SecretArgs build() {
            return new SecretArgs(kmsKeyName, secretEnv);
        }
    }
}