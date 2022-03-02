// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.dataproc.outputs.ClusterClusterConfigSecurityConfigKerberosConfig;
import java.util.Objects;

@OutputCustomType
public final class ClusterClusterConfigSecurityConfig {
    /**
     * Kerberos Configuration
     * 
     */
    private final ClusterClusterConfigSecurityConfigKerberosConfig kerberosConfig;

    @OutputCustomType.Constructor({"kerberosConfig"})
    private ClusterClusterConfigSecurityConfig(ClusterClusterConfigSecurityConfigKerberosConfig kerberosConfig) {
        this.kerberosConfig = Objects.requireNonNull(kerberosConfig);
    }

    /**
     * Kerberos Configuration
     * 
    */
    public ClusterClusterConfigSecurityConfigKerberosConfig getKerberosConfig() {
        return this.kerberosConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigSecurityConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterClusterConfigSecurityConfigKerberosConfig kerberosConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigSecurityConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kerberosConfig = defaults.kerberosConfig;
        }

        public Builder setKerberosConfig(ClusterClusterConfigSecurityConfigKerberosConfig kerberosConfig) {
            this.kerberosConfig = Objects.requireNonNull(kerberosConfig);
            return this;
        }
        public ClusterClusterConfigSecurityConfig build() {
            return new ClusterClusterConfigSecurityConfig(kerberosConfig);
        }
    }
}
