// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.backup.PlanArgs;
import io.pulumi.aws.backup.inputs.PlanState;
import io.pulumi.aws.backup.outputs.PlanAdvancedBackupSetting;
import io.pulumi.aws.backup.outputs.PlanRule;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an AWS Backup plan resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Backup Plan can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:backup/plan:Plan test <id>
 * ```
 * 
 */
@ResourceType(type="aws:backup/plan:Plan")
public class Plan extends io.pulumi.resources.CustomResource {
    /**
     * An object that specifies backup options for each resource type.
     * 
     */
    @OutputExport(name="advancedBackupSettings", type=List.class, parameters={PlanAdvancedBackupSetting.class})
    private Output</* @Nullable */ List<PlanAdvancedBackupSetting>> advancedBackupSettings;

    /**
     * @return An object that specifies backup options for each resource type.
     * 
     */
    public Output</* @Nullable */ List<PlanAdvancedBackupSetting>> getAdvancedBackupSettings() {
        return this.advancedBackupSettings;
    }
    /**
     * The ARN of the backup plan.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the backup plan.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The display name of a backup plan.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The display name of a backup plan.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A rule object that specifies a scheduled task that is used to back up a selection of resources.
     * 
     */
    @OutputExport(name="rules", type=List.class, parameters={PlanRule.class})
    private Output<List<PlanRule>> rules;

    /**
     * @return A rule object that specifies a scheduled task that is used to back up a selection of resources.
     * 
     */
    public Output<List<PlanRule>> getRules() {
        return this.rules;
    }
    /**
     * Metadata that you can assign to help organize the plans you create. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Metadata that you can assign to help organize the plans you create. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    /**
     * Unique, randomly generated, Unicode, UTF-8 encoded string that serves as the version ID of the backup plan.
     * 
     */
    @OutputExport(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return Unique, randomly generated, Unicode, UTF-8 encoded string that serves as the version ID of the backup plan.
     * 
     */
    public Output<String> getVersion() {
        return this.version;
    }

    public interface BuilderApplicator {
        public void apply(PlanArgs.Builder a);
    }
    private static io.pulumi.aws.backup.PlanArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.backup.PlanArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Plan(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Plan(String name) {
        this(name, PlanArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Plan(String name, PlanArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Plan(String name, PlanArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:backup/plan:Plan", name, args == null ? PlanArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Plan(String name, Input<String> id, @Nullable PlanState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:backup/plan:Plan", name, state, makeResourceOptions(options, id));
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
    public static Plan get(String name, Input<String> id, @Nullable PlanState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Plan(name, id, state, options);
    }
}
