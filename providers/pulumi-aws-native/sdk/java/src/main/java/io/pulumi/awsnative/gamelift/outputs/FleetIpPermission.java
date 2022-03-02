// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.outputs;

import io.pulumi.awsnative.gamelift.enums.FleetIpPermissionProtocol;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FleetIpPermission {
    /**
     * A starting value for a range of allowed port numbers.
     * 
     */
    private final Integer fromPort;
    /**
     * A range of allowed IP addresses. This value must be expressed in CIDR notation. Example: "000.000.000.000/[subnet mask]" or optionally the shortened version "0.0.0.0/[subnet mask]".
     * 
     */
    private final String ipRange;
    /**
     * The network communication protocol used by the fleet.
     * 
     */
    private final FleetIpPermissionProtocol protocol;
    /**
     * An ending value for a range of allowed port numbers. Port numbers are end-inclusive. This value must be higher than FromPort.
     * 
     */
    private final Integer toPort;

    @OutputCustomType.Constructor({"fromPort","ipRange","protocol","toPort"})
    private FleetIpPermission(
        Integer fromPort,
        String ipRange,
        FleetIpPermissionProtocol protocol,
        Integer toPort) {
        this.fromPort = Objects.requireNonNull(fromPort);
        this.ipRange = Objects.requireNonNull(ipRange);
        this.protocol = Objects.requireNonNull(protocol);
        this.toPort = Objects.requireNonNull(toPort);
    }

    /**
     * A starting value for a range of allowed port numbers.
     * 
    */
    public Integer getFromPort() {
        return this.fromPort;
    }
    /**
     * A range of allowed IP addresses. This value must be expressed in CIDR notation. Example: "000.000.000.000/[subnet mask]" or optionally the shortened version "0.0.0.0/[subnet mask]".
     * 
    */
    public String getIpRange() {
        return this.ipRange;
    }
    /**
     * The network communication protocol used by the fleet.
     * 
    */
    public FleetIpPermissionProtocol getProtocol() {
        return this.protocol;
    }
    /**
     * An ending value for a range of allowed port numbers. Port numbers are end-inclusive. This value must be higher than FromPort.
     * 
    */
    public Integer getToPort() {
        return this.toPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetIpPermission defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer fromPort;
        private String ipRange;
        private FleetIpPermissionProtocol protocol;
        private Integer toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetIpPermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fromPort = defaults.fromPort;
    	      this.ipRange = defaults.ipRange;
    	      this.protocol = defaults.protocol;
    	      this.toPort = defaults.toPort;
        }

        public Builder setFromPort(Integer fromPort) {
            this.fromPort = Objects.requireNonNull(fromPort);
            return this;
        }

        public Builder setIpRange(String ipRange) {
            this.ipRange = Objects.requireNonNull(ipRange);
            return this;
        }

        public Builder setProtocol(FleetIpPermissionProtocol protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setToPort(Integer toPort) {
            this.toPort = Objects.requireNonNull(toPort);
            return this;
        }
        public FleetIpPermission build() {
            return new FleetIpPermission(fromPort, ipRange, protocol, toPort);
        }
    }
}
