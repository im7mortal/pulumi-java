// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The target processor architecture for the application.
     * 
     */
    @EnumType
    public enum SimulationApplicationSourceConfigArchitecture {
        X8664("X86_64"),
        Arm64("ARM64"),
        Armhf("ARMHF");

        private final String value;

        SimulationApplicationSourceConfigArchitecture(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SimulationApplicationSourceConfigArchitecture[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
