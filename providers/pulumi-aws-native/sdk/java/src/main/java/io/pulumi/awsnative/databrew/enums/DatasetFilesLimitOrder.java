// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Order
     * 
     */
    @EnumType
    public enum DatasetFilesLimitOrder {
        Ascending("ASCENDING"),
        Descending("DESCENDING");

        private final String value;

        DatasetFilesLimitOrder(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DatasetFilesLimitOrder[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
