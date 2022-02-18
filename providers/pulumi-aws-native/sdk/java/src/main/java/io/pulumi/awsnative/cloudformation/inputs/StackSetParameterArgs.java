// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class StackSetParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final StackSetParameterArgs Empty = new StackSetParameterArgs();

    /**
     * The key associated with the parameter. If you don't specify a key and value for a particular parameter, AWS CloudFormation uses the default value that is specified in your template.
     * 
     */
    @InputImport(name="parameterKey", required=true)
    private final Input<String> parameterKey;

    public Input<String> getParameterKey() {
        return this.parameterKey;
    }

    /**
     * The input value associated with the parameter.
     * 
     */
    @InputImport(name="parameterValue", required=true)
    private final Input<String> parameterValue;

    public Input<String> getParameterValue() {
        return this.parameterValue;
    }

    public StackSetParameterArgs(
        Input<String> parameterKey,
        Input<String> parameterValue) {
        this.parameterKey = Objects.requireNonNull(parameterKey, "expected parameter 'parameterKey' to be non-null");
        this.parameterValue = Objects.requireNonNull(parameterValue, "expected parameter 'parameterValue' to be non-null");
    }

    private StackSetParameterArgs() {
        this.parameterKey = Input.empty();
        this.parameterValue = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackSetParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> parameterKey;
        private Input<String> parameterValue;

        public Builder() {
    	      // Empty
        }

        public Builder(StackSetParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameterKey = defaults.parameterKey;
    	      this.parameterValue = defaults.parameterValue;
        }

        public Builder setParameterKey(Input<String> parameterKey) {
            this.parameterKey = Objects.requireNonNull(parameterKey);
            return this;
        }

        public Builder setParameterKey(String parameterKey) {
            this.parameterKey = Input.of(Objects.requireNonNull(parameterKey));
            return this;
        }

        public Builder setParameterValue(Input<String> parameterValue) {
            this.parameterValue = Objects.requireNonNull(parameterValue);
            return this;
        }

        public Builder setParameterValue(String parameterValue) {
            this.parameterValue = Input.of(Objects.requireNonNull(parameterValue));
            return this;
        }

        public StackSetParameterArgs build() {
            return new StackSetParameterArgs(parameterKey, parameterValue);
        }
    }
}
