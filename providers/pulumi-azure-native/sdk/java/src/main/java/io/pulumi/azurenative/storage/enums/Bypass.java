// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum Bypass {
        None("None"),
        Logging("Logging"),
        Metrics("Metrics"),
        AzureServices("AzureServices");

        private final String value;

        Bypass(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "Bypass[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }