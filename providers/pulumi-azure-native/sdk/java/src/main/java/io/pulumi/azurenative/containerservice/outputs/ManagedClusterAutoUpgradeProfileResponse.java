// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedClusterAutoUpgradeProfileResponse {
    /**
     * upgrade channel for auto upgrade.
     * 
     */
    private final @Nullable String upgradeChannel;

    @OutputCustomType.Constructor({"upgradeChannel"})
    private ManagedClusterAutoUpgradeProfileResponse(@Nullable String upgradeChannel) {
        this.upgradeChannel = upgradeChannel;
    }

    /**
     * upgrade channel for auto upgrade.
     * 
    */
    public Optional<String> getUpgradeChannel() {
        return Optional.ofNullable(this.upgradeChannel);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterAutoUpgradeProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String upgradeChannel;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterAutoUpgradeProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.upgradeChannel = defaults.upgradeChannel;
        }

        public Builder setUpgradeChannel(@Nullable String upgradeChannel) {
            this.upgradeChannel = upgradeChannel;
            return this;
        }
        public ManagedClusterAutoUpgradeProfileResponse build() {
            return new ManagedClusterAutoUpgradeProfileResponse(upgradeChannel);
        }
    }
}
