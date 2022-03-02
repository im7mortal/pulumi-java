// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2InfoTypeTransformationsResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2RecordTransformationsResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2TransformationErrorHandlingResponse;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2DeidentifyConfigResponse {
    /**
     * Treat the dataset as free-form text and apply the same free text transformation everywhere.
     * 
     */
    private final GooglePrivacyDlpV2InfoTypeTransformationsResponse infoTypeTransformations;
    /**
     * Treat the dataset as structured. Transformations can be applied to specific locations within structured datasets, such as transforming a column within a table.
     * 
     */
    private final GooglePrivacyDlpV2RecordTransformationsResponse recordTransformations;
    /**
     * Mode for handling transformation errors. If left unspecified, the default mode is `TransformationErrorHandling.ThrowError`.
     * 
     */
    private final GooglePrivacyDlpV2TransformationErrorHandlingResponse transformationErrorHandling;

    @OutputCustomType.Constructor({"infoTypeTransformations","recordTransformations","transformationErrorHandling"})
    private GooglePrivacyDlpV2DeidentifyConfigResponse(
        GooglePrivacyDlpV2InfoTypeTransformationsResponse infoTypeTransformations,
        GooglePrivacyDlpV2RecordTransformationsResponse recordTransformations,
        GooglePrivacyDlpV2TransformationErrorHandlingResponse transformationErrorHandling) {
        this.infoTypeTransformations = Objects.requireNonNull(infoTypeTransformations);
        this.recordTransformations = Objects.requireNonNull(recordTransformations);
        this.transformationErrorHandling = Objects.requireNonNull(transformationErrorHandling);
    }

    /**
     * Treat the dataset as free-form text and apply the same free text transformation everywhere.
     * 
    */
    public GooglePrivacyDlpV2InfoTypeTransformationsResponse getInfoTypeTransformations() {
        return this.infoTypeTransformations;
    }
    /**
     * Treat the dataset as structured. Transformations can be applied to specific locations within structured datasets, such as transforming a column within a table.
     * 
    */
    public GooglePrivacyDlpV2RecordTransformationsResponse getRecordTransformations() {
        return this.recordTransformations;
    }
    /**
     * Mode for handling transformation errors. If left unspecified, the default mode is `TransformationErrorHandling.ThrowError`.
     * 
    */
    public GooglePrivacyDlpV2TransformationErrorHandlingResponse getTransformationErrorHandling() {
        return this.transformationErrorHandling;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2DeidentifyConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2InfoTypeTransformationsResponse infoTypeTransformations;
        private GooglePrivacyDlpV2RecordTransformationsResponse recordTransformations;
        private GooglePrivacyDlpV2TransformationErrorHandlingResponse transformationErrorHandling;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2DeidentifyConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infoTypeTransformations = defaults.infoTypeTransformations;
    	      this.recordTransformations = defaults.recordTransformations;
    	      this.transformationErrorHandling = defaults.transformationErrorHandling;
        }

        public Builder setInfoTypeTransformations(GooglePrivacyDlpV2InfoTypeTransformationsResponse infoTypeTransformations) {
            this.infoTypeTransformations = Objects.requireNonNull(infoTypeTransformations);
            return this;
        }

        public Builder setRecordTransformations(GooglePrivacyDlpV2RecordTransformationsResponse recordTransformations) {
            this.recordTransformations = Objects.requireNonNull(recordTransformations);
            return this;
        }

        public Builder setTransformationErrorHandling(GooglePrivacyDlpV2TransformationErrorHandlingResponse transformationErrorHandling) {
            this.transformationErrorHandling = Objects.requireNonNull(transformationErrorHandling);
            return this;
        }
        public GooglePrivacyDlpV2DeidentifyConfigResponse build() {
            return new GooglePrivacyDlpV2DeidentifyConfigResponse(infoTypeTransformations, recordTransformations, transformationErrorHandling);
        }
    }
}
