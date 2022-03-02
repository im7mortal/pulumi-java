// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.notebooks_v1.InstanceArgs;
import io.pulumi.googlenative.notebooks_v1.outputs.AcceleratorConfigResponse;
import io.pulumi.googlenative.notebooks_v1.outputs.ContainerImageResponse;
import io.pulumi.googlenative.notebooks_v1.outputs.DiskResponse;
import io.pulumi.googlenative.notebooks_v1.outputs.ReservationAffinityResponse;
import io.pulumi.googlenative.notebooks_v1.outputs.ShieldedInstanceConfigResponse;
import io.pulumi.googlenative.notebooks_v1.outputs.UpgradeHistoryEntryResponse;
import io.pulumi.googlenative.notebooks_v1.outputs.VmImageResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new Instance in a given project and location.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:notebooks/v1:Instance")
public class Instance extends io.pulumi.resources.CustomResource {
    /**
     * The hardware accelerator used on this instance. If you use accelerators, make sure that your configuration has [enough vCPUs and memory to support the `machine_type` you have selected](/compute/docs/gpus/#gpus-list).
     * 
     */
    @OutputExport(name="acceleratorConfig", type=AcceleratorConfigResponse.class, parameters={})
    private Output<AcceleratorConfigResponse> acceleratorConfig;

    /**
     * @return The hardware accelerator used on this instance. If you use accelerators, make sure that your configuration has [enough vCPUs and memory to support the `machine_type` you have selected](/compute/docs/gpus/#gpus-list).
     * 
     */
    public Output<AcceleratorConfigResponse> getAcceleratorConfig() {
        return this.acceleratorConfig;
    }
    /**
     * Input only. The size of the boot disk in GB attached to this instance, up to a maximum of 64000 GB (64 TB). The minimum recommended value is 100 GB. If not specified, this defaults to 100.
     * 
     */
    @OutputExport(name="bootDiskSizeGb", type=String.class, parameters={})
    private Output<String> bootDiskSizeGb;

    /**
     * @return Input only. The size of the boot disk in GB attached to this instance, up to a maximum of 64000 GB (64 TB). The minimum recommended value is 100 GB. If not specified, this defaults to 100.
     * 
     */
    public Output<String> getBootDiskSizeGb() {
        return this.bootDiskSizeGb;
    }
    /**
     * Input only. The type of the boot disk attached to this instance, defaults to standard persistent disk (`PD_STANDARD`).
     * 
     */
    @OutputExport(name="bootDiskType", type=String.class, parameters={})
    private Output<String> bootDiskType;

    /**
     * @return Input only. The type of the boot disk attached to this instance, defaults to standard persistent disk (`PD_STANDARD`).
     * 
     */
    public Output<String> getBootDiskType() {
        return this.bootDiskType;
    }
    /**
     * Use a container image to start the notebook instance.
     * 
     */
    @OutputExport(name="containerImage", type=ContainerImageResponse.class, parameters={})
    private Output<ContainerImageResponse> containerImage;

    /**
     * @return Use a container image to start the notebook instance.
     * 
     */
    public Output<ContainerImageResponse> getContainerImage() {
        return this.containerImage;
    }
    /**
     * Instance creation time.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Instance creation time.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Specify a custom Cloud Storage path where the GPU driver is stored. If not specified, we'll automatically choose from official GPU drivers.
     * 
     */
    @OutputExport(name="customGpuDriverPath", type=String.class, parameters={})
    private Output<String> customGpuDriverPath;

    /**
     * @return Specify a custom Cloud Storage path where the GPU driver is stored. If not specified, we'll automatically choose from official GPU drivers.
     * 
     */
    public Output<String> getCustomGpuDriverPath() {
        return this.customGpuDriverPath;
    }
    /**
     * Input only. The size of the data disk in GB attached to this instance, up to a maximum of 64000 GB (64 TB). You can choose the size of the data disk based on how big your notebooks and data are. If not specified, this defaults to 100.
     * 
     */
    @OutputExport(name="dataDiskSizeGb", type=String.class, parameters={})
    private Output<String> dataDiskSizeGb;

