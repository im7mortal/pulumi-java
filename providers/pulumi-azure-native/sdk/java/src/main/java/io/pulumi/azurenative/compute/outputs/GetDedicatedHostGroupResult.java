// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.DedicatedHostGroupInstanceViewResponse;
import io.pulumi.azurenative.compute.outputs.SubResourceReadOnlyResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDedicatedHostGroupResult {
    private final List<SubResourceReadOnlyResponse> hosts;
    private final String id;
    private final DedicatedHostGroupInstanceViewResponse instanceView;
    private final String location;
    private final String name;
    private final Integer platformFaultDomainCount;
    private final @Nullable Boolean supportAutomaticPlacement;
    private final @Nullable Map<String,String> tags;
    private final String type;
    private final @Nullable List<String> zones;

    @OutputCustomType.Constructor({"hosts","id","instanceView","location","name","platformFaultDomainCount","supportAutomaticPlacement","tags","type","zones"})
    private GetDedicatedHostGroupResult(
        List<SubResourceReadOnlyResponse> hosts,
        String id,
        DedicatedHostGroupInstanceViewResponse instanceView,
        String location,
        String name,
        Integer platformFaultDomainCount,
        @Nullable Boolean supportAutomaticPlacement,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable List<String> zones) {
        this.hosts = Objects.requireNonNull(hosts);
        this.id = Objects.requireNonNull(id);
        this.instanceView = Objects.requireNonNull(instanceView);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.platformFaultDomainCount = Objects.requireNonNull(platformFaultDomainCount);
        this.supportAutomaticPlacement = supportAutomaticPlacement;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.zones = zones;
    }

    public List<SubResourceReadOnlyResponse> getHosts() {
        return this.hosts;
    }
    public String getId() {
        return this.id;
    }
    public DedicatedHostGroupInstanceViewResponse getInstanceView() {
        return this.instanceView;
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }
    public Integer getPlatformFaultDomainCount() {
        return this.platformFaultDomainCount;
    }
    public Optional<Boolean> getSupportAutomaticPlacement() {
        return Optional.ofNullable(this.supportAutomaticPlacement);
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }
    public List<String> getZones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDedicatedHostGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SubResourceReadOnlyResponse> hosts;
        private String id;
        private DedicatedHostGroupInstanceViewResponse instanceView;
        private String location;
        private String name;
        private Integer platformFaultDomainCount;
        private @Nullable Boolean supportAutomaticPlacement;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDedicatedHostGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hosts = defaults.hosts;
    	      this.id = defaults.id;
    	      this.instanceView = defaults.instanceView;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.platformFaultDomainCount = defaults.platformFaultDomainCount;
    	      this.supportAutomaticPlacement = defaults.supportAutomaticPlacement;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.zones = defaults.zones;
        }

        public Builder setHosts(List<SubResourceReadOnlyResponse> hosts) {
            this.hosts = Objects.requireNonNull(hosts);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInstanceView(DedicatedHostGroupInstanceViewResponse instanceView) {
            this.instanceView = Objects.requireNonNull(instanceView);
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

        public Builder setPlatformFaultDomainCount(Integer platformFaultDomainCount) {
            this.platformFaultDomainCount = Objects.requireNonNull(platformFaultDomainCount);
            return this;
        }

        public Builder setSupportAutomaticPlacement(@Nullable Boolean supportAutomaticPlacement) {
            this.supportAutomaticPlacement = supportAutomaticPlacement;
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

        public Builder setZones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }

        public GetDedicatedHostGroupResult build() {
            return new GetDedicatedHostGroupResult(hosts, id, instanceView, location, name, platformFaultDomainCount, supportAutomaticPlacement, tags, type, zones);
        }
    }
}