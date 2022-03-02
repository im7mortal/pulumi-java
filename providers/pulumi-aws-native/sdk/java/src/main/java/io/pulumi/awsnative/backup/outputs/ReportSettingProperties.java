// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ReportSettingProperties {
    /**
     * The Amazon Resource Names (ARNs) of the frameworks a report covers.
     * 
     */
    private final @Nullable List<String> frameworkArns;
    /**
     * Identifies the report template for the report. Reports are built using a report template. The report templates are: `BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT`
     * 
     */
    private final String reportTemplate;

    @OutputCustomType.Constructor({"frameworkArns","reportTemplate"})
    private ReportSettingProperties(
        @Nullable List<String> frameworkArns,
        String reportTemplate) {
        this.frameworkArns = frameworkArns;
        this.reportTemplate = Objects.requireNonNull(reportTemplate);
    }

    /**
     * The Amazon Resource Names (ARNs) of the frameworks a report covers.
     * 
    */
    public List<String> getFrameworkArns() {
        return this.frameworkArns == null ? List.of() : this.frameworkArns;
    }
    /**
     * Identifies the report template for the report. Reports are built using a report template. The report templates are: `BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT`
     * 
    */
    public String getReportTemplate() {
        return this.reportTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportSettingProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> frameworkArns;
        private String reportTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportSettingProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frameworkArns = defaults.frameworkArns;
    	      this.reportTemplate = defaults.reportTemplate;
        }

        public Builder setFrameworkArns(@Nullable List<String> frameworkArns) {
            this.frameworkArns = frameworkArns;
            return this;
        }

        public Builder setReportTemplate(String reportTemplate) {
            this.reportTemplate = Objects.requireNonNull(reportTemplate);
            return this;
        }
        public ReportSettingProperties build() {
            return new ReportSettingProperties(frameworkArns, reportTemplate);
        }
    }
}
