// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Immutable. Specifies CA configuration.
     * 
     */
    @EnumType
    public enum FeatureSpecProvisionGoogleCa {
        /**
         * Disable default Google managed CA.
         * 
         */
        GoogleCaProvisioningUnspecified("GOOGLE_CA_PROVISIONING_UNSPECIFIED"),
        /**
         * Disable default Google managed CA.
         * 
         */
        Disabled("DISABLED"),
        /**
         * Use default Google managed CA.
         * 
         */
        Enabled("ENABLED");

        private final String value;

        FeatureSpecProvisionGoogleCa(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FeatureSpecProvisionGoogleCa[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
