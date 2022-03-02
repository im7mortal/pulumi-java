// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class StatefulPolicyPreservedStateResponse {
    /**
     * Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks.
     * 
     */
    private final Map<String,String> disks;
    /**
     * External network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name.
     * 
     */
    private final Map<String,String> externalIPs;
    /**
     * Internal network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name.
     * 
     */
    private final Map<String,String> internalIPs;

    @OutputCustomType.Constructor({"disks","externalIPs","internalIPs"})
    private StatefulPolicyPreservedStateResponse(
        Map<String,String> disks,
        Map<String,String> externalIPs,
        Map<String,String> internalIPs) {
        this.disks = Objects.requireNonNull(disks);
        this.externalIPs = Objects.requireNonNull(externalIPs);
        this.internalIPs = Objects.requireNonNull(internalIPs);
    }

    /**
     * Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks.
     * 
    */
    public Map<String,String> getDisks() {
        return this.disks;
    }
    /**
     * External network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name.
     * 
    */
    public Map<String,String> getExternalIPs() {
        return this.externalIPs;
    }
    /**
     * Internal network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name.
     * 
    */
    public Map<String,String> getInternalIPs() {
        return this.internalIPs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulPolicyPreservedStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> disks;
        private Map<String,String> externalIPs;
        private Map<String,String> internalIPs;

        public Builder() {
    	      // Empty
        }

        public Builder(StatefulPolicyPreservedStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disks = defaults.disks;
    	      this.externalIPs = defaults.externalIPs;
    	      this.internalIPs = defaults.internalIPs;
        }

        public Builder setDisks(Map<String,String> disks) {
            this.disks = Objects.requireNonNull(disks);
            return this;
        }

        public Builder setExternalIPs(Map<String,String> externalIPs) {
            this.externalIPs = Objects.requireNonNull(externalIPs);
            return this;
        }

        public Builder setInternalIPs(Map<String,String> internalIPs) {
            this.internalIPs = Objects.requireNonNull(internalIPs);
            return this;
        }
        public StatefulPolicyPreservedStateResponse build() {
            return new StatefulPolicyPreservedStateResponse(disks, externalIPs, internalIPs);
        }
    }
}
