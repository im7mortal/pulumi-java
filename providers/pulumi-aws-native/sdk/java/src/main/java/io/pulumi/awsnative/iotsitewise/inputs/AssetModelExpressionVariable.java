// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.awsnative.iotsitewise.inputs.AssetModelVariableValue;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AssetModelExpressionVariable extends io.pulumi.resources.InvokeArgs {

    public static final AssetModelExpressionVariable Empty = new AssetModelExpressionVariable();

    /**
     * The friendly name of the variable to be used in the expression.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The variable that identifies an asset property from which to use values.
     * 
     */
    @InputImport(name="value", required=true)
    private final AssetModelVariableValue value;

    public AssetModelVariableValue getValue() {
        return this.value;
    }

    public AssetModelExpressionVariable(
        String name,
        AssetModelVariableValue value) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private AssetModelExpressionVariable() {
        this.name = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetModelExpressionVariable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private AssetModelVariableValue value;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetModelExpressionVariable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setValue(AssetModelVariableValue value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public AssetModelExpressionVariable build() {
            return new AssetModelExpressionVariable(name, value);
        }
    }
}
