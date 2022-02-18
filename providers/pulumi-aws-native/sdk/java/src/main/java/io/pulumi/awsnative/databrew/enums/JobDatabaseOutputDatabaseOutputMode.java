// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Database table name
     * 
     */
    @EnumType
    public enum JobDatabaseOutputDatabaseOutputMode {
        NewTable("NEW_TABLE");

        private final String value;

        JobDatabaseOutputDatabaseOutputMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "JobDatabaseOutputDatabaseOutputMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }