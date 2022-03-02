// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RecoveryPlanAutomationRunbookActionDetailsResponse {
    /**
     * The fabric location.
     * 
     */
    private final String fabricLocation;
    /**
     * Gets the type of action details (see RecoveryPlanActionDetailsTypes enum for possible values).
     * Expected value is 'AutomationRunbookActionDetails'.
     * 
     */
    private final String instanceType;
    /**
     * The runbook ARM Id.
     * 
     */
    private final @Nullable String runbookId;
    /**
     * The runbook timeout.
     * 
     */
    private final @Nullable String timeout;

    @OutputCustomType.Constructor({"fabricLocation","instanceType","runbookId","timeout"})
    private RecoveryPlanAutomationRunbookActionDetailsResponse(
        String fabricLocation,
        String instanceType,
        @Nullable String runbookId,
        @Nullable String timeout) {
        this.fabricLocation = Objects.requireNonNull(fabricLocation);
        this.instanceType = Objects.requireNonNull(instanceType);
        this.runbookId = runbookId;
        this.timeout = timeout;
    }

    /**
     * The fabric location.
     * 
    */
    public String getFabricLocation() {
        return this.fabricLocation;
    }
    /**
     * Gets the type of action details (see RecoveryPlanActionDetailsTypes enum for possible values).
     * Expected value is 'AutomationRunbookActionDetails'.
     * 
    */
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * The runbook ARM Id.
     * 
    */
    public Optional<String> getRunbookId() {
        return Optional.ofNullable(this.runbookId);
    }
    /**
     * The runbook timeout.
     * 
    */
    public Optional<String> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecoveryPlanAutomationRunbookActionDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fabricLocation;
        private String instanceType;
        private @Nullable String runbookId;
        private @Nullable String timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(RecoveryPlanAutomationRunbookActionDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fabricLocation = defaults.fabricLocation;
    	      this.instanceType = defaults.instanceType;
    	      this.runbookId = defaults.runbookId;
    	      this.timeout = defaults.timeout;
        }

        public Builder setFabricLocation(String fabricLocation) {
            this.fabricLocation = Objects.requireNonNull(fabricLocation);
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setRunbookId(@Nullable String runbookId) {
            this.runbookId = runbookId;
            return this;
        }

        public Builder setTimeout(@Nullable String timeout) {
            this.timeout = timeout;
            return this;
        }
        public RecoveryPlanAutomationRunbookActionDetailsResponse build() {
            return new RecoveryPlanAutomationRunbookActionDetailsResponse(fabricLocation, instanceType, runbookId, timeout);
        }
    }
}
