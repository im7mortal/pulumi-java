// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.ModelExplainabilityJobDefinitionEndpointInputArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


/**
 * The inputs for a monitoring job.
 * 
 */
public final class ModelExplainabilityJobDefinitionModelExplainabilityJobInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelExplainabilityJobDefinitionModelExplainabilityJobInputArgs Empty = new ModelExplainabilityJobDefinitionModelExplainabilityJobInputArgs();

    @InputImport(name="endpointInput", required=true)
    private final Input<ModelExplainabilityJobDefinitionEndpointInputArgs> endpointInput;

    public Input<ModelExplainabilityJobDefinitionEndpointInputArgs> getEndpointInput() {
        return this.endpointInput;
    }

    public ModelExplainabilityJobDefinitionModelExplainabilityJobInputArgs(Input<ModelExplainabilityJobDefinitionEndpointInputArgs> endpointInput) {
        this.endpointInput = Objects.requireNonNull(endpointInput, "expected parameter 'endpointInput' to be non-null");
    }

    private ModelExplainabilityJobDefinitionModelExplainabilityJobInputArgs() {
        this.endpointInput = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelExplainabilityJobDefinitionModelExplainabilityJobInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ModelExplainabilityJobDefinitionEndpointInputArgs> endpointInput;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelExplainabilityJobDefinitionModelExplainabilityJobInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointInput = defaults.endpointInput;
        }

        public Builder setEndpointInput(Input<ModelExplainabilityJobDefinitionEndpointInputArgs> endpointInput) {
            this.endpointInput = Objects.requireNonNull(endpointInput);
            return this;
        }

        public Builder setEndpointInput(ModelExplainabilityJobDefinitionEndpointInputArgs endpointInput) {
            this.endpointInput = Input.of(Objects.requireNonNull(endpointInput));
            return this;
        }

        public ModelExplainabilityJobDefinitionModelExplainabilityJobInputArgs build() {
            return new ModelExplainabilityJobDefinitionModelExplainabilityJobInputArgs(endpointInput);
        }
    }
}
