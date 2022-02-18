// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.healthlake.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of customer-managed-key (CMK) used for encryption. The two types of supported CMKs are customer owned CMKs and AWS owned CMKs.
     * 
     */
    @EnumType
    public enum FHIRDatastoreKmsEncryptionConfigCmkType {
        CustomerManagedKmsKey("CUSTOMER_MANAGED_KMS_KEY"),
        AwsOwnedKmsKey("AWS_OWNED_KMS_KEY");

        private final String value;

        FHIRDatastoreKmsEncryptionConfigCmkType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FHIRDatastoreKmsEncryptionConfigCmkType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
