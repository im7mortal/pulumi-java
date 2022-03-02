// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IpAddressRangeResponse {
    /**
     * The IP address range.
     * 
     */
    private final @Nullable String addressRange;

    @OutputCustomType.Constructor({"addressRange"})
    private IpAddressRangeResponse(@Nullable String addressRange) {
        this.addressRange = addressRange;
    }

    /**
     * The IP address range.
     * 
    */
    public Optional<String> getAddressRange() {
        return Optional.ofNullable(this.addressRange);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpAddressRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String addressRange;

        public Builder() {
    	      // Empty
        }

        public Builder(IpAddressRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressRange = defaults.addressRange;
        }

        public Builder setAddressRange(@Nullable String addressRange) {
            this.addressRange = addressRange;
            return this;
        }
        public IpAddressRangeResponse build() {
            return new IpAddressRangeResponse(addressRange);
        }
    }
}
