// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.detective;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.detective.MemberInvitationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::Detective::MemberInvitation
 * 
 */
@ResourceType(type="aws-native:detective:MemberInvitation")
public class MemberInvitation extends io.pulumi.resources.CustomResource {
    /**
     * When set to true, invitation emails are not sent to the member accounts. Member accounts must still accept the invitation before they are added to the behavior graph. Updating this field has no effect.
     * 
     */
    @OutputExport(name="disableEmailNotification", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disableEmailNotification;

    /**
     * @return When set to true, invitation emails are not sent to the member accounts. Member accounts must still accept the invitation before they are added to the behavior graph. Updating this field has no effect.
     * 
     */
    public Output</* @Nullable */ Boolean> getDisableEmailNotification() {
        return this.disableEmailNotification;
    }
    /**
     * The ARN of the graph to which the member account will be invited
     * 
     */
    @OutputExport(name="graphArn", type=String.class, parameters={})
    private Output<String> graphArn;

    /**
     * @return The ARN of the graph to which the member account will be invited
     * 
     */
    public Output<String> getGraphArn() {
        return this.graphArn;
    }
    /**
     * The root email address for the account to be invited, for validation. Updating this field has no effect.
     * 
     */
    @OutputExport(name="memberEmailAddress", type=String.class, parameters={})
    private Output<String> memberEmailAddress;

    /**
     * @return The root email address for the account to be invited, for validation. Updating this field has no effect.
     * 
     */
    public Output<String> getMemberEmailAddress() {
        return this.memberEmailAddress;
    }
    /**
     * The AWS account ID to be invited to join the graph as a member
     * 
     */
    @OutputExport(name="memberId", type=String.class, parameters={})
    private Output<String> memberId;

    /**
     * @return The AWS account ID to be invited to join the graph as a member
     * 
     */
    public Output<String> getMemberId() {
        return this.memberId;
    }
    /**
     * A message to be included in the email invitation sent to the invited account. Updating this field has no effect.
     * 
     */
    @OutputExport(name="message", type=String.class, parameters={})
    private Output</* @Nullable */ String> message;

    /**
     * @return A message to be included in the email invitation sent to the invited account. Updating this field has no effect.
     * 
     */
    public Output</* @Nullable */ String> getMessage() {
        return this.message;
    }

    public interface BuilderApplicator {
        public void apply(MemberInvitationArgs.Builder a);
    }
    private static io.pulumi.awsnative.detective.MemberInvitationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.detective.MemberInvitationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public MemberInvitation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MemberInvitation(String name) {
        this(name, MemberInvitationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MemberInvitation(String name, MemberInvitationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MemberInvitation(String name, MemberInvitationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:detective:MemberInvitation", name, args == null ? MemberInvitationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private MemberInvitation(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:detective:MemberInvitation", name, null, makeResourceOptions(options, id));
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
    public static MemberInvitation get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MemberInvitation(name, id, options);
    }
}
