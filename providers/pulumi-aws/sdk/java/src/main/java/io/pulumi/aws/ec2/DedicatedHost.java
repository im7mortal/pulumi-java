// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.DedicatedHostArgs;
import io.pulumi.aws.ec2.inputs.DedicatedHostState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an EC2 Host resource. This allows Dedicated Hosts to be allocated, modified, and released.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Hosts can be imported using the host `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/dedicatedHost:DedicatedHost example h-0385a99d0e4b20cbb
 * ```
 * 
 */
@ResourceType(type="aws:ec2/dedicatedHost:DedicatedHost")
public class DedicatedHost extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the Dedicated Host.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the Dedicated Host.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Indicates whether the host accepts any untargeted instance launches that match its instance type configuration, or if it only accepts Host tenancy instance launches that specify its unique host ID. Valid values: `on`, `off`. Default: `on`.
     * 
     */
    @OutputExport(name="autoPlacement", type=String.class, parameters={})
    private Output</* @Nullable */ String> autoPlacement;

    /**
     * @return Indicates whether the host accepts any untargeted instance launches that match its instance type configuration, or if it only accepts Host tenancy instance launches that specify its unique host ID. Valid values: `on`, `off`. Default: `on`.
     * 
     */
    public Output</* @Nullable */ String> getAutoPlacement() {
        return this.autoPlacement;
    }
    /**
     * The Availability Zone in which to allocate the Dedicated Host.
     * 
     */
    @OutputExport(name="availabilityZone", type=String.class, parameters={})
    private Output<String> availabilityZone;

    /**
     * @return The Availability Zone in which to allocate the Dedicated Host.
     * 
     */
    public Output<String> getAvailabilityZone() {
        return this.availabilityZone;
    }
    /**
     * Indicates whether to enable or disable host recovery for the Dedicated Host. Valid values: `on`, `off`. Default: `off`.
     * 
     */
    @OutputExport(name="hostRecovery", type=String.class, parameters={})
    private Output</* @Nullable */ String> hostRecovery;

    /**
     * @return Indicates whether to enable or disable host recovery for the Dedicated Host. Valid values: `on`, `off`. Default: `off`.
     * 
     */
    public Output</* @Nullable */ String> getHostRecovery() {
        return this.hostRecovery;
    }
    /**
     * Specifies the instance family to be supported by the Dedicated Hosts. If you specify an instance family, the Dedicated Hosts support multiple instance types within that instance family. Exactly one of `instance_family` or `instance_type` must be specified.
     * 
     */
    @OutputExport(name="instanceFamily", type=String.class, parameters={})
    private Output</* @Nullable */ String> instanceFamily;

    /**
     * @return Specifies the instance family to be supported by the Dedicated Hosts. If you specify an instance family, the Dedicated Hosts support multiple instance types within that instance family. Exactly one of `instance_family` or `instance_type` must be specified.
     * 
     */
    public Output</* @Nullable */ String> getInstanceFamily() {
        return this.instanceFamily;
    }
    /**
     * Specifies the instance type to be supported by the Dedicated Hosts. If you specify an instance type, the Dedicated Hosts support instances of the specified instance type only.  Exactly one of `instance_family` or `instance_type` must be specified.
     * 
     */
    @OutputExport(name="instanceType", type=String.class, parameters={})
    private Output</* @Nullable */ String> instanceType;

    /**
     * @return Specifies the instance type to be supported by the Dedicated Hosts. If you specify an instance type, the Dedicated Hosts support instances of the specified instance type only.  Exactly one of `instance_family` or `instance_type` must be specified.
     * 
     */
    public Output</* @Nullable */ String> getInstanceType() {
        return this.instanceType;
    }
    /**
     * The ID of the AWS account that owns the Dedicated Host.
     * 
     */
    @OutputExport(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return The ID of the AWS account that owns the Dedicated Host.
     * 
     */
    public Output<String> getOwnerId() {
        return this.ownerId;
    }
    /**
     * Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(DedicatedHostArgs.Builder a);
    }
    private static io.pulumi.aws.ec2.DedicatedHostArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ec2.DedicatedHostArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DedicatedHost(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DedicatedHost(String name) {
        this(name, DedicatedHostArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DedicatedHost(String name, DedicatedHostArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DedicatedHost(String name, DedicatedHostArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/dedicatedHost:DedicatedHost", name, args == null ? DedicatedHostArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DedicatedHost(String name, Input<String> id, @Nullable DedicatedHostState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/dedicatedHost:DedicatedHost", name, state, makeResourceOptions(options, id));
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
    public static DedicatedHost get(String name, Input<String> id, @Nullable DedicatedHostState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DedicatedHost(name, id, state, options);
    }
}
