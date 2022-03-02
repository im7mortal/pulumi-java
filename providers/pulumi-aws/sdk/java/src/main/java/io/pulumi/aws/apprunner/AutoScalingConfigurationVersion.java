// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apprunner;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.apprunner.AutoScalingConfigurationVersionArgs;
import io.pulumi.aws.apprunner.inputs.AutoScalingConfigurationVersionState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an App Runner AutoScaling Configuration Version.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * App Runner AutoScaling Configuration Versions can be imported by using the `arn`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:apprunner/autoScalingConfigurationVersion:AutoScalingConfigurationVersion example "arn:aws:apprunner:us-east-1:1234567890:autoscalingconfiguration/example/1/69bdfe0115224b0db49398b7beb68e0f
 * ```
 * 
 */
@ResourceType(type="aws:apprunner/autoScalingConfigurationVersion:AutoScalingConfigurationVersion")
public class AutoScalingConfigurationVersion extends io.pulumi.resources.CustomResource {
    /**
     * ARN of this auto scaling configuration version.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of this auto scaling configuration version.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Name of the auto scaling configuration.
     * 
     */
    @OutputExport(name="autoScalingConfigurationName", type=String.class, parameters={})
    private Output<String> autoScalingConfigurationName;

    /**
     * @return Name of the auto scaling configuration.
     * 
     */
    public Output<String> getAutoScalingConfigurationName() {
        return this.autoScalingConfigurationName;
    }
    /**
     * The revision of this auto scaling configuration.
     * 
     */
    @OutputExport(name="autoScalingConfigurationRevision", type=Integer.class, parameters={})
    private Output<Integer> autoScalingConfigurationRevision;

    /**
     * @return The revision of this auto scaling configuration.
     * 
     */
    public Output<Integer> getAutoScalingConfigurationRevision() {
        return this.autoScalingConfigurationRevision;
    }
    /**
     * Whether the auto scaling configuration has the highest `auto_scaling_configuration_revision` among all configurations that share the same `auto_scaling_configuration_name`.
     * 
     */
    @OutputExport(name="latest", type=Boolean.class, parameters={})
    private Output<Boolean> latest;

    /**
     * @return Whether the auto scaling configuration has the highest `auto_scaling_configuration_revision` among all configurations that share the same `auto_scaling_configuration_name`.
     * 
     */
    public Output<Boolean> getLatest() {
        return this.latest;
    }
    /**
     * The maximal number of concurrent requests that you want an instance to process. When the number of concurrent requests goes over this limit, App Runner scales up your service.
     * 
     */
    @OutputExport(name="maxConcurrency", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxConcurrency;

    /**
     * @return The maximal number of concurrent requests that you want an instance to process. When the number of concurrent requests goes over this limit, App Runner scales up your service.
     * 
     */
    public Output</* @Nullable */ Integer> getMaxConcurrency() {
        return this.maxConcurrency;
    }
    /**
     * The maximal number of instances that App Runner provisions for your service.
     * 
     */
    @OutputExport(name="maxSize", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxSize;

    /**
     * @return The maximal number of instances that App Runner provisions for your service.
     * 
     */
    public Output</* @Nullable */ Integer> getMaxSize() {
        return this.maxSize;
    }
    /**
     * The minimal number of instances that App Runner provisions for your service.
     * 
     */
    @OutputExport(name="minSize", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minSize;

    /**
     * @return The minimal number of instances that App Runner provisions for your service.
     * 
     */
    public Output</* @Nullable */ Integer> getMinSize() {
        return this.minSize;
    }
    /**
     * The current state of the auto scaling configuration. An INACTIVE configuration revision has been deleted and can't be used. It is permanently removed some time after deletion.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The current state of the auto scaling configuration. An INACTIVE configuration revision has been deleted and can't be used. It is permanently removed some time after deletion.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        public void apply(AutoScalingConfigurationVersionArgs.Builder a);
    }
    private static io.pulumi.aws.apprunner.AutoScalingConfigurationVersionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.apprunner.AutoScalingConfigurationVersionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AutoScalingConfigurationVersion(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AutoScalingConfigurationVersion(String name) {
        this(name, AutoScalingConfigurationVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AutoScalingConfigurationVersion(String name, AutoScalingConfigurationVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AutoScalingConfigurationVersion(String name, AutoScalingConfigurationVersionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apprunner/autoScalingConfigurationVersion:AutoScalingConfigurationVersion", name, args == null ? AutoScalingConfigurationVersionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AutoScalingConfigurationVersion(String name, Input<String> id, @Nullable AutoScalingConfigurationVersionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apprunner/autoScalingConfigurationVersion:AutoScalingConfigurationVersion", name, state, makeResourceOptions(options, id));
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
    public static AutoScalingConfigurationVersion get(String name, Input<String> id, @Nullable AutoScalingConfigurationVersionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AutoScalingConfigurationVersion(name, id, state, options);
    }
}
