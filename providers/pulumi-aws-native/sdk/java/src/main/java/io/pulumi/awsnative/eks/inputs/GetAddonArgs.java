// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.eks.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAddonArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAddonArgs Empty = new GetAddonArgs();

    /**
     * Name of Addon
     * 
     */
    @InputImport(name="addonName", required=true)
    private final String addonName;

    public String getAddonName() {
        return this.addonName;
    }

    /**
     * Name of Cluster
     * 
     */
    @InputImport(name="clusterName", required=true)
    private final String clusterName;

    public String getClusterName() {
        return this.clusterName;
    }

    public GetAddonArgs(
        String addonName,
        String clusterName) {
        this.addonName = Objects.requireNonNull(addonName, "expected parameter 'addonName' to be non-null");
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
    }

    private GetAddonArgs() {
        this.addonName = null;
        this.clusterName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAddonArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String addonName;
        private String clusterName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAddonArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addonName = defaults.addonName;
    	      this.clusterName = defaults.clusterName;
        }

        public Builder setAddonName(String addonName) {
            this.addonName = Objects.requireNonNull(addonName);
            return this;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public GetAddonArgs build() {
            return new GetAddonArgs(addonName, clusterName);
        }
    }
}
