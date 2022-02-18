// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.TransitGatewayConnectArgs;
import io.pulumi.awsnative.ec2.outputs.TransitGatewayConnectOptions;
import io.pulumi.awsnative.ec2.outputs.TransitGatewayConnectTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The AWS::EC2::TransitGatewayConnect type
 * 
 */
@ResourceType(type="aws-native:ec2:TransitGatewayConnect")
public class TransitGatewayConnect extends io.pulumi.resources.CustomResource {
    /**
     * The creation time.
     * 
     */
    @OutputExport(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return The creation time.
     * 
     */
    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    /**
     * The Connect attachment options.
     * 
     */
    @OutputExport(name="options", type=TransitGatewayConnectOptions.class, parameters={})
    private Output<TransitGatewayConnectOptions> options;

    /**
     * @return The Connect attachment options.
     * 
     */
    public Output<TransitGatewayConnectOptions> getOptions() {
        return this.options;
    }
    /**
     * The state of the attachment.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the attachment.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The tags for the attachment.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={TransitGatewayConnectTag.class})
    private Output</* @Nullable */ List<TransitGatewayConnectTag>> tags;

    /**
     * @return The tags for the attachment.
     * 
     */
    public Output</* @Nullable */ List<TransitGatewayConnectTag>> getTags() {
        return this.tags;
    }
    /**
     * The ID of the Connect attachment.
     * 
     */
    @OutputExport(name="transitGatewayAttachmentId", type=String.class, parameters={})
    private Output<String> transitGatewayAttachmentId;

    /**
     * @return The ID of the Connect attachment.
     * 
     */
    public Output<String> getTransitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId;
    }
    /**
     * The ID of the transit gateway.
     * 
     */
    @OutputExport(name="transitGatewayId", type=String.class, parameters={})
    private Output<String> transitGatewayId;

    /**
     * @return The ID of the transit gateway.
     * 
     */
    public Output<String> getTransitGatewayId() {
        return this.transitGatewayId;
    }
    /**
     * The ID of the attachment from which the Connect attachment was created.
     * 
     */
    @OutputExport(name="transportTransitGatewayAttachmentId", type=String.class, parameters={})
    private Output<String> transportTransitGatewayAttachmentId;

    /**
     * @return The ID of the attachment from which the Connect attachment was created.
     * 
     */
    public Output<String> getTransportTransitGatewayAttachmentId() {
        return this.transportTransitGatewayAttachmentId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransitGatewayConnect(String name, TransitGatewayConnectArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:TransitGatewayConnect", name, args == null ? TransitGatewayConnectArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private TransitGatewayConnect(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:TransitGatewayConnect", name, null, makeResourceOptions(options, id));
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
    public static TransitGatewayConnect get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TransitGatewayConnect(name, id, options);
    }
}