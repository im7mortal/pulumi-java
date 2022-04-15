// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.core_v1.outputs.PortStatus;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadBalancerIngress {
    /**
     * Hostname is set for load-balancer ingress points that are DNS based (typically AWS load-balancers)
     * 
     */
    private final @Nullable String hostname;
    /**
     * IP is set for load-balancer ingress points that are IP based (typically GCE or OpenStack load-balancers)
     * 
     */
    private final @Nullable String ip;
    /**
     * Ports is a list of records of service ports If used, every port defined in the service should have an entry in it
     * 
     */
    private final @Nullable List<PortStatus> ports;

    @CustomType.Constructor
    private LoadBalancerIngress(
        @CustomType.Parameter("hostname") @Nullable String hostname,
        @CustomType.Parameter("ip") @Nullable String ip,
        @CustomType.Parameter("ports") @Nullable List<PortStatus> ports) {
        this.hostname = hostname;
        this.ip = ip;
        this.ports = ports;
    }

    /**
     * Hostname is set for load-balancer ingress points that are DNS based (typically AWS load-balancers)
     * 
    */
    public Optional<String> hostname() {
        return Optional.ofNullable(this.hostname);
    }
    /**
     * IP is set for load-balancer ingress points that are IP based (typically GCE or OpenStack load-balancers)
     * 
    */
    public Optional<String> ip() {
        return Optional.ofNullable(this.ip);
    }
    /**
     * Ports is a list of records of service ports If used, every port defined in the service should have an entry in it
     * 
    */
    public List<PortStatus> ports() {
        return this.ports == null ? List.of() : this.ports;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerIngress defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hostname;
        private @Nullable String ip;
        private @Nullable List<PortStatus> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerIngress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.ip = defaults.ip;
    	      this.ports = defaults.ports;
        }

        public Builder hostname(@Nullable String hostname) {
            this.hostname = hostname;
            return this;
        }
        public Builder ip(@Nullable String ip) {
            this.ip = ip;
            return this;
        }
        public Builder ports(@Nullable List<PortStatus> ports) {
            this.ports = ports;
            return this;
        }
        public Builder ports(PortStatus... ports) {
            return ports(List.of(ports));
        }        public LoadBalancerIngress build() {
            return new LoadBalancerIngress(hostname, ip, ports);
        }
    }
}
