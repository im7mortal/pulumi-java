// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Structure that contains X.509 OtherName information.
 * 
 */
public final class CertificateOtherNameArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateOtherNameArgs Empty = new CertificateOtherNameArgs();

    @InputImport(name="typeId", required=true)
    private final Input<String> typeId;

    public Input<String> getTypeId() {
        return this.typeId;
    }

    @InputImport(name="value", required=true)
    private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public CertificateOtherNameArgs(
        Input<String> typeId,
        Input<String> value) {
        this.typeId = Objects.requireNonNull(typeId, "expected parameter 'typeId' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private CertificateOtherNameArgs() {
        this.typeId = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateOtherNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> typeId;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateOtherNameArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.typeId = defaults.typeId;
    	      this.value = defaults.value;
        }

        public Builder setTypeId(Input<String> typeId) {
            this.typeId = Objects.requireNonNull(typeId);
            return this;
        }

        public Builder setTypeId(String typeId) {
            this.typeId = Input.of(Objects.requireNonNull(typeId));
            return this;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }

        public CertificateOtherNameArgs build() {
            return new CertificateOtherNameArgs(typeId, value);
        }
    }
}
