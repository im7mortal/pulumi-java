// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.enums.FeatureGroupFeatureDefinitionFeatureType;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FeatureGroupFeatureDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureGroupFeatureDefinitionArgs Empty = new FeatureGroupFeatureDefinitionArgs();

    @InputImport(name="featureName", required=true)
    private final Input<String> featureName;

    public Input<String> getFeatureName() {
        return this.featureName;
    }

    @InputImport(name="featureType", required=true)
    private final Input<FeatureGroupFeatureDefinitionFeatureType> featureType;

    public Input<FeatureGroupFeatureDefinitionFeatureType> getFeatureType() {
        return this.featureType;
    }

    public FeatureGroupFeatureDefinitionArgs(
        Input<String> featureName,
        Input<FeatureGroupFeatureDefinitionFeatureType> featureType) {
        this.featureName = Objects.requireNonNull(featureName, "expected parameter 'featureName' to be non-null");
        this.featureType = Objects.requireNonNull(featureType, "expected parameter 'featureType' to be non-null");
    }

    private FeatureGroupFeatureDefinitionArgs() {
        this.featureName = Input.empty();
        this.featureType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureGroupFeatureDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> featureName;
        private Input<FeatureGroupFeatureDefinitionFeatureType> featureType;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureGroupFeatureDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.featureName = defaults.featureName;
    	      this.featureType = defaults.featureType;
        }

        public Builder setFeatureName(Input<String> featureName) {
            this.featureName = Objects.requireNonNull(featureName);
            return this;
        }

        public Builder setFeatureName(String featureName) {
            this.featureName = Input.of(Objects.requireNonNull(featureName));
            return this;
        }

        public Builder setFeatureType(Input<FeatureGroupFeatureDefinitionFeatureType> featureType) {
            this.featureType = Objects.requireNonNull(featureType);
            return this;
        }

        public Builder setFeatureType(FeatureGroupFeatureDefinitionFeatureType featureType) {
            this.featureType = Input.of(Objects.requireNonNull(featureType));
            return this;
        }

        public FeatureGroupFeatureDefinitionArgs build() {
            return new FeatureGroupFeatureDefinitionArgs(featureName, featureType);
        }
    }
}