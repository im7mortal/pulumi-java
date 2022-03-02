// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse {
    /**
     * User readable description of the volume.
     * 
     */
    private final @Nullable String description;
    /**
     * Specifies the application-scoped volume kind.
     * Expected value is 'ServiceFabricVolumeDisk'.
     * 
     */
    private final String kind;
    /**
     * Volume size
     * 
     */
    private final String sizeDisk;

    @OutputCustomType.Constructor({"description","kind","sizeDisk"})
    private ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse(
        @Nullable String description,
        String kind,
        String sizeDisk) {
        this.description = description;
        this.kind = Objects.requireNonNull(kind);
        this.sizeDisk = Objects.requireNonNull(sizeDisk);
    }

    /**
     * User readable description of the volume.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Specifies the application-scoped volume kind.
     * Expected value is 'ServiceFabricVolumeDisk'.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Volume size
     * 
    */
    public String getSizeDisk() {
        return this.sizeDisk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String kind;
        private String sizeDisk;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.kind = defaults.kind;
    	      this.sizeDisk = defaults.sizeDisk;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setSizeDisk(String sizeDisk) {
            this.sizeDisk = Objects.requireNonNull(sizeDisk);
            return this;
        }
        public ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse build() {
            return new ApplicationScopedVolumeCreationParametersServiceFabricVolumeDiskResponse(description, kind, sizeDisk);
        }
    }
}
