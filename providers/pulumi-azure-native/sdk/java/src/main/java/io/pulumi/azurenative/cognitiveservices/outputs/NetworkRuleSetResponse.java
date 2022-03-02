// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.outputs;

import io.pulumi.azurenative.cognitiveservices.outputs.IpRuleResponse;
import io.pulumi.azurenative.cognitiveservices.outputs.VirtualNetworkRuleResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkRuleSetResponse {
    /**
     * The default action when no rule from ipRules and from virtualNetworkRules match. This is only used after the bypass property has been evaluated.
     * 
     */
    private final @Nullable String defaultAction;
    /**
     * The list of IP address rules.
     * 
     */
    private final @Nullable List<IpRuleResponse> ipRules;
    /**
     * The list of virtual network rules.
     * 
     */
    private final @Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules;

    @OutputCustomType.Constructor({"defaultAction","ipRules","virtualNetworkRules"})
    private NetworkRuleSetResponse(
        @Nullable String defaultAction,
        @Nullable List<IpRuleResponse> ipRules,
        @Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules) {
        this.defaultAction = defaultAction;
        this.ipRules = ipRules;
        this.virtualNetworkRules = virtualNetworkRules;
    }

    /**
     * The default action when no rule from ipRules and from virtualNetworkRules match. This is only used after the bypass property has been evaluated.
     * 
    */
    public Optional<String> getDefaultAction() {
        return Optional.ofNullable(this.defaultAction);
    }
    /**
     * The list of IP address rules.
     * 
    */
    public List<IpRuleResponse> getIpRules() {
        return this.ipRules == null ? List.of() : this.ipRules;
    }
    /**
     * The list of virtual network rules.
     * 
    */
    public List<VirtualNetworkRuleResponse> getVirtualNetworkRules() {
        return this.virtualNetworkRules == null ? List.of() : this.virtualNetworkRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRuleSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String defaultAction;
        private @Nullable List<IpRuleResponse> ipRules;
        private @Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRuleSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultAction = defaults.defaultAction;
    	      this.ipRules = defaults.ipRules;
    	      this.virtualNetworkRules = defaults.virtualNetworkRules;
        }

        public Builder setDefaultAction(@Nullable String defaultAction) {
            this.defaultAction = defaultAction;
            return this;
        }

        public Builder setIpRules(@Nullable List<IpRuleResponse> ipRules) {
            this.ipRules = ipRules;
            return this;
        }

        public Builder setVirtualNetworkRules(@Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules) {
            this.virtualNetworkRules = virtualNetworkRules;
            return this;
        }
        public NetworkRuleSetResponse build() {
            return new NetworkRuleSetResponse(defaultAction, ipRules, virtualNetworkRules);
        }
    }
}
