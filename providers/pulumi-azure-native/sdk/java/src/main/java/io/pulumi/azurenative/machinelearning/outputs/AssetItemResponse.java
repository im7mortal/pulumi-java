// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.outputs;

import io.pulumi.azurenative.machinelearning.outputs.BlobLocationResponse;
import io.pulumi.azurenative.machinelearning.outputs.InputPortResponse;
import io.pulumi.azurenative.machinelearning.outputs.ModuleAssetParameterResponse;
import io.pulumi.azurenative.machinelearning.outputs.OutputPortResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AssetItemResponse {
    /**
     * Asset's Id.
     * 
     */
    private final @Nullable String id;
    /**
     * Information about the asset's input ports.
     * 
     */
    private final @Nullable Map<String,InputPortResponse> inputPorts;
    /**
     * Access information for the asset.
     * 
     */
    private final BlobLocationResponse locationInfo;
    /**
     * If the asset is a custom module, this holds the module's metadata.
     * 
     */
    private final @Nullable Map<String,String> metadata;
    /**
     * Asset's friendly name.
     * 
     */
    private final String name;
    /**
     * Information about the asset's output ports.
     * 
     */
    private final @Nullable Map<String,OutputPortResponse> outputPorts;
    /**
     * If the asset is a custom module, this holds the module's parameters.
     * 
     */
    private final @Nullable List<ModuleAssetParameterResponse> parameters;
    /**
     * Asset's type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","inputPorts","locationInfo","metadata","name","outputPorts","parameters","type"})
    private AssetItemResponse(
        @Nullable String id,
        @Nullable Map<String,InputPortResponse> inputPorts,
        BlobLocationResponse locationInfo,
        @Nullable Map<String,String> metadata,
        String name,
        @Nullable Map<String,OutputPortResponse> outputPorts,
        @Nullable List<ModuleAssetParameterResponse> parameters,
        String type) {
        this.id = id;
        this.inputPorts = inputPorts;
        this.locationInfo = Objects.requireNonNull(locationInfo);
        this.metadata = metadata;
        this.name = Objects.requireNonNull(name);
        this.outputPorts = outputPorts;
        this.parameters = parameters;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Asset's Id.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Information about the asset's input ports.
     * 
    */
    public Map<String,InputPortResponse> getInputPorts() {
        return this.inputPorts == null ? Map.of() : this.inputPorts;
    }
    /**
     * Access information for the asset.
     * 
    */
    public BlobLocationResponse getLocationInfo() {
        return this.locationInfo;
    }
    /**
     * If the asset is a custom module, this holds the module's metadata.
     * 
    */
    public Map<String,String> getMetadata() {
        return this.metadata == null ? Map.of() : this.metadata;
    }
    /**
     * Asset's friendly name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Information about the asset's output ports.
     * 
    */
    public Map<String,OutputPortResponse> getOutputPorts() {
        return this.outputPorts == null ? Map.of() : this.outputPorts;
    }
    /**
     * If the asset is a custom module, this holds the module's parameters.
     * 
    */
    public List<ModuleAssetParameterResponse> getParameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }
    /**
     * Asset's type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable Map<String,InputPortResponse> inputPorts;
        private BlobLocationResponse locationInfo;
        private @Nullable Map<String,String> metadata;
        private String name;
        private @Nullable Map<String,OutputPortResponse> outputPorts;
        private @Nullable List<ModuleAssetParameterResponse> parameters;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.inputPorts = defaults.inputPorts;
    	      this.locationInfo = defaults.locationInfo;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.outputPorts = defaults.outputPorts;
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setInputPorts(@Nullable Map<String,InputPortResponse> inputPorts) {
            this.inputPorts = inputPorts;
            return this;
        }

        public Builder setLocationInfo(BlobLocationResponse locationInfo) {
            this.locationInfo = Objects.requireNonNull(locationInfo);
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,String> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOutputPorts(@Nullable Map<String,OutputPortResponse> outputPorts) {
            this.outputPorts = outputPorts;
            return this;
        }

        public Builder setParameters(@Nullable List<ModuleAssetParameterResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public AssetItemResponse build() {
            return new AssetItemResponse(id, inputPorts, locationInfo, metadata, name, outputPorts, parameters, type);
        }
    }
}
