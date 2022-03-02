// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch.outputs;

import io.pulumi.aws.batch.outputs.SchedulingPolicyFairSharePolicyShareDistribution;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SchedulingPolicyFairSharePolicy {
    /**
     * A value used to reserve some of the available maximum vCPU for fair share identifiers that have not yet been used. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html).
     * 
     */
    private final @Nullable Integer computeReservation;
    private final @Nullable Integer shareDecaySeconds;
    /**
     * One or more share distribution blocks which define the weights for the fair share identifiers for the fair share policy. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html). The `share_distribution` block is documented below.
     * 
     */
    private final @Nullable List<SchedulingPolicyFairSharePolicyShareDistribution> shareDistributions;

    @OutputCustomType.Constructor({"computeReservation","shareDecaySeconds","shareDistributions"})
    private SchedulingPolicyFairSharePolicy(
        @Nullable Integer computeReservation,
        @Nullable Integer shareDecaySeconds,
        @Nullable List<SchedulingPolicyFairSharePolicyShareDistribution> shareDistributions) {
        this.computeReservation = computeReservation;
        this.shareDecaySeconds = shareDecaySeconds;
        this.shareDistributions = shareDistributions;
    }

    /**
     * A value used to reserve some of the available maximum vCPU for fair share identifiers that have not yet been used. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html).
     * 
    */
    public Optional<Integer> getComputeReservation() {
        return Optional.ofNullable(this.computeReservation);
    }
    public Optional<Integer> getShareDecaySeconds() {
        return Optional.ofNullable(this.shareDecaySeconds);
    }
    /**
     * One or more share distribution blocks which define the weights for the fair share identifiers for the fair share policy. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html). The `share_distribution` block is documented below.
     * 
    */
    public List<SchedulingPolicyFairSharePolicyShareDistribution> getShareDistributions() {
        return this.shareDistributions == null ? List.of() : this.shareDistributions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulingPolicyFairSharePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer computeReservation;
        private @Nullable Integer shareDecaySeconds;
        private @Nullable List<SchedulingPolicyFairSharePolicyShareDistribution> shareDistributions;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulingPolicyFairSharePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeReservation = defaults.computeReservation;
    	      this.shareDecaySeconds = defaults.shareDecaySeconds;
    	      this.shareDistributions = defaults.shareDistributions;
        }

        public Builder setComputeReservation(@Nullable Integer computeReservation) {
            this.computeReservation = computeReservation;
            return this;
        }

        public Builder setShareDecaySeconds(@Nullable Integer shareDecaySeconds) {
            this.shareDecaySeconds = shareDecaySeconds;
            return this;
        }

        public Builder setShareDistributions(@Nullable List<SchedulingPolicyFairSharePolicyShareDistribution> shareDistributions) {
            this.shareDistributions = shareDistributions;
            return this;
        }
        public SchedulingPolicyFairSharePolicy build() {
            return new SchedulingPolicyFairSharePolicy(computeReservation, shareDecaySeconds, shareDistributions);
        }
    }
}
