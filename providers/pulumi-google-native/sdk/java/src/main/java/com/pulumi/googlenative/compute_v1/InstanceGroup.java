// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.compute_v1.InstanceGroupArgs;
import com.pulumi.googlenative.compute_v1.outputs.NamedPortResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates an instance group in the specified project using the parameters that are included in the request.
 * 
 */
@ResourceType(type="google-native:compute/v1:InstanceGroup")
public class InstanceGroup extends com.pulumi.resources.CustomResource {
    /**
     * The creation timestamp for this instance group in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return The creation timestamp for this instance group in RFC3339 text format.
     * 
     */
    public Output<String> creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The fingerprint of the named ports. The system uses this fingerprint to detect conflicts when multiple users change the named ports concurrently.
     * 
     */
    @Export(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return The fingerprint of the named ports. The system uses this fingerprint to detect conflicts when multiple users change the named ports concurrently.
     * 
     */
    public Output<String> fingerprint() {
        return this.fingerprint;
    }
    /**
     * The resource type, which is always compute#instanceGroup for instance groups.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The resource type, which is always compute#instanceGroup for instance groups.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * The name of the instance group. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the instance group. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     *  Assigns a name to a port number. For example: {name: &#34;http&#34;, port: 80} This allows the system to reference ports by the assigned name instead of a port number. Named ports can also contain multiple ports. For example: [{name: &#34;app1&#34;, port: 8080}, {name: &#34;app1&#34;, port: 8081}, {name: &#34;app2&#34;, port: 8082}] Named ports apply to all instances in this instance group.
     * 
     */
    @Export(name="namedPorts", type=List.class, parameters={NamedPortResponse.class})
    private Output<List<NamedPortResponse>> namedPorts;

    /**
     * @return  Assigns a name to a port number. For example: {name: &#34;http&#34;, port: 80} This allows the system to reference ports by the assigned name instead of a port number. Named ports can also contain multiple ports. For example: [{name: &#34;app1&#34;, port: 8080}, {name: &#34;app1&#34;, port: 8081}, {name: &#34;app2&#34;, port: 8082}] Named ports apply to all instances in this instance group.
     * 
     */
    public Output<List<NamedPortResponse>> namedPorts() {
        return this.namedPorts;
    }
    /**
     * The URL of the network to which all instances in the instance group belong. If your instance has multiple network interfaces, then the network and subnetwork fields only refer to the network and subnet used by your primary interface (nic0).
     * 
     */
    @Export(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return The URL of the network to which all instances in the instance group belong. If your instance has multiple network interfaces, then the network and subnetwork fields only refer to the network and subnet used by your primary interface (nic0).
     * 
     */
    public Output<String> network() {
        return this.network;
    }
    /**
     * The URL of the region where the instance group is located (for regional resources).
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The URL of the region where the instance group is located (for regional resources).
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The URL for this instance group. The server generates this URL.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URL for this instance group. The server generates this URL.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * The total number of instances in the instance group.
     * 
     */
    @Export(name="size", type=Integer.class, parameters={})
    private Output<Integer> size;

    /**
     * @return The total number of instances in the instance group.
     * 
     */
    public Output<Integer> size() {
        return this.size;
    }
    /**
     * The URL of the subnetwork to which all instances in the instance group belong. If your instance has multiple network interfaces, then the network and subnetwork fields only refer to the network and subnet used by your primary interface (nic0).
     * 
     */
    @Export(name="subnetwork", type=String.class, parameters={})
    private Output<String> subnetwork;

    /**
     * @return The URL of the subnetwork to which all instances in the instance group belong. If your instance has multiple network interfaces, then the network and subnetwork fields only refer to the network and subnet used by your primary interface (nic0).
     * 
     */
    public Output<String> subnetwork() {
        return this.subnetwork;
    }
    /**
     * The URL of the zone where the instance group is located (for zonal resources).
     * 
     */
    @Export(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return The URL of the zone where the instance group is located (for zonal resources).
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceGroup(String name) {
        this(name, InstanceGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceGroup(String name, @Nullable InstanceGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceGroup(String name, @Nullable InstanceGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/v1:InstanceGroup", name, args == null ? InstanceGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InstanceGroup(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/v1:InstanceGroup", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static InstanceGroup get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InstanceGroup(name, id, options);
    }
}
