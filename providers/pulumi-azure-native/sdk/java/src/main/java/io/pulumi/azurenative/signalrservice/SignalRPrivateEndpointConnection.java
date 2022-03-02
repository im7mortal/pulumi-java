// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.signalrservice;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.signalrservice.SignalRPrivateEndpointConnectionArgs;
import io.pulumi.azurenative.signalrservice.outputs.PrivateEndpointResponse;
import io.pulumi.azurenative.signalrservice.outputs.PrivateLinkServiceConnectionStateResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A private endpoint connection to SignalR resource
 * API Version: 2020-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:signalrservice:SignalRPrivateEndpointConnection mySignalRService.1fa229cd-bf3f-47f0-8c49-afb36723997e /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/myResourceGroup/providers/Microsoft.SignalRService/SignalR/mySignalRService/privateEndpointConnections/mySignalRService.1fa229cd-bf3f-47f0-8c49-afb36723997e 
 * ```
 * 
 */
@ResourceType(type="azure-native:signalrservice:SignalRPrivateEndpointConnection")
public class SignalRPrivateEndpointConnection extends io.pulumi.resources.CustomResource {
    /**
     * The name of the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Private endpoint associated with the private endpoint connection
     * 
     */
    @OutputExport(name="privateEndpoint", type=PrivateEndpointResponse.class, parameters={})
    private Output</* @Nullable */ PrivateEndpointResponse> privateEndpoint;

    /**
     * @return Private endpoint associated with the private endpoint connection
     * 
     */
    public Output</* @Nullable */ PrivateEndpointResponse> getPrivateEndpoint() {
        return this.privateEndpoint;
    }
    /**
     * Connection state
     * 
     */
    @OutputExport(name="privateLinkServiceConnectionState", type=PrivateLinkServiceConnectionStateResponse.class, parameters={})
    private Output</* @Nullable */ PrivateLinkServiceConnectionStateResponse> privateLinkServiceConnectionState;

    /**
     * @return Connection state
     * 
     */
    public Output</* @Nullable */ PrivateLinkServiceConnectionStateResponse> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }
    /**
     * Provisioning state of the private endpoint connection
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the private endpoint connection
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The type of the resource - e.g. "Microsoft.SignalRService/SignalR"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource - e.g. "Microsoft.SignalRService/SignalR"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(SignalRPrivateEndpointConnectionArgs.Builder a);
    }
    private static io.pulumi.azurenative.signalrservice.SignalRPrivateEndpointConnectionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.signalrservice.SignalRPrivateEndpointConnectionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SignalRPrivateEndpointConnection(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SignalRPrivateEndpointConnection(String name) {
        this(name, SignalRPrivateEndpointConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SignalRPrivateEndpointConnection(String name, SignalRPrivateEndpointConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SignalRPrivateEndpointConnection(String name, SignalRPrivateEndpointConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:signalrservice:SignalRPrivateEndpointConnection", name, args == null ? SignalRPrivateEndpointConnectionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SignalRPrivateEndpointConnection(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:signalrservice:SignalRPrivateEndpointConnection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:signalrservice/v20200501:SignalRPrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:signalrservice/v20200701preview:SignalRPrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:signalrservice/v20210401preview:SignalRPrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:signalrservice/v20210601preview:SignalRPrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:signalrservice/v20210901preview:SignalRPrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:signalrservice/v20211001:SignalRPrivateEndpointConnection").build())
            ))
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
    public static SignalRPrivateEndpointConnection get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SignalRPrivateEndpointConnection(name, id, options);
    }
}
