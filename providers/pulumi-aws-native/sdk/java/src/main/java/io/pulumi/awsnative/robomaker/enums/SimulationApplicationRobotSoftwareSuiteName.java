// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The name of the robot software suite.
     * 
     */
    @EnumType
    public enum SimulationApplicationRobotSoftwareSuiteName {
        Ros("ROS"),
        Ros2("ROS2"),
        General("General");

        private final String value;

        SimulationApplicationRobotSoftwareSuiteName(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SimulationApplicationRobotSoftwareSuiteName[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
