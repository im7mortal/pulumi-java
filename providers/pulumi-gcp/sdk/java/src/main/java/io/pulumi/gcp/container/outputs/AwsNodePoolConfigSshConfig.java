// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AwsNodePoolConfigSshConfig {
    /**
     * Required. The name of the EC2 key pair used to login into cluster machines.
     * 
     */
    private final String ec2KeyPair;

    @OutputCustomType.Constructor({"ec2KeyPair"})
    private AwsNodePoolConfigSshConfig(String ec2KeyPair) {
        this.ec2KeyPair = Objects.requireNonNull(ec2KeyPair);
    }

    /**
     * Required. The name of the EC2 key pair used to login into cluster machines.
     * 
    */
    public String getEc2KeyPair() {
        return this.ec2KeyPair;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsNodePoolConfigSshConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ec2KeyPair;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsNodePoolConfigSshConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ec2KeyPair = defaults.ec2KeyPair;
        }

        public Builder setEc2KeyPair(String ec2KeyPair) {
            this.ec2KeyPair = Objects.requireNonNull(ec2KeyPair);
            return this;
        }
        public AwsNodePoolConfigSshConfig build() {
            return new AwsNodePoolConfigSshConfig(ec2KeyPair);
        }
    }
}
