// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class NetworkPolicyConfigResponse {
    /**
     * Whether NetworkPolicy is enabled for this cluster.
     * 
     */
    private final Boolean disabled;

    @OutputCustomType.Constructor({"disabled"})
    private NetworkPolicyConfigResponse(Boolean disabled) {
        this.disabled = Objects.requireNonNull(disabled);
    }

    /**
     * Whether NetworkPolicy is enabled for this cluster.
     * 
    */
    public Boolean getDisabled() {
        return this.disabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPolicyConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disabled;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPolicyConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
        }

        public Builder setDisabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        public NetworkPolicyConfigResponse build() {
            return new NetworkPolicyConfigResponse(disabled);
        }
    }
}
