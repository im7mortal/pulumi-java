// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ClusterClusterConfigMetastoreConfig {
    /**
     * Resource name of an existing Dataproc Metastore service.
     * 
     */
    private final String dataprocMetastoreService;

    @OutputCustomType.Constructor({"dataprocMetastoreService"})
    private ClusterClusterConfigMetastoreConfig(String dataprocMetastoreService) {
        this.dataprocMetastoreService = Objects.requireNonNull(dataprocMetastoreService);
    }

    /**
     * Resource name of an existing Dataproc Metastore service.
     * 
    */
    public String getDataprocMetastoreService() {
        return this.dataprocMetastoreService;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigMetastoreConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataprocMetastoreService;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigMetastoreConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataprocMetastoreService = defaults.dataprocMetastoreService;
        }

        public Builder setDataprocMetastoreService(String dataprocMetastoreService) {
            this.dataprocMetastoreService = Objects.requireNonNull(dataprocMetastoreService);
            return this;
        }
        public ClusterClusterConfigMetastoreConfig build() {
            return new ClusterClusterConfigMetastoreConfig(dataprocMetastoreService);
        }
    }
}
