// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SparkHistoryServerConfigResponse {
    /**
     * Optional. Resource name of an existing Dataproc Cluster to act as a Spark History Server for the workload.Example: projects/[project_id]/regions/[region]/clusters/[cluster_name]
     * 
     */
    private final String dataprocCluster;

    @OutputCustomType.Constructor({"dataprocCluster"})
    private SparkHistoryServerConfigResponse(String dataprocCluster) {
        this.dataprocCluster = Objects.requireNonNull(dataprocCluster);
    }

    /**
     * Optional. Resource name of an existing Dataproc Cluster to act as a Spark History Server for the workload.Example: projects/[project_id]/regions/[region]/clusters/[cluster_name]
     * 
    */
    public String getDataprocCluster() {
        return this.dataprocCluster;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkHistoryServerConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataprocCluster;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkHistoryServerConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataprocCluster = defaults.dataprocCluster;
        }

        public Builder setDataprocCluster(String dataprocCluster) {
            this.dataprocCluster = Objects.requireNonNull(dataprocCluster);
            return this;
        }
        public SparkHistoryServerConfigResponse build() {
            return new SparkHistoryServerConfigResponse(dataprocCluster);
        }
    }
}
