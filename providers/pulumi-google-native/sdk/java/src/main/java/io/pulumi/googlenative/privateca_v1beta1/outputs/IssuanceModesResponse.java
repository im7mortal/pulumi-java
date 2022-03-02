// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class IssuanceModesResponse {
    /**
     * When true, allows callers to create Certificates by specifying a CertificateConfig.
     * 
     */
    private final Boolean allowConfigBasedIssuance;
    /**
     * When true, allows callers to create Certificates by specifying a CSR.
     * 
     */
    private final Boolean allowCsrBasedIssuance;

    @OutputCustomType.Constructor({"allowConfigBasedIssuance","allowCsrBasedIssuance"})
    private IssuanceModesResponse(
        Boolean allowConfigBasedIssuance,
        Boolean allowCsrBasedIssuance) {
        this.allowConfigBasedIssuance = Objects.requireNonNull(allowConfigBasedIssuance);
        this.allowCsrBasedIssuance = Objects.requireNonNull(allowCsrBasedIssuance);
    }

    /**
     * When true, allows callers to create Certificates by specifying a CertificateConfig.
     * 
    */
    public Boolean getAllowConfigBasedIssuance() {
        return this.allowConfigBasedIssuance;
    }
    /**
     * When true, allows callers to create Certificates by specifying a CSR.
     * 
    */
    public Boolean getAllowCsrBasedIssuance() {
        return this.allowCsrBasedIssuance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IssuanceModesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowConfigBasedIssuance;
        private Boolean allowCsrBasedIssuance;

        public Builder() {
    	      // Empty
        }

        public Builder(IssuanceModesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowConfigBasedIssuance = defaults.allowConfigBasedIssuance;
    	      this.allowCsrBasedIssuance = defaults.allowCsrBasedIssuance;
        }

        public Builder setAllowConfigBasedIssuance(Boolean allowConfigBasedIssuance) {
            this.allowConfigBasedIssuance = Objects.requireNonNull(allowConfigBasedIssuance);
            return this;
        }

        public Builder setAllowCsrBasedIssuance(Boolean allowCsrBasedIssuance) {
            this.allowCsrBasedIssuance = Objects.requireNonNull(allowCsrBasedIssuance);
            return this;
        }
        public IssuanceModesResponse build() {
            return new IssuanceModesResponse(allowConfigBasedIssuance, allowCsrBasedIssuance);
        }
    }
}
