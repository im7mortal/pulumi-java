// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ImagePipelineImageTestsConfiguration {
    /**
     * Defines if tests should be executed when building this image.
     * 
     */
    private final @Nullable Boolean imageTestsEnabled;
    /**
     * The maximum time in minutes that tests are permitted to run.
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
     * Defines if tests should be executed when building this image.
     * 
    */
    public Optional<Boolean> getImageTestsEnabled() {
        return Optional.ofNullable(this.imageTestsEnabled);
    }
    /**
     * The maximum time in minutes that tests are permitted to run.
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
