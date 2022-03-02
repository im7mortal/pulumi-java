// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class InsightFiltersNetworkSourceIpv4 {
    /**
     * A finding's CIDR value.
     * 
     */
    private final String cidr;

    @OutputCustomType.Constructor({"cidr"})
    private InsightFiltersNetworkSourceIpv4(String cidr) {
        this.cidr = Objects.requireNonNull(cidr);
    }

    /**
     * A finding's CIDR value.
     * 
    */
    public String getCidr() {
        return this.cidr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersNetworkSourceIpv4 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cidr;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightFiltersNetworkSourceIpv4 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
        }

        public Builder setCidr(String cidr) {
            this.cidr = Objects.requireNonNull(cidr);
            return this;
        }
        public InsightFiltersNetworkSourceIpv4 build() {
            return new InsightFiltersNetworkSourceIpv4(cidr);
        }
    }
}
