// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GraphEdgeResponse {
    /**
     * The source graph node's identifier.
     * 
     */
    private final @Nullable String sourceNodeId;
    /**
     * The identifier of the source node's port that the edge connects from.
     * 
     */
    private final @Nullable String sourcePortId;
    /**
     * The destination graph node's identifier.
     * 
     */
    private final @Nullable String targetNodeId;
    /**
     * The identifier of the destination node's port that the edge connects into.
     * 
     */
    private final @Nullable String targetPortId;

    @OutputCustomType.Constructor({"sourceNodeId","sourcePortId","targetNodeId","targetPortId"})
    private GraphEdgeResponse(
        @Nullable String sourceNodeId,
        @Nullable String sourcePortId,
        @Nullable String targetNodeId,
        @Nullable String targetPortId) {
        this.sourceNodeId = sourceNodeId;
        this.sourcePortId = sourcePortId;
        this.targetNodeId = targetNodeId;
        this.targetPortId = targetPortId;
    }

    /**
     * The source graph node's identifier.
     * 
    */
    public Optional<String> getSourceNodeId() {
        return Optional.ofNullable(this.sourceNodeId);
    }
    /**
     * The identifier of the source node's port that the edge connects from.
     * 
    */
    public Optional<String> getSourcePortId() {
        return Optional.ofNullable(this.sourcePortId);
    }
    /**
     * The destination graph node's identifier.
     * 
    */
    public Optional<String> getTargetNodeId() {
        return Optional.ofNullable(this.targetNodeId);
    }
    /**
     * The identifier of the destination node's port that the edge connects into.
     * 
    */
    public Optional<String> getTargetPortId() {
        return Optional.ofNullable(this.targetPortId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GraphEdgeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String sourceNodeId;
        private @Nullable String sourcePortId;
        private @Nullable String targetNodeId;
        private @Nullable String targetPortId;

        public Builder() {
    	      // Empty
        }

        public Builder(GraphEdgeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceNodeId = defaults.sourceNodeId;
    	      this.sourcePortId = defaults.sourcePortId;
    	      this.targetNodeId = defaults.targetNodeId;
    	      this.targetPortId = defaults.targetPortId;
        }

        public Builder setSourceNodeId(@Nullable String sourceNodeId) {
            this.sourceNodeId = sourceNodeId;
            return this;
        }

        public Builder setSourcePortId(@Nullable String sourcePortId) {
            this.sourcePortId = sourcePortId;
            return this;
        }

        public Builder setTargetNodeId(@Nullable String targetNodeId) {
            this.targetNodeId = targetNodeId;
            return this;
        }

        public Builder setTargetPortId(@Nullable String targetPortId) {
            this.targetPortId = targetPortId;
            return this;
        }
        public GraphEdgeResponse build() {
            return new GraphEdgeResponse(sourceNodeId, sourcePortId, targetNodeId, targetPortId);
        }
    }
}
