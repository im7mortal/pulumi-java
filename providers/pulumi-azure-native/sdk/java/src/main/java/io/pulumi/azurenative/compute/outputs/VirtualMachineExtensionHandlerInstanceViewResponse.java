// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.InstanceViewStatusResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualMachineExtensionHandlerInstanceViewResponse {
    /**
     * The extension handler status.
     * 
     */
    private final @Nullable InstanceViewStatusResponse status;
    /**
     * Specifies the type of the extension; an example is "CustomScriptExtension".
     * 
     */
    private final @Nullable String type;
    /**
     * Specifies the version of the script handler.
     * 
     */
    private final @Nullable String typeHandlerVersion;

    @OutputCustomType.Constructor({"status","type","typeHandlerVersion"})
    private VirtualMachineExtensionHandlerInstanceViewResponse(
        @Nullable InstanceViewStatusResponse status,
        @Nullable String type,
        @Nullable String typeHandlerVersion) {
        this.status = status;
        this.type = type;
        this.typeHandlerVersion = typeHandlerVersion;
    }

    /**
     * The extension handler status.
     * 
    */
    public Optional<InstanceViewStatusResponse> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * Specifies the type of the extension; an example is "CustomScriptExtension".
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    /**
     * Specifies the version of the script handler.
     * 
    */
    public Optional<String> getTypeHandlerVersion() {
        return Optional.ofNullable(this.typeHandlerVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineExtensionHandlerInstanceViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable InstanceViewStatusResponse status;
        private @Nullable String type;
        private @Nullable String typeHandlerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineExtensionHandlerInstanceViewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
    	      this.type = defaults.type;
    	      this.typeHandlerVersion = defaults.typeHandlerVersion;
        }

        public Builder setStatus(@Nullable InstanceViewStatusResponse status) {
            this.status = status;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setTypeHandlerVersion(@Nullable String typeHandlerVersion) {
            this.typeHandlerVersion = typeHandlerVersion;
            return this;
        }
        public VirtualMachineExtensionHandlerInstanceViewResponse build() {
            return new VirtualMachineExtensionHandlerInstanceViewResponse(status, type, typeHandlerVersion);
        }
    }
}
