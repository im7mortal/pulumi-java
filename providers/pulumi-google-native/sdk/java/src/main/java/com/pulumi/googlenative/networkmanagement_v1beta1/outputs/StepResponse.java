// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkmanagement_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.networkmanagement_v1beta1.outputs.AbortInfoResponse;
import com.pulumi.googlenative.networkmanagement_v1beta1.outputs.AppEngineVersionInfoResponse;
import com.pulumi.googlenative.networkmanagement_v1beta1.outputs.CloudFunctionInfoResponse;
import com.pulumi.googlenative.networkmanagement_v1beta1.outputs.CloudSQLInstanceInfoResponse;
import com.pulumi.googlenative.networkmanagement_v1beta1.outputs.DeliverInfoResponse;
import com.pulumi.googlenative.networkmanagement_v1beta1.outputs.DropInfoResponse;
import com.pulumi.googlenative.networkmanagement_v1beta1.outputs.EndpointInfoResponse;
import com.pulumi.googlenative.networkmanagement_v1beta1.outputs.FirewallInfoResponse;
import com.pulumi.googlenative.networkmanagement_v1beta1.outputs.ForwardInfoResponse;
import com.pulumi.googlenative.networkmanagement_v1beta1.outputs.ForwardingRuleInfoResponse;
import com.pulumi.googlenative.networkmanagement_v1beta1.outputs.GKEMasterInfoResponse;
import com.pulumi.googlenative.networkmanagement_v1beta1.outputs.InstanceInfoResponse;
import com.pulumi.googlenative.networkmanagement_v1beta1.outputs.LoadBalancerInfoResponse;
import com.pulumi.googlenative.networkmanagement_v1beta1.outputs.NetworkInfoResponse;
import com.pulumi.googlenative.networkmanagement_v1beta1.outputs.RouteInfoResponse;
import com.pulumi.googlenative.networkmanagement_v1beta1.outputs.VpcConnectorInfoResponse;
import com.pulumi.googlenative.networkmanagement_v1beta1.outputs.VpnGatewayInfoResponse;
import com.pulumi.googlenative.networkmanagement_v1beta1.outputs.VpnTunnelInfoResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class StepResponse {
    /**
     * @return Display information of the final state &#34;abort&#34; and reason.
     * 
     */
    private final AbortInfoResponse abort;
    /**
     * @return Display information of an App Engine service version.
     * 
     */
    private final AppEngineVersionInfoResponse appEngineVersionInfo;
    /**
     * @return This is a step that leads to the final state Drop.
     * 
     */
    private final Boolean causesDrop;
    /**
     * @return Display information of a Cloud function.
     * 
     */
    private final CloudFunctionInfoResponse cloudFunction;
    /**
     * @return Display information of a Cloud SQL instance.
     * 
     */
    private final CloudSQLInstanceInfoResponse cloudSqlInstance;
    /**
     * @return Display information of the final state &#34;deliver&#34; and reason.
     * 
     */
    private final DeliverInfoResponse deliver;
    /**
     * @return A description of the step. Usually this is a summary of the state.
     * 
     */
    private final String description;
    /**
     * @return Display information of the final state &#34;drop&#34; and reason.
     * 
     */
    private final DropInfoResponse drop;
    /**
     * @return Display information of the source and destination under analysis. The endpoint information in an intermediate state may differ with the initial input, as it might be modified by state like NAT, or Connection Proxy.
     * 
     */
    private final EndpointInfoResponse endpoint;
    /**
     * @return Display information of a Compute Engine firewall rule.
     * 
     */
    private final FirewallInfoResponse firewall;
    /**
     * @return Display information of the final state &#34;forward&#34; and reason.
     * 
     */
    private final ForwardInfoResponse forward;
    /**
     * @return Display information of a Compute Engine forwarding rule.
     * 
     */
    private final ForwardingRuleInfoResponse forwardingRule;
    /**
     * @return Display information of a Google Kubernetes Engine cluster master.
     * 
     */
    private final GKEMasterInfoResponse gkeMaster;
    /**
     * @return Display information of a Compute Engine instance.
     * 
     */
    private final InstanceInfoResponse instance;
    /**
     * @return Display information of the load balancers.
     * 
     */
    private final LoadBalancerInfoResponse loadBalancer;
    /**
     * @return Display information of a Google Cloud network.
     * 
     */
    private final NetworkInfoResponse network;
    /**
     * @return Project ID that contains the configuration this step is validating.
     * 
     */
    private final String project;
    /**
     * @return Display information of a Compute Engine route.
     * 
     */
    private final RouteInfoResponse route;
    /**
     * @return Each step is in one of the pre-defined states.
     * 
     */
    private final String state;
    /**
     * @return Display information of a VPC connector.
     * 
     */
    private final VpcConnectorInfoResponse vpcConnector;
    /**
     * @return Display information of a Compute Engine VPN gateway.
     * 
     */
    private final VpnGatewayInfoResponse vpnGateway;
    /**
     * @return Display information of a Compute Engine VPN tunnel.
     * 
     */
    private final VpnTunnelInfoResponse vpnTunnel;

    @CustomType.Constructor
    private StepResponse(
        @CustomType.Parameter("abort") AbortInfoResponse abort,
        @CustomType.Parameter("appEngineVersionInfo") AppEngineVersionInfoResponse appEngineVersionInfo,
        @CustomType.Parameter("causesDrop") Boolean causesDrop,
        @CustomType.Parameter("cloudFunction") CloudFunctionInfoResponse cloudFunction,
        @CustomType.Parameter("cloudSqlInstance") CloudSQLInstanceInfoResponse cloudSqlInstance,
        @CustomType.Parameter("deliver") DeliverInfoResponse deliver,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("drop") DropInfoResponse drop,
        @CustomType.Parameter("endpoint") EndpointInfoResponse endpoint,
        @CustomType.Parameter("firewall") FirewallInfoResponse firewall,
        @CustomType.Parameter("forward") ForwardInfoResponse forward,
        @CustomType.Parameter("forwardingRule") ForwardingRuleInfoResponse forwardingRule,
        @CustomType.Parameter("gkeMaster") GKEMasterInfoResponse gkeMaster,
        @CustomType.Parameter("instance") InstanceInfoResponse instance,
        @CustomType.Parameter("loadBalancer") LoadBalancerInfoResponse loadBalancer,
        @CustomType.Parameter("network") NetworkInfoResponse network,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("route") RouteInfoResponse route,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("vpcConnector") VpcConnectorInfoResponse vpcConnector,
        @CustomType.Parameter("vpnGateway") VpnGatewayInfoResponse vpnGateway,
        @CustomType.Parameter("vpnTunnel") VpnTunnelInfoResponse vpnTunnel) {
        this.abort = abort;
        this.appEngineVersionInfo = appEngineVersionInfo;
        this.causesDrop = causesDrop;
        this.cloudFunction = cloudFunction;
        this.cloudSqlInstance = cloudSqlInstance;
        this.deliver = deliver;
        this.description = description;
        this.drop = drop;
        this.endpoint = endpoint;
        this.firewall = firewall;
        this.forward = forward;
        this.forwardingRule = forwardingRule;
        this.gkeMaster = gkeMaster;
        this.instance = instance;
        this.loadBalancer = loadBalancer;
        this.network = network;
        this.project = project;
        this.route = route;
        this.state = state;
        this.vpcConnector = vpcConnector;
        this.vpnGateway = vpnGateway;
        this.vpnTunnel = vpnTunnel;
    }

    /**
     * @return Display information of the final state &#34;abort&#34; and reason.
     * 
     */
    public AbortInfoResponse abort() {
        return this.abort;
    }
    /**
     * @return Display information of an App Engine service version.
     * 
     */
    public AppEngineVersionInfoResponse appEngineVersionInfo() {
        return this.appEngineVersionInfo;
    }
    /**
     * @return This is a step that leads to the final state Drop.
     * 
     */
    public Boolean causesDrop() {
        return this.causesDrop;
    }
    /**
     * @return Display information of a Cloud function.
     * 
     */
    public CloudFunctionInfoResponse cloudFunction() {
        return this.cloudFunction;
    }
    /**
     * @return Display information of a Cloud SQL instance.
     * 
     */
    public CloudSQLInstanceInfoResponse cloudSqlInstance() {
        return this.cloudSqlInstance;
    }
    /**
     * @return Display information of the final state &#34;deliver&#34; and reason.
     * 
     */
    public DeliverInfoResponse deliver() {
        return this.deliver;
    }
    /**
     * @return A description of the step. Usually this is a summary of the state.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Display information of the final state &#34;drop&#34; and reason.
     * 
     */
    public DropInfoResponse drop() {
        return this.drop;
    }
    /**
     * @return Display information of the source and destination under analysis. The endpoint information in an intermediate state may differ with the initial input, as it might be modified by state like NAT, or Connection Proxy.
     * 
     */
    public EndpointInfoResponse endpoint() {
        return this.endpoint;
    }
    /**
     * @return Display information of a Compute Engine firewall rule.
     * 
     */
    public FirewallInfoResponse firewall() {
        return this.firewall;
    }
    /**
     * @return Display information of the final state &#34;forward&#34; and reason.
     * 
     */
    public ForwardInfoResponse forward() {
        return this.forward;
    }
    /**
     * @return Display information of a Compute Engine forwarding rule.
     * 
     */
    public ForwardingRuleInfoResponse forwardingRule() {
        return this.forwardingRule;
    }
    /**
     * @return Display information of a Google Kubernetes Engine cluster master.
     * 
     */
    public GKEMasterInfoResponse gkeMaster() {
        return this.gkeMaster;
    }
    /**
     * @return Display information of a Compute Engine instance.
     * 
     */
    public InstanceInfoResponse instance() {
        return this.instance;
    }
    /**
     * @return Display information of the load balancers.
     * 
     */
    public LoadBalancerInfoResponse loadBalancer() {
        return this.loadBalancer;
    }
    /**
     * @return Display information of a Google Cloud network.
     * 
     */
    public NetworkInfoResponse network() {
        return this.network;
    }
    /**
     * @return Project ID that contains the configuration this step is validating.
     * 
     */
    public String project() {
        return this.project;
    }
    /**
     * @return Display information of a Compute Engine route.
     * 
     */
    public RouteInfoResponse route() {
        return this.route;
    }
    /**
     * @return Each step is in one of the pre-defined states.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Display information of a VPC connector.
     * 
     */
    public VpcConnectorInfoResponse vpcConnector() {
        return this.vpcConnector;
    }
    /**
     * @return Display information of a Compute Engine VPN gateway.
     * 
     */
    public VpnGatewayInfoResponse vpnGateway() {
        return this.vpnGateway;
    }
    /**
     * @return Display information of a Compute Engine VPN tunnel.
     * 
     */
    public VpnTunnelInfoResponse vpnTunnel() {
        return this.vpnTunnel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AbortInfoResponse abort;
        private AppEngineVersionInfoResponse appEngineVersionInfo;
        private Boolean causesDrop;
        private CloudFunctionInfoResponse cloudFunction;
        private CloudSQLInstanceInfoResponse cloudSqlInstance;
        private DeliverInfoResponse deliver;
        private String description;
        private DropInfoResponse drop;
        private EndpointInfoResponse endpoint;
        private FirewallInfoResponse firewall;
        private ForwardInfoResponse forward;
        private ForwardingRuleInfoResponse forwardingRule;
        private GKEMasterInfoResponse gkeMaster;
        private InstanceInfoResponse instance;
        private LoadBalancerInfoResponse loadBalancer;
        private NetworkInfoResponse network;
        private String project;
        private RouteInfoResponse route;
        private String state;
        private VpcConnectorInfoResponse vpcConnector;
        private VpnGatewayInfoResponse vpnGateway;
        private VpnTunnelInfoResponse vpnTunnel;

        public Builder() {
    	      // Empty
        }

        public Builder(StepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abort = defaults.abort;
    	      this.appEngineVersionInfo = defaults.appEngineVersionInfo;
    	      this.causesDrop = defaults.causesDrop;
    	      this.cloudFunction = defaults.cloudFunction;
    	      this.cloudSqlInstance = defaults.cloudSqlInstance;
    	      this.deliver = defaults.deliver;
    	      this.description = defaults.description;
    	      this.drop = defaults.drop;
    	      this.endpoint = defaults.endpoint;
    	      this.firewall = defaults.firewall;
    	      this.forward = defaults.forward;
    	      this.forwardingRule = defaults.forwardingRule;
    	      this.gkeMaster = defaults.gkeMaster;
    	      this.instance = defaults.instance;
    	      this.loadBalancer = defaults.loadBalancer;
    	      this.network = defaults.network;
    	      this.project = defaults.project;
    	      this.route = defaults.route;
    	      this.state = defaults.state;
    	      this.vpcConnector = defaults.vpcConnector;
    	      this.vpnGateway = defaults.vpnGateway;
    	      this.vpnTunnel = defaults.vpnTunnel;
        }

        public Builder abort(AbortInfoResponse abort) {
            this.abort = Objects.requireNonNull(abort);
            return this;
        }
        public Builder appEngineVersionInfo(AppEngineVersionInfoResponse appEngineVersionInfo) {
            this.appEngineVersionInfo = Objects.requireNonNull(appEngineVersionInfo);
            return this;
        }
        public Builder causesDrop(Boolean causesDrop) {
            this.causesDrop = Objects.requireNonNull(causesDrop);
            return this;
        }
        public Builder cloudFunction(CloudFunctionInfoResponse cloudFunction) {
            this.cloudFunction = Objects.requireNonNull(cloudFunction);
            return this;
        }
        public Builder cloudSqlInstance(CloudSQLInstanceInfoResponse cloudSqlInstance) {
            this.cloudSqlInstance = Objects.requireNonNull(cloudSqlInstance);
            return this;
        }
        public Builder deliver(DeliverInfoResponse deliver) {
            this.deliver = Objects.requireNonNull(deliver);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder drop(DropInfoResponse drop) {
            this.drop = Objects.requireNonNull(drop);
            return this;
        }
        public Builder endpoint(EndpointInfoResponse endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public Builder firewall(FirewallInfoResponse firewall) {
            this.firewall = Objects.requireNonNull(firewall);
            return this;
        }
        public Builder forward(ForwardInfoResponse forward) {
            this.forward = Objects.requireNonNull(forward);
            return this;
        }
        public Builder forwardingRule(ForwardingRuleInfoResponse forwardingRule) {
            this.forwardingRule = Objects.requireNonNull(forwardingRule);
            return this;
        }
        public Builder gkeMaster(GKEMasterInfoResponse gkeMaster) {
            this.gkeMaster = Objects.requireNonNull(gkeMaster);
            return this;
        }
        public Builder instance(InstanceInfoResponse instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }
        public Builder loadBalancer(LoadBalancerInfoResponse loadBalancer) {
            this.loadBalancer = Objects.requireNonNull(loadBalancer);
            return this;
        }
        public Builder network(NetworkInfoResponse network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder route(RouteInfoResponse route) {
            this.route = Objects.requireNonNull(route);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder vpcConnector(VpcConnectorInfoResponse vpcConnector) {
            this.vpcConnector = Objects.requireNonNull(vpcConnector);
            return this;
        }
        public Builder vpnGateway(VpnGatewayInfoResponse vpnGateway) {
            this.vpnGateway = Objects.requireNonNull(vpnGateway);
            return this;
        }
        public Builder vpnTunnel(VpnTunnelInfoResponse vpnTunnel) {
            this.vpnTunnel = Objects.requireNonNull(vpnTunnel);
            return this;
        }        public StepResponse build() {
            return new StepResponse(abort, appEngineVersionInfo, causesDrop, cloudFunction, cloudSqlInstance, deliver, description, drop, endpoint, firewall, forward, forwardingRule, gkeMaster, instance, loadBalancer, network, project, route, state, vpcConnector, vpnGateway, vpnTunnel);
        }
    }
}
