// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.DnsConfigResponse;
import io.pulumi.azurenative.network.outputs.EndpointResponse;
import io.pulumi.azurenative.network.outputs.MonitorConfigResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetProfileResult {
    /**
     * The list of allowed endpoint record types.
     * 
     */
    private final @Nullable List<String> allowedEndpointRecordTypes;
    /**
     * The DNS settings of the Traffic Manager profile.
     * 
     */
    private final @Nullable DnsConfigResponse dnsConfig;
    /**
     * The list of endpoints in the Traffic Manager profile.
     * 
     */
    private final @Nullable List<EndpointResponse> endpoints;
    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficManagerProfiles/{resourceName}
     * 
     */
    private final @Nullable String id;
    /**
     * The Azure Region where the resource lives
     * 
     */
    private final @Nullable String location;
    /**
     * Maximum number of endpoints to be returned for MultiValue routing type.
     * 
     */
    private final @Nullable Double maxReturn;
    /**
     * The endpoint monitoring settings of the Traffic Manager profile.
     * 
     */
    private final @Nullable MonitorConfigResponse monitorConfig;
    /**
     * The name of the resource
     * 
     */
    private final @Nullable String name;
    /**
     * The status of the Traffic Manager profile.
     * 
     */
    private final @Nullable String profileStatus;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The traffic routing method of the Traffic Manager profile.
     * 
     */
    private final @Nullable String trafficRoutingMethod;
    /**
     * Indicates whether Traffic View is 'Enabled' or 'Disabled' for the Traffic Manager profile. Null, indicates 'Disabled'. Enabling this feature will increase the cost of the Traffic Manage profile.
     * 
     */
    private final @Nullable String trafficViewEnrollmentStatus;
    /**
     * The type of the resource. Ex- Microsoft.Network/trafficManagerProfiles.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"allowedEndpointRecordTypes","dnsConfig","endpoints","id","location","maxReturn","monitorConfig","name","profileStatus","tags","trafficRoutingMethod","trafficViewEnrollmentStatus","type"})
    private GetProfileResult(
        @Nullable List<String> allowedEndpointRecordTypes,
        @Nullable DnsConfigResponse dnsConfig,
        @Nullable List<EndpointResponse> endpoints,
        @Nullable String id,
        @Nullable String location,
        @Nullable Double maxReturn,
        @Nullable MonitorConfigResponse monitorConfig,
        @Nullable String name,
        @Nullable String profileStatus,
        @Nullable Map<String,String> tags,
        @Nullable String trafficRoutingMethod,
        @Nullable String trafficViewEnrollmentStatus,
        @Nullable String type) {
        this.allowedEndpointRecordTypes = allowedEndpointRecordTypes;
        this.dnsConfig = dnsConfig;
        this.endpoints = endpoints;
        this.id = id;
        this.location = location;
        this.maxReturn = maxReturn;
        this.monitorConfig = monitorConfig;
        this.name = name;
        this.profileStatus = profileStatus;
        this.tags = tags;
        this.trafficRoutingMethod = trafficRoutingMethod;
        this.trafficViewEnrollmentStatus = trafficViewEnrollmentStatus;
        this.type = type;
    }

    /**
     * The list of allowed endpoint record types.
     * 
    */
    public List<String> getAllowedEndpointRecordTypes() {
        return this.allowedEndpointRecordTypes == null ? List.of() : this.allowedEndpointRecordTypes;
    }
    /**
     * The DNS settings of the Traffic Manager profile.
     * 
    */
    public Optional<DnsConfigResponse> getDnsConfig() {
        return Optional.ofNullable(this.dnsConfig);
    }
    /**
     * The list of endpoints in the Traffic Manager profile.
     * 
    */
    public List<EndpointResponse> getEndpoints() {
        return this.endpoints == null ? List.of() : this.endpoints;
    }
    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficManagerProfiles/{resourceName}
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The Azure Region where the resource lives
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Maximum number of endpoints to be returned for MultiValue routing type.
     * 
    */
    public Optional<Double> getMaxReturn() {
        return Optional.ofNullable(this.maxReturn);
    }
    /**
     * The endpoint monitoring settings of the Traffic Manager profile.
     * 
    */
    public Optional<MonitorConfigResponse> getMonitorConfig() {
        return Optional.ofNullable(this.monitorConfig);
    }
    /**
     * The name of the resource
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The status of the Traffic Manager profile.
     * 
    */
    public Optional<String> getProfileStatus() {
        return Optional.ofNullable(this.profileStatus);
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The traffic routing method of the Traffic Manager profile.
     * 
    */
    public Optional<String> getTrafficRoutingMethod() {
        return Optional.ofNullable(this.trafficRoutingMethod);
    }
    /**
     * Indicates whether Traffic View is 'Enabled' or 'Disabled' for the Traffic Manager profile. Null, indicates 'Disabled'. Enabling this feature will increase the cost of the Traffic Manage profile.
     * 
    */
    public Optional<String> getTrafficViewEnrollmentStatus() {
        return Optional.ofNullable(this.trafficViewEnrollmentStatus);
    }
    /**
     * The type of the resource. Ex- Microsoft.Network/trafficManagerProfiles.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProfileResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedEndpointRecordTypes;
        private @Nullable DnsConfigResponse dnsConfig;
        private @Nullable List<EndpointResponse> endpoints;
        private @Nullable String id;
        private @Nullable String location;
        private @Nullable Double maxReturn;
        private @Nullable MonitorConfigResponse monitorConfig;
        private @Nullable String name;
        private @Nullable String profileStatus;
        private @Nullable Map<String,String> tags;
        private @Nullable String trafficRoutingMethod;
        private @Nullable String trafficViewEnrollmentStatus;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedEndpointRecordTypes = defaults.allowedEndpointRecordTypes;
    	      this.dnsConfig = defaults.dnsConfig;
    	      this.endpoints = defaults.endpoints;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.maxReturn = defaults.maxReturn;
    	      this.monitorConfig = defaults.monitorConfig;
    	      this.name = defaults.name;
    	      this.profileStatus = defaults.profileStatus;
    	      this.tags = defaults.tags;
    	      this.trafficRoutingMethod = defaults.trafficRoutingMethod;
    	      this.trafficViewEnrollmentStatus = defaults.trafficViewEnrollmentStatus;
    	      this.type = defaults.type;
        }

        public Builder setAllowedEndpointRecordTypes(@Nullable List<String> allowedEndpointRecordTypes) {
            this.allowedEndpointRecordTypes = allowedEndpointRecordTypes;
            return this;
        }

        public Builder setDnsConfig(@Nullable DnsConfigResponse dnsConfig) {
            this.dnsConfig = dnsConfig;
            return this;
        }

        public Builder setEndpoints(@Nullable List<EndpointResponse> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setMaxReturn(@Nullable Double maxReturn) {
            this.maxReturn = maxReturn;
            return this;
        }

        public Builder setMonitorConfig(@Nullable MonitorConfigResponse monitorConfig) {
            this.monitorConfig = monitorConfig;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProfileStatus(@Nullable String profileStatus) {
            this.profileStatus = profileStatus;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTrafficRoutingMethod(@Nullable String trafficRoutingMethod) {
            this.trafficRoutingMethod = trafficRoutingMethod;
            return this;
        }

        public Builder setTrafficViewEnrollmentStatus(@Nullable String trafficViewEnrollmentStatus) {
            this.trafficViewEnrollmentStatus = trafficViewEnrollmentStatus;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public GetProfileResult build() {
            return new GetProfileResult(allowedEndpointRecordTypes, dnsConfig, endpoints, id, location, maxReturn, monitorConfig, name, profileStatus, tags, trafficRoutingMethod, trafficViewEnrollmentStatus, type);
        }
    }
}
