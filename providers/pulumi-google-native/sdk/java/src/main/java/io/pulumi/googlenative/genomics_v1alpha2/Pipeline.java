// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.genomics_v1alpha2;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.genomics_v1alpha2.PipelineArgs;
import io.pulumi.googlenative.genomics_v1alpha2.outputs.DockerExecutorResponse;
import io.pulumi.googlenative.genomics_v1alpha2.outputs.PipelineParameterResponse;
import io.pulumi.googlenative.genomics_v1alpha2.outputs.PipelineResourcesResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a pipeline that can be run later. Create takes a Pipeline that has all fields other than `pipelineId` populated, and then returns the same pipeline with `pipelineId` populated. This id can be used to run the pipeline. Caller must have WRITE permission to the project.
 * 
 */
@ResourceType(type="google-native:genomics/v1alpha2:Pipeline")
public class Pipeline extends io.pulumi.resources.CustomResource {
    /**
     * User-specified description.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return User-specified description.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Specifies the docker run information.
     * 
     */
    @OutputExport(name="docker", type=DockerExecutorResponse.class, parameters={})
    private Output<DockerExecutorResponse> docker;

    /**
     * @return Specifies the docker run information.
     * 
     */
    public Output<DockerExecutorResponse> getDocker() {
        return this.docker;
    }
    /**
     * Input parameters of the pipeline.
     * 
     */
    @OutputExport(name="inputParameters", type=List.class, parameters={PipelineParameterResponse.class})
    private Output<List<PipelineParameterResponse>> inputParameters;

    /**
     * @return Input parameters of the pipeline.
     * 
     */
    public Output<List<PipelineParameterResponse>> getInputParameters() {
        return this.inputParameters;
    }
    /**
     * A user specified pipeline name that does not have to be unique. This name can be used for filtering Pipelines in ListPipelines.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A user specified pipeline name that does not have to be unique. This name can be used for filtering Pipelines in ListPipelines.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Output parameters of the pipeline.
     * 
     */
    @OutputExport(name="outputParameters", type=List.class, parameters={PipelineParameterResponse.class})
    private Output<List<PipelineParameterResponse>> outputParameters;

    /**
     * @return Output parameters of the pipeline.
     * 
     */
    public Output<List<PipelineParameterResponse>> getOutputParameters() {
        return this.outputParameters;
    }
    /**
     * Unique pipeline id that is generated by the service when CreatePipeline is called. Cannot be specified in the Pipeline used in the CreatePipelineRequest, and will be populated in the response to CreatePipeline and all subsequent Get and List calls. Indicates that the service has registered this pipeline.
     * 
     */
    @OutputExport(name="pipelineId", type=String.class, parameters={})
    private Output<String> pipelineId;

    /**
     * @return Unique pipeline id that is generated by the service when CreatePipeline is called. Cannot be specified in the Pipeline used in the CreatePipelineRequest, and will be populated in the response to CreatePipeline and all subsequent Get and List calls. Indicates that the service has registered this pipeline.
     * 
     */
    public Output<String> getPipelineId() {
        return this.pipelineId;
    }
    /**
     * The project in which to create the pipeline. The caller must have WRITE access.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project in which to create the pipeline. The caller must have WRITE access.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Specifies resource requirements for the pipeline run. Required fields: * minimumCpuCores * minimumRamGb
     * 
     */
    @OutputExport(name="resources", type=PipelineResourcesResponse.class, parameters={})
    private Output<PipelineResourcesResponse> resources;

    /**
     * @return Specifies resource requirements for the pipeline run. Required fields: * minimumCpuCores * minimumRamGb
     * 
     */
    public Output<PipelineResourcesResponse> getResources() {
        return this.resources;
    }

    public interface BuilderApplicator {
        public void apply(PipelineArgs.Builder a);
    }
    private static io.pulumi.googlenative.genomics_v1alpha2.PipelineArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.genomics_v1alpha2.PipelineArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Pipeline(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Pipeline(String name) {
        this(name, PipelineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Pipeline(String name, PipelineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Pipeline(String name, PipelineArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:genomics/v1alpha2:Pipeline", name, args == null ? PipelineArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Pipeline(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:genomics/v1alpha2:Pipeline", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Pipeline get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Pipeline(name, id, options);
    }
}
