// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class JobPlacementResponse {
    /**
     * Optional. Cluster labels to identify a cluster where the job will be submitted.
     * 
     */
    private final Map<String,String> clusterLabels;
    /**
     * The name of the cluster where the job will be submitted.
     * 
     */
    private final String clusterName;
    /**
     * A cluster UUID generated by the Dataproc service when the job is submitted.
     * 
     */
    private final String clusterUuid;

    @OutputCustomType.Constructor({"clusterLabels","clusterName","clusterUuid"})
    private JobPlacementResponse(
        Map<String,String> clusterLabels,
        String clusterName,
        String clusterUuid) {
        this.clusterLabels = Objects.requireNonNull(clusterLabels);
        this.clusterName = Objects.requireNonNull(clusterName);
        this.clusterUuid = Objects.requireNonNull(clusterUuid);
    }

    /**
     * Optional. Cluster labels to identify a cluster where the job will be submitted.
     * 
    */
    public Map<String,String> getClusterLabels() {
        return this.clusterLabels;
    }
    /**
     * The name of the cluster where the job will be submitted.
     * 
    */
    public String getClusterName() {
        return this.clusterName;
    }
    /**
     * A cluster UUID generated by the Dataproc service when the job is submitted.
     * 
    */
    public String getClusterUuid() {
        return this.clusterUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobPlacementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> clusterLabels;
        private String clusterName;
        private String clusterUuid;

        public Builder() {
    	      // Empty
        }

        public Builder(JobPlacementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterLabels = defaults.clusterLabels;
    	      this.clusterName = defaults.clusterName;
    	      this.clusterUuid = defaults.clusterUuid;
        }

        public Builder setClusterLabels(Map<String,String> clusterLabels) {
            this.clusterLabels = Objects.requireNonNull(clusterLabels);
            return this;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder setClusterUuid(String clusterUuid) {
            this.clusterUuid = Objects.requireNonNull(clusterUuid);
            return this;
        }
        public JobPlacementResponse build() {
            return new JobPlacementResponse(clusterLabels, clusterName, clusterUuid);
        }
    }
}
