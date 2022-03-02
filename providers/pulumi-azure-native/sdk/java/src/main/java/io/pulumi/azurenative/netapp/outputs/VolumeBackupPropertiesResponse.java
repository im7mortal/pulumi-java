// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VolumeBackupPropertiesResponse {
    /**
     * Backup Enabled
     * 
     */
    private final @Nullable Boolean backupEnabled;
    /**
     * Backup Policy Resource ID
     * 
     */
    private final @Nullable String backupPolicyId;
    /**
     * Policy Enforced
     * 
     */
    private final @Nullable Boolean policyEnforced;
    /**
     * Vault Resource ID
     * 
     */
    private final @Nullable String vaultId;

    @OutputCustomType.Constructor({"backupEnabled","backupPolicyId","policyEnforced","vaultId"})
    private VolumeBackupPropertiesResponse(
        @Nullable Boolean backupEnabled,
        @Nullable String backupPolicyId,
        @Nullable Boolean policyEnforced,
        @Nullable String vaultId) {
        this.backupEnabled = backupEnabled;
        this.backupPolicyId = backupPolicyId;
        this.policyEnforced = policyEnforced;
        this.vaultId = vaultId;
    }

    /**
     * Backup Enabled
     * 
    */
    public Optional<Boolean> getBackupEnabled() {
        return Optional.ofNullable(this.backupEnabled);
    }
    /**
     * Backup Policy Resource ID
     * 
    */
    public Optional<String> getBackupPolicyId() {
        return Optional.ofNullable(this.backupPolicyId);
    }
    /**
     * Policy Enforced
     * 
    */
    public Optional<Boolean> getPolicyEnforced() {
        return Optional.ofNullable(this.policyEnforced);
    }
    /**
     * Vault Resource ID
     * 
    */
    public Optional<String> getVaultId() {
        return Optional.ofNullable(this.vaultId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeBackupPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean backupEnabled;
        private @Nullable String backupPolicyId;
        private @Nullable Boolean policyEnforced;
        private @Nullable String vaultId;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeBackupPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupEnabled = defaults.backupEnabled;
    	      this.backupPolicyId = defaults.backupPolicyId;
    	      this.policyEnforced = defaults.policyEnforced;
    	      this.vaultId = defaults.vaultId;
        }

        public Builder setBackupEnabled(@Nullable Boolean backupEnabled) {
            this.backupEnabled = backupEnabled;
            return this;
        }

        public Builder setBackupPolicyId(@Nullable String backupPolicyId) {
            this.backupPolicyId = backupPolicyId;
            return this;
        }

        public Builder setPolicyEnforced(@Nullable Boolean policyEnforced) {
            this.policyEnforced = policyEnforced;
            return this;
        }

        public Builder setVaultId(@Nullable String vaultId) {
            this.vaultId = vaultId;
            return this;
        }
        public VolumeBackupPropertiesResponse build() {
            return new VolumeBackupPropertiesResponse(backupEnabled, backupPolicyId, policyEnforced, vaultId);
        }
    }
}
