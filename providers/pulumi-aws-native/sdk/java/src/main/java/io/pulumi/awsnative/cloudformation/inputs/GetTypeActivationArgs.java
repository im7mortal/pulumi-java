// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetTypeActivationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTypeActivationArgs Empty = new GetTypeActivationArgs();

    /**
     * The Amazon Resource Name (ARN) of the extension.
     * 
     */
    @InputImport(name="arn", required=true)
    private final String arn;

    public String getArn() {
        return this.arn;
    }

    public GetTypeActivationArgs(String arn) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
    }

    private GetTypeActivationArgs() {
        this.arn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTypeActivationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTypeActivationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public GetTypeActivationArgs build() {
            return new GetTypeActivationArgs(arn);
        }
    }
}
