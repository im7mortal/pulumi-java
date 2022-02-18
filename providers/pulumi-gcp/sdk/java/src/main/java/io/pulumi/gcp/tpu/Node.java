// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.tpu;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.tpu.NodeArgs;
import io.pulumi.gcp.tpu.inputs.NodeState;
import io.pulumi.gcp.tpu.outputs.NodeNetworkEndpoint;
import io.pulumi.gcp.tpu.outputs.NodeSchedulingConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A Cloud TPU instance.
 * 
 * To get more information about Node, see:
 * 
 * * [API documentation](https://cloud.google.com/tpu/docs/reference/rest/v1/projects.locations.nodes)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/tpu/docs/)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Node can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:tpu/node:Node default projects/{{project}}/locations/{{zone}}/nodes/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:tpu/node:Node default {{project}}/{{zone}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:tpu/node:Node default {{zone}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:tpu/node:Node default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:tpu/node:Node")
public class Node extends io.pulumi.resources.CustomResource {
    /**
     * The type of hardware accelerators associated with this node.
     * 
     */
    @OutputExport(name="acceleratorType", type=String.class, parameters={})
    private Output<String> acceleratorType;

    /**
     * @return The type of hardware accelerators associated with this node.
     * 
     */
    public Output<String> getAcceleratorType() {
        return this.acceleratorType;
    }
    /**
     * The CIDR block that the TPU node will use when selecting an IP
     * address. This CIDR block must be a /29 block; the Compute Engine
     * networks API forbids a smaller block, and using a larger block would
     * be wasteful (a node can only consume one IP address).
     * Errors will occur if the CIDR block has already been used for a
     * currently existing TPU node, the CIDR block conflicts with any
     * subnetworks in the user's provided network, or the provided network
     * is peered with another network that is using that CIDR block.
     * 
     */
    @OutputExport(name="cidrBlock", type=String.class, parameters={})
    private Output<String> cidrBlock;

    /**
     * @return The CIDR block that the TPU node will use when selecting an IP
     * address. This CIDR block must be a /29 block; the Compute Engine
     * networks API forbids a smaller block, and using a larger block would
     * be wasteful (a node can only consume one IP address).
     * Errors will occur if the CIDR block has already been used for a
     * currently existing TPU node, the CIDR block conflicts with any
     * subnetworks in the user's provided network, or the provided network
     * is peered with another network that is using that CIDR block.
     * 
     */
    public Output<String> getCidrBlock() {
        return this.cidrBlock;
    }
    /**
     * The user-supplied description of the TPU. Maximum of 512 characters.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The user-supplied description of the TPU. Maximum of 512 characters.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Resource labels to represent user provided metadata.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Resource labels to represent user provided metadata.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The immutable name of the TPU.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The immutable name of the TPU.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The name of a network to peer the TPU node to. It must be a
     * preexisting Compute Engine network inside of the project on which
     * this API has been activated. If none is provided, "default" will be
     * used.
     * 
     */
    @OutputExport(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return The name of a network to peer the TPU node to. It must be a
     * preexisting Compute Engine network inside of the project on which
     * this API has been activated. If none is provided, "default" will be
     * used.
     * 
     */
    public Output<String> getNetwork() {
        return this.network;
    }
    /**
     * The network endpoints where TPU workers can be accessed and sent work. It is recommended that Tensorflow clients of the
     * node first reach out to the first (index 0) entry.
     * 
     */
    @OutputExport(name="networkEndpoints", type=List.class, parameters={NodeNetworkEndpoint.class})
    private Output<List<NodeNetworkEndpoint>> networkEndpoints;

    /**
     * @return The network endpoints where TPU workers can be accessed and sent work. It is recommended that Tensorflow clients of the
     * node first reach out to the first (index 0) entry.
     * 
     */
    public Output<List<NodeNetworkEndpoint>> getNetworkEndpoints() {
        return this.networkEndpoints;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Sets the scheduling options for this TPU instance.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="schedulingConfig", type=NodeSchedulingConfig.class, parameters={})
    private Output</* @Nullable */ NodeSchedulingConfig> schedulingConfig;

    /**
     * @return Sets the scheduling options for this TPU instance.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ NodeSchedulingConfig> getSchedulingConfig() {
        return this.schedulingConfig;
    }
    /**
     * The service account used to run the tensor flow services within the node. To share resources, including Google Cloud
     * Storage data, with the Tensorflow job running in the Node, this account must have permissions to that data.
     * 
     */
    @OutputExport(name="serviceAccount", type=String.class, parameters={})
    private Output<String> serviceAccount;

    /**
     * @return The service account used to run the tensor flow services within the node. To share resources, including Google Cloud
     * Storage data, with the Tensorflow job running in the Node, this account must have permissions to that data.
     * 
     */
    public Output<String> getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * The version of Tensorflow running in the Node.
     * 
     */
    @OutputExport(name="tensorflowVersion", type=String.class, parameters={})
    private Output<String> tensorflowVersion;

    /**
     * @return The version of Tensorflow running in the Node.
     * 
     */
    public Output<String> getTensorflowVersion() {
        return this.tensorflowVersion;
    }
    /**
     * Whether the VPC peering for the node is set up through Service Networking API.
     * The VPC Peering should be set up before provisioning the node. If this field is set,
     * cidr_block field should not be specified. If the network that you want to peer the
     * TPU Node to is a Shared VPC network, the node must be created with this this field enabled.
     * 
     */
    @OutputExport(name="useServiceNetworking", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> useServiceNetworking;

    /**
     * @return Whether the VPC peering for the node is set up through Service Networking API.
     * The VPC Peering should be set up before provisioning the node. If this field is set,
     * cidr_block field should not be specified. If the network that you want to peer the
     * TPU Node to is a Shared VPC network, the node must be created with this this field enabled.
     * 
     */
    public Output</* @Nullable */ Boolean> getUseServiceNetworking() {
        return this.useServiceNetworking;
    }
    /**
     * The GCP location for the TPU. If it is not provided, the provider zone is used.
     * 
     */
    @OutputExport(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return The GCP location for the TPU. If it is not provided, the provider zone is used.
     * 
     */
    public Output<String> getZone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Node(String name, NodeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:tpu/node:Node", name, args == null ? NodeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Node(String name, Input<String> id, @Nullable NodeState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:tpu/node:Node", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Node get(String name, Input<String> id, @Nullable NodeState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Node(name, id, state, options);
    }
}