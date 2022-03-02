// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.outputs;

import io.pulumi.azurenative.deploymentmanager.outputs.PrePostStepResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class StepGroupResponse {
    /**
     * The list of step group names on which this step group depends on.
     * 
     */
    private final @Nullable List<String> dependsOnStepGroups;
    /**
     * The resource Id of service unit to be deployed. The service unit should be from the service topology referenced in targetServiceTopologyId
     * 
     */
    private final String deploymentTargetId;
    /**
     * The name of the step group.
     * 
     */
    private final String name;
    /**
     * The list of steps to be run after deploying the target.
     * 
     */
    private final @Nullable List<PrePostStepResponse> postDeploymentSteps;
    /**
     * The list of steps to be run before deploying the target.
     * 
     */
    private final @Nullable List<PrePostStepResponse> preDeploymentSteps;

    @OutputCustomType.Constructor({"dependsOnStepGroups","deploymentTargetId","name","postDeploymentSteps","preDeploymentSteps"})
    private StepGroupResponse(
        @Nullable List<String> dependsOnStepGroups,
        String deploymentTargetId,
        String name,
        @Nullable List<PrePostStepResponse> postDeploymentSteps,
        @Nullable List<PrePostStepResponse> preDeploymentSteps) {
        this.dependsOnStepGroups = dependsOnStepGroups;
        this.deploymentTargetId = Objects.requireNonNull(deploymentTargetId);
        this.name = Objects.requireNonNull(name);
        this.postDeploymentSteps = postDeploymentSteps;
        this.preDeploymentSteps = preDeploymentSteps;
    }

    /**
     * The list of step group names on which this step group depends on.
     * 
    */
    public List<String> getDependsOnStepGroups() {
        return this.dependsOnStepGroups == null ? List.of() : this.dependsOnStepGroups;
    }
    /**
     * The resource Id of service unit to be deployed. The service unit should be from the service topology referenced in targetServiceTopologyId
     * 
    */
    public String getDeploymentTargetId() {
        return this.deploymentTargetId;
    }
    /**
     * The name of the step group.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The list of steps to be run after deploying the target.
     * 
    */
    public List<PrePostStepResponse> getPostDeploymentSteps() {
        return this.postDeploymentSteps == null ? List.of() : this.postDeploymentSteps;
    }
    /**
     * The list of steps to be run before deploying the target.
     * 
    */
    public List<PrePostStepResponse> getPreDeploymentSteps() {
        return this.preDeploymentSteps == null ? List.of() : this.preDeploymentSteps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StepGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> dependsOnStepGroups;
        private String deploymentTargetId;
        private String name;
        private @Nullable List<PrePostStepResponse> postDeploymentSteps;
        private @Nullable List<PrePostStepResponse> preDeploymentSteps;

        public Builder() {
    	      // Empty
        }

        public Builder(StepGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOnStepGroups = defaults.dependsOnStepGroups;
    	      this.deploymentTargetId = defaults.deploymentTargetId;
    	      this.name = defaults.name;
    	      this.postDeploymentSteps = defaults.postDeploymentSteps;
    	      this.preDeploymentSteps = defaults.preDeploymentSteps;
        }

        public Builder setDependsOnStepGroups(@Nullable List<String> dependsOnStepGroups) {
            this.dependsOnStepGroups = dependsOnStepGroups;
            return this;
        }

        public Builder setDeploymentTargetId(String deploymentTargetId) {
            this.deploymentTargetId = Objects.requireNonNull(deploymentTargetId);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPostDeploymentSteps(@Nullable List<PrePostStepResponse> postDeploymentSteps) {
            this.postDeploymentSteps = postDeploymentSteps;
            return this;
        }

        public Builder setPreDeploymentSteps(@Nullable List<PrePostStepResponse> preDeploymentSteps) {
            this.preDeploymentSteps = preDeploymentSteps;
            return this;
        }
        public StepGroupResponse build() {
            return new StepGroupResponse(dependsOnStepGroups, deploymentTargetId, name, postDeploymentSteps, preDeploymentSteps);
        }
    }
}
