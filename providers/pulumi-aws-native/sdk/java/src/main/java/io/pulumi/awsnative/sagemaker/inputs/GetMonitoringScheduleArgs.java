// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetMonitoringScheduleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetMonitoringScheduleArgs Empty = new GetMonitoringScheduleArgs();

    /**
     * The Amazon Resource Name (ARN) of the monitoring schedule.
     * 
     */
    @InputImport(name="monitoringScheduleArn", required=true)
    private final String monitoringScheduleArn;

    public String getMonitoringScheduleArn() {
        return this.monitoringScheduleArn;
    }

    public GetMonitoringScheduleArgs(String monitoringScheduleArn) {
        this.monitoringScheduleArn = Objects.requireNonNull(monitoringScheduleArn, "expected parameter 'monitoringScheduleArn' to be non-null");
    }

    private GetMonitoringScheduleArgs() {
        this.monitoringScheduleArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMonitoringScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String monitoringScheduleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMonitoringScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monitoringScheduleArn = defaults.monitoringScheduleArn;
        }

        public Builder setMonitoringScheduleArn(String monitoringScheduleArn) {
            this.monitoringScheduleArn = Objects.requireNonNull(monitoringScheduleArn);
            return this;
        }

        public GetMonitoringScheduleArgs build() {
            return new GetMonitoringScheduleArgs(monitoringScheduleArn);
        }
    }
}