// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_v1.NodeTemplateArgs;
import io.pulumi.googlenative.compute_v1.outputs.AcceleratorConfigResponse;
import io.pulumi.googlenative.compute_v1.outputs.LocalDiskResponse;
import io.pulumi.googlenative.compute_v1.outputs.NodeTemplateNodeTypeFlexibilityResponse;
import io.pulumi.googlenative.compute_v1.outputs.ServerBindingResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a NodeTemplate resource in the specified project using the data included in the request.
 * 
 */
@ResourceType(type="google-native:compute/v1:NodeTemplate")
public class NodeTemplate extends io.pulumi.resources.CustomResource {
    @OutputExport(name="accelerators", type=List.class, parameters={AcceleratorConfigResponse.class})
    private Output<List<AcceleratorConfigResponse>> accelerators;

    public Output<List<AcceleratorConfigResponse>> getAccelerators() {
        return this.accelerators;
    }
    /**
     * CPU overcommit.
     * 
     */
    @OutputExport(name="cpuOvercommitType", type=String.class, parameters={})
    private Output<String> cpuOvercommitType;

    /**
     * @return CPU overcommit.
     * 
     */
    public Output<String> getCpuOvercommitType() {
        return this.cpuOvercommitType;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @OutputExport(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    @OutputExport(name="disks", type=List.class, parameters={LocalDiskResponse.class})
    private Output<List<LocalDiskResponse>> disks;

    public Output<List<LocalDiskResponse>> getDisks() {
        return this.disks;
    }
    /**
     * The type of the resource. Always compute#nodeTemplate for node templates.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The type of the resource. Always compute#nodeTemplate for node templates.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Labels to use for node affinity, which will be used in instance scheduling.
     * 
     */
    @OutputExport(name="nodeAffinityLabels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> nodeAffinityLabels;

    /**
     * @return Labels to use for node affinity, which will be used in instance scheduling.
     * 
     */
    public Output<Map<String,String>> getNodeAffinityLabels() {
        return this.nodeAffinityLabels;
    }
    /**
     * The node type to use for nodes group that are created from this template.
     * 
     */
    @OutputExport(name="nodeType", type=String.class, parameters={})
    private Output<String> nodeType;

    /**
     * @return The node type to use for nodes group that are created from this template.
     * 
     */
    public Output<String> getNodeType() {
        return this.nodeType;
    }
    /**
     * The flexible properties of the desired node type. Node groups that use this node template will create nodes of a type that matches these properties. This field is mutually exclusive with the node_type property; you can only define one or the other, but not both.
     * 
     */
    @OutputExport(name="nodeTypeFlexibility", type=NodeTemplateNodeTypeFlexibilityResponse.class, parameters={})
    private Output<NodeTemplateNodeTypeFlexibilityResponse> nodeTypeFlexibility;

    /**
     * @return The flexible properties of the desired node type. Node groups that use this node template will create nodes of a type that matches these properties. This field is mutually exclusive with the node_type property; you can only define one or the other, but not both.
     * 
     */
    public Output<NodeTemplateNodeTypeFlexibilityResponse> getNodeTypeFlexibility() {
        return this.nodeTypeFlexibility;
    }
    /**
     * The name of the region where the node template resides, such as us-central1.
     * 
     */
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The name of the region where the node template resides, such as us-central1.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * Sets the binding properties for the physical server. Valid values include: - *[Default]* RESTART_NODE_ON_ANY_SERVER: Restarts VMs on any available physical server - RESTART_NODE_ON_MINIMAL_SERVER: Restarts VMs on the same physical server whenever possible See Sole-tenant node options for more information.
     * 
     */
    @OutputExport(name="serverBinding", type=ServerBindingResponse.class, parameters={})
    private Output<ServerBindingResponse> serverBinding;

    /**
     * @return Sets the binding properties for the physical server. Valid values include: - *[Default]* RESTART_NODE_ON_ANY_SERVER: Restarts VMs on any available physical server - RESTART_NODE_ON_MINIMAL_SERVER: Restarts VMs on the same physical server whenever possible See Sole-tenant node options for more information.
     * 
     */
    public Output<ServerBindingResponse> getServerBinding() {
        return this.serverBinding;
    }
    /**
     * The status of the node template. One of the following values: CREATING, READY, and DELETING.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the node template. One of the following values: CREATING, READY, and DELETING.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * An optional, human-readable explanation of the status.
     * 
     */
    @OutputExport(name="statusMessage", type=String.class, parameters={})
    private Output<String> statusMessage;

    /**
     * @return An optional, human-readable explanation of the status.
     * 
     */
    public Output<String> getStatusMessage() {
        return this.statusMessage;
    }

    public interface BuilderApplicator {
        public void apply(NodeTemplateArgs.Builder a);
    }
    private static io.pulumi.googlenative.compute_v1.NodeTemplateArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.compute_v1.NodeTemplateArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public NodeTemplate(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NodeTemplate(String name) {
        this(name, NodeTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NodeTemplate(String name, NodeTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NodeTemplate(String name, NodeTemplateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/v1:NodeTemplate", name, args == null ? NodeTemplateArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private NodeTemplate(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/v1:NodeTemplate", name, null, makeResourceOptions(options, id));
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
    public static NodeTemplate get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NodeTemplate(name, id, options);
    }
}
