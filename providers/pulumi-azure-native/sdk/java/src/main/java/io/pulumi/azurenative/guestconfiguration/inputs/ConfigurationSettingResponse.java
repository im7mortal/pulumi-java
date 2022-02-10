// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.guestconfiguration.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigurationSettingResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConfigurationSettingResponse Empty = new ConfigurationSettingResponse();

    @InputImport(name="actionAfterReboot")
    private final @Nullable String actionAfterReboot;

    public Optional<String> getActionAfterReboot() {
        return this.actionAfterReboot == null ? Optional.empty() : Optional.ofNullable(this.actionAfterReboot);
    }

    @InputImport(name="allowModuleOverwrite")
    private final @Nullable Boolean allowModuleOverwrite;

    public Optional<Boolean> getAllowModuleOverwrite() {
        return this.allowModuleOverwrite == null ? Optional.empty() : Optional.ofNullable(this.allowModuleOverwrite);
    }

    @InputImport(name="configurationMode")
    private final @Nullable String configurationMode;

    public Optional<String> getConfigurationMode() {
        return this.configurationMode == null ? Optional.empty() : Optional.ofNullable(this.configurationMode);
    }

    @InputImport(name="configurationModeFrequencyMins")
    private final @Nullable Double configurationModeFrequencyMins;

    public Optional<Double> getConfigurationModeFrequencyMins() {
        return this.configurationModeFrequencyMins == null ? Optional.empty() : Optional.ofNullable(this.configurationModeFrequencyMins);
    }

    @InputImport(name="rebootIfNeeded")
    private final @Nullable Boolean rebootIfNeeded;

    public Optional<Boolean> getRebootIfNeeded() {
        return this.rebootIfNeeded == null ? Optional.empty() : Optional.ofNullable(this.rebootIfNeeded);
    }

    @InputImport(name="refreshFrequencyMins")
    private final @Nullable Double refreshFrequencyMins;

    public Optional<Double> getRefreshFrequencyMins() {
        return this.refreshFrequencyMins == null ? Optional.empty() : Optional.ofNullable(this.refreshFrequencyMins);
    }

    public ConfigurationSettingResponse(
        @Nullable String actionAfterReboot,
        @Nullable Boolean allowModuleOverwrite,
        @Nullable String configurationMode,
        @Nullable Double configurationModeFrequencyMins,
        @Nullable Boolean rebootIfNeeded,
        @Nullable Double refreshFrequencyMins) {
        this.actionAfterReboot = actionAfterReboot;
        this.allowModuleOverwrite = allowModuleOverwrite;
        this.configurationMode = configurationMode;
        this.configurationModeFrequencyMins = configurationModeFrequencyMins == null ? 1.5e+01 : configurationModeFrequencyMins;
        this.rebootIfNeeded = rebootIfNeeded;
        this.refreshFrequencyMins = refreshFrequencyMins == null ? 3e+01 : refreshFrequencyMins;
    }

    private ConfigurationSettingResponse() {
        this.actionAfterReboot = null;
        this.allowModuleOverwrite = null;
        this.configurationMode = null;
        this.configurationModeFrequencyMins = null;
        this.rebootIfNeeded = null;
        this.refreshFrequencyMins = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationSettingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String actionAfterReboot;
        private @Nullable Boolean allowModuleOverwrite;
        private @Nullable String configurationMode;
        private @Nullable Double configurationModeFrequencyMins;
        private @Nullable Boolean rebootIfNeeded;
        private @Nullable Double refreshFrequencyMins;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationSettingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionAfterReboot = defaults.actionAfterReboot;
    	      this.allowModuleOverwrite = defaults.allowModuleOverwrite;
    	      this.configurationMode = defaults.configurationMode;
    	      this.configurationModeFrequencyMins = defaults.configurationModeFrequencyMins;
    	      this.rebootIfNeeded = defaults.rebootIfNeeded;
    	      this.refreshFrequencyMins = defaults.refreshFrequencyMins;
        }

        public Builder setActionAfterReboot(@Nullable String actionAfterReboot) {
            this.actionAfterReboot = actionAfterReboot;
            return this;
        }

        public Builder setAllowModuleOverwrite(@Nullable Boolean allowModuleOverwrite) {
            this.allowModuleOverwrite = allowModuleOverwrite;
            return this;
        }

        public Builder setConfigurationMode(@Nullable String configurationMode) {
            this.configurationMode = configurationMode;
            return this;
        }

        public Builder setConfigurationModeFrequencyMins(@Nullable Double configurationModeFrequencyMins) {
            this.configurationModeFrequencyMins = configurationModeFrequencyMins;
            return this;
        }

        public Builder setRebootIfNeeded(@Nullable Boolean rebootIfNeeded) {
            this.rebootIfNeeded = rebootIfNeeded;
            return this;
        }

        public Builder setRefreshFrequencyMins(@Nullable Double refreshFrequencyMins) {
            this.refreshFrequencyMins = refreshFrequencyMins;
            return this;
        }

        public ConfigurationSettingResponse build() {
            return new ConfigurationSettingResponse(actionAfterReboot, allowModuleOverwrite, configurationMode, configurationModeFrequencyMins, rebootIfNeeded, refreshFrequencyMins);
        }
    }
}