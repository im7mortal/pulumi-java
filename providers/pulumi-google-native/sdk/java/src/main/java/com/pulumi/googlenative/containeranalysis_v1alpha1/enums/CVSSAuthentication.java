// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum CVSSAuthentication {
        AuthenticationUnspecified("AUTHENTICATION_UNSPECIFIED"),
        AuthenticationMultiple("AUTHENTICATION_MULTIPLE"),
        AuthenticationSingle("AUTHENTICATION_SINGLE"),
        AuthenticationNone("AUTHENTICATION_NONE");

        private final String value;

        CVSSAuthentication(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CVSSAuthentication[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
