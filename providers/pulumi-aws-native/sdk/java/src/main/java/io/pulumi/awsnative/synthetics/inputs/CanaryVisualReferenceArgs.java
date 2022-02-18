// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.synthetics.inputs;

import io.pulumi.awsnative.synthetics.inputs.CanaryBaseScreenshotArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CanaryVisualReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final CanaryVisualReferenceArgs Empty = new CanaryVisualReferenceArgs();

    /**
     * Canary run id to be used as base reference for visual testing
     * 
     */
    @InputImport(name="baseCanaryRunId", required=true)
    private final Input<String> baseCanaryRunId;

    public Input<String> getBaseCanaryRunId() {
        return this.baseCanaryRunId;
    }

    /**
     * List of screenshots used as base reference for visual testing
     * 
     */
    @InputImport(name="baseScreenshots")
    private final @Nullable Input<List<CanaryBaseScreenshotArgs>> baseScreenshots;

    public Input<List<CanaryBaseScreenshotArgs>> getBaseScreenshots() {
        return this.baseScreenshots == null ? Input.empty() : this.baseScreenshots;
    }

    public CanaryVisualReferenceArgs(
        Input<String> baseCanaryRunId,
        @Nullable Input<List<CanaryBaseScreenshotArgs>> baseScreenshots) {
        this.baseCanaryRunId = Objects.requireNonNull(baseCanaryRunId, "expected parameter 'baseCanaryRunId' to be non-null");
        this.baseScreenshots = baseScreenshots;
    }

    private CanaryVisualReferenceArgs() {
        this.baseCanaryRunId = Input.empty();
        this.baseScreenshots = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CanaryVisualReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> baseCanaryRunId;
        private @Nullable Input<List<CanaryBaseScreenshotArgs>> baseScreenshots;

        public Builder() {
    	      // Empty
        }

        public Builder(CanaryVisualReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseCanaryRunId = defaults.baseCanaryRunId;
    	      this.baseScreenshots = defaults.baseScreenshots;
        }

        public Builder setBaseCanaryRunId(Input<String> baseCanaryRunId) {
            this.baseCanaryRunId = Objects.requireNonNull(baseCanaryRunId);
            return this;
        }

        public Builder setBaseCanaryRunId(String baseCanaryRunId) {
            this.baseCanaryRunId = Input.of(Objects.requireNonNull(baseCanaryRunId));
            return this;
        }

        public Builder setBaseScreenshots(@Nullable Input<List<CanaryBaseScreenshotArgs>> baseScreenshots) {
            this.baseScreenshots = baseScreenshots;
            return this;
        }

        public Builder setBaseScreenshots(@Nullable List<CanaryBaseScreenshotArgs> baseScreenshots) {
            this.baseScreenshots = Input.ofNullable(baseScreenshots);
            return this;
        }

        public CanaryVisualReferenceArgs build() {
            return new CanaryVisualReferenceArgs(baseCanaryRunId, baseScreenshots);
        }
    }
}
