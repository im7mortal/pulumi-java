// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceLocation {
    /**
     * The Availability Zone in which to create your instance. Use the following format: us-east-2a (case sensitive). Be sure to add the include Availability Zones parameter to your request.
     * 
     */
    private final @Nullable String availabilityZone;
    /**
     * The Region Name in which to create your instance.
     * 
     */
    private final @Nullable String regionName;

    @OutputCustomType.Constructor({"availabilityZone","regionName"})
    private InstanceLocation(
        @Nullable String availabilityZone,
        @Nullable String regionName) {
        this.availabilityZone = availabilityZone;
        this.regionName = regionName;
    }

    /**
     * The Availability Zone in which to create your instance. Use the following format: us-east-2a (case sensitive). Be sure to add the include Availability Zones parameter to your request.
     * 
     */
    public Optional<String> getAvailabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }
    /**
     * The Region Name in which to create your instance.
     * 
     */
    public Optional<String> getRegionName() {
        return Optional.ofNullable(this.regionName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceLocation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String availabilityZone;
        private @Nullable String regionName;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.regionName = defaults.regionName;
        }

        public Builder setAvailabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder setRegionName(@Nullable String regionName) {
            this.regionName = regionName;
            return this;
        }

        public InstanceLocation build() {
            return new InstanceLocation(availabilityZone, regionName);
        }
    }
}
