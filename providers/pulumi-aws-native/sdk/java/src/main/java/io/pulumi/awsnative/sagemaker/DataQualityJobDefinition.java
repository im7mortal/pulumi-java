// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sagemaker.DataQualityJobDefinitionArgs;
import io.pulumi.awsnative.sagemaker.outputs.DataQualityJobDefinitionDataQualityAppSpecification;
import io.pulumi.awsnative.sagemaker.outputs.DataQualityJobDefinitionDataQualityBaselineConfig;
import io.pulumi.awsnative.sagemaker.outputs.DataQualityJobDefinitionDataQualityJobInput;
import io.pulumi.awsnative.sagemaker.outputs.DataQualityJobDefinitionMonitoringOutputConfig;
import io.pulumi.awsnative.sagemaker.outputs.DataQualityJobDefinitionMonitoringResources;
import io.pulumi.awsnative.sagemaker.outputs.DataQualityJobDefinitionNetworkConfig;
import io.pulumi.awsnative.sagemaker.outputs.DataQualityJobDefinitionStoppingCondition;
import io.pulumi.awsnative.sagemaker.outputs.DataQualityJobDefinitionTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::SageMaker::DataQualityJobDefinition
 * 
 */
@ResourceType(type="aws-native:sagemaker:DataQualityJobDefinition")
public class DataQualityJobDefinition extends io.pulumi.resources.CustomResource {
    /**
     * The time at which the job definition was created.
     * 
     */
    @OutputExport(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return The time at which the job definition was created.
     * 
     */
    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    @OutputExport(name="dataQualityAppSpecification", type=DataQualityJobDefinitionDataQualityAppSpecification.class, parameters={})
    private Output<DataQualityJobDefinitionDataQualityAppSpecification> dataQualityAppSpecification;

    public Output<DataQualityJobDefinitionDataQualityAppSpecification> getDataQualityAppSpecification() {
        return this.dataQualityAppSpecification;
    }
    @OutputExport(name="dataQualityBaselineConfig", type=DataQualityJobDefinitionDataQualityBaselineConfig.class, parameters={})
    private Output</* @Nullable */ DataQualityJobDefinitionDataQualityBaselineConfig> dataQualityBaselineConfig;

    public Output</* @Nullable */ DataQualityJobDefinitionDataQualityBaselineConfig> getDataQualityBaselineConfig() {
        return this.dataQualityBaselineConfig;
    }
    @OutputExport(name="dataQualityJobInput", type=DataQualityJobDefinitionDataQualityJobInput.class, parameters={})
    private Output<DataQualityJobDefinitionDataQualityJobInput> dataQualityJobInput;

    public Output<DataQualityJobDefinitionDataQualityJobInput> getDataQualityJobInput() {
        return this.dataQualityJobInput;
    }
    @OutputExport(name="dataQualityJobOutputConfig", type=DataQualityJobDefinitionMonitoringOutputConfig.class, parameters={})
    private Output<DataQualityJobDefinitionMonitoringOutputConfig> dataQualityJobOutputConfig;

    public Output<DataQualityJobDefinitionMonitoringOutputConfig> getDataQualityJobOutputConfig() {
        return this.dataQualityJobOutputConfig;
    }
    /**
     * The Amazon Resource Name (ARN) of job definition.
     * 
     */
    @OutputExport(name="jobDefinitionArn", type=String.class, parameters={})
    private Output<String> jobDefinitionArn;

    /**
     * @return The Amazon Resource Name (ARN) of job definition.
     * 
     */
    public Output<String> getJobDefinitionArn() {
        return this.jobDefinitionArn;
    }
    @OutputExport(name="jobDefinitionName", type=String.class, parameters={})
    private Output</* @Nullable */ String> jobDefinitionName;

    public Output</* @Nullable */ String> getJobDefinitionName() {
        return this.jobDefinitionName;
    }
    @OutputExport(name="jobResources", type=DataQualityJobDefinitionMonitoringResources.class, parameters={})
    private Output<DataQualityJobDefinitionMonitoringResources> jobResources;

    public Output<DataQualityJobDefinitionMonitoringResources> getJobResources() {
        return this.jobResources;
    }
    @OutputExport(name="networkConfig", type=DataQualityJobDefinitionNetworkConfig.class, parameters={})
    private Output</* @Nullable */ DataQualityJobDefinitionNetworkConfig> networkConfig;

    public Output</* @Nullable */ DataQualityJobDefinitionNetworkConfig> getNetworkConfig() {
        return this.networkConfig;
    }
    /**
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * 
     */
    @OutputExport(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * 
     */
    public Output<String> getRoleArn() {
        return this.roleArn;
    }
    @OutputExport(name="stoppingCondition", type=DataQualityJobDefinitionStoppingCondition.class, parameters={})
    private Output</* @Nullable */ DataQualityJobDefinitionStoppingCondition> stoppingCondition;

    public Output</* @Nullable */ DataQualityJobDefinitionStoppingCondition> getStoppingCondition() {
        return this.stoppingCondition;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={DataQualityJobDefinitionTag.class})
    private Output</* @Nullable */ List<DataQualityJobDefinitionTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<DataQualityJobDefinitionTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(DataQualityJobDefinitionArgs.Builder a);
    }
    private static io.pulumi.awsnative.sagemaker.DataQualityJobDefinitionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.sagemaker.DataQualityJobDefinitionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DataQualityJobDefinition(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataQualityJobDefinition(String name) {
        this(name, DataQualityJobDefinitionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataQualityJobDefinition(String name, DataQualityJobDefinitionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataQualityJobDefinition(String name, DataQualityJobDefinitionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:DataQualityJobDefinition", name, args == null ? DataQualityJobDefinitionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DataQualityJobDefinition(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:DataQualityJobDefinition", name, null, makeResourceOptions(options, id));
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
    public static DataQualityJobDefinition get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DataQualityJobDefinition(name, id, options);
    }
}
