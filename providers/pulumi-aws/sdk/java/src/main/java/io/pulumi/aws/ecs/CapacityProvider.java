// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ecs.CapacityProviderArgs;
import io.pulumi.aws.ecs.inputs.CapacityProviderState;
import io.pulumi.aws.ecs.outputs.CapacityProviderAutoScalingGroupProvider;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an ECS cluster capacity provider. More information can be found on the [ECS Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-capacity-providers.html).
 * 
 * > **NOTE:** Associating an ECS Capacity Provider to an Auto Scaling Group will automatically add the `AmazonECSManaged` tag to the Auto Scaling Group. This tag should be included in the `aws.autoscaling.Group` resource configuration to prevent the provider from removing it in subsequent executions as well as ensuring the `AmazonECSManaged` tag is propagated to all EC2 Instances in the Auto Scaling Group if `min_size` is above 0 on creation. Any EC2 Instances in the Auto Scaling Group without this tag must be manually be updated, otherwise they may cause unexpected scaling behavior and metrics.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ECS Capacity Providers can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ecs/capacityProvider:CapacityProvider example example
 * ```
 * 
 */
@ResourceType(type="aws:ecs/capacityProvider:CapacityProvider")
public class CapacityProvider extends io.pulumi.resources.CustomResource {
    /**
     * ARN that identifies the capacity provider.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN that identifies the capacity provider.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Configuration block for the provider for the ECS auto scaling group. Detailed below.
     * 
     */
    @OutputExport(name="autoScalingGroupProvider", type=CapacityProviderAutoScalingGroupProvider.class, parameters={})
    private Output<CapacityProviderAutoScalingGroupProvider> autoScalingGroupProvider;

    /**
     * @return Configuration block for the provider for the ECS auto scaling group. Detailed below.
     * 
     */
    public Output<CapacityProviderAutoScalingGroupProvider> getAutoScalingGroupProvider() {
        return this.autoScalingGroupProvider;
    }
    /**
     * Name of the capacity provider.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the capacity provider.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(CapacityProviderArgs.Builder a);
    }
    private static io.pulumi.aws.ecs.CapacityProviderArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ecs.CapacityProviderArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public CapacityProvider(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CapacityProvider(String name) {
        this(name, CapacityProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CapacityProvider(String name, CapacityProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CapacityProvider(String name, CapacityProviderArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecs/capacityProvider:CapacityProvider", name, args == null ? CapacityProviderArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CapacityProvider(String name, Input<String> id, @Nullable CapacityProviderState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecs/capacityProvider:CapacityProvider", name, state, makeResourceOptions(options, id));
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
    public static CapacityProvider get(String name, Input<String> id, @Nullable CapacityProviderState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CapacityProvider(name, id, state, options);
    }
}
