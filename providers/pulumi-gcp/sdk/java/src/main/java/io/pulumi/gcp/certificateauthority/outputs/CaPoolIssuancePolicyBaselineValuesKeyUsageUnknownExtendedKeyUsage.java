// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsage {
    /**
     * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * 
     */
    private final List<Integer> objectIdPaths;

    @OutputCustomType.Constructor({"objectIdPaths"})
    private CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsage(List<Integer> objectIdPaths) {
        this.objectIdPaths = Objects.requireNonNull(objectIdPaths);
    }

    /**
     * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * 
    */
    public List<Integer> getObjectIdPaths() {
        return this.objectIdPaths;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Integer> objectIdPaths;

        public Builder() {
    	      // Empty
        }

        public Builder(CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectIdPaths = defaults.objectIdPaths;
        }

        public Builder setObjectIdPaths(List<Integer> objectIdPaths) {
            this.objectIdPaths = Objects.requireNonNull(objectIdPaths);
            return this;
        }
        public CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsage build() {
            return new CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsage(objectIdPaths);
        }
    }
}
