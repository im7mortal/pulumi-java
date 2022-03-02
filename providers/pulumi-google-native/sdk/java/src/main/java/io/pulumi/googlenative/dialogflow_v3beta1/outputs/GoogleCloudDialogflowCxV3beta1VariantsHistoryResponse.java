// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1VersionVariantsResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3beta1VariantsHistoryResponse {
    /**
     * Update time of the variants.
     * 
     */
    private final String updateTime;
    /**
     * The flow versions as the variants.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1VersionVariantsResponse versionVariants;

    @OutputCustomType.Constructor({"updateTime","versionVariants"})
    private GoogleCloudDialogflowCxV3beta1VariantsHistoryResponse(
        String updateTime,
        GoogleCloudDialogflowCxV3beta1VersionVariantsResponse versionVariants) {
        this.updateTime = Objects.requireNonNull(updateTime);
        this.versionVariants = Objects.requireNonNull(versionVariants);
    }

    /**
     * Update time of the variants.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }
    /**
     * The flow versions as the variants.
     * 
    */
    public GoogleCloudDialogflowCxV3beta1VersionVariantsResponse getVersionVariants() {
        return this.versionVariants;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1VariantsHistoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String updateTime;
        private GoogleCloudDialogflowCxV3beta1VersionVariantsResponse versionVariants;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1VariantsHistoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.updateTime = defaults.updateTime;
    	      this.versionVariants = defaults.versionVariants;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public Builder setVersionVariants(GoogleCloudDialogflowCxV3beta1VersionVariantsResponse versionVariants) {
            this.versionVariants = Objects.requireNonNull(versionVariants);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1VariantsHistoryResponse build() {
            return new GoogleCloudDialogflowCxV3beta1VariantsHistoryResponse(updateTime, versionVariants);
        }
    }
}
