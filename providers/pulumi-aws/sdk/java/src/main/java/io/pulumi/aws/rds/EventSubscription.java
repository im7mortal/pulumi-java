// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.rds.EventSubscriptionArgs;
import io.pulumi.aws.rds.inputs.EventSubscriptionState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a DB event subscription resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * DB Event Subscriptions can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:rds/eventSubscription:EventSubscription default rds-event-sub
 * ```
 * 
 */
@ResourceType(type="aws:rds/eventSubscription:EventSubscription")
public class EventSubscription extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name of the RDS event notification subscription
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name of the RDS event notification subscription
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The AWS customer account associated with the RDS event notification subscription
     * 
     */
    @OutputExport(name="customerAwsId", type=String.class, parameters={})
    private Output<String> customerAwsId;

    /**
     * @return The AWS customer account associated with the RDS event notification subscription
     * 
     */
    public Output<String> getCustomerAwsId() {
        return this.customerAwsId;
    }
    /**
     * A boolean flag to enable/disable the subscription. Defaults to true.
     * 
     */
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return A boolean flag to enable/disable the subscription. Defaults to true.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    /**
     * A list of event categories for a SourceType that you want to subscribe to. See http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html or run `aws rds describe-event-categories`.
     * 
     */
    @OutputExport(name="eventCategories", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> eventCategories;

    /**
     * @return A list of event categories for a SourceType that you want to subscribe to. See http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html or run `aws rds describe-event-categories`.
     * 
     */
    public Output</* @Nullable */ List<String>> getEventCategories() {
        return this.eventCategories;
    }
    /**
     * The name of the DB event subscription. By default generated by this provider.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the DB event subscription. By default generated by this provider.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The name of the DB event subscription. Conflicts with `name`.
     * 
     */
    @OutputExport(name="namePrefix", type=String.class, parameters={})
    private Output<String> namePrefix;

    /**
     * @return The name of the DB event subscription. Conflicts with `name`.
     * 
     */
    public Output<String> getNamePrefix() {
        return this.namePrefix;
    }
    /**
     * The SNS topic to send events to.
     * 
     */
    @OutputExport(name="snsTopic", type=String.class, parameters={})
    private Output<String> snsTopic;

    /**
     * @return The SNS topic to send events to.
     * 
     */
    public Output<String> getSnsTopic() {
        return this.snsTopic;
    }
    /**
     * A list of identifiers of the event sources for which events will be returned. If not specified, then all sources are included in the response. If specified, a source_type must also be specified.
     * 
     */
    @OutputExport(name="sourceIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> sourceIds;

    /**
     * @return A list of identifiers of the event sources for which events will be returned. If not specified, then all sources are included in the response. If specified, a source_type must also be specified.
     * 
     */
    public Output</* @Nullable */ List<String>> getSourceIds() {
        return this.sourceIds;
    }
    /**
     * The type of source that will be generating the events. Valid options are `db-instance`, `db-security-group`, `db-parameter-group`, `db-snapshot`, `db-cluster` or `db-cluster-snapshot`. If not set, all sources will be subscribed to.
     * 
     */
    @OutputExport(name="sourceType", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceType;

    /**
     * @return The type of source that will be generating the events. Valid options are `db-instance`, `db-security-group`, `db-parameter-group`, `db-snapshot`, `db-cluster` or `db-cluster-snapshot`. If not set, all sources will be subscribed to.
     * 
     */
    public Output</* @Nullable */ String> getSourceType() {
        return this.sourceType;
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
        public void apply(EventSubscriptionArgs.Builder a);
    }
    private static io.pulumi.aws.rds.EventSubscriptionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.rds.EventSubscriptionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public EventSubscription(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventSubscription(String name) {
        this(name, EventSubscriptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventSubscription(String name, EventSubscriptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventSubscription(String name, EventSubscriptionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/eventSubscription:EventSubscription", name, args == null ? EventSubscriptionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private EventSubscription(String name, Input<String> id, @Nullable EventSubscriptionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/eventSubscription:EventSubscription", name, state, makeResourceOptions(options, id));
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
    public static EventSubscription get(String name, Input<String> id, @Nullable EventSubscriptionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EventSubscription(name, id, state, options);
    }
}
