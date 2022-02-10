// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AzureActiveDirectoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureActiveDirectoryArgs Empty = new AzureActiveDirectoryArgs();

    @InputImport(name="clientApplication")
    private final @Nullable Input<String> clientApplication;

    public Input<String> getClientApplication() {
        return this.clientApplication == null ? Input.empty() : this.clientApplication;
    }

    @InputImport(name="clusterApplication")
    private final @Nullable Input<String> clusterApplication;

    public Input<String> getClusterApplication() {
        return this.clusterApplication == null ? Input.empty() : this.clusterApplication;
    }

    @InputImport(name="tenantId")
    private final @Nullable Input<String> tenantId;

    public Input<String> getTenantId() {
        return this.tenantId == null ? Input.empty() : this.tenantId;
    }

    public AzureActiveDirectoryArgs(
        @Nullable Input<String> clientApplication,
        @Nullable Input<String> clusterApplication,
        @Nullable Input<String> tenantId) {
        this.clientApplication = clientApplication;
        this.clusterApplication = clusterApplication;
        this.tenantId = tenantId;
    }

    private AzureActiveDirectoryArgs() {
        this.clientApplication = Input.empty();
        this.clusterApplication = Input.empty();
        this.tenantId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureActiveDirectoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clientApplication;
        private @Nullable Input<String> clusterApplication;
        private @Nullable Input<String> tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureActiveDirectoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientApplication = defaults.clientApplication;
    	      this.clusterApplication = defaults.clusterApplication;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setClientApplication(@Nullable Input<String> clientApplication) {
            this.clientApplication = clientApplication;
            return this;
        }

        public Builder setClientApplication(@Nullable String clientApplication) {
            this.clientApplication = Input.ofNullable(clientApplication);
            return this;
        }

        public Builder setClusterApplication(@Nullable Input<String> clusterApplication) {
            this.clusterApplication = clusterApplication;
            return this;
        }

        public Builder setClusterApplication(@Nullable String clusterApplication) {
            this.clusterApplication = Input.ofNullable(clusterApplication);
            return this;
        }

        public Builder setTenantId(@Nullable Input<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = Input.ofNullable(tenantId);
            return this;
        }

        public AzureActiveDirectoryArgs build() {
            return new AzureActiveDirectoryArgs(clientApplication, clusterApplication, tenantId);
        }
    }
}