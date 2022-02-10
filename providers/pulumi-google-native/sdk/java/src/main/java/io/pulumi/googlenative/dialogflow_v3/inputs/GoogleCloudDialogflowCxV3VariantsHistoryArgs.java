// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3VersionVariantsArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GoogleCloudDialogflowCxV3VariantsHistoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3VariantsHistoryArgs Empty = new GoogleCloudDialogflowCxV3VariantsHistoryArgs();

    @InputImport(name="updateTime")
    private final @Nullable Input<String> updateTime;

    public Input<String> getUpdateTime() {
        return this.updateTime == null ? Input.empty() : this.updateTime;
    }

    @InputImport(name="versionVariants")
    private final @Nullable Input<GoogleCloudDialogflowCxV3VersionVariantsArgs> versionVariants;

    public Input<GoogleCloudDialogflowCxV3VersionVariantsArgs> getVersionVariants() {
        return this.versionVariants == null ? Input.empty() : this.versionVariants;
    }

    public GoogleCloudDialogflowCxV3VariantsHistoryArgs(
        @Nullable Input<String> updateTime,
        @Nullable Input<GoogleCloudDialogflowCxV3VersionVariantsArgs> versionVariants) {
        this.updateTime = updateTime;
        this.versionVariants = versionVariants;
    }

    private GoogleCloudDialogflowCxV3VariantsHistoryArgs() {
        this.updateTime = Input.empty();
        this.versionVariants = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3VariantsHistoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> updateTime;
        private @Nullable Input<GoogleCloudDialogflowCxV3VersionVariantsArgs> versionVariants;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3VariantsHistoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.updateTime = defaults.updateTime;
    	      this.versionVariants = defaults.versionVariants;
        }

        public Builder setUpdateTime(@Nullable Input<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder setUpdateTime(@Nullable String updateTime) {
            this.updateTime = Input.ofNullable(updateTime);
            return this;
        }

        public Builder setVersionVariants(@Nullable Input<GoogleCloudDialogflowCxV3VersionVariantsArgs> versionVariants) {
            this.versionVariants = versionVariants;
            return this;
        }

        public Builder setVersionVariants(@Nullable GoogleCloudDialogflowCxV3VersionVariantsArgs versionVariants) {
            this.versionVariants = Input.ofNullable(versionVariants);
            return this;
        }

        public GoogleCloudDialogflowCxV3VariantsHistoryArgs build() {
            return new GoogleCloudDialogflowCxV3VariantsHistoryArgs(updateTime, versionVariants);
        }
    }
}