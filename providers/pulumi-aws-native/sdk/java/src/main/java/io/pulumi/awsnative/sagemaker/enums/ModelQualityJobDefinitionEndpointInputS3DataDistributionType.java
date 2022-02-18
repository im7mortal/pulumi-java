// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to FullyReplicated
     * 
     */
    @EnumType
    public enum ModelQualityJobDefinitionEndpointInputS3DataDistributionType {
        FullyReplicated("FullyReplicated"),
        ShardedByS3Key("ShardedByS3Key");

        private final String value;

        ModelQualityJobDefinitionEndpointInputS3DataDistributionType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ModelQualityJobDefinitionEndpointInputS3DataDistributionType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
