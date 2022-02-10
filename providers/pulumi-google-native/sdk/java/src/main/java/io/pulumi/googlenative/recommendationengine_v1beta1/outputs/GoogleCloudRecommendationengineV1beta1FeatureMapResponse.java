// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recommendationengine_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudRecommendationengineV1beta1FeatureMapResponse {
    private final Map<String,String> categoricalFeatures;
    private final Map<String,String> numericalFeatures;

    @OutputCustomType.Constructor({"categoricalFeatures","numericalFeatures"})
    private GoogleCloudRecommendationengineV1beta1FeatureMapResponse(
        Map<String,String> categoricalFeatures,
        Map<String,String> numericalFeatures) {
        this.categoricalFeatures = Objects.requireNonNull(categoricalFeatures);
        this.numericalFeatures = Objects.requireNonNull(numericalFeatures);
    }

    public Map<String,String> getCategoricalFeatures() {
        return this.categoricalFeatures;
    }
    public Map<String,String> getNumericalFeatures() {
        return this.numericalFeatures;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRecommendationengineV1beta1FeatureMapResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> categoricalFeatures;
        private Map<String,String> numericalFeatures;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRecommendationengineV1beta1FeatureMapResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categoricalFeatures = defaults.categoricalFeatures;
    	      this.numericalFeatures = defaults.numericalFeatures;
        }

        public Builder setCategoricalFeatures(Map<String,String> categoricalFeatures) {
            this.categoricalFeatures = Objects.requireNonNull(categoricalFeatures);
            return this;
        }

        public Builder setNumericalFeatures(Map<String,String> numericalFeatures) {
            this.numericalFeatures = Objects.requireNonNull(numericalFeatures);
            return this;
        }

        public GoogleCloudRecommendationengineV1beta1FeatureMapResponse build() {
            return new GoogleCloudRecommendationengineV1beta1FeatureMapResponse(categoricalFeatures, numericalFeatures);
        }
    }
}