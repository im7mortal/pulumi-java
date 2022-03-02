// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.VpcEndpointConnectionNotificationArgs;
import io.pulumi.aws.ec2.inputs.VpcEndpointConnectionNotificationState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a VPC Endpoint connection notification resource.
 * Connection notifications notify subscribers of VPC Endpoint events.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * VPC Endpoint connection notifications can be imported using the `VPC endpoint connection notification id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/vpcEndpointConnectionNotification:VpcEndpointConnectionNotification foo vpce-nfn-09e6ed3b4efba2263
 * ```
 * 
 */
@ResourceType(type="aws:ec2/vpcEndpointConnectionNotification:VpcEndpointConnectionNotification")
public class VpcEndpointConnectionNotification extends io.pulumi.resources.CustomResource {
    /**
     * One or more endpoint [events](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVpcEndpointConnectionNotification.html#API_CreateVpcEndpointConnectionNotification_RequestParameters) for which to receive notifications.
     * 
     */
    @OutputExport(name="connectionEvents", type=List.class, parameters={String.class})
    private Output<List<String>> connectionEvents;

    /**
     * @return One or more endpoint [events](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVpcEndpointConnectionNotification.html#API_CreateVpcEndpointConnectionNotification_RequestParameters) for which to receive notifications.
     * 
     */
    public Output<List<String>> getConnectionEvents() {
        return this.connectionEvents;
    }
    /**
     * The ARN of the SNS topic for the notifications.
     * 
     */
    @OutputExport(name="connectionNotificationArn", type=String.class, parameters={})
    private Output<String> connectionNotificationArn;

    /**
     * @return The ARN of the SNS topic for the notifications.
     * 
     */
    public Output<String> getConnectionNotificationArn() {
        return this.connectionNotificationArn;
    }
    /**
     * The type of notification.
     * 
     */
    @OutputExport(name="notificationType", type=String.class, parameters={})
    private Output<String> notificationType;

    /**
     * @return The type of notification.
     * 
     */
    public Output<String> getNotificationType() {
        return this.notificationType;
    }
    /**
     * The state of the notification.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the notification.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The ID of the VPC Endpoint to receive notifications for.
     * 
     */
    @OutputExport(name="vpcEndpointId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vpcEndpointId;

    /**
     * @return The ID of the VPC Endpoint to receive notifications for.
     * 
     */
    public Output</* @Nullable */ String> getVpcEndpointId() {
        return this.vpcEndpointId;
    }
    /**
     * The ID of the VPC Endpoint Service to receive notifications for.
     * 
     */
    @OutputExport(name="vpcEndpointServiceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vpcEndpointServiceId;

    /**
     * @return The ID of the VPC Endpoint Service to receive notifications for.
     * 
     */
    public Output</* @Nullable */ String> getVpcEndpointServiceId() {
        return this.vpcEndpointServiceId;
    }

    public interface BuilderApplicator {
        public void apply(VpcEndpointConnectionNotificationArgs.Builder a);
    }
    private static io.pulumi.aws.ec2.VpcEndpointConnectionNotificationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ec2.VpcEndpointConnectionNotificationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public VpcEndpointConnectionNotification(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcEndpointConnectionNotification(String name) {
        this(name, VpcEndpointConnectionNotificationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcEndpointConnectionNotification(String name, VpcEndpointConnectionNotificationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcEndpointConnectionNotification(String name, VpcEndpointConnectionNotificationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcEndpointConnectionNotification:VpcEndpointConnectionNotification", name, args == null ? VpcEndpointConnectionNotificationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private VpcEndpointConnectionNotification(String name, Input<String> id, @Nullable VpcEndpointConnectionNotificationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcEndpointConnectionNotification:VpcEndpointConnectionNotification", name, state, makeResourceOptions(options, id));
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
    public static VpcEndpointConnectionNotification get(String name, Input<String> id, @Nullable VpcEndpointConnectionNotificationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VpcEndpointConnectionNotification(name, id, state, options);
    }
}
