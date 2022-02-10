// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum AttackTactic {
        InitialAccess("InitialAccess"),
        Execution("Execution"),
        Persistence("Persistence"),
        PrivilegeEscalation("PrivilegeEscalation"),
        DefenseEvasion("DefenseEvasion"),
        CredentialAccess("CredentialAccess"),
        Discovery("Discovery"),
        LateralMovement("LateralMovement"),
        Collection("Collection"),
        Exfiltration("Exfiltration"),
        CommandAndControl("CommandAndControl"),
        Impact("Impact");

        private final String value;

        AttackTactic(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AttackTactic[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }