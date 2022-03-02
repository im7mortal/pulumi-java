// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FirewallLogConfigResponse {
    /**
     * This field denotes whether to enable logging for a particular firewall rule.
     * 
     */
    private final Boolean enable;
    /**
     * This field can only be specified for a particular firewall rule if logging is enabled for that rule. This field denotes whether to include or exclude metadata for firewall logs.
     * 
     */
    private final String metadata;

    @OutputCustomType.Constructor({"enable","metadata"})
    private FirewallLogConfigResponse(
        Boolean enable,
        String metadata) {
        this.enable = Objects.requireNonNull(enable);
        this.metadata = Objects.requireNonNull(metadata);
    }

    /**
     * This field denotes whether to enable logging for a particular firewall rule.
     * 
    */
    public Boolean getEnable() {
        return this.enable;
    }
    /**
     * This field can only be specified for a particular firewall rule if logging is enabled for that rule. This field denotes whether to include or exclude metadata for firewall logs.
     * 
    */
    public String getMetadata() {
        return this.metadata;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallLogConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enable;
        private String metadata;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallLogConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.metadata = defaults.metadata;
        }

        public Builder setEnable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }

        public Builder setMetadata(String metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public FirewallLogConfigResponse build() {
            return new FirewallLogConfigResponse(enable, metadata);
        }
    }
}
