// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.memcache_v1beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.memcache_v1beta2.outputs.GoogleCloudMemcacheV1beta2MaintenancePolicyResponse;
import com.pulumi.googlenative.memcache_v1beta2.outputs.InstanceMessageResponse;
import com.pulumi.googlenative.memcache_v1beta2.outputs.MaintenanceScheduleResponse;
import com.pulumi.googlenative.memcache_v1beta2.outputs.MemcacheParametersResponse;
import com.pulumi.googlenative.memcache_v1beta2.outputs.NodeConfigResponse;
import com.pulumi.googlenative.memcache_v1beta2.outputs.NodeResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetInstanceResult {
    /**
     * @return The full name of the Google Compute Engine [network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected. If left unspecified, the `default` network will be used.
     * 
     */
    private final String authorizedNetwork;
    /**
     * @return The time the instance was created.
     * 
     */
    private final String createTime;
    /**
     * @return Endpoint for the Discovery API.
     * 
     */
    private final String discoveryEndpoint;
    /**
     * @return User provided name for the instance, which is only used for display purposes. Cannot be more than 80 characters.
     * 
     */
    private final String displayName;
    /**
     * @return List of messages that describe the current state of the Memcached instance.
     * 
     */
    private final List<InstanceMessageResponse> instanceMessages;
    /**
     * @return Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return The maintenance policy for the instance. If not provided, the maintenance event will be performed based on Memorystore internal rollout schedule.
     * 
     */
    private final GoogleCloudMemcacheV1beta2MaintenancePolicyResponse maintenancePolicy;
    /**
     * @return Published maintenance schedule.
     * 
     */
    private final MaintenanceScheduleResponse maintenanceSchedule;
    /**
     * @return The full version of memcached server running on this instance. System automatically determines the full memcached version for an instance based on the input MemcacheVersion. The full version format will be &#34;memcached-1.5.16&#34;.
     * 
     */
    private final String memcacheFullVersion;
    /**
     * @return List of Memcached nodes. Refer to Node message for more details.
     * 
     */
    private final List<NodeResponse> memcacheNodes;
    /**
     * @return The major version of Memcached software. If not provided, latest supported version will be used. Currently the latest supported major version is `MEMCACHE_1_5`. The minor version will be automatically determined by our system based on the latest supported minor version.
     * 
     */
    private final String memcacheVersion;
    /**
     * @return Unique name of the resource in this scope including project and location using the form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` Note: Memcached instances are managed and addressed at the regional level so `location_id` here refers to a Google Cloud region; however, users may choose which zones Memcached nodes should be provisioned in within an instance. Refer to zones field for more details.
     * 
     */
    private final String name;
    /**
     * @return Configuration for Memcached nodes.
     * 
     */
    private final NodeConfigResponse nodeConfig;
    /**
     * @return Number of nodes in the Memcached instance.
     * 
     */
    private final Integer nodeCount;
    /**
     * @return User defined parameters to apply to the memcached process on each node.
     * 
     */
    private final MemcacheParametersResponse parameters;
    /**
     * @return The state of this Memcached instance.
     * 
     */
    private final String state;
    /**
     * @return Returns true if there is an update waiting to be applied
     * 
     */
    private final Boolean updateAvailable;
    /**
     * @return The time the instance was updated.
     * 
     */
    private final String updateTime;
    /**
     * @return Zones in which Memcached nodes should be provisioned. Memcached nodes will be equally distributed across these zones. If not provided, the service will by default create nodes in all zones in the region for the instance.
     * 
     */
    private final List<String> zones;

    @CustomType.Constructor
    private GetInstanceResult(
        @CustomType.Parameter("authorizedNetwork") String authorizedNetwork,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("discoveryEndpoint") String discoveryEndpoint,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("instanceMessages") List<InstanceMessageResponse> instanceMessages,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("maintenancePolicy") GoogleCloudMemcacheV1beta2MaintenancePolicyResponse maintenancePolicy,
        @CustomType.Parameter("maintenanceSchedule") MaintenanceScheduleResponse maintenanceSchedule,
        @CustomType.Parameter("memcacheFullVersion") String memcacheFullVersion,
        @CustomType.Parameter("memcacheNodes") List<NodeResponse> memcacheNodes,
        @CustomType.Parameter("memcacheVersion") String memcacheVersion,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nodeConfig") NodeConfigResponse nodeConfig,
        @CustomType.Parameter("nodeCount") Integer nodeCount,
        @CustomType.Parameter("parameters") MemcacheParametersResponse parameters,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("updateAvailable") Boolean updateAvailable,
        @CustomType.Parameter("updateTime") String updateTime,
        @CustomType.Parameter("zones") List<String> zones) {
        this.authorizedNetwork = authorizedNetwork;
        this.createTime = createTime;
        this.discoveryEndpoint = discoveryEndpoint;
        this.displayName = displayName;
        this.instanceMessages = instanceMessages;
        this.labels = labels;
        this.maintenancePolicy = maintenancePolicy;
        this.maintenanceSchedule = maintenanceSchedule;
        this.memcacheFullVersion = memcacheFullVersion;
        this.memcacheNodes = memcacheNodes;
        this.memcacheVersion = memcacheVersion;
        this.name = name;
        this.nodeConfig = nodeConfig;
        this.nodeCount = nodeCount;
        this.parameters = parameters;
        this.state = state;
        this.updateAvailable = updateAvailable;
        this.updateTime = updateTime;
        this.zones = zones;
    }

    /**
     * @return The full name of the Google Compute Engine [network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected. If left unspecified, the `default` network will be used.
     * 
     */
    public String authorizedNetwork() {
        return this.authorizedNetwork;
    }
    /**
     * @return The time the instance was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Endpoint for the Discovery API.
     * 
     */
    public String discoveryEndpoint() {
        return this.discoveryEndpoint;
    }
    /**
     * @return User provided name for the instance, which is only used for display purposes. Cannot be more than 80 characters.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return List of messages that describe the current state of the Memcached instance.
     * 
     */
    public List<InstanceMessageResponse> instanceMessages() {
        return this.instanceMessages;
    }
    /**
     * @return Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The maintenance policy for the instance. If not provided, the maintenance event will be performed based on Memorystore internal rollout schedule.
     * 
     */
    public GoogleCloudMemcacheV1beta2MaintenancePolicyResponse maintenancePolicy() {
        return this.maintenancePolicy;
    }
    /**
     * @return Published maintenance schedule.
     * 
     */
    public MaintenanceScheduleResponse maintenanceSchedule() {
        return this.maintenanceSchedule;
    }
    /**
     * @return The full version of memcached server running on this instance. System automatically determines the full memcached version for an instance based on the input MemcacheVersion. The full version format will be &#34;memcached-1.5.16&#34;.
     * 
     */
    public String memcacheFullVersion() {
        return this.memcacheFullVersion;
    }
    /**
     * @return List of Memcached nodes. Refer to Node message for more details.
     * 
     */
    public List<NodeResponse> memcacheNodes() {
        return this.memcacheNodes;
    }
    /**
     * @return The major version of Memcached software. If not provided, latest supported version will be used. Currently the latest supported major version is `MEMCACHE_1_5`. The minor version will be automatically determined by our system based on the latest supported minor version.
     * 
     */
    public String memcacheVersion() {
        return this.memcacheVersion;
    }
    /**
     * @return Unique name of the resource in this scope including project and location using the form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` Note: Memcached instances are managed and addressed at the regional level so `location_id` here refers to a Google Cloud region; however, users may choose which zones Memcached nodes should be provisioned in within an instance. Refer to zones field for more details.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Configuration for Memcached nodes.
     * 
     */
    public NodeConfigResponse nodeConfig() {
        return this.nodeConfig;
    }
    /**
     * @return Number of nodes in the Memcached instance.
     * 
     */
    public Integer nodeCount() {
        return this.nodeCount;
    }
    /**
     * @return User defined parameters to apply to the memcached process on each node.
     * 
     */
    public MemcacheParametersResponse parameters() {
        return this.parameters;
    }
    /**
     * @return The state of this Memcached instance.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Returns true if there is an update waiting to be applied
     * 
     */
    public Boolean updateAvailable() {
        return this.updateAvailable;
    }
    /**
     * @return The time the instance was updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }
    /**
     * @return Zones in which Memcached nodes should be provisioned. Memcached nodes will be equally distributed across these zones. If not provided, the service will by default create nodes in all zones in the region for the instance.
     * 
     */
    public List<String> zones() {
        return this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizedNetwork;
        private String createTime;
        private String discoveryEndpoint;
        private String displayName;
        private List<InstanceMessageResponse> instanceMessages;
        private Map<String,String> labels;
        private GoogleCloudMemcacheV1beta2MaintenancePolicyResponse maintenancePolicy;
        private MaintenanceScheduleResponse maintenanceSchedule;
        private String memcacheFullVersion;
        private List<NodeResponse> memcacheNodes;
        private String memcacheVersion;
        private String name;
        private NodeConfigResponse nodeConfig;
        private Integer nodeCount;
        private MemcacheParametersResponse parameters;
        private String state;
        private Boolean updateAvailable;
        private String updateTime;
        private List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedNetwork = defaults.authorizedNetwork;
    	      this.createTime = defaults.createTime;
    	      this.discoveryEndpoint = defaults.discoveryEndpoint;
    	      this.displayName = defaults.displayName;
    	      this.instanceMessages = defaults.instanceMessages;
    	      this.labels = defaults.labels;
    	      this.maintenancePolicy = defaults.maintenancePolicy;
    	      this.maintenanceSchedule = defaults.maintenanceSchedule;
    	      this.memcacheFullVersion = defaults.memcacheFullVersion;
    	      this.memcacheNodes = defaults.memcacheNodes;
    	      this.memcacheVersion = defaults.memcacheVersion;
    	      this.name = defaults.name;
    	      this.nodeConfig = defaults.nodeConfig;
    	      this.nodeCount = defaults.nodeCount;
    	      this.parameters = defaults.parameters;
    	      this.state = defaults.state;
    	      this.updateAvailable = defaults.updateAvailable;
    	      this.updateTime = defaults.updateTime;
    	      this.zones = defaults.zones;
        }

        public Builder authorizedNetwork(String authorizedNetwork) {
            this.authorizedNetwork = Objects.requireNonNull(authorizedNetwork);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder discoveryEndpoint(String discoveryEndpoint) {
            this.discoveryEndpoint = Objects.requireNonNull(discoveryEndpoint);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder instanceMessages(List<InstanceMessageResponse> instanceMessages) {
            this.instanceMessages = Objects.requireNonNull(instanceMessages);
            return this;
        }
        public Builder instanceMessages(InstanceMessageResponse... instanceMessages) {
            return instanceMessages(List.of(instanceMessages));
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder maintenancePolicy(GoogleCloudMemcacheV1beta2MaintenancePolicyResponse maintenancePolicy) {
            this.maintenancePolicy = Objects.requireNonNull(maintenancePolicy);
            return this;
        }
        public Builder maintenanceSchedule(MaintenanceScheduleResponse maintenanceSchedule) {
            this.maintenanceSchedule = Objects.requireNonNull(maintenanceSchedule);
            return this;
        }
        public Builder memcacheFullVersion(String memcacheFullVersion) {
            this.memcacheFullVersion = Objects.requireNonNull(memcacheFullVersion);
            return this;
        }
        public Builder memcacheNodes(List<NodeResponse> memcacheNodes) {
            this.memcacheNodes = Objects.requireNonNull(memcacheNodes);
            return this;
        }
        public Builder memcacheNodes(NodeResponse... memcacheNodes) {
            return memcacheNodes(List.of(memcacheNodes));
        }
        public Builder memcacheVersion(String memcacheVersion) {
            this.memcacheVersion = Objects.requireNonNull(memcacheVersion);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nodeConfig(NodeConfigResponse nodeConfig) {
            this.nodeConfig = Objects.requireNonNull(nodeConfig);
            return this;
        }
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = Objects.requireNonNull(nodeCount);
            return this;
        }
        public Builder parameters(MemcacheParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder updateAvailable(Boolean updateAvailable) {
            this.updateAvailable = Objects.requireNonNull(updateAvailable);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public Builder zones(List<String> zones) {
            this.zones = Objects.requireNonNull(zones);
            return this;
        }
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }        public GetInstanceResult build() {
            return new GetInstanceResult(authorizedNetwork, createTime, discoveryEndpoint, displayName, instanceMessages, labels, maintenancePolicy, maintenanceSchedule, memcacheFullVersion, memcacheNodes, memcacheVersion, name, nodeConfig, nodeCount, parameters, state, updateAvailable, updateTime, zones);
        }
    }
}