    /**
     * @return Input only. The size of the data disk in GB attached to this instance, up to a maximum of 64000 GB (64 TB). You can choose the size of the data disk based on how big your notebooks and data are. If not specified, this defaults to 100.
     * 
     */
    public Output<String> getDataDiskSizeGb() {
        return this.dataDiskSizeGb;
    }
    /**
     * Input only. The type of the data disk attached to this instance, defaults to standard persistent disk (`PD_STANDARD`).
     * 
     */
    @OutputExport(name="dataDiskType", type=String.class, parameters={})
    private Output<String> dataDiskType;

    /**
     * @return Input only. The type of the data disk attached to this instance, defaults to standard persistent disk (`PD_STANDARD`).
     * 
     */
    public Output<String> getDataDiskType() {
        return this.dataDiskType;
    }
    /**
     * Input only. Disk encryption method used on the boot and data disks, defaults to GMEK.
     * 
     */
    @OutputExport(name="diskEncryption", type=String.class, parameters={})
    private Output<String> diskEncryption;

    /**
     * @return Input only. Disk encryption method used on the boot and data disks, defaults to GMEK.
     * 
     */
    public Output<String> getDiskEncryption() {
        return this.diskEncryption;
    }
    /**
     * Attached disks to notebook instance.
     * 
     */
    @OutputExport(name="disks", type=List.class, parameters={DiskResponse.class})
    private Output<List<DiskResponse>> disks;

    /**
     * @return Attached disks to notebook instance.
     * 
     */
    public Output<List<DiskResponse>> getDisks() {
        return this.disks;
    }
    /**
     * Whether the end user authorizes Google Cloud to install GPU driver on this instance. If this field is empty or set to false, the GPU driver won't be installed. Only applicable to instances with GPUs.
     * 
     */
    @OutputExport(name="installGpuDriver", type=Boolean.class, parameters={})
    private Output<Boolean> installGpuDriver;

    /**
     * @return Whether the end user authorizes Google Cloud to install GPU driver on this instance. If this field is empty or set to false, the GPU driver won't be installed. Only applicable to instances with GPUs.
     * 
     */
    public Output<Boolean> getInstallGpuDriver() {
        return this.installGpuDriver;
    }
    /**
     * Input only. The owner of this instance after creation. Format: `alias@example.com` Currently supports one owner only. If not specified, all of the service account users of your VM instance's service account can use the instance.
     * 
     */
    @OutputExport(name="instanceOwners", type=List.class, parameters={String.class})
    private Output<List<String>> instanceOwners;

    /**
     * @return Input only. The owner of this instance after creation. Format: `alias@example.com` Currently supports one owner only. If not specified, all of the service account users of your VM instance's service account can use the instance.
     * 
     */
    public Output<List<String>> getInstanceOwners() {
        return this.instanceOwners;
    }
    /**
     * Input only. The KMS key used to encrypt the disks, only applicable if disk_encryption is CMEK. Format: `projects/{project_id}/locations/{location}/keyRings/{key_ring_id}/cryptoKeys/{key_id}` Learn more about [using your own encryption keys](/kms/docs/quickstart).
     * 
     */
    @OutputExport(name="kmsKey", type=String.class, parameters={})
    private Output<String> kmsKey;

    /**
     * @return Input only. The KMS key used to encrypt the disks, only applicable if disk_encryption is CMEK. Format: `projects/{project_id}/locations/{location}/keyRings/{key_ring_id}/cryptoKeys/{key_id}` Learn more about [using your own encryption keys](/kms/docs/quickstart).
     * 
     */
    public Output<String> getKmsKey() {
        return this.kmsKey;
    }
    /**
     * Labels to apply to this instance. These can be later modified by the setLabels method.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Labels to apply to this instance. These can be later modified by the setLabels method.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The [Compute Engine machine type](/compute/docs/machine-types) of this instance.
     * 
     */
    @OutputExport(name="machineType", type=String.class, parameters={})
    private Output<String> machineType;

