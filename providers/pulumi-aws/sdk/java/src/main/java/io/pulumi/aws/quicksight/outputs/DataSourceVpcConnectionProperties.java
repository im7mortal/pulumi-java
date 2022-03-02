// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DataSourceVpcConnectionProperties {
    /**
     * The Amazon Resource Name (ARN) for the VPC connection.
     * 
     */
    private final String vpcConnectionArn;

    @OutputCustomType.Constructor({"vpcConnectionArn"})
    private DataSourceVpcConnectionProperties(String vpcConnectionArn) {
        this.vpcConnectionArn = Objects.requireNonNull(vpcConnectionArn);
    }

    /**
     * The Amazon Resource Name (ARN) for the VPC connection.
     * 
    */
    public String getVpcConnectionArn() {
        return this.vpcConnectionArn;
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
