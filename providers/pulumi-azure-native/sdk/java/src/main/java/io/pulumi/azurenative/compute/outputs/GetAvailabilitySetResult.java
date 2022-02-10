// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.InstanceViewStatusResponse;
import io.pulumi.azurenative.compute.outputs.SkuResponse;
import io.pulumi.azurenative.compute.outputs.SubResourceResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAvailabilitySetResult {
    private final String id;
    private final String location;
    private final String name;
    private final @Nullable Integer platformFaultDomainCount;
    private final @Nullable Integer platformUpdateDomainCount;
    private final @Nullable SubResourceResponse proximityPlacementGroup;
    private final @Nullable SkuResponse sku;
    private final List<InstanceViewStatusResponse> statuses;
    private final @Nullable Map<String,String> tags;
    private final String type;
    private final @Nullable List<SubResourceResponse> virtualMachines;

    @OutputCustomType.Constructor({"id","location","name","platformFaultDomainCount","platformUpdateDomainCount","proximityPlacementGroup","sku","statuses","tags","type","virtualMachines"})
    private GetAvailabilitySetResult(
        String id,
        String location,
        String name,
        @Nullable Integer platformFaultDomainCount,
        @Nullable Integer platformUpdateDomainCount,
        @Nullable SubResourceResponse proximityPlacementGroup,
        @Nullable SkuResponse sku,
        List<InstanceViewStatusResponse> statuses,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable List<SubResourceResponse> virtualMachines) {
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.platformFaultDomainCount = platformFaultDomainCount;
        this.platformUpdateDomainCount = platformUpdateDomainCount;
        this.proximityPlacementGroup = proximityPlacementGroup;
        this.sku = sku;
        this.statuses = Objects.requireNonNull(statuses);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.virtualMachines = virtualMachines;
    }

    public String getId() {
        return this.id;
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }
    public Optional<Integer> getPlatformFaultDomainCount() {
        return Optional.ofNullable(this.platformFaultDomainCount);
    }
    public Optional<Integer> getPlatformUpdateDomainCount() {
        return Optional.ofNullable(this.platformUpdateDomainCount);
    }
    public Optional<SubResourceResponse> getProximityPlacementGroup() {
        return Optional.ofNullable(this.proximityPlacementGroup);
    }
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    public List<InstanceViewStatusResponse> getStatuses() {
        return this.statuses;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }
    public List<SubResourceResponse> getVirtualMachines() {
        return this.virtualMachines == null ? List.of() : this.virtualMachines;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAvailabilitySetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String location;
        private String name;
        private @Nullable Integer platformFaultDomainCount;
        private @Nullable Integer platformUpdateDomainCount;
        private @Nullable SubResourceResponse proximityPlacementGroup;
        private @Nullable SkuResponse sku;
        private List<InstanceViewStatusResponse> statuses;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable List<SubResourceResponse> virtualMachines;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAvailabilitySetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.platformFaultDomainCount = defaults.platformFaultDomainCount;
    	      this.platformUpdateDomainCount = defaults.platformUpdateDomainCount;
    	      this.proximityPlacementGroup = defaults.proximityPlacementGroup;
    	      this.sku = defaults.sku;
    	      this.statuses = defaults.statuses;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.virtualMachines = defaults.virtualMachines;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPlatformFaultDomainCount(@Nullable Integer platformFaultDomainCount) {
            this.platformFaultDomainCount = platformFaultDomainCount;
            return this;
        }

        public Builder setPlatformUpdateDomainCount(@Nullable Integer platformUpdateDomainCount) {
            this.platformUpdateDomainCount = platformUpdateDomainCount;
            return this;
        }

        public Builder setProximityPlacementGroup(@Nullable SubResourceResponse proximityPlacementGroup) {
            this.proximityPlacementGroup = proximityPlacementGroup;
            return this;
        }

        public Builder setSku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setStatuses(List<InstanceViewStatusResponse> statuses) {
            this.statuses = Objects.requireNonNull(statuses);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVirtualMachines(@Nullable List<SubResourceResponse> virtualMachines) {
            this.virtualMachines = virtualMachines;
            return this;
        }

        public GetAvailabilitySetResult build() {
            return new GetAvailabilitySetResult(id, location, name, platformFaultDomainCount, platformUpdateDomainCount, proximityPlacementGroup, sku, statuses, tags, type, virtualMachines);
        }
    }
}