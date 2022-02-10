// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.tpu_v2alpha1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NetworkConfigResponse {
    private final Boolean canIpForward;
    private final Boolean enableExternalIps;
    private final String network;
    private final String subnetwork;

    @OutputCustomType.Constructor({"canIpForward","enableExternalIps","network","subnetwork"})
    private NetworkConfigResponse(
        Boolean canIpForward,
        Boolean enableExternalIps,
        String network,
        String subnetwork) {
        this.canIpForward = Objects.requireNonNull(canIpForward);
        this.enableExternalIps = Objects.requireNonNull(enableExternalIps);
        this.network = Objects.requireNonNull(network);
        this.subnetwork = Objects.requireNonNull(subnetwork);
    }

    public Boolean getCanIpForward() {
        return this.canIpForward;
    }
    public Boolean getEnableExternalIps() {
        return this.enableExternalIps;
    }
    public String getNetwork() {
        return this.network;
    }
    public String getSubnetwork() {
        return this.subnetwork;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean canIpForward;
        private Boolean enableExternalIps;
        private String network;
        private String subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canIpForward = defaults.canIpForward;
    	      this.enableExternalIps = defaults.enableExternalIps;
    	      this.network = defaults.network;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder setCanIpForward(Boolean canIpForward) {
            this.canIpForward = Objects.requireNonNull(canIpForward);
            return this;
        }

        public Builder setEnableExternalIps(Boolean enableExternalIps) {
            this.enableExternalIps = Objects.requireNonNull(enableExternalIps);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setSubnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }

        public NetworkConfigResponse build() {
            return new NetworkConfigResponse(canIpForward, enableExternalIps, network, subnetwork);
        }
    }
}