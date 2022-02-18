// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apprunner.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetVpcConnectorArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVpcConnectorArgs Empty = new GetVpcConnectorArgs();

    /**
     * The Amazon Resource Name (ARN) of this VPC connector.
     * 
     */
    @InputImport(name="vpcConnectorArn", required=true)
    private final String vpcConnectorArn;

    public String getVpcConnectorArn() {
        return this.vpcConnectorArn;
    }

    public GetVpcConnectorArgs(String vpcConnectorArn) {
        this.vpcConnectorArn = Objects.requireNonNull(vpcConnectorArn, "expected parameter 'vpcConnectorArn' to be non-null");
    }

    private GetVpcConnectorArgs() {
        this.vpcConnectorArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String vpcConnectorArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpcConnectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vpcConnectorArn = defaults.vpcConnectorArn;
        }

        public Builder setVpcConnectorArn(String vpcConnectorArn) {
            this.vpcConnectorArn = Objects.requireNonNull(vpcConnectorArn);
            return this;
        }

        public GetVpcConnectorArgs build() {
            return new GetVpcConnectorArgs(vpcConnectorArn);
        }
    }
}
