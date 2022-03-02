// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datapipeline.outputs;

import io.pulumi.aws.datapipeline.outputs.GetPipelineDefinitionParameterObject;
import io.pulumi.aws.datapipeline.outputs.GetPipelineDefinitionParameterValue;
import io.pulumi.aws.datapipeline.outputs.GetPipelineDefinitionPipelineObject;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPipelineDefinitionResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Parameter objects used in the pipeline definition. See below
     * 
     */
    private final List<GetPipelineDefinitionParameterObject> parameterObjects;
    /**
     * Parameter values used in the pipeline definition. See below
     * 
     */
    private final @Nullable List<GetPipelineDefinitionParameterValue> parameterValues;
    private final String pipelineId;
    /**
     * Objects defined in the pipeline. See below
     * 
     */
    private final List<GetPipelineDefinitionPipelineObject> pipelineObjects;

    @OutputCustomType.Constructor({"id","parameterObjects","parameterValues","pipelineId","pipelineObjects"})
    private GetPipelineDefinitionResult(
        String id,
        List<GetPipelineDefinitionParameterObject> parameterObjects,
        @Nullable List<GetPipelineDefinitionParameterValue> parameterValues,
        String pipelineId,
        List<GetPipelineDefinitionPipelineObject> pipelineObjects) {
        this.id = Objects.requireNonNull(id);
        this.parameterObjects = Objects.requireNonNull(parameterObjects);
        this.parameterValues = parameterValues;
        this.pipelineId = Objects.requireNonNull(pipelineId);
        this.pipelineObjects = Objects.requireNonNull(pipelineObjects);
    }

    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Parameter objects used in the pipeline definition. See below
     * 
    */
    public List<GetPipelineDefinitionParameterObject> getParameterObjects() {
        return this.parameterObjects;
    }
    /**
     * Parameter values used in the pipeline definition. See below
     * 
    */
    public List<GetPipelineDefinitionParameterValue> getParameterValues() {
        return this.parameterValues == null ? List.of() : this.parameterValues;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }
    /**
     * Objects defined in the pipeline. See below
     * 
    */
    public List<GetPipelineDefinitionPipelineObject> getPipelineObjects() {
        return this.pipelineObjects;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPipelineDefinitionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<GetPipelineDefinitionParameterObject> parameterObjects;
        private @Nullable List<GetPipelineDefinitionParameterValue> parameterValues;
        private String pipelineId;
        private List<GetPipelineDefinitionPipelineObject> pipelineObjects;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPipelineDefinitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.parameterObjects = defaults.parameterObjects;
    	      this.parameterValues = defaults.parameterValues;
    	      this.pipelineId = defaults.pipelineId;
    	      this.pipelineObjects = defaults.pipelineObjects;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setParameterObjects(List<GetPipelineDefinitionParameterObject> parameterObjects) {
            this.parameterObjects = Objects.requireNonNull(parameterObjects);
            return this;
        }

        public Builder setParameterValues(@Nullable List<GetPipelineDefinitionParameterValue> parameterValues) {
            this.parameterValues = parameterValues;
            return this;
        }

        public Builder setPipelineId(String pipelineId) {
            this.pipelineId = Objects.requireNonNull(pipelineId);
            return this;
        }

        public Builder setPipelineObjects(List<GetPipelineDefinitionPipelineObject> pipelineObjects) {
            this.pipelineObjects = Objects.requireNonNull(pipelineObjects);
            return this;
        }
        public GetPipelineDefinitionResult build() {
            return new GetPipelineDefinitionResult(id, parameterObjects, parameterValues, pipelineId, pipelineObjects);
        }
    }
}
