// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.servicefabricmesh.GatewayArgs;
import io.pulumi.azurenative.servicefabricmesh.outputs.HttpConfigResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.NetworkRefResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.TcpConfigResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * This type describes a gateway resource.
 * API Version: 2018-09-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:servicefabricmesh:Gateway sampleGateway /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/sbz_demo/providers/Microsoft.ServiceFabricMesh/gateways/sampleGateway 
 * ```
 * 
 */
@ResourceType(type="azure-native:servicefabricmesh:Gateway")
public class Gateway extends io.pulumi.resources.CustomResource {
    /**
     * User readable description of the gateway.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return User readable description of the gateway.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Network that the Application is using.
     * 
     */
    @OutputExport(name="destinationNetwork", type=NetworkRefResponse.class, parameters={})
    private Output<NetworkRefResponse> destinationNetwork;

    /**
     * @return Network that the Application is using.
     * 
     */
    public Output<NetworkRefResponse> getDestinationNetwork() {
        return this.destinationNetwork;
    }
    /**
     * Configuration for http connectivity for this gateway.
     * 
     */
    @OutputExport(name="http", type=List.class, parameters={HttpConfigResponse.class})
    private Output</* @Nullable */ List<HttpConfigResponse>> http;

    /**
     * @return Configuration for http connectivity for this gateway.
     * 
     */
    public Output</* @Nullable */ List<HttpConfigResponse>> getHttp() {
        return this.http;
    }
    /**
     * IP address of the gateway. This is populated in the response and is ignored for incoming requests.
     * 
     */
    @OutputExport(name="ipAddress", type=String.class, parameters={})
    private Output<String> ipAddress;

    /**
     * @return IP address of the gateway. This is populated in the response and is ignored for incoming requests.
     * 
     */
    public Output<String> getIpAddress() {
        return this.ipAddress;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * State of the resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return State of the resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Network the gateway should listen on for requests.
     * 
     */
    @OutputExport(name="sourceNetwork", type=NetworkRefResponse.class, parameters={})
    private Output<NetworkRefResponse> sourceNetwork;

    /**
     * @return Network the gateway should listen on for requests.
     * 
     */
    public Output<NetworkRefResponse> getSourceNetwork() {
        return this.sourceNetwork;
    }
    /**
     * Status of the resource.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of the resource.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * Gives additional information about the current status of the gateway.
     * 
     */
    @OutputExport(name="statusDetails", type=String.class, parameters={})
    private Output<String> statusDetails;

    /**
     * @return Gives additional information about the current status of the gateway.
     * 
     */
    public Output<String> getStatusDetails() {
        return this.statusDetails;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Configuration for tcp connectivity for this gateway.
     * 
     */
    @OutputExport(name="tcp", type=List.class, parameters={TcpConfigResponse.class})
    private Output</* @Nullable */ List<TcpConfigResponse>> tcp;

    /**
     * @return Configuration for tcp connectivity for this gateway.
     * 
     */
    public Output</* @Nullable */ List<TcpConfigResponse>> getTcp() {
        return this.tcp;
    }
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(GatewayArgs.Builder a);
    }
    private static io.pulumi.azurenative.servicefabricmesh.GatewayArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.servicefabricmesh.GatewayArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Gateway(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Gateway(String name) {
        this(name, GatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Gateway(String name, GatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Gateway(String name, GatewayArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicefabricmesh:Gateway", name, args == null ? GatewayArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Gateway(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicefabricmesh:Gateway", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:servicefabricmesh/v20180901preview:Gateway").build())
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
    public static Gateway get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Gateway(name, id, options);
    }
}
