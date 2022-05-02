// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dns_v2.enums.ManagedZoneForwardingConfigNameServerTargetForwardingPath;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedZoneForwardingConfigNameServerTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedZoneForwardingConfigNameServerTargetArgs Empty = new ManagedZoneForwardingConfigNameServerTargetArgs();

    /**
     * Forwarding path for this NameServerTarget. If unset or set to DEFAULT, Cloud DNS makes forwarding decisions based on IP address ranges; that is, RFC1918 addresses go to the VPC network, non-RFC1918 addresses go to the internet. When set to PRIVATE, Cloud DNS always sends queries through the VPC network for this target.
     * 
     */
    @Import(name="forwardingPath")
    private @Nullable Output<ManagedZoneForwardingConfigNameServerTargetForwardingPath> forwardingPath;

    /**
     * @return Forwarding path for this NameServerTarget. If unset or set to DEFAULT, Cloud DNS makes forwarding decisions based on IP address ranges; that is, RFC1918 addresses go to the VPC network, non-RFC1918 addresses go to the internet. When set to PRIVATE, Cloud DNS always sends queries through the VPC network for this target.
     * 
     */
    public Optional<Output<ManagedZoneForwardingConfigNameServerTargetForwardingPath>> forwardingPath() {
        return Optional.ofNullable(this.forwardingPath);
    }

    /**
     * IPv4 address of a target name server.
     * 
     */
    @Import(name="ipv4Address")
    private @Nullable Output<String> ipv4Address;

    /**
     * @return IPv4 address of a target name server.
     * 
     */
    public Optional<Output<String>> ipv4Address() {
        return Optional.ofNullable(this.ipv4Address);
    }

    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    private ManagedZoneForwardingConfigNameServerTargetArgs() {}

    private ManagedZoneForwardingConfigNameServerTargetArgs(ManagedZoneForwardingConfigNameServerTargetArgs $) {
        this.forwardingPath = $.forwardingPath;
        this.ipv4Address = $.ipv4Address;
        this.kind = $.kind;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedZoneForwardingConfigNameServerTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedZoneForwardingConfigNameServerTargetArgs $;

        public Builder() {
            $ = new ManagedZoneForwardingConfigNameServerTargetArgs();
        }

        public Builder(ManagedZoneForwardingConfigNameServerTargetArgs defaults) {
            $ = new ManagedZoneForwardingConfigNameServerTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param forwardingPath Forwarding path for this NameServerTarget. If unset or set to DEFAULT, Cloud DNS makes forwarding decisions based on IP address ranges; that is, RFC1918 addresses go to the VPC network, non-RFC1918 addresses go to the internet. When set to PRIVATE, Cloud DNS always sends queries through the VPC network for this target.
         * 
         * @return builder
         * 
         */
        public Builder forwardingPath(@Nullable Output<ManagedZoneForwardingConfigNameServerTargetForwardingPath> forwardingPath) {
            $.forwardingPath = forwardingPath;
            return this;
        }

        /**
         * @param forwardingPath Forwarding path for this NameServerTarget. If unset or set to DEFAULT, Cloud DNS makes forwarding decisions based on IP address ranges; that is, RFC1918 addresses go to the VPC network, non-RFC1918 addresses go to the internet. When set to PRIVATE, Cloud DNS always sends queries through the VPC network for this target.
         * 
         * @return builder
         * 
         */
        public Builder forwardingPath(ManagedZoneForwardingConfigNameServerTargetForwardingPath forwardingPath) {
            return forwardingPath(Output.of(forwardingPath));
        }

        /**
         * @param ipv4Address IPv4 address of a target name server.
         * 
         * @return builder
         * 
         */
        public Builder ipv4Address(@Nullable Output<String> ipv4Address) {
            $.ipv4Address = ipv4Address;
            return this;
        }

        /**
         * @param ipv4Address IPv4 address of a target name server.
         * 
         * @return builder
         * 
         */
        public Builder ipv4Address(String ipv4Address) {
            return ipv4Address(Output.of(ipv4Address));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public ManagedZoneForwardingConfigNameServerTargetArgs build() {
            return $;
        }
    }

}
