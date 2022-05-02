// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.enums.NodeTemplateCpuOvercommitType;
import com.pulumi.googlenative.compute_alpha.inputs.AcceleratorConfigArgs;
import com.pulumi.googlenative.compute_alpha.inputs.LocalDiskArgs;
import com.pulumi.googlenative.compute_alpha.inputs.NodeTemplateNodeTypeFlexibilityArgs;
import com.pulumi.googlenative.compute_alpha.inputs.ServerBindingArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodeTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeTemplateArgs Empty = new NodeTemplateArgs();

    @Import(name="accelerators")
    private @Nullable Output<List<AcceleratorConfigArgs>> accelerators;

    public Optional<Output<List<AcceleratorConfigArgs>>> accelerators() {
        return Optional.ofNullable(this.accelerators);
    }

    /**
     * CPU overcommit.
     * 
     */
    @Import(name="cpuOvercommitType")
    private @Nullable Output<NodeTemplateCpuOvercommitType> cpuOvercommitType;

    /**
     * @return CPU overcommit.
     * 
     */
    public Optional<Output<NodeTemplateCpuOvercommitType>> cpuOvercommitType() {
        return Optional.ofNullable(this.cpuOvercommitType);
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="disks")
    private @Nullable Output<List<LocalDiskArgs>> disks;

    public Optional<Output<List<LocalDiskArgs>>> disks() {
        return Optional.ofNullable(this.disks);
    }

    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Labels to use for node affinity, which will be used in instance scheduling.
     * 
     */
    @Import(name="nodeAffinityLabels")
    private @Nullable Output<Map<String,String>> nodeAffinityLabels;

    /**
     * @return Labels to use for node affinity, which will be used in instance scheduling.
     * 
     */
    public Optional<Output<Map<String,String>>> nodeAffinityLabels() {
        return Optional.ofNullable(this.nodeAffinityLabels);
    }

    /**
     * The node type to use for nodes group that are created from this template.
     * 
     */
    @Import(name="nodeType")
    private @Nullable Output<String> nodeType;

    /**
     * @return The node type to use for nodes group that are created from this template.
     * 
     */
    public Optional<Output<String>> nodeType() {
        return Optional.ofNullable(this.nodeType);
    }

    /**
     * The flexible properties of the desired node type. Node groups that use this node template will create nodes of a type that matches these properties. This field is mutually exclusive with the node_type property; you can only define one or the other, but not both.
     * 
     */
    @Import(name="nodeTypeFlexibility")
    private @Nullable Output<NodeTemplateNodeTypeFlexibilityArgs> nodeTypeFlexibility;

    /**
     * @return The flexible properties of the desired node type. Node groups that use this node template will create nodes of a type that matches these properties. This field is mutually exclusive with the node_type property; you can only define one or the other, but not both.
     * 
     */
    public Optional<Output<NodeTemplateNodeTypeFlexibilityArgs>> nodeTypeFlexibility() {
        return Optional.ofNullable(this.nodeTypeFlexibility);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    /**
     * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    /**
     * @return An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * Sets the binding properties for the physical server. Valid values include: - *[Default]* RESTART_NODE_ON_ANY_SERVER: Restarts VMs on any available physical server - RESTART_NODE_ON_MINIMAL_SERVER: Restarts VMs on the same physical server whenever possible See Sole-tenant node options for more information.
     * 
     */
    @Import(name="serverBinding")
    private @Nullable Output<ServerBindingArgs> serverBinding;

    /**
     * @return Sets the binding properties for the physical server. Valid values include: - *[Default]* RESTART_NODE_ON_ANY_SERVER: Restarts VMs on any available physical server - RESTART_NODE_ON_MINIMAL_SERVER: Restarts VMs on the same physical server whenever possible See Sole-tenant node options for more information.
     * 
     */
    public Optional<Output<ServerBindingArgs>> serverBinding() {
        return Optional.ofNullable(this.serverBinding);
    }

    private NodeTemplateArgs() {}

    private NodeTemplateArgs(NodeTemplateArgs $) {
        this.accelerators = $.accelerators;
        this.cpuOvercommitType = $.cpuOvercommitType;
        this.description = $.description;
        this.disks = $.disks;
        this.name = $.name;
        this.nodeAffinityLabels = $.nodeAffinityLabels;
        this.nodeType = $.nodeType;
        this.nodeTypeFlexibility = $.nodeTypeFlexibility;
        this.project = $.project;
        this.region = $.region;
        this.requestId = $.requestId;
        this.serverBinding = $.serverBinding;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeTemplateArgs $;

        public Builder() {
            $ = new NodeTemplateArgs();
        }

        public Builder(NodeTemplateArgs defaults) {
            $ = new NodeTemplateArgs(Objects.requireNonNull(defaults));
        }

        public Builder accelerators(@Nullable Output<List<AcceleratorConfigArgs>> accelerators) {
            $.accelerators = accelerators;
            return this;
        }

        public Builder accelerators(List<AcceleratorConfigArgs> accelerators) {
            return accelerators(Output.of(accelerators));
        }

        public Builder accelerators(AcceleratorConfigArgs... accelerators) {
            return accelerators(List.of(accelerators));
        }

        /**
         * @param cpuOvercommitType CPU overcommit.
         * 
         * @return builder
         * 
         */
        public Builder cpuOvercommitType(@Nullable Output<NodeTemplateCpuOvercommitType> cpuOvercommitType) {
            $.cpuOvercommitType = cpuOvercommitType;
            return this;
        }

        /**
         * @param cpuOvercommitType CPU overcommit.
         * 
         * @return builder
         * 
         */
        public Builder cpuOvercommitType(NodeTemplateCpuOvercommitType cpuOvercommitType) {
            return cpuOvercommitType(Output.of(cpuOvercommitType));
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder disks(@Nullable Output<List<LocalDiskArgs>> disks) {
            $.disks = disks;
            return this;
        }

        public Builder disks(List<LocalDiskArgs> disks) {
            return disks(Output.of(disks));
        }

        public Builder disks(LocalDiskArgs... disks) {
            return disks(List.of(disks));
        }

        /**
         * @param name The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nodeAffinityLabels Labels to use for node affinity, which will be used in instance scheduling.
         * 
         * @return builder
         * 
         */
        public Builder nodeAffinityLabels(@Nullable Output<Map<String,String>> nodeAffinityLabels) {
            $.nodeAffinityLabels = nodeAffinityLabels;
            return this;
        }

        /**
         * @param nodeAffinityLabels Labels to use for node affinity, which will be used in instance scheduling.
         * 
         * @return builder
         * 
         */
        public Builder nodeAffinityLabels(Map<String,String> nodeAffinityLabels) {
            return nodeAffinityLabels(Output.of(nodeAffinityLabels));
        }

        /**
         * @param nodeType The node type to use for nodes group that are created from this template.
         * 
         * @return builder
         * 
         */
        public Builder nodeType(@Nullable Output<String> nodeType) {
            $.nodeType = nodeType;
            return this;
        }

        /**
         * @param nodeType The node type to use for nodes group that are created from this template.
         * 
         * @return builder
         * 
         */
        public Builder nodeType(String nodeType) {
            return nodeType(Output.of(nodeType));
        }

        /**
         * @param nodeTypeFlexibility The flexible properties of the desired node type. Node groups that use this node template will create nodes of a type that matches these properties. This field is mutually exclusive with the node_type property; you can only define one or the other, but not both.
         * 
         * @return builder
         * 
         */
        public Builder nodeTypeFlexibility(@Nullable Output<NodeTemplateNodeTypeFlexibilityArgs> nodeTypeFlexibility) {
            $.nodeTypeFlexibility = nodeTypeFlexibility;
            return this;
        }

        /**
         * @param nodeTypeFlexibility The flexible properties of the desired node type. Node groups that use this node template will create nodes of a type that matches these properties. This field is mutually exclusive with the node_type property; you can only define one or the other, but not both.
         * 
         * @return builder
         * 
         */
        public Builder nodeTypeFlexibility(NodeTemplateNodeTypeFlexibilityArgs nodeTypeFlexibility) {
            return nodeTypeFlexibility(Output.of(nodeTypeFlexibility));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        /**
         * @param requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param serverBinding Sets the binding properties for the physical server. Valid values include: - *[Default]* RESTART_NODE_ON_ANY_SERVER: Restarts VMs on any available physical server - RESTART_NODE_ON_MINIMAL_SERVER: Restarts VMs on the same physical server whenever possible See Sole-tenant node options for more information.
         * 
         * @return builder
         * 
         */
        public Builder serverBinding(@Nullable Output<ServerBindingArgs> serverBinding) {
            $.serverBinding = serverBinding;
            return this;
        }

        /**
         * @param serverBinding Sets the binding properties for the physical server. Valid values include: - *[Default]* RESTART_NODE_ON_ANY_SERVER: Restarts VMs on any available physical server - RESTART_NODE_ON_MINIMAL_SERVER: Restarts VMs on the same physical server whenever possible See Sole-tenant node options for more information.
         * 
         * @return builder
         * 
         */
        public Builder serverBinding(ServerBindingArgs serverBinding) {
            return serverBinding(Output.of(serverBinding));
        }

        public NodeTemplateArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
