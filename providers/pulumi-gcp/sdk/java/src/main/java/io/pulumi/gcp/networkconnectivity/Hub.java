// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkconnectivity;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.networkconnectivity.HubArgs;
import io.pulumi.gcp.networkconnectivity.inputs.HubState;
import io.pulumi.gcp.networkconnectivity.outputs.HubRoutingVpc;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The NetworkConnectivity Hub resource
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Hub can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:networkconnectivity/hub:Hub default projects/{{project}}/locations/global/hubs/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:networkconnectivity/hub:Hub default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:networkconnectivity/hub:Hub default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:networkconnectivity/hub:Hub")
public class Hub extends io.pulumi.resources.CustomResource {
    /**
     * Output only. The time the hub was created.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Output only. The time the hub was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * An optional description of the hub.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of the hub.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Optional labels in key:value format. For more information about labels, see [Requirements for labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Optional labels in key:value format. For more information about labels, see [Requirements for labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Immutable. The name of the hub. Hub names must be unique. They use the following form: `projects/{project_number}/locations/global/hubs/{hub_id}`
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Immutable. The name of the hub. Hub names must be unique. They use the following form: `projects/{project_number}/locations/global/hubs/{hub_id}`
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The project for the resource
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project for the resource
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The VPC network associated with this hub's spokes. All of the VPN tunnels, VLAN attachments, and router appliance
     * instances referenced by this hub's spokes must belong to this VPC network. This field is read-only. Network Connectivity
     * Center automatically populates it based on the set of spokes attached to the hub.
     * 
     */
    @OutputExport(name="routingVpcs", type=List.class, parameters={HubRoutingVpc.class})
    private Output<List<HubRoutingVpc>> routingVpcs;

    /**
     * @return The VPC network associated with this hub's spokes. All of the VPN tunnels, VLAN attachments, and router appliance
     * instances referenced by this hub's spokes must belong to this VPC network. This field is read-only. Network Connectivity
     * Center automatically populates it based on the set of spokes attached to the hub.
     * 
     */
    public Output<List<HubRoutingVpc>> getRoutingVpcs() {
        return this.routingVpcs;
    }
    /**
     * Output only. The current lifecycle state of this hub. Possible values: STATE_UNSPECIFIED, CREATING, ACTIVE, DELETING
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Output only. The current lifecycle state of this hub. Possible values: STATE_UNSPECIFIED, CREATING, ACTIVE, DELETING
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Output only. The Google-generated UUID for the hub. This value is unique across all hub resources. If a hub is deleted
     * and another with the same name is created, the new hub is assigned a different unique_id.
     * 
     */
    @OutputExport(name="uniqueId", type=String.class, parameters={})
    private Output<String> uniqueId;

    /**
     * @return Output only. The Google-generated UUID for the hub. This value is unique across all hub resources. If a hub is deleted
     * and another with the same name is created, the new hub is assigned a different unique_id.
     * 
     */
    public Output<String> getUniqueId() {
        return this.uniqueId;
    }
    /**
     * Output only. The time the hub was last updated.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Output only. The time the hub was last updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Hub(String name, @Nullable HubArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:networkconnectivity/hub:Hub", name, args == null ? HubArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Hub(String name, Input<String> id, @Nullable HubState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:networkconnectivity/hub:Hub", name, state, makeResourceOptions(options, id));
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
    public static Hub get(String name, Input<String> id, @Nullable HubState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Hub(name, id, state, options);
    }
}