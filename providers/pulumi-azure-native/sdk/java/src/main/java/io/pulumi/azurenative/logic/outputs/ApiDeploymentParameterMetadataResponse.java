// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApiDeploymentParameterMetadataResponse {
    /**
     * The description.
     * 
     */
    private final @Nullable String description;
    /**
     * The display name.
     * 
     */
    private final @Nullable String displayName;
    /**
     * Indicates whether its required.
     * 
     */
    private final @Nullable Boolean isRequired;
    /**
     * The type.
     * 
     */
    private final @Nullable String type;
    /**
     * The visibility.
     * 
     */
    private final @Nullable String visibility;

    @OutputCustomType.Constructor({"description","displayName","isRequired","type","visibility"})
    private ApiDeploymentParameterMetadataResponse(
        @Nullable String description,
        @Nullable String displayName,
        @Nullable Boolean isRequired,
        @Nullable String type,
        @Nullable String visibility) {
        this.description = description;
        this.displayName = displayName;
        this.isRequired = isRequired;
        this.type = type;
        this.visibility = visibility;
    }

    /**
     * The description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The display name.
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * Indicates whether its required.
     * 
    */
    public Optional<Boolean> getIsRequired() {
        return Optional.ofNullable(this.isRequired);
    }
    /**
     * The type.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    /**
     * The visibility.
     * 
    */
    public Optional<String> getVisibility() {
        return Optional.ofNullable(this.visibility);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiDeploymentParameterMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String displayName;
        private @Nullable Boolean isRequired;
        private @Nullable String type;
        private @Nullable String visibility;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiDeploymentParameterMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.isRequired = defaults.isRequired;
    	      this.type = defaults.type;
    	      this.visibility = defaults.visibility;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setIsRequired(@Nullable Boolean isRequired) {
            this.isRequired = isRequired;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setVisibility(@Nullable String visibility) {
            this.visibility = visibility;
            return this;
        }
        public ApiDeploymentParameterMetadataResponse build() {
            return new ApiDeploymentParameterMetadataResponse(description, displayName, isRequired, type, visibility);
        }
    }
}
