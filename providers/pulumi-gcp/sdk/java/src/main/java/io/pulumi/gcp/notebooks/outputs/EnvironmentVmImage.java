// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EnvironmentVmImage {
    /**
     * Use this VM image family to find the image; the newest image in this family will be used.
     * 
     */
    private final @Nullable String imageFamily;
    /**
     * Use VM image name to find the image.
     * 
     */
    private final @Nullable String imageName;
    /**
     * The name of the Google Cloud project that this VM image belongs to.
     * Format: projects/{project_id}
     * 
     */
    private final String project;

    @OutputCustomType.Constructor({"imageFamily","imageName","project"})
    private EnvironmentVmImage(
        @Nullable String imageFamily,
        @Nullable String imageName,
        String project) {
        this.imageFamily = imageFamily;
        this.imageName = imageName;
        this.project = Objects.requireNonNull(project);
    }

    /**
     * Use this VM image family to find the image; the newest image in this family will be used.
     * 
    */
    public Optional<String> getImageFamily() {
        return Optional.ofNullable(this.imageFamily);
    }
    /**
     * Use VM image name to find the image.
     * 
    */
    public Optional<String> getImageName() {
        return Optional.ofNullable(this.imageName);
    }
    /**
     * The name of the Google Cloud project that this VM image belongs to.
     * Format: projects/{project_id}
     * 
    */
    public String getProject() {
        return this.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentVmImage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String imageFamily;
        private @Nullable String imageName;
        private String project;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentVmImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageFamily = defaults.imageFamily;
    	      this.imageName = defaults.imageName;
    	      this.project = defaults.project;
        }

        public Builder setImageFamily(@Nullable String imageFamily) {
            this.imageFamily = imageFamily;
            return this;
        }

        public Builder setImageName(@Nullable String imageName) {
            this.imageName = imageName;
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public EnvironmentVmImage build() {
            return new EnvironmentVmImage(imageFamily, imageName, project);
        }
    }
}
