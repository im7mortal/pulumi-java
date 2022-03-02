// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.billingbudgets_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.billingbudgets_v1.outputs.GoogleCloudBillingBudgetsV1LastPeriodAmountResponse;
import io.pulumi.googlenative.billingbudgets_v1.outputs.GoogleTypeMoneyResponse;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudBillingBudgetsV1BudgetAmountResponse {
    /**
     * Use the last period's actual spend as the budget for the present period. LastPeriodAmount can only be set when the budget's time period is a Filter.calendar_period. It cannot be set in combination with Filter.custom_period.
     * 
     */
    private final GoogleCloudBillingBudgetsV1LastPeriodAmountResponse lastPeriodAmount;
    /**
     * A specified amount to use as the budget. `currency_code` is optional. If specified when creating a budget, it must match the currency of the billing account. If specified when updating a budget, it must match the currency_code of the existing budget. The `currency_code` is provided on output.
     * 
     */
    private final GoogleTypeMoneyResponse specifiedAmount;

    @OutputCustomType.Constructor({"lastPeriodAmount","specifiedAmount"})
    private GoogleCloudBillingBudgetsV1BudgetAmountResponse(
        GoogleCloudBillingBudgetsV1LastPeriodAmountResponse lastPeriodAmount,
        GoogleTypeMoneyResponse specifiedAmount) {
        this.lastPeriodAmount = Objects.requireNonNull(lastPeriodAmount);
        this.specifiedAmount = Objects.requireNonNull(specifiedAmount);
    }

    /**
     * Use the last period's actual spend as the budget for the present period. LastPeriodAmount can only be set when the budget's time period is a Filter.calendar_period. It cannot be set in combination with Filter.custom_period.
     * 
    */
    public GoogleCloudBillingBudgetsV1LastPeriodAmountResponse getLastPeriodAmount() {
        return this.lastPeriodAmount;
    }
    /**
     * A specified amount to use as the budget. `currency_code` is optional. If specified when creating a budget, it must match the currency of the billing account. If specified when updating a budget, it must match the currency_code of the existing budget. The `currency_code` is provided on output.
     * 
    */
    public GoogleTypeMoneyResponse getSpecifiedAmount() {
        return this.specifiedAmount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudBillingBudgetsV1BudgetAmountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudBillingBudgetsV1LastPeriodAmountResponse lastPeriodAmount;
        private GoogleTypeMoneyResponse specifiedAmount;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudBillingBudgetsV1BudgetAmountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastPeriodAmount = defaults.lastPeriodAmount;
    	      this.specifiedAmount = defaults.specifiedAmount;
        }

        public Builder setLastPeriodAmount(GoogleCloudBillingBudgetsV1LastPeriodAmountResponse lastPeriodAmount) {
            this.lastPeriodAmount = Objects.requireNonNull(lastPeriodAmount);
            return this;
        }

        public Builder setSpecifiedAmount(GoogleTypeMoneyResponse specifiedAmount) {
            this.specifiedAmount = Objects.requireNonNull(specifiedAmount);
            return this;
        }
        public GoogleCloudBillingBudgetsV1BudgetAmountResponse build() {
            return new GoogleCloudBillingBudgetsV1BudgetAmountResponse(lastPeriodAmount, specifiedAmount);
        }
    }
}
