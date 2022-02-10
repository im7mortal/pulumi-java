// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AaaaRecordArgs extends io.pulumi.resources.ResourceArgs {

    public static final AaaaRecordArgs Empty = new AaaaRecordArgs();

    @InputImport(name="ipv6Address")
    private final @Nullable Input<String> ipv6Address;

    public Input<String> getIpv6Address() {
        return this.ipv6Address == null ? Input.empty() : this.ipv6Address;
    }

    public AaaaRecordArgs(@Nullable Input<String> ipv6Address) {
        this.ipv6Address = ipv6Address;
    }

    private AaaaRecordArgs() {
        this.ipv6Address = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AaaaRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> ipv6Address;

        public Builder() {
    	      // Empty
        }

        public Builder(AaaaRecordArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipv6Address = defaults.ipv6Address;
        }

        public Builder setIpv6Address(@Nullable Input<String> ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }

        public Builder setIpv6Address(@Nullable String ipv6Address) {
            this.ipv6Address = Input.ofNullable(ipv6Address);
            return this;
        }

        public AaaaRecordArgs build() {
            return new AaaaRecordArgs(ipv6Address);
        }
    }
}