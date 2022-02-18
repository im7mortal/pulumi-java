// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetModelQualityJobDefinitionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetModelQualityJobDefinitionArgs Empty = new GetModelQualityJobDefinitionArgs();

    /**
     * The Amazon Resource Name (ARN) of job definition.
     * 
     */
    @InputImport(name="jobDefinitionArn", required=true)
    private final String jobDefinitionArn;

    public String getJobDefinitionArn() {
        return this.jobDefinitionArn;
    }

    public GetModelQualityJobDefinitionArgs(String jobDefinitionArn) {
        this.jobDefinitionArn = Objects.requireNonNull(jobDefinitionArn, "expected parameter 'jobDefinitionArn' to be non-null");
    }

    private GetModelQualityJobDefinitionArgs() {
        this.jobDefinitionArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetModelQualityJobDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String jobDefinitionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetModelQualityJobDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobDefinitionArn = defaults.jobDefinitionArn;
        }

        public Builder setJobDefinitionArn(String jobDefinitionArn) {
            this.jobDefinitionArn = Objects.requireNonNull(jobDefinitionArn);
            return this;
        }

        public GetModelQualityJobDefinitionArgs build() {
            return new GetModelQualityJobDefinitionArgs(jobDefinitionArn);
        }
    }
}
