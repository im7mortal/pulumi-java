// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementBinauthzGetArgs;
import io.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncGetArgs;
import io.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementHierarchyControllerGetArgs;
import io.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementPolicyControllerGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureMembershipConfigmanagementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureMembershipConfigmanagementGetArgs Empty = new FeatureMembershipConfigmanagementGetArgs();

    /**
     * Binauthz configuration for the cluster. Structure is documented below.
     * 
     */
    @InputImport(name="binauthz")
    private final @Nullable Input<FeatureMembershipConfigmanagementBinauthzGetArgs> binauthz;

    public Input<FeatureMembershipConfigmanagementBinauthzGetArgs> getBinauthz() {
        return this.binauthz == null ? Input.empty() : this.binauthz;
    }

    /**
     * Config Sync configuration for the cluster. Structure is documented below.
     * 
     */
    @InputImport(name="configSync")
    private final @Nullable Input<FeatureMembershipConfigmanagementConfigSyncGetArgs> configSync;

    public Input<FeatureMembershipConfigmanagementConfigSyncGetArgs> getConfigSync() {
        return this.configSync == null ? Input.empty() : this.configSync;
    }

    /**
     * Hierarchy Controller configuration for the cluster. Structure is documented below.
     * 
     */
    @InputImport(name="hierarchyController")
    private final @Nullable Input<FeatureMembershipConfigmanagementHierarchyControllerGetArgs> hierarchyController;

    public Input<FeatureMembershipConfigmanagementHierarchyControllerGetArgs> getHierarchyController() {
        return this.hierarchyController == null ? Input.empty() : this.hierarchyController;
    }

    /**
     * Policy Controller configuration for the cluster. Structure is documented below.
     * 
     */
    @InputImport(name="policyController")
    private final @Nullable Input<FeatureMembershipConfigmanagementPolicyControllerGetArgs> policyController;

    public Input<FeatureMembershipConfigmanagementPolicyControllerGetArgs> getPolicyController() {
        return this.policyController == null ? Input.empty() : this.policyController;
    }

    /**
     * Version of ACM installed.
     * 
     */
    @InputImport(name="version")
    private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public FeatureMembershipConfigmanagementGetArgs(
        @Nullable Input<FeatureMembershipConfigmanagementBinauthzGetArgs> binauthz,
        @Nullable Input<FeatureMembershipConfigmanagementConfigSyncGetArgs> configSync,
        @Nullable Input<FeatureMembershipConfigmanagementHierarchyControllerGetArgs> hierarchyController,
        @Nullable Input<FeatureMembershipConfigmanagementPolicyControllerGetArgs> policyController,
        @Nullable Input<String> version) {
        this.binauthz = binauthz;
        this.configSync = configSync;
        this.hierarchyController = hierarchyController;
        this.policyController = policyController;
        this.version = version;
    }

    private FeatureMembershipConfigmanagementGetArgs() {
        this.binauthz = Input.empty();
        this.configSync = Input.empty();
        this.hierarchyController = Input.empty();
        this.policyController = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureMembershipConfigmanagementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FeatureMembershipConfigmanagementBinauthzGetArgs> binauthz;
        private @Nullable Input<FeatureMembershipConfigmanagementConfigSyncGetArgs> configSync;
        private @Nullable Input<FeatureMembershipConfigmanagementHierarchyControllerGetArgs> hierarchyController;
        private @Nullable Input<FeatureMembershipConfigmanagementPolicyControllerGetArgs> policyController;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureMembershipConfigmanagementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.binauthz = defaults.binauthz;
    	      this.configSync = defaults.configSync;
    	      this.hierarchyController = defaults.hierarchyController;
    	      this.policyController = defaults.policyController;
    	      this.version = defaults.version;
        }

        public Builder setBinauthz(@Nullable Input<FeatureMembershipConfigmanagementBinauthzGetArgs> binauthz) {
            this.binauthz = binauthz;
            return this;
        }

        public Builder setBinauthz(@Nullable FeatureMembershipConfigmanagementBinauthzGetArgs binauthz) {
            this.binauthz = Input.ofNullable(binauthz);
            return this;
        }

        public Builder setConfigSync(@Nullable Input<FeatureMembershipConfigmanagementConfigSyncGetArgs> configSync) {
            this.configSync = configSync;
            return this;
        }

        public Builder setConfigSync(@Nullable FeatureMembershipConfigmanagementConfigSyncGetArgs configSync) {
            this.configSync = Input.ofNullable(configSync);
            return this;
        }

        public Builder setHierarchyController(@Nullable Input<FeatureMembershipConfigmanagementHierarchyControllerGetArgs> hierarchyController) {
            this.hierarchyController = hierarchyController;
            return this;
        }

        public Builder setHierarchyController(@Nullable FeatureMembershipConfigmanagementHierarchyControllerGetArgs hierarchyController) {
            this.hierarchyController = Input.ofNullable(hierarchyController);
            return this;
        }

        public Builder setPolicyController(@Nullable Input<FeatureMembershipConfigmanagementPolicyControllerGetArgs> policyController) {
            this.policyController = policyController;
            return this;
        }

        public Builder setPolicyController(@Nullable FeatureMembershipConfigmanagementPolicyControllerGetArgs policyController) {
            this.policyController = Input.ofNullable(policyController);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public FeatureMembershipConfigmanagementGetArgs build() {
            return new FeatureMembershipConfigmanagementGetArgs(binauthz, configSync, hierarchyController, policyController, version);
        }
    }
}