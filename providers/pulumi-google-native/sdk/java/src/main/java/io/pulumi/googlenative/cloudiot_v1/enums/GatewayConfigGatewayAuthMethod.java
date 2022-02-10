// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudiot_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum GatewayConfigGatewayAuthMethod {
        GatewayAuthMethodUnspecified("GATEWAY_AUTH_METHOD_UNSPECIFIED"),
        AssociationOnly("ASSOCIATION_ONLY"),
        DeviceAuthTokenOnly("DEVICE_AUTH_TOKEN_ONLY"),
        AssociationAndDeviceAuthToken("ASSOCIATION_AND_DEVICE_AUTH_TOKEN");

        private final String value;

        GatewayConfigGatewayAuthMethod(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GatewayConfigGatewayAuthMethod[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }