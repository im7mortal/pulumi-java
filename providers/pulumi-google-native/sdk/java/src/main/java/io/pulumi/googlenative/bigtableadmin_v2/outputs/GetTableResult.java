// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigtableadmin_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.bigtableadmin_v2.outputs.RestoreInfoResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetTableResult {
    private final Map<String,String> clusterStates;
    private final Map<String,String> columnFamilies;
    private final String granularity;
    private final String name;
    private final RestoreInfoResponse restoreInfo;

    @OutputCustomType.Constructor({"clusterStates","columnFamilies","granularity","name","restoreInfo"})
    private GetTableResult(
        Map<String,String> clusterStates,
        Map<String,String> columnFamilies,
        String granularity,
        String name,
        RestoreInfoResponse restoreInfo) {
        this.clusterStates = Objects.requireNonNull(clusterStates);
        this.columnFamilies = Objects.requireNonNull(columnFamilies);
        this.granularity = Objects.requireNonNull(granularity);
        this.name = Objects.requireNonNull(name);
        this.restoreInfo = Objects.requireNonNull(restoreInfo);
    }

    public Map<String,String> getClusterStates() {
        return this.clusterStates;
    }
    public Map<String,String> getColumnFamilies() {
        return this.columnFamilies;
    }
    public String getGranularity() {
        return this.granularity;
    }
    public String getName() {
        return this.name;
    }
    public RestoreInfoResponse getRestoreInfo() {
        return this.restoreInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTableResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> clusterStates;
        private Map<String,String> columnFamilies;
        private String granularity;
        private String name;
        private RestoreInfoResponse restoreInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTableResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterStates = defaults.clusterStates;
    	      this.columnFamilies = defaults.columnFamilies;
    	      this.granularity = defaults.granularity;
    	      this.name = defaults.name;
    	      this.restoreInfo = defaults.restoreInfo;
        }

        public Builder setClusterStates(Map<String,String> clusterStates) {
            this.clusterStates = Objects.requireNonNull(clusterStates);
            return this;
        }

        public Builder setColumnFamilies(Map<String,String> columnFamilies) {
            this.columnFamilies = Objects.requireNonNull(columnFamilies);
            return this;
        }

        public Builder setGranularity(String granularity) {
            this.granularity = Objects.requireNonNull(granularity);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRestoreInfo(RestoreInfoResponse restoreInfo) {
            this.restoreInfo = Objects.requireNonNull(restoreInfo);
            return this;
        }

        public GetTableResult build() {
            return new GetTableResult(clusterStates, columnFamilies, granularity, name, restoreInfo);
        }
    }
}