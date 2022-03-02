// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.stepfunctions;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.stepfunctions.ActivityArgs;
import io.pulumi.awsnative.stepfunctions.outputs.ActivityTagsEntry;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for Activity
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:stepfunctions:Activity")
public class Activity extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="tags", type=List.class, parameters={ActivityTagsEntry.class})
    private Output</* @Nullable */ List<ActivityTagsEntry>> tags;

    public Output</* @Nullable */ List<ActivityTagsEntry>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ActivityArgs.Builder a);
    }
    private static io.pulumi.awsnative.stepfunctions.ActivityArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.stepfunctions.ActivityArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Activity(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Activity(String name) {
        this(name, ActivityArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Activity(String name, @Nullable ActivityArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Activity(String name, @Nullable ActivityArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:stepfunctions:Activity", name, args == null ? ActivityArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Activity(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:stepfunctions:Activity", name, null, makeResourceOptions(options, id));
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
    public static Activity get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Activity(name, id, options);
    }
}
