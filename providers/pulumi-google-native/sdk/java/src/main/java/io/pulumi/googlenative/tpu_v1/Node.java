// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.tpu_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.tpu_v1.NodeArgs;
import io.pulumi.googlenative.tpu_v1.outputs.NetworkEndpointResponse;
import io.pulumi.googlenative.tpu_v1.outputs.SchedulingConfigResponse;
import io.pulumi.googlenative.tpu_v1.outputs.SymptomResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a node.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:tpu/v1:Node")
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
     * The API version that created this Node.
     * 
     */
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output<String> apiVersion;

    /**
     * @return The API version that created this Node.
     * 
     */
    public Output<String> getApiVersion() {
        return this.apiVersion;
    }
    /**
     * The CIDR block that the TPU node will use when selecting an IP address. This CIDR block must be a /29 block; the Compute Engine networks API forbids a smaller block, and using a larger block would be wasteful (a node can only consume one IP address). Errors will occur if the CIDR block has already been used for a currently existing TPU node, the CIDR block conflicts with any subnetworks in the user's provided network, or the provided network is peered with another network that is using that CIDR block.
     * 
     */
    @OutputExport(name="cidrBlock", type=String.class, parameters={})
    private Output<String> cidrBlock;

    /**
     * @return The CIDR block that the TPU node will use when selecting an IP address. This CIDR block must be a /29 block; the Compute Engine networks API forbids a smaller block, and using a larger block would be wasteful (a node can only consume one IP address). Errors will occur if the CIDR block has already been used for a currently existing TPU node, the CIDR block conflicts with any subnetworks in the user's provided network, or the provided network is peered with another network that is using that CIDR block.
     * 
     */
    public Output<String> getCidrBlock() {
        return this.cidrBlock;
    }
    /**
     * The time when the node was created.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time when the node was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The user-supplied description of the TPU. Maximum of 512 characters.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The user-supplied description of the TPU. Maximum of 512 characters.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The health status of the TPU node.
     * 
     */
    @OutputExport(name="health", type=String.class, parameters={})
    private Output<String> health;

    /**
     * @return The health status of the TPU node.
     * 
     */
    public Output<String> getHealth() {
        return this.health;
    }
    /**
     * If this field is populated, it contains a description of why the TPU Node is unhealthy.
     * 
     */
    @OutputExport(name="healthDescription", type=String.class, parameters={})
    private Output<String> healthDescription;

    /**
     * @return If this field is populated, it contains a description of why the TPU Node is unhealthy.
     * 
     */
    public Output<String> getHealthDescription() {
        return this.healthDescription;
    }
    /**
     * Resource labels to represent user-provided metadata.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Resource labels to represent user-provided metadata.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Immutable. The name of the TPU
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Immutable. The name of the TPU
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The name of a network they wish to peer the TPU node to. It must be a preexisting Compute Engine network inside of the project on which this API has been activated. If none is provided, "default" will be used.
     * 
     */
    @OutputExport(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return The name of a network they wish to peer the TPU node to. It must be a preexisting Compute Engine network inside of the project on which this API has been activated. If none is provided, "default" will be used.
     * 
     */
    public Output<String> getNetwork() {
        return this.network;
    }
    /**
     * The network endpoints where TPU workers can be accessed and sent work. It is recommended that Tensorflow clients of the node reach out to the 0th entry in this map first.
     * 
     */
    @OutputExport(name="networkEndpoints", type=List.class, parameters={NetworkEndpointResponse.class})
    private Output<List<NetworkEndpointResponse>> networkEndpoints;

    /**
     * @return The network endpoints where TPU workers can be accessed and sent work. It is recommended that Tensorflow clients of the node reach out to the 0th entry in this map first.
     * 
     */
    public Output<List<NetworkEndpointResponse>> getNetworkEndpoints() {
        return this.networkEndpoints;
    }
    /**
     * The scheduling options for this node.
     * 
     */
    @OutputExport(name="schedulingConfig", type=SchedulingConfigResponse.class, parameters={})
    private Output<SchedulingConfigResponse> schedulingConfig;

    /**
     * @return The scheduling options for this node.
     * 
     */
    public Output<SchedulingConfigResponse> getSchedulingConfig() {
        return this.schedulingConfig;
    }
    /**
     * The service account used to run the tensor flow services within the node. To share resources, including Google Cloud Storage data, with the Tensorflow job running in the Node, this account must have permissions to that data.
     * 
     */
    @OutputExport(name="serviceAccount", type=String.class, parameters={})
    private Output<String> serviceAccount;

    /**
     * @return The service account used to run the tensor flow services within the node. To share resources, including Google Cloud Storage data, with the Tensorflow job running in the Node, this account must have permissions to that data.
     * 
     */
    public Output<String> getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * The current state for the TPU Node.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state for the TPU Node.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The Symptoms that have occurred to the TPU Node.
     * 
     */
    @OutputExport(name="symptoms", type=List.class, parameters={SymptomResponse.class})
    private Output<List<SymptomResponse>> symptoms;

    /**
     * @return The Symptoms that have occurred to the TPU Node.
     * 
     */
    public Output<List<SymptomResponse>> getSymptoms() {
        return this.symptoms;
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
     * Whether the VPC peering for the node is set up through Service Networking API. The VPC Peering should be set up before provisioning the node. If this field is set, cidr_block field should not be specified. If the network, that you want to peer the TPU Node to, is Shared VPC networks, the node must be created with this this field enabled.
     * 
     */
    @OutputExport(name="useServiceNetworking", type=Boolean.class, parameters={})
    private Output<Boolean> useServiceNetworking;

    /**
     * @return Whether the VPC peering for the node is set up through Service Networking API. The VPC Peering should be set up before provisioning the node. If this field is set, cidr_block field should not be specified. If the network, that you want to peer the TPU Node to, is Shared VPC networks, the node must be created with this this field enabled.
     * 
     */
    public Output<Boolean> getUseServiceNetworking() {
        return this.useServiceNetworking;
    }

    public interface BuilderApplicator {
        public void apply(NodeArgs.Builder a);
    }
    private static io.pulumi.googlenative.tpu_v1.NodeArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.tpu_v1.NodeArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Node(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Node(String name) {
        this(name, NodeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Node(String name, NodeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Node(String name, NodeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:tpu/v1:Node", name, args == null ? NodeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Node(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:tpu/v1:Node", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Node get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Node(name, id, options);
    }
}
