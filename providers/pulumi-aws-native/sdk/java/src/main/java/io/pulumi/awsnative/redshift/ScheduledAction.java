// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.redshift.ScheduledActionArgs;
import io.pulumi.awsnative.redshift.enums.ScheduledActionState;
import io.pulumi.awsnative.redshift.outputs.ScheduledActionType;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The `AWS::Redshift::ScheduledAction` resource creates an Amazon Redshift Scheduled Action.
 * 
 */
@ResourceType(type="aws-native:redshift:ScheduledAction")
public class ScheduledAction extends io.pulumi.resources.CustomResource {
    /**
     * If true, the schedule is enabled. If false, the scheduled action does not trigger.
     * 
     */
    @OutputExport(name="enable", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enable;

    /**
     * @return If true, the schedule is enabled. If false, the scheduled action does not trigger.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnable() {
        return this.enable;
    }
    /**
     * The end time in UTC of the scheduled action. After this time, the scheduled action does not trigger.
     * 
     */
    @OutputExport(name="endTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> endTime;

    /**
     * @return The end time in UTC of the scheduled action. After this time, the scheduled action does not trigger.
     * 
     */
    public Output</* @Nullable */ String> getEndTime() {
        return this.endTime;
    }
    /**
     * The IAM role to assume to run the target action.
     * 
     */
    @OutputExport(name="iamRole", type=String.class, parameters={})
    private Output</* @Nullable */ String> iamRole;

    /**
     * @return The IAM role to assume to run the target action.
     * 
     */
    public Output</* @Nullable */ String> getIamRole() {
        return this.iamRole;
    }
    /**
     * List of times when the scheduled action will run.
     * 
     */
    @OutputExport(name="nextInvocations", type=List.class, parameters={String.class})
    private Output<List<String>> nextInvocations;

    /**
     * @return List of times when the scheduled action will run.
     * 
     */
    public Output<List<String>> getNextInvocations() {
        return this.nextInvocations;
    }
    /**
     * The schedule in `at( )` or `cron( )` format.
     * 
     */
    @OutputExport(name="schedule", type=String.class, parameters={})
    private Output</* @Nullable */ String> schedule;

    /**
     * @return The schedule in `at( )` or `cron( )` format.
     * 
     */
    public Output</* @Nullable */ String> getSchedule() {
        return this.schedule;
    }
    /**
     * The description of the scheduled action.
     * 
     */
    @OutputExport(name="scheduledActionDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> scheduledActionDescription;

    /**
     * @return The description of the scheduled action.
     * 
     */
    public Output</* @Nullable */ String> getScheduledActionDescription() {
        return this.scheduledActionDescription;
    }
    /**
     * The name of the scheduled action. The name must be unique within an account.
     * 
     */
    @OutputExport(name="scheduledActionName", type=String.class, parameters={})
    private Output<String> scheduledActionName;

    /**
     * @return The name of the scheduled action. The name must be unique within an account.
     * 
     */
    public Output<String> getScheduledActionName() {
        return this.scheduledActionName;
    }
    /**
     * The start time in UTC of the scheduled action. Before this time, the scheduled action does not trigger.
     * 
     */
    @OutputExport(name="startTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> startTime;

    /**
     * @return The start time in UTC of the scheduled action. Before this time, the scheduled action does not trigger.
     * 
     */
    public Output</* @Nullable */ String> getStartTime() {
        return this.startTime;
    }
    /**
     * The state of the scheduled action.
     * 
     */
    @OutputExport(name="state", type=ScheduledActionState.class, parameters={})
    private Output<ScheduledActionState> state;

    /**
     * @return The state of the scheduled action.
     * 
     */
    public Output<ScheduledActionState> getState() {
        return this.state;
    }
    /**
     * A JSON format string of the Amazon Redshift API operation with input parameters.
     * 
     */
    @OutputExport(name="targetAction", type=ScheduledActionType.class, parameters={})
    private Output</* @Nullable */ ScheduledActionType> targetAction;

    /**
     * @return A JSON format string of the Amazon Redshift API operation with input parameters.
     * 
     */
    public Output</* @Nullable */ ScheduledActionType> getTargetAction() {
        return this.targetAction;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ScheduledAction(String name, @Nullable ScheduledActionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:redshift:ScheduledAction", name, args == null ? ScheduledActionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ScheduledAction(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:redshift:ScheduledAction", name, null, makeResourceOptions(options, id));
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
    public static ScheduledAction get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ScheduledAction(name, id, options);
    }
}
