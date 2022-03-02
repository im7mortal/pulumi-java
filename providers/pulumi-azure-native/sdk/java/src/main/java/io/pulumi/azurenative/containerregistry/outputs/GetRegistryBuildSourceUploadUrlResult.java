// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRegistryBuildSourceUploadUrlResult {
    /**
     * The relative path to the source. This is used to submit the subsequent queue build request.
     * 
     */
    private final @Nullable String relativePath;
    /**
     * The URL where the client can upload the source.
     * 
     */
    private final @Nullable String uploadUrl;

    @OutputCustomType.Constructor({"relativePath","uploadUrl"})
    private GetRegistryBuildSourceUploadUrlResult(
        @Nullable String relativePath,
        @Nullable String uploadUrl) {
        this.relativePath = relativePath;
        this.uploadUrl = uploadUrl;
    }

    /**
     * The relative path to the source. This is used to submit the subsequent queue build request.
     * 
    */
    public Optional<String> getRelativePath() {
        return Optional.ofNullable(this.relativePath);
    }
    /**
     * The URL where the client can upload the source.
     * 
    */
    public Optional<String> getUploadUrl() {
        return Optional.ofNullable(this.uploadUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryBuildSourceUploadUrlResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String relativePath;
        private @Nullable String uploadUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistryBuildSourceUploadUrlResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.relativePath = defaults.relativePath;
    	      this.uploadUrl = defaults.uploadUrl;
        }

        public Builder setRelativePath(@Nullable String relativePath) {
            this.relativePath = relativePath;
            return this;
        }

        public Builder setUploadUrl(@Nullable String uploadUrl) {
            this.uploadUrl = uploadUrl;
            return this;
        }
        public GetRegistryBuildSourceUploadUrlResult build() {
            return new GetRegistryBuildSourceUploadUrlResult(relativePath, uploadUrl);
        }
    }
}
