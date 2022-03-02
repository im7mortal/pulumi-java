// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.cloudbuild.outputs.TriggerBuildArtifactsObjects;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TriggerBuildArtifacts {
    /**
     * A list of images to be pushed upon the successful completion of all build steps.
     * The images will be pushed using the builder service account's credentials.
     * The digests of the pushed images will be stored in the Build resource's results field.
     * If any of the images fail to be pushed, the build is marked FAILURE.
     * 
     */
    private final @Nullable List<String> images;
    /**
     * A list of objects to be uploaded to Cloud Storage upon successful completion of all build steps.
     * Files in the workspace matching specified paths globs will be uploaded to the
     * Cloud Storage location using the builder service account's credentials.
     * The location and generation of the uploaded objects will be stored in the Build resource's results field.
     * If any objects fail to be pushed, the build is marked FAILURE.
     * Structure is documented below.
     * 
     */
    private final @Nullable TriggerBuildArtifactsObjects objects;

    @OutputCustomType.Constructor({"images","objects"})
    private TriggerBuildArtifacts(
        @Nullable List<String> images,
        @Nullable TriggerBuildArtifactsObjects objects) {
        this.images = images;
        this.objects = objects;
    }

    /**
     * A list of images to be pushed upon the successful completion of all build steps.
     * The images will be pushed using the builder service account's credentials.
     * The digests of the pushed images will be stored in the Build resource's results field.
     * If any of the images fail to be pushed, the build is marked FAILURE.
     * 
    */
    public List<String> getImages() {
        return this.images == null ? List.of() : this.images;
    }
    /**
     * A list of objects to be uploaded to Cloud Storage upon successful completion of all build steps.
     * Files in the workspace matching specified paths globs will be uploaded to the
     * Cloud Storage location using the builder service account's credentials.
     * The location and generation of the uploaded objects will be stored in the Build resource's results field.
     * If any objects fail to be pushed, the build is marked FAILURE.
     * Structure is documented below.
     * 
    */
    public Optional<TriggerBuildArtifactsObjects> getObjects() {
        return Optional.ofNullable(this.objects);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuildArtifacts defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> images;
        private @Nullable TriggerBuildArtifactsObjects objects;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerBuildArtifacts defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.images = defaults.images;
    	      this.objects = defaults.objects;
        }

        public Builder setImages(@Nullable List<String> images) {
            this.images = images;
            return this;
        }

        public Builder setObjects(@Nullable TriggerBuildArtifactsObjects objects) {
            this.objects = objects;
            return this;
        }
        public TriggerBuildArtifacts build() {
            return new TriggerBuildArtifacts(images, objects);
        }
    }
}
