// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.discovery.k8s.io_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.discovery.k8s.io_v1.outputs.ForZone;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class EndpointHints {
    /**
     * forZones indicates the zone(s) this endpoint should be consumed by to enable topology aware routing.
     * 
     */
    private final @Nullable List<ForZone> forZones;

    @CustomType.Constructor
    private EndpointHints(@CustomType.Parameter("forZones") @Nullable List<ForZone> forZones) {
        this.forZones = forZones;
    }

    /**
     * forZones indicates the zone(s) this endpoint should be consumed by to enable topology aware routing.
     * 
    */
    public List<ForZone> forZones() {
        return this.forZones == null ? List.of() : this.forZones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointHints defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ForZone> forZones;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointHints defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forZones = defaults.forZones;
        }

        public Builder forZones(@Nullable List<ForZone> forZones) {
            this.forZones = forZones;
            return this;
        }
        public Builder forZones(ForZone... forZones) {
            return forZones(List.of(forZones));
        }        public EndpointHints build() {
            return new EndpointHints(forZones);
        }
    }
}
