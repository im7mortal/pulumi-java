// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class KeyPolicyResponse {
    /**
     * The key expiration period in days.
     * 
     */
    private final Integer keyExpirationPeriodInDays;

    @OutputCustomType.Constructor({"keyExpirationPeriodInDays"})
    private KeyPolicyResponse(Integer keyExpirationPeriodInDays) {
        this.keyExpirationPeriodInDays = Objects.requireNonNull(keyExpirationPeriodInDays);
    }

    /**
     * The key expiration period in days.
     * 
    */
    public Integer getKeyExpirationPeriodInDays() {
        return this.keyExpirationPeriodInDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer keyExpirationPeriodInDays;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyExpirationPeriodInDays = defaults.keyExpirationPeriodInDays;
        }

        public Builder setKeyExpirationPeriodInDays(Integer keyExpirationPeriodInDays) {
            this.keyExpirationPeriodInDays = Objects.requireNonNull(keyExpirationPeriodInDays);
            return this;
        }
        public KeyPolicyResponse build() {
            return new KeyPolicyResponse(keyExpirationPeriodInDays);
        }
    }
}
