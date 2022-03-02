// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.container.outputs.GetClusterNodePoolAutoscaling;
import io.pulumi.gcp.container.outputs.GetClusterNodePoolManagement;
import io.pulumi.gcp.container.outputs.GetClusterNodePoolNetworkConfig;
import io.pulumi.gcp.container.outputs.GetClusterNodePoolNodeConfig;
import io.pulumi.gcp.container.outputs.GetClusterNodePoolUpgradeSetting;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetClusterNodePool {
    private final List<GetClusterNodePoolAutoscaling> autoscalings;
    private final Integer initialNodeCount;
    private final List<String> instanceGroupUrls;
    private final List<String> managedInstanceGroupUrls;
    private final List<GetClusterNodePoolManagement> managements;
    private final Integer maxPodsPerNode;
    /**
     * The name of the cluster.
     * 
     */
    private final String name;
    private final String namePrefix;
    private final List<GetClusterNodePoolNetworkConfig> networkConfigs;
    private final List<GetClusterNodePoolNodeConfig> nodeConfigs;
    private final Integer nodeCount;
    private final List<String> nodeLocations;
    private final List<GetClusterNodePoolUpgradeSetting> upgradeSettings;
    private final String version;

    @OutputCustomType.Constructor({"autoscalings","initialNodeCount","instanceGroupUrls","managedInstanceGroupUrls","managements","maxPodsPerNode","name","namePrefix","networkConfigs","nodeConfigs","nodeCount","nodeLocations","upgradeSettings","version"})
    private GetClusterNodePool(
        List<GetClusterNodePoolAutoscaling> autoscalings,
        Integer initialNodeCount,
        List<String> instanceGroupUrls,
        List<String> managedInstanceGroupUrls,
        List<GetClusterNodePoolManagement> managements,
        Integer maxPodsPerNode,
        String name,
        String namePrefix,
        List<GetClusterNodePoolNetworkConfig> networkConfigs,
        List<GetClusterNodePoolNodeConfig> nodeConfigs,
        Integer nodeCount,
        List<String> nodeLocations,
        List<GetClusterNodePoolUpgradeSetting> upgradeSettings,
        String version) {
        this.autoscalings = Objects.requireNonNull(autoscalings);
        this.initialNodeCount = Objects.requireNonNull(initialNodeCount);
        this.instanceGroupUrls = Objects.requireNonNull(instanceGroupUrls);
        this.managedInstanceGroupUrls = Objects.requireNonNull(managedInstanceGroupUrls);
        this.managements = Objects.requireNonNull(managements);
        this.maxPodsPerNode = Objects.requireNonNull(maxPodsPerNode);
        this.name = Objects.requireNonNull(name);
        this.namePrefix = Objects.requireNonNull(namePrefix);
        this.networkConfigs = Objects.requireNonNull(networkConfigs);
        this.nodeConfigs = Objects.requireNonNull(nodeConfigs);
        this.nodeCount = Objects.requireNonNull(nodeCount);
        this.nodeLocations = Objects.requireNonNull(nodeLocations);
        this.upgradeSettings = Objects.requireNonNull(upgradeSettings);
        this.version = Objects.requireNonNull(version);
    }

    public List<GetClusterNodePoolAutoscaling> getAutoscalings() {
        return this.autoscalings;
    }
    public Integer getInitialNodeCount() {
        return this.initialNodeCount;
    }
    public List<String> getInstanceGroupUrls() {
        return this.instanceGroupUrls;
    }
    public List<String> getManagedInstanceGroupUrls() {
        return this.managedInstanceGroupUrls;
    }
    public List<GetClusterNodePoolManagement> getManagements() {
        return this.managements;
    }
    public Integer getMaxPodsPerNode() {
        return this.maxPodsPerNode;
    }
    /**
     * The name of the cluster.
     * 
    */
    public String getName() {
        return this.name;
    }
    public String getNamePrefix() {
        return this.namePrefix;
    }
    public List<GetClusterNodePoolNetworkConfig> getNetworkConfigs() {
        return this.networkConfigs;
    }
    public List<GetClusterNodePoolNodeConfig> getNodeConfigs() {
        return this.nodeConfigs;
    }
    public Integer getNodeCount() {
        return this.nodeCount;
    }
    public List<String> getNodeLocations() {
        return this.nodeLocations;
    }
    public List<GetClusterNodePoolUpgradeSetting> getUpgradeSettings() {
        return this.upgradeSettings;
    }
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodePool defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetClusterNodePoolAutoscaling> autoscalings;
        private Integer initialNodeCount;
        private List<String> instanceGroupUrls;
        private List<String> managedInstanceGroupUrls;
        private List<GetClusterNodePoolManagement> managements;
        private Integer maxPodsPerNode;
        private String name;
        private String namePrefix;
        private List<GetClusterNodePoolNetworkConfig> networkConfigs;
        private List<GetClusterNodePoolNodeConfig> nodeConfigs;
        private Integer nodeCount;
        private List<String> nodeLocations;
        private List<GetClusterNodePoolUpgradeSetting> upgradeSettings;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNodePool defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalings = defaults.autoscalings;
    	      this.initialNodeCount = defaults.initialNodeCount;
    	      this.instanceGroupUrls = defaults.instanceGroupUrls;
    	      this.managedInstanceGroupUrls = defaults.managedInstanceGroupUrls;
    	      this.managements = defaults.managements;
    	      this.maxPodsPerNode = defaults.maxPodsPerNode;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.networkConfigs = defaults.networkConfigs;
    	      this.nodeConfigs = defaults.nodeConfigs;
    	      this.nodeCount = defaults.nodeCount;
    	      this.nodeLocations = defaults.nodeLocations;
    	      this.upgradeSettings = defaults.upgradeSettings;
    	      this.version = defaults.version;
        }

        public Builder setAutoscalings(List<GetClusterNodePoolAutoscaling> autoscalings) {
            this.autoscalings = Objects.requireNonNull(autoscalings);
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

        public Builder setManagedInstanceGroupUrls(List<String> managedInstanceGroupUrls) {
            this.managedInstanceGroupUrls = Objects.requireNonNull(managedInstanceGroupUrls);
            return this;
        }

        public Builder setManagements(List<GetClusterNodePoolManagement> managements) {
            this.managements = Objects.requireNonNull(managements);
            return this;
        }

        public Builder setMaxPodsPerNode(Integer maxPodsPerNode) {
            this.maxPodsPerNode = Objects.requireNonNull(maxPodsPerNode);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNamePrefix(String namePrefix) {
            this.namePrefix = Objects.requireNonNull(namePrefix);
            return this;
        }

        public Builder setNetworkConfigs(List<GetClusterNodePoolNetworkConfig> networkConfigs) {
            this.networkConfigs = Objects.requireNonNull(networkConfigs);
            return this;
        }

        public Builder setNodeConfigs(List<GetClusterNodePoolNodeConfig> nodeConfigs) {
            this.nodeConfigs = Objects.requireNonNull(nodeConfigs);
            return this;
        }

        public Builder setNodeCount(Integer nodeCount) {
            this.nodeCount = Objects.requireNonNull(nodeCount);
            return this;
        }

        public Builder setNodeLocations(List<String> nodeLocations) {
            this.nodeLocations = Objects.requireNonNull(nodeLocations);
            return this;
        }

        public Builder setUpgradeSettings(List<GetClusterNodePoolUpgradeSetting> upgradeSettings) {
            this.upgradeSettings = Objects.requireNonNull(upgradeSettings);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetClusterNodePool build() {
            return new GetClusterNodePool(autoscalings, initialNodeCount, instanceGroupUrls, managedInstanceGroupUrls, managements, maxPodsPerNode, name, namePrefix, networkConfigs, nodeConfigs, nodeCount, nodeLocations, upgradeSettings, version);
        }
    }
}
