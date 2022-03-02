// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.container.AzureNodePoolArgs;
import io.pulumi.gcp.container.inputs.AzureNodePoolState;
import io.pulumi.gcp.container.outputs.AzureNodePoolAutoscaling;
import io.pulumi.gcp.container.outputs.AzureNodePoolConfig;
import io.pulumi.gcp.container.outputs.AzureNodePoolMaxPodsConstraint;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * An Anthos node pool running on Azure.
 * 
 * For more information, see:
 * * [Multicloud overview](https://cloud.google.com/anthos/clusters/docs/multi-cloud)
 * ## Example Usage
 * 
 * ## Import
 * 
 * NodePool can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:container/azureNodePool:AzureNodePool default projects/{{project}}/locations/{{location}}/azureClusters/{{cluster}}/azureNodePools/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:container/azureNodePool:AzureNodePool default {{project}}/{{location}}/{{cluster}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:container/azureNodePool:AzureNodePool default {{location}}/{{cluster}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:container/azureNodePool:AzureNodePool")
public class AzureNodePool extends io.pulumi.resources.CustomResource {
    /**
     * Optional. Annotations on the node pool. This field has the same restrictions as Kubernetes annotations. The total size of all keys and values combined is limited to 256k. Keys can have 2 segments: prefix (optional) and name (required), separated by a slash (/). Prefix must be a DNS subdomain. Name must be 63 characters or less, begin and end with alphanumerics, with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    @OutputExport(name="annotations", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> annotations;

    /**
     * @return Optional. Annotations on the node pool. This field has the same restrictions as Kubernetes annotations. The total size of all keys and values combined is limited to 256k. Keys can have 2 segments: prefix (optional) and name (required), separated by a slash (/). Prefix must be a DNS subdomain. Name must be 63 characters or less, begin and end with alphanumerics, with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getAnnotations() {
        return this.annotations;
    }
    /**
     * Required. Autoscaler configuration for this node pool.
     * 
     */
    @OutputExport(name="autoscaling", type=AzureNodePoolAutoscaling.class, parameters={})
    private Output<AzureNodePoolAutoscaling> autoscaling;

    /**
     * @return Required. Autoscaler configuration for this node pool.
     * 
     */
    public Output<AzureNodePoolAutoscaling> getAutoscaling() {
        return this.autoscaling;
    }
    /**
     * Optional. The Azure availability zone of the nodes in this nodepool. When unspecified, it defaults to `1`.
     * 
     */
    @OutputExport(name="azureAvailabilityZone", type=String.class, parameters={})
    private Output<String> azureAvailabilityZone;

    /**
     * @return Optional. The Azure availability zone of the nodes in this nodepool. When unspecified, it defaults to `1`.
     * 
     */
    public Output<String> getAzureAvailabilityZone() {
        return this.azureAvailabilityZone;
    }
    /**
     * The azureCluster for the resource
     * 
     */
    @OutputExport(name="cluster", type=String.class, parameters={})
    private Output<String> cluster;

    /**
     * @return The azureCluster for the resource
     * 
     */
    public Output<String> getCluster() {
        return this.cluster;
    }
    /**
     * Required. The node configuration of the node pool.
     * 
     */
    @OutputExport(name="config", type=AzureNodePoolConfig.class, parameters={})
    private Output<AzureNodePoolConfig> config;

    /**
     * @return Required. The node configuration of the node pool.
     * 
     */
    public Output<AzureNodePoolConfig> getConfig() {
        return this.config;
    }
    /**
     * Output only. The time at which this node pool was created.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Output only. The time at which this node pool was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Allows clients to perform consistent read-modify-writes through optimistic concurrency control. May be sent on update
     * and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Allows clients to perform consistent read-modify-writes through optimistic concurrency control. May be sent on update
     * and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The location for the resource
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location for the resource
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Required. The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool.
     * 
     */
    @OutputExport(name="maxPodsConstraint", type=AzureNodePoolMaxPodsConstraint.class, parameters={})
    private Output<AzureNodePoolMaxPodsConstraint> maxPodsConstraint;

    /**
     * @return Required. The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool.
     * 
     */
    public Output<AzureNodePoolMaxPodsConstraint> getMaxPodsConstraint() {
        return this.maxPodsConstraint;
    }
    /**
     * The name of this resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of this resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The project for the resource
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project for the resource
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Output only. If set, there are currently pending changes to the node pool.
     * 
     */
    @OutputExport(name="reconciling", type=Boolean.class, parameters={})
    private Output<Boolean> reconciling;

    /**
     * @return Output only. If set, there are currently pending changes to the node pool.
     * 
     */
    public Output<Boolean> getReconciling() {
        return this.reconciling;
    }
    /**
     * Output only. The current state of the node pool. Possible values: STATE_UNSPECIFIED, PROVISIONING, RUNNING, RECONCILING,
     * STOPPING, ERROR, DEGRADED
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Output only. The current state of the node pool. Possible values: STATE_UNSPECIFIED, PROVISIONING, RUNNING, RECONCILING,
     * STOPPING, ERROR, DEGRADED
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Required. The ARM ID of the subnet where the node pool VMs run. Make sure it's a subnet under the virtual network in the cluster configuration.
     * 
     */
    @OutputExport(name="subnetId", type=String.class, parameters={})
    private Output<String> subnetId;

    /**
     * @return Required. The ARM ID of the subnet where the node pool VMs run. Make sure it's a subnet under the virtual network in the cluster configuration.
     * 
     */
    public Output<String> getSubnetId() {
        return this.subnetId;
    }
    /**
     * Output only. A globally unique identifier for the node pool.
     * 
     */
    @OutputExport(name="uid", type=String.class, parameters={})
    private Output<String> uid;

    /**
     * @return Output only. A globally unique identifier for the node pool.
     * 
     */
    public Output<String> getUid() {
        return this.uid;
    }
    /**
     * Output only. The time at which this node pool was last updated.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Output only. The time at which this node pool was last updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }
    /**
     * Required. The Kubernetes version (e.g. `1.19.10-gke.1000`) running on this node pool.
     * 
     */
    @OutputExport(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return Required. The Kubernetes version (e.g. `1.19.10-gke.1000`) running on this node pool.
     * 
     */
    public Output<String> getVersion() {
        return this.version;
    }

    public interface BuilderApplicator {
        public void apply(AzureNodePoolArgs.Builder a);
    }
    private static io.pulumi.gcp.container.AzureNodePoolArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.container.AzureNodePoolArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AzureNodePool(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AzureNodePool(String name) {
        this(name, AzureNodePoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AzureNodePool(String name, AzureNodePoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AzureNodePool(String name, AzureNodePoolArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:container/azureNodePool:AzureNodePool", name, args == null ? AzureNodePoolArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AzureNodePool(String name, Input<String> id, @Nullable AzureNodePoolState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:container/azureNodePool:AzureNodePool", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AzureNodePool get(String name, Input<String> id, @Nullable AzureNodePoolState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AzureNodePool(name, id, state, options);
    }
}
