// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ResourceManifestResponse {
    /**
     * Whether the resource provided in the manifest is `cluster_scoped`. If unset, the manifest is assumed to be namespace scoped. This field is used for REST mapping when applying the resource in a cluster.
     * 
     */
    private final Boolean clusterScoped;
    /**
     * YAML manifest of the resource.
     * 
     */
    private final String manifest;

    @OutputCustomType.Constructor({"clusterScoped","manifest"})
    private ResourceManifestResponse(
        Boolean clusterScoped,
        String manifest) {
        this.clusterScoped = Objects.requireNonNull(clusterScoped);
        this.manifest = Objects.requireNonNull(manifest);
    }

    /**
     * Whether the resource provided in the manifest is `cluster_scoped`. If unset, the manifest is assumed to be namespace scoped. This field is used for REST mapping when applying the resource in a cluster.
     * 
    */
    public Boolean getClusterScoped() {
        return this.clusterScoped;
    }
    /**
     * YAML manifest of the resource.
     * 
    */
    public String getManifest() {
        return this.manifest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceManifestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean clusterScoped;
        private String manifest;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceManifestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterScoped = defaults.clusterScoped;
    	      this.manifest = defaults.manifest;
        }

        public Builder setClusterScoped(Boolean clusterScoped) {
            this.clusterScoped = Objects.requireNonNull(clusterScoped);
            return this;
        }

        public Builder setManifest(String manifest) {
            this.manifest = Objects.requireNonNull(manifest);
            return this;
        }
        public ResourceManifestResponse build() {
            return new ResourceManifestResponse(clusterScoped, manifest);
        }
    }
}
