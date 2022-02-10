// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.genomics_v1alpha2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.genomics_v1alpha2.outputs.DockerExecutorResponse;
import io.pulumi.googlenative.genomics_v1alpha2.outputs.PipelineParameterResponse;
import io.pulumi.googlenative.genomics_v1alpha2.outputs.PipelineResourcesResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetPipelineResult {
    private final String description;
    private final DockerExecutorResponse docker;
    private final List<PipelineParameterResponse> inputParameters;
    private final String name;
    private final List<PipelineParameterResponse> outputParameters;
    private final String pipelineId;
    private final String project;
    private final PipelineResourcesResponse resources;

    @OutputCustomType.Constructor({"description","docker","inputParameters","name","outputParameters","pipelineId","project","resources"})
    private GetPipelineResult(
        String description,
        DockerExecutorResponse docker,
        List<PipelineParameterResponse> inputParameters,
        String name,
        List<PipelineParameterResponse> outputParameters,
        String pipelineId,
        String project,
        PipelineResourcesResponse resources) {
        this.description = Objects.requireNonNull(description);
        this.docker = Objects.requireNonNull(docker);
        this.inputParameters = Objects.requireNonNull(inputParameters);
        this.name = Objects.requireNonNull(name);
        this.outputParameters = Objects.requireNonNull(outputParameters);
        this.pipelineId = Objects.requireNonNull(pipelineId);
        this.project = Objects.requireNonNull(project);
        this.resources = Objects.requireNonNull(resources);
    }

    public String getDescription() {
        return this.description;
    }
    public DockerExecutorResponse getDocker() {
        return this.docker;
    }
    public List<PipelineParameterResponse> getInputParameters() {
        return this.inputParameters;
    }
    public String getName() {
        return this.name;
    }
    public List<PipelineParameterResponse> getOutputParameters() {
        return this.outputParameters;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }
    public String getProject() {
        return this.project;
    }
    public PipelineResourcesResponse getResources() {
        return this.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPipelineResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private DockerExecutorResponse docker;
        private List<PipelineParameterResponse> inputParameters;
        private String name;
        private List<PipelineParameterResponse> outputParameters;
        private String pipelineId;
        private String project;
        private PipelineResourcesResponse resources;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPipelineResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.docker = defaults.docker;
    	      this.inputParameters = defaults.inputParameters;
    	      this.name = defaults.name;
    	      this.outputParameters = defaults.outputParameters;
    	      this.pipelineId = defaults.pipelineId;
    	      this.project = defaults.project;
    	      this.resources = defaults.resources;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDocker(DockerExecutorResponse docker) {
            this.docker = Objects.requireNonNull(docker);
            return this;
        }

        public Builder setInputParameters(List<PipelineParameterResponse> inputParameters) {
            this.inputParameters = Objects.requireNonNull(inputParameters);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOutputParameters(List<PipelineParameterResponse> outputParameters) {
            this.outputParameters = Objects.requireNonNull(outputParameters);
            return this;
        }

        public Builder setPipelineId(String pipelineId) {
            this.pipelineId = Objects.requireNonNull(pipelineId);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setResources(PipelineResourcesResponse resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }

        public GetPipelineResult build() {
            return new GetPipelineResult(description, docker, inputParameters, name, outputParameters, pipelineId, project, resources);
        }
    }
}