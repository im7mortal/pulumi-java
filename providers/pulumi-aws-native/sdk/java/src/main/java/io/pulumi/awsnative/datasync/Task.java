// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.datasync.TaskArgs;
import io.pulumi.awsnative.datasync.enums.TaskStatus;
import io.pulumi.awsnative.datasync.outputs.TaskFilterRule;
import io.pulumi.awsnative.datasync.outputs.TaskOptions;
import io.pulumi.awsnative.datasync.outputs.TaskSchedule;
import io.pulumi.awsnative.datasync.outputs.TaskTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::DataSync::Task.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:datasync:Task")
public class Task extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the Amazon CloudWatch log group that is used to monitor and log events in the task.
     * 
     */
    @OutputExport(name="cloudWatchLogGroupArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> cloudWatchLogGroupArn;

    /**
     * @return The ARN of the Amazon CloudWatch log group that is used to monitor and log events in the task.
     * 
     */
    public Output</* @Nullable */ String> getCloudWatchLogGroupArn() {
        return this.cloudWatchLogGroupArn;
    }
    /**
     * The ARN of an AWS storage resource's location.
     * 
     */
    @OutputExport(name="destinationLocationArn", type=String.class, parameters={})
    private Output<String> destinationLocationArn;

    /**
     * @return The ARN of an AWS storage resource's location.
     * 
     */
    public Output<String> getDestinationLocationArn() {
        return this.destinationLocationArn;
    }
    @OutputExport(name="destinationNetworkInterfaceArns", type=List.class, parameters={String.class})
    private Output<List<String>> destinationNetworkInterfaceArns;

    public Output<List<String>> getDestinationNetworkInterfaceArns() {
        return this.destinationNetworkInterfaceArns;
    }
    /**
     * Errors that AWS DataSync encountered during execution of the task. You can use this error code to help troubleshoot issues.
     * 
     */
    @OutputExport(name="errorCode", type=String.class, parameters={})
    private Output<String> errorCode;

    /**
     * @return Errors that AWS DataSync encountered during execution of the task. You can use this error code to help troubleshoot issues.
     * 
     */
    public Output<String> getErrorCode() {
        return this.errorCode;
    }
    /**
     * Detailed description of an error that was encountered during the task execution.
     * 
     */
    @OutputExport(name="errorDetail", type=String.class, parameters={})
    private Output<String> errorDetail;

    /**
     * @return Detailed description of an error that was encountered during the task execution.
     * 
     */
    public Output<String> getErrorDetail() {
        return this.errorDetail;
    }
    @OutputExport(name="excludes", type=List.class, parameters={TaskFilterRule.class})
    private Output</* @Nullable */ List<TaskFilterRule>> excludes;

    public Output</* @Nullable */ List<TaskFilterRule>> getExcludes() {
        return this.excludes;
    }
    @OutputExport(name="includes", type=List.class, parameters={TaskFilterRule.class})
    private Output</* @Nullable */ List<TaskFilterRule>> includes;

    public Output</* @Nullable */ List<TaskFilterRule>> getIncludes() {
        return this.includes;
    }
    /**
     * The name of a task. This value is a text reference that is used to identify the task in the console.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of a task. This value is a text reference that is used to identify the task in the console.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    @OutputExport(name="options", type=TaskOptions.class, parameters={})
    private Output</* @Nullable */ TaskOptions> options;

    public Output</* @Nullable */ TaskOptions> getOptions() {
        return this.options;
    }
    @OutputExport(name="schedule", type=TaskSchedule.class, parameters={})
    private Output</* @Nullable */ TaskSchedule> schedule;

    public Output</* @Nullable */ TaskSchedule> getSchedule() {
        return this.schedule;
    }
    /**
     * The ARN of the source location for the task.
     * 
     */
    @OutputExport(name="sourceLocationArn", type=String.class, parameters={})
    private Output<String> sourceLocationArn;

    /**
     * @return The ARN of the source location for the task.
     * 
     */
    public Output<String> getSourceLocationArn() {
        return this.sourceLocationArn;
    }
    @OutputExport(name="sourceNetworkInterfaceArns", type=List.class, parameters={String.class})
    private Output<List<String>> sourceNetworkInterfaceArns;

    public Output<List<String>> getSourceNetworkInterfaceArns() {
        return this.sourceNetworkInterfaceArns;
    }
    /**
     * The status of the task that was described.
     * 
     */
    @OutputExport(name="status", type=TaskStatus.class, parameters={})
    private Output<TaskStatus> status;

    /**
     * @return The status of the task that was described.
     * 
     */
    public Output<TaskStatus> getStatus() {
        return this.status;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={TaskTag.class})
    private Output</* @Nullable */ List<TaskTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<TaskTag>> getTags() {
        return this.tags;
    }
    /**
     * The ARN of the task.
     * 
     */
    @OutputExport(name="taskArn", type=String.class, parameters={})
    private Output<String> taskArn;

    /**
     * @return The ARN of the task.
     * 
     */
    public Output<String> getTaskArn() {
        return this.taskArn;
    }

    public interface BuilderApplicator {
        public void apply(TaskArgs.Builder a);
    }
    private static io.pulumi.awsnative.datasync.TaskArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.datasync.TaskArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Task(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Task(String name) {
        this(name, TaskArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Task(String name, TaskArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Task(String name, TaskArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:datasync:Task", name, args == null ? TaskArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Task(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:datasync:Task", name, null, makeResourceOptions(options, id));
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
    public static Task get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Task(name, id, options);
    }
}
