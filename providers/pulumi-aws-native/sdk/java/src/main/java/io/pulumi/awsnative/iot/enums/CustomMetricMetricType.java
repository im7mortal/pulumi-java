// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of the custom metric. Types include string-list, ip-address-list, number-list, and number.
     * 
     */
    @EnumType
    public enum CustomMetricMetricType {
        StringList("string-list"),
        IpAddressList("ip-address-list"),
        NumberList("number-list"),
        Number("number");

        private final String value;

        CustomMetricMetricType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CustomMetricMetricType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
