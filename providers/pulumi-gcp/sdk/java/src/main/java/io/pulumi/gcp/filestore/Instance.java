// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.filestore;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.filestore.InstanceArgs;
import io.pulumi.gcp.filestore.inputs.InstanceState;
import io.pulumi.gcp.filestore.outputs.InstanceFileShares;
import io.pulumi.gcp.filestore.outputs.InstanceNetwork;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A Google Cloud Filestore instance.
 * 
 * To get more information about Instance, see:
 * 
 * * [API documentation](https://cloud.google.com/filestore/docs/reference/rest/v1beta1/projects.locations.instances/create)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/filestore/docs/creating-instances)
 *     * [Use with Kubernetes](https://cloud.google.com/filestore/docs/accessing-fileshares)
 *     * [Copying Data In/Out](https://cloud.google.com/filestore/docs/copying-data)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Instance can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:filestore/instance:Instance default projects/{{project}}/locations/{{location}}/instances/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:filestore/instance:Instance default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:filestore/instance:Instance default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:filestore/instance:Instance")
public class Instance extends io.pulumi.resources.CustomResource {
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * A description of the instance.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the instance.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Server-specified ETag for the instance resource to prevent simultaneous updates from overwriting each other.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Server-specified ETag for the instance resource to prevent simultaneous updates from overwriting each other.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * File system shares on the instance. For this version, only a
     * single file share is supported.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="fileShares", type=InstanceFileShares.class, parameters={})
    private Output<InstanceFileShares> fileShares;

    /**
     * @return File system shares on the instance. For this version, only a
     * single file share is supported.
     * Structure is documented below.
     * 
     */
    public Output<InstanceFileShares> getFileShares() {
        return this.fileShares;
    }
    /**
     * Resource labels to represent user-provided metadata.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Resource labels to represent user-provided metadata.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The name of the fileshare (16 characters or less)
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the fileshare (16 characters or less)
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * VPC networks to which the instance is connected. For this version,
     * only a single network is supported.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="networks", type=List.class, parameters={InstanceNetwork.class})
    private Output<List<InstanceNetwork>> networks;

    /**
     * @return VPC networks to which the instance is connected. For this version,
     * only a single network is supported.
     * Structure is documented below.
     * 
     */
    public Output<List<InstanceNetwork>> getNetworks() {
        return this.networks;
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
     * The service tier of the instance.
     * Possible values include: STANDARD, PREMIUM, BASIC_HDD, BASIC_SSD, HIGH_SCALE_SSD and ENTERPRISE (beta only)
     * 
     */
    @OutputExport(name="tier", type=String.class, parameters={})
    private Output<String> tier;

    /**
     * @return The service tier of the instance.
     * Possible values include: STANDARD, PREMIUM, BASIC_HDD, BASIC_SSD, HIGH_SCALE_SSD and ENTERPRISE (beta only)
     * 
     */
    public Output<String> getTier() {
        return this.tier;
    }
    /**
     * - 
     * (Optional, Deprecated)
     * The name of the Filestore zone of the instance.
     * 
     * @Deprecated
     * Deprecated in favor of location.
     * 
     */
    @Deprecated /* Deprecated in favor of location. */
    @OutputExport(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return -
     * (Optional, Deprecated)
     * The name of the Filestore zone of the instance.
     * 
     */
    public Output<String> getZone() {
        return this.zone;
    }

    public interface BuilderApplicator {
        public void apply(InstanceArgs.Builder a);
    }
    private static io.pulumi.gcp.filestore.InstanceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.filestore.InstanceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Instance(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:filestore/instance:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Instance(String name, Input<String> id, @Nullable InstanceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:filestore/instance:Instance", name, state, makeResourceOptions(options, id));
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
    public static Instance get(String name, Input<String> id, @Nullable InstanceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}
