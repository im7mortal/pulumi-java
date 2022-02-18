// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecr.outputs;

import io.pulumi.awsnative.ecr.outputs.ReplicationConfigurationReplicationDestination;
import io.pulumi.awsnative.ecr.outputs.ReplicationConfigurationRepositoryFilter;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ReplicationConfigurationReplicationRule {
    /**
     * An array of objects representing the details of a replication destination.
     * 
     */
    private final List<ReplicationConfigurationReplicationDestination> destinations;
    /**
     * An array of objects representing the details of a repository filter.
     * 
     */
    private final @Nullable List<ReplicationConfigurationRepositoryFilter> repositoryFilters;

    @OutputCustomType.Constructor({"destinations","repositoryFilters"})
    private ReplicationConfigurationReplicationRule(
        List<ReplicationConfigurationReplicationDestination> destinations,
        @Nullable List<ReplicationConfigurationRepositoryFilter> repositoryFilters) {
        this.destinations = Objects.requireNonNull(destinations);
        this.repositoryFilters = repositoryFilters;
    }

    /**
     * An array of objects representing the details of a replication destination.
     * 
     */
    public List<ReplicationConfigurationReplicationDestination> getDestinations() {
        return this.destinations;
    }
    /**
     * An array of objects representing the details of a repository filter.
     * 
     */
    public List<ReplicationConfigurationRepositoryFilter> getRepositoryFilters() {
        return this.repositoryFilters == null ? List.of() : this.repositoryFilters;
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
