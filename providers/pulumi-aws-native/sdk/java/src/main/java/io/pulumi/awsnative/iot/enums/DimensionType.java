// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies the type of the dimension.
     * 
     */
    @EnumType
    public enum DimensionType {
        TopicFilter("TOPIC_FILTER");

        private final String value;

        DimensionType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DimensionType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
