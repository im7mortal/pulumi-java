// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SasPolicyResponse {
    /**
     * The SAS expiration action. Can only be Log.
     * 
     */
    private final String expirationAction;
    /**
     * The SAS expiration period, DD.HH:MM:SS.
     * 
     */
    private final String sasExpirationPeriod;

    @OutputCustomType.Constructor({"expirationAction","sasExpirationPeriod"})
    private SasPolicyResponse(
        String expirationAction,
        String sasExpirationPeriod) {
        this.expirationAction = Objects.requireNonNull(expirationAction);
        this.sasExpirationPeriod = Objects.requireNonNull(sasExpirationPeriod);
    }

    /**
     * The SAS expiration action. Can only be Log.
     * 
    */
    public String getExpirationAction() {
        return this.expirationAction;
    }
    /**
     * The SAS expiration period, DD.HH:MM:SS.
     * 
    */
    public String getSasExpirationPeriod() {
        return this.sasExpirationPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SasPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expirationAction;
        private String sasExpirationPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(SasPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationAction = defaults.expirationAction;
    	      this.sasExpirationPeriod = defaults.sasExpirationPeriod;
        }

        public Builder setExpirationAction(String expirationAction) {
            this.expirationAction = Objects.requireNonNull(expirationAction);
            return this;
        }

        public Builder setSasExpirationPeriod(String sasExpirationPeriod) {
            this.sasExpirationPeriod = Objects.requireNonNull(sasExpirationPeriod);
            return this;
        }
        public SasPolicyResponse build() {
            return new SasPolicyResponse(expirationAction, sasExpirationPeriod);
        }
    }
}
