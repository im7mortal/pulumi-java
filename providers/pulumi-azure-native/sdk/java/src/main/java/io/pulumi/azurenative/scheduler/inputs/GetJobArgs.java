// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetJobArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetJobArgs Empty = new GetJobArgs();

    @InputImport(name="jobCollectionName", required=true)
    private final String jobCollectionName;

    public String getJobCollectionName() {
        return this.jobCollectionName;
    }

    @InputImport(name="jobName", required=true)
    private final String jobName;

    public String getJobName() {
        return this.jobName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetJobArgs(
        String jobCollectionName,
        String jobName,
        String resourceGroupName) {
        this.jobCollectionName = Objects.requireNonNull(jobCollectionName, "expected parameter 'jobCollectionName' to be non-null");
        this.jobName = Objects.requireNonNull(jobName, "expected parameter 'jobName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetJobArgs() {
        this.jobCollectionName = null;
        this.jobName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String jobCollectionName;
        private String jobName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobCollectionName = defaults.jobCollectionName;
    	      this.jobName = defaults.jobName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setJobCollectionName(String jobCollectionName) {
            this.jobCollectionName = Objects.requireNonNull(jobCollectionName);
            return this;
        }

        public Builder setJobName(String jobName) {
            this.jobName = Objects.requireNonNull(jobName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetJobArgs build() {
            return new GetJobArgs(jobCollectionName, jobName, resourceGroupName);
        }
    }
}