// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kms.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies the type of CMK to create. The default value is SYMMETRIC_DEFAULT. This property is required only for asymmetric CMKs. You can't change the KeySpec value after the CMK is created.
     * 
     */
    @EnumType
    public enum KeySpec {
        SymmetricDefault("SYMMETRIC_DEFAULT"),
        Rsa2048("RSA_2048"),
        Rsa3072("RSA_3072"),
        Rsa4096("RSA_4096"),
        EccNistP256("ECC_NIST_P256"),
        EccNistP384("ECC_NIST_P384"),
        EccNistP521("ECC_NIST_P521"),
        EccSecgP256k1("ECC_SECG_P256K1");

        private final String value;

        KeySpec(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "KeySpec[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
