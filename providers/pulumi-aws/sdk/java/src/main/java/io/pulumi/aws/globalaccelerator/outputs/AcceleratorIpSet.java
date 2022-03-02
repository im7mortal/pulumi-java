// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.globalaccelerator.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AcceleratorIpSet {
    /**
     * A list of IP addresses in the IP address set.
     * 
     */
    private final @Nullable List<String> ipAddresses;
    /**
     * The type of IP addresses included in this IP set.
     * 
     */
    private final @Nullable String ipFamily;

    @OutputCustomType.Constructor({"ipAddresses","ipFamily"})
    private AcceleratorIpSet(
        @Nullable List<String> ipAddresses,
        @Nullable String ipFamily) {
        this.ipAddresses = ipAddresses;
        this.ipFamily = ipFamily;
    }

    /**
     * A list of IP addresses in the IP address set.
     * 
    */
    public List<String> getIpAddresses() {
        return this.ipAddresses == null ? List.of() : this.ipAddresses;
    }
    /**
     * The type of IP addresses included in this IP set.
     * 
    */
    public Optional<String> getIpFamily() {
        return Optional.ofNullable(this.ipFamily);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AcceleratorIpSet defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> ipAddresses;
        private @Nullable String ipFamily;

        public Builder() {
    	      // Empty
        }

        public Builder(AcceleratorIpSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.ipFamily = defaults.ipFamily;
        }

        public Builder setIpAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }

        public Builder setIpFamily(@Nullable String ipFamily) {
            this.ipFamily = ipFamily;
            return this;
        }
        public AcceleratorIpSet build() {
            return new AcceleratorIpSet(ipAddresses, ipFamily);
        }
    }
}
