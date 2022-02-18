// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.macie.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSessionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSessionArgs Empty = new GetSessionArgs();

    /**
     * AWS account ID of customer
     * 
     */
    @InputImport(name="awsAccountId", required=true)
    private final String awsAccountId;

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    public GetSessionArgs(String awsAccountId) {
        this.awsAccountId = Objects.requireNonNull(awsAccountId, "expected parameter 'awsAccountId' to be non-null");
    }

    private GetSessionArgs() {
        this.awsAccountId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSessionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String awsAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSessionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccountId = defaults.awsAccountId;
        }

        public Builder setAwsAccountId(String awsAccountId) {
            this.awsAccountId = Objects.requireNonNull(awsAccountId);
            return this;
        }

        public GetSessionArgs build() {
            return new GetSessionArgs(awsAccountId);
        }
    }
}
