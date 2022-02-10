// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetGatewayCustomDomainArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGatewayCustomDomainArgs Empty = new GetGatewayCustomDomainArgs();

    @InputImport(name="domainName", required=true)
    private final String domainName;

    public String getDomainName() {
        return this.domainName;
    }

    @InputImport(name="gatewayName", required=true)
    private final String gatewayName;

    public String getGatewayName() {
        return this.gatewayName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="serviceName", required=true)
    private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    public GetGatewayCustomDomainArgs(
        String domainName,
        String gatewayName,
        String resourceGroupName,
        String serviceName) {
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.gatewayName = Objects.requireNonNull(gatewayName, "expected parameter 'gatewayName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GetGatewayCustomDomainArgs() {
        this.domainName = null;
        this.gatewayName = null;
        this.resourceGroupName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayCustomDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainName;
        private String gatewayName;
        private String resourceGroupName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGatewayCustomDomainArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.gatewayName = defaults.gatewayName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setDomainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder setGatewayName(String gatewayName) {
            this.gatewayName = Objects.requireNonNull(gatewayName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public GetGatewayCustomDomainArgs build() {
            return new GetGatewayCustomDomainArgs(domainName, gatewayName, resourceGroupName, serviceName);
        }
    }
}