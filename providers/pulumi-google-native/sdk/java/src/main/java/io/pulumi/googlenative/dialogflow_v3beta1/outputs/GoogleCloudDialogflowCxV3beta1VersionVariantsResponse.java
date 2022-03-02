// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1VersionVariantsVariantResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3beta1VersionVariantsResponse {
    /**
     * A list of flow version variants.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3beta1VersionVariantsVariantResponse> variants;

    @OutputCustomType.Constructor({"variants"})
    private GoogleCloudDialogflowCxV3beta1VersionVariantsResponse(List<GoogleCloudDialogflowCxV3beta1VersionVariantsVariantResponse> variants) {
        this.variants = Objects.requireNonNull(variants);
    }

    /**
     * A list of flow version variants.
     * 
    */
    public List<GoogleCloudDialogflowCxV3beta1VersionVariantsVariantResponse> getVariants() {
        return this.variants;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1VersionVariantsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowCxV3beta1VersionVariantsVariantResponse> variants;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1VersionVariantsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.variants = defaults.variants;
        }

        public Builder setVariants(List<GoogleCloudDialogflowCxV3beta1VersionVariantsVariantResponse> variants) {
            this.variants = Objects.requireNonNull(variants);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1VersionVariantsResponse build() {
            return new GoogleCloudDialogflowCxV3beta1VersionVariantsResponse(variants);
        }
    }
}
