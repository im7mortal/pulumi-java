// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FleetConfigResponse {
    /**
     * Agones fleet spec. Example spec: `https://agones.dev/site/docs/reference/fleet/`.
     * 
     */
    private final String fleetSpec;
    /**
     * The name of the FleetConfig.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"fleetSpec","name"})
    private FleetConfigResponse(
        String fleetSpec,
        String name) {
        this.fleetSpec = Objects.requireNonNull(fleetSpec);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * Agones fleet spec. Example spec: `https://agones.dev/site/docs/reference/fleet/`.
     * 
    */
    public String getFleetSpec() {
        return this.fleetSpec;
    }
    /**
     * The name of the FleetConfig.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fleetSpec;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fleetSpec = defaults.fleetSpec;
    	      this.name = defaults.name;
        }

        public Builder setFleetSpec(String fleetSpec) {
            this.fleetSpec = Objects.requireNonNull(fleetSpec);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public FleetConfigResponse build() {
            return new FleetConfigResponse(fleetSpec, name);
        }
    }
}
