// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AbortInfoResponse {
    /**
     * Causes that the analysis is aborted.
     * 
     */
    private final String cause;
    /**
     * URI of the resource that caused the abort.
     * 
     */
    private final String resourceUri;

    @OutputCustomType.Constructor({"cause","resourceUri"})
    private AbortInfoResponse(
        String cause,
        String resourceUri) {
        this.cause = Objects.requireNonNull(cause);
        this.resourceUri = Objects.requireNonNull(resourceUri);
    }

    /**
     * Causes that the analysis is aborted.
     * 
    */
    public String getCause() {
        return this.cause;
    }
    /**
     * URI of the resource that caused the abort.
     * 
    */
    public String getResourceUri() {
        return this.resourceUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AbortInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cause;
        private String resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(AbortInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cause = defaults.cause;
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder setCause(String cause) {
            this.cause = Objects.requireNonNull(cause);
            return this;
        }

        public Builder setResourceUri(String resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }
        public AbortInfoResponse build() {
            return new AbortInfoResponse(cause, resourceUri);
        }
    }
}
