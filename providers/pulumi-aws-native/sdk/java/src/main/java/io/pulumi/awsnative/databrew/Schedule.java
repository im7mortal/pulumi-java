// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.databrew.ScheduleArgs;
import io.pulumi.awsnative.databrew.outputs.ScheduleTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::DataBrew::Schedule.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:databrew:Schedule")
public class Schedule extends io.pulumi.resources.CustomResource {
    /**
     * Schedule cron
     * 
     */
    @OutputExport(name="cronExpression", type=String.class, parameters={})
    private Output<String> cronExpression;

    /**
     * @return Schedule cron
     * 
     */
    public Output<String> getCronExpression() {
        return this.cronExpression;
    }
    @OutputExport(name="jobNames", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> jobNames;

    public Output</* @Nullable */ List<String>> getJobNames() {
        return this.jobNames;
    }
    /**
     * Schedule Name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Schedule Name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="tags", type=List.class, parameters={ScheduleTag.class})
    private Output</* @Nullable */ List<ScheduleTag>> tags;

    public Output</* @Nullable */ List<ScheduleTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Schedule(String name, ScheduleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:databrew:Schedule", name, args == null ? ScheduleArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Schedule(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:databrew:Schedule", name, null, makeResourceOptions(options, id));
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
    public static Schedule get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Schedule(name, id, options);
    }
}
