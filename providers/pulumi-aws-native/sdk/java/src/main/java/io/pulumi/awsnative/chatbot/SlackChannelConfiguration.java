// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.chatbot;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.chatbot.SlackChannelConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::Chatbot::SlackChannelConfiguration.
 * 
 */
@ResourceType(type="aws-native:chatbot:SlackChannelConfiguration")
public class SlackChannelConfiguration extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the configuration
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the configuration
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The name of the configuration
     * 
     */
    @OutputExport(name="configurationName", type=String.class, parameters={})
    private Output<String> configurationName;

    /**
     * @return The name of the configuration
     * 
     */
    public Output<String> getConfigurationName() {
        return this.configurationName;
    }
    /**
     * The list of IAM policy ARNs that are applied as channel guardrails. The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
     * 
     */
    @OutputExport(name="guardrailPolicies", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> guardrailPolicies;

    /**
     * @return The list of IAM policy ARNs that are applied as channel guardrails. The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
     * 
     */
    public Output</* @Nullable */ List<String>> getGuardrailPolicies() {
        return this.guardrailPolicies;
    }
    /**
     * The ARN of the IAM role that defines the permissions for AWS Chatbot
     * 
     */
    @OutputExport(name="iamRoleArn", type=String.class, parameters={})
    private Output<String> iamRoleArn;

    /**
     * @return The ARN of the IAM role that defines the permissions for AWS Chatbot
     * 
     */
    public Output<String> getIamRoleArn() {
        return this.iamRoleArn;
    }
    /**
     * Specifies the logging level for this configuration:ERROR,INFO or NONE. This property affects the log entries pushed to Amazon CloudWatch logs
     * 
     */
    @OutputExport(name="loggingLevel", type=String.class, parameters={})
    private Output</* @Nullable */ String> loggingLevel;

    /**
     * @return Specifies the logging level for this configuration:ERROR,INFO or NONE. This property affects the log entries pushed to Amazon CloudWatch logs
     * 
     */
    public Output</* @Nullable */ String> getLoggingLevel() {
        return this.loggingLevel;
    }
    /**
     * The id of the Slack channel
     * 
     */
    @OutputExport(name="slackChannelId", type=String.class, parameters={})
    private Output<String> slackChannelId;

    /**
     * @return The id of the Slack channel
     * 
     */
    public Output<String> getSlackChannelId() {
        return this.slackChannelId;
    }
    /**
     * The id of the Slack workspace
     * 
     */
    @OutputExport(name="slackWorkspaceId", type=String.class, parameters={})
    private Output<String> slackWorkspaceId;

    /**
     * @return The id of the Slack workspace
     * 
     */
    public Output<String> getSlackWorkspaceId() {
        return this.slackWorkspaceId;
    }
    /**
     * ARNs of SNS topics which delivers notifications to AWS Chatbot, for example CloudWatch alarm notifications.
     * 
     */
    @OutputExport(name="snsTopicArns", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> snsTopicArns;

    /**
     * @return ARNs of SNS topics which delivers notifications to AWS Chatbot, for example CloudWatch alarm notifications.
     * 
     */
    public Output</* @Nullable */ List<String>> getSnsTopicArns() {
        return this.snsTopicArns;
    }
    /**
     * Enables use of a user role requirement in your chat configuration
     * 
     */
    @OutputExport(name="userRoleRequired", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> userRoleRequired;

    /**
     * @return Enables use of a user role requirement in your chat configuration
     * 
     */
    public Output</* @Nullable */ Boolean> getUserRoleRequired() {
        return this.userRoleRequired;
    }

    public interface BuilderApplicator {
        public void apply(SlackChannelConfigurationArgs.Builder a);
    }
    private static io.pulumi.awsnative.chatbot.SlackChannelConfigurationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.chatbot.SlackChannelConfigurationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SlackChannelConfiguration(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SlackChannelConfiguration(String name) {
        this(name, SlackChannelConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SlackChannelConfiguration(String name, SlackChannelConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SlackChannelConfiguration(String name, SlackChannelConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:chatbot:SlackChannelConfiguration", name, args == null ? SlackChannelConfigurationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SlackChannelConfiguration(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:chatbot:SlackChannelConfiguration", name, null, makeResourceOptions(options, id));
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
    public static SlackChannelConfiguration get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SlackChannelConfiguration(name, id, options);
    }
}
