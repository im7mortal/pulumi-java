// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.container_v1.outputs.MaxPodsConstraintResponse;
import io.pulumi.googlenative.container_v1.outputs.NodeConfigResponse;
import io.pulumi.googlenative.container_v1.outputs.NodeManagementResponse;
import io.pulumi.googlenative.container_v1.outputs.NodeNetworkConfigResponse;
import io.pulumi.googlenative.container_v1.outputs.NodePoolAutoscalingResponse;
import io.pulumi.googlenative.container_v1.outputs.StatusConditionResponse;
import io.pulumi.googlenative.container_v1.outputs.UpgradeSettingsResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class NodePoolResponse {
    /**
     * Autoscaler configuration for this NodePool. Autoscaler is enabled only if a valid configuration is present.
     * 
     */
    private final NodePoolAutoscalingResponse autoscaling;
    /**
     * Which conditions caused the current node pool state.
     * 
     */
    private final List<StatusConditionResponse> conditions;
    /**
     * The node configuration of the pool.
     * 
     */
    private final NodeConfigResponse config;
    /**
     * The initial node count for the pool. You must ensure that your Compute Engine [resource quota](https://cloud.google.com/compute/quotas) is sufficient for this number of instances. You must also have available firewall and routes quota.
     * 
     */
    private final Integer initialNodeCount;
    /**
     * [Output only] The resource URLs of the [managed instance groups](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances) associated with this node pool.
     * 
     */
    private final List<String> instanceGroupUrls;
    /**
     * The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the NodePool's nodes should be located. If this value is unspecified during node pool creation, the [Cluster.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.FIELDS.locations) value will be used, instead. Warning: changing node pool locations will result in nodes being added and/or removed.
     * 
     */
    private final List<String> locations;
    /**
     * NodeManagement configuration for this NodePool.
     * 
     */
    private final NodeManagementResponse management;
    /**
     * The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool.
     * 
     */
    private final MaxPodsConstraintResponse maxPodsConstraint;
    /**
     * The name of the node pool.
     * 
     */
    private final String name;
    /**
     * Networking configuration for this NodePool. If specified, it overrides the cluster-level defaults.
     * 
     */
    private final NodeNetworkConfigResponse networkConfig;
    /**
     * [Output only] The pod CIDR block size per node in this node pool.
     * 
     */
    private final Integer podIpv4CidrSize;
    /**
     * [Output only] Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * [Output only] The status of the nodes in this pool instance.
     * 
     */
    private final String status;
    /**
     * Upgrade settings control disruption and speed of the upgrade.
     * 
     */
    private final UpgradeSettingsResponse upgradeSettings;
    /**
     * The version of the Kubernetes of this node.
     * 
     */
    private final String version;

    @OutputCustomType.Constructor({"autoscaling","conditions","config","initialNodeCount","instanceGroupUrls","locations","management","maxPodsConstraint","name","networkConfig","podIpv4CidrSize","selfLink","status","upgradeSettings","version"})
    private NodePoolResponse(
        NodePoolAutoscalingResponse autoscaling,
        List<StatusConditionResponse> conditions,
        NodeConfigResponse config,
        Integer initialNodeCount,
        List<String> instanceGroupUrls,
        List<String> locations,
        NodeManagementResponse management,
        MaxPodsConstraintResponse maxPodsConstraint,
        String name,
        NodeNetworkConfigResponse networkConfig,
        Integer podIpv4CidrSize,
        String selfLink,
        String status,
        UpgradeSettingsResponse upgradeSettings,
        String version) {
        this.autoscaling = Objects.requireNonNull(autoscaling);
        this.conditions = Objects.requireNonNull(conditions);
        this.config = Objects.requireNonNull(config);
        this.initialNodeCount = Objects.requireNonNull(initialNodeCount);
        this.instanceGroupUrls = Objects.requireNonNull(instanceGroupUrls);
        this.locations = Objects.requireNonNull(locations);
        this.management = Objects.requireNonNull(management);
        this.maxPodsConstraint = Objects.requireNonNull(maxPodsConstraint);
        this.name = Objects.requireNonNull(name);
        this.networkConfig = Objects.requireNonNull(networkConfig);
        this.podIpv4CidrSize = Objects.requireNonNull(podIpv4CidrSize);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.status = Objects.requireNonNull(status);
        this.upgradeSettings = Objects.requireNonNull(upgradeSettings);
        this.version = Objects.requireNonNull(version);
    }

    /**
     * Autoscaler configuration for this NodePool. Autoscaler is enabled only if a valid configuration is present.
     * 
    */
    public NodePoolAutoscalingResponse getAutoscaling() {
        return this.autoscaling;
    }
    /**
     * Which conditions caused the current node pool state.
     * 
    */
    public List<StatusConditionResponse> getConditions() {
        return this.conditions;
    }
    /**
     * The node configuration of the pool.
     * 
    */
    public NodeConfigResponse getConfig() {
        return this.config;
    }
    /**
     * The initial node count for the pool. You must ensure that your Compute Engine [resource quota](https://cloud.google.com/compute/quotas) is sufficient for this number of instances. You must also have available firewall and routes quota.
     * 
    */
    public Integer getInitialNodeCount() {
        return this.initialNodeCount;
    }
    /**
     * [Output only] The resource URLs of the [managed instance groups](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances) associated with this node pool.
     * 
    */
    public List<String> getInstanceGroupUrls() {
        return this.instanceGroupUrls;
    }
    /**
     * The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the NodePool's nodes should be located. If this value is unspecified during node pool creation, the [Cluster.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.FIELDS.locations) value will be used, instead. Warning: changing node pool locations will result in nodes being added and/or removed.
     * 
    */
    public List<String> getLocations() {
        return this.locations;
    }
    /**
     * NodeManagement configuration for this NodePool.
     * 
    */
    public NodeManagementResponse getManagement() {
        return this.management;
    }
    /**
     * The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool.
     * 
    */
    public MaxPodsConstraintResponse getMaxPodsConstraint() {
        return this.maxPodsConstraint;
    }
    /**
     * The name of the node pool.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Networking configuration for this NodePool. If specified, it overrides the cluster-level defaults.
     * 
    */
    public NodeNetworkConfigResponse getNetworkConfig() {
        return this.networkConfig;
    }
    /**
     * [Output only] The pod CIDR block size per node in this node pool.
     * 
    */
    public Integer getPodIpv4CidrSize() {
        return this.podIpv4CidrSize;
    }
    /**
     * [Output only] Server-defined URL for the resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * [Output only] The status of the nodes in this pool instance.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Upgrade settings control disruption and speed of the upgrade.
     * 
    */
    public UpgradeSettingsResponse getUpgradeSettings() {
        return this.upgradeSettings;
    }
    /**
     * The version of the Kubernetes of this node.
     * 
    */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolAutoscalingResponse autoscaling;
        private List<StatusConditionResponse> conditions;
        private NodeConfigResponse config;
        private Integer initialNodeCount;
        private List<String> instanceGroupUrls;
        private List<String> locations;
        private NodeManagementResponse management;
        private MaxPodsConstraintResponse maxPodsConstraint;
        private String name;
        private NodeNetworkConfigResponse networkConfig;
        private Integer podIpv4CidrSize;
        private String selfLink;
        private String status;
        private UpgradeSettingsResponse upgradeSettings;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePoolResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscaling = defaults.autoscaling;
    	      this.conditions = defaults.conditions;
    	      this.config = defaults.config;
    	      this.initialNodeCount = defaults.initialNodeCount;
    	      this.instanceGroupUrls = defaults.instanceGroupUrls;
    	      this.locations = defaults.locations;
    	      this.management = defaults.management;
    	      this.maxPodsConstraint = defaults.maxPodsConstraint;
    	      this.name = defaults.name;
    	      this.networkConfig = defaults.networkConfig;
    	      this.podIpv4CidrSize = defaults.podIpv4CidrSize;
    	      this.selfLink = defaults.selfLink;
    	      this.status = defaults.status;
    	      this.upgradeSettings = defaults.upgradeSettings;
    	      this.version = defaults.version;
        }

        public Builder setAutoscaling(NodePoolAutoscalingResponse autoscaling) {
            this.autoscaling = Objects.requireNonNull(autoscaling);
            return this;
        }

        public Builder setConditions(List<StatusConditionResponse> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }

        public Builder setConfig(NodeConfigResponse config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder setInitialNodeCount(Integer initialNodeCount) {
            this.initialNodeCount = Objects.requireNonNull(initialNodeCount);
            return this;
        }

        public Builder setInstanceGroupUrls(List<String> instanceGroupUrls) {
            this.instanceGroupUrls = Objects.requireNonNull(instanceGroupUrls);
            return this;
        }

        public Builder setLocations(List<String> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }

        public Builder setManagement(NodeManagementResponse management) {
            this.management = Objects.requireNonNull(management);
            return this;
        }

        public Builder setMaxPodsConstraint(MaxPodsConstraintResponse maxPodsConstraint) {
            this.maxPodsConstraint = Objects.requireNonNull(maxPodsConstraint);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetworkConfig(NodeNetworkConfigResponse networkConfig) {
            this.networkConfig = Objects.requireNonNull(networkConfig);
            return this;
        }

        public Builder setPodIpv4CidrSize(Integer podIpv4CidrSize) {
            this.podIpv4CidrSize = Objects.requireNonNull(podIpv4CidrSize);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setUpgradeSettings(UpgradeSettingsResponse upgradeSettings) {
            this.upgradeSettings = Objects.requireNonNull(upgradeSettings);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public NodePoolResponse build() {
            return new NodePoolResponse(autoscaling, conditions, config, initialNodeCount, instanceGroupUrls, locations, management, maxPodsConstraint, name, networkConfig, podIpv4CidrSize, selfLink, status, upgradeSettings, version);
        }
    }
}
