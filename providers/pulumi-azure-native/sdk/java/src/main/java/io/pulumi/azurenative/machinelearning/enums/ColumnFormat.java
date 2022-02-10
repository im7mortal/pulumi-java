// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum ColumnFormat {
        Byte("Byte"),
        Char("Char"),
        Complex64("Complex64"),
        Complex128("Complex128"),
        Datetime("Date-time"),
        DatetimeOffset("Date-timeOffset"),
        Double("Double"),
        Duration("Duration"),
        Float("Float"),
        Int8("Int8"),
        Int16("Int16"),
        Int32("Int32"),
        Int64("Int64"),
        Uint8("Uint8"),
        Uint16("Uint16"),
        Uint32("Uint32"),
        Uint64("Uint64");

        private final String value;

        ColumnFormat(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ColumnFormat[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }