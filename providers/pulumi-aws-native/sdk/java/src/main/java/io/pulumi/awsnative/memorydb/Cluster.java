// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.memorydb;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.memorydb.ClusterArgs;
import io.pulumi.awsnative.memorydb.outputs.ClusterEndpoint;
import io.pulumi.awsnative.memorydb.outputs.ClusterTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The AWS::MemoryDB::Cluster resource creates an Amazon MemoryDB Cluster.
 * 
 */
@ResourceType(type="aws-native:memorydb:Cluster")
public class Cluster extends io.pulumi.resources.CustomResource {
    /**
     * The name of the Access Control List to associate with the cluster.
     * 
     */
    @OutputExport(name="aCLName", type=String.class, parameters={})
    private Output<String> aCLName;

    /**
     * @return The name of the Access Control List to associate with the cluster.
     * 
     */
    public Output<String> getACLName() {
        return this.aCLName;
    }
    /**
     * The Amazon Resource Name (ARN) of the cluster.
     * 
     */
    @OutputExport(name="aRN", type=String.class, parameters={})
    private Output<String> aRN;

    /**
     * @return The Amazon Resource Name (ARN) of the cluster.
     * 
     */
    public Output<String> getARN() {
        return this.aRN;
    }
    /**
     * A flag that enables automatic minor version upgrade when set to true.
     * 
     * You cannot modify the value of AutoMinorVersionUpgrade after the cluster is created. To enable AutoMinorVersionUpgrade on a cluster you must set AutoMinorVersionUpgrade to true when you create a cluster.
     * 
     */
    @OutputExport(name="autoMinorVersionUpgrade", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoMinorVersionUpgrade;

    /**
     * @return A flag that enables automatic minor version upgrade when set to true.
     * 
     * You cannot modify the value of AutoMinorVersionUpgrade after the cluster is created. To enable AutoMinorVersionUpgrade on a cluster you must set AutoMinorVersionUpgrade to true when you create a cluster.
     * 
     */
    public Output</* @Nullable */ Boolean> getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }
    /**
     * The cluster endpoint.
     * 
     */
    @OutputExport(name="clusterEndpoint", type=ClusterEndpoint.class, parameters={})
    private Output</* @Nullable */ ClusterEndpoint> clusterEndpoint;

    /**
     * @return The cluster endpoint.
     * 
     */
    public Output</* @Nullable */ ClusterEndpoint> getClusterEndpoint() {
        return this.clusterEndpoint;
    }
    /**
     * The name of the cluster. This value must be unique as it also serves as the cluster identifier.
     * 
     */
    @OutputExport(name="clusterName", type=String.class, parameters={})
    private Output<String> clusterName;

