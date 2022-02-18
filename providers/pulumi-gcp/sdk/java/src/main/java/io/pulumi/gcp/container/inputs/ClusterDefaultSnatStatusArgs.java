// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class ClusterDefaultSnatStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterDefaultSnatStatusArgs Empty = new ClusterDefaultSnatStatusArgs();

    /**
     * The status of the Istio addon, which makes it easy to set up Istio for services in a
     * cluster. It is disabled by default. Set `disabled = false` to enable.
     * 
     */
    @InputImport(name="disabled", required=true)
    private final Input<Boolean> disabled;

    public Input<Boolean> getDisabled() {
        return this.disabled;
    }

    public ClusterDefaultSnatStatusArgs(Input<Boolean> disabled) {
        this.disabled = Objects.requireNonNull(disabled, "expected parameter 'disabled' to be non-null");
    }

    private ClusterDefaultSnatStatusArgs() {
        this.disabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterDefaultSnatStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> disabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterDefaultSnatStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
        }

        public Builder setDisabled(Input<Boolean> disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }

        public Builder setDisabled(Boolean disabled) {
            this.disabled = Input.of(Objects.requireNonNull(disabled));
            return this;
        }

        public ClusterDefaultSnatStatusArgs build() {
            return new ClusterDefaultSnatStatusArgs(disabled);
        }
    }
}