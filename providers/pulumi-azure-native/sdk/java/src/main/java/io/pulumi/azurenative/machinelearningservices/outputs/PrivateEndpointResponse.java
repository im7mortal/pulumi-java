// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PrivateEndpointResponse {
    /**
     * The ARM identifier for Private Endpoint
     * 
     */
    private final String id;
    /**
     * The ARM identifier for Subnet resource that private endpoint links to
     * 
     */
    private final String subnetArmId;

    @OutputCustomType.Constructor({"id","subnetArmId"})
    private PrivateEndpointResponse(
        String id,
        String subnetArmId) {
        this.id = Objects.requireNonNull(id);
        this.subnetArmId = Objects.requireNonNull(subnetArmId);
    }

    /**
     * The ARM identifier for Private Endpoint
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The ARM identifier for Subnet resource that private endpoint links to
     * 
    */
    public String getSubnetArmId() {
        return this.subnetArmId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String subnetArmId;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.subnetArmId = defaults.subnetArmId;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setSubnetArmId(String subnetArmId) {
            this.subnetArmId = Objects.requireNonNull(subnetArmId);
            return this;
        }
        public PrivateEndpointResponse build() {
            return new PrivateEndpointResponse(id, subnetArmId);
        }
    }
}
