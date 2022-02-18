// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * What AWS WAF should do if it fails to completely parse the JSON body.
     * 
     */
    @EnumType
    public enum LoggingConfigurationFieldToMatchJsonBodyPropertiesInvalidFallbackBehavior {
        Match("MATCH"),
        NoMatch("NO_MATCH"),
        EvaluateAsString("EVALUATE_AS_STRING");

        private final String value;

        LoggingConfigurationFieldToMatchJsonBodyPropertiesInvalidFallbackBehavior(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "LoggingConfigurationFieldToMatchJsonBodyPropertiesInvalidFallbackBehavior[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
