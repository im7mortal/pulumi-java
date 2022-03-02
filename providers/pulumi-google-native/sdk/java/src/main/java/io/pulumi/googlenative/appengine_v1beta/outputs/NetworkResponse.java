// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class NetworkResponse {
    /**
     * List of ports, or port pairs, to forward from the virtual machine to the application container. Only applicable in the App Engine flexible environment.
     * 
     */
    private final List<String> forwardedPorts;
    /**
     * The IP mode for instances. Only applicable in the App Engine flexible environment.
     * 
     */
    private final String instanceIpMode;
    /**
     * Tag to apply to the instance during creation. Only applicable in the App Engine flexible environment.
     * 
     */
    private final String instanceTag;
    /**
     * Google Compute Engine network where the virtual machines are created. Specify the short name, not the resource path.Defaults to default.
     * 
     */
    private final String name;
    /**
     * Enable session affinity. Only applicable in the App Engine flexible environment.
     * 
     */
    private final Boolean sessionAffinity;
    /**
     * Google Cloud Platform sub-network where the virtual machines are created. Specify the short name, not the resource path.If a subnetwork name is specified, a network name will also be required unless it is for the default network. If the network that the instance is being created in is a Legacy network, then the IP address is allocated from the IPv4Range. If the network that the instance is being created in is an auto Subnet Mode Network, then only network name should be specified (not the subnetwork_name) and the IP address is created from the IPCidrRange of the subnetwork that exists in that zone for that network. If the network that the instance is being created in is a custom Subnet Mode Network, then the subnetwork_name must be specified and the IP address is created from the IPCidrRange of the subnetwork.If specified, the subnetwork must exist in the same region as the App Engine flexible environment application.
     * 
     */
    private final String subnetworkName;

    @OutputCustomType.Constructor({"forwardedPorts","instanceIpMode","instanceTag","name","sessionAffinity","subnetworkName"})
    private NetworkResponse(
        List<String> forwardedPorts,
        String instanceIpMode,
        String instanceTag,
        String name,
        Boolean sessionAffinity,
        String subnetworkName) {
        this.forwardedPorts = Objects.requireNonNull(forwardedPorts);
        this.instanceIpMode = Objects.requireNonNull(instanceIpMode);
        this.instanceTag = Objects.requireNonNull(instanceTag);
        this.name = Objects.requireNonNull(name);
        this.sessionAffinity = Objects.requireNonNull(sessionAffinity);
        this.subnetworkName = Objects.requireNonNull(subnetworkName);
    }

    /**
     * List of ports, or port pairs, to forward from the virtual machine to the application container. Only applicable in the App Engine flexible environment.
     * 
    */
    public List<String> getForwardedPorts() {
        return this.forwardedPorts;
    }
    /**
     * The IP mode for instances. Only applicable in the App Engine flexible environment.
     * 
    */
    public String getInstanceIpMode() {
        return this.instanceIpMode;
    }
    /**
     * Tag to apply to the instance during creation. Only applicable in the App Engine flexible environment.
     * 
    */
    public String getInstanceTag() {
        return this.instanceTag;
    }
    /**
     * Google Compute Engine network where the virtual machines are created. Specify the short name, not the resource path.Defaults to default.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Enable session affinity. Only applicable in the App Engine flexible environment.
     * 
    */
    public Boolean getSessionAffinity() {
        return this.sessionAffinity;
    }
    /**
     * Google Cloud Platform sub-network where the virtual machines are created. Specify the short name, not the resource path.If a subnetwork name is specified, a network name will also be required unless it is for the default network. If the network that the instance is being created in is a Legacy network, then the IP address is allocated from the IPv4Range. If the network that the instance is being created in is an auto Subnet Mode Network, then only network name should be specified (not the subnetwork_name) and the IP address is created from the IPCidrRange of the subnetwork that exists in that zone for that network. If the network that the instance is being created in is a custom Subnet Mode Network, then the subnetwork_name must be specified and the IP address is created from the IPCidrRange of the subnetwork.If specified, the subnetwork must exist in the same region as the App Engine flexible environment application.
     * 
    */
    public String getSubnetworkName() {
        return this.subnetworkName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> forwardedPorts;
        private String instanceIpMode;
        private String instanceTag;
        private String name;
        private Boolean sessionAffinity;
        private String subnetworkName;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forwardedPorts = defaults.forwardedPorts;
    	      this.instanceIpMode = defaults.instanceIpMode;
    	      this.instanceTag = defaults.instanceTag;
    	      this.name = defaults.name;
    	      this.sessionAffinity = defaults.sessionAffinity;
    	      this.subnetworkName = defaults.subnetworkName;
        }

        public Builder setForwardedPorts(List<String> forwardedPorts) {
            this.forwardedPorts = Objects.requireNonNull(forwardedPorts);
            return this;
        }

        public Builder setInstanceIpMode(String instanceIpMode) {
            this.instanceIpMode = Objects.requireNonNull(instanceIpMode);
            return this;
        }

        public Builder setInstanceTag(String instanceTag) {
            this.instanceTag = Objects.requireNonNull(instanceTag);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSessionAffinity(Boolean sessionAffinity) {
            this.sessionAffinity = Objects.requireNonNull(sessionAffinity);
            return this;
        }

        public Builder setSubnetworkName(String subnetworkName) {
            this.subnetworkName = Objects.requireNonNull(subnetworkName);
            return this;
        }
        public NetworkResponse build() {
            return new NetworkResponse(forwardedPorts, instanceIpMode, instanceTag, name, sessionAffinity, subnetworkName);
        }
    }
}
