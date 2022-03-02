// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_v1.ServiceAttachmentArgs;
import io.pulumi.googlenative.compute_v1.outputs.ServiceAttachmentConnectedEndpointResponse;
import io.pulumi.googlenative.compute_v1.outputs.ServiceAttachmentConsumerProjectLimitResponse;
import io.pulumi.googlenative.compute_v1.outputs.Uint128Response;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a ServiceAttachment in the specified project in the given scope using the parameters that are included in the request.
 * 
 */
@ResourceType(type="google-native:compute/v1:ServiceAttachment")
public class ServiceAttachment extends io.pulumi.resources.CustomResource {
    /**
     * An array of connections for all the consumers connected to this service attachment.
     * 
     */
    @OutputExport(name="connectedEndpoints", type=List.class, parameters={ServiceAttachmentConnectedEndpointResponse.class})
    private Output<List<ServiceAttachmentConnectedEndpointResponse>> connectedEndpoints;

    /**
     * @return An array of connections for all the consumers connected to this service attachment.
     * 
     */
    public Output<List<ServiceAttachmentConnectedEndpointResponse>> getConnectedEndpoints() {
        return this.connectedEndpoints;
    }
    /**
     * The connection preference of service attachment. The value can be set to ACCEPT_AUTOMATIC. An ACCEPT_AUTOMATIC service attachment is one that always accepts the connection from consumer forwarding rules.
     * 
     */
    @OutputExport(name="connectionPreference", type=String.class, parameters={})
    private Output<String> connectionPreference;

    /**
     * @return The connection preference of service attachment. The value can be set to ACCEPT_AUTOMATIC. An ACCEPT_AUTOMATIC service attachment is one that always accepts the connection from consumer forwarding rules.
     * 
     */
    public Output<String> getConnectionPreference() {
        return this.connectionPreference;
    }
    /**
     * Projects that are allowed to connect to this service attachment.
     * 
     */
    @OutputExport(name="consumerAcceptLists", type=List.class, parameters={ServiceAttachmentConsumerProjectLimitResponse.class})
    private Output<List<ServiceAttachmentConsumerProjectLimitResponse>> consumerAcceptLists;

    /**
     * @return Projects that are allowed to connect to this service attachment.
     * 
     */
    public Output<List<ServiceAttachmentConsumerProjectLimitResponse>> getConsumerAcceptLists() {
        return this.consumerAcceptLists;
    }
    /**
     * Projects that are not allowed to connect to this service attachment. The project can be specified using its id or number.
     * 
     */
    @OutputExport(name="consumerRejectLists", type=List.class, parameters={String.class})
    private Output<List<String>> consumerRejectLists;

    /**
     * @return Projects that are not allowed to connect to this service attachment. The project can be specified using its id or number.
     * 
     */
    public Output<List<String>> getConsumerRejectLists() {
        return this.consumerRejectLists;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @OutputExport(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * If specified, the domain name will be used during the integration between the PSC connected endpoints and the Cloud DNS. For example, this is a valid domain name: "p.mycompany.com.". Current max number of domain names supported is 1.
     * 
     */
    @OutputExport(name="domainNames", type=List.class, parameters={String.class})
    private Output<List<String>> domainNames;

    /**
     * @return If specified, the domain name will be used during the integration between the PSC connected endpoints and the Cloud DNS. For example, this is a valid domain name: "p.mycompany.com.". Current max number of domain names supported is 1.
     * 
     */
    public Output<List<String>> getDomainNames() {
        return this.domainNames;
    }
    /**
     * If true, enable the proxy protocol which is for supplying client TCP/IP address data in TCP connections that traverse proxies on their way to destination servers.
     * 
     */
    @OutputExport(name="enableProxyProtocol", type=Boolean.class, parameters={})
    private Output<Boolean> enableProxyProtocol;

    /**
     * @return If true, enable the proxy protocol which is for supplying client TCP/IP address data in TCP connections that traverse proxies on their way to destination servers.
     * 
     */
    public Output<Boolean> getEnableProxyProtocol() {
        return this.enableProxyProtocol;
    }
    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a ServiceAttachment. An up-to-date fingerprint must be provided in order to patch/update the ServiceAttachment; otherwise, the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve the ServiceAttachment.
     * 
     */
    @OutputExport(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a ServiceAttachment. An up-to-date fingerprint must be provided in order to patch/update the ServiceAttachment; otherwise, the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve the ServiceAttachment.
     * 
     */
    public Output<String> getFingerprint() {
        return this.fingerprint;
    }
    /**
     * Type of the resource. Always compute#serviceAttachment for service attachments.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of the resource. Always compute#serviceAttachment for service attachments.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * An array of URLs where each entry is the URL of a subnet provided by the service producer to use for NAT in this service attachment.
     * 
     */
    @OutputExport(name="natSubnets", type=List.class, parameters={String.class})
    private Output<List<String>> natSubnets;

    /**
     * @return An array of URLs where each entry is the URL of a subnet provided by the service producer to use for NAT in this service attachment.
     * 
     */
    public Output<List<String>> getNatSubnets() {
        return this.natSubnets;
    }
    /**
     * The URL of a forwarding rule with loadBalancingScheme INTERNAL* that is serving the endpoint identified by this service attachment.
     * 
     */
    @OutputExport(name="producerForwardingRule", type=String.class, parameters={})
    private Output<String> producerForwardingRule;

    /**
     * @return The URL of a forwarding rule with loadBalancingScheme INTERNAL* that is serving the endpoint identified by this service attachment.
     * 
     */
    public Output<String> getProducerForwardingRule() {
        return this.producerForwardingRule;
    }
    /**
     * An 128-bit global unique ID of the PSC service attachment.
     * 
     */
    @OutputExport(name="pscServiceAttachmentId", type=Uint128Response.class, parameters={})
    private Output<Uint128Response> pscServiceAttachmentId;

    /**
     * @return An 128-bit global unique ID of the PSC service attachment.
     * 
     */
    public Output<Uint128Response> getPscServiceAttachmentId() {
        return this.pscServiceAttachmentId;
    }
    /**
     * URL of the region where the service attachment resides. This field applies only to the region resource. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return URL of the region where the service attachment resides. This field applies only to the region resource. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * The URL of a service serving the endpoint identified by this service attachment.
     * 
     */
    @OutputExport(name="targetService", type=String.class, parameters={})
    private Output<String> targetService;

    /**
     * @return The URL of a service serving the endpoint identified by this service attachment.
     * 
     */
    public Output<String> getTargetService() {
        return this.targetService;
    }

    public interface BuilderApplicator {
        public void apply(ServiceAttachmentArgs.Builder a);
    }
    private static io.pulumi.googlenative.compute_v1.ServiceAttachmentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.compute_v1.ServiceAttachmentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ServiceAttachment(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceAttachment(String name) {
        this(name, ServiceAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceAttachment(String name, ServiceAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceAttachment(String name, ServiceAttachmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/v1:ServiceAttachment", name, args == null ? ServiceAttachmentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ServiceAttachment(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/v1:ServiceAttachment", name, null, makeResourceOptions(options, id));
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
    public static ServiceAttachment get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ServiceAttachment(name, id, options);
    }
}
