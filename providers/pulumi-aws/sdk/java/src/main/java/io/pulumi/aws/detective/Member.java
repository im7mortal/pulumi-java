// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.detective;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.detective.MemberArgs;
import io.pulumi.aws.detective.inputs.MemberState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage an [Amazon Detective Member](https://docs.aws.amazon.com/detective/latest/APIReference/API_CreateMembers.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_detective_member` can be imported using the ARN of the graph followed by the account ID of the member account, e.g.
 * 
 * ```sh
 *  $ pulumi import aws:detective/member:Member example arn:aws:detective:us-east-1:123456789101:graph:231684d34gh74g4bae1dbc7bd807d02d/123456789012
 * ```
 * 
 */
@ResourceType(type="aws:detective/member:Member")
public class Member extends io.pulumi.resources.CustomResource {
    /**
     * AWS account ID for the account.
     * 
     */
    @OutputExport(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    /**
     * @return AWS account ID for the account.
     * 
     */
    public Output<String> getAccountId() {
        return this.accountId;
    }
    /**
     * AWS account ID for the administrator account.
     * 
     */
    @OutputExport(name="administratorId", type=String.class, parameters={})
    private Output<String> administratorId;

    /**
     * @return AWS account ID for the administrator account.
     * 
     */
    public Output<String> getAdministratorId() {
        return this.administratorId;
    }
    /**
     * If set to true, then the root user of the invited account will _not_ receive an email notification. This notification is in addition to an alert that the root user receives in AWS Personal Health Dashboard. By default, this is set to `false`.
     * 
     */
    @OutputExport(name="disableEmailNotification", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disableEmailNotification;

    /**
     * @return If set to true, then the root user of the invited account will _not_ receive an email notification. This notification is in addition to an alert that the root user receives in AWS Personal Health Dashboard. By default, this is set to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getDisableEmailNotification() {
        return this.disableEmailNotification;
    }
    @OutputExport(name="disabledReason", type=String.class, parameters={})
    private Output<String> disabledReason;

    public Output<String> getDisabledReason() {
        return this.disabledReason;
    }
    /**
     * Email address for the account.
     * 
     */
    @OutputExport(name="emailAddress", type=String.class, parameters={})
    private Output<String> emailAddress;

    /**
     * @return Email address for the account.
     * 
     */
    public Output<String> getEmailAddress() {
        return this.emailAddress;
    }
    /**
     * ARN of the behavior graph to invite the member accounts to contribute their data to.
     * 
     */
    @OutputExport(name="graphArn", type=String.class, parameters={})
    private Output<String> graphArn;

    /**
     * @return ARN of the behavior graph to invite the member accounts to contribute their data to.
     * 
     */
    public Output<String> getGraphArn() {
        return this.graphArn;
    }
    /**
     * Date and time, in UTC and extended RFC 3339 format, when an Amazon Detective membership invitation was last sent to the account.
     * 
     */
    @OutputExport(name="invitedTime", type=String.class, parameters={})
    private Output<String> invitedTime;

    /**
     * @return Date and time, in UTC and extended RFC 3339 format, when an Amazon Detective membership invitation was last sent to the account.
     * 
     */
    public Output<String> getInvitedTime() {
        return this.invitedTime;
    }
    /**
     * A custom message to include in the invitation. Amazon Detective adds this message to the standard content that it sends for an invitation.
     * 
     */
    @OutputExport(name="message", type=String.class, parameters={})
    private Output</* @Nullable */ String> message;

    /**
     * @return A custom message to include in the invitation. Amazon Detective adds this message to the standard content that it sends for an invitation.
     * 
     */
    public Output</* @Nullable */ String> getMessage() {
        return this.message;
    }
    /**
     * Current membership status of the member account.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Current membership status of the member account.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * Date and time, in UTC and extended RFC 3339 format, of the most recent change to the member account's status.
     * 
     */
    @OutputExport(name="updatedTime", type=String.class, parameters={})
    private Output<String> updatedTime;

    /**
     * @return Date and time, in UTC and extended RFC 3339 format, of the most recent change to the member account's status.
     * 
     */
    public Output<String> getUpdatedTime() {
        return this.updatedTime;
    }
    /**
     * Data volume in bytes per day for the member account.
     * 
     */
    @OutputExport(name="volumeUsageInBytes", type=String.class, parameters={})
    private Output<String> volumeUsageInBytes;

    /**
     * @return Data volume in bytes per day for the member account.
     * 
     */
    public Output<String> getVolumeUsageInBytes() {
        return this.volumeUsageInBytes;
    }

    public interface BuilderApplicator {
        public void apply(MemberArgs.Builder a);
    }
    private static io.pulumi.aws.detective.MemberArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.detective.MemberArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Member(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Member(String name) {
        this(name, MemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Member(String name, MemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Member(String name, MemberArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:detective/member:Member", name, args == null ? MemberArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Member(String name, Input<String> id, @Nullable MemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:detective/member:Member", name, state, makeResourceOptions(options, id));
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
    public static Member get(String name, Input<String> id, @Nullable MemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Member(name, id, state, options);
    }
}
