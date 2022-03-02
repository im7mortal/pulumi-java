// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagesync;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storagesync.RegisteredServerArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Registered Server resource.
 * API Version: 2020-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:storagesync:RegisteredServer ankushb-prod3.redmond.corp.microsoft.com /subscriptions/52b8da2f-61e0-4a1f-8dde-336911f367fb/resourceGroups/SampleResourceGroup_1/providers/Microsoft.StorageSync/storageSyncServices/SampleStorageSyncService_1/registeredServers/530a0384-50ac-456d-8240-9d6621404151 
 * ```
 * 
 */
@ResourceType(type="azure-native:storagesync:RegisteredServer")
public class RegisteredServer extends io.pulumi.resources.CustomResource {
    /**
     * Registered Server Agent Version
     * 
     */
    @OutputExport(name="agentVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> agentVersion;

    /**
     * @return Registered Server Agent Version
     * 
     */
    public Output</* @Nullable */ String> getAgentVersion() {
        return this.agentVersion;
    }
    /**
     * Registered Server Agent Version Expiration Date
     * 
     */
    @OutputExport(name="agentVersionExpirationDate", type=String.class, parameters={})
    private Output<String> agentVersionExpirationDate;

    /**
     * @return Registered Server Agent Version Expiration Date
     * 
     */
    public Output<String> getAgentVersionExpirationDate() {
        return this.agentVersionExpirationDate;
    }
    /**
     * Registered Server Agent Version Status
     * 
     */
    @OutputExport(name="agentVersionStatus", type=String.class, parameters={})
    private Output<String> agentVersionStatus;

    /**
     * @return Registered Server Agent Version Status
     * 
     */
    public Output<String> getAgentVersionStatus() {
        return this.agentVersionStatus;
    }
    /**
     * Registered Server clusterId
     * 
     */
    @OutputExport(name="clusterId", type=String.class, parameters={})
    private Output</* @Nullable */ String> clusterId;

    /**
     * @return Registered Server clusterId
     * 
     */
    public Output</* @Nullable */ String> getClusterId() {
        return this.clusterId;
    }
    /**
     * Registered Server clusterName
     * 
     */
    @OutputExport(name="clusterName", type=String.class, parameters={})
    private Output</* @Nullable */ String> clusterName;

    /**
     * @return Registered Server clusterName
     * 
     */
    public Output</* @Nullable */ String> getClusterName() {
        return this.clusterName;
    }
    /**
     * Resource discoveryEndpointUri
     * 
     */
    @OutputExport(name="discoveryEndpointUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> discoveryEndpointUri;

    /**
     * @return Resource discoveryEndpointUri
     * 
     */
    public Output</* @Nullable */ String> getDiscoveryEndpointUri() {
        return this.discoveryEndpointUri;
    }
    /**
     * Friendly Name
     * 
     */
    @OutputExport(name="friendlyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> friendlyName;

    /**
     * @return Friendly Name
     * 
     */
    public Output</* @Nullable */ String> getFriendlyName() {
        return this.friendlyName;
    }
    /**
     * Registered Server last heart beat
     * 
     */
    @OutputExport(name="lastHeartBeat", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastHeartBeat;

    /**
     * @return Registered Server last heart beat
     * 
     */
    public Output</* @Nullable */ String> getLastHeartBeat() {
        return this.lastHeartBeat;
    }
    /**
     * Resource Last Operation Name
     * 
     */
    @OutputExport(name="lastOperationName", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastOperationName;

    /**
     * @return Resource Last Operation Name
     * 
     */
    public Output</* @Nullable */ String> getLastOperationName() {
        return this.lastOperationName;
    }
    /**
     * Registered Server lastWorkflowId
     * 
     */
    @OutputExport(name="lastWorkflowId", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastWorkflowId;

    /**
     * @return Registered Server lastWorkflowId
     * 
     */
    public Output</* @Nullable */ String> getLastWorkflowId() {
        return this.lastWorkflowId;
    }
    /**
     * Management Endpoint Uri
     * 
     */
    @OutputExport(name="managementEndpointUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> managementEndpointUri;

    /**
     * @return Management Endpoint Uri
     * 
     */
    public Output</* @Nullable */ String> getManagementEndpointUri() {
        return this.managementEndpointUri;
    }
    /**
     * Monitoring Configuration
     * 
     */
    @OutputExport(name="monitoringConfiguration", type=String.class, parameters={})
    private Output</* @Nullable */ String> monitoringConfiguration;

    /**
     * @return Monitoring Configuration
     * 
     */
    public Output</* @Nullable */ String> getMonitoringConfiguration() {
        return this.monitoringConfiguration;
    }
    /**
     * Telemetry Endpoint Uri
     * 
     */
    @OutputExport(name="monitoringEndpointUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> monitoringEndpointUri;

    /**
     * @return Telemetry Endpoint Uri
     * 
     */
    public Output</* @Nullable */ String> getMonitoringEndpointUri() {
        return this.monitoringEndpointUri;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Registered Server Provisioning State
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    /**
     * @return Registered Server Provisioning State
     * 
     */
    public Output</* @Nullable */ String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource Location
     * 
     */
    @OutputExport(name="resourceLocation", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceLocation;

    /**
     * @return Resource Location
     * 
     */
    public Output</* @Nullable */ String> getResourceLocation() {
        return this.resourceLocation;
    }
    /**
     * Registered Server Certificate
     * 
     */
    @OutputExport(name="serverCertificate", type=String.class, parameters={})
    private Output</* @Nullable */ String> serverCertificate;

    /**
     * @return Registered Server Certificate
     * 
     */
    public Output</* @Nullable */ String> getServerCertificate() {
        return this.serverCertificate;
    }
    /**
     * Registered Server serverId
     * 
     */
    @OutputExport(name="serverId", type=String.class, parameters={})
    private Output</* @Nullable */ String> serverId;

    /**
     * @return Registered Server serverId
     * 
     */
    public Output</* @Nullable */ String> getServerId() {
        return this.serverId;
    }
    /**
     * Registered Server Management Error Code
     * 
     */
    @OutputExport(name="serverManagementErrorCode", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> serverManagementErrorCode;

    /**
     * @return Registered Server Management Error Code
     * 
     */
    public Output</* @Nullable */ Integer> getServerManagementErrorCode() {
        return this.serverManagementErrorCode;
    }
    /**
     * Registered Server OS Version
     * 
     */
    @OutputExport(name="serverOSVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> serverOSVersion;

    /**
     * @return Registered Server OS Version
     * 
     */
    public Output</* @Nullable */ String> getServerOSVersion() {
        return this.serverOSVersion;
    }
    /**
     * Registered Server serverRole
     * 
     */
    @OutputExport(name="serverRole", type=String.class, parameters={})
    private Output</* @Nullable */ String> serverRole;

    /**
     * @return Registered Server serverRole
     * 
     */
    public Output</* @Nullable */ String> getServerRole() {
        return this.serverRole;
    }
    /**
     * Service Location
     * 
     */
    @OutputExport(name="serviceLocation", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceLocation;

    /**
     * @return Service Location
     * 
     */
    public Output</* @Nullable */ String> getServiceLocation() {
        return this.serviceLocation;
    }
    /**
     * Registered Server storageSyncServiceUid
     * 
     */
    @OutputExport(name="storageSyncServiceUid", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageSyncServiceUid;

    /**
     * @return Registered Server storageSyncServiceUid
     * 
     */
    public Output</* @Nullable */ String> getStorageSyncServiceUid() {
        return this.storageSyncServiceUid;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(RegisteredServerArgs.Builder a);
    }
    private static io.pulumi.azurenative.storagesync.RegisteredServerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.storagesync.RegisteredServerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public RegisteredServer(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegisteredServer(String name) {
        this(name, RegisteredServerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegisteredServer(String name, RegisteredServerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegisteredServer(String name, RegisteredServerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storagesync:RegisteredServer", name, args == null ? RegisteredServerArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RegisteredServer(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storagesync:RegisteredServer", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:storagesync/v20170605preview:RegisteredServer").build()),
                Input.of(Alias.builder().setType("azure-native:storagesync/v20180402:RegisteredServer").build()),
                Input.of(Alias.builder().setType("azure-native:storagesync/v20180701:RegisteredServer").build()),
                Input.of(Alias.builder().setType("azure-native:storagesync/v20181001:RegisteredServer").build()),
                Input.of(Alias.builder().setType("azure-native:storagesync/v20190201:RegisteredServer").build()),
                Input.of(Alias.builder().setType("azure-native:storagesync/v20190301:RegisteredServer").build()),
                Input.of(Alias.builder().setType("azure-native:storagesync/v20190601:RegisteredServer").build()),
                Input.of(Alias.builder().setType("azure-native:storagesync/v20191001:RegisteredServer").build()),
                Input.of(Alias.builder().setType("azure-native:storagesync/v20200301:RegisteredServer").build()),
                Input.of(Alias.builder().setType("azure-native:storagesync/v20200901:RegisteredServer").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RegisteredServer get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RegisteredServer(name, id, options);
    }
}
