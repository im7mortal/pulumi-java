// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.certificateauthority.outputs.CertificateCertificateDescriptionAuthorityKeyId;
import io.pulumi.gcp.certificateauthority.outputs.CertificateCertificateDescriptionCertFingerprint;
import io.pulumi.gcp.certificateauthority.outputs.CertificateCertificateDescriptionConfigValue;
import io.pulumi.gcp.certificateauthority.outputs.CertificateCertificateDescriptionPublicKey;
import io.pulumi.gcp.certificateauthority.outputs.CertificateCertificateDescriptionSubjectDescription;
import io.pulumi.gcp.certificateauthority.outputs.CertificateCertificateDescriptionSubjectKeyId;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class CertificateCertificateDescription {
    private final @Nullable List<String> aiaIssuingCertificateUrls;
    private final @Nullable List<CertificateCertificateDescriptionAuthorityKeyId> authorityKeyIds;
    private final @Nullable List<CertificateCertificateDescriptionCertFingerprint> certFingerprints;
    private final @Nullable List<CertificateCertificateDescriptionConfigValue> configValues;
    private final @Nullable List<String> crlDistributionPoints;
    /**
     * A PublicKey describes a public key.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<CertificateCertificateDescriptionPublicKey> publicKeys;
    private final @Nullable List<CertificateCertificateDescriptionSubjectDescription> subjectDescriptions;
    private final @Nullable List<CertificateCertificateDescriptionSubjectKeyId> subjectKeyIds;

    @OutputCustomType.Constructor({"aiaIssuingCertificateUrls","authorityKeyIds","certFingerprints","configValues","crlDistributionPoints","publicKeys","subjectDescriptions","subjectKeyIds"})
    private CertificateCertificateDescription(
        @Nullable List<String> aiaIssuingCertificateUrls,
        @Nullable List<CertificateCertificateDescriptionAuthorityKeyId> authorityKeyIds,
        @Nullable List<CertificateCertificateDescriptionCertFingerprint> certFingerprints,
        @Nullable List<CertificateCertificateDescriptionConfigValue> configValues,
        @Nullable List<String> crlDistributionPoints,
        @Nullable List<CertificateCertificateDescriptionPublicKey> publicKeys,
        @Nullable List<CertificateCertificateDescriptionSubjectDescription> subjectDescriptions,
        @Nullable List<CertificateCertificateDescriptionSubjectKeyId> subjectKeyIds) {
        this.aiaIssuingCertificateUrls = aiaIssuingCertificateUrls;
        this.authorityKeyIds = authorityKeyIds;
        this.certFingerprints = certFingerprints;
        this.configValues = configValues;
        this.crlDistributionPoints = crlDistributionPoints;
        this.publicKeys = publicKeys;
        this.subjectDescriptions = subjectDescriptions;
        this.subjectKeyIds = subjectKeyIds;
    }

    public List<String> getAiaIssuingCertificateUrls() {
        return this.aiaIssuingCertificateUrls == null ? List.of() : this.aiaIssuingCertificateUrls;
    }
    public List<CertificateCertificateDescriptionAuthorityKeyId> getAuthorityKeyIds() {
        return this.authorityKeyIds == null ? List.of() : this.authorityKeyIds;
    }
    public List<CertificateCertificateDescriptionCertFingerprint> getCertFingerprints() {
        return this.certFingerprints == null ? List.of() : this.certFingerprints;
    }
    public List<CertificateCertificateDescriptionConfigValue> getConfigValues() {
        return this.configValues == null ? List.of() : this.configValues;
    }
    public List<String> getCrlDistributionPoints() {
        return this.crlDistributionPoints == null ? List.of() : this.crlDistributionPoints;
    }
    /**
     * A PublicKey describes a public key.
     * Structure is documented below.
     * 
    */
    public List<CertificateCertificateDescriptionPublicKey> getPublicKeys() {
        return this.publicKeys == null ? List.of() : this.publicKeys;
    }
    public List<CertificateCertificateDescriptionSubjectDescription> getSubjectDescriptions() {
        return this.subjectDescriptions == null ? List.of() : this.subjectDescriptions;
    }
    public List<CertificateCertificateDescriptionSubjectKeyId> getSubjectKeyIds() {
        return this.subjectKeyIds == null ? List.of() : this.subjectKeyIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescription defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> aiaIssuingCertificateUrls;
        private @Nullable List<CertificateCertificateDescriptionAuthorityKeyId> authorityKeyIds;
        private @Nullable List<CertificateCertificateDescriptionCertFingerprint> certFingerprints;
        private @Nullable List<CertificateCertificateDescriptionConfigValue> configValues;
        private @Nullable List<String> crlDistributionPoints;
        private @Nullable List<CertificateCertificateDescriptionPublicKey> publicKeys;
        private @Nullable List<CertificateCertificateDescriptionSubjectDescription> subjectDescriptions;
        private @Nullable List<CertificateCertificateDescriptionSubjectKeyId> subjectKeyIds;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescription defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aiaIssuingCertificateUrls = defaults.aiaIssuingCertificateUrls;
    	      this.authorityKeyIds = defaults.authorityKeyIds;
    	      this.certFingerprints = defaults.certFingerprints;
    	      this.configValues = defaults.configValues;
    	      this.crlDistributionPoints = defaults.crlDistributionPoints;
    	      this.publicKeys = defaults.publicKeys;
    	      this.subjectDescriptions = defaults.subjectDescriptions;
    	      this.subjectKeyIds = defaults.subjectKeyIds;
        }

        public Builder setAiaIssuingCertificateUrls(@Nullable List<String> aiaIssuingCertificateUrls) {
            this.aiaIssuingCertificateUrls = aiaIssuingCertificateUrls;
            return this;
        }

        public Builder setAuthorityKeyIds(@Nullable List<CertificateCertificateDescriptionAuthorityKeyId> authorityKeyIds) {
            this.authorityKeyIds = authorityKeyIds;
            return this;
        }

        public Builder setCertFingerprints(@Nullable List<CertificateCertificateDescriptionCertFingerprint> certFingerprints) {
            this.certFingerprints = certFingerprints;
            return this;
        }

        public Builder setConfigValues(@Nullable List<CertificateCertificateDescriptionConfigValue> configValues) {
            this.configValues = configValues;
            return this;
        }

        public Builder setCrlDistributionPoints(@Nullable List<String> crlDistributionPoints) {
            this.crlDistributionPoints = crlDistributionPoints;
            return this;
        }

        public Builder setPublicKeys(@Nullable List<CertificateCertificateDescriptionPublicKey> publicKeys) {
            this.publicKeys = publicKeys;
            return this;
        }

        public Builder setSubjectDescriptions(@Nullable List<CertificateCertificateDescriptionSubjectDescription> subjectDescriptions) {
            this.subjectDescriptions = subjectDescriptions;
            return this;
        }

        public Builder setSubjectKeyIds(@Nullable List<CertificateCertificateDescriptionSubjectKeyId> subjectKeyIds) {
            this.subjectKeyIds = subjectKeyIds;
            return this;
        }
        public CertificateCertificateDescription build() {
            return new CertificateCertificateDescription(aiaIssuingCertificateUrls, authorityKeyIds, certFingerprints, configValues, crlDistributionPoints, publicKeys, subjectDescriptions, subjectKeyIds);
        }
    }
}
