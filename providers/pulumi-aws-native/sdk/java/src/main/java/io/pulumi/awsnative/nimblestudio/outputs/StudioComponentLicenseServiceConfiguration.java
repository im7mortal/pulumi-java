// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StudioComponentLicenseServiceConfiguration {
    /**
     * <p>The endpoint of the license service that is accessed by the studio component resource.</p>
     * 
     */
    private final @Nullable String endpoint;

    @OutputCustomType.Constructor({"endpoint"})
    private StudioComponentLicenseServiceConfiguration(@Nullable String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>The endpoint of the license service that is accessed by the studio component resource.</p>
     * 
     */
    public Optional<String> getEndpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioComponentLicenseServiceConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioComponentLicenseServiceConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
        }

        public Builder setEndpoint(@Nullable String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public StudioComponentLicenseServiceConfiguration build() {
            return new StudioComponentLicenseServiceConfiguration(endpoint);
        }
    }
}
