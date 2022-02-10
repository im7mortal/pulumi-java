// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudkms_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class CertificateResponse extends io.pulumi.resources.InvokeArgs {

    public static final CertificateResponse Empty = new CertificateResponse();

    @InputImport(name="issuer", required=true)
    private final String issuer;

    public String getIssuer() {
        return this.issuer;
    }

    @InputImport(name="notAfterTime", required=true)
    private final String notAfterTime;

    public String getNotAfterTime() {
        return this.notAfterTime;
    }

    @InputImport(name="notBeforeTime", required=true)
    private final String notBeforeTime;

    public String getNotBeforeTime() {
        return this.notBeforeTime;
    }

    @InputImport(name="parsed", required=true)
    private final Boolean parsed;

    public Boolean getParsed() {
        return this.parsed;
    }

    @InputImport(name="rawDer", required=true)
    private final String rawDer;

    public String getRawDer() {
        return this.rawDer;
    }

    @InputImport(name="serialNumber", required=true)
    private final String serialNumber;

    public String getSerialNumber() {
        return this.serialNumber;
    }

    @InputImport(name="sha256Fingerprint", required=true)
    private final String sha256Fingerprint;

    public String getSha256Fingerprint() {
        return this.sha256Fingerprint;
    }

    @InputImport(name="subject", required=true)
    private final String subject;

    public String getSubject() {
        return this.subject;
    }

    @InputImport(name="subjectAlternativeDnsNames", required=true)
    private final List<String> subjectAlternativeDnsNames;

    public List<String> getSubjectAlternativeDnsNames() {
        return this.subjectAlternativeDnsNames;
    }

    public CertificateResponse(
        String issuer,
        String notAfterTime,
        String notBeforeTime,
        Boolean parsed,
        String rawDer,
        String serialNumber,
        String sha256Fingerprint,
        String subject,
        List<String> subjectAlternativeDnsNames) {
        this.issuer = Objects.requireNonNull(issuer, "expected parameter 'issuer' to be non-null");
        this.notAfterTime = Objects.requireNonNull(notAfterTime, "expected parameter 'notAfterTime' to be non-null");
        this.notBeforeTime = Objects.requireNonNull(notBeforeTime, "expected parameter 'notBeforeTime' to be non-null");
        this.parsed = Objects.requireNonNull(parsed, "expected parameter 'parsed' to be non-null");
        this.rawDer = Objects.requireNonNull(rawDer, "expected parameter 'rawDer' to be non-null");
        this.serialNumber = Objects.requireNonNull(serialNumber, "expected parameter 'serialNumber' to be non-null");
        this.sha256Fingerprint = Objects.requireNonNull(sha256Fingerprint, "expected parameter 'sha256Fingerprint' to be non-null");
        this.subject = Objects.requireNonNull(subject, "expected parameter 'subject' to be non-null");
        this.subjectAlternativeDnsNames = Objects.requireNonNull(subjectAlternativeDnsNames, "expected parameter 'subjectAlternativeDnsNames' to be non-null");
    }

    private CertificateResponse() {
        this.issuer = null;
        this.notAfterTime = null;
        this.notBeforeTime = null;
        this.parsed = null;
        this.rawDer = null;
        this.serialNumber = null;
        this.sha256Fingerprint = null;
        this.subject = null;
        this.subjectAlternativeDnsNames = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String issuer;
        private String notAfterTime;
        private String notBeforeTime;
        private Boolean parsed;
        private String rawDer;
        private String serialNumber;
        private String sha256Fingerprint;
        private String subject;
        private List<String> subjectAlternativeDnsNames;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.issuer = defaults.issuer;
    	      this.notAfterTime = defaults.notAfterTime;
    	      this.notBeforeTime = defaults.notBeforeTime;
    	      this.parsed = defaults.parsed;
    	      this.rawDer = defaults.rawDer;
    	      this.serialNumber = defaults.serialNumber;
    	      this.sha256Fingerprint = defaults.sha256Fingerprint;
    	      this.subject = defaults.subject;
    	      this.subjectAlternativeDnsNames = defaults.subjectAlternativeDnsNames;
        }

        public Builder setIssuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }

        public Builder setNotAfterTime(String notAfterTime) {
            this.notAfterTime = Objects.requireNonNull(notAfterTime);
            return this;
        }

        public Builder setNotBeforeTime(String notBeforeTime) {
            this.notBeforeTime = Objects.requireNonNull(notBeforeTime);
            return this;
        }

        public Builder setParsed(Boolean parsed) {
            this.parsed = Objects.requireNonNull(parsed);
            return this;
        }

        public Builder setRawDer(String rawDer) {
            this.rawDer = Objects.requireNonNull(rawDer);
            return this;
        }

        public Builder setSerialNumber(String serialNumber) {
            this.serialNumber = Objects.requireNonNull(serialNumber);
            return this;
        }

        public Builder setSha256Fingerprint(String sha256Fingerprint) {
            this.sha256Fingerprint = Objects.requireNonNull(sha256Fingerprint);
            return this;
        }

        public Builder setSubject(String subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }

        public Builder setSubjectAlternativeDnsNames(List<String> subjectAlternativeDnsNames) {
            this.subjectAlternativeDnsNames = Objects.requireNonNull(subjectAlternativeDnsNames);
            return this;
        }

        public CertificateResponse build() {
            return new CertificateResponse(issuer, notAfterTime, notBeforeTime, parsed, rawDer, serialNumber, sha256Fingerprint, subject, subjectAlternativeDnsNames);
        }
    }
}