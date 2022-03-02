// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ModelInferenceExecutionConfig {
    /**
     * The container hosts value `SingleModel/MultiModel`. The default value is `SingleModel`.
     * 
     */
    private final String mode;

    @OutputCustomType.Constructor({"mode"})
    private ModelInferenceExecutionConfig(String mode) {
        this.mode = Objects.requireNonNull(mode);
    }

    /**
     * The container hosts value `SingleModel/MultiModel`. The default value is `SingleModel`.
     * 
    */
    public String getMode() {
        return this.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelInferenceExecutionConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mode;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelInferenceExecutionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
        }

        public Builder setMode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public ModelInferenceExecutionConfig build() {
            return new ModelInferenceExecutionConfig(mode);
        }
    }
}
