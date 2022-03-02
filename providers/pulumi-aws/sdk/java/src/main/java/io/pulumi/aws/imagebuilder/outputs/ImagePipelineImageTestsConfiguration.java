// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ImagePipelineImageTestsConfiguration {
    /**
     * Whether image tests are enabled. Defaults to `true`.
     * 
     */
    private final @Nullable Boolean imageTestsEnabled;
    /**
     * Number of minutes before image tests time out. Valid values are between `60` and `1440`. Defaults to `720`.
     * 
     */
    private final @Nullable Integer timeoutMinutes;

    @OutputCustomType.Constructor({"imageTestsEnabled","timeoutMinutes"})
    private ImagePipelineImageTestsConfiguration(
        @Nullable Boolean imageTestsEnabled,
        @Nullable Integer timeoutMinutes) {
        this.imageTestsEnabled = imageTestsEnabled;
        this.timeoutMinutes = timeoutMinutes;
    }

    /**
     * Whether image tests are enabled. Defaults to `true`.
     * 
    */
    public Optional<Boolean> getImageTestsEnabled() {
        return Optional.ofNullable(this.imageTestsEnabled);
    }
    /**
     * Number of minutes before image tests time out. Valid values are between `60` and `1440`. Defaults to `720`.
     * 
    */
    public Optional<Integer> getTimeoutMinutes() {
        return Optional.ofNullable(this.timeoutMinutes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImagePipelineImageTestsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean imageTestsEnabled;
        private @Nullable Integer timeoutMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(ImagePipelineImageTestsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageTestsEnabled = defaults.imageTestsEnabled;
    	      this.timeoutMinutes = defaults.timeoutMinutes;
        }

        public Builder setImageTestsEnabled(@Nullable Boolean imageTestsEnabled) {
            this.imageTestsEnabled = imageTestsEnabled;
            return this;
        }

        public Builder setTimeoutMinutes(@Nullable Integer timeoutMinutes) {
            this.timeoutMinutes = timeoutMinutes;
            return this;
        }
        public ImagePipelineImageTestsConfiguration build() {
            return new ImagePipelineImageTestsConfiguration(imageTestsEnabled, timeoutMinutes);
        }
    }
}
