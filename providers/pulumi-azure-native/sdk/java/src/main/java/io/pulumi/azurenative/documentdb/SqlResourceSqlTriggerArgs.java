// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.documentdb.inputs.CreateUpdateOptionsArgs;
import io.pulumi.azurenative.documentdb.inputs.SqlTriggerResourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SqlResourceSqlTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlResourceSqlTriggerArgs Empty = new SqlResourceSqlTriggerArgs();

    @InputImport(name="accountName", required=true)
    private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    @InputImport(name="containerName", required=true)
    private final Input<String> containerName;

    public Input<String> getContainerName() {
        return this.containerName;
    }

    @InputImport(name="databaseName", required=true)
    private final Input<String> databaseName;

    public Input<String> getDatabaseName() {
        return this.databaseName;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="options")
    private final @Nullable Input<CreateUpdateOptionsArgs> options;

    public Input<CreateUpdateOptionsArgs> getOptions() {
        return this.options == null ? Input.empty() : this.options;
    }

    @InputImport(name="resource", required=true)
    private final Input<SqlTriggerResourceArgs> resource;

    public Input<SqlTriggerResourceArgs> getResource() {
        return this.resource;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="triggerName")
    private final @Nullable Input<String> triggerName;

    public Input<String> getTriggerName() {
        return this.triggerName == null ? Input.empty() : this.triggerName;
    }

    public SqlResourceSqlTriggerArgs(
        Input<String> accountName,
        Input<String> containerName,
        Input<String> databaseName,
        @Nullable Input<String> location,
        @Nullable Input<CreateUpdateOptionsArgs> options,
        Input<SqlTriggerResourceArgs> resource,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> triggerName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.containerName = Objects.requireNonNull(containerName, "expected parameter 'containerName' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.location = location;
        this.options = options;
        this.resource = Objects.requireNonNull(resource, "expected parameter 'resource' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.triggerName = triggerName;
    }

    private SqlResourceSqlTriggerArgs() {
        this.accountName = Input.empty();
        this.containerName = Input.empty();
        this.databaseName = Input.empty();
        this.location = Input.empty();
        this.options = Input.empty();
        this.resource = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.triggerName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlResourceSqlTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private Input<String> containerName;
        private Input<String> databaseName;
        private @Nullable Input<String> location;
        private @Nullable Input<CreateUpdateOptionsArgs> options;
        private Input<SqlTriggerResourceArgs> resource;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> triggerName;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlResourceSqlTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.containerName = defaults.containerName;
    	      this.databaseName = defaults.databaseName;
    	      this.location = defaults.location;
    	      this.options = defaults.options;
    	      this.resource = defaults.resource;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.triggerName = defaults.triggerName;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setContainerName(Input<String> containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }

        public Builder setContainerName(String containerName) {
            this.containerName = Input.of(Objects.requireNonNull(containerName));
            return this;
        }

        public Builder setDatabaseName(Input<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Input.of(Objects.requireNonNull(databaseName));
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setOptions(@Nullable Input<CreateUpdateOptionsArgs> options) {
            this.options = options;
            return this;
        }

        public Builder setOptions(@Nullable CreateUpdateOptionsArgs options) {
            this.options = Input.ofNullable(options);
            return this;
        }

        public Builder setResource(Input<SqlTriggerResourceArgs> resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }

        public Builder setResource(SqlTriggerResourceArgs resource) {
            this.resource = Input.of(Objects.requireNonNull(resource));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTriggerName(@Nullable Input<String> triggerName) {
            this.triggerName = triggerName;
            return this;
        }

        public Builder setTriggerName(@Nullable String triggerName) {
            this.triggerName = Input.ofNullable(triggerName);
            return this;
        }

        public SqlResourceSqlTriggerArgs build() {
            return new SqlResourceSqlTriggerArgs(accountName, containerName, databaseName, location, options, resource, resourceGroupName, tags, triggerName);
        }
    }
}