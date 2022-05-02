// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.compute_alpha.NetworkEndpointGroupArgs;
import com.pulumi.googlenative.compute_alpha.outputs.NetworkEndpointGroupAppEngineResponse;
import com.pulumi.googlenative.compute_alpha.outputs.NetworkEndpointGroupCloudFunctionResponse;
import com.pulumi.googlenative.compute_alpha.outputs.NetworkEndpointGroupCloudRunResponse;
import com.pulumi.googlenative.compute_alpha.outputs.NetworkEndpointGroupLbNetworkEndpointGroupResponse;
import com.pulumi.googlenative.compute_alpha.outputs.NetworkEndpointGroupServerlessDeploymentResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a network endpoint group in the specified project using the parameters that are included in the request.
 * 
 */
@ResourceType(type="google-native:compute/alpha:NetworkEndpointGroup")
public class NetworkEndpointGroup extends com.pulumi.resources.CustomResource {
    /**
     * Metadata defined as annotations on the network endpoint group.
     * 
     */
    @Export(name="annotations", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> annotations;

    /**
     * @return Metadata defined as annotations on the network endpoint group.
     * 
     */
    public Output<Map<String,String>> annotations() {
        return this.annotations;
    }
    /**
     * Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    @Export(name="appEngine", type=NetworkEndpointGroupAppEngineResponse.class, parameters={})
    private Output<NetworkEndpointGroupAppEngineResponse> appEngine;

    /**
     * @return Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    public Output<NetworkEndpointGroupAppEngineResponse> appEngine() {
        return this.appEngine;
    }
    /**
     * Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    @Export(name="cloudFunction", type=NetworkEndpointGroupCloudFunctionResponse.class, parameters={})
    private Output<NetworkEndpointGroupCloudFunctionResponse> cloudFunction;

    /**
     * @return Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    public Output<NetworkEndpointGroupCloudFunctionResponse> cloudFunction() {
        return this.cloudFunction;
    }
    /**
     * Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    @Export(name="cloudRun", type=NetworkEndpointGroupCloudRunResponse.class, parameters={})
    private Output<NetworkEndpointGroupCloudRunResponse> cloudRun;

    /**
     * @return Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    public Output<NetworkEndpointGroupCloudRunResponse> cloudRun() {
        return this.cloudRun;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * The default port used if the port number is not specified in the network endpoint.
     * 
     */
    @Export(name="defaultPort", type=Integer.class, parameters={})
    private Output<Integer> defaultPort;

    /**
     * @return The default port used if the port number is not specified in the network endpoint.
     * 
     */
    public Output<Integer> defaultPort() {
        return this.defaultPort;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Type of the resource. Always compute#networkEndpointGroup for network endpoint group.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of the resource. Always compute#networkEndpointGroup for network endpoint group.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * This field is only valid when the network endpoint group is used for load balancing. [Deprecated] This field is deprecated.
     * 
     * @deprecated
     * This field is only valid when the network endpoint group is used for load balancing. [Deprecated] This field is deprecated.
     * 
     */
    @Deprecated /* This field is only valid when the network endpoint group is used for load balancing. [Deprecated] This field is deprecated. */
    @Export(name="loadBalancer", type=NetworkEndpointGroupLbNetworkEndpointGroupResponse.class, parameters={})
    private Output<NetworkEndpointGroupLbNetworkEndpointGroupResponse> loadBalancer;

    /**
     * @return This field is only valid when the network endpoint group is used for load balancing. [Deprecated] This field is deprecated.
     * 
     */
    public Output<NetworkEndpointGroupLbNetworkEndpointGroupResponse> loadBalancer() {
        return this.loadBalancer;
    }
    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The URL of the network to which all network endpoints in the NEG belong. Uses &#34;default&#34; project network if unspecified.
     * 
     */
    @Export(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return The URL of the network to which all network endpoints in the NEG belong. Uses &#34;default&#34; project network if unspecified.
     * 
     */
    public Output<String> network() {
        return this.network;
    }
    /**
     * Type of network endpoints in this network endpoint group. Can be one of GCE_VM_IP, GCE_VM_IP_PORT, NON_GCP_PRIVATE_IP_PORT, INTERNET_FQDN_PORT, INTERNET_IP_PORT, SERVERLESS, PRIVATE_SERVICE_CONNECT.
     * 
     */
    @Export(name="networkEndpointType", type=String.class, parameters={})
    private Output<String> networkEndpointType;

    /**
     * @return Type of network endpoints in this network endpoint group. Can be one of GCE_VM_IP, GCE_VM_IP_PORT, NON_GCP_PRIVATE_IP_PORT, INTERNET_FQDN_PORT, INTERNET_IP_PORT, SERVERLESS, PRIVATE_SERVICE_CONNECT.
     * 
     */
    public Output<String> networkEndpointType() {
        return this.networkEndpointType;
    }
    /**
     * The target service url used to set up private service connection to a Google API. An example value is: &#34;asia-northeast3-cloudkms.googleapis.com&#34;
     * 
     */
    @Export(name="pscTargetService", type=String.class, parameters={})
    private Output<String> pscTargetService;

    /**
     * @return The target service url used to set up private service connection to a Google API. An example value is: &#34;asia-northeast3-cloudkms.googleapis.com&#34;
     * 
     */
    public Output<String> pscTargetService() {
        return this.pscTargetService;
    }
    /**
     * The URL of the region where the network endpoint group is located.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The URL of the region where the network endpoint group is located.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    @Export(name="selfLinkWithId", type=String.class, parameters={})
    private Output<String> selfLinkWithId;

    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    public Output<String> selfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine, cloudFunction or serverlessDeployment may be set.
     * 
     */
    @Export(name="serverlessDeployment", type=NetworkEndpointGroupServerlessDeploymentResponse.class, parameters={})
    private Output<NetworkEndpointGroupServerlessDeploymentResponse> serverlessDeployment;

    /**
     * @return Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine, cloudFunction or serverlessDeployment may be set.
     * 
     */
    public Output<NetworkEndpointGroupServerlessDeploymentResponse> serverlessDeployment() {
        return this.serverlessDeployment;
    }
    /**
     * [Output only] Number of network endpoints in the network endpoint group.
     * 
     */
    @Export(name="size", type=Integer.class, parameters={})
    private Output<Integer> size;

    /**
     * @return [Output only] Number of network endpoints in the network endpoint group.
     * 
     */
    public Output<Integer> size() {
        return this.size;
    }
    /**
     * Optional URL of the subnetwork to which all network endpoints in the NEG belong.
     * 
     */
    @Export(name="subnetwork", type=String.class, parameters={})
    private Output<String> subnetwork;

    /**
     * @return Optional URL of the subnetwork to which all network endpoints in the NEG belong.
     * 
     */
    public Output<String> subnetwork() {
        return this.subnetwork;
    }
    /**
     * Specify the type of this network endpoint group. Only LOAD_BALANCING is valid for now.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Specify the type of this network endpoint group. Only LOAD_BALANCING is valid for now.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The URL of the zone where the network endpoint group is located.
     * 
     */
    @Export(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return The URL of the zone where the network endpoint group is located.
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkEndpointGroup(String name) {
        this(name, NetworkEndpointGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkEndpointGroup(String name, @Nullable NetworkEndpointGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkEndpointGroup(String name, @Nullable NetworkEndpointGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/alpha:NetworkEndpointGroup", name, args == null ? NetworkEndpointGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NetworkEndpointGroup(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/alpha:NetworkEndpointGroup", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static NetworkEndpointGroup get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NetworkEndpointGroup(name, id, options);
    }
}
