// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.k8s.io_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.TypedLocalObjectReferenceArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IngressClassSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final IngressClassSpecArgs Empty = new IngressClassSpecArgs();

    @InputImport(name="controller")
    private final @Nullable Input<String> controller;

    public Input<String> getController() {
        return this.controller == null ? Input.empty() : this.controller;
    }

    @InputImport(name="parameters")
    private final @Nullable Input<TypedLocalObjectReferenceArgs> parameters;

    public Input<TypedLocalObjectReferenceArgs> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    public IngressClassSpecArgs(
        @Nullable Input<String> controller,
        @Nullable Input<TypedLocalObjectReferenceArgs> parameters) {
        this.controller = controller;
        this.parameters = parameters;
    }

    private IngressClassSpecArgs() {
        this.controller = Input.empty();
        this.parameters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressClassSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> controller;
        private @Nullable Input<TypedLocalObjectReferenceArgs> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressClassSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.controller = defaults.controller;
    	      this.parameters = defaults.parameters;
        }

        public Builder setController(@Nullable Input<String> controller) {
            this.controller = controller;
            return this;
        }

        public Builder setController(@Nullable String controller) {
            this.controller = Input.ofNullable(controller);
            return this;
        }

        public Builder setParameters(@Nullable Input<TypedLocalObjectReferenceArgs> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable TypedLocalObjectReferenceArgs parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public IngressClassSpecArgs build() {
            return new IngressClassSpecArgs(controller, parameters);
        }
    }
}