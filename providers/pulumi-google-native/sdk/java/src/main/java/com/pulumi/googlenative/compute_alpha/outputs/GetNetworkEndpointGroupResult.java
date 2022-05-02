// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_alpha.outputs.NetworkEndpointGroupAppEngineResponse;
import com.pulumi.googlenative.compute_alpha.outputs.NetworkEndpointGroupCloudFunctionResponse;
import com.pulumi.googlenative.compute_alpha.outputs.NetworkEndpointGroupCloudRunResponse;
import com.pulumi.googlenative.compute_alpha.outputs.NetworkEndpointGroupLbNetworkEndpointGroupResponse;
import com.pulumi.googlenative.compute_alpha.outputs.NetworkEndpointGroupServerlessDeploymentResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetNetworkEndpointGroupResult {
    /**
     * @return Metadata defined as annotations on the network endpoint group.
     * 
     */
    private final Map<String,String> annotations;
    /**
     * @return Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    private final NetworkEndpointGroupAppEngineResponse appEngine;
    /**
     * @return Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    private final NetworkEndpointGroupCloudFunctionResponse cloudFunction;
    /**
     * @return Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    private final NetworkEndpointGroupCloudRunResponse cloudRun;
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * @return The default port used if the port number is not specified in the network endpoint.
     * 
     */
    private final Integer defaultPort;
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * @return Type of the resource. Always compute#networkEndpointGroup for network endpoint group.
     * 
     */
    private final String kind;
    /**
     * @return This field is only valid when the network endpoint group is used for load balancing. [Deprecated] This field is deprecated.
     * 
     * @deprecated
     * This field is only valid when the network endpoint group is used for load balancing. [Deprecated] This field is deprecated.
     * 
     */
    @Deprecated /* This field is only valid when the network endpoint group is used for load balancing. [Deprecated] This field is deprecated. */
    private final NetworkEndpointGroupLbNetworkEndpointGroupResponse loadBalancer;
    /**
     * @return Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * @return The URL of the network to which all network endpoints in the NEG belong. Uses &#34;default&#34; project network if unspecified.
     * 
     */
    private final String network;
    /**
     * @return Type of network endpoints in this network endpoint group. Can be one of GCE_VM_IP, GCE_VM_IP_PORT, NON_GCP_PRIVATE_IP_PORT, INTERNET_FQDN_PORT, INTERNET_IP_PORT, SERVERLESS, PRIVATE_SERVICE_CONNECT.
     * 
     */
    private final String networkEndpointType;
    /**
     * @return The target service url used to set up private service connection to a Google API. An example value is: &#34;asia-northeast3-cloudkms.googleapis.com&#34;
     * 
     */
    private final String pscTargetService;
    /**
     * @return The URL of the region where the network endpoint group is located.
     * 
     */
    private final String region;
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    private final String selfLinkWithId;
    /**
     * @return Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine, cloudFunction or serverlessDeployment may be set.
     * 
     */
    private final NetworkEndpointGroupServerlessDeploymentResponse serverlessDeployment;
    /**
     * @return [Output only] Number of network endpoints in the network endpoint group.
     * 
     */
    private final Integer size;
    /**
     * @return Optional URL of the subnetwork to which all network endpoints in the NEG belong.
     * 
     */
    private final String subnetwork;
    /**
     * @return Specify the type of this network endpoint group. Only LOAD_BALANCING is valid for now.
     * 
     */
    private final String type;
    /**
     * @return The URL of the zone where the network endpoint group is located.
     * 
     */
    private final String zone;

    @CustomType.Constructor
    private GetNetworkEndpointGroupResult(
        @CustomType.Parameter("annotations") Map<String,String> annotations,
        @CustomType.Parameter("appEngine") NetworkEndpointGroupAppEngineResponse appEngine,
        @CustomType.Parameter("cloudFunction") NetworkEndpointGroupCloudFunctionResponse cloudFunction,
        @CustomType.Parameter("cloudRun") NetworkEndpointGroupCloudRunResponse cloudRun,
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("defaultPort") Integer defaultPort,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("loadBalancer") NetworkEndpointGroupLbNetworkEndpointGroupResponse loadBalancer,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("networkEndpointType") String networkEndpointType,
        @CustomType.Parameter("pscTargetService") String pscTargetService,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("selfLinkWithId") String selfLinkWithId,
        @CustomType.Parameter("serverlessDeployment") NetworkEndpointGroupServerlessDeploymentResponse serverlessDeployment,
        @CustomType.Parameter("size") Integer size,
        @CustomType.Parameter("subnetwork") String subnetwork,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("zone") String zone) {
        this.annotations = annotations;
        this.appEngine = appEngine;
        this.cloudFunction = cloudFunction;
        this.cloudRun = cloudRun;
        this.creationTimestamp = creationTimestamp;
        this.defaultPort = defaultPort;
        this.description = description;
        this.kind = kind;
        this.loadBalancer = loadBalancer;
        this.name = name;
        this.network = network;
        this.networkEndpointType = networkEndpointType;
        this.pscTargetService = pscTargetService;
        this.region = region;
        this.selfLink = selfLink;
        this.selfLinkWithId = selfLinkWithId;
        this.serverlessDeployment = serverlessDeployment;
        this.size = size;
        this.subnetwork = subnetwork;
        this.type = type;
        this.zone = zone;
    }

    /**
     * @return Metadata defined as annotations on the network endpoint group.
     * 
     */
    public Map<String,String> annotations() {
        return this.annotations;
    }
    /**
     * @return Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    public NetworkEndpointGroupAppEngineResponse appEngine() {
        return this.appEngine;
    }
    /**
     * @return Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    public NetworkEndpointGroupCloudFunctionResponse cloudFunction() {
        return this.cloudFunction;
    }
    /**
     * @return Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    public NetworkEndpointGroupCloudRunResponse cloudRun() {
        return this.cloudRun;
    }
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * @return The default port used if the port number is not specified in the network endpoint.
     * 
     */
    public Integer defaultPort() {
        return this.defaultPort;
    }
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Type of the resource. Always compute#networkEndpointGroup for network endpoint group.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return This field is only valid when the network endpoint group is used for load balancing. [Deprecated] This field is deprecated.
     * 
     * @deprecated
     * This field is only valid when the network endpoint group is used for load balancing. [Deprecated] This field is deprecated.
     * 
     */
    @Deprecated /* This field is only valid when the network endpoint group is used for load balancing. [Deprecated] This field is deprecated. */
    public NetworkEndpointGroupLbNetworkEndpointGroupResponse loadBalancer() {
        return this.loadBalancer;
    }
    /**
     * @return Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The URL of the network to which all network endpoints in the NEG belong. Uses &#34;default&#34; project network if unspecified.
     * 
     */
    public String network() {
        return this.network;
    }
    /**
     * @return Type of network endpoints in this network endpoint group. Can be one of GCE_VM_IP, GCE_VM_IP_PORT, NON_GCP_PRIVATE_IP_PORT, INTERNET_FQDN_PORT, INTERNET_IP_PORT, SERVERLESS, PRIVATE_SERVICE_CONNECT.
     * 
     */
    public String networkEndpointType() {
        return this.networkEndpointType;
    }
    /**
     * @return The target service url used to set up private service connection to a Google API. An example value is: &#34;asia-northeast3-cloudkms.googleapis.com&#34;
     * 
     */
    public String pscTargetService() {
        return this.pscTargetService;
    }
    /**
     * @return The URL of the region where the network endpoint group is located.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    public String selfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * @return Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine, cloudFunction or serverlessDeployment may be set.
     * 
     */
    public NetworkEndpointGroupServerlessDeploymentResponse serverlessDeployment() {
        return this.serverlessDeployment;
    }
    /**
     * @return [Output only] Number of network endpoints in the network endpoint group.
     * 
     */
    public Integer size() {
        return this.size;
    }
    /**
     * @return Optional URL of the subnetwork to which all network endpoints in the NEG belong.
     * 
     */
    public String subnetwork() {
        return this.subnetwork;
    }
    /**
     * @return Specify the type of this network endpoint group. Only LOAD_BALANCING is valid for now.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The URL of the zone where the network endpoint group is located.
     * 
     */
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkEndpointGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> annotations;
        private NetworkEndpointGroupAppEngineResponse appEngine;
        private NetworkEndpointGroupCloudFunctionResponse cloudFunction;
        private NetworkEndpointGroupCloudRunResponse cloudRun;
        private String creationTimestamp;
        private Integer defaultPort;
        private String description;
        private String kind;
        private NetworkEndpointGroupLbNetworkEndpointGroupResponse loadBalancer;
        private String name;
        private String network;
        private String networkEndpointType;
        private String pscTargetService;
        private String region;
        private String selfLink;
        private String selfLinkWithId;
        private NetworkEndpointGroupServerlessDeploymentResponse serverlessDeployment;
        private Integer size;
        private String subnetwork;
        private String type;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkEndpointGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.appEngine = defaults.appEngine;
    	      this.cloudFunction = defaults.cloudFunction;
    	      this.cloudRun = defaults.cloudRun;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.defaultPort = defaults.defaultPort;
    	      this.description = defaults.description;
    	      this.kind = defaults.kind;
    	      this.loadBalancer = defaults.loadBalancer;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkEndpointType = defaults.networkEndpointType;
    	      this.pscTargetService = defaults.pscTargetService;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
    	      this.serverlessDeployment = defaults.serverlessDeployment;
    	      this.size = defaults.size;
    	      this.subnetwork = defaults.subnetwork;
    	      this.type = defaults.type;
    	      this.zone = defaults.zone;
        }

        public Builder annotations(Map<String,String> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }
        public Builder appEngine(NetworkEndpointGroupAppEngineResponse appEngine) {
            this.appEngine = Objects.requireNonNull(appEngine);
            return this;
        }
        public Builder cloudFunction(NetworkEndpointGroupCloudFunctionResponse cloudFunction) {
            this.cloudFunction = Objects.requireNonNull(cloudFunction);
            return this;
        }
        public Builder cloudRun(NetworkEndpointGroupCloudRunResponse cloudRun) {
            this.cloudRun = Objects.requireNonNull(cloudRun);
            return this;
        }
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder defaultPort(Integer defaultPort) {
            this.defaultPort = Objects.requireNonNull(defaultPort);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder loadBalancer(NetworkEndpointGroupLbNetworkEndpointGroupResponse loadBalancer) {
            this.loadBalancer = Objects.requireNonNull(loadBalancer);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder networkEndpointType(String networkEndpointType) {
            this.networkEndpointType = Objects.requireNonNull(networkEndpointType);
            return this;
        }
        public Builder pscTargetService(String pscTargetService) {
            this.pscTargetService = Objects.requireNonNull(pscTargetService);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder selfLinkWithId(String selfLinkWithId) {
            this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
            return this;
        }
        public Builder serverlessDeployment(NetworkEndpointGroupServerlessDeploymentResponse serverlessDeployment) {
            this.serverlessDeployment = Objects.requireNonNull(serverlessDeployment);
            return this;
        }
        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        public Builder subnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public GetNetworkEndpointGroupResult build() {
            return new GetNetworkEndpointGroupResult(annotations, appEngine, cloudFunction, cloudRun, creationTimestamp, defaultPort, description, kind, loadBalancer, name, network, networkEndpointType, pscTargetService, region, selfLink, selfLinkWithId, serverlessDeployment, size, subnetwork, type, zone);
        }
    }
}
