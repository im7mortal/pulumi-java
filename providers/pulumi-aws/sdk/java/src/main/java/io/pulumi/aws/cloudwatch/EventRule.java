// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cloudwatch.EventRuleArgs;
import io.pulumi.aws.cloudwatch.inputs.EventRuleState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an EventBridge Rule resource.
 * 
 * > **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * EventBridge Rules can be imported using the `event_bus_name/rule_name` (if you omit `event_bus_name`, the `default` event bus will be used), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cloudwatch/eventRule:EventRule console example-event-bus/capture-console-sign-in
 * ```
 * 
 */
@ResourceType(type="aws:cloudwatch/eventRule:EventRule")
public class EventRule extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the rule.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the rule.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The description of the rule.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the rule.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The event bus to associate with this rule. If you omit this, the `default` event bus is used.
     * 
     */
    @OutputExport(name="eventBusName", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventBusName;

    /**
     * @return The event bus to associate with this rule. If you omit this, the `default` event bus is used.
     * 
     */
    public Output</* @Nullable */ String> getEventBusName() {
        return this.eventBusName;
    }
    /**
     * The event pattern described a JSON object. At least one of `schedule_expression` or `event_pattern` is required. See full documentation of [Events and Event Patterns in EventBridge](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html) for details.
     * 
     */
    @OutputExport(name="eventPattern", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventPattern;

    /**
     * @return The event pattern described a JSON object. At least one of `schedule_expression` or `event_pattern` is required. See full documentation of [Events and Event Patterns in EventBridge](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html) for details.
     * 
     */
    public Output</* @Nullable */ String> getEventPattern() {
        return this.eventPattern;
    }
    /**
     * Whether the rule should be enabled (defaults to `true`).
     * 
     */
    @OutputExport(name="isEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isEnabled;

    /**
     * @return Whether the rule should be enabled (defaults to `true`).
     * 
     */
    public Output</* @Nullable */ Boolean> getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * The name of the rule. If omitted, this provider will assign a random, unique name. Conflicts with `name_prefix`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the rule. If omitted, this provider will assign a random, unique name. Conflicts with `name_prefix`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @OutputExport(name="namePrefix", type=String.class, parameters={})
    private Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Output<String> getNamePrefix() {
        return this.namePrefix;
    }
    /**
     * The Amazon Resource Name (ARN) associated with the role that is used for target invocation.
     * 
     */
    @OutputExport(name="roleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> roleArn;

    /**
     * @return The Amazon Resource Name (ARN) associated with the role that is used for target invocation.
     * 
     */
    public Output</* @Nullable */ String> getRoleArn() {
        return this.roleArn;
    }
    /**
     * The scheduling expression. For example, `cron(0 20 * * ? *)` or `rate(5 minutes)`. At least one of `schedule_expression` or `event_pattern` is required. Can only be used on the default event bus. For more information, refer to the AWS documentation [Schedule Expressions for Rules](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html).
     * 
     */
    @OutputExport(name="scheduleExpression", type=String.class, parameters={})
    private Output</* @Nullable */ String> scheduleExpression;

    /**
     * @return The scheduling expression. For example, `cron(0 20 * * ? *)` or `rate(5 minutes)`. At least one of `schedule_expression` or `event_pattern` is required. Can only be used on the default event bus. For more information, refer to the AWS documentation [Schedule Expressions for Rules](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html).
     * 
     */
    public Output</* @Nullable */ String> getScheduleExpression() {
        return this.scheduleExpression;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        public void apply(@Nullable EventRuleArgs.Builder a);
    }
    private static io.pulumi.aws.cloudwatch.EventRuleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.cloudwatch.EventRuleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public EventRule(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventRule(String name) {
        this(name, EventRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventRule(String name, @Nullable EventRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventRule(String name, @Nullable EventRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/eventRule:EventRule", name, args == null ? EventRuleArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private EventRule(String name, Input<String> id, @Nullable EventRuleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/eventRule:EventRule", name, state, makeResourceOptions(options, id));
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
    public static EventRule get(String name, Input<String> id, @Nullable EventRuleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EventRule(name, id, state, options);
    }
}