    /**
     * @return The [Compute Engine machine type](/compute/docs/machine-types) of this instance.
     * 
     */
    public Output<String> getMachineType() {
        return this.machineType;
    }
    /**
     * Custom metadata to apply to this instance.
     * 
     */
    @OutputExport(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> metadata;

    /**
     * @return Custom metadata to apply to this instance.
     * 
     */
    public Output<Map<String,String>> getMetadata() {
        return this.metadata;
    }
    /**
     * The name of this notebook instance. Format: `projects/{project_id}/locations/{location}/instances/{instance_id}`
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of this notebook instance. Format: `projects/{project_id}/locations/{location}/instances/{instance_id}`
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The name of the VPC that this instance is in. Format: `projects/{project_id}/global/networks/{network_id}`
     * 
     */
    @OutputExport(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return The name of the VPC that this instance is in. Format: `projects/{project_id}/global/networks/{network_id}`
     * 
     */
    public Output<String> getNetwork() {
        return this.network;
    }
    /**
     * Optional. The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
     * 
     */
    @OutputExport(name="nicType", type=String.class, parameters={})
    private Output<String> nicType;

    /**
     * @return Optional. The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
     * 
     */
    public Output<String> getNicType() {
        return this.nicType;
    }
    /**
     * If true, the notebook instance will not register with the proxy.
     * 
     */
    @OutputExport(name="noProxyAccess", type=Boolean.class, parameters={})
    private Output<Boolean> noProxyAccess;

    /**
     * @return If true, the notebook instance will not register with the proxy.
     * 
     */
    public Output<Boolean> getNoProxyAccess() {
        return this.noProxyAccess;
    }
    /**
     * If true, no public IP will be assigned to this instance.
     * 
     */
    @OutputExport(name="noPublicIp", type=Boolean.class, parameters={})
    private Output<Boolean> noPublicIp;

    /**
     * @return If true, no public IP will be assigned to this instance.
     * 
     */
    public Output<Boolean> getNoPublicIp() {
        return this.noPublicIp;
    }
    /**
     * Input only. If true, the data disk will not be auto deleted when deleting the instance.
     * 
     */
    @OutputExport(name="noRemoveDataDisk", type=Boolean.class, parameters={})
    private Output<Boolean> noRemoveDataDisk;

    /**
     * @return Input only. If true, the data disk will not be auto deleted when deleting the instance.
     * 
     */
    public Output<Boolean> getNoRemoveDataDisk() {
        return this.noRemoveDataDisk;
    }
    /**
     * Path to a Bash script that automatically runs after a notebook instance fully boots up. The path must be a URL or Cloud Storage path (`gs://path-to-file/file-name`).
     * 
     */
    @OutputExport(name="postStartupScript", type=String.class, parameters={})
    private Output<String> postStartupScript;

    /**
     * @return Path to a Bash script that automatically runs after a notebook instance fully boots up. The path must be a URL or Cloud Storage path (`gs://path-to-file/file-name`).
     * 
     */
    public Output<String> getPostStartupScript() {
        return this.postStartupScript;
    }
    /**
     * The proxy endpoint that is used to access the Jupyter notebook.
     * 
     */
    @OutputExport(name="proxyUri", type=String.class, parameters={})
    private Output<String> proxyUri;

    /**
     * @return The proxy endpoint that is used to access the Jupyter notebook.
     * 
     */
    public Output<String> getProxyUri() {
        return this.proxyUri;
    }
    /**
     * Optional. The optional reservation affinity. Setting this field will apply the specified [Zonal Compute Reservation](https://cloud.google.com/compute/docs/instances/reserving-zonal-resources) to this notebook instance.
     * 
     */
    @OutputExport(name="reservationAffinity", type=ReservationAffinityResponse.class, parameters={})
    private Output<ReservationAffinityResponse> reservationAffinity;

    /**
     * @return Optional. The optional reservation affinity. Setting this field will apply the specified [Zonal Compute Reservation](https://cloud.google.com/compute/docs/instances/reserving-zonal-resources) to this notebook instance.
     * 
     */
    public Output<ReservationAffinityResponse> getReservationAffinity() {
        return this.reservationAffinity;
    }
    /**
     * The service account on this instance, giving access to other Google Cloud services. You can use any service account within the same project, but you must have the service account user permission to use the instance. If not specified, the [Compute Engine default service account](https://cloud.google.com/compute/docs/access/service-accounts#default_service_account) is used.
     * 
     */
    @OutputExport(name="serviceAccount", type=String.class, parameters={})
    private Output<String> serviceAccount;

    /**
     * @return The service account on this instance, giving access to other Google Cloud services. You can use any service account within the same project, but you must have the service account user permission to use the instance. If not specified, the [Compute Engine default service account](https://cloud.google.com/compute/docs/access/service-accounts#default_service_account) is used.
     * 
     */
    public Output<String> getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * Optional. The URIs of service account scopes to be included in Compute Engine instances. If not specified, the following [scopes](https://cloud.google.com/compute/docs/access/service-accounts#accesscopesiam) are defined: - https://www.googleapis.com/auth/cloud-platform - https://www.googleapis.com/auth/userinfo.email If not using default scopes, you need at least: https://www.googleapis.com/auth/compute
     * 
     */
    @OutputExport(name="serviceAccountScopes", type=List.class, parameters={String.class})
    private Output<List<String>> serviceAccountScopes;

    /**
     * @return Optional. The URIs of service account scopes to be included in Compute Engine instances. If not specified, the following [scopes](https://cloud.google.com/compute/docs/access/service-accounts#accesscopesiam) are defined: - https://www.googleapis.com/auth/cloud-platform - https://www.googleapis.com/auth/userinfo.email If not using default scopes, you need at least: https://www.googleapis.com/auth/compute
     * 
     */
    public Output<List<String>> getServiceAccountScopes() {
        return this.serviceAccountScopes;
    }
    /**
     * Optional. Shielded VM configuration. [Images using supported Shielded VM features](https://cloud.google.com/compute/docs/instances/modifying-shielded-vm).
     * 
     */
    @OutputExport(name="shieldedInstanceConfig", type=ShieldedInstanceConfigResponse.class, parameters={})
    private Output<ShieldedInstanceConfigResponse> shieldedInstanceConfig;

    /**
     * @return Optional. Shielded VM configuration. [Images using supported Shielded VM features](https://cloud.google.com/compute/docs/instances/modifying-shielded-vm).
     * 
     */
    public Output<ShieldedInstanceConfigResponse> getShieldedInstanceConfig() {
        return this.shieldedInstanceConfig;
    }
    /**
     * The state of this instance.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of this instance.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The name of the subnet that this instance is in. Format: `projects/{project_id}/regions/{region}/subnetworks/{subnetwork_id}`
     * 
     */
    @OutputExport(name="subnet", type=String.class, parameters={})
    private Output<String> subnet;

    /**
     * @return The name of the subnet that this instance is in. Format: `projects/{project_id}/regions/{region}/subnetworks/{subnetwork_id}`
     * 
     */
    public Output<String> getSubnet() {
        return this.subnet;
    }
    /**
     * Optional. The Compute Engine tags to add to runtime (see [Tagging instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={String.class})
    private Output<List<String>> tags;

    /**
     * @return Optional. The Compute Engine tags to add to runtime (see [Tagging instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
     * 
     */
    public Output<List<String>> getTags() {
        return this.tags;
    }
    /**
     * Instance update time.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Instance update time.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }
    /**
     * The upgrade history of this instance.
     * 
     */
    @OutputExport(name="upgradeHistory", type=List.class, parameters={UpgradeHistoryEntryResponse.class})
    private Output<List<UpgradeHistoryEntryResponse>> upgradeHistory;

    /**
     * @return The upgrade history of this instance.
     * 
     */
    public Output<List<UpgradeHistoryEntryResponse>> getUpgradeHistory() {
        return this.upgradeHistory;
    }
    /**
     * Use a Compute Engine VM image to start the notebook instance.
     * 
     */
    @OutputExport(name="vmImage", type=VmImageResponse.class, parameters={})
    private Output<VmImageResponse> vmImage;

    /**
     * @return Use a Compute Engine VM image to start the notebook instance.
     * 
     */
    public Output<VmImageResponse> getVmImage() {
        return this.vmImage;
    }

    public interface BuilderApplicator {
        public void apply(InstanceArgs.Builder a);
    }
    private static io.pulumi.googlenative.notebooks_v1.InstanceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.notebooks_v1.InstanceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Instance(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:notebooks/v1:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Instance(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:notebooks/v1:Instance", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static Instance get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, options);
    }
}
