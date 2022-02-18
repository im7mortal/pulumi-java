// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rds.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetGlobalClusterArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGlobalClusterArgs Empty = new GetGlobalClusterArgs();

    /**
     * The cluster identifier of the new global database cluster. This parameter is stored as a lowercase string.
     * 
     */
    @InputImport(name="globalClusterIdentifier", required=true)
    private final String globalClusterIdentifier;

    public String getGlobalClusterIdentifier() {
        return this.globalClusterIdentifier;
    }

    public GetGlobalClusterArgs(String globalClusterIdentifier) {
        this.globalClusterIdentifier = Objects.requireNonNull(globalClusterIdentifier, "expected parameter 'globalClusterIdentifier' to be non-null");
    }

    private GetGlobalClusterArgs() {
        this.globalClusterIdentifier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String globalClusterIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.globalClusterIdentifier = defaults.globalClusterIdentifier;
        }

        public Builder setGlobalClusterIdentifier(String globalClusterIdentifier) {
            this.globalClusterIdentifier = Objects.requireNonNull(globalClusterIdentifier);
            return this;
        }

        public GetGlobalClusterArgs build() {
            return new GetGlobalClusterArgs(globalClusterIdentifier);
        }
    }
}
