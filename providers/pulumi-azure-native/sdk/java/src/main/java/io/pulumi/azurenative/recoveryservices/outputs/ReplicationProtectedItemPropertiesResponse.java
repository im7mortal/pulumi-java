// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.A2AReplicationDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.CurrentScenarioDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.HealthErrorResponse;
import io.pulumi.azurenative.recoveryservices.outputs.HyperVReplicaAzureReplicationDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.HyperVReplicaBaseReplicationDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.HyperVReplicaBlueReplicationDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.HyperVReplicaReplicationDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.InMageAzureV2ReplicationDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.InMageRcmReplicationDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.InMageReplicationDetailsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ReplicationProtectedItemPropertiesResponse {
    private final @Nullable String activeLocation;
    private final @Nullable List<String> allowedOperations;
    private final @Nullable CurrentScenarioDetailsResponse currentScenario;
    private final @Nullable String failoverHealth;
    private final @Nullable String failoverRecoveryPointId;
    private final @Nullable String friendlyName;
    private final @Nullable List<HealthErrorResponse> healthErrors;
    private final @Nullable String lastSuccessfulFailoverTime;
    private final @Nullable String lastSuccessfulTestFailoverTime;
    private final @Nullable String policyFriendlyName;
    private final @Nullable String policyId;
    private final @Nullable String primaryFabricFriendlyName;
    private final @Nullable String primaryFabricProvider;
    private final @Nullable String primaryProtectionContainerFriendlyName;
    private final @Nullable String protectableItemId;
    private final @Nullable String protectedItemType;
    private final @Nullable String protectionState;
    private final @Nullable String protectionStateDescription;
    private final @Nullable Object providerSpecificDetails;
    private final @Nullable String recoveryContainerId;
    private final @Nullable String recoveryFabricFriendlyName;
    private final @Nullable String recoveryFabricId;
    private final @Nullable String recoveryProtectionContainerFriendlyName;
    private final @Nullable String recoveryServicesProviderId;
    private final @Nullable String replicationHealth;
    private final @Nullable String testFailoverState;
    private final @Nullable String testFailoverStateDescription;

    @OutputCustomType.Constructor({"activeLocation","allowedOperations","currentScenario","failoverHealth","failoverRecoveryPointId","friendlyName","healthErrors","lastSuccessfulFailoverTime","lastSuccessfulTestFailoverTime","policyFriendlyName","policyId","primaryFabricFriendlyName","primaryFabricProvider","primaryProtectionContainerFriendlyName","protectableItemId","protectedItemType","protectionState","protectionStateDescription","providerSpecificDetails","recoveryContainerId","recoveryFabricFriendlyName","recoveryFabricId","recoveryProtectionContainerFriendlyName","recoveryServicesProviderId","replicationHealth","testFailoverState","testFailoverStateDescription"})
    private ReplicationProtectedItemPropertiesResponse(
        @Nullable String activeLocation,
        @Nullable List<String> allowedOperations,
        @Nullable CurrentScenarioDetailsResponse currentScenario,
        @Nullable String failoverHealth,
        @Nullable String failoverRecoveryPointId,
        @Nullable String friendlyName,
        @Nullable List<HealthErrorResponse> healthErrors,
        @Nullable String lastSuccessfulFailoverTime,
        @Nullable String lastSuccessfulTestFailoverTime,
        @Nullable String policyFriendlyName,
        @Nullable String policyId,
        @Nullable String primaryFabricFriendlyName,
        @Nullable String primaryFabricProvider,
        @Nullable String primaryProtectionContainerFriendlyName,
        @Nullable String protectableItemId,
        @Nullable String protectedItemType,
        @Nullable String protectionState,
        @Nullable String protectionStateDescription,
        @Nullable Object providerSpecificDetails,
        @Nullable String recoveryContainerId,
        @Nullable String recoveryFabricFriendlyName,
        @Nullable String recoveryFabricId,
        @Nullable String recoveryProtectionContainerFriendlyName,
        @Nullable String recoveryServicesProviderId,
        @Nullable String replicationHealth,
        @Nullable String testFailoverState,
        @Nullable String testFailoverStateDescription) {
        this.activeLocation = activeLocation;
        this.allowedOperations = allowedOperations;
        this.currentScenario = currentScenario;
        this.failoverHealth = failoverHealth;
        this.failoverRecoveryPointId = failoverRecoveryPointId;
        this.friendlyName = friendlyName;
        this.healthErrors = healthErrors;
        this.lastSuccessfulFailoverTime = lastSuccessfulFailoverTime;
        this.lastSuccessfulTestFailoverTime = lastSuccessfulTestFailoverTime;
        this.policyFriendlyName = policyFriendlyName;
        this.policyId = policyId;
        this.primaryFabricFriendlyName = primaryFabricFriendlyName;
        this.primaryFabricProvider = primaryFabricProvider;
        this.primaryProtectionContainerFriendlyName = primaryProtectionContainerFriendlyName;
        this.protectableItemId = protectableItemId;
        this.protectedItemType = protectedItemType;
        this.protectionState = protectionState;
        this.protectionStateDescription = protectionStateDescription;
        this.providerSpecificDetails = providerSpecificDetails;
        this.recoveryContainerId = recoveryContainerId;
        this.recoveryFabricFriendlyName = recoveryFabricFriendlyName;
        this.recoveryFabricId = recoveryFabricId;
        this.recoveryProtectionContainerFriendlyName = recoveryProtectionContainerFriendlyName;
        this.recoveryServicesProviderId = recoveryServicesProviderId;
        this.replicationHealth = replicationHealth;
        this.testFailoverState = testFailoverState;
        this.testFailoverStateDescription = testFailoverStateDescription;
    }

    public Optional<String> getActiveLocation() {
        return Optional.ofNullable(this.activeLocation);
    }
    public List<String> getAllowedOperations() {
        return this.allowedOperations == null ? List.of() : this.allowedOperations;
    }
    public Optional<CurrentScenarioDetailsResponse> getCurrentScenario() {
        return Optional.ofNullable(this.currentScenario);
    }
    public Optional<String> getFailoverHealth() {
        return Optional.ofNullable(this.failoverHealth);
    }
    public Optional<String> getFailoverRecoveryPointId() {
        return Optional.ofNullable(this.failoverRecoveryPointId);
    }
    public Optional<String> getFriendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    public List<HealthErrorResponse> getHealthErrors() {
        return this.healthErrors == null ? List.of() : this.healthErrors;
    }
    public Optional<String> getLastSuccessfulFailoverTime() {
        return Optional.ofNullable(this.lastSuccessfulFailoverTime);
    }
    public Optional<String> getLastSuccessfulTestFailoverTime() {
        return Optional.ofNullable(this.lastSuccessfulTestFailoverTime);
    }
    public Optional<String> getPolicyFriendlyName() {
        return Optional.ofNullable(this.policyFriendlyName);
    }
    public Optional<String> getPolicyId() {
        return Optional.ofNullable(this.policyId);
    }
    public Optional<String> getPrimaryFabricFriendlyName() {
        return Optional.ofNullable(this.primaryFabricFriendlyName);
    }
    public Optional<String> getPrimaryFabricProvider() {
        return Optional.ofNullable(this.primaryFabricProvider);
    }
    public Optional<String> getPrimaryProtectionContainerFriendlyName() {
        return Optional.ofNullable(this.primaryProtectionContainerFriendlyName);
    }
    public Optional<String> getProtectableItemId() {
        return Optional.ofNullable(this.protectableItemId);
    }
    public Optional<String> getProtectedItemType() {
        return Optional.ofNullable(this.protectedItemType);
    }
    public Optional<String> getProtectionState() {
        return Optional.ofNullable(this.protectionState);
    }
    public Optional<String> getProtectionStateDescription() {
        return Optional.ofNullable(this.protectionStateDescription);
    }
    public Optional<Object> getProviderSpecificDetails() {
        return Optional.ofNullable(this.providerSpecificDetails);
    }
    public Optional<String> getRecoveryContainerId() {
        return Optional.ofNullable(this.recoveryContainerId);
    }
    public Optional<String> getRecoveryFabricFriendlyName() {
        return Optional.ofNullable(this.recoveryFabricFriendlyName);
    }
    public Optional<String> getRecoveryFabricId() {
        return Optional.ofNullable(this.recoveryFabricId);
    }
    public Optional<String> getRecoveryProtectionContainerFriendlyName() {
        return Optional.ofNullable(this.recoveryProtectionContainerFriendlyName);
    }
    public Optional<String> getRecoveryServicesProviderId() {
        return Optional.ofNullable(this.recoveryServicesProviderId);
    }
    public Optional<String> getReplicationHealth() {
        return Optional.ofNullable(this.replicationHealth);
    }
    public Optional<String> getTestFailoverState() {
        return Optional.ofNullable(this.testFailoverState);
    }
    public Optional<String> getTestFailoverStateDescription() {
        return Optional.ofNullable(this.testFailoverStateDescription);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationProtectedItemPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String activeLocation;
        private @Nullable List<String> allowedOperations;
        private @Nullable CurrentScenarioDetailsResponse currentScenario;
        private @Nullable String failoverHealth;
        private @Nullable String failoverRecoveryPointId;
        private @Nullable String friendlyName;
        private @Nullable List<HealthErrorResponse> healthErrors;
        private @Nullable String lastSuccessfulFailoverTime;
        private @Nullable String lastSuccessfulTestFailoverTime;
        private @Nullable String policyFriendlyName;
        private @Nullable String policyId;
        private @Nullable String primaryFabricFriendlyName;
        private @Nullable String primaryFabricProvider;
        private @Nullable String primaryProtectionContainerFriendlyName;
        private @Nullable String protectableItemId;
        private @Nullable String protectedItemType;
        private @Nullable String protectionState;
        private @Nullable String protectionStateDescription;
        private @Nullable Object providerSpecificDetails;
        private @Nullable String recoveryContainerId;
        private @Nullable String recoveryFabricFriendlyName;
        private @Nullable String recoveryFabricId;
        private @Nullable String recoveryProtectionContainerFriendlyName;
        private @Nullable String recoveryServicesProviderId;
        private @Nullable String replicationHealth;
        private @Nullable String testFailoverState;
        private @Nullable String testFailoverStateDescription;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationProtectedItemPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeLocation = defaults.activeLocation;
    	      this.allowedOperations = defaults.allowedOperations;
    	      this.currentScenario = defaults.currentScenario;
    	      this.failoverHealth = defaults.failoverHealth;
    	      this.failoverRecoveryPointId = defaults.failoverRecoveryPointId;
    	      this.friendlyName = defaults.friendlyName;
    	      this.healthErrors = defaults.healthErrors;
    	      this.lastSuccessfulFailoverTime = defaults.lastSuccessfulFailoverTime;
    	      this.lastSuccessfulTestFailoverTime = defaults.lastSuccessfulTestFailoverTime;
    	      this.policyFriendlyName = defaults.policyFriendlyName;
    	      this.policyId = defaults.policyId;
    	      this.primaryFabricFriendlyName = defaults.primaryFabricFriendlyName;
    	      this.primaryFabricProvider = defaults.primaryFabricProvider;
    	      this.primaryProtectionContainerFriendlyName = defaults.primaryProtectionContainerFriendlyName;
    	      this.protectableItemId = defaults.protectableItemId;
    	      this.protectedItemType = defaults.protectedItemType;
    	      this.protectionState = defaults.protectionState;
    	      this.protectionStateDescription = defaults.protectionStateDescription;
    	      this.providerSpecificDetails = defaults.providerSpecificDetails;
    	      this.recoveryContainerId = defaults.recoveryContainerId;
    	      this.recoveryFabricFriendlyName = defaults.recoveryFabricFriendlyName;
    	      this.recoveryFabricId = defaults.recoveryFabricId;
    	      this.recoveryProtectionContainerFriendlyName = defaults.recoveryProtectionContainerFriendlyName;
    	      this.recoveryServicesProviderId = defaults.recoveryServicesProviderId;
    	      this.replicationHealth = defaults.replicationHealth;
    	      this.testFailoverState = defaults.testFailoverState;
    	      this.testFailoverStateDescription = defaults.testFailoverStateDescription;
        }

        public Builder setActiveLocation(@Nullable String activeLocation) {
            this.activeLocation = activeLocation;
            return this;
        }

        public Builder setAllowedOperations(@Nullable List<String> allowedOperations) {
            this.allowedOperations = allowedOperations;
            return this;
        }

        public Builder setCurrentScenario(@Nullable CurrentScenarioDetailsResponse currentScenario) {
            this.currentScenario = currentScenario;
            return this;
        }

        public Builder setFailoverHealth(@Nullable String failoverHealth) {
            this.failoverHealth = failoverHealth;
            return this;
        }

        public Builder setFailoverRecoveryPointId(@Nullable String failoverRecoveryPointId) {
            this.failoverRecoveryPointId = failoverRecoveryPointId;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setHealthErrors(@Nullable List<HealthErrorResponse> healthErrors) {
            this.healthErrors = healthErrors;
            return this;
        }

        public Builder setLastSuccessfulFailoverTime(@Nullable String lastSuccessfulFailoverTime) {
            this.lastSuccessfulFailoverTime = lastSuccessfulFailoverTime;
            return this;
        }

        public Builder setLastSuccessfulTestFailoverTime(@Nullable String lastSuccessfulTestFailoverTime) {
            this.lastSuccessfulTestFailoverTime = lastSuccessfulTestFailoverTime;
            return this;
        }

        public Builder setPolicyFriendlyName(@Nullable String policyFriendlyName) {
            this.policyFriendlyName = policyFriendlyName;
            return this;
        }

        public Builder setPolicyId(@Nullable String policyId) {
            this.policyId = policyId;
            return this;
        }

        public Builder setPrimaryFabricFriendlyName(@Nullable String primaryFabricFriendlyName) {
            this.primaryFabricFriendlyName = primaryFabricFriendlyName;
            return this;
        }

        public Builder setPrimaryFabricProvider(@Nullable String primaryFabricProvider) {
            this.primaryFabricProvider = primaryFabricProvider;
            return this;
        }

        public Builder setPrimaryProtectionContainerFriendlyName(@Nullable String primaryProtectionContainerFriendlyName) {
            this.primaryProtectionContainerFriendlyName = primaryProtectionContainerFriendlyName;
            return this;
        }

        public Builder setProtectableItemId(@Nullable String protectableItemId) {
            this.protectableItemId = protectableItemId;
            return this;
        }

        public Builder setProtectedItemType(@Nullable String protectedItemType) {
            this.protectedItemType = protectedItemType;
            return this;
        }

        public Builder setProtectionState(@Nullable String protectionState) {
            this.protectionState = protectionState;
            return this;
        }

        public Builder setProtectionStateDescription(@Nullable String protectionStateDescription) {
            this.protectionStateDescription = protectionStateDescription;
            return this;
        }

        public Builder setProviderSpecificDetails(@Nullable Object providerSpecificDetails) {
            this.providerSpecificDetails = providerSpecificDetails;
            return this;
        }

        public Builder setRecoveryContainerId(@Nullable String recoveryContainerId) {
            this.recoveryContainerId = recoveryContainerId;
            return this;
        }

        public Builder setRecoveryFabricFriendlyName(@Nullable String recoveryFabricFriendlyName) {
            this.recoveryFabricFriendlyName = recoveryFabricFriendlyName;
            return this;
        }

        public Builder setRecoveryFabricId(@Nullable String recoveryFabricId) {
            this.recoveryFabricId = recoveryFabricId;
            return this;
        }

        public Builder setRecoveryProtectionContainerFriendlyName(@Nullable String recoveryProtectionContainerFriendlyName) {
            this.recoveryProtectionContainerFriendlyName = recoveryProtectionContainerFriendlyName;
            return this;
        }

        public Builder setRecoveryServicesProviderId(@Nullable String recoveryServicesProviderId) {
            this.recoveryServicesProviderId = recoveryServicesProviderId;
            return this;
        }

        public Builder setReplicationHealth(@Nullable String replicationHealth) {
            this.replicationHealth = replicationHealth;
            return this;
        }

        public Builder setTestFailoverState(@Nullable String testFailoverState) {
            this.testFailoverState = testFailoverState;
            return this;
        }

        public Builder setTestFailoverStateDescription(@Nullable String testFailoverStateDescription) {
            this.testFailoverStateDescription = testFailoverStateDescription;
            return this;
        }

        public ReplicationProtectedItemPropertiesResponse build() {
            return new ReplicationProtectedItemPropertiesResponse(activeLocation, allowedOperations, currentScenario, failoverHealth, failoverRecoveryPointId, friendlyName, healthErrors, lastSuccessfulFailoverTime, lastSuccessfulTestFailoverTime, policyFriendlyName, policyId, primaryFabricFriendlyName, primaryFabricProvider, primaryProtectionContainerFriendlyName, protectableItemId, protectedItemType, protectionState, protectionStateDescription, providerSpecificDetails, recoveryContainerId, recoveryFabricFriendlyName, recoveryFabricId, recoveryProtectionContainerFriendlyName, recoveryServicesProviderId, replicationHealth, testFailoverState, testFailoverStateDescription);
        }
    }
}