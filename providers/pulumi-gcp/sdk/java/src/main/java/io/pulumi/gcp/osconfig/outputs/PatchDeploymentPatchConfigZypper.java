// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PatchDeploymentPatchConfigZypper {
    /**
     * Install only patches with these categories. Common categories include security, recommended, and feature.
     * 
     */
    private final @Nullable List<String> categories;
    /**
     * List of KBs to exclude from update.
     * 
     */
    private final @Nullable List<String> excludes;
    /**
     * An exclusive list of kbs to be updated. These are the only patches that will be updated.
     * This field must not be used with other patch configurations.
     * 
     */
    private final @Nullable List<String> exclusivePatches;
    /**
     * Install only patches with these severities. Common severities include critical, important, moderate, and low.
     * 
     */
    private final @Nullable List<String> severities;
    /**
     * Adds the --with-optional flag to zypper patch.
     * 
     */
    private final @Nullable Boolean withOptional;
    /**
     * Adds the --with-update flag, to zypper patch.
     * 
     */
    private final @Nullable Boolean withUpdate;

    @OutputCustomType.Constructor({"categories","excludes","exclusivePatches","severities","withOptional","withUpdate"})
    private PatchDeploymentPatchConfigZypper(
        @Nullable List<String> categories,
        @Nullable List<String> excludes,
        @Nullable List<String> exclusivePatches,
        @Nullable List<String> severities,
        @Nullable Boolean withOptional,
        @Nullable Boolean withUpdate) {
        this.categories = categories;
        this.excludes = excludes;
        this.exclusivePatches = exclusivePatches;
        this.severities = severities;
        this.withOptional = withOptional;
        this.withUpdate = withUpdate;
    }

    /**
     * Install only patches with these categories. Common categories include security, recommended, and feature.
     * 
    */
    public List<String> getCategories() {
        return this.categories == null ? List.of() : this.categories;
    }
    /**
     * List of KBs to exclude from update.
     * 
    */
    public List<String> getExcludes() {
        return this.excludes == null ? List.of() : this.excludes;
    }
    /**
     * An exclusive list of kbs to be updated. These are the only patches that will be updated.
     * This field must not be used with other patch configurations.
     * 
    */
    public List<String> getExclusivePatches() {
        return this.exclusivePatches == null ? List.of() : this.exclusivePatches;
    }
    /**
     * Install only patches with these severities. Common severities include critical, important, moderate, and low.
     * 
    */
    public List<String> getSeverities() {
        return this.severities == null ? List.of() : this.severities;
    }
    /**
     * Adds the --with-optional flag to zypper patch.
     * 
    */
    public Optional<Boolean> getWithOptional() {
        return Optional.ofNullable(this.withOptional);
    }
    /**
     * Adds the --with-update flag, to zypper patch.
     * 
    */
    public Optional<Boolean> getWithUpdate() {
        return Optional.ofNullable(this.withUpdate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentPatchConfigZypper defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> categories;
        private @Nullable List<String> excludes;
        private @Nullable List<String> exclusivePatches;
        private @Nullable List<String> severities;
        private @Nullable Boolean withOptional;
        private @Nullable Boolean withUpdate;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentPatchConfigZypper defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categories = defaults.categories;
    	      this.excludes = defaults.excludes;
    	      this.exclusivePatches = defaults.exclusivePatches;
    	      this.severities = defaults.severities;
    	      this.withOptional = defaults.withOptional;
    	      this.withUpdate = defaults.withUpdate;
        }

        public Builder setCategories(@Nullable List<String> categories) {
            this.categories = categories;
            return this;
        }

        public Builder setExcludes(@Nullable List<String> excludes) {
            this.excludes = excludes;
            return this;
        }

        public Builder setExclusivePatches(@Nullable List<String> exclusivePatches) {
            this.exclusivePatches = exclusivePatches;
            return this;
        }

        public Builder setSeverities(@Nullable List<String> severities) {
            this.severities = severities;
            return this;
        }

        public Builder setWithOptional(@Nullable Boolean withOptional) {
            this.withOptional = withOptional;
            return this;
        }

        public Builder setWithUpdate(@Nullable Boolean withUpdate) {
            this.withUpdate = withUpdate;
            return this;
        }
        public PatchDeploymentPatchConfigZypper build() {
            return new PatchDeploymentPatchConfigZypper(categories, excludes, exclusivePatches, severities, withOptional, withUpdate);
        }
    }
}
