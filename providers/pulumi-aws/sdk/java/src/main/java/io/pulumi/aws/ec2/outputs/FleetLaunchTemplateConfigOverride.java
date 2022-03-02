// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FleetLaunchTemplateConfigOverride {
    /**
     * Availability Zone in which to launch the instances.
     * 
     */
    private final @Nullable String availabilityZone;
    /**
     * Instance type.
     * 
     */
    private final @Nullable String instanceType;
    /**
     * Maximum price per unit hour that you are willing to pay for a Spot Instance.
     * 
     */
    private final @Nullable String maxPrice;
    /**
     * Priority for the launch template override. If `on_demand_options` `allocation_strategy` is set to `prioritized`, EC2 Fleet uses priority to determine which launch template override to use first in fulfilling On-Demand capacity. The highest priority is launched first. The lower the number, the higher the priority. If no number is set, the launch template override has the lowest priority. Valid values are whole numbers starting at 0.
     * 
     */
    private final @Nullable Double priority;
    /**
     * ID of the subnet in which to launch the instances.
     * 
     */
    private final @Nullable String subnetId;
    /**
     * Number of units provided by the specified instance type.
     * 
     */
    private final @Nullable Double weightedCapacity;

    @OutputCustomType.Constructor({"availabilityZone","instanceType","maxPrice","priority","subnetId","weightedCapacity"})
    private FleetLaunchTemplateConfigOverride(
        @Nullable String availabilityZone,
        @Nullable String instanceType,
        @Nullable String maxPrice,
        @Nullable Double priority,
        @Nullable String subnetId,
        @Nullable Double weightedCapacity) {
        this.availabilityZone = availabilityZone;
        this.instanceType = instanceType;
        this.maxPrice = maxPrice;
        this.priority = priority;
        this.subnetId = subnetId;
        this.weightedCapacity = weightedCapacity;
    }

    /**
     * Availability Zone in which to launch the instances.
     * 
    */
    public Optional<String> getAvailabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }
    /**
     * Instance type.
     * 
    */
    public Optional<String> getInstanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    /**
     * Maximum price per unit hour that you are willing to pay for a Spot Instance.
     * 
    */
    public Optional<String> getMaxPrice() {
        return Optional.ofNullable(this.maxPrice);
    }
    /**
     * Priority for the launch template override. If `on_demand_options` `allocation_strategy` is set to `prioritized`, EC2 Fleet uses priority to determine which launch template override to use first in fulfilling On-Demand capacity. The highest priority is launched first. The lower the number, the higher the priority. If no number is set, the launch template override has the lowest priority. Valid values are whole numbers starting at 0.
     * 
    */
    public Optional<Double> getPriority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * ID of the subnet in which to launch the instances.
     * 
    */
    public Optional<String> getSubnetId() {
        return Optional.ofNullable(this.subnetId);
    }
    /**
     * Number of units provided by the specified instance type.
     * 
    */
    public Optional<Double> getWeightedCapacity() {
        return Optional.ofNullable(this.weightedCapacity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetLaunchTemplateConfigOverride defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String availabilityZone;
        private @Nullable String instanceType;
        private @Nullable String maxPrice;
        private @Nullable Double priority;
        private @Nullable String subnetId;
        private @Nullable Double weightedCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetLaunchTemplateConfigOverride defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.instanceType = defaults.instanceType;
    	      this.maxPrice = defaults.maxPrice;
    	      this.priority = defaults.priority;
    	      this.subnetId = defaults.subnetId;
    	      this.weightedCapacity = defaults.weightedCapacity;
        }

        public Builder setAvailabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder setInstanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder setMaxPrice(@Nullable String maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }

        public Builder setPriority(@Nullable Double priority) {
            this.priority = priority;
            return this;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder setWeightedCapacity(@Nullable Double weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public FleetLaunchTemplateConfigOverride build() {
            return new FleetLaunchTemplateConfigOverride(availabilityZone, instanceType, maxPrice, priority, subnetId, weightedCapacity);
        }
    }
}
