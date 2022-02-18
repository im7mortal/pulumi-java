// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * PackageType.
     * 
     */
    @EnumType
    public enum FunctionPackageType {
        Image("Image"),
        Zip("Zip");

        private final String value;

        FunctionPackageType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FunctionPackageType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
