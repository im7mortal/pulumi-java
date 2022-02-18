// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.enums.FlowTaskType;
import io.pulumi.awsnative.appflow.inputs.FlowConnectorOperatorArgs;
import io.pulumi.awsnative.appflow.inputs.FlowTaskPropertiesObjectArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowTaskArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowTaskArgs Empty = new FlowTaskArgs();

    /**
     * Operation to be performed on provided source fields
     * 
     */
    @InputImport(name="connectorOperator")
    private final @Nullable Input<FlowConnectorOperatorArgs> connectorOperator;

    public Input<FlowConnectorOperatorArgs> getConnectorOperator() {
        return this.connectorOperator == null ? Input.empty() : this.connectorOperator;
    }

    /**
     * A field value on which source field should be validated
     * 
     */
    @InputImport(name="destinationField")
    private final @Nullable Input<String> destinationField;

    public Input<String> getDestinationField() {
        return this.destinationField == null ? Input.empty() : this.destinationField;
    }

    /**
     * Source fields on which particular task will be applied
     * 
     */
    @InputImport(name="sourceFields", required=true)
    private final Input<List<String>> sourceFields;

    public Input<List<String>> getSourceFields() {
        return this.sourceFields;
    }

    /**
     * A Map used to store task related info
     * 
     */
    @InputImport(name="taskProperties")
    private final @Nullable Input<List<FlowTaskPropertiesObjectArgs>> taskProperties;

    public Input<List<FlowTaskPropertiesObjectArgs>> getTaskProperties() {
        return this.taskProperties == null ? Input.empty() : this.taskProperties;
    }

    /**
     * Type of task
     * 
     */
    @InputImport(name="taskType", required=true)
    private final Input<FlowTaskType> taskType;

    public Input<FlowTaskType> getTaskType() {
        return this.taskType;
    }

    public FlowTaskArgs(
        @Nullable Input<FlowConnectorOperatorArgs> connectorOperator,
        @Nullable Input<String> destinationField,
        Input<List<String>> sourceFields,
        @Nullable Input<List<FlowTaskPropertiesObjectArgs>> taskProperties,
        Input<FlowTaskType> taskType) {
        this.connectorOperator = connectorOperator;
        this.destinationField = destinationField;
        this.sourceFields = Objects.requireNonNull(sourceFields, "expected parameter 'sourceFields' to be non-null");
        this.taskProperties = taskProperties;
        this.taskType = Objects.requireNonNull(taskType, "expected parameter 'taskType' to be non-null");
    }

    private FlowTaskArgs() {
        this.connectorOperator = Input.empty();
        this.destinationField = Input.empty();
        this.sourceFields = Input.empty();
        this.taskProperties = Input.empty();
        this.taskType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FlowConnectorOperatorArgs> connectorOperator;
        private @Nullable Input<String> destinationField;
        private Input<List<String>> sourceFields;
        private @Nullable Input<List<FlowTaskPropertiesObjectArgs>> taskProperties;
        private Input<FlowTaskType> taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowTaskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectorOperator = defaults.connectorOperator;
    	      this.destinationField = defaults.destinationField;
    	      this.sourceFields = defaults.sourceFields;
    	      this.taskProperties = defaults.taskProperties;
    	      this.taskType = defaults.taskType;
        }

        public Builder setConnectorOperator(@Nullable Input<FlowConnectorOperatorArgs> connectorOperator) {
            this.connectorOperator = connectorOperator;
            return this;
        }

        public Builder setConnectorOperator(@Nullable FlowConnectorOperatorArgs connectorOperator) {
            this.connectorOperator = Input.ofNullable(connectorOperator);
            return this;
        }

        public Builder setDestinationField(@Nullable Input<String> destinationField) {
            this.destinationField = destinationField;
            return this;
        }

        public Builder setDestinationField(@Nullable String destinationField) {
            this.destinationField = Input.ofNullable(destinationField);
            return this;
        }

        public Builder setSourceFields(Input<List<String>> sourceFields) {
            this.sourceFields = Objects.requireNonNull(sourceFields);
            return this;
        }

        public Builder setSourceFields(List<String> sourceFields) {
            this.sourceFields = Input.of(Objects.requireNonNull(sourceFields));
            return this;
        }

        public Builder setTaskProperties(@Nullable Input<List<FlowTaskPropertiesObjectArgs>> taskProperties) {
            this.taskProperties = taskProperties;
            return this;
        }

        public Builder setTaskProperties(@Nullable List<FlowTaskPropertiesObjectArgs> taskProperties) {
            this.taskProperties = Input.ofNullable(taskProperties);
            return this;
        }

        public Builder setTaskType(Input<FlowTaskType> taskType) {
            this.taskType = Objects.requireNonNull(taskType);
            return this;
        }

        public Builder setTaskType(FlowTaskType taskType) {
            this.taskType = Input.of(Objects.requireNonNull(taskType));
            return this;
        }

        public FlowTaskArgs build() {
            return new FlowTaskArgs(connectorOperator, destinationField, sourceFields, taskProperties, taskType);
        }
    }
}