// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Indicates the degree of outage when the alarm goes off.
     * 
     */
    @EnumType
    public enum ApplicationAlarmSeverity {
        High("HIGH"),
        Medium("MEDIUM"),
        Low("LOW");

        private final String value;

        ApplicationAlarmSeverity(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ApplicationAlarmSeverity[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
