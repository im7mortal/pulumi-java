// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Optional. The structure of paths containing partition data within the entity.
     * 
     */
    @EnumType
    public enum GoogleCloudDataplexV1SchemaPartitionStyle {
        /**
         * PartitionStyle unspecified
         * 
         */
        PartitionStyleUnspecified("PARTITION_STYLE_UNSPECIFIED"),
        /**
         * Partitions are hive-compatible. Examples: gs://bucket/path/to/table/dt=2019-10-31/lang=en, gs://bucket/path/to/table/dt=2019-10-31/lang=en/late.
         * 
         */
        HiveCompatible("HIVE_COMPATIBLE");

        private final String value;

        GoogleCloudDataplexV1SchemaPartitionStyle(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudDataplexV1SchemaPartitionStyle[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
