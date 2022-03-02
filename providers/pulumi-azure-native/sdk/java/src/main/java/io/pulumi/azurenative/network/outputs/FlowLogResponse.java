// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.FlowLogFormatParametersResponse;
import io.pulumi.azurenative.network.outputs.RetentionPolicyParametersResponse;
import io.pulumi.azurenative.network.outputs.TrafficAnalyticsPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlowLogResponse {
    /**
     * Flag to enable/disable flow logging.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Parameters that define the configuration of traffic analytics.
     * 
     */
    private final @Nullable TrafficAnalyticsPropertiesResponse flowAnalyticsConfiguration;
    /**
     * Parameters that define the flow log format.
     * 
     */
    private final @Nullable FlowLogFormatParametersResponse format;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The provisioning state of the flow log.
     * 
     */
    private final String provisioningState;
    /**
     * Parameters that define the retention policy for flow log.
     * 
     */
    private final @Nullable RetentionPolicyParametersResponse retentionPolicy;
    /**
     * ID of the storage account which is used to store the flow log.
     * 
     */
    private final String storageId;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Guid of network security group to which flow log will be applied.
     * 
     */
    private final String targetResourceGuid;
    /**
     * ID of network security group to which flow log will be applied.
     * 
     */
    private final String targetResourceId;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"enabled","etag","flowAnalyticsConfiguration","format","id","location","name","provisioningState","retentionPolicy","storageId","tags","targetResourceGuid","targetResourceId","type"})
    private FlowLogResponse(
        @Nullable Boolean enabled,
        String etag,
        @Nullable TrafficAnalyticsPropertiesResponse flowAnalyticsConfiguration,
        @Nullable FlowLogFormatParametersResponse format,
        @Nullable String id,
        @Nullable String location,
        String name,
        String provisioningState,
        @Nullable RetentionPolicyParametersResponse retentionPolicy,
        String storageId,
        @Nullable Map<String,String> tags,
        String targetResourceGuid,
        String targetResourceId,
        String type) {
        this.enabled = enabled;
        this.etag = Objects.requireNonNull(etag);
        this.flowAnalyticsConfiguration = flowAnalyticsConfiguration;
        this.format = format;
        this.id = id;
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.retentionPolicy = retentionPolicy;
        this.storageId = Objects.requireNonNull(storageId);
        this.tags = tags;
        this.targetResourceGuid = Objects.requireNonNull(targetResourceGuid);
        this.targetResourceId = Objects.requireNonNull(targetResourceId);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Flag to enable/disable flow logging.
     * 
    */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Parameters that define the configuration of traffic analytics.
     * 
    */
    public Optional<TrafficAnalyticsPropertiesResponse> getFlowAnalyticsConfiguration() {
        return Optional.ofNullable(this.flowAnalyticsConfiguration);
    }
    /**
     * Parameters that define the flow log format.
     * 
    */
    public Optional<FlowLogFormatParametersResponse> getFormat() {
        return Optional.ofNullable(this.format);
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Resource location.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioning state of the flow log.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Parameters that define the retention policy for flow log.
     * 
    */
    public Optional<RetentionPolicyParametersResponse> getRetentionPolicy() {
        return Optional.ofNullable(this.retentionPolicy);
    }
    /**
     * ID of the storage account which is used to store the flow log.
     * 
    */
    public String getStorageId() {
        return this.storageId;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Guid of network security group to which flow log will be applied.
     * 
    */
    public String getTargetResourceGuid() {
        return this.targetResourceGuid;
    }
    /**
     * ID of network security group to which flow log will be applied.
     * 
    */
    public String getTargetResourceId() {
        return this.targetResourceId;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowLogResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private String etag;
        private @Nullable TrafficAnalyticsPropertiesResponse flowAnalyticsConfiguration;
        private @Nullable FlowLogFormatParametersResponse format;
        private @Nullable String id;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private @Nullable RetentionPolicyParametersResponse retentionPolicy;
        private String storageId;
        private @Nullable Map<String,String> tags;
        private String targetResourceGuid;
        private String targetResourceId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowLogResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.etag = defaults.etag;
    	      this.flowAnalyticsConfiguration = defaults.flowAnalyticsConfiguration;
    	      this.format = defaults.format;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.storageId = defaults.storageId;
    	      this.tags = defaults.tags;
    	      this.targetResourceGuid = defaults.targetResourceGuid;
    	      this.targetResourceId = defaults.targetResourceId;
    	      this.type = defaults.type;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setFlowAnalyticsConfiguration(@Nullable TrafficAnalyticsPropertiesResponse flowAnalyticsConfiguration) {
            this.flowAnalyticsConfiguration = flowAnalyticsConfiguration;
            return this;
        }

        public Builder setFormat(@Nullable FlowLogFormatParametersResponse format) {
            this.format = format;
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

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRetentionPolicy(@Nullable RetentionPolicyParametersResponse retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }

        public Builder setStorageId(String storageId) {
            this.storageId = Objects.requireNonNull(storageId);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTargetResourceGuid(String targetResourceGuid) {
            this.targetResourceGuid = Objects.requireNonNull(targetResourceGuid);
            return this;
        }

        public Builder setTargetResourceId(String targetResourceId) {
            this.targetResourceId = Objects.requireNonNull(targetResourceId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public FlowLogResponse build() {
            return new FlowLogResponse(enabled, etag, flowAnalyticsConfiguration, format, id, location, name, provisioningState, retentionPolicy, storageId, tags, targetResourceGuid, targetResourceId, type);
        }
    }
}
