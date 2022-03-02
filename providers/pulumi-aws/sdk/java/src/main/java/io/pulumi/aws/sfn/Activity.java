// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sfn;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.sfn.ActivityArgs;
import io.pulumi.aws.sfn.inputs.ActivityState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Step Function Activity resource
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Activities can be imported using the `arn`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:sfn/activity:Activity foo arn:aws:states:eu-west-1:123456789098:activity:bar
 * ```
 * 
 */
@ResourceType(type="aws:sfn/activity:Activity")
public class Activity extends io.pulumi.resources.CustomResource {
    /**
     * The date the activity was created.
     * 
     */
    @OutputExport(name="creationDate", type=String.class, parameters={})
    private Output<String> creationDate;

    /**
     * @return The date the activity was created.
     * 
     */
    public Output<String> getCreationDate() {
        return this.creationDate;
    }
    /**
     * The name of the activity to create.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the activity to create.
     * 
     */
    public Output<String> getName() {
        return this.name;
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
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ActivityArgs.Builder a);
    }
    private static io.pulumi.aws.sfn.ActivityArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.sfn.ActivityArgs.builder();
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
        super("aws:sfn/activity:Activity", name, args == null ? ActivityArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Activity(String name, Input<String> id, @Nullable ActivityState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sfn/activity:Activity", name, state, makeResourceOptions(options, id));
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
    public static Activity get(String name, Input<String> id, @Nullable ActivityState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Activity(name, id, state, options);
    }
}
