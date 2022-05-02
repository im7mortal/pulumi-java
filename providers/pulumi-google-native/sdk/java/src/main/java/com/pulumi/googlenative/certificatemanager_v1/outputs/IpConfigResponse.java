// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.certificatemanager_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class IpConfigResponse {
    /**
     * @return An external IP address.
     * 
     */
    private final String ipAddress;
    /**
     * @return Ports.
     * 
     */
    private final List<Integer> ports;

    @CustomType.Constructor
    private IpConfigResponse(
        @CustomType.Parameter("ipAddress") String ipAddress,
        @CustomType.Parameter("ports") List<Integer> ports) {
        this.ipAddress = ipAddress;
        this.ports = ports;
    }

    /**
     * @return An external IP address.
     * 
     */
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * @return Ports.
     * 
     */
    public List<Integer> ports() {
        return this.ports;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipAddress;
        private List<Integer> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(IpConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.ports = defaults.ports;
        }

        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }
        public Builder ports(List<Integer> ports) {
            this.ports = Objects.requireNonNull(ports);
            return this;
        }
        public Builder ports(Integer... ports) {
            return ports(List.of(ports));
        }        public IpConfigResponse build() {
            return new IpConfigResponse(ipAddress, ports);
        }
    }
}
