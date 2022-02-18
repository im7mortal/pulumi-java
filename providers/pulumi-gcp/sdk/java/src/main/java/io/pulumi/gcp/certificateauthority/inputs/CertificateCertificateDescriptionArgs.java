// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionAuthorityKeyIdArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionCertFingerprintArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionConfigValueArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionPublicKeyArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectDescriptionArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectKeyIdArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateDescriptionArgs Empty = new CertificateCertificateDescriptionArgs();

    @InputImport(name="aiaIssuingCertificateUrls")
    private final @Nullable Input<List<String>> aiaIssuingCertificateUrls;

    public Input<List<String>> getAiaIssuingCertificateUrls() {
        return this.aiaIssuingCertificateUrls == null ? Input.empty() : this.aiaIssuingCertificateUrls;
    }

    @InputImport(name="authorityKeyIds")
    private final @Nullable Input<List<CertificateCertificateDescriptionAuthorityKeyIdArgs>> authorityKeyIds;

    public Input<List<CertificateCertificateDescriptionAuthorityKeyIdArgs>> getAuthorityKeyIds() {
        return this.authorityKeyIds == null ? Input.empty() : this.authorityKeyIds;
    }

    @InputImport(name="certFingerprints")
    private final @Nullable Input<List<CertificateCertificateDescriptionCertFingerprintArgs>> certFingerprints;

    public Input<List<CertificateCertificateDescriptionCertFingerprintArgs>> getCertFingerprints() {
        return this.certFingerprints == null ? Input.empty() : this.certFingerprints;
    }

    @InputImport(name="configValues")
    private final @Nullable Input<List<CertificateCertificateDescriptionConfigValueArgs>> configValues;

    public Input<List<CertificateCertificateDescriptionConfigValueArgs>> getConfigValues() {
        return this.configValues == null ? Input.empty() : this.configValues;
    }

    @InputImport(name="crlDistributionPoints")
    private final @Nullable Input<List<String>> crlDistributionPoints;

    public Input<List<String>> getCrlDistributionPoints() {
        return this.crlDistributionPoints == null ? Input.empty() : this.crlDistributionPoints;
    }

    /**
     * A PublicKey describes a public key.
     * Structure is documented below.
     * 
     */
    @InputImport(name="publicKeys")
    private final @Nullable Input<List<CertificateCertificateDescriptionPublicKeyArgs>> publicKeys;

    public Input<List<CertificateCertificateDescriptionPublicKeyArgs>> getPublicKeys() {
        return this.publicKeys == null ? Input.empty() : this.publicKeys;
    }

    @InputImport(name="subjectDescriptions")
    private final @Nullable Input<List<CertificateCertificateDescriptionSubjectDescriptionArgs>> subjectDescriptions;

    public Input<List<CertificateCertificateDescriptionSubjectDescriptionArgs>> getSubjectDescriptions() {
        return this.subjectDescriptions == null ? Input.empty() : this.subjectDescriptions;
    }

    @InputImport(name="subjectKeyIds")
    private final @Nullable Input<List<CertificateCertificateDescriptionSubjectKeyIdArgs>> subjectKeyIds;

    public Input<List<CertificateCertificateDescriptionSubjectKeyIdArgs>> getSubjectKeyIds() {
        return this.subjectKeyIds == null ? Input.empty() : this.subjectKeyIds;
    }

    public CertificateCertificateDescriptionArgs(
        @Nullable Input<List<String>> aiaIssuingCertificateUrls,
        @Nullable Input<List<CertificateCertificateDescriptionAuthorityKeyIdArgs>> authorityKeyIds,
        @Nullable Input<List<CertificateCertificateDescriptionCertFingerprintArgs>> certFingerprints,
        @Nullable Input<List<CertificateCertificateDescriptionConfigValueArgs>> configValues,
        @Nullable Input<List<String>> crlDistributionPoints,
        @Nullable Input<List<CertificateCertificateDescriptionPublicKeyArgs>> publicKeys,
        @Nullable Input<List<CertificateCertificateDescriptionSubjectDescriptionArgs>> subjectDescriptions,
        @Nullable Input<List<CertificateCertificateDescriptionSubjectKeyIdArgs>> subjectKeyIds) {
        this.aiaIssuingCertificateUrls = aiaIssuingCertificateUrls;
        this.authorityKeyIds = authorityKeyIds;
        this.certFingerprints = certFingerprints;
        this.configValues = configValues;
        this.crlDistributionPoints = crlDistributionPoints;
        this.publicKeys = publicKeys;
        this.subjectDescriptions = subjectDescriptions;
        this.subjectKeyIds = subjectKeyIds;
    }

    private CertificateCertificateDescriptionArgs() {
        this.aiaIssuingCertificateUrls = Input.empty();
        this.authorityKeyIds = Input.empty();
        this.certFingerprints = Input.empty();
        this.configValues = Input.empty();
        this.crlDistributionPoints = Input.empty();
        this.publicKeys = Input.empty();
        this.subjectDescriptions = Input.empty();
        this.subjectKeyIds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> aiaIssuingCertificateUrls;
        private @Nullable Input<List<CertificateCertificateDescriptionAuthorityKeyIdArgs>> authorityKeyIds;
        private @Nullable Input<List<CertificateCertificateDescriptionCertFingerprintArgs>> certFingerprints;
        private @Nullable Input<List<CertificateCertificateDescriptionConfigValueArgs>> configValues;
        private @Nullable Input<List<String>> crlDistributionPoints;
        private @Nullable Input<List<CertificateCertificateDescriptionPublicKeyArgs>> publicKeys;
        private @Nullable Input<List<CertificateCertificateDescriptionSubjectDescriptionArgs>> subjectDescriptions;
        private @Nullable Input<List<CertificateCertificateDescriptionSubjectKeyIdArgs>> subjectKeyIds;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionArgs defaults) {
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

        public Builder setAiaIssuingCertificateUrls(@Nullable Input<List<String>> aiaIssuingCertificateUrls) {
            this.aiaIssuingCertificateUrls = aiaIssuingCertificateUrls;
            return this;
        }

        public Builder setAiaIssuingCertificateUrls(@Nullable List<String> aiaIssuingCertificateUrls) {
            this.aiaIssuingCertificateUrls = Input.ofNullable(aiaIssuingCertificateUrls);
            return this;
        }

        public Builder setAuthorityKeyIds(@Nullable Input<List<CertificateCertificateDescriptionAuthorityKeyIdArgs>> authorityKeyIds) {
            this.authorityKeyIds = authorityKeyIds;
            return this;
        }

        public Builder setAuthorityKeyIds(@Nullable List<CertificateCertificateDescriptionAuthorityKeyIdArgs> authorityKeyIds) {
            this.authorityKeyIds = Input.ofNullable(authorityKeyIds);
            return this;
        }

        public Builder setCertFingerprints(@Nullable Input<List<CertificateCertificateDescriptionCertFingerprintArgs>> certFingerprints) {
            this.certFingerprints = certFingerprints;
            return this;
        }

        public Builder setCertFingerprints(@Nullable List<CertificateCertificateDescriptionCertFingerprintArgs> certFingerprints) {
            this.certFingerprints = Input.ofNullable(certFingerprints);
            return this;
        }

        public Builder setConfigValues(@Nullable Input<List<CertificateCertificateDescriptionConfigValueArgs>> configValues) {
            this.configValues = configValues;
            return this;
        }

        public Builder setConfigValues(@Nullable List<CertificateCertificateDescriptionConfigValueArgs> configValues) {
            this.configValues = Input.ofNullable(configValues);
            return this;
        }

        public Builder setCrlDistributionPoints(@Nullable Input<List<String>> crlDistributionPoints) {
            this.crlDistributionPoints = crlDistributionPoints;
            return this;
        }

        public Builder setCrlDistributionPoints(@Nullable List<String> crlDistributionPoints) {
            this.crlDistributionPoints = Input.ofNullable(crlDistributionPoints);
            return this;
        }

        public Builder setPublicKeys(@Nullable Input<List<CertificateCertificateDescriptionPublicKeyArgs>> publicKeys) {
            this.publicKeys = publicKeys;
            return this;
        }

        public Builder setPublicKeys(@Nullable List<CertificateCertificateDescriptionPublicKeyArgs> publicKeys) {
            this.publicKeys = Input.ofNullable(publicKeys);
            return this;
        }

        public Builder setSubjectDescriptions(@Nullable Input<List<CertificateCertificateDescriptionSubjectDescriptionArgs>> subjectDescriptions) {
            this.subjectDescriptions = subjectDescriptions;
            return this;
        }

        public Builder setSubjectDescriptions(@Nullable List<CertificateCertificateDescriptionSubjectDescriptionArgs> subjectDescriptions) {
            this.subjectDescriptions = Input.ofNullable(subjectDescriptions);
            return this;
        }

        public Builder setSubjectKeyIds(@Nullable Input<List<CertificateCertificateDescriptionSubjectKeyIdArgs>> subjectKeyIds) {
            this.subjectKeyIds = subjectKeyIds;
            return this;
        }

        public Builder setSubjectKeyIds(@Nullable List<CertificateCertificateDescriptionSubjectKeyIdArgs> subjectKeyIds) {
            this.subjectKeyIds = Input.ofNullable(subjectKeyIds);
            return this;
        }

        public CertificateCertificateDescriptionArgs build() {
            return new CertificateCertificateDescriptionArgs(aiaIssuingCertificateUrls, authorityKeyIds, certFingerprints, configValues, crlDistributionPoints, publicKeys, subjectDescriptions, subjectKeyIds);
        }
    }
}