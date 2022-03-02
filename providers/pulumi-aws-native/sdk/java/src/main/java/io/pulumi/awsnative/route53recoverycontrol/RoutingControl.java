// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoverycontrol;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.route53recoverycontrol.RoutingControlArgs;
import io.pulumi.awsnative.route53recoverycontrol.enums.RoutingControlStatus;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * AWS Route53 Recovery Control Routing Control resource schema .
 * 
 */
@ResourceType(type="aws-native:route53recoverycontrol:RoutingControl")
public class RoutingControl extends io.pulumi.resources.CustomResource {
    /**
     * Arn associated with Control Panel
     * 
     */
    @OutputExport(name="clusterArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> clusterArn;

    /**
     * @return Arn associated with Control Panel
     * 
     */
    public Output</* @Nullable */ String> getClusterArn() {
        return this.clusterArn;
    }
    /**
     * The Amazon Resource Name (ARN) of the control panel.
     * 
     */
    @OutputExport(name="controlPanelArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> controlPanelArn;

    /**
     * @return The Amazon Resource Name (ARN) of the control panel.
     * 
     */
    public Output</* @Nullable */ String> getControlPanelArn() {
        return this.controlPanelArn;
    }
    /**
     * The name of the routing control. You can use any non-white space character in the name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the routing control. You can use any non-white space character in the name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The Amazon Resource Name (ARN) of the routing control.
     * 
     */
    @OutputExport(name="routingControlArn", type=String.class, parameters={})
    private Output<String> routingControlArn;

    /**
     * @return The Amazon Resource Name (ARN) of the routing control.
     * 
     */
    public Output<String> getRoutingControlArn() {
        return this.routingControlArn;
    }
    /**
     * The deployment status of the routing control. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * 
     */
    @OutputExport(name="status", type=RoutingControlStatus.class, parameters={})
    private Output<RoutingControlStatus> status;

    /**
     * @return The deployment status of the routing control. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * 
     */
    public Output<RoutingControlStatus> getStatus() {
        return this.status;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable RoutingControlArgs.Builder a);
    }
    private static io.pulumi.awsnative.route53recoverycontrol.RoutingControlArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.route53recoverycontrol.RoutingControlArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public RoutingControl(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RoutingControl(String name) {
        this(name, RoutingControlArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RoutingControl(String name, @Nullable RoutingControlArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RoutingControl(String name, @Nullable RoutingControlArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:route53recoverycontrol:RoutingControl", name, args == null ? RoutingControlArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RoutingControl(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:route53recoverycontrol:RoutingControl", name, null, makeResourceOptions(options, id));
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
    public static RoutingControl get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RoutingControl(name, id, options);
    }
}