    /**
     * @return The name of the cluster. This value must be unique as it also serves as the cluster identifier.
     * 
     */
    public Output<String> getClusterName() {
        return this.clusterName;
    }
    /**
     * An optional description of the cluster.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of the cluster.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The Redis engine version used by the cluster.
     * 
     */
    @OutputExport(name="engineVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> engineVersion;

    /**
     * @return The Redis engine version used by the cluster.
     * 
     */
    public Output</* @Nullable */ String> getEngineVersion() {
        return this.engineVersion;
    }
    /**
     * The user-supplied name of a final cluster snapshot. This is the unique name that identifies the snapshot. MemoryDB creates the snapshot, and then deletes the cluster immediately afterward.
     * 
     */
    @OutputExport(name="finalSnapshotName", type=String.class, parameters={})
    private Output</* @Nullable */ String> finalSnapshotName;

    /**
     * @return The user-supplied name of a final cluster snapshot. This is the unique name that identifies the snapshot. MemoryDB creates the snapshot, and then deletes the cluster immediately afterward.
     * 
     */
    public Output</* @Nullable */ String> getFinalSnapshotName() {
        return this.finalSnapshotName;
    }
    /**
     * The ID of the KMS key used to encrypt the cluster.
     * 
     */
    @OutputExport(name="kmsKeyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyId;

    /**
     * @return The ID of the KMS key used to encrypt the cluster.
     * 
     */
    public Output</* @Nullable */ String> getKmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period.
     * 
     */
    @OutputExport(name="maintenanceWindow", type=String.class, parameters={})
    private Output</* @Nullable */ String> maintenanceWindow;

    /**
     * @return Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period.
     * 
     */
    public Output</* @Nullable */ String> getMaintenanceWindow() {
        return this.maintenanceWindow;
    }
    /**
     * The compute and memory capacity of the nodes in the cluster.
     * 
     */
    @OutputExport(name="nodeType", type=String.class, parameters={})
    private Output<String> nodeType;

    /**
     * @return The compute and memory capacity of the nodes in the cluster.
     * 
     */
    public Output<String> getNodeType() {
        return this.nodeType;
    }
    /**
     * The number of replicas to apply to each shard. The limit is 5.
     * 
     */
    @OutputExport(name="numReplicasPerShard", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> numReplicasPerShard;

    /**
     * @return The number of replicas to apply to each shard. The limit is 5.
     * 
     */
    public Output</* @Nullable */ Integer> getNumReplicasPerShard() {
        return this.numReplicasPerShard;
    }
    /**
     * The number of shards the cluster will contain.
     * 
     */
    @OutputExport(name="numShards", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> numShards;

    /**
     * @return The number of shards the cluster will contain.
     * 
     */
    public Output</* @Nullable */ Integer> getNumShards() {
        return this.numShards;
    }
    /**
     * The name of the parameter group associated with the cluster.
     * 
     */
    @OutputExport(name="parameterGroupName", type=String.class, parameters={})
    private Output</* @Nullable */ String> parameterGroupName;

    /**
     * @return The name of the parameter group associated with the cluster.
     * 
     */
    public Output</* @Nullable */ String> getParameterGroupName() {
        return this.parameterGroupName;
    }
    /**
     * The status of the parameter group used by the cluster.
     * 
     */
    @OutputExport(name="parameterGroupStatus", type=String.class, parameters={})
    private Output<String> parameterGroupStatus;

    /**
     * @return The status of the parameter group used by the cluster.
     * 
     */
    public Output<String> getParameterGroupStatus() {
        return this.parameterGroupStatus;
    }
    /**
     * The port number on which each member of the cluster accepts connections.
     * 
     */
    @OutputExport(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    /**
     * @return The port number on which each member of the cluster accepts connections.
     * 
     */
    public Output</* @Nullable */ Integer> getPort() {
        return this.port;
    }
    /**
     * One or more Amazon VPC security groups associated with this cluster.
     * 
     */
    @OutputExport(name="securityGroupIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> securityGroupIds;

    /**
     * @return One or more Amazon VPC security groups associated with this cluster.
     * 
     */
    public Output</* @Nullable */ List<String>> getSecurityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * A list of Amazon Resource Names (ARN) that uniquely identify the RDB snapshot files stored in Amazon S3. The snapshot files are used to populate the new cluster. The Amazon S3 object name in the ARN cannot contain any commas.
     * 
     */
    @OutputExport(name="snapshotArns", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> snapshotArns;

    /**
     * @return A list of Amazon Resource Names (ARN) that uniquely identify the RDB snapshot files stored in Amazon S3. The snapshot files are used to populate the new cluster. The Amazon S3 object name in the ARN cannot contain any commas.
     * 
     */
    public Output</* @Nullable */ List<String>> getSnapshotArns() {
        return this.snapshotArns;
    }
    /**
     * The name of a snapshot from which to restore data into the new cluster. The snapshot status changes to restoring while the new cluster is being created.
     * 
     */
    @OutputExport(name="snapshotName", type=String.class, parameters={})
    private Output</* @Nullable */ String> snapshotName;

    /**
     * @return The name of a snapshot from which to restore data into the new cluster. The snapshot status changes to restoring while the new cluster is being created.
     * 
     */
    public Output</* @Nullable */ String> getSnapshotName() {
        return this.snapshotName;
    }
    /**
     * The number of days for which MemoryDB retains automatic snapshots before deleting them. For example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.
     * 
     */
    @OutputExport(name="snapshotRetentionLimit", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> snapshotRetentionLimit;

    /**
     * @return The number of days for which MemoryDB retains automatic snapshots before deleting them. For example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.
     * 
     */
    public Output</* @Nullable */ Integer> getSnapshotRetentionLimit() {
        return this.snapshotRetentionLimit;
    }
    /**
     * The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your cluster.
     * 
     */
    @OutputExport(name="snapshotWindow", type=String.class, parameters={})
    private Output</* @Nullable */ String> snapshotWindow;

    /**
     * @return The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your cluster.
     * 
     */
    public Output</* @Nullable */ String> getSnapshotWindow() {
        return this.snapshotWindow;
    }
    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which notifications are sent.
     * 
     */
    @OutputExport(name="snsTopicArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> snsTopicArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which notifications are sent.
     * 
     */
    public Output</* @Nullable */ String> getSnsTopicArn() {
        return this.snsTopicArn;
    }
    /**
     * The status of the Amazon SNS notification topic. Notifications are sent only if the status is enabled.
     * 
     */
    @OutputExport(name="snsTopicStatus", type=String.class, parameters={})
    private Output</* @Nullable */ String> snsTopicStatus;

    /**
     * @return The status of the Amazon SNS notification topic. Notifications are sent only if the status is enabled.
     * 
     */
    public Output</* @Nullable */ String> getSnsTopicStatus() {
        return this.snsTopicStatus;
    }
    /**
     * The status of the cluster. For example, Available, Updating, Creating.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the cluster. For example, Available, Updating, Creating.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * The name of the subnet group to be used for the cluster.
     * 
     */
    @OutputExport(name="subnetGroupName", type=String.class, parameters={})
    private Output</* @Nullable */ String> subnetGroupName;

    /**
     * @return The name of the subnet group to be used for the cluster.
     * 
     */
    public Output</* @Nullable */ String> getSubnetGroupName() {
        return this.subnetGroupName;
    }
    /**
     * A flag that enables in-transit encryption when set to true.
     * 
     * You cannot modify the value of TransitEncryptionEnabled after the cluster is created. To enable in-transit encryption on a cluster you must set TransitEncryptionEnabled to true when you create a cluster.
     * 
     */
    @OutputExport(name="tLSEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> tLSEnabled;

    /**
     * @return A flag that enables in-transit encryption when set to true.
     * 
     * You cannot modify the value of TransitEncryptionEnabled after the cluster is created. To enable in-transit encryption on a cluster you must set TransitEncryptionEnabled to true when you create a cluster.
     * 
     */
    public Output</* @Nullable */ Boolean> getTLSEnabled() {
        return this.tLSEnabled;
    }
    /**
     * An array of key-value pairs to apply to this cluster.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={ClusterTag.class})
    private Output</* @Nullable */ List<ClusterTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this cluster.
     * 
     */
    public Output</* @Nullable */ List<ClusterTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, ClusterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:memorydb:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Cluster(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:memorydb:Cluster", name, null, makeResourceOptions(options, id));
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
    public static Cluster get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, options);
    }
}
