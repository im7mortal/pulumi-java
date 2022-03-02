// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.outputs;

import io.pulumi.awsnative.imagebuilder.enums.InfrastructureConfigurationInstanceMetadataOptionsHttpTokens;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InfrastructureConfigurationInstanceMetadataOptions {
    /**
     * Limit the number of hops that an instance metadata request can traverse to reach its destination.
     * 
     */
    private final @Nullable Integer httpPutResponseHopLimit;
    /**
     * Indicates whether a signed token header is required for instance metadata retrieval requests. The values affect the response as follows:
     * 
     */
    private final @Nullable InfrastructureConfigurationInstanceMetadataOptionsHttpTokens httpTokens;

    @OutputCustomType.Constructor({"httpPutResponseHopLimit","httpTokens"})
    private InfrastructureConfigurationInstanceMetadataOptions(
        @Nullable Integer httpPutResponseHopLimit,
        @Nullable InfrastructureConfigurationInstanceMetadataOptionsHttpTokens httpTokens) {
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
        this.httpTokens = httpTokens;
    }

    /**
     * Limit the number of hops that an instance metadata request can traverse to reach its destination.
     * 
    */
    public Optional<Integer> getHttpPutResponseHopLimit() {
        return Optional.ofNullable(this.httpPutResponseHopLimit);
    }
    /**
     * Indicates whether a signed token header is required for instance metadata retrieval requests. The values affect the response as follows:
     * 
    */
    public Optional<InfrastructureConfigurationInstanceMetadataOptionsHttpTokens> getHttpTokens() {
        return Optional.ofNullable(this.httpTokens);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InfrastructureConfigurationInstanceMetadataOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer httpPutResponseHopLimit;
        private @Nullable InfrastructureConfigurationInstanceMetadataOptionsHttpTokens httpTokens;

        public Builder() {
    	      // Empty
        }

        public Builder(InfrastructureConfigurationInstanceMetadataOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpPutResponseHopLimit = defaults.httpPutResponseHopLimit;
    	      this.httpTokens = defaults.httpTokens;
        }

        public Builder setHttpPutResponseHopLimit(@Nullable Integer httpPutResponseHopLimit) {
            this.httpPutResponseHopLimit = httpPutResponseHopLimit;
            return this;
        }

        public Builder setHttpTokens(@Nullable InfrastructureConfigurationInstanceMetadataOptionsHttpTokens httpTokens) {
            this.httpTokens = httpTokens;
            return this;
        }
        public InfrastructureConfigurationInstanceMetadataOptions build() {
            return new InfrastructureConfigurationInstanceMetadataOptions(httpPutResponseHopLimit, httpTokens);
        }
    }
}
