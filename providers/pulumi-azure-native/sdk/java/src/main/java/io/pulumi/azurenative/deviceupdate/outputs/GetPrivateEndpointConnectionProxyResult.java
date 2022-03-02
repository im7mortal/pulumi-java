// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deviceupdate.outputs;

import io.pulumi.azurenative.deviceupdate.outputs.RemotePrivateEndpointResponse;
import io.pulumi.azurenative.deviceupdate.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPrivateEndpointConnectionProxyResult {
    /**
     * ETag from NRP.
     * 
     */
    private final String eTag;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The provisioning state of the private endpoint connection proxy resource.
     * 
     */
    private final String provisioningState;
    /**
     * Remote private endpoint details.
     * 
     */
    private final @Nullable RemotePrivateEndpointResponse remotePrivateEndpoint;
    /**
     * Operation status.
     * 
     */
    private final @Nullable String status;
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"eTag","id","name","provisioningState","remotePrivateEndpoint","status","systemData","type"})
    private GetPrivateEndpointConnectionProxyResult(
        String eTag,
        String id,
        String name,
        String provisioningState,
        @Nullable RemotePrivateEndpointResponse remotePrivateEndpoint,
        @Nullable String status,
        SystemDataResponse systemData,
        String type) {
        this.eTag = Objects.requireNonNull(eTag);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.remotePrivateEndpoint = remotePrivateEndpoint;
        this.status = status;
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * ETag from NRP.
     * 
    */
    public String getETag() {
        return this.eTag;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioning state of the private endpoint connection proxy resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Remote private endpoint details.
     * 
    */
    public Optional<RemotePrivateEndpointResponse> getRemotePrivateEndpoint() {
        return Optional.ofNullable(this.remotePrivateEndpoint);
    }
    /**
     * Operation status.
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateEndpointConnectionProxyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String eTag;
        private String id;
        private String name;
        private String provisioningState;
        private @Nullable RemotePrivateEndpointResponse remotePrivateEndpoint;
        private @Nullable String status;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateEndpointConnectionProxyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.remotePrivateEndpoint = defaults.remotePrivateEndpoint;
    	      this.status = defaults.status;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setETag(String eTag) {
            this.eTag = Objects.requireNonNull(eTag);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRemotePrivateEndpoint(@Nullable RemotePrivateEndpointResponse remotePrivateEndpoint) {
            this.remotePrivateEndpoint = remotePrivateEndpoint;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetPrivateEndpointConnectionProxyResult build() {
            return new GetPrivateEndpointConnectionProxyResult(eTag, id, name, provisioningState, remotePrivateEndpoint, status, systemData, type);
        }
    }
}
