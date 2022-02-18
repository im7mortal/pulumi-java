// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.synthetics.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class CanaryBaseScreenshot {
    /**
     * List of coordinates of rectangles to be ignored during visual testing
     * 
     */
    private final @Nullable List<String> ignoreCoordinates;
    /**
     * Name of the screenshot to be used as base reference for visual testing
     * 
     */
    private final String screenshotName;

    @OutputCustomType.Constructor({"ignoreCoordinates","screenshotName"})
    private CanaryBaseScreenshot(
        @Nullable List<String> ignoreCoordinates,
        String screenshotName) {
        this.ignoreCoordinates = ignoreCoordinates;
        this.screenshotName = Objects.requireNonNull(screenshotName);
    }

    /**
     * List of coordinates of rectangles to be ignored during visual testing
     * 
     */
    public List<String> getIgnoreCoordinates() {
        return this.ignoreCoordinates == null ? List.of() : this.ignoreCoordinates;
    }
    /**
     * Name of the screenshot to be used as base reference for visual testing
     * 
     */
    public String getScreenshotName() {
        return this.screenshotName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CanaryBaseScreenshot defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> ignoreCoordinates;
        private String screenshotName;

        public Builder() {
    	      // Empty
        }

        public Builder(CanaryBaseScreenshot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreCoordinates = defaults.ignoreCoordinates;
    	      this.screenshotName = defaults.screenshotName;
        }

        public Builder setIgnoreCoordinates(@Nullable List<String> ignoreCoordinates) {
            this.ignoreCoordinates = ignoreCoordinates;
            return this;
        }

        public Builder setScreenshotName(String screenshotName) {
            this.screenshotName = Objects.requireNonNull(screenshotName);
            return this;
        }

        public CanaryBaseScreenshot build() {
            return new CanaryBaseScreenshot(ignoreCoordinates, screenshotName);
        }
    }
}
