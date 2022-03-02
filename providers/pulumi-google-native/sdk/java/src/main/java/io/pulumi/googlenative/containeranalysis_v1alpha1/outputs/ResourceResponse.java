// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.HashResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ResourceResponse {
    /**
     * The hash of the resource content. E.g., the Docker digest.
     * 
     */
    private final HashResponse contentHash;
    /**
     * The name of the resource. E.g., the name of a Docker image - "Debian".
     * 
     */
    private final String name;
    /**
     * The unique URI of the resource. E.g., "https://gcr.io/project/image@sha256:foo" for a Docker image.
     * 
     */
    private final String uri;

    @OutputCustomType.Constructor({"contentHash","name","uri"})
    private ResourceResponse(
        HashResponse contentHash,
        String name,
        String uri) {
        this.contentHash = Objects.requireNonNull(contentHash);
        this.name = Objects.requireNonNull(name);
        this.uri = Objects.requireNonNull(uri);
    }

    /**
     * The hash of the resource content. E.g., the Docker digest.
     * 
    */
    public HashResponse getContentHash() {
        return this.contentHash;
    }
    /**
     * The name of the resource. E.g., the name of a Docker image - "Debian".
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The unique URI of the resource. E.g., "https://gcr.io/project/image@sha256:foo" for a Docker image.
     * 
    */
    public String getUri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HashResponse contentHash;
        private String name;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentHash = defaults.contentHash;
    	      this.name = defaults.name;
    	      this.uri = defaults.uri;
        }

        public Builder setContentHash(HashResponse contentHash) {
            this.contentHash = Objects.requireNonNull(contentHash);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public ResourceResponse build() {
            return new ResourceResponse(contentHash, name, uri);
        }
    }
}
