// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class UserDefinedResourcesPropertiesResponse {
    /**
     * Azure Resource Graph query which represents the security solution's user defined resources. Required to start with "where type != "Microsoft.Devices/IotHubs""
     * 
     */
    private final String query;
    /**
     * List of Azure subscription ids on which the user defined resources query should be executed.
     * 
     */
    private final List<String> querySubscriptions;

    @OutputCustomType.Constructor({"query","querySubscriptions"})
    private UserDefinedResourcesPropertiesResponse(
        String query,
        List<String> querySubscriptions) {
        this.query = Objects.requireNonNull(query);
        this.querySubscriptions = Objects.requireNonNull(querySubscriptions);
    }

    /**
     * Azure Resource Graph query which represents the security solution's user defined resources. Required to start with "where type != "Microsoft.Devices/IotHubs""
     * 
    */
    public String getQuery() {
        return this.query;
    }
    /**
     * List of Azure subscription ids on which the user defined resources query should be executed.
     * 
    */
    public List<String> getQuerySubscriptions() {
        return this.querySubscriptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserDefinedResourcesPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String query;
        private List<String> querySubscriptions;

        public Builder() {
    	      // Empty
        }

        public Builder(UserDefinedResourcesPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.query = defaults.query;
    	      this.querySubscriptions = defaults.querySubscriptions;
        }

        public Builder setQuery(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }

        public Builder setQuerySubscriptions(List<String> querySubscriptions) {
            this.querySubscriptions = Objects.requireNonNull(querySubscriptions);
            return this;
        }
        public UserDefinedResourcesPropertiesResponse build() {
            return new UserDefinedResourcesPropertiesResponse(query, querySubscriptions);
        }
    }
}
