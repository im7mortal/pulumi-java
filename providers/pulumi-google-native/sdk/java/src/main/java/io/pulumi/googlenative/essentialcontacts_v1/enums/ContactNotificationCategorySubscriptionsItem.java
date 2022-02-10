// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.essentialcontacts_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum ContactNotificationCategorySubscriptionsItem {
        NotificationCategoryUnspecified("NOTIFICATION_CATEGORY_UNSPECIFIED"),
        All("ALL"),
        Suspension("SUSPENSION"),
        Security("SECURITY"),
        Technical("TECHNICAL"),
        Billing("BILLING"),
        Legal("LEGAL"),
        ProductUpdates("PRODUCT_UPDATES"),
        TechnicalIncidents("TECHNICAL_INCIDENTS");

        private final String value;

        ContactNotificationCategorySubscriptionsItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ContactNotificationCategorySubscriptionsItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }