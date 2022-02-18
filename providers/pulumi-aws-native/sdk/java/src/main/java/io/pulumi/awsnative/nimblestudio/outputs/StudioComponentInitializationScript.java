// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.outputs;

import io.pulumi.awsnative.nimblestudio.enums.StudioComponentInitializationScriptRunContext;
import io.pulumi.awsnative.nimblestudio.enums.StudioComponentLaunchProfilePlatform;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StudioComponentInitializationScript {
    /**
     * <p>The version number of the protocol that is used by the launch profile. The only valid version is "2021-03-31".</p>
     * 
     */
    private final @Nullable String launchProfileProtocolVersion;
    private final @Nullable StudioComponentLaunchProfilePlatform platform;
    private final @Nullable StudioComponentInitializationScriptRunContext runContext;
    /**
     * <p>The initialization script.</p>
     * 
     */
    private final @Nullable String script;

    @OutputCustomType.Constructor({"launchProfileProtocolVersion","platform","runContext","script"})
    private StudioComponentInitializationScript(
        @Nullable String launchProfileProtocolVersion,
        @Nullable StudioComponentLaunchProfilePlatform platform,
        @Nullable StudioComponentInitializationScriptRunContext runContext,
        @Nullable String script) {
        this.launchProfileProtocolVersion = launchProfileProtocolVersion;
        this.platform = platform;
        this.runContext = runContext;
        this.script = script;
    }

    /**
     * <p>The version number of the protocol that is used by the launch profile. The only valid version is "2021-03-31".</p>
     * 
     */
    public Optional<String> getLaunchProfileProtocolVersion() {
        return Optional.ofNullable(this.launchProfileProtocolVersion);
    }
    public Optional<StudioComponentLaunchProfilePlatform> getPlatform() {
        return Optional.ofNullable(this.platform);
    }
    public Optional<StudioComponentInitializationScriptRunContext> getRunContext() {
        return Optional.ofNullable(this.runContext);
    }
    /**
     * <p>The initialization script.</p>
     * 
     */
    public Optional<String> getScript() {
        return Optional.ofNullable(this.script);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioComponentInitializationScript defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String launchProfileProtocolVersion;
        private @Nullable StudioComponentLaunchProfilePlatform platform;
        private @Nullable StudioComponentInitializationScriptRunContext runContext;
        private @Nullable String script;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioComponentInitializationScript defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.launchProfileProtocolVersion = defaults.launchProfileProtocolVersion;
    	      this.platform = defaults.platform;
    	      this.runContext = defaults.runContext;
    	      this.script = defaults.script;
        }

        public Builder setLaunchProfileProtocolVersion(@Nullable String launchProfileProtocolVersion) {
            this.launchProfileProtocolVersion = launchProfileProtocolVersion;
            return this;
        }

        public Builder setPlatform(@Nullable StudioComponentLaunchProfilePlatform platform) {
            this.platform = platform;
            return this;
        }

        public Builder setRunContext(@Nullable StudioComponentInitializationScriptRunContext runContext) {
            this.runContext = runContext;
            return this;
        }

        public Builder setScript(@Nullable String script) {
            this.script = script;
            return this;
        }

        public StudioComponentInitializationScript build() {
            return new StudioComponentInitializationScript(launchProfileProtocolVersion, platform, runContext, script);
        }
    }
}
