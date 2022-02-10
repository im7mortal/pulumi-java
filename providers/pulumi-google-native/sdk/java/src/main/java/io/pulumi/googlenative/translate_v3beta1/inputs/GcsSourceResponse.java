// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.translate_v3beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GcsSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final GcsSourceResponse Empty = new GcsSourceResponse();

    @InputImport(name="inputUri", required=true)
    private final String inputUri;

    public String getInputUri() {
        return this.inputUri;
    }

    public GcsSourceResponse(String inputUri) {
        this.inputUri = Objects.requireNonNull(inputUri, "expected parameter 'inputUri' to be non-null");
    }

    private GcsSourceResponse() {
        this.inputUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcsSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String inputUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GcsSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputUri = defaults.inputUri;
        }

        public Builder setInputUri(String inputUri) {
            this.inputUri = Objects.requireNonNull(inputUri);
            return this;
        }

        public GcsSourceResponse build() {
            return new GcsSourceResponse(inputUri);
        }
    }
}