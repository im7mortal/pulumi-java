// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.artifactregistry_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetTagResult {
    /**
     * The name of the tag, for example: "projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/tags/tag1". If the package part contains slashes, the slashes are escaped. The tag part can only have characters in [a-zA-Z0-9\-._~:@], anything else must be URL encoded.
     * 
     */
    private final String name;
    /**
     * The name of the version the tag refers to, for example: "projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/versions/sha256:5243811" If the package or version ID parts contain slashes, the slashes are escaped.
     * 
     */
    private final String version;

    @OutputCustomType.Constructor({"name","version"})
    private GetTagResult(
        String name,
        String version) {
        this.name = Objects.requireNonNull(name);
        this.version = Objects.requireNonNull(version);
    }

    /**
     * The name of the tag, for example: "projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/tags/tag1". If the package part contains slashes, the slashes are escaped. The tag part can only have characters in [a-zA-Z0-9\-._~:@], anything else must be URL encoded.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The name of the version the tag refers to, for example: "projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/versions/sha256:5243811" If the package or version ID parts contain slashes, the slashes are escaped.
     * 
    */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTagResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTagResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetTagResult build() {
            return new GetTagResult(name, version);
        }
    }
}
