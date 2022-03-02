// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.quicksight.AnalysisArgs;
import io.pulumi.awsnative.quicksight.enums.AnalysisResourceStatus;
import io.pulumi.awsnative.quicksight.outputs.AnalysisError;
import io.pulumi.awsnative.quicksight.outputs.AnalysisParameters;
import io.pulumi.awsnative.quicksight.outputs.AnalysisResourcePermission;
import io.pulumi.awsnative.quicksight.outputs.AnalysisSheet;
import io.pulumi.awsnative.quicksight.outputs.AnalysisSourceEntity;
import io.pulumi.awsnative.quicksight.outputs.AnalysisTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Definition of the AWS::QuickSight::Analysis Resource Type.
 * 
 */
@ResourceType(type="aws-native:quicksight:Analysis")
public class Analysis extends io.pulumi.resources.CustomResource {
    @OutputExport(name="analysisId", type=String.class, parameters={})
    private Output<String> analysisId;

    public Output<String> getAnalysisId() {
        return this.analysisId;
    }
    /**
     * <p>The Amazon Resource Name (ARN) of the analysis.</p>
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return <p>The Amazon Resource Name (ARN) of the analysis.</p>
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="awsAccountId", type=String.class, parameters={})
    private Output<String> awsAccountId;

    public Output<String> getAwsAccountId() {
        return this.awsAccountId;
    }
    /**
     * <p>The time that the analysis was created.</p>
     * 
     */
    @OutputExport(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return <p>The time that the analysis was created.</p>
     * 
     */
    public Output<String> getCreatedTime() {
        return this.createdTime;
    }
    /**
     * <p>The ARNs of the datasets of the analysis.</p>
     * 
     */
    @OutputExport(name="dataSetArns", type=List.class, parameters={String.class})
    private Output<List<String>> dataSetArns;

    /**
     * @return <p>The ARNs of the datasets of the analysis.</p>
     * 
     */
    public Output<List<String>> getDataSetArns() {
        return this.dataSetArns;
    }
    /**
     * <p>Errors associated with the analysis.</p>
     * 
     */
    @OutputExport(name="errors", type=List.class, parameters={AnalysisError.class})
    private Output</* @Nullable */ List<AnalysisError>> errors;

    /**
     * @return <p>Errors associated with the analysis.</p>
     * 
     */
    public Output</* @Nullable */ List<AnalysisError>> getErrors() {
        return this.errors;
    }
    /**
     * <p>The time that the analysis was last updated.</p>
     * 
     */
    @OutputExport(name="lastUpdatedTime", type=String.class, parameters={})
    private Output<String> lastUpdatedTime;

    /**
     * @return <p>The time that the analysis was last updated.</p>
     * 
     */
    public Output<String> getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }
    /**
     * <p>The descriptive name of the analysis.</p>
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return <p>The descriptive name of the analysis.</p>
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    @OutputExport(name="parameters", type=AnalysisParameters.class, parameters={})
    private Output</* @Nullable */ AnalysisParameters> parameters;

    public Output</* @Nullable */ AnalysisParameters> getParameters() {
        return this.parameters;
    }
    /**
     * <p>A structure that describes the principals and the resource-level permissions on an
     *             analysis. You can use the <code>Permissions</code> structure to grant permissions by
     *             providing a list of AWS Identity and Access Management (IAM) action information for each
     *             principal listed by Amazon Resource Name (ARN). </p>
     * 
     *         <p>To specify no permissions, omit <code>Permissions</code>.</p>
     * 
     */
    @OutputExport(name="permissions", type=List.class, parameters={AnalysisResourcePermission.class})
    private Output</* @Nullable */ List<AnalysisResourcePermission>> permissions;

    /**
     * @return <p>A structure that describes the principals and the resource-level permissions on an
     *             analysis. You can use the <code>Permissions</code> structure to grant permissions by
     *             providing a list of AWS Identity and Access Management (IAM) action information for each
     *             principal listed by Amazon Resource Name (ARN). </p>
     * 
     *         <p>To specify no permissions, omit <code>Permissions</code>.</p>
     * 
     */
    public Output</* @Nullable */ List<AnalysisResourcePermission>> getPermissions() {
        return this.permissions;
    }
    /**
     * <p>A list of the associated sheets with the unique identifier and name of each sheet.</p>
     * 
     */
    @OutputExport(name="sheets", type=List.class, parameters={AnalysisSheet.class})
    private Output<List<AnalysisSheet>> sheets;

    /**
     * @return <p>A list of the associated sheets with the unique identifier and name of each sheet.</p>
     * 
     */
    public Output<List<AnalysisSheet>> getSheets() {
        return this.sheets;
    }
    @OutputExport(name="sourceEntity", type=AnalysisSourceEntity.class, parameters={})
    private Output<AnalysisSourceEntity> sourceEntity;

    public Output<AnalysisSourceEntity> getSourceEntity() {
        return this.sourceEntity;
    }
    @OutputExport(name="status", type=AnalysisResourceStatus.class, parameters={})
    private Output<AnalysisResourceStatus> status;

    public Output<AnalysisResourceStatus> getStatus() {
        return this.status;
    }
    /**
     * <p>Contains a map of the key-value pairs for the resource tag or tags assigned to the
     *             analysis.</p>
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={AnalysisTag.class})
    private Output</* @Nullable */ List<AnalysisTag>> tags;

    /**
     * @return <p>Contains a map of the key-value pairs for the resource tag or tags assigned to the
     *             analysis.</p>
     * 
     */
    public Output</* @Nullable */ List<AnalysisTag>> getTags() {
        return this.tags;
    }
    /**
     * <p>The ARN of the theme of the analysis.</p>
     * 
     */
    @OutputExport(name="themeArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> themeArn;

    /**
     * @return <p>The ARN of the theme of the analysis.</p>
     * 
     */
    public Output</* @Nullable */ String> getThemeArn() {
        return this.themeArn;
    }

    public interface BuilderApplicator {
        public void apply(AnalysisArgs.Builder a);
    }
    private static io.pulumi.awsnative.quicksight.AnalysisArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.quicksight.AnalysisArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Analysis(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Analysis(String name) {
        this(name, AnalysisArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Analysis(String name, AnalysisArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Analysis(String name, AnalysisArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:quicksight:Analysis", name, args == null ? AnalysisArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Analysis(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:quicksight:Analysis", name, null, makeResourceOptions(options, id));
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
    public static Analysis get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Analysis(name, id, options);
    }
}
