// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The status of a project.
     * 
     */
    @EnumType
    public enum ProjectStatus {
        Pending("Pending"),
        CreateInProgress("CreateInProgress"),
        CreateCompleted("CreateCompleted"),
        CreateFailed("CreateFailed"),
        DeleteInProgress("DeleteInProgress"),
        DeleteFailed("DeleteFailed"),
        DeleteCompleted("DeleteCompleted");

        private final String value;

        ProjectStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ProjectStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
