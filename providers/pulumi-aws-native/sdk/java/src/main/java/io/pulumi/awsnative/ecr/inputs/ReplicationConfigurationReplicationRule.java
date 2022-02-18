// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecr.inputs;

import io.pulumi.awsnative.ecr.inputs.ReplicationConfigurationReplicationDestination;
import io.pulumi.awsnative.ecr.inputs.ReplicationConfigurationRepositoryFilter;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An array of objects representing the details of a replication destination.
 * 
 */
public final class ReplicationConfigurationReplicationRule extends io.pulumi.resources.InvokeArgs {

    public static final ReplicationConfigurationReplicationRule Empty = new ReplicationConfigurationReplicationRule();

    /**
     * An array of objects representing the details of a replication destination.
     * 
     */
    @InputImport(name="destinations", required=true)
    private final List<ReplicationConfigurationReplicationDestination> destinations;

    public List<ReplicationConfigurationReplicationDestination> getDestinations() {
        return this.destinations;
    }

    /**
     * An array of objects representing the details of a repository filter.
     * 
     */
    @InputImport(name="repositoryFilters")
    private final @Nullable List<ReplicationConfigurationRepositoryFilter> repositoryFilters;

    public List<ReplicationConfigurationRepositoryFilter> getRepositoryFilters() {
        return this.repositoryFilters == null ? List.of() : this.repositoryFilters;
    }

    public ReplicationConfigurationReplicationRule(
        List<ReplicationConfigurationReplicationDestination> destinations,
        @Nullable List<ReplicationConfigurationRepositoryFilter> repositoryFilters) {
        this.destinations = Objects.requireNonNull(destinations, "expected parameter 'destinations' to be non-null");
        this.repositoryFilters = repositoryFilters;
    }

    private ReplicationConfigurationReplicationRule() {
        this.destinations = List.of();
        this.repositoryFilters = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationConfigurationReplicationRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ReplicationConfigurationReplicationDestination> destinations;
        private @Nullable List<ReplicationConfigurationRepositoryFilter> repositoryFilters;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationConfigurationReplicationRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinations = defaults.destinations;
    	      this.repositoryFilters = defaults.repositoryFilters;
        }

        public Builder setDestinations(List<ReplicationConfigurationReplicationDestination> destinations) {
            this.destinations = Objects.requireNonNull(destinations);
            return this;
        }

        public Builder setRepositoryFilters(@Nullable List<ReplicationConfigurationRepositoryFilter> repositoryFilters) {
            this.repositoryFilters = repositoryFilters;
            return this;
        }

        public ReplicationConfigurationReplicationRule build() {
            return new ReplicationConfigurationReplicationRule(destinations, repositoryFilters);
        }
    }
}