// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudsupport_v2beta.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The severity of this case. Deprecated. Use priority instead.
     * 
     */
    @EnumType
    public enum CaseSeverity {
        /**
         * Severity is undefined or has not been set yet.
         * 
         */
        SeverityUnspecified("SEVERITY_UNSPECIFIED"),
        /**
         * Extreme impact on a production service. Service is hard down.
         * 
         */
        S0("S0"),
        /**
         * Critical impact on a production service. Service is currently unusable.
         * 
         */
        S1("S1"),
        /**
         * Severe impact on a production service. Service is usable but greatly impaired.
         * 
         */
        S2("S2"),
        /**
         * Medium impact on a production service. Service is available, but moderately impaired.
         * 
         */
        S3("S3"),
        /**
         * General questions or minor issues. Production service is fully available.
         * 
         */
        S4("S4");

        private final String value;

        CaseSeverity(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CaseSeverity[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
