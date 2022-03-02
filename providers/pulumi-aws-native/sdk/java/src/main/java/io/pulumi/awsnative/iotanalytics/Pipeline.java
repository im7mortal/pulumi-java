// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotanalytics.PipelineArgs;
import io.pulumi.awsnative.iotanalytics.outputs.PipelineActivity;
import io.pulumi.awsnative.iotanalytics.outputs.PipelineTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::IoTAnalytics::Pipeline
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:iotanalytics:Pipeline")
public class Pipeline extends io.pulumi.resources.CustomResource {
    @OutputExport(name="pipelineActivities", type=List.class, parameters={PipelineActivity.class})
    private Output<List<PipelineActivity>> pipelineActivities;

    public Output<List<PipelineActivity>> getPipelineActivities() {
        return this.pipelineActivities;
    }
    @OutputExport(name="pipelineName", type=String.class, parameters={})
    private Output</* @Nullable */ String> pipelineName;

    public Output</* @Nullable */ String> getPipelineName() {
        return this.pipelineName;
    }
    @OutputExport(name="tags", type=List.class, parameters={PipelineTag.class})
    private Output</* @Nullable */ List<PipelineTag>> tags;

    public Output</* @Nullable */ List<PipelineTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(PipelineArgs.Builder a);
    }
    private static io.pulumi.awsnative.iotanalytics.PipelineArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.iotanalytics.PipelineArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Pipeline(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Pipeline(String name) {
        this(name, PipelineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Pipeline(String name, PipelineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Pipeline(String name, PipelineArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotanalytics:Pipeline", name, args == null ? PipelineArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Pipeline(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotanalytics:Pipeline", name, null, makeResourceOptions(options, id));
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
    public static Pipeline get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Pipeline(name, id, options);
    }
}
