// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.container.outputs.AzureClusterAuthorizationAdminUser;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class AzureClusterAuthorization {
    /**
     * Required. Users that can perform operations as a cluster admin. A new ClusterRoleBinding will be created to grant the cluster-admin ClusterRole to the users. At most one user can be specified. For more info on RBAC, see https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
     * 
     */
    private final List<AzureClusterAuthorizationAdminUser> adminUsers;

    @OutputCustomType.Constructor({"adminUsers"})
    private AzureClusterAuthorization(List<AzureClusterAuthorizationAdminUser> adminUsers) {
        this.adminUsers = Objects.requireNonNull(adminUsers);
    }

    /**
     * Required. Users that can perform operations as a cluster admin. A new ClusterRoleBinding will be created to grant the cluster-admin ClusterRole to the users. At most one user can be specified. For more info on RBAC, see https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
     * 
     */
    public List<AzureClusterAuthorizationAdminUser> getAdminUsers() {
        return this.adminUsers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureClusterAuthorization defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AzureClusterAuthorizationAdminUser> adminUsers;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureClusterAuthorization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminUsers = defaults.adminUsers;
        }

        public Builder setAdminUsers(List<AzureClusterAuthorizationAdminUser> adminUsers) {
            this.adminUsers = Objects.requireNonNull(adminUsers);
            return this;
        }

        public AzureClusterAuthorization build() {
            return new AzureClusterAuthorization(adminUsers);
        }
    }
}