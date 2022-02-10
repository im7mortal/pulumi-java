// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.cloudbuild_v1.inputs.InlineSecretResponse;
import io.pulumi.googlenative.cloudbuild_v1.inputs.SecretManagerSecretResponse;
import java.util.List;
import java.util.Objects;


public final class SecretsResponse extends io.pulumi.resources.InvokeArgs {

    public static final SecretsResponse Empty = new SecretsResponse();

    @InputImport(name="inline", required=true)
    private final List<InlineSecretResponse> inline;

    public List<InlineSecretResponse> getInline() {
        return this.inline;
    }

    @InputImport(name="secretManager", required=true)
    private final List<SecretManagerSecretResponse> secretManager;

    public List<SecretManagerSecretResponse> getSecretManager() {
        return this.secretManager;
    }

    public SecretsResponse(
        List<InlineSecretResponse> inline,
        List<SecretManagerSecretResponse> secretManager) {
        this.inline = Objects.requireNonNull(inline, "expected parameter 'inline' to be non-null");
        this.secretManager = Objects.requireNonNull(secretManager, "expected parameter 'secretManager' to be non-null");
    }

    private SecretsResponse() {
        this.inline = List.of();
        this.secretManager = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<InlineSecretResponse> inline;
        private List<SecretManagerSecretResponse> secretManager;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inline = defaults.inline;
    	      this.secretManager = defaults.secretManager;
        }

        public Builder setInline(List<InlineSecretResponse> inline) {
            this.inline = Objects.requireNonNull(inline);
            return this;
        }

        public Builder setSecretManager(List<SecretManagerSecretResponse> secretManager) {
            this.secretManager = Objects.requireNonNull(secretManager);
            return this;
        }

        public SecretsResponse build() {
            return new SecretsResponse(inline, secretManager);
        }
    }
}