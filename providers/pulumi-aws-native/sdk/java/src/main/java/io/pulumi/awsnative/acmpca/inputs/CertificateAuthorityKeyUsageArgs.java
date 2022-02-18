// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Structure that contains X.509 KeyUsage information.
 * 
 */
public final class CertificateAuthorityKeyUsageArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateAuthorityKeyUsageArgs Empty = new CertificateAuthorityKeyUsageArgs();

    @InputImport(name="cRLSign")
    private final @Nullable Input<Boolean> cRLSign;

    public Input<Boolean> getCRLSign() {
        return this.cRLSign == null ? Input.empty() : this.cRLSign;
    }

    @InputImport(name="dataEncipherment")
    private final @Nullable Input<Boolean> dataEncipherment;

    public Input<Boolean> getDataEncipherment() {
        return this.dataEncipherment == null ? Input.empty() : this.dataEncipherment;
    }

    @InputImport(name="decipherOnly")
    private final @Nullable Input<Boolean> decipherOnly;

    public Input<Boolean> getDecipherOnly() {
        return this.decipherOnly == null ? Input.empty() : this.decipherOnly;
    }

    @InputImport(name="digitalSignature")
    private final @Nullable Input<Boolean> digitalSignature;

    public Input<Boolean> getDigitalSignature() {
        return this.digitalSignature == null ? Input.empty() : this.digitalSignature;
    }

    @InputImport(name="encipherOnly")
    private final @Nullable Input<Boolean> encipherOnly;

    public Input<Boolean> getEncipherOnly() {
        return this.encipherOnly == null ? Input.empty() : this.encipherOnly;
    }

    @InputImport(name="keyAgreement")
    private final @Nullable Input<Boolean> keyAgreement;

    public Input<Boolean> getKeyAgreement() {
        return this.keyAgreement == null ? Input.empty() : this.keyAgreement;
    }

    @InputImport(name="keyCertSign")
    private final @Nullable Input<Boolean> keyCertSign;

    public Input<Boolean> getKeyCertSign() {
        return this.keyCertSign == null ? Input.empty() : this.keyCertSign;
    }

    @InputImport(name="keyEncipherment")
    private final @Nullable Input<Boolean> keyEncipherment;

    public Input<Boolean> getKeyEncipherment() {
        return this.keyEncipherment == null ? Input.empty() : this.keyEncipherment;
    }

    @InputImport(name="nonRepudiation")
    private final @Nullable Input<Boolean> nonRepudiation;

    public Input<Boolean> getNonRepudiation() {
        return this.nonRepudiation == null ? Input.empty() : this.nonRepudiation;
    }

    public CertificateAuthorityKeyUsageArgs(
        @Nullable Input<Boolean> cRLSign,
        @Nullable Input<Boolean> dataEncipherment,
        @Nullable Input<Boolean> decipherOnly,
        @Nullable Input<Boolean> digitalSignature,
        @Nullable Input<Boolean> encipherOnly,
        @Nullable Input<Boolean> keyAgreement,
        @Nullable Input<Boolean> keyCertSign,
        @Nullable Input<Boolean> keyEncipherment,
        @Nullable Input<Boolean> nonRepudiation) {
        this.cRLSign = cRLSign;
        this.dataEncipherment = dataEncipherment;
        this.decipherOnly = decipherOnly;
        this.digitalSignature = digitalSignature;
        this.encipherOnly = encipherOnly;
        this.keyAgreement = keyAgreement;
        this.keyCertSign = keyCertSign;
        this.keyEncipherment = keyEncipherment;
        this.nonRepudiation = nonRepudiation;
    }

    private CertificateAuthorityKeyUsageArgs() {
        this.cRLSign = Input.empty();
        this.dataEncipherment = Input.empty();
        this.decipherOnly = Input.empty();
        this.digitalSignature = Input.empty();
        this.encipherOnly = Input.empty();
        this.keyAgreement = Input.empty();
        this.keyCertSign = Input.empty();
        this.keyEncipherment = Input.empty();
        this.nonRepudiation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityKeyUsageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> cRLSign;
        private @Nullable Input<Boolean> dataEncipherment;
        private @Nullable Input<Boolean> decipherOnly;
        private @Nullable Input<Boolean> digitalSignature;
        private @Nullable Input<Boolean> encipherOnly;
        private @Nullable Input<Boolean> keyAgreement;
        private @Nullable Input<Boolean> keyCertSign;
        private @Nullable Input<Boolean> keyEncipherment;
        private @Nullable Input<Boolean> nonRepudiation;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityKeyUsageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cRLSign = defaults.cRLSign;
    	      this.dataEncipherment = defaults.dataEncipherment;
    	      this.decipherOnly = defaults.decipherOnly;
    	      this.digitalSignature = defaults.digitalSignature;
    	      this.encipherOnly = defaults.encipherOnly;
    	      this.keyAgreement = defaults.keyAgreement;
    	      this.keyCertSign = defaults.keyCertSign;
    	      this.keyEncipherment = defaults.keyEncipherment;
    	      this.nonRepudiation = defaults.nonRepudiation;
        }

        public Builder setCRLSign(@Nullable Input<Boolean> cRLSign) {
            this.cRLSign = cRLSign;
            return this;
        }

        public Builder setCRLSign(@Nullable Boolean cRLSign) {
            this.cRLSign = Input.ofNullable(cRLSign);
            return this;
        }

        public Builder setDataEncipherment(@Nullable Input<Boolean> dataEncipherment) {
            this.dataEncipherment = dataEncipherment;
            return this;
        }

        public Builder setDataEncipherment(@Nullable Boolean dataEncipherment) {
            this.dataEncipherment = Input.ofNullable(dataEncipherment);
            return this;
        }

        public Builder setDecipherOnly(@Nullable Input<Boolean> decipherOnly) {
            this.decipherOnly = decipherOnly;
            return this;
        }

        public Builder setDecipherOnly(@Nullable Boolean decipherOnly) {
            this.decipherOnly = Input.ofNullable(decipherOnly);
            return this;
        }

        public Builder setDigitalSignature(@Nullable Input<Boolean> digitalSignature) {
            this.digitalSignature = digitalSignature;
            return this;
        }

        public Builder setDigitalSignature(@Nullable Boolean digitalSignature) {
            this.digitalSignature = Input.ofNullable(digitalSignature);
            return this;
        }

        public Builder setEncipherOnly(@Nullable Input<Boolean> encipherOnly) {
            this.encipherOnly = encipherOnly;
            return this;
        }

        public Builder setEncipherOnly(@Nullable Boolean encipherOnly) {
            this.encipherOnly = Input.ofNullable(encipherOnly);
            return this;
        }

        public Builder setKeyAgreement(@Nullable Input<Boolean> keyAgreement) {
            this.keyAgreement = keyAgreement;
            return this;
        }

        public Builder setKeyAgreement(@Nullable Boolean keyAgreement) {
            this.keyAgreement = Input.ofNullable(keyAgreement);
            return this;
        }

        public Builder setKeyCertSign(@Nullable Input<Boolean> keyCertSign) {
            this.keyCertSign = keyCertSign;
            return this;
        }

        public Builder setKeyCertSign(@Nullable Boolean keyCertSign) {
            this.keyCertSign = Input.ofNullable(keyCertSign);
            return this;
        }

        public Builder setKeyEncipherment(@Nullable Input<Boolean> keyEncipherment) {
            this.keyEncipherment = keyEncipherment;
            return this;
        }

        public Builder setKeyEncipherment(@Nullable Boolean keyEncipherment) {
            this.keyEncipherment = Input.ofNullable(keyEncipherment);
            return this;
        }

        public Builder setNonRepudiation(@Nullable Input<Boolean> nonRepudiation) {
            this.nonRepudiation = nonRepudiation;
            return this;
        }

        public Builder setNonRepudiation(@Nullable Boolean nonRepudiation) {
            this.nonRepudiation = Input.ofNullable(nonRepudiation);
            return this;
        }

        public CertificateAuthorityKeyUsageArgs build() {
            return new CertificateAuthorityKeyUsageArgs(cRLSign, dataEncipherment, decipherOnly, digitalSignature, encipherOnly, keyAgreement, keyCertSign, keyEncipherment, nonRepudiation);
        }
    }
}
