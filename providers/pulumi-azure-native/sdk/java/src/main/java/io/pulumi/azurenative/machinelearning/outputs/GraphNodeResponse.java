// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.outputs;

import io.pulumi.azurenative.machinelearning.outputs.WebServiceParameterResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GraphNodeResponse {
    /**
     * The id of the asset represented by this node.
     * 
     */
    private final @Nullable String assetId;
    /**
     * The id of the input element represented by this node.
     * 
     */
    private final @Nullable String inputId;
    /**
     * The id of the output element represented by this node.
     * 
     */
    private final @Nullable String outputId;
    /**
     * If applicable, parameters of the node. Global graph parameters map into these, with values set at runtime.
     * 
     */
    private final @Nullable Map<String,WebServiceParameterResponse> parameters;

    @OutputCustomType.Constructor({"assetId","inputId","outputId","parameters"})
    private GraphNodeResponse(
        @Nullable String assetId,
        @Nullable String inputId,
        @Nullable String outputId,
        @Nullable Map<String,WebServiceParameterResponse> parameters) {
        this.assetId = assetId;
        this.inputId = inputId;
        this.outputId = outputId;
        this.parameters = parameters;
    }

    /**
     * The id of the asset represented by this node.
     * 
    */
    public Optional<String> getAssetId() {
        return Optional.ofNullable(this.assetId);
    }
    /**
     * The id of the input element represented by this node.
     * 
    */
    public Optional<String> getInputId() {
        return Optional.ofNullable(this.inputId);
    }
    /**
     * The id of the output element represented by this node.
     * 
    */
    public Optional<String> getOutputId() {
        return Optional.ofNullable(this.outputId);
    }
    /**
     * If applicable, parameters of the node. Global graph parameters map into these, with values set at runtime.
     * 
    */
    public Map<String,WebServiceParameterResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GraphNodeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String assetId;
        private @Nullable String inputId;
        private @Nullable String outputId;
        private @Nullable Map<String,WebServiceParameterResponse> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(GraphNodeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetId = defaults.assetId;
    	      this.inputId = defaults.inputId;
    	      this.outputId = defaults.outputId;
    	      this.parameters = defaults.parameters;
        }

        public Builder setAssetId(@Nullable String assetId) {
            this.assetId = assetId;
            return this;
        }

        public Builder setInputId(@Nullable String inputId) {
            this.inputId = inputId;
            return this;
        }

        public Builder setOutputId(@Nullable String outputId) {
            this.outputId = outputId;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,WebServiceParameterResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public GraphNodeResponse build() {
            return new GraphNodeResponse(assetId, inputId, outputId, parameters);
        }
    }
}
