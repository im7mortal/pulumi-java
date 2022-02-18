// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.inputs.PackagingConfigurationStreamSelection;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A Microsoft Smooth Streaming (MSS) manifest configuration.
 * 
 */
public final class PackagingConfigurationMssManifest extends io.pulumi.resources.InvokeArgs {

    public static final PackagingConfigurationMssManifest Empty = new PackagingConfigurationMssManifest();

    @InputImport(name="manifestName")
    private final @Nullable String manifestName;

    public Optional<String> getManifestName() {
        return this.manifestName == null ? Optional.empty() : Optional.ofNullable(this.manifestName);
    }

    @InputImport(name="streamSelection")
    private final @Nullable PackagingConfigurationStreamSelection streamSelection;

    public Optional<PackagingConfigurationStreamSelection> getStreamSelection() {
        return this.streamSelection == null ? Optional.empty() : Optional.ofNullable(this.streamSelection);
    }

    public PackagingConfigurationMssManifest(
        @Nullable String manifestName,
        @Nullable PackagingConfigurationStreamSelection streamSelection) {
        this.manifestName = manifestName;
        this.streamSelection = streamSelection;
    }

    private PackagingConfigurationMssManifest() {
        this.manifestName = null;
        this.streamSelection = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackagingConfigurationMssManifest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String manifestName;
        private @Nullable PackagingConfigurationStreamSelection streamSelection;

        public Builder() {
    	      // Empty
        }

        public Builder(PackagingConfigurationMssManifest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.manifestName = defaults.manifestName;
    	      this.streamSelection = defaults.streamSelection;
        }

        public Builder setManifestName(@Nullable String manifestName) {
            this.manifestName = manifestName;
            return this;
        }

        public Builder setStreamSelection(@Nullable PackagingConfigurationStreamSelection streamSelection) {
            this.streamSelection = streamSelection;
            return this;
        }

        public PackagingConfigurationMssManifest build() {
            return new PackagingConfigurationMssManifest(manifestName, streamSelection);
        }
    }
}
