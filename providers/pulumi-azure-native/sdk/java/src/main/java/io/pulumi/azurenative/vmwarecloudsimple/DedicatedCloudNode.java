// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.vmwarecloudsimple;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.vmwarecloudsimple.DedicatedCloudNodeArgs;
import io.pulumi.azurenative.vmwarecloudsimple.outputs.SkuResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Dedicated cloud node model
 * API Version: 2019-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:vmwarecloudsimple:DedicatedCloudNode myNode /subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.VMwareCloudSimple/dedicatedCloudNodes/myNode 
 * ```
 * 
 */
@ResourceType(type="azure-native:vmwarecloudsimple:DedicatedCloudNode")
public class DedicatedCloudNode extends io.pulumi.resources.CustomResource {
    /**
     * Availability Zone id, e.g. "az1"
     * 
     */
    @OutputExport(name="availabilityZoneId", type=String.class, parameters={})
    private Output<String> availabilityZoneId;

    /**
     * @return Availability Zone id, e.g. "az1"
     * 
     */
    public Output<String> getAvailabilityZoneId() {
        return this.availabilityZoneId;
    }
    /**
     * Availability Zone name, e.g. "Availability Zone 1"
     * 
     */
    @OutputExport(name="availabilityZoneName", type=String.class, parameters={})
    private Output<String> availabilityZoneName;

    /**
     * @return Availability Zone name, e.g. "Availability Zone 1"
     * 
     */
    public Output<String> getAvailabilityZoneName() {
        return this.availabilityZoneName;
    }
    /**
     * VMWare Cloud Rack Name
     * 
     */
    @OutputExport(name="cloudRackName", type=String.class, parameters={})
    private Output<String> cloudRackName;

    /**
     * @return VMWare Cloud Rack Name
     * 
     */
    public Output<String> getCloudRackName() {
        return this.cloudRackName;
    }
    /**
     * date time the resource was created
     * 
     */
    @OutputExport(name="created", type=String.class, parameters={})
    private Output<String> created;

    /**
     * @return date time the resource was created
     * 
     */
    public Output<String> getCreated() {
        return this.created;
    }
    /**
     * Azure region
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Azure region
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * SKU's name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return SKU's name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * count of nodes to create
     * 
     */
    @OutputExport(name="nodesCount", type=Integer.class, parameters={})
    private Output<Integer> nodesCount;

    /**
     * @return count of nodes to create
     * 
     */
    public Output<Integer> getNodesCount() {
        return this.nodesCount;
    }
    /**
     * Placement Group id, e.g. "n1"
     * 
     */
    @OutputExport(name="placementGroupId", type=String.class, parameters={})
    private Output<String> placementGroupId;

    /**
     * @return Placement Group id, e.g. "n1"
     * 
     */
    public Output<String> getPlacementGroupId() {
        return this.placementGroupId;
    }
    /**
     * Placement Name, e.g. "Placement Group 1"
     * 
     */
    @OutputExport(name="placementGroupName", type=String.class, parameters={})
    private Output<String> placementGroupName;

    /**
     * @return Placement Name, e.g. "Placement Group 1"
     * 
     */
    public Output<String> getPlacementGroupName() {
        return this.placementGroupName;
    }
    /**
     * Private Cloud Id
     * 
     */
    @OutputExport(name="privateCloudId", type=String.class, parameters={})
    private Output<String> privateCloudId;

    /**
     * @return Private Cloud Id
     * 
     */
    public Output<String> getPrivateCloudId() {
        return this.privateCloudId;
    }
    /**
     * Resource Pool Name
     * 
     */
    @OutputExport(name="privateCloudName", type=String.class, parameters={})
    private Output<String> privateCloudName;

    /**
     * @return Resource Pool Name
     * 
     */
    public Output<String> getPrivateCloudName() {
        return this.privateCloudName;
    }
    /**
     * The provisioning status of the resource
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning status of the resource
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * purchase id
     * 
     */
    @OutputExport(name="purchaseId", type=String.class, parameters={})
    private Output<String> purchaseId;

    /**
     * @return purchase id
     * 
     */
    public Output<String> getPurchaseId() {
        return this.purchaseId;
    }
    /**
     * Dedicated Cloud Nodes SKU
     * 
     */
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return Dedicated Cloud Nodes SKU
     * 
     */
    public Output</* @Nullable */ SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Node status, indicates is private cloud set up on this node or not
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Node status, indicates is private cloud set up on this node or not
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * Dedicated Cloud Nodes tags
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Dedicated Cloud Nodes tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * {resourceProviderNamespace}/{resourceType}
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return {resourceProviderNamespace}/{resourceType}
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * VMWare Cluster Name
     * 
     */
    @OutputExport(name="vmwareClusterName", type=String.class, parameters={})
    private Output<String> vmwareClusterName;

    /**
     * @return VMWare Cluster Name
     * 
     */
    public Output<String> getVmwareClusterName() {
        return this.vmwareClusterName;
    }

    public interface BuilderApplicator {
        public void apply(DedicatedCloudNodeArgs.Builder a);
    }
    private static io.pulumi.azurenative.vmwarecloudsimple.DedicatedCloudNodeArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.vmwarecloudsimple.DedicatedCloudNodeArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DedicatedCloudNode(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DedicatedCloudNode(String name) {
        this(name, DedicatedCloudNodeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DedicatedCloudNode(String name, DedicatedCloudNodeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DedicatedCloudNode(String name, DedicatedCloudNodeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:vmwarecloudsimple:DedicatedCloudNode", name, args == null ? DedicatedCloudNodeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DedicatedCloudNode(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:vmwarecloudsimple:DedicatedCloudNode", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:vmwarecloudsimple/v20190401:DedicatedCloudNode").build())
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
    public static DedicatedCloudNode get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DedicatedCloudNode(name, id, options);
    }
}
