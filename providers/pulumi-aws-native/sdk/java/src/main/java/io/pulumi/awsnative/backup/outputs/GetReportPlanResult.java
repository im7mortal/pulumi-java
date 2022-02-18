// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.outputs;

import io.pulumi.awsnative.backup.outputs.ReportDeliveryChannelProperties;
import io.pulumi.awsnative.backup.outputs.ReportPlanTag;
import io.pulumi.awsnative.backup.outputs.ReportSettingProperties;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetReportPlanResult {
    /**
     * A structure that contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your reports.
     * 
     */
    private final @Nullable ReportDeliveryChannelProperties reportDeliveryChannel;
    /**
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource type.
     * 
     */
    private final @Nullable String reportPlanArn;
    /**
     * An optional description of the report plan with a maximum of 1,024 characters.
     * 
     */
    private final @Nullable String reportPlanDescription;
    /**
     * Metadata that you can assign to help organize the report plans that you create. Each tag is a key-value pair.
     * 
     */
    private final @Nullable List<ReportPlanTag> reportPlanTags;
    /**
     * Identifies the report template for the report. Reports are built using a report template.
     * 
     */
    private final @Nullable ReportSettingProperties reportSetting;

    @OutputCustomType.Constructor({"reportDeliveryChannel","reportPlanArn","reportPlanDescription","reportPlanTags","reportSetting"})
    private GetReportPlanResult(
        @Nullable ReportDeliveryChannelProperties reportDeliveryChannel,
        @Nullable String reportPlanArn,
        @Nullable String reportPlanDescription,
        @Nullable List<ReportPlanTag> reportPlanTags,
        @Nullable ReportSettingProperties reportSetting) {
        this.reportDeliveryChannel = reportDeliveryChannel;
        this.reportPlanArn = reportPlanArn;
        this.reportPlanDescription = reportPlanDescription;
        this.reportPlanTags = reportPlanTags;
        this.reportSetting = reportSetting;
    }

    /**
     * A structure that contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your reports.
     * 
     */
    public Optional<ReportDeliveryChannelProperties> getReportDeliveryChannel() {
        return Optional.ofNullable(this.reportDeliveryChannel);
    }
    /**
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource type.
     * 
     */
    public Optional<String> getReportPlanArn() {
        return Optional.ofNullable(this.reportPlanArn);
    }
    /**
     * An optional description of the report plan with a maximum of 1,024 characters.
     * 
     */
    public Optional<String> getReportPlanDescription() {
        return Optional.ofNullable(this.reportPlanDescription);
    }
    /**
     * Metadata that you can assign to help organize the report plans that you create. Each tag is a key-value pair.
     * 
     */
    public List<ReportPlanTag> getReportPlanTags() {
        return this.reportPlanTags == null ? List.of() : this.reportPlanTags;
    }
    /**
     * Identifies the report template for the report. Reports are built using a report template.
     * 
     */
    public Optional<ReportSettingProperties> getReportSetting() {
        return Optional.ofNullable(this.reportSetting);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReportPlanResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ReportDeliveryChannelProperties reportDeliveryChannel;
        private @Nullable String reportPlanArn;
        private @Nullable String reportPlanDescription;
        private @Nullable List<ReportPlanTag> reportPlanTags;
        private @Nullable ReportSettingProperties reportSetting;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReportPlanResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.reportDeliveryChannel = defaults.reportDeliveryChannel;
    	      this.reportPlanArn = defaults.reportPlanArn;
    	      this.reportPlanDescription = defaults.reportPlanDescription;
    	      this.reportPlanTags = defaults.reportPlanTags;
    	      this.reportSetting = defaults.reportSetting;
        }

        public Builder setReportDeliveryChannel(@Nullable ReportDeliveryChannelProperties reportDeliveryChannel) {
            this.reportDeliveryChannel = reportDeliveryChannel;
            return this;
        }

        public Builder setReportPlanArn(@Nullable String reportPlanArn) {
            this.reportPlanArn = reportPlanArn;
            return this;
        }

        public Builder setReportPlanDescription(@Nullable String reportPlanDescription) {
            this.reportPlanDescription = reportPlanDescription;
            return this;
        }

        public Builder setReportPlanTags(@Nullable List<ReportPlanTag> reportPlanTags) {
            this.reportPlanTags = reportPlanTags;
            return this;
        }

        public Builder setReportSetting(@Nullable ReportSettingProperties reportSetting) {
            this.reportSetting = reportSetting;
            return this;
        }

        public GetReportPlanResult build() {
            return new GetReportPlanResult(reportDeliveryChannel, reportPlanArn, reportPlanDescription, reportPlanTags, reportSetting);
        }
    }
}
