// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoverycontrol.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The deployment status of control panel. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * 
     */
    @EnumType
    public enum ControlPanelStatus {
        Pending("PENDING"),
        Deployed("DEPLOYED"),
        PendingDeletion("PENDING_DELETION");

        private final String value;

        ControlPanelStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ControlPanelStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
