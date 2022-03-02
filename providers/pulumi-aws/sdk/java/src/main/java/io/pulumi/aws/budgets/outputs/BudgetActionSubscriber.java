// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.budgets.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BudgetActionSubscriber {
    /**
     * The address that AWS sends budget notifications to, either an SNS topic or an email.
     * 
     */
    private final String address;
    /**
     * The type of notification that AWS sends to a subscriber. Valid values are `SNS` or `EMAIL`.
     * 
     */
    private final String subscriptionType;

    @OutputCustomType.Constructor({"address","subscriptionType"})
    private BudgetActionSubscriber(
        String address,
        String subscriptionType) {
        this.address = Objects.requireNonNull(address);
        this.subscriptionType = Objects.requireNonNull(subscriptionType);
    }

    /**
     * The address that AWS sends budget notifications to, either an SNS topic or an email.
     * 
    */
    public String getAddress() {
        return this.address;
    }
    /**
     * The type of notification that AWS sends to a subscriber. Valid values are `SNS` or `EMAIL`.
     * 
    */
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetActionSubscriber defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String address;
        private String subscriptionType;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetActionSubscriber defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.subscriptionType = defaults.subscriptionType;
        }

        public Builder setAddress(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }

        public Builder setSubscriptionType(String subscriptionType) {
            this.subscriptionType = Objects.requireNonNull(subscriptionType);
            return this;
        }
        public BudgetActionSubscriber build() {
            return new BudgetActionSubscriber(address, subscriptionType);
        }
    }
}
