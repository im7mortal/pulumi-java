// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ImageTemplateRestartCustomizerResponse {
    /**
     * Friendly Name to provide context on what this customization step does
     * 
     */
    private final @Nullable String name;
    /**
     * Command to check if restart succeeded [Default: '']
     * 
     */
    private final @Nullable String restartCheckCommand;
    /**
     * Command to execute the restart [Default: 'shutdown /r /f /t 0 /c "packer restart"']
     * 
     */
    private final @Nullable String restartCommand;
    /**
     * Restart timeout specified as a string of magnitude and unit, e.g. '5m' (5 minutes) or '2h' (2 hours) [Default: '5m']
     * 
     */
    private final @Nullable String restartTimeout;
    /**
     * The type of customization tool you want to use on the Image. For example, "Shell" can be shell customizer
     * Expected value is 'WindowsRestart'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"name","restartCheckCommand","restartCommand","restartTimeout","type"})
    private ImageTemplateRestartCustomizerResponse(
        @Nullable String name,
        @Nullable String restartCheckCommand,
        @Nullable String restartCommand,
        @Nullable String restartTimeout,
        String type) {
        this.name = name;
        this.restartCheckCommand = restartCheckCommand;
        this.restartCommand = restartCommand;
        this.restartTimeout = restartTimeout;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Friendly Name to provide context on what this customization step does
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Command to check if restart succeeded [Default: '']
     * 
    */
    public Optional<String> getRestartCheckCommand() {
        return Optional.ofNullable(this.restartCheckCommand);
    }
    /**
     * Command to execute the restart [Default: 'shutdown /r /f /t 0 /c "packer restart"']
     * 
    */
    public Optional<String> getRestartCommand() {
        return Optional.ofNullable(this.restartCommand);
    }
    /**
     * Restart timeout specified as a string of magnitude and unit, e.g. '5m' (5 minutes) or '2h' (2 hours) [Default: '5m']
     * 
    */
    public Optional<String> getRestartTimeout() {
        return Optional.ofNullable(this.restartTimeout);
    }
    /**
     * The type of customization tool you want to use on the Image. For example, "Shell" can be shell customizer
     * Expected value is 'WindowsRestart'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplateRestartCustomizerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String restartCheckCommand;
        private @Nullable String restartCommand;
        private @Nullable String restartTimeout;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplateRestartCustomizerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.restartCheckCommand = defaults.restartCheckCommand;
    	      this.restartCommand = defaults.restartCommand;
    	      this.restartTimeout = defaults.restartTimeout;
    	      this.type = defaults.type;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setRestartCheckCommand(@Nullable String restartCheckCommand) {
            this.restartCheckCommand = restartCheckCommand;
            return this;
        }

        public Builder setRestartCommand(@Nullable String restartCommand) {
            this.restartCommand = restartCommand;
            return this;
        }

        public Builder setRestartTimeout(@Nullable String restartTimeout) {
            this.restartTimeout = restartTimeout;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ImageTemplateRestartCustomizerResponse build() {
            return new ImageTemplateRestartCustomizerResponse(name, restartCheckCommand, restartCommand, restartTimeout, type);
        }
    }
}
