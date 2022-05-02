// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container_v1.inputs.MaxPodsConstraintArgs;
import com.pulumi.googlenative.container_v1.inputs.NodeConfigArgs;
import com.pulumi.googlenative.container_v1.inputs.NodeManagementArgs;
import com.pulumi.googlenative.container_v1.inputs.NodeNetworkConfigArgs;
import com.pulumi.googlenative.container_v1.inputs.NodePoolAutoscalingArgs;
import com.pulumi.googlenative.container_v1.inputs.StatusConditionArgs;
import com.pulumi.googlenative.container_v1.inputs.UpgradeSettingsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodePoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodePoolArgs Empty = new NodePoolArgs();

    /**
     * Autoscaler configuration for this NodePool. Autoscaler is enabled only if a valid configuration is present.
     * 
     */
    @Import(name="autoscaling")
    private @Nullable Output<NodePoolAutoscalingArgs> autoscaling;

    /**
     * @return Autoscaler configuration for this NodePool. Autoscaler is enabled only if a valid configuration is present.
     * 
     */
    public Optional<Output<NodePoolAutoscalingArgs>> autoscaling() {
        return Optional.ofNullable(this.autoscaling);
    }

    /**
     * Deprecated. The name of the cluster. This field has been deprecated and replaced by the parent field.
     * 
     * @deprecated
     * Deprecated. The name of the cluster. This field has been deprecated and replaced by the parent field.
     * 
     */
    @Deprecated /* Deprecated. The name of the cluster. This field has been deprecated and replaced by the parent field. */
    @Import(name="clusterId", required=true)
    private Output<String> clusterId;

    /**
     * @return Deprecated. The name of the cluster. This field has been deprecated and replaced by the parent field.
     * 
     * @deprecated
     * Deprecated. The name of the cluster. This field has been deprecated and replaced by the parent field.
     * 
     */
    @Deprecated /* Deprecated. The name of the cluster. This field has been deprecated and replaced by the parent field. */
    public Output<String> clusterId() {
        return this.clusterId;
    }

    /**
     * Which conditions caused the current node pool state.
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<List<StatusConditionArgs>> conditions;

    /**
     * @return Which conditions caused the current node pool state.
     * 
     */
    public Optional<Output<List<StatusConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    /**
     * The node configuration of the pool.
     * 
     */
    @Import(name="config")
    private @Nullable Output<NodeConfigArgs> config;

    /**
     * @return The node configuration of the pool.
     * 
     */
    public Optional<Output<NodeConfigArgs>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * The initial node count for the pool. You must ensure that your Compute Engine [resource quota](https://cloud.google.com/compute/quotas) is sufficient for this number of instances. You must also have available firewall and routes quota.
     * 
     */
    @Import(name="initialNodeCount")
    private @Nullable Output<Integer> initialNodeCount;

    /**
     * @return The initial node count for the pool. You must ensure that your Compute Engine [resource quota](https://cloud.google.com/compute/quotas) is sufficient for this number of instances. You must also have available firewall and routes quota.
     * 
     */
    public Optional<Output<Integer>> initialNodeCount() {
        return Optional.ofNullable(this.initialNodeCount);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the NodePool&#39;s nodes should be located. If this value is unspecified during node pool creation, the [Cluster.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.FIELDS.locations) value will be used, instead. Warning: changing node pool locations will result in nodes being added and/or removed.
     * 
     */
    @Import(name="locations")
    private @Nullable Output<List<String>> locations;

    /**
     * @return The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the NodePool&#39;s nodes should be located. If this value is unspecified during node pool creation, the [Cluster.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.FIELDS.locations) value will be used, instead. Warning: changing node pool locations will result in nodes being added and/or removed.
     * 
     */
    public Optional<Output<List<String>>> locations() {
        return Optional.ofNullable(this.locations);
    }

    /**
     * NodeManagement configuration for this NodePool.
     * 
     */
    @Import(name="management")
    private @Nullable Output<NodeManagementArgs> management;

    /**
     * @return NodeManagement configuration for this NodePool.
     * 
     */
    public Optional<Output<NodeManagementArgs>> management() {
        return Optional.ofNullable(this.management);
    }

    /**
     * The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool.
     * 
     */
    @Import(name="maxPodsConstraint")
    private @Nullable Output<MaxPodsConstraintArgs> maxPodsConstraint;

    /**
     * @return The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool.
     * 
     */
    public Optional<Output<MaxPodsConstraintArgs>> maxPodsConstraint() {
        return Optional.ofNullable(this.maxPodsConstraint);
    }

    /**
     * The name of the node pool.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the node pool.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Networking configuration for this NodePool. If specified, it overrides the cluster-level defaults.
     * 
     */
    @Import(name="networkConfig")
    private @Nullable Output<NodeNetworkConfigArgs> networkConfig;

    /**
     * @return Networking configuration for this NodePool. If specified, it overrides the cluster-level defaults.
     * 
     */
    public Optional<Output<NodeNetworkConfigArgs>> networkConfig() {
        return Optional.ofNullable(this.networkConfig);
    }

    /**
     * The parent (project, location, cluster name) where the node pool will be created. Specified in the format `projects/*{@literal /}locations/*{@literal /}clusters/*`.
     * 
     */
    @Import(name="parent")
    private @Nullable Output<String> parent;

    /**
     * @return The parent (project, location, cluster name) where the node pool will be created. Specified in the format `projects/*{@literal /}locations/*{@literal /}clusters/*`.
     * 
     */
    public Optional<Output<String>> parent() {
        return Optional.ofNullable(this.parent);
    }

    /**
     * Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the parent field.
     * 
     * @deprecated
     * Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the parent field.
     * 
     */
    @Deprecated /* Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the parent field. */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the parent field.
     * 
     * @deprecated
     * Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the parent field.
     * 
     */
    @Deprecated /* Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the parent field. */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Upgrade settings control disruption and speed of the upgrade.
     * 
     */
    @Import(name="upgradeSettings")
    private @Nullable Output<UpgradeSettingsArgs> upgradeSettings;

    /**
     * @return Upgrade settings control disruption and speed of the upgrade.
     * 
     */
    public Optional<Output<UpgradeSettingsArgs>> upgradeSettings() {
        return Optional.ofNullable(this.upgradeSettings);
    }

    /**
     * The version of the Kubernetes of this node.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The version of the Kubernetes of this node.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    /**
     * Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the parent field.
     * 
     * @deprecated
     * Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the parent field.
     * 
     */
    @Deprecated /* Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the parent field. */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the parent field.
     * 
     * @deprecated
     * Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the parent field.
     * 
     */
    @Deprecated /* Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the parent field. */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private NodePoolArgs() {}

    private NodePoolArgs(NodePoolArgs $) {
        this.autoscaling = $.autoscaling;
        this.clusterId = $.clusterId;
        this.conditions = $.conditions;
        this.config = $.config;
        this.initialNodeCount = $.initialNodeCount;
        this.location = $.location;
        this.locations = $.locations;
        this.management = $.management;
        this.maxPodsConstraint = $.maxPodsConstraint;
        this.name = $.name;
        this.networkConfig = $.networkConfig;
        this.parent = $.parent;
        this.project = $.project;
        this.upgradeSettings = $.upgradeSettings;
        this.version = $.version;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolArgs $;

        public Builder() {
            $ = new NodePoolArgs();
        }

        public Builder(NodePoolArgs defaults) {
            $ = new NodePoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoscaling Autoscaler configuration for this NodePool. Autoscaler is enabled only if a valid configuration is present.
         * 
         * @return builder
         * 
         */
        public Builder autoscaling(@Nullable Output<NodePoolAutoscalingArgs> autoscaling) {
            $.autoscaling = autoscaling;
            return this;
        }

        /**
         * @param autoscaling Autoscaler configuration for this NodePool. Autoscaler is enabled only if a valid configuration is present.
         * 
         * @return builder
         * 
         */
        public Builder autoscaling(NodePoolAutoscalingArgs autoscaling) {
            return autoscaling(Output.of(autoscaling));
        }

        /**
         * @param clusterId Deprecated. The name of the cluster. This field has been deprecated and replaced by the parent field.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated. The name of the cluster. This field has been deprecated and replaced by the parent field.
         * 
         */
        @Deprecated /* Deprecated. The name of the cluster. This field has been deprecated and replaced by the parent field. */
        public Builder clusterId(Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId Deprecated. The name of the cluster. This field has been deprecated and replaced by the parent field.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated. The name of the cluster. This field has been deprecated and replaced by the parent field.
         * 
         */
        @Deprecated /* Deprecated. The name of the cluster. This field has been deprecated and replaced by the parent field. */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param conditions Which conditions caused the current node pool state.
         * 
         * @return builder
         * 
         */
        public Builder conditions(@Nullable Output<List<StatusConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions Which conditions caused the current node pool state.
         * 
         * @return builder
         * 
         */
        public Builder conditions(List<StatusConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param conditions Which conditions caused the current node pool state.
         * 
         * @return builder
         * 
         */
        public Builder conditions(StatusConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        /**
         * @param config The node configuration of the pool.
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable Output<NodeConfigArgs> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config The node configuration of the pool.
         * 
         * @return builder
         * 
         */
        public Builder config(NodeConfigArgs config) {
            return config(Output.of(config));
        }

        /**
         * @param initialNodeCount The initial node count for the pool. You must ensure that your Compute Engine [resource quota](https://cloud.google.com/compute/quotas) is sufficient for this number of instances. You must also have available firewall and routes quota.
         * 
         * @return builder
         * 
         */
        public Builder initialNodeCount(@Nullable Output<Integer> initialNodeCount) {
            $.initialNodeCount = initialNodeCount;
            return this;
        }

        /**
         * @param initialNodeCount The initial node count for the pool. You must ensure that your Compute Engine [resource quota](https://cloud.google.com/compute/quotas) is sufficient for this number of instances. You must also have available firewall and routes quota.
         * 
         * @return builder
         * 
         */
        public Builder initialNodeCount(Integer initialNodeCount) {
            return initialNodeCount(Output.of(initialNodeCount));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param locations The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the NodePool&#39;s nodes should be located. If this value is unspecified during node pool creation, the [Cluster.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.FIELDS.locations) value will be used, instead. Warning: changing node pool locations will result in nodes being added and/or removed.
         * 
         * @return builder
         * 
         */
        public Builder locations(@Nullable Output<List<String>> locations) {
            $.locations = locations;
            return this;
        }

        /**
         * @param locations The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the NodePool&#39;s nodes should be located. If this value is unspecified during node pool creation, the [Cluster.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.FIELDS.locations) value will be used, instead. Warning: changing node pool locations will result in nodes being added and/or removed.
         * 
         * @return builder
         * 
         */
        public Builder locations(List<String> locations) {
            return locations(Output.of(locations));
        }

        /**
         * @param locations The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the NodePool&#39;s nodes should be located. If this value is unspecified during node pool creation, the [Cluster.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.FIELDS.locations) value will be used, instead. Warning: changing node pool locations will result in nodes being added and/or removed.
         * 
         * @return builder
         * 
         */
        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }

        /**
         * @param management NodeManagement configuration for this NodePool.
         * 
         * @return builder
         * 
         */
        public Builder management(@Nullable Output<NodeManagementArgs> management) {
            $.management = management;
            return this;
        }

        /**
         * @param management NodeManagement configuration for this NodePool.
         * 
         * @return builder
         * 
         */
        public Builder management(NodeManagementArgs management) {
            return management(Output.of(management));
        }

        /**
         * @param maxPodsConstraint The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool.
         * 
         * @return builder
         * 
         */
        public Builder maxPodsConstraint(@Nullable Output<MaxPodsConstraintArgs> maxPodsConstraint) {
            $.maxPodsConstraint = maxPodsConstraint;
            return this;
        }

        /**
         * @param maxPodsConstraint The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool.
         * 
         * @return builder
         * 
         */
        public Builder maxPodsConstraint(MaxPodsConstraintArgs maxPodsConstraint) {
            return maxPodsConstraint(Output.of(maxPodsConstraint));
        }

        /**
         * @param name The name of the node pool.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the node pool.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkConfig Networking configuration for this NodePool. If specified, it overrides the cluster-level defaults.
         * 
         * @return builder
         * 
         */
        public Builder networkConfig(@Nullable Output<NodeNetworkConfigArgs> networkConfig) {
            $.networkConfig = networkConfig;
            return this;
        }

        /**
         * @param networkConfig Networking configuration for this NodePool. If specified, it overrides the cluster-level defaults.
         * 
         * @return builder
         * 
         */
        public Builder networkConfig(NodeNetworkConfigArgs networkConfig) {
            return networkConfig(Output.of(networkConfig));
        }

        /**
         * @param parent The parent (project, location, cluster name) where the node pool will be created. Specified in the format `projects/*{@literal /}locations/*{@literal /}clusters/*`.
         * 
         * @return builder
         * 
         */
        public Builder parent(@Nullable Output<String> parent) {
            $.parent = parent;
            return this;
        }

        /**
         * @param parent The parent (project, location, cluster name) where the node pool will be created. Specified in the format `projects/*{@literal /}locations/*{@literal /}clusters/*`.
         * 
         * @return builder
         * 
         */
        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        /**
         * @param project Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the parent field.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the parent field.
         * 
         */
        @Deprecated /* Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the parent field. */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the parent field.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the parent field.
         * 
         */
        @Deprecated /* Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the parent field. */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param upgradeSettings Upgrade settings control disruption and speed of the upgrade.
         * 
         * @return builder
         * 
         */
        public Builder upgradeSettings(@Nullable Output<UpgradeSettingsArgs> upgradeSettings) {
            $.upgradeSettings = upgradeSettings;
            return this;
        }

        /**
         * @param upgradeSettings Upgrade settings control disruption and speed of the upgrade.
         * 
         * @return builder
         * 
         */
        public Builder upgradeSettings(UpgradeSettingsArgs upgradeSettings) {
            return upgradeSettings(Output.of(upgradeSettings));
        }

        /**
         * @param version The version of the Kubernetes of this node.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version of the Kubernetes of this node.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        /**
         * @param zone Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the parent field.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the parent field.
         * 
         */
        @Deprecated /* Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the parent field. */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the parent field.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the parent field.
         * 
         */
        @Deprecated /* Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the parent field. */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public NodePoolArgs build() {
            $.clusterId = Objects.requireNonNull($.clusterId, "expected parameter 'clusterId' to be non-null");
            return $;
        }
    }

}
