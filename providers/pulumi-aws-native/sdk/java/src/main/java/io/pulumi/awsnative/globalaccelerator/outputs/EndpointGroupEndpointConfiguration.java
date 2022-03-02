// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.globalaccelerator.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EndpointGroupEndpointConfiguration {
    /**
     * true if client ip should be preserved
     * 
     */
    private final @Nullable Boolean clientIPPreservationEnabled;
    /**
     * Id of the endpoint. For Network/Application Load Balancer this value is the ARN.  For EIP, this value is the allocation ID.  For EC2 instances, this is the EC2 instance ID
     * 
     */
    private final String endpointId;
    /**
     * The weight for the endpoint.
     * 
     */
    private final @Nullable Integer weight;

    @OutputCustomType.Constructor({"clientIPPreservationEnabled","endpointId","weight"})
    private EndpointGroupEndpointConfiguration(
        @Nullable Boolean clientIPPreservationEnabled,
        String endpointId,
        @Nullable Integer weight) {
        this.clientIPPreservationEnabled = clientIPPreservationEnabled;
        this.endpointId = Objects.requireNonNull(endpointId);
        this.weight = weight;
    }

    /**
     * true if client ip should be preserved
     * 
    */
    public Optional<Boolean> getClientIPPreservationEnabled() {
        return Optional.ofNullable(this.clientIPPreservationEnabled);
    }
    /**
     * Id of the endpoint. For Network/Application Load Balancer this value is the ARN.  For EIP, this value is the allocation ID.  For EC2 instances, this is the EC2 instance ID
     * 
    */
    public String getEndpointId() {
        return this.endpointId;
    }
    /**
     * The weight for the endpoint.
     * 
    */
    public Optional<Integer> getWeight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointGroupEndpointConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean clientIPPreservationEnabled;
        private String endpointId;
        private @Nullable Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointGroupEndpointConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientIPPreservationEnabled = defaults.clientIPPreservationEnabled;
    	      this.endpointId = defaults.endpointId;
    	      this.weight = defaults.weight;
        }

        public Builder setClientIPPreservationEnabled(@Nullable Boolean clientIPPreservationEnabled) {
            this.clientIPPreservationEnabled = clientIPPreservationEnabled;
            return this;
        }

        public Builder setEndpointId(String endpointId) {
            this.endpointId = Objects.requireNonNull(endpointId);
            return this;
        }

        public Builder setWeight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }
        public EndpointGroupEndpointConfiguration build() {
            return new EndpointGroupEndpointConfiguration(clientIPPreservationEnabled, endpointId, weight);
        }
    }
}
