// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetStageArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetStageArgs Empty = new GetStageArgs();

    /**
     * The ID of the RestApi resource that you're deploying with this stage.
     * 
     */
    @InputImport(name="restApiId", required=true)
    private final String restApiId;

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * The name of the stage, which API Gateway uses as the first path segment in the invoked Uniform Resource Identifier (URI).
     * 
     */
    @InputImport(name="stageName", required=true)
    private final String stageName;

    public String getStageName() {
        return this.stageName;
    }

    public GetStageArgs(
        String restApiId,
        String stageName) {
        this.restApiId = Objects.requireNonNull(restApiId, "expected parameter 'restApiId' to be non-null");
        this.stageName = Objects.requireNonNull(stageName, "expected parameter 'stageName' to be non-null");
    }

    private GetStageArgs() {
        this.restApiId = null;
        this.stageName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String restApiId;
        private String stageName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.restApiId = defaults.restApiId;
    	      this.stageName = defaults.stageName;
        }

        public Builder setRestApiId(String restApiId) {
            this.restApiId = Objects.requireNonNull(restApiId);
            return this;
        }

        public Builder setStageName(String stageName) {
            this.stageName = Objects.requireNonNull(stageName);
            return this;
        }

        public GetStageArgs build() {
            return new GetStageArgs(restApiId, stageName);
        }
    }
}
