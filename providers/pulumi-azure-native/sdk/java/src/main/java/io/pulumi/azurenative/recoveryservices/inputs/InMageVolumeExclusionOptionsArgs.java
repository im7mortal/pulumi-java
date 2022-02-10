// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InMageVolumeExclusionOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final InMageVolumeExclusionOptionsArgs Empty = new InMageVolumeExclusionOptionsArgs();

    @InputImport(name="onlyExcludeIfSingleVolume")
    private final @Nullable Input<String> onlyExcludeIfSingleVolume;

    public Input<String> getOnlyExcludeIfSingleVolume() {
        return this.onlyExcludeIfSingleVolume == null ? Input.empty() : this.onlyExcludeIfSingleVolume;
    }

    @InputImport(name="volumeLabel")
    private final @Nullable Input<String> volumeLabel;

    public Input<String> getVolumeLabel() {
        return this.volumeLabel == null ? Input.empty() : this.volumeLabel;
    }

    public InMageVolumeExclusionOptionsArgs(
        @Nullable Input<String> onlyExcludeIfSingleVolume,
        @Nullable Input<String> volumeLabel) {
        this.onlyExcludeIfSingleVolume = onlyExcludeIfSingleVolume;
        this.volumeLabel = volumeLabel;
    }

    private InMageVolumeExclusionOptionsArgs() {
        this.onlyExcludeIfSingleVolume = Input.empty();
        this.volumeLabel = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMageVolumeExclusionOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> onlyExcludeIfSingleVolume;
        private @Nullable Input<String> volumeLabel;

        public Builder() {
    	      // Empty
        }

        public Builder(InMageVolumeExclusionOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onlyExcludeIfSingleVolume = defaults.onlyExcludeIfSingleVolume;
    	      this.volumeLabel = defaults.volumeLabel;
        }

        public Builder setOnlyExcludeIfSingleVolume(@Nullable Input<String> onlyExcludeIfSingleVolume) {
            this.onlyExcludeIfSingleVolume = onlyExcludeIfSingleVolume;
            return this;
        }

        public Builder setOnlyExcludeIfSingleVolume(@Nullable String onlyExcludeIfSingleVolume) {
            this.onlyExcludeIfSingleVolume = Input.ofNullable(onlyExcludeIfSingleVolume);
            return this;
        }

        public Builder setVolumeLabel(@Nullable Input<String> volumeLabel) {
            this.volumeLabel = volumeLabel;
            return this;
        }

        public Builder setVolumeLabel(@Nullable String volumeLabel) {
            this.volumeLabel = Input.ofNullable(volumeLabel);
            return this;
        }

        public InMageVolumeExclusionOptionsArgs build() {
            return new InMageVolumeExclusionOptionsArgs(onlyExcludeIfSingleVolume, volumeLabel);
        }
    }
}