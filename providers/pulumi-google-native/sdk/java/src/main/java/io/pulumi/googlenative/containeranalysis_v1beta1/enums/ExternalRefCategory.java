// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum ExternalRefCategory {
        CategoryUnspecified("CATEGORY_UNSPECIFIED"),
        Security("SECURITY"),
        PackageManager("PACKAGE_MANAGER"),
        PersistentId("PERSISTENT_ID"),
        Other("OTHER");

        private final String value;

        ExternalRefCategory(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ExternalRefCategory[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }