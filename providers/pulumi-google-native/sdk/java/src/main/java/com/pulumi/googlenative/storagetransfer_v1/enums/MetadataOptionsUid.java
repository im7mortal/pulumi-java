// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies how each file&#39;s POSIX user ID (UID) attribute should be handled by the transfer. By default, UID is not preserved. Only applicable to transfers involving POSIX file systems, and ignored for other transfers.
     * 
     */
    @EnumType
    public enum MetadataOptionsUid {
        /**
         * UID behavior is unspecified.
         * 
         */
        UidUnspecified("UID_UNSPECIFIED"),
        /**
         * Do not preserve UID during a transfer job.
         * 
         */
        UidSkip("UID_SKIP"),
        /**
         * Preserve UID during a transfer job.
         * 
         */
        UidNumber("UID_NUMBER");

        private final String value;

        MetadataOptionsUid(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "MetadataOptionsUid[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
