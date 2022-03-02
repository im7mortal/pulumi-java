// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerservice.AgentPoolArgs;
import io.pulumi.azurenative.containerservice.outputs.AgentPoolUpgradeSettingsResponse;
import io.pulumi.azurenative.containerservice.outputs.KubeletConfigResponse;
import io.pulumi.azurenative.containerservice.outputs.LinuxOSConfigResponse;
import io.pulumi.azurenative.containerservice.outputs.PowerStateResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Agent Pool.
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:containerservice:AgentPool agentpool1 /subscriptions/subid1/resourcegroups/rg1/providers/Microsoft.ContainerService/managedClusters/clustername1/agentPools/agentpool1 
 * ```
 * 
 */
@ResourceType(type="azure-native:containerservice:AgentPool")
public class AgentPool extends io.pulumi.resources.CustomResource {
    /**
     * Availability zones for nodes. Must use VirtualMachineScaleSets AgentPoolType.
     * 
     */
    @OutputExport(name="availabilityZones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> availabilityZones;

    /**
     * @return Availability zones for nodes. Must use VirtualMachineScaleSets AgentPoolType.
     * 
     */
    public Output</* @Nullable */ List<String>> getAvailabilityZones() {
        return this.availabilityZones;
    }
    /**
     * Number of agents (VMs) to host docker containers. Allowed values must be in the range of 0 to 100 (inclusive) for user pools and in the range of 1 to 100 (inclusive) for system pools. The default value is 1.
     * 
     */
    @OutputExport(name="count", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> count;

    /**
     * @return Number of agents (VMs) to host docker containers. Allowed values must be in the range of 0 to 100 (inclusive) for user pools and in the range of 1 to 100 (inclusive) for system pools. The default value is 1.
     * 
     */
    public Output</* @Nullable */ Integer> getCount() {
        return this.count;
    }
    /**
     * Whether to enable auto-scaler
     * 
     */
    @OutputExport(name="enableAutoScaling", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableAutoScaling;

    /**
     * @return Whether to enable auto-scaler
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableAutoScaling() {
        return this.enableAutoScaling;
    }
    /**
     * Whether to enable EncryptionAtHost
     * 
     */
    @OutputExport(name="enableEncryptionAtHost", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableEncryptionAtHost;

    /**
     * @return Whether to enable EncryptionAtHost
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableEncryptionAtHost() {
        return this.enableEncryptionAtHost;
    }
    /**
     * Whether to use FIPS enabled OS
     * 
     */
    @OutputExport(name="enableFIPS", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableFIPS;

    /**
     * @return Whether to use FIPS enabled OS
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableFIPS() {
        return this.enableFIPS;
    }
    /**
     * Enable public IP for nodes
     * 
     */
    @OutputExport(name="enableNodePublicIP", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableNodePublicIP;

    /**
     * @return Enable public IP for nodes
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableNodePublicIP() {
        return this.enableNodePublicIP;
    }
    /**
     * GPUInstanceProfile to be used to specify GPU MIG instance profile for supported GPU VM SKU. Supported values are MIG1g, MIG2g, MIG3g, MIG4g and MIG7g.
     * 
     */
    @OutputExport(name="gpuInstanceProfile", type=String.class, parameters={})
    private Output</* @Nullable */ String> gpuInstanceProfile;

    /**
     * @return GPUInstanceProfile to be used to specify GPU MIG instance profile for supported GPU VM SKU. Supported values are MIG1g, MIG2g, MIG3g, MIG4g and MIG7g.
     * 
     */
    public Output</* @Nullable */ String> getGpuInstanceProfile() {
        return this.gpuInstanceProfile;
    }
    /**
     * KubeletConfig specifies the configuration of kubelet on agent nodes.
     * 
     */
    @OutputExport(name="kubeletConfig", type=KubeletConfigResponse.class, parameters={})
    private Output</* @Nullable */ KubeletConfigResponse> kubeletConfig;

    /**
     * @return KubeletConfig specifies the configuration of kubelet on agent nodes.
     * 
     */
    public Output</* @Nullable */ KubeletConfigResponse> getKubeletConfig() {
        return this.kubeletConfig;
    }
    /**
     * KubeletDiskType determines the placement of emptyDir volumes, container runtime data root, and Kubelet ephemeral storage. Currently allows one value, OS, resulting in Kubelet using the OS disk for data.
     * 
     */
    @OutputExport(name="kubeletDiskType", type=String.class, parameters={})
    private Output</* @Nullable */ String> kubeletDiskType;

    /**
     * @return KubeletDiskType determines the placement of emptyDir volumes, container runtime data root, and Kubelet ephemeral storage. Currently allows one value, OS, resulting in Kubelet using the OS disk for data.
     * 
     */
    public Output</* @Nullable */ String> getKubeletDiskType() {
        return this.kubeletDiskType;
    }
    /**
     * LinuxOSConfig specifies the OS configuration of linux agent nodes.
     * 
     */
    @OutputExport(name="linuxOSConfig", type=LinuxOSConfigResponse.class, parameters={})
    private Output</* @Nullable */ LinuxOSConfigResponse> linuxOSConfig;

    /**
     * @return LinuxOSConfig specifies the OS configuration of linux agent nodes.
     * 
     */
    public Output</* @Nullable */ LinuxOSConfigResponse> getLinuxOSConfig() {
        return this.linuxOSConfig;
    }
    /**
     * Maximum number of nodes for auto-scaling
     * 
     */
    @OutputExport(name="maxCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxCount;

    /**
     * @return Maximum number of nodes for auto-scaling
     * 
     */
    public Output</* @Nullable */ Integer> getMaxCount() {
        return this.maxCount;
    }
    /**
     * Maximum number of pods that can run on a node.
     * 
     */
    @OutputExport(name="maxPods", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxPods;

    /**
     * @return Maximum number of pods that can run on a node.
     * 
     */
    public Output</* @Nullable */ Integer> getMaxPods() {
        return this.maxPods;
    }
    /**
     * Minimum number of nodes for auto-scaling
     * 
     */
    @OutputExport(name="minCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minCount;

    /**
     * @return Minimum number of nodes for auto-scaling
     * 
     */
    public Output</* @Nullable */ Integer> getMinCount() {
        return this.minCount;
    }
    /**
     * AgentPoolMode represents mode of an agent pool
     * 
     */
    @OutputExport(name="mode", type=String.class, parameters={})
    private Output</* @Nullable */ String> mode;

    /**
     * @return AgentPoolMode represents mode of an agent pool
     * 
     */
    public Output</* @Nullable */ String> getMode() {
        return this.mode;
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Version of node image
     * 
     */
    @OutputExport(name="nodeImageVersion", type=String.class, parameters={})
    private Output<String> nodeImageVersion;

    /**
     * @return Version of node image
     * 
     */
    public Output<String> getNodeImageVersion() {
        return this.nodeImageVersion;
    }
    /**
     * Agent pool node labels to be persisted across all nodes in agent pool.
     * 
     */
    @OutputExport(name="nodeLabels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> nodeLabels;

    /**
     * @return Agent pool node labels to be persisted across all nodes in agent pool.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getNodeLabels() {
        return this.nodeLabels;
    }
    /**
     * Public IP Prefix ID. VM nodes use IPs assigned from this Public IP Prefix.
     * 
     */
    @OutputExport(name="nodePublicIPPrefixID", type=String.class, parameters={})
    private Output</* @Nullable */ String> nodePublicIPPrefixID;

    /**
     * @return Public IP Prefix ID. VM nodes use IPs assigned from this Public IP Prefix.
     * 
     */
    public Output</* @Nullable */ String> getNodePublicIPPrefixID() {
        return this.nodePublicIPPrefixID;
    }
    /**
     * Taints added to new nodes during node pool create and scale. For example, key=value:NoSchedule.
     * 
     */
    @OutputExport(name="nodeTaints", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> nodeTaints;

    /**
     * @return Taints added to new nodes during node pool create and scale. For example, key=value:NoSchedule.
     * 
     */
    public Output</* @Nullable */ List<String>> getNodeTaints() {
        return this.nodeTaints;
    }
    /**
     * Version of orchestrator specified when creating the managed cluster.
     * 
     */
    @OutputExport(name="orchestratorVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> orchestratorVersion;

    /**
     * @return Version of orchestrator specified when creating the managed cluster.
     * 
     */
    public Output</* @Nullable */ String> getOrchestratorVersion() {
        return this.orchestratorVersion;
    }
    /**
     * OS Disk Size in GB to be used to specify the disk size for every machine in this master/agent pool. If you specify 0, it will apply the default osDisk size according to the vmSize specified.
     * 
     */
    @OutputExport(name="osDiskSizeGB", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> osDiskSizeGB;

    /**
     * @return OS Disk Size in GB to be used to specify the disk size for every machine in this master/agent pool. If you specify 0, it will apply the default osDisk size according to the vmSize specified.
     * 
     */
    public Output</* @Nullable */ Integer> getOsDiskSizeGB() {
        return this.osDiskSizeGB;
    }
    /**
     * OS disk type to be used for machines in a given agent pool. Allowed values are 'Ephemeral' and 'Managed'. If unspecified, defaults to 'Ephemeral' when the VM supports ephemeral OS and has a cache disk larger than the requested OSDiskSizeGB. Otherwise, defaults to 'Managed'. May not be changed after creation.
     * 
     */
    @OutputExport(name="osDiskType", type=String.class, parameters={})
    private Output</* @Nullable */ String> osDiskType;

    /**
     * @return OS disk type to be used for machines in a given agent pool. Allowed values are 'Ephemeral' and 'Managed'. If unspecified, defaults to 'Ephemeral' when the VM supports ephemeral OS and has a cache disk larger than the requested OSDiskSizeGB. Otherwise, defaults to 'Managed'. May not be changed after creation.
     * 
     */
    public Output</* @Nullable */ String> getOsDiskType() {
        return this.osDiskType;
    }
    /**
     * OsSKU to be used to specify os sku. Choose from Ubuntu(default) and CBLMariner for Linux OSType. Not applicable to Windows OSType.
     * 
     */
    @OutputExport(name="osSKU", type=String.class, parameters={})
    private Output</* @Nullable */ String> osSKU;

    /**
     * @return OsSKU to be used to specify os sku. Choose from Ubuntu(default) and CBLMariner for Linux OSType. Not applicable to Windows OSType.
     * 
     */
    public Output</* @Nullable */ String> getOsSKU() {
        return this.osSKU;
    }
    /**
     * OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     * 
     */
    @OutputExport(name="osType", type=String.class, parameters={})
    private Output</* @Nullable */ String> osType;

    /**
     * @return OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     * 
     */
    public Output</* @Nullable */ String> getOsType() {
        return this.osType;
    }
    /**
     * Pod SubnetID specifies the VNet's subnet identifier for pods.
     * 
     */
    @OutputExport(name="podSubnetID", type=String.class, parameters={})
    private Output</* @Nullable */ String> podSubnetID;

    /**
     * @return Pod SubnetID specifies the VNet's subnet identifier for pods.
     * 
     */
    public Output</* @Nullable */ String> getPodSubnetID() {
        return this.podSubnetID;
    }
    /**
     * Describes whether the Agent Pool is Running or Stopped
     * 
     */
    @OutputExport(name="powerState", type=PowerStateResponse.class, parameters={})
    private Output<PowerStateResponse> powerState;

    /**
     * @return Describes whether the Agent Pool is Running or Stopped
     * 
     */
    public Output<PowerStateResponse> getPowerState() {
        return this.powerState;
    }
    /**
     * The current deployment or provisioning state, which only appears in the response.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The current deployment or provisioning state, which only appears in the response.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The ID for Proximity Placement Group.
     * 
     */
    @OutputExport(name="proximityPlacementGroupID", type=String.class, parameters={})
    private Output</* @Nullable */ String> proximityPlacementGroupID;

    /**
     * @return The ID for Proximity Placement Group.
     * 
     */
    public Output</* @Nullable */ String> getProximityPlacementGroupID() {
        return this.proximityPlacementGroupID;
    }
    /**
     * ScaleSetEvictionPolicy to be used to specify eviction policy for Spot virtual machine scale set. Default to Delete.
     * 
     */
    @OutputExport(name="scaleSetEvictionPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> scaleSetEvictionPolicy;

    /**
     * @return ScaleSetEvictionPolicy to be used to specify eviction policy for Spot virtual machine scale set. Default to Delete.
     * 
     */
    public Output</* @Nullable */ String> getScaleSetEvictionPolicy() {
        return this.scaleSetEvictionPolicy;
    }
    /**
     * ScaleSetPriority to be used to specify virtual machine scale set priority. Default to regular.
     * 
     */
    @OutputExport(name="scaleSetPriority", type=String.class, parameters={})
    private Output</* @Nullable */ String> scaleSetPriority;

    /**
     * @return ScaleSetPriority to be used to specify virtual machine scale set priority. Default to regular.
     * 
     */
    public Output</* @Nullable */ String> getScaleSetPriority() {
        return this.scaleSetPriority;
    }
    /**
     * SpotMaxPrice to be used to specify the maximum price you are willing to pay in US Dollars. Possible values are any decimal value greater than zero or -1 which indicates default price to be up-to on-demand.
     * 
     */
    @OutputExport(name="spotMaxPrice", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> spotMaxPrice;

    /**
     * @return SpotMaxPrice to be used to specify the maximum price you are willing to pay in US Dollars. Possible values are any decimal value greater than zero or -1 which indicates default price to be up-to on-demand.
     * 
     */
    public Output</* @Nullable */ Double> getSpotMaxPrice() {
        return this.spotMaxPrice;
    }
    /**
     * Agent pool tags to be persisted on the agent pool virtual machine scale set.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Agent pool tags to be persisted on the agent pool virtual machine scale set.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * AgentPoolType represents types of an agent pool
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return AgentPoolType represents types of an agent pool
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Settings for upgrading the agentpool
     * 
     */
    @OutputExport(name="upgradeSettings", type=AgentPoolUpgradeSettingsResponse.class, parameters={})
    private Output</* @Nullable */ AgentPoolUpgradeSettingsResponse> upgradeSettings;

    /**
     * @return Settings for upgrading the agentpool
     * 
     */
    public Output</* @Nullable */ AgentPoolUpgradeSettingsResponse> getUpgradeSettings() {
        return this.upgradeSettings;
    }
    /**
     * Size of agent VMs.
     * 
     */
    @OutputExport(name="vmSize", type=String.class, parameters={})
    private Output</* @Nullable */ String> vmSize;

    /**
     * @return Size of agent VMs.
     * 
     */
    public Output</* @Nullable */ String> getVmSize() {
        return this.vmSize;
    }
    /**
     * VNet SubnetID specifies the VNet's subnet identifier for nodes and maybe pods
     * 
     */
    @OutputExport(name="vnetSubnetID", type=String.class, parameters={})
    private Output</* @Nullable */ String> vnetSubnetID;

    /**
     * @return VNet SubnetID specifies the VNet's subnet identifier for nodes and maybe pods
     * 
     */
    public Output</* @Nullable */ String> getVnetSubnetID() {
        return this.vnetSubnetID;
    }

    public interface BuilderApplicator {
        public void apply(AgentPoolArgs.Builder a);
    }
    private static io.pulumi.azurenative.containerservice.AgentPoolArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.containerservice.AgentPoolArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AgentPool(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AgentPool(String name) {
        this(name, AgentPoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AgentPool(String name, AgentPoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AgentPool(String name, AgentPoolArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:containerservice:AgentPool", name, args == null ? AgentPoolArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AgentPool(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:containerservice:AgentPool", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:containerservice/v20190201:AgentPool").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20190401:AgentPool").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20190601:AgentPool").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20190801:AgentPool").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20191001:AgentPool").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20191101:AgentPool").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20200101:AgentPool").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20200201:AgentPool").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20200301:AgentPool").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20200401:AgentPool").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20200601:AgentPool").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20200701:AgentPool").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20200901:AgentPool").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20201101:AgentPool").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20201201:AgentPool").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20210201:AgentPool").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20210301:AgentPool").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20210501:AgentPool").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20210701:AgentPool").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20210801:AgentPool").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20210901:AgentPool").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20211001:AgentPool").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20211101preview:AgentPool").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AgentPool get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AgentPool(name, id, options);
    }
}
