// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxFlowNluSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxFlowNluSettingsArgs Empty = new CxFlowNluSettingsArgs();

    /**
     * To filter out false positive results and still get variety in matched natural language inputs for your agent, you can tune the machine learning classification threshold.
     * If the returned score value is less than the threshold value, then a no-match event will be triggered. The score values range from 0.0 (completely uncertain) to 1.0 (completely certain). If set to 0.0, the default of 0.3 is used.
     * 
     */
    @InputImport(name="classificationThreshold")
    private final @Nullable Input<Double> classificationThreshold;

    public Input<Double> getClassificationThreshold() {
        return this.classificationThreshold == null ? Input.empty() : this.classificationThreshold;
    }

    /**
     * Indicates NLU model training mode.
     * * MODEL_TRAINING_MODE_AUTOMATIC: NLU model training is automatically triggered when a flow gets modified. User can also manually trigger model training in this mode.
     * * MODEL_TRAINING_MODE_MANUAL: User needs to manually trigger NLU model training. Best for large flows whose models take long time to train.
     *   Possible values are `MODEL_TRAINING_MODE_AUTOMATIC` and `MODEL_TRAINING_MODE_MANUAL`.
     * 
     */
    @InputImport(name="modelTrainingMode")
    private final @Nullable Input<String> modelTrainingMode;

    public Input<String> getModelTrainingMode() {
        return this.modelTrainingMode == null ? Input.empty() : this.modelTrainingMode;
    }

    /**
     * Indicates the type of NLU model.
     * * MODEL_TYPE_STANDARD: Use standard NLU model.
     * * MODEL_TYPE_ADVANCED: Use advanced NLU model.
     *   Possible values are `MODEL_TYPE_STANDARD` and `MODEL_TYPE_ADVANCED`.
     * 
     */
    @InputImport(name="modelType")
    private final @Nullable Input<String> modelType;

    public Input<String> getModelType() {
        return this.modelType == null ? Input.empty() : this.modelType;
    }

    public CxFlowNluSettingsArgs(
        @Nullable Input<Double> classificationThreshold,
        @Nullable Input<String> modelTrainingMode,
        @Nullable Input<String> modelType) {
        this.classificationThreshold = classificationThreshold;
        this.modelTrainingMode = modelTrainingMode;
        this.modelType = modelType;
    }

    private CxFlowNluSettingsArgs() {
        this.classificationThreshold = Input.empty();
        this.modelTrainingMode = Input.empty();
        this.modelType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxFlowNluSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> classificationThreshold;
        private @Nullable Input<String> modelTrainingMode;
        private @Nullable Input<String> modelType;

        public Builder() {
    	      // Empty
        }

        public Builder(CxFlowNluSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classificationThreshold = defaults.classificationThreshold;
    	      this.modelTrainingMode = defaults.modelTrainingMode;
    	      this.modelType = defaults.modelType;
        }

        public Builder setClassificationThreshold(@Nullable Input<Double> classificationThreshold) {
            this.classificationThreshold = classificationThreshold;
            return this;
        }

        public Builder setClassificationThreshold(@Nullable Double classificationThreshold) {
            this.classificationThreshold = Input.ofNullable(classificationThreshold);
            return this;
        }

        public Builder setModelTrainingMode(@Nullable Input<String> modelTrainingMode) {
            this.modelTrainingMode = modelTrainingMode;
            return this;
        }

        public Builder setModelTrainingMode(@Nullable String modelTrainingMode) {
            this.modelTrainingMode = Input.ofNullable(modelTrainingMode);
            return this;
        }

        public Builder setModelType(@Nullable Input<String> modelType) {
            this.modelType = modelType;
            return this;
        }

        public Builder setModelType(@Nullable String modelType) {
            this.modelType = Input.ofNullable(modelType);
            return this;
        }

        public CxFlowNluSettingsArgs build() {
            return new CxFlowNluSettingsArgs(classificationThreshold, modelTrainingMode, modelType);
        }
    }
}