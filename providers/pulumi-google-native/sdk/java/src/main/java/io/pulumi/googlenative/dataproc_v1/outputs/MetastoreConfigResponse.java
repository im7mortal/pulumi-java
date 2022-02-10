// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MetastoreConfigResponse {
    private final String dataprocMetastoreService;

    @OutputCustomType.Constructor({"dataprocMetastoreService"})
    private MetastoreConfigResponse(String dataprocMetastoreService) {
        this.dataprocMetastoreService = Objects.requireNonNull(dataprocMetastoreService);
    }

    public String getDataprocMetastoreService() {
        return this.dataprocMetastoreService;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetastoreConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataprocMetastoreService;

        public Builder() {
    	      // Empty
        }

        public Builder(MetastoreConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataprocMetastoreService = defaults.dataprocMetastoreService;
        }

        public Builder setDataprocMetastoreService(String dataprocMetastoreService) {
            this.dataprocMetastoreService = Objects.requireNonNull(dataprocMetastoreService);
            return this;
        }

        public MetastoreConfigResponse build() {
            return new MetastoreConfigResponse(dataprocMetastoreService);
        }
    }
}