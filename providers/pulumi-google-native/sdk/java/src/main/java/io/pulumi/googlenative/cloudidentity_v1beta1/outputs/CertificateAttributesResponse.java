// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudidentity_v1beta1.outputs.CertificateTemplateResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CertificateAttributesResponse {
    /**
     * The X.509 extension for CertificateTemplate.
     * 
     */
    private final CertificateTemplateResponse certificateTemplate;
    /**
     * The encoded certificate fingerprint.
     * 
     */
    private final String fingerprint;
    /**
     * The name of the issuer of this certificate.
     * 
     */
    private final String issuer;
    /**
     * Serial number of the certificate, Example: "123456789".
     * 
     */
    private final String serialNumber;
    /**
     * The subject name of this certificate.
     * 
     */
    private final String subject;
    /**
     * The certificate thumbprint.
     * 
     */
    private final String thumbprint;
    /**
     * Validation state of this certificate.
     * 
     */
    private final String validationState;
    /**
     * Certificate not valid at or after this timestamp.
     * 
     */
    private final String validityExpirationTime;
    /**
     * Certificate not valid before this timestamp.
     * 
     */
    private final String validityStartTime;

    @OutputCustomType.Constructor({"certificateTemplate","fingerprint","issuer","serialNumber","subject","thumbprint","validationState","validityExpirationTime","validityStartTime"})
    private CertificateAttributesResponse(
        CertificateTemplateResponse certificateTemplate,
        String fingerprint,
        String issuer,
        String serialNumber,
        String subject,
        String thumbprint,
        String validationState,
        String validityExpirationTime,
        String validityStartTime) {
        this.certificateTemplate = Objects.requireNonNull(certificateTemplate);
        this.fingerprint = Objects.requireNonNull(fingerprint);
        this.issuer = Objects.requireNonNull(issuer);
        this.serialNumber = Objects.requireNonNull(serialNumber);
        this.subject = Objects.requireNonNull(subject);
        this.thumbprint = Objects.requireNonNull(thumbprint);
        this.validationState = Objects.requireNonNull(validationState);
        this.validityExpirationTime = Objects.requireNonNull(validityExpirationTime);
        this.validityStartTime = Objects.requireNonNull(validityStartTime);
    }

    /**
     * The X.509 extension for CertificateTemplate.
     * 
    */
    public CertificateTemplateResponse getCertificateTemplate() {
        return this.certificateTemplate;
    }
    /**
     * The encoded certificate fingerprint.
     * 
    */
    public String getFingerprint() {
        return this.fingerprint;
    }
    /**
     * The name of the issuer of this certificate.
     * 
    */
    public String getIssuer() {
        return this.issuer;
    }
    /**
     * Serial number of the certificate, Example: "123456789".
     * 
    */
    public String getSerialNumber() {
        return this.serialNumber;
    }
    /**
     * The subject name of this certificate.
     * 
    */
    public String getSubject() {
        return this.subject;
    }
    /**
     * The certificate thumbprint.
     * 
    */
    public String getThumbprint() {
        return this.thumbprint;
    }
    /**
     * Validation state of this certificate.
     * 
    */
    public String getValidationState() {
        return this.validationState;
    }
    /**
     * Certificate not valid at or after this timestamp.
     * 
    */
    public String getValidityExpirationTime() {
        return this.validityExpirationTime;
    }
    /**
     * Certificate not valid before this timestamp.
     * 
    */
    public String getValidityStartTime() {
        return this.validityStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAttributesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateTemplateResponse certificateTemplate;
        private String fingerprint;
        private String issuer;
        private String serialNumber;
        private String subject;
        private String thumbprint;
        private String validationState;
        private String validityExpirationTime;
        private String validityStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAttributesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateTemplate = defaults.certificateTemplate;
    	      this.fingerprint = defaults.fingerprint;
    	      this.issuer = defaults.issuer;
    	      this.serialNumber = defaults.serialNumber;
    	      this.subject = defaults.subject;
    	      this.thumbprint = defaults.thumbprint;
    	      this.validationState = defaults.validationState;
    	      this.validityExpirationTime = defaults.validityExpirationTime;
    	      this.validityStartTime = defaults.validityStartTime;
        }

        public Builder setCertificateTemplate(CertificateTemplateResponse certificateTemplate) {
            this.certificateTemplate = Objects.requireNonNull(certificateTemplate);
            return this;
        }

        public Builder setFingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder setIssuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }

        public Builder setSerialNumber(String serialNumber) {
            this.serialNumber = Objects.requireNonNull(serialNumber);
            return this;
        }

        public Builder setSubject(String subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }

        public Builder setThumbprint(String thumbprint) {
            this.thumbprint = Objects.requireNonNull(thumbprint);
            return this;
        }

        public Builder setValidationState(String validationState) {
            this.validationState = Objects.requireNonNull(validationState);
            return this;
        }

        public Builder setValidityExpirationTime(String validityExpirationTime) {
            this.validityExpirationTime = Objects.requireNonNull(validityExpirationTime);
            return this;
        }

        public Builder setValidityStartTime(String validityStartTime) {
            this.validityStartTime = Objects.requireNonNull(validityStartTime);
            return this;
        }
        public CertificateAttributesResponse build() {
            return new CertificateAttributesResponse(certificateTemplate, fingerprint, issuer, serialNumber, subject, thumbprint, validationState, validityExpirationTime, validityStartTime);
        }
    }
}
