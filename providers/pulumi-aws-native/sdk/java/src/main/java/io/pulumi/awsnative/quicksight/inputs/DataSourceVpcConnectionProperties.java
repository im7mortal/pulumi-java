// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * <p>VPC connection properties.</p>
 * 
 */
public final class DataSourceVpcConnectionProperties extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceVpcConnectionProperties Empty = new DataSourceVpcConnectionProperties();

    /**
     * <p>The Amazon Resource Name (ARN) for the VPC connection.</p>
     * 
     */
    @InputImport(name="vpcConnectionArn", required=true)
    private final String vpcConnectionArn;

    public String getVpcConnectionArn() {
        return this.vpcConnectionArn;
    }

    public DataSourceVpcConnectionProperties(String vpcConnectionArn) {
        this.vpcConnectionArn = Objects.requireNonNull(vpcConnectionArn, "expected parameter 'vpcConnectionArn' to be non-null");
    }

    private DataSourceVpcConnectionProperties() {
        this.vpcConnectionArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceVpcConnectionProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String vpcConnectionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceVpcConnectionProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vpcConnectionArn = defaults.vpcConnectionArn;
        }

        public Builder setVpcConnectionArn(String vpcConnectionArn) {
            this.vpcConnectionArn = Objects.requireNonNull(vpcConnectionArn);
            return this;
        }

        public DataSourceVpcConnectionProperties build() {
            return new DataSourceVpcConnectionProperties(vpcConnectionArn);
        }
    }
}