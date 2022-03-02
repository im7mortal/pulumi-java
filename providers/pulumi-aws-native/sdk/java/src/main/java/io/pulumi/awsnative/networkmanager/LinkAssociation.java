// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkmanager;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.networkmanager.LinkAssociationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * The AWS::NetworkManager::LinkAssociation type associates a link to a device. The device and link must be in the same global network and the same site.
 * 
 */
@ResourceType(type="aws-native:networkmanager:LinkAssociation")
public class LinkAssociation extends io.pulumi.resources.CustomResource {
    /**
     * The ID of the device
     * 
     */
    @OutputExport(name="deviceId", type=String.class, parameters={})
    private Output<String> deviceId;

    /**
     * @return The ID of the device
     * 
     */
    public Output<String> getDeviceId() {
        return this.deviceId;
    }
    /**
     * The ID of the global network.
     * 
     */
    @OutputExport(name="globalNetworkId", type=String.class, parameters={})
    private Output<String> globalNetworkId;

    /**
     * @return The ID of the global network.
     * 
     */
    public Output<String> getGlobalNetworkId() {
        return this.globalNetworkId;
    }
    /**
     * The ID of the link
     * 
     */
    @OutputExport(name="linkId", type=String.class, parameters={})
    private Output<String> linkId;

    /**
     * @return The ID of the link
     * 
     */
    public Output<String> getLinkId() {
        return this.linkId;
    }

    public interface BuilderApplicator {
        public void apply(LinkAssociationArgs.Builder a);
    }
    private static io.pulumi.awsnative.networkmanager.LinkAssociationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.networkmanager.LinkAssociationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public LinkAssociation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LinkAssociation(String name) {
        this(name, LinkAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LinkAssociation(String name, LinkAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LinkAssociation(String name, LinkAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:networkmanager:LinkAssociation", name, args == null ? LinkAssociationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private LinkAssociation(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:networkmanager:LinkAssociation", name, null, makeResourceOptions(options, id));
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
    public static LinkAssociation get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LinkAssociation(name, id, options);
    }
}
