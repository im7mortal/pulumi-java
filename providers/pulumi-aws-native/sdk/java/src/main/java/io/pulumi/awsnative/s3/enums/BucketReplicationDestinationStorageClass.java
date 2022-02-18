// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The storage class to use when replicating objects, such as S3 Standard or reduced redundancy.
     * 
     */
    @EnumType
    public enum BucketReplicationDestinationStorageClass {
        DeepArchive("DEEP_ARCHIVE"),
        Glacier("GLACIER"),
        GlacierIr("GLACIER_IR"),
        IntelligentTiering("INTELLIGENT_TIERING"),
        OnezoneIa("ONEZONE_IA"),
        ReducedRedundancy("REDUCED_REDUNDANCY"),
        Standard("STANDARD"),
        StandardIa("STANDARD_IA");

        private final String value;

        BucketReplicationDestinationStorageClass(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BucketReplicationDestinationStorageClass[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
