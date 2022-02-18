// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.globalaccelerator;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.globalaccelerator.ListenerArgs;
import io.pulumi.awsnative.globalaccelerator.enums.ListenerClientAffinity;
import io.pulumi.awsnative.globalaccelerator.enums.ListenerProtocol;
import io.pulumi.awsnative.globalaccelerator.outputs.ListenerPortRange;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::GlobalAccelerator::Listener
 * 
 */
@ResourceType(type="aws-native:globalaccelerator:Listener")
public class Listener extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the accelerator.
     * 
     */
    @OutputExport(name="acceleratorArn", type=String.class, parameters={})
    private Output<String> acceleratorArn;

    /**
     * @return The Amazon Resource Name (ARN) of the accelerator.
     * 
     */
    public Output<String> getAcceleratorArn() {
        return this.acceleratorArn;
    }
    /**
     * Client affinity lets you direct all requests from a user to the same endpoint.
     * 
     */
    @OutputExport(name="clientAffinity", type=ListenerClientAffinity.class, parameters={})
    private Output</* @Nullable */ ListenerClientAffinity> clientAffinity;

    /**
     * @return Client affinity lets you direct all requests from a user to the same endpoint.
     * 
     */
    public Output</* @Nullable */ ListenerClientAffinity> getClientAffinity() {
        return this.clientAffinity;
    }
    /**
     * The Amazon Resource Name (ARN) of the listener.
     * 
     */
    @OutputExport(name="listenerArn", type=String.class, parameters={})
    private Output<String> listenerArn;

    /**
     * @return The Amazon Resource Name (ARN) of the listener.
     * 
     */
    public Output<String> getListenerArn() {
        return this.listenerArn;
    }
    @OutputExport(name="portRanges", type=List.class, parameters={ListenerPortRange.class})
    private Output<List<ListenerPortRange>> portRanges;

    public Output<List<ListenerPortRange>> getPortRanges() {
        return this.portRanges;
    }
    /**
     * The protocol for the listener.
     * 
     */
    @OutputExport(name="protocol", type=ListenerProtocol.class, parameters={})
    private Output<ListenerProtocol> protocol;

    /**
     * @return The protocol for the listener.
     * 
     */
    public Output<ListenerProtocol> getProtocol() {
        return this.protocol;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Listener(String name, ListenerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:globalaccelerator:Listener", name, args == null ? ListenerArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Listener(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:globalaccelerator:Listener", name, null, makeResourceOptions(options, id));
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
    public static Listener get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Listener(name, id, options);
    }
}
