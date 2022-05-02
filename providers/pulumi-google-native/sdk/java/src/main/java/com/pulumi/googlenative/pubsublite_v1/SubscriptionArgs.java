// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsublite_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.pubsublite_v1.inputs.DeliveryConfigArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubscriptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubscriptionArgs Empty = new SubscriptionArgs();

    /**
     * The settings for this subscription&#39;s message delivery.
     * 
     */
    @Import(name="deliveryConfig")
    private @Nullable Output<DeliveryConfigArgs> deliveryConfig;

    /**
     * @return The settings for this subscription&#39;s message delivery.
     * 
     */
    public Optional<Output<DeliveryConfigArgs>> deliveryConfig() {
        return Optional.ofNullable(this.deliveryConfig);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the subscription. Structured like: projects/{project_number}/locations/{location}/subscriptions/{subscription_id}
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the subscription. Structured like: projects/{project_number}/locations/{location}/subscriptions/{subscription_id}
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * If true, the newly created subscription will only receive messages published after the subscription was created. Otherwise, the entire message backlog will be received on the subscription. Defaults to false.
     * 
     */
    @Import(name="skipBacklog")
    private @Nullable Output<String> skipBacklog;

    /**
     * @return If true, the newly created subscription will only receive messages published after the subscription was created. Otherwise, the entire message backlog will be received on the subscription. Defaults to false.
     * 
     */
    public Optional<Output<String>> skipBacklog() {
        return Optional.ofNullable(this.skipBacklog);
    }

    /**
     * Required. The ID to use for the subscription, which will become the final component of the subscription&#39;s name. This value is structured like: `my-sub-name`.
     * 
     */
    @Import(name="subscriptionId", required=true)
    private Output<String> subscriptionId;

    /**
     * @return Required. The ID to use for the subscription, which will become the final component of the subscription&#39;s name. This value is structured like: `my-sub-name`.
     * 
     */
    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * The name of the topic this subscription is attached to. Structured like: projects/{project_number}/locations/{location}/topics/{topic_id}
     * 
     */
    @Import(name="topic")
    private @Nullable Output<String> topic;

    /**
     * @return The name of the topic this subscription is attached to. Structured like: projects/{project_number}/locations/{location}/topics/{topic_id}
     * 
     */
    public Optional<Output<String>> topic() {
        return Optional.ofNullable(this.topic);
    }

    private SubscriptionArgs() {}

    private SubscriptionArgs(SubscriptionArgs $) {
        this.deliveryConfig = $.deliveryConfig;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.skipBacklog = $.skipBacklog;
        this.subscriptionId = $.subscriptionId;
        this.topic = $.topic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubscriptionArgs $;

        public Builder() {
            $ = new SubscriptionArgs();
        }

        public Builder(SubscriptionArgs defaults) {
            $ = new SubscriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deliveryConfig The settings for this subscription&#39;s message delivery.
         * 
         * @return builder
         * 
         */
        public Builder deliveryConfig(@Nullable Output<DeliveryConfigArgs> deliveryConfig) {
            $.deliveryConfig = deliveryConfig;
            return this;
        }

        /**
         * @param deliveryConfig The settings for this subscription&#39;s message delivery.
         * 
         * @return builder
         * 
         */
        public Builder deliveryConfig(DeliveryConfigArgs deliveryConfig) {
            return deliveryConfig(Output.of(deliveryConfig));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the subscription. Structured like: projects/{project_number}/locations/{location}/subscriptions/{subscription_id}
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the subscription. Structured like: projects/{project_number}/locations/{location}/subscriptions/{subscription_id}
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param skipBacklog If true, the newly created subscription will only receive messages published after the subscription was created. Otherwise, the entire message backlog will be received on the subscription. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder skipBacklog(@Nullable Output<String> skipBacklog) {
            $.skipBacklog = skipBacklog;
            return this;
        }

        /**
         * @param skipBacklog If true, the newly created subscription will only receive messages published after the subscription was created. Otherwise, the entire message backlog will be received on the subscription. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder skipBacklog(String skipBacklog) {
            return skipBacklog(Output.of(skipBacklog));
        }

        /**
         * @param subscriptionId Required. The ID to use for the subscription, which will become the final component of the subscription&#39;s name. This value is structured like: `my-sub-name`.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(Output<String> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param subscriptionId Required. The ID to use for the subscription, which will become the final component of the subscription&#39;s name. This value is structured like: `my-sub-name`.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(String subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        /**
         * @param topic The name of the topic this subscription is attached to. Structured like: projects/{project_number}/locations/{location}/topics/{topic_id}
         * 
         * @return builder
         * 
         */
        public Builder topic(@Nullable Output<String> topic) {
            $.topic = topic;
            return this;
        }

        /**
         * @param topic The name of the topic this subscription is attached to. Structured like: projects/{project_number}/locations/{location}/topics/{topic_id}
         * 
         * @return builder
         * 
         */
        public Builder topic(String topic) {
            return topic(Output.of(topic));
        }

        public SubscriptionArgs build() {
            $.subscriptionId = Objects.requireNonNull($.subscriptionId, "expected parameter 'subscriptionId' to be non-null");
            return $;
        }
    }

}
