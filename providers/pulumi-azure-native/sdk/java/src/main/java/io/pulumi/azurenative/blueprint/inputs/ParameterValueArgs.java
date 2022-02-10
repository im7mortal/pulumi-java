// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint.inputs;

import io.pulumi.azurenative.blueprint.inputs.SecretValueReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ParameterValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final ParameterValueArgs Empty = new ParameterValueArgs();

    @InputImport(name="reference")
    private final @Nullable Input<SecretValueReferenceArgs> reference;

    public Input<SecretValueReferenceArgs> getReference() {
        return this.reference == null ? Input.empty() : this.reference;
    }

    @InputImport(name="value")
    private final @Nullable Input<Object> value;

    public Input<Object> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public ParameterValueArgs(
        @Nullable Input<SecretValueReferenceArgs> reference,
        @Nullable Input<Object> value) {
        this.reference = reference;
        this.value = value;
    }

    private ParameterValueArgs() {
        this.reference = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SecretValueReferenceArgs> reference;
        private @Nullable Input<Object> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.reference = defaults.reference;
    	      this.value = defaults.value;
        }

        public Builder setReference(@Nullable Input<SecretValueReferenceArgs> reference) {
            this.reference = reference;
            return this;
        }

        public Builder setReference(@Nullable SecretValueReferenceArgs reference) {
            this.reference = Input.ofNullable(reference);
            return this;
        }

        public Builder setValue(@Nullable Input<Object> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable Object value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public ParameterValueArgs build() {
            return new ParameterValueArgs(reference, value);
        }
    }
}