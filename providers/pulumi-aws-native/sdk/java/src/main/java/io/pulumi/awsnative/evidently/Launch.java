// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.evidently.LaunchArgs;
import io.pulumi.awsnative.evidently.outputs.LaunchGroupObject;
import io.pulumi.awsnative.evidently.outputs.LaunchMetricDefinitionObject;
import io.pulumi.awsnative.evidently.outputs.LaunchStepConfig;
import io.pulumi.awsnative.evidently.outputs.LaunchTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::Evidently::Launch.
 * 
 */
@ResourceType(type="aws-native:evidently:Launch")
public class Launch extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="groups", type=List.class, parameters={LaunchGroupObject.class})
    private Output<List<LaunchGroupObject>> groups;

    public Output<List<LaunchGroupObject>> getGroups() {
        return this.groups;
    }
    @OutputExport(name="metricMonitors", type=List.class, parameters={LaunchMetricDefinitionObject.class})
    private Output</* @Nullable */ List<LaunchMetricDefinitionObject>> metricMonitors;

    public Output</* @Nullable */ List<LaunchMetricDefinitionObject>> getMetricMonitors() {
        return this.metricMonitors;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="randomizationSalt", type=String.class, parameters={})
    private Output</* @Nullable */ String> randomizationSalt;

    public Output</* @Nullable */ String> getRandomizationSalt() {
        return this.randomizationSalt;
    }
    @OutputExport(name="scheduledSplitsConfig", type=List.class, parameters={LaunchStepConfig.class})
    private Output<List<LaunchStepConfig>> scheduledSplitsConfig;

    public Output<List<LaunchStepConfig>> getScheduledSplitsConfig() {
        return this.scheduledSplitsConfig;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={LaunchTag.class})
    private Output</* @Nullable */ List<LaunchTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<LaunchTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(LaunchArgs.Builder a);
    }
    private static io.pulumi.awsnative.evidently.LaunchArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.evidently.LaunchArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Launch(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Launch(String name) {
        this(name, LaunchArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Launch(String name, LaunchArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Launch(String name, LaunchArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:evidently:Launch", name, args == null ? LaunchArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Launch(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:evidently:Launch", name, null, makeResourceOptions(options, id));
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
    public static Launch get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Launch(name, id, options);
    }
}
