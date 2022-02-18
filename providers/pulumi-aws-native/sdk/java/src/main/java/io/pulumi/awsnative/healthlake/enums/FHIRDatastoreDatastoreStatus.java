// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.healthlake.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The status of the Data Store. Possible statuses are 'CREATING', 'ACTIVE', 'DELETING', or 'DELETED'.
     * 
     */
    @EnumType
    public enum FHIRDatastoreDatastoreStatus {
        Creating("CREATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED");

        private final String value;

        FHIRDatastoreDatastoreStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FHIRDatastoreDatastoreStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
