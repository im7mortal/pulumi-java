// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.enums.ModelBiasJobDefinitionEndpointInputS3DataDistributionType;
import io.pulumi.awsnative.sagemaker.enums.ModelBiasJobDefinitionEndpointInputS3InputMode;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The endpoint for a monitoring job.
 * 
 */
public final class ModelBiasJobDefinitionEndpointInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelBiasJobDefinitionEndpointInputArgs Empty = new ModelBiasJobDefinitionEndpointInputArgs();

    /**
     * Monitoring end time offset, e.g. PT0H
     * 
     */
    @InputImport(name="endTimeOffset")
    private final @Nullable Input<String> endTimeOffset;

    public Input<String> getEndTimeOffset() {
        return this.endTimeOffset == null ? Input.empty() : this.endTimeOffset;
    }

    @InputImport(name="endpointName", required=true)
    private final Input<String> endpointName;

    public Input<String> getEndpointName() {
        return this.endpointName;
    }

    /**
     * JSONpath to locate features in JSONlines dataset
     * 
     */
    @InputImport(name="featuresAttribute")
    private final @Nullable Input<String> featuresAttribute;

    public Input<String> getFeaturesAttribute() {
        return this.featuresAttribute == null ? Input.empty() : this.featuresAttribute;
    }

    /**
     * Index or JSONpath to locate predicted label(s)
     * 
     */
    @InputImport(name="inferenceAttribute")
    private final @Nullable Input<String> inferenceAttribute;

    public Input<String> getInferenceAttribute() {
        return this.inferenceAttribute == null ? Input.empty() : this.inferenceAttribute;
    }

    /**
     * Path to the filesystem where the endpoint data is available to the container.
     * 
     */
    @InputImport(name="localPath", required=true)
    private final Input<String> localPath;

    public Input<String> getLocalPath() {
        return this.localPath;
    }

    /**
     * Index or JSONpath to locate probabilities
     * 
     */
    @InputImport(name="probabilityAttribute")
    private final @Nullable Input<String> probabilityAttribute;

    public Input<String> getProbabilityAttribute() {
        return this.probabilityAttribute == null ? Input.empty() : this.probabilityAttribute;
    }

    @InputImport(name="probabilityThresholdAttribute")
    private final @Nullable Input<Double> probabilityThresholdAttribute;

    public Input<Double> getProbabilityThresholdAttribute() {
        return this.probabilityThresholdAttribute == null ? Input.empty() : this.probabilityThresholdAttribute;
    }

    /**
     * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to FullyReplicated
     * 
     */
    @InputImport(name="s3DataDistributionType")
    private final @Nullable Input<ModelBiasJobDefinitionEndpointInputS3DataDistributionType> s3DataDistributionType;

    public Input<ModelBiasJobDefinitionEndpointInputS3DataDistributionType> getS3DataDistributionType() {
        return this.s3DataDistributionType == null ? Input.empty() : this.s3DataDistributionType;
    }

    /**
     * Whether the Pipe or File is used as the input mode for transfering data for the monitoring job. Pipe mode is recommended for large datasets. File mode is useful for small files that fit in memory. Defaults to File.
     * 
     */
    @InputImport(name="s3InputMode")
    private final @Nullable Input<ModelBiasJobDefinitionEndpointInputS3InputMode> s3InputMode;

    public Input<ModelBiasJobDefinitionEndpointInputS3InputMode> getS3InputMode() {
        return this.s3InputMode == null ? Input.empty() : this.s3InputMode;
    }

    /**
     * Monitoring start time offset, e.g. -PT1H
     * 
     */
    @InputImport(name="startTimeOffset")
    private final @Nullable Input<String> startTimeOffset;

    public Input<String> getStartTimeOffset() {
        return this.startTimeOffset == null ? Input.empty() : this.startTimeOffset;
    }

    public ModelBiasJobDefinitionEndpointInputArgs(
        @Nullable Input<String> endTimeOffset,
        Input<String> endpointName,
        @Nullable Input<String> featuresAttribute,
        @Nullable Input<String> inferenceAttribute,
        Input<String> localPath,
        @Nullable Input<String> probabilityAttribute,
        @Nullable Input<Double> probabilityThresholdAttribute,
        @Nullable Input<ModelBiasJobDefinitionEndpointInputS3DataDistributionType> s3DataDistributionType,
        @Nullable Input<ModelBiasJobDefinitionEndpointInputS3InputMode> s3InputMode,
        @Nullable Input<String> startTimeOffset) {
        this.endTimeOffset = endTimeOffset;
        this.endpointName = Objects.requireNonNull(endpointName, "expected parameter 'endpointName' to be non-null");
        this.featuresAttribute = featuresAttribute;
        this.inferenceAttribute = inferenceAttribute;
        this.localPath = Objects.requireNonNull(localPath, "expected parameter 'localPath' to be non-null");
        this.probabilityAttribute = probabilityAttribute;
        this.probabilityThresholdAttribute = probabilityThresholdAttribute;
        this.s3DataDistributionType = s3DataDistributionType;
        this.s3InputMode = s3InputMode;
        this.startTimeOffset = startTimeOffset;
    }

    private ModelBiasJobDefinitionEndpointInputArgs() {
        this.endTimeOffset = Input.empty();
        this.endpointName = Input.empty();
        this.featuresAttribute = Input.empty();
        this.inferenceAttribute = Input.empty();
        this.localPath = Input.empty();
        this.probabilityAttribute = Input.empty();
        this.probabilityThresholdAttribute = Input.empty();
        this.s3DataDistributionType = Input.empty();
        this.s3InputMode = Input.empty();
        this.startTimeOffset = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelBiasJobDefinitionEndpointInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> endTimeOffset;
        private Input<String> endpointName;
        private @Nullable Input<String> featuresAttribute;
        private @Nullable Input<String> inferenceAttribute;
        private Input<String> localPath;
        private @Nullable Input<String> probabilityAttribute;
        private @Nullable Input<Double> probabilityThresholdAttribute;
        private @Nullable Input<ModelBiasJobDefinitionEndpointInputS3DataDistributionType> s3DataDistributionType;
        private @Nullable Input<ModelBiasJobDefinitionEndpointInputS3InputMode> s3InputMode;
        private @Nullable Input<String> startTimeOffset;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelBiasJobDefinitionEndpointInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTimeOffset = defaults.endTimeOffset;
    	      this.endpointName = defaults.endpointName;
    	      this.featuresAttribute = defaults.featuresAttribute;
    	      this.inferenceAttribute = defaults.inferenceAttribute;
    	      this.localPath = defaults.localPath;
    	      this.probabilityAttribute = defaults.probabilityAttribute;
    	      this.probabilityThresholdAttribute = defaults.probabilityThresholdAttribute;
    	      this.s3DataDistributionType = defaults.s3DataDistributionType;
    	      this.s3InputMode = defaults.s3InputMode;
    	      this.startTimeOffset = defaults.startTimeOffset;
        }

        public Builder setEndTimeOffset(@Nullable Input<String> endTimeOffset) {
            this.endTimeOffset = endTimeOffset;
            return this;
        }

        public Builder setEndTimeOffset(@Nullable String endTimeOffset) {
            this.endTimeOffset = Input.ofNullable(endTimeOffset);
            return this;
        }

        public Builder setEndpointName(Input<String> endpointName) {
            this.endpointName = Objects.requireNonNull(endpointName);
            return this;
        }

        public Builder setEndpointName(String endpointName) {
            this.endpointName = Input.of(Objects.requireNonNull(endpointName));
            return this;
        }

        public Builder setFeaturesAttribute(@Nullable Input<String> featuresAttribute) {
            this.featuresAttribute = featuresAttribute;
            return this;
        }

        public Builder setFeaturesAttribute(@Nullable String featuresAttribute) {
            this.featuresAttribute = Input.ofNullable(featuresAttribute);
            return this;
        }

        public Builder setInferenceAttribute(@Nullable Input<String> inferenceAttribute) {
            this.inferenceAttribute = inferenceAttribute;
            return this;
        }

        public Builder setInferenceAttribute(@Nullable String inferenceAttribute) {
            this.inferenceAttribute = Input.ofNullable(inferenceAttribute);
            return this;
        }

        public Builder setLocalPath(Input<String> localPath) {
            this.localPath = Objects.requireNonNull(localPath);
            return this;
        }

        public Builder setLocalPath(String localPath) {
            this.localPath = Input.of(Objects.requireNonNull(localPath));
            return this;
        }

        public Builder setProbabilityAttribute(@Nullable Input<String> probabilityAttribute) {
            this.probabilityAttribute = probabilityAttribute;
            return this;
        }

        public Builder setProbabilityAttribute(@Nullable String probabilityAttribute) {
            this.probabilityAttribute = Input.ofNullable(probabilityAttribute);
            return this;
        }

        public Builder setProbabilityThresholdAttribute(@Nullable Input<Double> probabilityThresholdAttribute) {
            this.probabilityThresholdAttribute = probabilityThresholdAttribute;
            return this;
        }

        public Builder setProbabilityThresholdAttribute(@Nullable Double probabilityThresholdAttribute) {
            this.probabilityThresholdAttribute = Input.ofNullable(probabilityThresholdAttribute);
            return this;
        }

        public Builder setS3DataDistributionType(@Nullable Input<ModelBiasJobDefinitionEndpointInputS3DataDistributionType> s3DataDistributionType) {
            this.s3DataDistributionType = s3DataDistributionType;
            return this;
        }

        public Builder setS3DataDistributionType(@Nullable ModelBiasJobDefinitionEndpointInputS3DataDistributionType s3DataDistributionType) {
            this.s3DataDistributionType = Input.ofNullable(s3DataDistributionType);
            return this;
        }

        public Builder setS3InputMode(@Nullable Input<ModelBiasJobDefinitionEndpointInputS3InputMode> s3InputMode) {
            this.s3InputMode = s3InputMode;
            return this;
        }

        public Builder setS3InputMode(@Nullable ModelBiasJobDefinitionEndpointInputS3InputMode s3InputMode) {
            this.s3InputMode = Input.ofNullable(s3InputMode);
            return this;
        }

        public Builder setStartTimeOffset(@Nullable Input<String> startTimeOffset) {
            this.startTimeOffset = startTimeOffset;
            return this;
        }

        public Builder setStartTimeOffset(@Nullable String startTimeOffset) {
            this.startTimeOffset = Input.ofNullable(startTimeOffset);
            return this;
        }

        public ModelBiasJobDefinitionEndpointInputArgs build() {
            return new ModelBiasJobDefinitionEndpointInputArgs(endTimeOffset, endpointName, featuresAttribute, inferenceAttribute, localPath, probabilityAttribute, probabilityThresholdAttribute, s3DataDistributionType, s3InputMode, startTimeOffset);
        }
    }
}
