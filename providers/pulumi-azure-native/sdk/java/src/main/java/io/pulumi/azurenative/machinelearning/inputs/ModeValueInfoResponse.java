// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.azurenative.machinelearning.inputs.ModuleAssetParameterResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModeValueInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final ModeValueInfoResponse Empty = new ModeValueInfoResponse();

    @InputImport(name="interfaceString")
    private final @Nullable String interfaceString;

    public Optional<String> getInterfaceString() {
        return this.interfaceString == null ? Optional.empty() : Optional.ofNullable(this.interfaceString);
    }

    @InputImport(name="parameters")
    private final @Nullable List<ModuleAssetParameterResponse> parameters;

    public List<ModuleAssetParameterResponse> getParameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }

    public ModeValueInfoResponse(
        @Nullable String interfaceString,
        @Nullable List<ModuleAssetParameterResponse> parameters) {
        this.interfaceString = interfaceString;
        this.parameters = parameters;
    }

    private ModeValueInfoResponse() {
        this.interfaceString = null;
        this.parameters = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModeValueInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String interfaceString;
        private @Nullable List<ModuleAssetParameterResponse> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(ModeValueInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interfaceString = defaults.interfaceString;
    	      this.parameters = defaults.parameters;
        }

        public Builder setInterfaceString(@Nullable String interfaceString) {
            this.interfaceString = interfaceString;
            return this;
        }

        public Builder setParameters(@Nullable List<ModuleAssetParameterResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public ModeValueInfoResponse build() {
            return new ModeValueInfoResponse(interfaceString, parameters);
        }
    }
}