// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkManagerPropertiesResponseNetworkManagerScopes {
    /**
     * List of management groups.
     * 
     */
    private final @Nullable List<String> managementGroups;
    /**
     * List of subscriptions.
     * 
     */
    private final @Nullable List<String> subscriptions;

    @OutputCustomType.Constructor({"managementGroups","subscriptions"})
    private NetworkManagerPropertiesResponseNetworkManagerScopes(
        @Nullable List<String> managementGroups,
        @Nullable List<String> subscriptions) {
        this.managementGroups = managementGroups;
        this.subscriptions = subscriptions;
    }

    /**
     * List of management groups.
     * 
    */
    public List<String> getManagementGroups() {
        return this.managementGroups == null ? List.of() : this.managementGroups;
    }
    /**
     * List of subscriptions.
     * 
    */
    public List<String> getSubscriptions() {
        return this.subscriptions == null ? List.of() : this.subscriptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkManagerPropertiesResponseNetworkManagerScopes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> managementGroups;
        private @Nullable List<String> subscriptions;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkManagerPropertiesResponseNetworkManagerScopes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managementGroups = defaults.managementGroups;
    	      this.subscriptions = defaults.subscriptions;
        }

        public Builder setManagementGroups(@Nullable List<String> managementGroups) {
            this.managementGroups = managementGroups;
            return this;
        }

        public Builder setSubscriptions(@Nullable List<String> subscriptions) {
            this.subscriptions = subscriptions;
            return this;
        }
        public NetworkManagerPropertiesResponseNetworkManagerScopes build() {
            return new NetworkManagerPropertiesResponseNetworkManagerScopes(managementGroups, subscriptions);
        }
    }
}
