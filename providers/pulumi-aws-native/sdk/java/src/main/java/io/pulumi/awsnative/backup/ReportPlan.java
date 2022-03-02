// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.backup.ReportPlanArgs;
import io.pulumi.awsnative.backup.outputs.ReportDeliveryChannelProperties;
import io.pulumi.awsnative.backup.outputs.ReportPlanTag;
import io.pulumi.awsnative.backup.outputs.ReportSettingProperties;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Contains detailed information about a report plan in AWS Backup Audit Manager.
 * 
 */
@ResourceType(type="aws-native:backup:ReportPlan")
public class ReportPlan extends io.pulumi.resources.CustomResource {
    /**
     * A structure that contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your reports.
     * 
     */
    @OutputExport(name="reportDeliveryChannel", type=ReportDeliveryChannelProperties.class, parameters={})
    private Output<ReportDeliveryChannelProperties> reportDeliveryChannel;

    /**
     * @return A structure that contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your reports.
     * 
     */
    public Output<ReportDeliveryChannelProperties> getReportDeliveryChannel() {
        return this.reportDeliveryChannel;
    }
    /**
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource type.
     * 
     */
    @OutputExport(name="reportPlanArn", type=String.class, parameters={})
    private Output<String> reportPlanArn;

    /**
     * @return An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource type.
     * 
     */
    public Output<String> getReportPlanArn() {
        return this.reportPlanArn;
    }
    /**
     * An optional description of the report plan with a maximum of 1,024 characters.
     * 
     */
    @OutputExport(name="reportPlanDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> reportPlanDescription;

    /**
     * @return An optional description of the report plan with a maximum of 1,024 characters.
     * 
     */
    public Output</* @Nullable */ String> getReportPlanDescription() {
        return this.reportPlanDescription;
    }
    /**
     * The unique name of the report plan. The name must be between 1 and 256 characters, starting with a letter, and consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * 
     */
    @OutputExport(name="reportPlanName", type=String.class, parameters={})
    private Output</* @Nullable */ String> reportPlanName;

    /**
     * @return The unique name of the report plan. The name must be between 1 and 256 characters, starting with a letter, and consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * 
     */
    public Output</* @Nullable */ String> getReportPlanName() {
        return this.reportPlanName;
    }
    /**
     * Metadata that you can assign to help organize the report plans that you create. Each tag is a key-value pair.
     * 
     */
    @OutputExport(name="reportPlanTags", type=List.class, parameters={ReportPlanTag.class})
    private Output</* @Nullable */ List<ReportPlanTag>> reportPlanTags;

    /**
     * @return Metadata that you can assign to help organize the report plans that you create. Each tag is a key-value pair.
     * 
     */
    public Output</* @Nullable */ List<ReportPlanTag>> getReportPlanTags() {
        return this.reportPlanTags;
    }
    /**
     * Identifies the report template for the report. Reports are built using a report template.
     * 
     */
    @OutputExport(name="reportSetting", type=ReportSettingProperties.class, parameters={})
    private Output<ReportSettingProperties> reportSetting;

    /**
     * @return Identifies the report template for the report. Reports are built using a report template.
     * 
     */
    public Output<ReportSettingProperties> getReportSetting() {
        return this.reportSetting;
    }

    public interface BuilderApplicator {
        public void apply(ReportPlanArgs.Builder a);
    }
    private static io.pulumi.awsnative.backup.ReportPlanArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.backup.ReportPlanArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ReportPlan(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReportPlan(String name) {
        this(name, ReportPlanArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReportPlan(String name, ReportPlanArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReportPlan(String name, ReportPlanArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:backup:ReportPlan", name, args == null ? ReportPlanArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ReportPlan(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:backup:ReportPlan", name, null, makeResourceOptions(options, id));
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
    public static ReportPlan get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ReportPlan(name, id, options);
    }
}
