// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.inputs;

import io.pulumi.awsnative.gamelift.inputs.FleetLocationCapacity;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A remote location where a multi-location fleet can deploy EC2 instances for game hosting.
 * 
 */
public final class FleetLocationConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final FleetLocationConfiguration Empty = new FleetLocationConfiguration();

    @InputImport(name="location", required=true)
    private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="locationCapacity")
    private final @Nullable FleetLocationCapacity locationCapacity;

    public Optional<FleetLocationCapacity> getLocationCapacity() {
        return this.locationCapacity == null ? Optional.empty() : Optional.ofNullable(this.locationCapacity);
    }

    public FleetLocationConfiguration(
        String location,
        @Nullable FleetLocationCapacity locationCapacity) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.locationCapacity = locationCapacity;
    }

    private FleetLocationConfiguration() {
        this.location = null;
        this.locationCapacity = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetLocationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable FleetLocationCapacity locationCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetLocationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.locationCapacity = defaults.locationCapacity;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setLocationCapacity(@Nullable FleetLocationCapacity locationCapacity) {
            this.locationCapacity = locationCapacity;
            return this;
        }

        public FleetLocationConfiguration build() {
            return new FleetLocationConfiguration(location, locationCapacity);
        }
    }
}
