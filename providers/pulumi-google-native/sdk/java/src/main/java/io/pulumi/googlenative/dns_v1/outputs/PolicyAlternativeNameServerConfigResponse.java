// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dns_v1.outputs.PolicyAlternativeNameServerConfigTargetNameServerResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class PolicyAlternativeNameServerConfigResponse {
    private final String kind;
    /**
     * Sets an alternative name server for the associated networks. When specified, all DNS queries are forwarded to a name server that you choose. Names such as .internal are not available when an alternative name server is specified.
     * 
     */
    private final List<PolicyAlternativeNameServerConfigTargetNameServerResponse> targetNameServers;

    @OutputCustomType.Constructor({"kind","targetNameServers"})
    private PolicyAlternativeNameServerConfigResponse(
        String kind,
        List<PolicyAlternativeNameServerConfigTargetNameServerResponse> targetNameServers) {
        this.kind = Objects.requireNonNull(kind);
        this.targetNameServers = Objects.requireNonNull(targetNameServers);
    }

    public String getKind() {
        return this.kind;
    }
    /**
     * Sets an alternative name server for the associated networks. When specified, all DNS queries are forwarded to a name server that you choose. Names such as .internal are not available when an alternative name server is specified.
     * 
    */
    public List<PolicyAlternativeNameServerConfigTargetNameServerResponse> getTargetNameServers() {
        return this.targetNameServers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyAlternativeNameServerConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private List<PolicyAlternativeNameServerConfigTargetNameServerResponse> targetNameServers;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyAlternativeNameServerConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.targetNameServers = defaults.targetNameServers;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setTargetNameServers(List<PolicyAlternativeNameServerConfigTargetNameServerResponse> targetNameServers) {
            this.targetNameServers = Objects.requireNonNull(targetNameServers);
            return this;
        }
        public PolicyAlternativeNameServerConfigResponse build() {
            return new PolicyAlternativeNameServerConfigResponse(kind, targetNameServers);
        }
    }
}
