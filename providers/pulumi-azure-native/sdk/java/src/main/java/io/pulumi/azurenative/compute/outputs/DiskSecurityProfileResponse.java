// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DiskSecurityProfileResponse {
    /**
     * Specifies the SecurityType of the VM. Applicable for OS disks only.
     * 
     */
    private final @Nullable String securityType;

    @OutputCustomType.Constructor({"securityType"})
    private DiskSecurityProfileResponse(@Nullable String securityType) {
        this.securityType = securityType;
    }

    /**
     * Specifies the SecurityType of the VM. Applicable for OS disks only.
     * 
    */
    public Optional<String> getSecurityType() {
        return Optional.ofNullable(this.securityType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskSecurityProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String securityType;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskSecurityProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityType = defaults.securityType;
        }

        public Builder setSecurityType(@Nullable String securityType) {
            this.securityType = securityType;
            return this;
        }
        public DiskSecurityProfileResponse build() {
            return new DiskSecurityProfileResponse(securityType);
        }
    }
}
