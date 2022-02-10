// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetWebAppRelayServiceConnectionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWebAppRelayServiceConnectionArgs Empty = new GetWebAppRelayServiceConnectionArgs();

    @InputImport(name="entityName", required=true)
    private final String entityName;

    public String getEntityName() {
        return this.entityName;
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetWebAppRelayServiceConnectionArgs(
        String entityName,
        String name,
        String resourceGroupName) {
        this.entityName = Objects.requireNonNull(entityName, "expected parameter 'entityName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetWebAppRelayServiceConnectionArgs() {
        this.entityName = null;
        this.name = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppRelayServiceConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String entityName;
        private String name;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppRelayServiceConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityName = defaults.entityName;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setEntityName(String entityName) {
            this.entityName = Objects.requireNonNull(entityName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetWebAppRelayServiceConnectionArgs build() {
            return new GetWebAppRelayServiceConnectionArgs(entityName, name, resourceGroupName);
        }
    }
}