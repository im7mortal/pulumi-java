// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.privateca_v1.outputs.ExprResponse;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class CertificateIdentityConstraintsResponse {
    /**
     * If this is true, the SubjectAltNames extension may be copied from a certificate request into the signed certificate. Otherwise, the requested SubjectAltNames will be discarded.
     * 
     */
    private final Boolean allowSubjectAltNamesPassthrough;
    /**
     * If this is true, the Subject field may be copied from a certificate request into the signed certificate. Otherwise, the requested Subject will be discarded.
     * 
     */
    private final Boolean allowSubjectPassthrough;
    /**
     * Optional. A CEL expression that may be used to validate the resolved X.509 Subject and/or Subject Alternative Name before a certificate is signed. To see the full allowed syntax and some examples, see https://cloud.google.com/certificate-authority-service/docs/using-cel
     * 
     */
    private final ExprResponse celExpression;

    @OutputCustomType.Constructor({"allowSubjectAltNamesPassthrough","allowSubjectPassthrough","celExpression"})
    private CertificateIdentityConstraintsResponse(
        Boolean allowSubjectAltNamesPassthrough,
        Boolean allowSubjectPassthrough,
        ExprResponse celExpression) {
        this.allowSubjectAltNamesPassthrough = Objects.requireNonNull(allowSubjectAltNamesPassthrough);
        this.allowSubjectPassthrough = Objects.requireNonNull(allowSubjectPassthrough);
        this.celExpression = Objects.requireNonNull(celExpression);
    }

    /**
     * If this is true, the SubjectAltNames extension may be copied from a certificate request into the signed certificate. Otherwise, the requested SubjectAltNames will be discarded.
     * 
    */
    public Boolean getAllowSubjectAltNamesPassthrough() {
        return this.allowSubjectAltNamesPassthrough;
    }
    /**
     * If this is true, the Subject field may be copied from a certificate request into the signed certificate. Otherwise, the requested Subject will be discarded.
     * 
    */
    public Boolean getAllowSubjectPassthrough() {
        return this.allowSubjectPassthrough;
    }
    /**
     * Optional. A CEL expression that may be used to validate the resolved X.509 Subject and/or Subject Alternative Name before a certificate is signed. To see the full allowed syntax and some examples, see https://cloud.google.com/certificate-authority-service/docs/using-cel
     * 
    */
    public ExprResponse getCelExpression() {
        return this.celExpression;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateIdentityConstraintsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowSubjectAltNamesPassthrough;
        private Boolean allowSubjectPassthrough;
        private ExprResponse celExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateIdentityConstraintsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowSubjectAltNamesPassthrough = defaults.allowSubjectAltNamesPassthrough;
    	      this.allowSubjectPassthrough = defaults.allowSubjectPassthrough;
    	      this.celExpression = defaults.celExpression;
        }

        public Builder setAllowSubjectAltNamesPassthrough(Boolean allowSubjectAltNamesPassthrough) {
            this.allowSubjectAltNamesPassthrough = Objects.requireNonNull(allowSubjectAltNamesPassthrough);
            return this;
        }

        public Builder setAllowSubjectPassthrough(Boolean allowSubjectPassthrough) {
            this.allowSubjectPassthrough = Objects.requireNonNull(allowSubjectPassthrough);
            return this;
        }

        public Builder setCelExpression(ExprResponse celExpression) {
            this.celExpression = Objects.requireNonNull(celExpression);
            return this;
        }
        public CertificateIdentityConstraintsResponse build() {
            return new CertificateIdentityConstraintsResponse(allowSubjectAltNamesPassthrough, allowSubjectPassthrough, celExpression);
        }
    }
}
