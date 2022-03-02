// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.AmlTokenResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.BanditPolicyResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.ComputeConfigurationResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.JobEndpointResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.JobOutputResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.ManagedIdentityResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.MedianStoppingPolicyResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.ObjectiveResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.TrialComponentResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.TruncationSelectionPolicyResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SweepJobResponse {
    /**
     * Type of the hyperparameter sampling algorithms
     * 
     */
    private final String algorithm;
    /**
     * Compute binding for the job.
     * 
     */
    private final ComputeConfigurationResponse compute;
    /**
     * The asset description text.
     * 
     */
    private final @Nullable String description;
    /**
     * Early termination policies enable canceling poor-performing runs before they complete.
     * 
     */
    private final @Nullable Object earlyTermination;
    /**
     * The name of the experiment the job belongs to. If not set, the job is placed in the "Default" experiment.
     * 
     */
    private final @Nullable String experimentName;
    /**
     * Identity configuration. If set, this should be one of AmlToken, ManagedIdentity or null.
     * Defaults to AmlToken if null.
     * 
     */
    private final @Nullable Either<AmlTokenResponse,ManagedIdentityResponse> identity;
    /**
     * List of JobEndpoints.
     * For local jobs, a job endpoint will have an endpoint value of FileStreamObject.
     * 
     */
    private final Map<String,JobEndpointResponse> interactionEndpoints;
    /**
     * Enum to determine the type of job.
     * Expected value is 'Sweep'.
     * 
     */
    private final String jobType;
    /**
     * An upper bound on the number of trials performed in parallel.
     * 
     */
    private final @Nullable Integer maxConcurrentTrials;
    /**
     * An upper bound on the number of trials to perform.
     * 
     */
    private final @Nullable Integer maxTotalTrials;
    /**
     * Optimization objective.
     * 
     */
    private final ObjectiveResponse objective;
    /**
     * Location of the job output logs and artifacts.
     * 
     */
    private final JobOutputResponse output;
    /**
     * Job priority for scheduling policy. Only applies to AMLCompute.
     * Private preview feature and only available to users on the allow list.
     * 
     */
    private final @Nullable Integer priority;
    /**
     * The asset property dictionary.
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * Specifies the job provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * A dictionary containing each parameter and its distribution. The dictionary key is the name of the parameter
     * 
     */
    private final Map<String,Object> searchSpace;
    /**
     * The status of a job.
     * 
     */
    private final String status;
    /**
     * Tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The total timeout in ISO 8601 format. Only supports duration with precision as low as Minutes.
     * 
     */
    private final @Nullable String timeout;
    /**
     * Trial component definition.
     * 
     */
    private final @Nullable TrialComponentResponse trial;

    @OutputCustomType.Constructor({"algorithm","compute","description","earlyTermination","experimentName","identity","interactionEndpoints","jobType","maxConcurrentTrials","maxTotalTrials","objective","output","priority","properties","provisioningState","searchSpace","status","tags","timeout","trial"})
    private SweepJobResponse(
        String algorithm,
        ComputeConfigurationResponse compute,
        @Nullable String description,
        @Nullable Object earlyTermination,
        @Nullable String experimentName,
        @Nullable Either<AmlTokenResponse,ManagedIdentityResponse> identity,
        Map<String,JobEndpointResponse> interactionEndpoints,
        String jobType,
        @Nullable Integer maxConcurrentTrials,
        @Nullable Integer maxTotalTrials,
        ObjectiveResponse objective,
        JobOutputResponse output,
        @Nullable Integer priority,
        @Nullable Map<String,String> properties,
        String provisioningState,
        Map<String,Object> searchSpace,
        String status,
        @Nullable Map<String,String> tags,
        @Nullable String timeout,
        @Nullable TrialComponentResponse trial) {
        this.algorithm = Objects.requireNonNull(algorithm);
        this.compute = Objects.requireNonNull(compute);
        this.description = description;
        this.earlyTermination = earlyTermination;
        this.experimentName = experimentName;
        this.identity = identity;
        this.interactionEndpoints = Objects.requireNonNull(interactionEndpoints);
        this.jobType = Objects.requireNonNull(jobType);
        this.maxConcurrentTrials = maxConcurrentTrials;
        this.maxTotalTrials = maxTotalTrials;
        this.objective = Objects.requireNonNull(objective);
        this.output = Objects.requireNonNull(output);
        this.priority = priority;
        this.properties = properties;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.searchSpace = Objects.requireNonNull(searchSpace);
        this.status = Objects.requireNonNull(status);
        this.tags = tags;
        this.timeout = timeout;
        this.trial = trial;
    }

    /**
     * Type of the hyperparameter sampling algorithms
     * 
    */
    public String getAlgorithm() {
        return this.algorithm;
    }
    /**
     * Compute binding for the job.
     * 
    */
    public ComputeConfigurationResponse getCompute() {
        return this.compute;
    }
    /**
     * The asset description text.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Early termination policies enable canceling poor-performing runs before they complete.
     * 
    */
    public Optional<Object> getEarlyTermination() {
        return Optional.ofNullable(this.earlyTermination);
    }
    /**
     * The name of the experiment the job belongs to. If not set, the job is placed in the "Default" experiment.
     * 
    */
    public Optional<String> getExperimentName() {
        return Optional.ofNullable(this.experimentName);
    }
    /**
     * Identity configuration. If set, this should be one of AmlToken, ManagedIdentity or null.
     * Defaults to AmlToken if null.
     * 
    */
    public Optional<Either<AmlTokenResponse,ManagedIdentityResponse>> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * List of JobEndpoints.
     * For local jobs, a job endpoint will have an endpoint value of FileStreamObject.
     * 
    */
    public Map<String,JobEndpointResponse> getInteractionEndpoints() {
        return this.interactionEndpoints;
    }
    /**
     * Enum to determine the type of job.
     * Expected value is 'Sweep'.
     * 
    */
    public String getJobType() {
        return this.jobType;
    }
    /**
     * An upper bound on the number of trials performed in parallel.
     * 
    */
    public Optional<Integer> getMaxConcurrentTrials() {
        return Optional.ofNullable(this.maxConcurrentTrials);
    }
    /**
     * An upper bound on the number of trials to perform.
     * 
    */
    public Optional<Integer> getMaxTotalTrials() {
        return Optional.ofNullable(this.maxTotalTrials);
    }
    /**
     * Optimization objective.
     * 
    */
    public ObjectiveResponse getObjective() {
        return this.objective;
    }
    /**
     * Location of the job output logs and artifacts.
     * 
    */
    public JobOutputResponse getOutput() {
        return this.output;
    }
    /**
     * Job priority for scheduling policy. Only applies to AMLCompute.
     * Private preview feature and only available to users on the allow list.
     * 
    */
    public Optional<Integer> getPriority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * The asset property dictionary.
     * 
    */
    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * Specifies the job provisioning state.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * A dictionary containing each parameter and its distribution. The dictionary key is the name of the parameter
     * 
    */
    public Map<String,Object> getSearchSpace() {
        return this.searchSpace;
    }
    /**
     * The status of a job.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Tag dictionary. Tags can be added, removed, and updated.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The total timeout in ISO 8601 format. Only supports duration with precision as low as Minutes.
     * 
    */
    public Optional<String> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * Trial component definition.
     * 
    */
    public Optional<TrialComponentResponse> getTrial() {
        return Optional.ofNullable(this.trial);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SweepJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String algorithm;
        private ComputeConfigurationResponse compute;
        private @Nullable String description;
        private @Nullable Object earlyTermination;
        private @Nullable String experimentName;
        private @Nullable Either<AmlTokenResponse,ManagedIdentityResponse> identity;
        private Map<String,JobEndpointResponse> interactionEndpoints;
        private String jobType;
        private @Nullable Integer maxConcurrentTrials;
        private @Nullable Integer maxTotalTrials;
        private ObjectiveResponse objective;
        private JobOutputResponse output;
        private @Nullable Integer priority;
        private @Nullable Map<String,String> properties;
        private String provisioningState;
        private Map<String,Object> searchSpace;
        private String status;
        private @Nullable Map<String,String> tags;
        private @Nullable String timeout;
        private @Nullable TrialComponentResponse trial;

        public Builder() {
    	      // Empty
        }

        public Builder(SweepJobResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.compute = defaults.compute;
    	      this.description = defaults.description;
    	      this.earlyTermination = defaults.earlyTermination;
    	      this.experimentName = defaults.experimentName;
    	      this.identity = defaults.identity;
    	      this.interactionEndpoints = defaults.interactionEndpoints;
    	      this.jobType = defaults.jobType;
    	      this.maxConcurrentTrials = defaults.maxConcurrentTrials;
    	      this.maxTotalTrials = defaults.maxTotalTrials;
    	      this.objective = defaults.objective;
    	      this.output = defaults.output;
    	      this.priority = defaults.priority;
    	      this.properties = defaults.properties;
    	      this.provisioningState = defaults.provisioningState;
    	      this.searchSpace = defaults.searchSpace;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
    	      this.trial = defaults.trial;
        }

        public Builder setAlgorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }

        public Builder setCompute(ComputeConfigurationResponse compute) {
            this.compute = Objects.requireNonNull(compute);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEarlyTermination(@Nullable Object earlyTermination) {
            this.earlyTermination = earlyTermination;
            return this;
        }

        public Builder setExperimentName(@Nullable String experimentName) {
            this.experimentName = experimentName;
            return this;
        }

        public Builder setIdentity(@Nullable Either<AmlTokenResponse,ManagedIdentityResponse> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setInteractionEndpoints(Map<String,JobEndpointResponse> interactionEndpoints) {
            this.interactionEndpoints = Objects.requireNonNull(interactionEndpoints);
            return this;
        }

        public Builder setJobType(String jobType) {
            this.jobType = Objects.requireNonNull(jobType);
            return this;
        }

        public Builder setMaxConcurrentTrials(@Nullable Integer maxConcurrentTrials) {
            this.maxConcurrentTrials = maxConcurrentTrials;
            return this;
        }

        public Builder setMaxTotalTrials(@Nullable Integer maxTotalTrials) {
            this.maxTotalTrials = maxTotalTrials;
            return this;
        }

        public Builder setObjective(ObjectiveResponse objective) {
            this.objective = Objects.requireNonNull(objective);
            return this;
        }

        public Builder setOutput(JobOutputResponse output) {
            this.output = Objects.requireNonNull(output);
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSearchSpace(Map<String,Object> searchSpace) {
            this.searchSpace = Objects.requireNonNull(searchSpace);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTimeout(@Nullable String timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTrial(@Nullable TrialComponentResponse trial) {
            this.trial = trial;
            return this;
        }
        public SweepJobResponse build() {
            return new SweepJobResponse(algorithm, compute, description, earlyTermination, experimentName, identity, interactionEndpoints, jobType, maxConcurrentTrials, maxTotalTrials, objective, output, priority, properties, provisioningState, searchSpace, status, tags, timeout, trial);
        }
    }
}
