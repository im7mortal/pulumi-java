// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.outputs.PipelineReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ExecutePipelineActivityResponse {
    /**
     * Activity depends on condition.
     * 
     */
    private final @Nullable List<ActivityDependencyResponse> dependsOn;
    /**
     * Activity description.
     * 
     */
    private final @Nullable String description;
    /**
     * Activity name.
     * 
     */
    private final String name;
    /**
     * Pipeline parameters.
     * 
     */
    private final @Nullable Map<String,Object> parameters;
    /**
     * Pipeline reference.
     * 
     */
    private final PipelineReferenceResponse pipeline;
    /**
     * Type of activity.
     * Expected value is 'ExecutePipeline'.
     * 
     */
    private final String type;
    /**
     * Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;
    /**
     * Defines whether activity execution will wait for the dependent pipeline execution to finish. Default is false.
     * 
     */
    private final @Nullable Boolean waitOnCompletion;

    @OutputCustomType.Constructor({"dependsOn","description","name","parameters","pipeline","type","userProperties","waitOnCompletion"})
    private ExecutePipelineActivityResponse(
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        String name,
        @Nullable Map<String,Object> parameters,
        PipelineReferenceResponse pipeline,
        String type,
        @Nullable List<UserPropertyResponse> userProperties,
        @Nullable Boolean waitOnCompletion) {
        this.dependsOn = dependsOn;
        this.description = description;
        this.name = Objects.requireNonNull(name);
        this.parameters = parameters;
        this.pipeline = Objects.requireNonNull(pipeline);
        this.type = Objects.requireNonNull(type);
        this.userProperties = userProperties;
        this.waitOnCompletion = waitOnCompletion;
    }

    /**
     * Activity depends on condition.
     * 
    */
    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    /**
     * Activity description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Activity name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Pipeline parameters.
     * 
    */
    public Map<String,Object> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Pipeline reference.
     * 
    */
    public PipelineReferenceResponse getPipeline() {
        return this.pipeline;
    }
    /**
     * Type of activity.
     * Expected value is 'ExecutePipeline'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Activity user properties.
     * 
    */
    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }
    /**
     * Defines whether activity execution will wait for the dependent pipeline execution to finish. Default is false.
     * 
    */
    public Optional<Boolean> getWaitOnCompletion() {
        return Optional.ofNullable(this.waitOnCompletion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecutePipelineActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private String name;
        private @Nullable Map<String,Object> parameters;
        private PipelineReferenceResponse pipeline;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;
        private @Nullable Boolean waitOnCompletion;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecutePipelineActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.pipeline = defaults.pipeline;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
    	      this.waitOnCompletion = defaults.waitOnCompletion;
        }

        public Builder setDependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(@Nullable Map<String,Object> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setPipeline(PipelineReferenceResponse pipeline) {
            this.pipeline = Objects.requireNonNull(pipeline);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public Builder setWaitOnCompletion(@Nullable Boolean waitOnCompletion) {
            this.waitOnCompletion = waitOnCompletion;
            return this;
        }
        public ExecutePipelineActivityResponse build() {
            return new ExecutePipelineActivityResponse(dependsOn, description, name, parameters, pipeline, type, userProperties, waitOnCompletion);
        }
    }
}
