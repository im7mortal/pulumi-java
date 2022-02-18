// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The tracing mode.
     * 
     */
    @EnumType
    public enum FunctionTracingConfigMode {
        Active("Active"),
        PassThrough("PassThrough");

        private final String value;

        FunctionTracingConfigMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FunctionTracingConfigMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
