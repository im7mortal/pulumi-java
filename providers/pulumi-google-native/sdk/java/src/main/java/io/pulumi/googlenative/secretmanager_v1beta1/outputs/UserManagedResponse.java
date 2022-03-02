// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.secretmanager_v1beta1.outputs.ReplicaResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class UserManagedResponse {
    /**
     * The list of Replicas for this Secret. Cannot be empty.
     * 
     */
    private final List<ReplicaResponse> replicas;

    @OutputCustomType.Constructor({"replicas"})
    private UserManagedResponse(List<ReplicaResponse> replicas) {
        this.replicas = Objects.requireNonNull(replicas);
    }

    /**
     * The list of Replicas for this Secret. Cannot be empty.
     * 
    */
    public List<ReplicaResponse> getReplicas() {
        return this.replicas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserManagedResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ReplicaResponse> replicas;

        public Builder() {
    	      // Empty
        }

        public Builder(UserManagedResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicas = defaults.replicas;
        }

        public Builder setReplicas(List<ReplicaResponse> replicas) {
            this.replicas = Objects.requireNonNull(replicas);
            return this;
        }
        public UserManagedResponse build() {
            return new UserManagedResponse(replicas);
        }
    }
}
