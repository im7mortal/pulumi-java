// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.AttachedDiskArgs;
import io.pulumi.gcp.compute.inputs.AttachedDiskState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Persistent disks can be attached to a compute instance using the `attached_disk`
 * section within the compute instance configuration.
 * However there may be situations where managing the attached disks via the compute
 * instance config isn't preferable or possible, such as attaching dynamic
 * numbers of disks using the `count` variable.
 * 
 * To get more information about attaching disks, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/instances/attachDisk)
 * * How-to Guides
 *     * [Adding a persistent disk](https://cloud.google.com/compute/docs/disks/add-persistent-disk)
 * 
 * **Note:** When using `gcp.compute.AttachedDisk` you **must** use `lifecycle.ignore_changes = ["attached_disk"]` on the `gcp.compute.Instance` resource that has the disks attached. Otherwise the two resources will fight for control of the attached disk block.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Attached Disk can be imported the following ways
 * 
 * ```sh
 *  $ pulumi import gcp:compute/attachedDisk:AttachedDisk default projects/{{project}}/zones/{{zone}}/instances/{{instance.name}}/{{disk.name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/attachedDisk:AttachedDisk default {{project}}/{{zone}}/{{instance.name}}/{{disk.name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/attachedDisk:AttachedDisk")
public class AttachedDisk extends io.pulumi.resources.CustomResource {
    /**
     * Specifies a unique device name of your choice that is
     * reflected into the /dev/disk/by-id/google-* tree of a Linux operating
     * system running within the instance. This name can be used to
     * reference the device for mounting, resizing, and so on, from within
     * the instance.
     * 
     */
    @OutputExport(name="deviceName", type=String.class, parameters={})
    private Output<String> deviceName;

    /**
     * @return Specifies a unique device name of your choice that is
     * reflected into the /dev/disk/by-id/google-* tree of a Linux operating
     * system running within the instance. This name can be used to
     * reference the device for mounting, resizing, and so on, from within
     * the instance.
     * 
     */
    public Output<String> getDeviceName() {
        return this.deviceName;
    }
    /**
     * `name` or `self_link` of the disk that will be attached.
     * 
     */
    @OutputExport(name="disk", type=String.class, parameters={})
    private Output<String> disk;

    /**
     * @return `name` or `self_link` of the disk that will be attached.
     * 
     */
    public Output<String> getDisk() {
        return this.disk;
    }
    /**
     * `name` or `self_link` of the compute instance that the disk will be attached to.
     * If the `self_link` is provided then `zone` and `project` are extracted from the
     * self link. If only the name is used then `zone` and `project` must be defined
     * as properties on the resource or provider.
     * 
     */
    @OutputExport(name="instance", type=String.class, parameters={})
    private Output<String> instance;

    /**
     * @return `name` or `self_link` of the compute instance that the disk will be attached to.
     * If the `self_link` is provided then `zone` and `project` are extracted from the
     * self link. If only the name is used then `zone` and `project` must be defined
     * as properties on the resource or provider.
     * 
     */
    public Output<String> getInstance() {
        return this.instance;
    }
    /**
     * The mode in which to attach this disk, either READ_WRITE or
     * READ_ONLY. If not specified, the default is to attach the disk in
     * READ_WRITE mode.
     * 
     */
    @OutputExport(name="mode", type=String.class, parameters={})
    private Output</* @Nullable */ String> mode;

    /**
     * @return The mode in which to attach this disk, either READ_WRITE or
     * READ_ONLY. If not specified, the default is to attach the disk in
     * READ_WRITE mode.
     * 
     */
    public Output</* @Nullable */ String> getMode() {
        return this.mode;
    }
    /**
     * The project that the referenced compute instance is a part of. If `instance` is referenced by its
     * `self_link` the project defined in the link will take precedence.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project that the referenced compute instance is a part of. If `instance` is referenced by its
     * `self_link` the project defined in the link will take precedence.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The zone that the referenced compute instance is located within. If `instance` is referenced by its
     * `self_link` the zone defined in the link will take precedence.
     * 
     */
    @OutputExport(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return The zone that the referenced compute instance is located within. If `instance` is referenced by its
     * `self_link` the zone defined in the link will take precedence.
     * 
     */
    public Output<String> getZone() {
        return this.zone;
    }

    public interface BuilderApplicator {
        public void apply(AttachedDiskArgs.Builder a);
    }
    private static io.pulumi.gcp.compute.AttachedDiskArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.compute.AttachedDiskArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AttachedDisk(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AttachedDisk(String name) {
        this(name, AttachedDiskArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AttachedDisk(String name, AttachedDiskArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AttachedDisk(String name, AttachedDiskArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/attachedDisk:AttachedDisk", name, args == null ? AttachedDiskArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AttachedDisk(String name, Input<String> id, @Nullable AttachedDiskState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/attachedDisk:AttachedDisk", name, state, makeResourceOptions(options, id));
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
    public static AttachedDisk get(String name, Input<String> id, @Nullable AttachedDiskState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AttachedDisk(name, id, state, options);
    }
}
