// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ivs.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Channel latency mode.
     * 
     */
    @EnumType
    public enum ChannelLatencyMode {
        Normal("NORMAL"),
        Low("LOW");

        private final String value;

        ChannelLatencyMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ChannelLatencyMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
