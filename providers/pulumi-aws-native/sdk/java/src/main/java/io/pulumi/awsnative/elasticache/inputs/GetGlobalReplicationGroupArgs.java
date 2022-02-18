// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticache.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetGlobalReplicationGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGlobalReplicationGroupArgs Empty = new GetGlobalReplicationGroupArgs();

    /**
     * The name of the Global Datastore, it is generated by ElastiCache adding a prefix to GlobalReplicationGroupIdSuffix.
     * 
     */
    @InputImport(name="globalReplicationGroupId", required=true)
    private final String globalReplicationGroupId;

    public String getGlobalReplicationGroupId() {
        return this.globalReplicationGroupId;
    }

    public GetGlobalReplicationGroupArgs(String globalReplicationGroupId) {
        this.globalReplicationGroupId = Objects.requireNonNull(globalReplicationGroupId, "expected parameter 'globalReplicationGroupId' to be non-null");
    }

    private GetGlobalReplicationGroupArgs() {
        this.globalReplicationGroupId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalReplicationGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String globalReplicationGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalReplicationGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.globalReplicationGroupId = defaults.globalReplicationGroupId;
        }

        public Builder setGlobalReplicationGroupId(String globalReplicationGroupId) {
            this.globalReplicationGroupId = Objects.requireNonNull(globalReplicationGroupId);
            return this;
        }

        public GetGlobalReplicationGroupArgs build() {
            return new GetGlobalReplicationGroupArgs(globalReplicationGroupId);
        }
    }
}
