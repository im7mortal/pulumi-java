// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of the component denotes whether the component is used to build the image or only to test it.
     * 
     */
    @EnumType
    public enum ComponentType {
        Build("BUILD"),
        Test("TEST");

        private final String value;

        ComponentType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ComponentType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
