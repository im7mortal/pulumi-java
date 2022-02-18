// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecr.inputs;

import io.pulumi.awsnative.ecr.enums.ReplicationConfigurationFilterType;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * An array of objects representing the details of a repository filter.
 * 
 */
public final class ReplicationConfigurationRepositoryFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationConfigurationRepositoryFilterArgs Empty = new ReplicationConfigurationRepositoryFilterArgs();

    @InputImport(name="filter", required=true)
    private final Input<String> filter;

    public Input<String> getFilter() {
        return this.filter;
    }

    @InputImport(name="filterType", required=true)
    private final Input<ReplicationConfigurationFilterType> filterType;

    public Input<ReplicationConfigurationFilterType> getFilterType() {
        return this.filterType;
    }

    public ReplicationConfigurationRepositoryFilterArgs(
        Input<String> filter,
        Input<ReplicationConfigurationFilterType> filterType) {
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.filterType = Objects.requireNonNull(filterType, "expected parameter 'filterType' to be non-null");
    }

    private ReplicationConfigurationRepositoryFilterArgs() {
        this.filter = Input.empty();
        this.filterType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationConfigurationRepositoryFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> filter;
        private Input<ReplicationConfigurationFilterType> filterType;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationConfigurationRepositoryFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.filterType = defaults.filterType;
        }

        public Builder setFilter(Input<String> filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder setFilter(String filter) {
            this.filter = Input.of(Objects.requireNonNull(filter));
            return this;
        }

        public Builder setFilterType(Input<ReplicationConfigurationFilterType> filterType) {
            this.filterType = Objects.requireNonNull(filterType);
            return this;
        }

        public Builder setFilterType(ReplicationConfigurationFilterType filterType) {
            this.filterType = Input.of(Objects.requireNonNull(filterType));
            return this;
        }

        public ReplicationConfigurationRepositoryFilterArgs build() {
            return new ReplicationConfigurationRepositoryFilterArgs(filter, filterType);
        }
    }
}
