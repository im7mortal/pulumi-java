// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.redis_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.redis_v1.enums.InstanceConnectMode;
import com.pulumi.googlenative.redis_v1.enums.InstanceReadReplicasMode;
import com.pulumi.googlenative.redis_v1.enums.InstanceTier;
import com.pulumi.googlenative.redis_v1.enums.InstanceTransitEncryptionMode;
import com.pulumi.googlenative.redis_v1.inputs.MaintenancePolicyArgs;
import com.pulumi.googlenative.redis_v1.inputs.PersistenceConfigArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * Optional. If specified, at least one node will be provisioned in this zone in addition to the zone specified in location_id. Only applicable to standard tier. If provided, it must be a different zone from the one provided in [location_id]. Additional nodes beyond the first 2 will be placed in zones selected by the service.
     * 
     */
    @Import(name="alternativeLocationId")
    private @Nullable Output<String> alternativeLocationId;

    /**
     * @return Optional. If specified, at least one node will be provisioned in this zone in addition to the zone specified in location_id. Only applicable to standard tier. If provided, it must be a different zone from the one provided in [location_id]. Additional nodes beyond the first 2 will be placed in zones selected by the service.
     * 
     */
    public Optional<Output<String>> alternativeLocationId() {
        return Optional.ofNullable(this.alternativeLocationId);
    }

    /**
     * Optional. Indicates whether OSS Redis AUTH is enabled for the instance. If set to &#34;true&#34; AUTH is enabled on the instance. Default value is &#34;false&#34; meaning AUTH is disabled.
     * 
     */
    @Import(name="authEnabled")
    private @Nullable Output<Boolean> authEnabled;

    /**
     * @return Optional. Indicates whether OSS Redis AUTH is enabled for the instance. If set to &#34;true&#34; AUTH is enabled on the instance. Default value is &#34;false&#34; meaning AUTH is disabled.
     * 
     */
    public Optional<Output<Boolean>> authEnabled() {
        return Optional.ofNullable(this.authEnabled);
    }

    /**
     * Optional. The full name of the Google Compute Engine [network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected. If left unspecified, the `default` network will be used.
     * 
     */
    @Import(name="authorizedNetwork")
    private @Nullable Output<String> authorizedNetwork;

    /**
     * @return Optional. The full name of the Google Compute Engine [network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected. If left unspecified, the `default` network will be used.
     * 
     */
    public Optional<Output<String>> authorizedNetwork() {
        return Optional.ofNullable(this.authorizedNetwork);
    }

    /**
     * Optional. The network connect mode of the Redis instance. If not provided, the connect mode defaults to DIRECT_PEERING.
     * 
     */
    @Import(name="connectMode")
    private @Nullable Output<InstanceConnectMode> connectMode;

    /**
     * @return Optional. The network connect mode of the Redis instance. If not provided, the connect mode defaults to DIRECT_PEERING.
     * 
     */
    public Optional<Output<InstanceConnectMode>> connectMode() {
        return Optional.ofNullable(this.connectMode);
    }

    /**
     * An arbitrary and optional user-provided name for the instance.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return An arbitrary and optional user-provided name for the instance.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Required. The logical name of the Redis instance in the customer project with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-40 characters. * Must end with a number or a letter. * Must be unique within the customer project / location
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return Required. The logical name of the Redis instance in the customer project with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-40 characters. * Must end with a number or a letter. * Must be unique within the customer project / location
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * Resource labels to represent user provided metadata
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Resource labels to represent user provided metadata
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Optional. The zone where the instance will be provisioned. If not provided, the service will choose a zone from the specified region for the instance. For standard tier, additional nodes will be added across multiple zones for protection against zonal failures. If specified, at least one node will be provisioned in this zone.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Optional. The zone where the instance will be provisioned. If not provided, the service will choose a zone from the specified region for the instance. For standard tier, additional nodes will be added across multiple zones for protection against zonal failures. If specified, at least one node will be provisioned in this zone.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Optional. The maintenance policy for the instance. If not provided, maintenance events can be performed at any time.
     * 
     */
    @Import(name="maintenancePolicy")
    private @Nullable Output<MaintenancePolicyArgs> maintenancePolicy;

    /**
     * @return Optional. The maintenance policy for the instance. If not provided, maintenance events can be performed at any time.
     * 
     */
    public Optional<Output<MaintenancePolicyArgs>> maintenancePolicy() {
        return Optional.ofNullable(this.maintenancePolicy);
    }

    /**
     * Redis memory size in GiB.
     * 
     */
    @Import(name="memorySizeGb", required=true)
    private Output<Integer> memorySizeGb;

    /**
     * @return Redis memory size in GiB.
     * 
     */
    public Output<Integer> memorySizeGb() {
        return this.memorySizeGb;
    }

    /**
     * Unique name of the resource in this scope including project and location using the form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` Note: Redis instances are managed and addressed at regional level so location_id here refers to a GCP region; however, users may choose which specific zone (or collection of zones for cross-zone instances) an instance should be provisioned in. Refer to location_id and alternative_location_id fields for more details.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Unique name of the resource in this scope including project and location using the form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` Note: Redis instances are managed and addressed at regional level so location_id here refers to a GCP region; however, users may choose which specific zone (or collection of zones for cross-zone instances) an instance should be provisioned in. Refer to location_id and alternative_location_id fields for more details.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Optional. Persistence configuration parameters
     * 
     */
    @Import(name="persistenceConfig")
    private @Nullable Output<PersistenceConfigArgs> persistenceConfig;

    /**
     * @return Optional. Persistence configuration parameters
     * 
     */
    public Optional<Output<PersistenceConfigArgs>> persistenceConfig() {
        return Optional.ofNullable(this.persistenceConfig);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Optional. Read replicas mode for the instance. Defaults to READ_REPLICAS_DISABLED.
     * 
     */
    @Import(name="readReplicasMode")
    private @Nullable Output<InstanceReadReplicasMode> readReplicasMode;

    /**
     * @return Optional. Read replicas mode for the instance. Defaults to READ_REPLICAS_DISABLED.
     * 
     */
    public Optional<Output<InstanceReadReplicasMode>> readReplicasMode() {
        return Optional.ofNullable(this.readReplicasMode);
    }

    /**
     * Optional. Redis configuration parameters, according to http://redis.io/topics/config. Currently, the only supported parameters are: Redis version 3.2 and newer: * maxmemory-policy * notify-keyspace-events Redis version 4.0 and newer: * activedefrag * lfu-decay-time * lfu-log-factor * maxmemory-gb Redis version 5.0 and newer: * stream-node-max-bytes * stream-node-max-entries
     * 
     */
    @Import(name="redisConfigs")
    private @Nullable Output<Map<String,String>> redisConfigs;

    /**
     * @return Optional. Redis configuration parameters, according to http://redis.io/topics/config. Currently, the only supported parameters are: Redis version 3.2 and newer: * maxmemory-policy * notify-keyspace-events Redis version 4.0 and newer: * activedefrag * lfu-decay-time * lfu-log-factor * maxmemory-gb Redis version 5.0 and newer: * stream-node-max-bytes * stream-node-max-entries
     * 
     */
    public Optional<Output<Map<String,String>>> redisConfigs() {
        return Optional.ofNullable(this.redisConfigs);
    }

    /**
     * Optional. The version of Redis software. If not provided, latest supported version will be used. Currently, the supported values are: * `REDIS_3_2` for Redis 3.2 compatibility * `REDIS_4_0` for Redis 4.0 compatibility (default) * `REDIS_5_0` for Redis 5.0 compatibility * `REDIS_6_X` for Redis 6.x compatibility
     * 
     */
    @Import(name="redisVersion")
    private @Nullable Output<String> redisVersion;

    /**
     * @return Optional. The version of Redis software. If not provided, latest supported version will be used. Currently, the supported values are: * `REDIS_3_2` for Redis 3.2 compatibility * `REDIS_4_0` for Redis 4.0 compatibility (default) * `REDIS_5_0` for Redis 5.0 compatibility * `REDIS_6_X` for Redis 6.x compatibility
     * 
     */
    public Optional<Output<String>> redisVersion() {
        return Optional.ofNullable(this.redisVersion);
    }

    /**
     * Optional. The number of replica nodes. The valid range for the Standard Tier with read replicas enabled is [1-5] and defaults to 2. If read replicas are not enabled for a Standard Tier instance, the only valid value is 1 and the default is 1. The valid value for basic tier is 0 and the default is also 0.
     * 
     */
    @Import(name="replicaCount")
    private @Nullable Output<Integer> replicaCount;

    /**
     * @return Optional. The number of replica nodes. The valid range for the Standard Tier with read replicas enabled is [1-5] and defaults to 2. If read replicas are not enabled for a Standard Tier instance, the only valid value is 1 and the default is 1. The valid value for basic tier is 0 and the default is also 0.
     * 
     */
    public Optional<Output<Integer>> replicaCount() {
        return Optional.ofNullable(this.replicaCount);
    }

    /**
     * Optional. For DIRECT_PEERING mode, the CIDR range of internal addresses that are reserved for this instance. Range must be unique and non-overlapping with existing subnets in an authorized network. For PRIVATE_SERVICE_ACCESS mode, the name of one allocated IP address ranges associated with this private service access connection. If not provided, the service will choose an unused /29 block, for example, 10.0.0.0/29 or 192.168.0.0/29. For READ_REPLICAS_ENABLED the default block size is /28.
     * 
     */
    @Import(name="reservedIpRange")
    private @Nullable Output<String> reservedIpRange;

    /**
     * @return Optional. For DIRECT_PEERING mode, the CIDR range of internal addresses that are reserved for this instance. Range must be unique and non-overlapping with existing subnets in an authorized network. For PRIVATE_SERVICE_ACCESS mode, the name of one allocated IP address ranges associated with this private service access connection. If not provided, the service will choose an unused /29 block, for example, 10.0.0.0/29 or 192.168.0.0/29. For READ_REPLICAS_ENABLED the default block size is /28.
     * 
     */
    public Optional<Output<String>> reservedIpRange() {
        return Optional.ofNullable(this.reservedIpRange);
    }

    /**
     * Optional. Additional IP range for node placement. Required when enabling read replicas on an existing instance. For DIRECT_PEERING mode value must be a CIDR range of size /28, or &#34;auto&#34;. For PRIVATE_SERVICE_ACCESS mode value must be the name of an allocated address range associated with the private service access connection, or &#34;auto&#34;.
     * 
     */
    @Import(name="secondaryIpRange")
    private @Nullable Output<String> secondaryIpRange;

    /**
     * @return Optional. Additional IP range for node placement. Required when enabling read replicas on an existing instance. For DIRECT_PEERING mode value must be a CIDR range of size /28, or &#34;auto&#34;. For PRIVATE_SERVICE_ACCESS mode value must be the name of an allocated address range associated with the private service access connection, or &#34;auto&#34;.
     * 
     */
    public Optional<Output<String>> secondaryIpRange() {
        return Optional.ofNullable(this.secondaryIpRange);
    }

    /**
     * The service tier of the instance.
     * 
     */
    @Import(name="tier", required=true)
    private Output<InstanceTier> tier;

    /**
     * @return The service tier of the instance.
     * 
     */
    public Output<InstanceTier> tier() {
        return this.tier;
    }

    /**
     * Optional. The TLS mode of the Redis instance. If not provided, TLS is disabled for the instance.
     * 
     */
    @Import(name="transitEncryptionMode")
    private @Nullable Output<InstanceTransitEncryptionMode> transitEncryptionMode;

    /**
     * @return Optional. The TLS mode of the Redis instance. If not provided, TLS is disabled for the instance.
     * 
     */
    public Optional<Output<InstanceTransitEncryptionMode>> transitEncryptionMode() {
        return Optional.ofNullable(this.transitEncryptionMode);
    }

    private InstanceArgs() {}

    private InstanceArgs(InstanceArgs $) {
        this.alternativeLocationId = $.alternativeLocationId;
        this.authEnabled = $.authEnabled;
        this.authorizedNetwork = $.authorizedNetwork;
        this.connectMode = $.connectMode;
        this.displayName = $.displayName;
        this.instanceId = $.instanceId;
        this.labels = $.labels;
        this.location = $.location;
        this.maintenancePolicy = $.maintenancePolicy;
        this.memorySizeGb = $.memorySizeGb;
        this.name = $.name;
        this.persistenceConfig = $.persistenceConfig;
        this.project = $.project;
        this.readReplicasMode = $.readReplicasMode;
        this.redisConfigs = $.redisConfigs;
        this.redisVersion = $.redisVersion;
        this.replicaCount = $.replicaCount;
        this.reservedIpRange = $.reservedIpRange;
        this.secondaryIpRange = $.secondaryIpRange;
        this.tier = $.tier;
        this.transitEncryptionMode = $.transitEncryptionMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceArgs $;

        public Builder() {
            $ = new InstanceArgs();
        }

        public Builder(InstanceArgs defaults) {
            $ = new InstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alternativeLocationId Optional. If specified, at least one node will be provisioned in this zone in addition to the zone specified in location_id. Only applicable to standard tier. If provided, it must be a different zone from the one provided in [location_id]. Additional nodes beyond the first 2 will be placed in zones selected by the service.
         * 
         * @return builder
         * 
         */
        public Builder alternativeLocationId(@Nullable Output<String> alternativeLocationId) {
            $.alternativeLocationId = alternativeLocationId;
            return this;
        }

        /**
         * @param alternativeLocationId Optional. If specified, at least one node will be provisioned in this zone in addition to the zone specified in location_id. Only applicable to standard tier. If provided, it must be a different zone from the one provided in [location_id]. Additional nodes beyond the first 2 will be placed in zones selected by the service.
         * 
         * @return builder
         * 
         */
        public Builder alternativeLocationId(String alternativeLocationId) {
            return alternativeLocationId(Output.of(alternativeLocationId));
        }

        /**
         * @param authEnabled Optional. Indicates whether OSS Redis AUTH is enabled for the instance. If set to &#34;true&#34; AUTH is enabled on the instance. Default value is &#34;false&#34; meaning AUTH is disabled.
         * 
         * @return builder
         * 
         */
        public Builder authEnabled(@Nullable Output<Boolean> authEnabled) {
            $.authEnabled = authEnabled;
            return this;
        }

        /**
         * @param authEnabled Optional. Indicates whether OSS Redis AUTH is enabled for the instance. If set to &#34;true&#34; AUTH is enabled on the instance. Default value is &#34;false&#34; meaning AUTH is disabled.
         * 
         * @return builder
         * 
         */
        public Builder authEnabled(Boolean authEnabled) {
            return authEnabled(Output.of(authEnabled));
        }

        /**
         * @param authorizedNetwork Optional. The full name of the Google Compute Engine [network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected. If left unspecified, the `default` network will be used.
         * 
         * @return builder
         * 
         */
        public Builder authorizedNetwork(@Nullable Output<String> authorizedNetwork) {
            $.authorizedNetwork = authorizedNetwork;
            return this;
        }

        /**
         * @param authorizedNetwork Optional. The full name of the Google Compute Engine [network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected. If left unspecified, the `default` network will be used.
         * 
         * @return builder
         * 
         */
        public Builder authorizedNetwork(String authorizedNetwork) {
            return authorizedNetwork(Output.of(authorizedNetwork));
        }

        /**
         * @param connectMode Optional. The network connect mode of the Redis instance. If not provided, the connect mode defaults to DIRECT_PEERING.
         * 
         * @return builder
         * 
         */
        public Builder connectMode(@Nullable Output<InstanceConnectMode> connectMode) {
            $.connectMode = connectMode;
            return this;
        }

        /**
         * @param connectMode Optional. The network connect mode of the Redis instance. If not provided, the connect mode defaults to DIRECT_PEERING.
         * 
         * @return builder
         * 
         */
        public Builder connectMode(InstanceConnectMode connectMode) {
            return connectMode(Output.of(connectMode));
        }

        /**
         * @param displayName An arbitrary and optional user-provided name for the instance.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName An arbitrary and optional user-provided name for the instance.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param instanceId Required. The logical name of the Redis instance in the customer project with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-40 characters. * Must end with a number or a letter. * Must be unique within the customer project / location
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId Required. The logical name of the Redis instance in the customer project with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-40 characters. * Must end with a number or a letter. * Must be unique within the customer project / location
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param labels Resource labels to represent user provided metadata
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Resource labels to represent user provided metadata
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param location Optional. The zone where the instance will be provisioned. If not provided, the service will choose a zone from the specified region for the instance. For standard tier, additional nodes will be added across multiple zones for protection against zonal failures. If specified, at least one node will be provisioned in this zone.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Optional. The zone where the instance will be provisioned. If not provided, the service will choose a zone from the specified region for the instance. For standard tier, additional nodes will be added across multiple zones for protection against zonal failures. If specified, at least one node will be provisioned in this zone.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param maintenancePolicy Optional. The maintenance policy for the instance. If not provided, maintenance events can be performed at any time.
         * 
         * @return builder
         * 
         */
        public Builder maintenancePolicy(@Nullable Output<MaintenancePolicyArgs> maintenancePolicy) {
            $.maintenancePolicy = maintenancePolicy;
            return this;
        }

        /**
         * @param maintenancePolicy Optional. The maintenance policy for the instance. If not provided, maintenance events can be performed at any time.
         * 
         * @return builder
         * 
         */
        public Builder maintenancePolicy(MaintenancePolicyArgs maintenancePolicy) {
            return maintenancePolicy(Output.of(maintenancePolicy));
        }

        /**
         * @param memorySizeGb Redis memory size in GiB.
         * 
         * @return builder
         * 
         */
        public Builder memorySizeGb(Output<Integer> memorySizeGb) {
            $.memorySizeGb = memorySizeGb;
            return this;
        }

        /**
         * @param memorySizeGb Redis memory size in GiB.
         * 
         * @return builder
         * 
         */
        public Builder memorySizeGb(Integer memorySizeGb) {
            return memorySizeGb(Output.of(memorySizeGb));
        }

        /**
         * @param name Unique name of the resource in this scope including project and location using the form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` Note: Redis instances are managed and addressed at regional level so location_id here refers to a GCP region; however, users may choose which specific zone (or collection of zones for cross-zone instances) an instance should be provisioned in. Refer to location_id and alternative_location_id fields for more details.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Unique name of the resource in this scope including project and location using the form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` Note: Redis instances are managed and addressed at regional level so location_id here refers to a GCP region; however, users may choose which specific zone (or collection of zones for cross-zone instances) an instance should be provisioned in. Refer to location_id and alternative_location_id fields for more details.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param persistenceConfig Optional. Persistence configuration parameters
         * 
         * @return builder
         * 
         */
        public Builder persistenceConfig(@Nullable Output<PersistenceConfigArgs> persistenceConfig) {
            $.persistenceConfig = persistenceConfig;
            return this;
        }

        /**
         * @param persistenceConfig Optional. Persistence configuration parameters
         * 
         * @return builder
         * 
         */
        public Builder persistenceConfig(PersistenceConfigArgs persistenceConfig) {
            return persistenceConfig(Output.of(persistenceConfig));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param readReplicasMode Optional. Read replicas mode for the instance. Defaults to READ_REPLICAS_DISABLED.
         * 
         * @return builder
         * 
         */
        public Builder readReplicasMode(@Nullable Output<InstanceReadReplicasMode> readReplicasMode) {
            $.readReplicasMode = readReplicasMode;
            return this;
        }

        /**
         * @param readReplicasMode Optional. Read replicas mode for the instance. Defaults to READ_REPLICAS_DISABLED.
         * 
         * @return builder
         * 
         */
        public Builder readReplicasMode(InstanceReadReplicasMode readReplicasMode) {
            return readReplicasMode(Output.of(readReplicasMode));
        }

        /**
         * @param redisConfigs Optional. Redis configuration parameters, according to http://redis.io/topics/config. Currently, the only supported parameters are: Redis version 3.2 and newer: * maxmemory-policy * notify-keyspace-events Redis version 4.0 and newer: * activedefrag * lfu-decay-time * lfu-log-factor * maxmemory-gb Redis version 5.0 and newer: * stream-node-max-bytes * stream-node-max-entries
         * 
         * @return builder
         * 
         */
        public Builder redisConfigs(@Nullable Output<Map<String,String>> redisConfigs) {
            $.redisConfigs = redisConfigs;
            return this;
        }

        /**
         * @param redisConfigs Optional. Redis configuration parameters, according to http://redis.io/topics/config. Currently, the only supported parameters are: Redis version 3.2 and newer: * maxmemory-policy * notify-keyspace-events Redis version 4.0 and newer: * activedefrag * lfu-decay-time * lfu-log-factor * maxmemory-gb Redis version 5.0 and newer: * stream-node-max-bytes * stream-node-max-entries
         * 
         * @return builder
         * 
         */
        public Builder redisConfigs(Map<String,String> redisConfigs) {
            return redisConfigs(Output.of(redisConfigs));
        }

        /**
         * @param redisVersion Optional. The version of Redis software. If not provided, latest supported version will be used. Currently, the supported values are: * `REDIS_3_2` for Redis 3.2 compatibility * `REDIS_4_0` for Redis 4.0 compatibility (default) * `REDIS_5_0` for Redis 5.0 compatibility * `REDIS_6_X` for Redis 6.x compatibility
         * 
         * @return builder
         * 
         */
        public Builder redisVersion(@Nullable Output<String> redisVersion) {
            $.redisVersion = redisVersion;
            return this;
        }

        /**
         * @param redisVersion Optional. The version of Redis software. If not provided, latest supported version will be used. Currently, the supported values are: * `REDIS_3_2` for Redis 3.2 compatibility * `REDIS_4_0` for Redis 4.0 compatibility (default) * `REDIS_5_0` for Redis 5.0 compatibility * `REDIS_6_X` for Redis 6.x compatibility
         * 
         * @return builder
         * 
         */
        public Builder redisVersion(String redisVersion) {
            return redisVersion(Output.of(redisVersion));
        }

        /**
         * @param replicaCount Optional. The number of replica nodes. The valid range for the Standard Tier with read replicas enabled is [1-5] and defaults to 2. If read replicas are not enabled for a Standard Tier instance, the only valid value is 1 and the default is 1. The valid value for basic tier is 0 and the default is also 0.
         * 
         * @return builder
         * 
         */
        public Builder replicaCount(@Nullable Output<Integer> replicaCount) {
            $.replicaCount = replicaCount;
            return this;
        }

        /**
         * @param replicaCount Optional. The number of replica nodes. The valid range for the Standard Tier with read replicas enabled is [1-5] and defaults to 2. If read replicas are not enabled for a Standard Tier instance, the only valid value is 1 and the default is 1. The valid value for basic tier is 0 and the default is also 0.
         * 
         * @return builder
         * 
         */
        public Builder replicaCount(Integer replicaCount) {
            return replicaCount(Output.of(replicaCount));
        }

        /**
         * @param reservedIpRange Optional. For DIRECT_PEERING mode, the CIDR range of internal addresses that are reserved for this instance. Range must be unique and non-overlapping with existing subnets in an authorized network. For PRIVATE_SERVICE_ACCESS mode, the name of one allocated IP address ranges associated with this private service access connection. If not provided, the service will choose an unused /29 block, for example, 10.0.0.0/29 or 192.168.0.0/29. For READ_REPLICAS_ENABLED the default block size is /28.
         * 
         * @return builder
         * 
         */
        public Builder reservedIpRange(@Nullable Output<String> reservedIpRange) {
            $.reservedIpRange = reservedIpRange;
            return this;
        }

        /**
         * @param reservedIpRange Optional. For DIRECT_PEERING mode, the CIDR range of internal addresses that are reserved for this instance. Range must be unique and non-overlapping with existing subnets in an authorized network. For PRIVATE_SERVICE_ACCESS mode, the name of one allocated IP address ranges associated with this private service access connection. If not provided, the service will choose an unused /29 block, for example, 10.0.0.0/29 or 192.168.0.0/29. For READ_REPLICAS_ENABLED the default block size is /28.
         * 
         * @return builder
         * 
         */
        public Builder reservedIpRange(String reservedIpRange) {
            return reservedIpRange(Output.of(reservedIpRange));
        }

        /**
         * @param secondaryIpRange Optional. Additional IP range for node placement. Required when enabling read replicas on an existing instance. For DIRECT_PEERING mode value must be a CIDR range of size /28, or &#34;auto&#34;. For PRIVATE_SERVICE_ACCESS mode value must be the name of an allocated address range associated with the private service access connection, or &#34;auto&#34;.
         * 
         * @return builder
         * 
         */
        public Builder secondaryIpRange(@Nullable Output<String> secondaryIpRange) {
            $.secondaryIpRange = secondaryIpRange;
            return this;
        }

        /**
         * @param secondaryIpRange Optional. Additional IP range for node placement. Required when enabling read replicas on an existing instance. For DIRECT_PEERING mode value must be a CIDR range of size /28, or &#34;auto&#34;. For PRIVATE_SERVICE_ACCESS mode value must be the name of an allocated address range associated with the private service access connection, or &#34;auto&#34;.
         * 
         * @return builder
         * 
         */
        public Builder secondaryIpRange(String secondaryIpRange) {
            return secondaryIpRange(Output.of(secondaryIpRange));
        }

        /**
         * @param tier The service tier of the instance.
         * 
         * @return builder
         * 
         */
        public Builder tier(Output<InstanceTier> tier) {
            $.tier = tier;
            return this;
        }

        /**
         * @param tier The service tier of the instance.
         * 
         * @return builder
         * 
         */
        public Builder tier(InstanceTier tier) {
            return tier(Output.of(tier));
        }

        /**
         * @param transitEncryptionMode Optional. The TLS mode of the Redis instance. If not provided, TLS is disabled for the instance.
         * 
         * @return builder
         * 
         */
        public Builder transitEncryptionMode(@Nullable Output<InstanceTransitEncryptionMode> transitEncryptionMode) {
            $.transitEncryptionMode = transitEncryptionMode;
            return this;
        }

        /**
         * @param transitEncryptionMode Optional. The TLS mode of the Redis instance. If not provided, TLS is disabled for the instance.
         * 
         * @return builder
         * 
         */
        public Builder transitEncryptionMode(InstanceTransitEncryptionMode transitEncryptionMode) {
            return transitEncryptionMode(Output.of(transitEncryptionMode));
        }

        public InstanceArgs build() {
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            $.memorySizeGb = Objects.requireNonNull($.memorySizeGb, "expected parameter 'memorySizeGb' to be non-null");
            $.tier = Objects.requireNonNull($.tier, "expected parameter 'tier' to be non-null");
            return $;
        }
    }

}
