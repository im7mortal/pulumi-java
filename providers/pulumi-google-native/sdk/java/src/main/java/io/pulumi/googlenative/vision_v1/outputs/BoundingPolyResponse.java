// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vision_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.vision_v1.outputs.NormalizedVertexResponse;
import io.pulumi.googlenative.vision_v1.outputs.VertexResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class BoundingPolyResponse {
    /**
     * The bounding polygon normalized vertices.
     * 
     */
    private final List<NormalizedVertexResponse> normalizedVertices;
    /**
     * The bounding polygon vertices.
     * 
     */
    private final List<VertexResponse> vertices;

    @OutputCustomType.Constructor({"normalizedVertices","vertices"})
    private BoundingPolyResponse(
        List<NormalizedVertexResponse> normalizedVertices,
        List<VertexResponse> vertices) {
        this.normalizedVertices = Objects.requireNonNull(normalizedVertices);
        this.vertices = Objects.requireNonNull(vertices);
    }

    /**
     * The bounding polygon normalized vertices.
     * 
    */
    public List<NormalizedVertexResponse> getNormalizedVertices() {
        return this.normalizedVertices;
    }
    /**
     * The bounding polygon vertices.
     * 
    */
    public List<VertexResponse> getVertices() {
        return this.vertices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BoundingPolyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<NormalizedVertexResponse> normalizedVertices;
        private List<VertexResponse> vertices;

        public Builder() {
    	      // Empty
        }

        public Builder(BoundingPolyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.normalizedVertices = defaults.normalizedVertices;
    	      this.vertices = defaults.vertices;
        }

        public Builder setNormalizedVertices(List<NormalizedVertexResponse> normalizedVertices) {
            this.normalizedVertices = Objects.requireNonNull(normalizedVertices);
            return this;
        }

        public Builder setVertices(List<VertexResponse> vertices) {
            this.vertices = Objects.requireNonNull(vertices);
            return this;
        }
        public BoundingPolyResponse build() {
            return new BoundingPolyResponse(normalizedVertices, vertices);
        }
    }
}
