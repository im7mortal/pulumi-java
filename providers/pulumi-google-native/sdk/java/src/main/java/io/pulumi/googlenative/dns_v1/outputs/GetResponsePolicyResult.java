// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dns_v1.outputs.ResponsePolicyNetworkResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetResponsePolicyResult {
    /**
     * User-provided description for this Response Policy.
     * 
     */
    private final String description;
    private final String kind;
    /**
     * List of network names specifying networks to which this policy is applied.
     * 
     */
    private final List<ResponsePolicyNetworkResponse> networks;
    /**
     * User assigned name for this Response Policy.
     * 
     */
    private final String responsePolicyName;

    @OutputCustomType.Constructor({"description","kind","networks","responsePolicyName"})
    private GetResponsePolicyResult(
        String description,
        String kind,
        List<ResponsePolicyNetworkResponse> networks,
        String responsePolicyName) {
        this.description = Objects.requireNonNull(description);
        this.kind = Objects.requireNonNull(kind);
        this.networks = Objects.requireNonNull(networks);
        this.responsePolicyName = Objects.requireNonNull(responsePolicyName);
    }

    /**
     * User-provided description for this Response Policy.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    public String getKind() {
        return this.kind;
    }
    /**
     * List of network names specifying networks to which this policy is applied.
     * 
    */
    public List<ResponsePolicyNetworkResponse> getNetworks() {
        return this.networks;
    }
    /**
     * User assigned name for this Response Policy.
     * 
    */
    public String getResponsePolicyName() {
        return this.responsePolicyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResponsePolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String kind;
        private List<ResponsePolicyNetworkResponse> networks;
        private String responsePolicyName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResponsePolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.kind = defaults.kind;
    	      this.networks = defaults.networks;
    	      this.responsePolicyName = defaults.responsePolicyName;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setNetworks(List<ResponsePolicyNetworkResponse> networks) {
            this.networks = Objects.requireNonNull(networks);
            return this;
        }

        public Builder setResponsePolicyName(String responsePolicyName) {
            this.responsePolicyName = Objects.requireNonNull(responsePolicyName);
            return this;
        }
        public GetResponsePolicyResult build() {
            return new GetResponsePolicyResult(description, kind, networks, responsePolicyName);
        }
    }
}
