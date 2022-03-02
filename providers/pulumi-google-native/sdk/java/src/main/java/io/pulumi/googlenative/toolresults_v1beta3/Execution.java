// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.toolresults_v1beta3.ExecutionArgs;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.MatrixDimensionDefinitionResponse;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.OutcomeResponse;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.SpecificationResponse;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.TimestampResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates an Execution. The returned Execution will have the id set. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the containing History does not exist
 * Auto-naming is currently not supported for this resource.
 * Note - this resource's API doesn't support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:toolresults/v1beta3:Execution")
public class Execution extends io.pulumi.resources.CustomResource {
    /**
     * The time when the Execution status transitioned to COMPLETE. This value will be set automatically when state transitions to COMPLETE. - In response: set if the execution state is COMPLETE. - In create/update request: never set
     * 
     */
    @OutputExport(name="completionTime", type=TimestampResponse.class, parameters={})
    private Output<TimestampResponse> completionTime;

    /**
     * @return The time when the Execution status transitioned to COMPLETE. This value will be set automatically when state transitions to COMPLETE. - In response: set if the execution state is COMPLETE. - In create/update request: never set
     * 
     */
    public Output<TimestampResponse> getCompletionTime() {
        return this.completionTime;
    }
    /**
     * The time when the Execution was created. This value will be set automatically when CreateExecution is called. - In response: always set - In create/update request: never set
     * 
     */
    @OutputExport(name="creationTime", type=TimestampResponse.class, parameters={})
    private Output<TimestampResponse> creationTime;

    /**
     * @return The time when the Execution was created. This value will be set automatically when CreateExecution is called. - In response: always set - In create/update request: never set
     * 
     */
    public Output<TimestampResponse> getCreationTime() {
        return this.creationTime;
    }
    /**
     * The dimensions along which different steps in this execution may vary. This must remain fixed over the life of the execution. Returns INVALID_ARGUMENT if this field is set in an update request. Returns INVALID_ARGUMENT if the same name occurs in more than one dimension_definition. Returns INVALID_ARGUMENT if the size of the list is over 100. - In response: present if set by create - In create request: optional - In update request: never set
     * 
     */
    @OutputExport(name="dimensionDefinitions", type=List.class, parameters={MatrixDimensionDefinitionResponse.class})
    private Output<List<MatrixDimensionDefinitionResponse>> dimensionDefinitions;

    /**
     * @return The dimensions along which different steps in this execution may vary. This must remain fixed over the life of the execution. Returns INVALID_ARGUMENT if this field is set in an update request. Returns INVALID_ARGUMENT if the same name occurs in more than one dimension_definition. Returns INVALID_ARGUMENT if the size of the list is over 100. - In response: present if set by create - In create request: optional - In update request: never set
     * 
     */
    public Output<List<MatrixDimensionDefinitionResponse>> getDimensionDefinitions() {
        return this.dimensionDefinitions;
    }
    /**
     * A unique identifier within a History for this Execution. Returns INVALID_ARGUMENT if this field is set or overwritten by the caller. - In response always set - In create/update request: never set
     * 
     */
    @OutputExport(name="executionId", type=String.class, parameters={})
    private Output<String> executionId;

    /**
     * @return A unique identifier within a History for this Execution. Returns INVALID_ARGUMENT if this field is set or overwritten by the caller. - In response always set - In create/update request: never set
     * 
     */
    public Output<String> getExecutionId() {
        return this.executionId;
    }
    /**
     * Classify the result, for example into SUCCESS or FAILURE - In response: present if set by create/update request - In create/update request: optional
     * 
     */
    @OutputExport(name="outcome", type=OutcomeResponse.class, parameters={})
    private Output<OutcomeResponse> outcome;

    /**
     * @return Classify the result, for example into SUCCESS or FAILURE - In response: present if set by create/update request - In create/update request: optional
     * 
     */
    public Output<OutcomeResponse> getOutcome() {
        return this.outcome;
    }
    /**
     * Lightweight information about execution request. - In response: present if set by create - In create: optional - In update: optional
     * 
     */
    @OutputExport(name="specification", type=SpecificationResponse.class, parameters={})
    private Output<SpecificationResponse> specification;

    /**
     * @return Lightweight information about execution request. - In response: present if set by create - In create: optional - In update: optional
     * 
     */
    public Output<SpecificationResponse> getSpecification() {
        return this.specification;
    }
    /**
     * The initial state is IN_PROGRESS. The only legal state transitions is from IN_PROGRESS to COMPLETE. A PRECONDITION_FAILED will be returned if an invalid transition is requested. The state can only be set to COMPLETE once. A FAILED_PRECONDITION will be returned if the state is set to COMPLETE multiple times. If the state is set to COMPLETE, all the in-progress steps within the execution will be set as COMPLETE. If the outcome of the step is not set, the outcome will be set to INCONCLUSIVE. - In response always set - In create/update request: optional
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The initial state is IN_PROGRESS. The only legal state transitions is from IN_PROGRESS to COMPLETE. A PRECONDITION_FAILED will be returned if an invalid transition is requested. The state can only be set to COMPLETE once. A FAILED_PRECONDITION will be returned if the state is set to COMPLETE multiple times. If the state is set to COMPLETE, all the in-progress steps within the execution will be set as COMPLETE. If the outcome of the step is not set, the outcome will be set to INCONCLUSIVE. - In response always set - In create/update request: optional
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * TestExecution Matrix ID that the TestExecutionService uses. - In response: present if set by create - In create: optional - In update: never set
     * 
     */
    @OutputExport(name="testExecutionMatrixId", type=String.class, parameters={})
    private Output<String> testExecutionMatrixId;

    /**
     * @return TestExecution Matrix ID that the TestExecutionService uses. - In response: present if set by create - In create: optional - In update: never set
     * 
     */
    public Output<String> getTestExecutionMatrixId() {
        return this.testExecutionMatrixId;
    }

    public interface BuilderApplicator {
        public void apply(ExecutionArgs.Builder a);
    }
    private static io.pulumi.googlenative.toolresults_v1beta3.ExecutionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.toolresults_v1beta3.ExecutionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Execution(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Execution(String name) {
        this(name, ExecutionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Execution(String name, ExecutionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Execution(String name, ExecutionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:toolresults/v1beta3:Execution", name, args == null ? ExecutionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Execution(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:toolresults/v1beta3:Execution", name, null, makeResourceOptions(options, id));
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
    public static Execution get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Execution(name, id, options);
    }
}
