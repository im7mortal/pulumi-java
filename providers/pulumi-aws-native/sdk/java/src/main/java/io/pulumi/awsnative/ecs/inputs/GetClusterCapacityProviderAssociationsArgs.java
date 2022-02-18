// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetClusterCapacityProviderAssociationsArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterCapacityProviderAssociationsArgs Empty = new GetClusterCapacityProviderAssociationsArgs();

    @InputImport(name="cluster", required=true)
    private final String cluster;

    public String getCluster() {
        return this.cluster;
    }

    public GetClusterCapacityProviderAssociationsArgs(String cluster) {
        this.cluster = Objects.requireNonNull(cluster, "expected parameter 'cluster' to be non-null");
    }

    private GetClusterCapacityProviderAssociationsArgs() {
        this.cluster = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterCapacityProviderAssociationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cluster;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterCapacityProviderAssociationsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
        }

        public Builder setCluster(String cluster) {
            this.cluster = Objects.requireNonNull(cluster);
            return this;
        }

        public GetClusterCapacityProviderAssociationsArgs build() {
            return new GetClusterCapacityProviderAssociationsArgs(cluster);
        }
    }
}