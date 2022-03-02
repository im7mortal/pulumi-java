// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticache.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalReplicationGroupState extends io.pulumi.resources.ResourceArgs {

    public static final GlobalReplicationGroupState Empty = new GlobalReplicationGroupState();

    /**
     * (**DEPRECATED** use `engine_version_actual` instead) The full version number of the cache engine running on the members of this global replication group.
     * 
     * @Deprecated
     * Use engine_version_actual instead
     * 
     */
    @Deprecated /* Use engine_version_actual instead */
    @InputImport(name="actualEngineVersion")
      private final @Nullable Input<String> actualEngineVersion;

    @Deprecated /* Use engine_version_actual instead */
    public Input<String> getActualEngineVersion() {
        return this.actualEngineVersion == null ? Input.empty() : this.actualEngineVersion;
    }

    /**
     * The ARN of the ElastiCache Global Replication Group.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * A flag that indicate whether the encryption at rest is enabled.
     * 
     */
    @InputImport(name="atRestEncryptionEnabled")
      private final @Nullable Input<Boolean> atRestEncryptionEnabled;

    public Input<Boolean> getAtRestEncryptionEnabled() {
        return this.atRestEncryptionEnabled == null ? Input.empty() : this.atRestEncryptionEnabled;
    }

    /**
     * A flag that indicate whether AuthToken (password) is enabled.
     * 
     */
    @InputImport(name="authTokenEnabled")
      private final @Nullable Input<Boolean> authTokenEnabled;

    public Input<Boolean> getAuthTokenEnabled() {
        return this.authTokenEnabled == null ? Input.empty() : this.authTokenEnabled;
    }

    /**
     * The instance class used. See AWS documentation for information on [supported node types](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html) and [guidance on selecting node types](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/nodes-select-size.html).
     * 
     */
    @InputImport(name="cacheNodeType")
      private final @Nullable Input<String> cacheNodeType;

    public Input<String> getCacheNodeType() {
        return this.cacheNodeType == null ? Input.empty() : this.cacheNodeType;
    }

    /**
     * Indicates whether the Global Datastore is cluster enabled.
     * 
     */
    @InputImport(name="clusterEnabled")
      private final @Nullable Input<Boolean> clusterEnabled;

    public Input<Boolean> getClusterEnabled() {
        return this.clusterEnabled == null ? Input.empty() : this.clusterEnabled;
    }

    /**
     * The name of the cache engine to be used for the clusters in this global replication group.
     * 
     */
    @InputImport(name="engine")
      private final @Nullable Input<String> engine;

    public Input<String> getEngine() {
        return this.engine == null ? Input.empty() : this.engine;
    }

    /**
     * The full version number of the cache engine running on the members of this global replication group.
     * 
     */
    @InputImport(name="engineVersionActual")
      private final @Nullable Input<String> engineVersionActual;

    public Input<String> getEngineVersionActual() {
        return this.engineVersionActual == null ? Input.empty() : this.engineVersionActual;
    }

    /**
     * A user-created description for the global replication group.
     * 
     */
    @InputImport(name="globalReplicationGroupDescription")
      private final @Nullable Input<String> globalReplicationGroupDescription;

    public Input<String> getGlobalReplicationGroupDescription() {
        return this.globalReplicationGroupDescription == null ? Input.empty() : this.globalReplicationGroupDescription;
    }

    /**
     * The full ID of the global replication group.
     * 
     */
    @InputImport(name="globalReplicationGroupId")
      private final @Nullable Input<String> globalReplicationGroupId;

    public Input<String> getGlobalReplicationGroupId() {
        return this.globalReplicationGroupId == null ? Input.empty() : this.globalReplicationGroupId;
    }

    /**
     * The suffix name of a Global Datastore. If `global_replication_group_id_suffix` is changed, creates a new resource.
     * 
     */
    @InputImport(name="globalReplicationGroupIdSuffix")
      private final @Nullable Input<String> globalReplicationGroupIdSuffix;

    public Input<String> getGlobalReplicationGroupIdSuffix() {
        return this.globalReplicationGroupIdSuffix == null ? Input.empty() : this.globalReplicationGroupIdSuffix;
    }

    /**
     * The ID of the primary cluster that accepts writes and will replicate updates to the secondary cluster. If `primary_replication_group_id` is changed, creates a new resource.
     * 
     */
    @InputImport(name="primaryReplicationGroupId")
      private final @Nullable Input<String> primaryReplicationGroupId;

    public Input<String> getPrimaryReplicationGroupId() {
        return this.primaryReplicationGroupId == null ? Input.empty() : this.primaryReplicationGroupId;
    }

    /**
     * A flag that indicates whether the encryption in transit is enabled.
     * 
     */
    @InputImport(name="transitEncryptionEnabled")
      private final @Nullable Input<Boolean> transitEncryptionEnabled;

    public Input<Boolean> getTransitEncryptionEnabled() {
        return this.transitEncryptionEnabled == null ? Input.empty() : this.transitEncryptionEnabled;
    }

    public GlobalReplicationGroupState(
        @Nullable Input<String> actualEngineVersion,
        @Nullable Input<String> arn,
        @Nullable Input<Boolean> atRestEncryptionEnabled,
        @Nullable Input<Boolean> authTokenEnabled,
        @Nullable Input<String> cacheNodeType,
        @Nullable Input<Boolean> clusterEnabled,
        @Nullable Input<String> engine,
        @Nullable Input<String> engineVersionActual,
        @Nullable Input<String> globalReplicationGroupDescription,
        @Nullable Input<String> globalReplicationGroupId,
        @Nullable Input<String> globalReplicationGroupIdSuffix,
        @Nullable Input<String> primaryReplicationGroupId,
        @Nullable Input<Boolean> transitEncryptionEnabled) {
        this.actualEngineVersion = actualEngineVersion;
        this.arn = arn;
        this.atRestEncryptionEnabled = atRestEncryptionEnabled;
        this.authTokenEnabled = authTokenEnabled;
        this.cacheNodeType = cacheNodeType;
        this.clusterEnabled = clusterEnabled;
        this.engine = engine;
        this.engineVersionActual = engineVersionActual;
        this.globalReplicationGroupDescription = globalReplicationGroupDescription;
        this.globalReplicationGroupId = globalReplicationGroupId;
        this.globalReplicationGroupIdSuffix = globalReplicationGroupIdSuffix;
        this.primaryReplicationGroupId = primaryReplicationGroupId;
        this.transitEncryptionEnabled = transitEncryptionEnabled;
    }

    private GlobalReplicationGroupState() {
        this.actualEngineVersion = Input.empty();
        this.arn = Input.empty();
        this.atRestEncryptionEnabled = Input.empty();
        this.authTokenEnabled = Input.empty();
        this.cacheNodeType = Input.empty();
        this.clusterEnabled = Input.empty();
        this.engine = Input.empty();
        this.engineVersionActual = Input.empty();
        this.globalReplicationGroupDescription = Input.empty();
        this.globalReplicationGroupId = Input.empty();
        this.globalReplicationGroupIdSuffix = Input.empty();
        this.primaryReplicationGroupId = Input.empty();
        this.transitEncryptionEnabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalReplicationGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> actualEngineVersion;
        private @Nullable Input<String> arn;
        private @Nullable Input<Boolean> atRestEncryptionEnabled;
        private @Nullable Input<Boolean> authTokenEnabled;
        private @Nullable Input<String> cacheNodeType;
        private @Nullable Input<Boolean> clusterEnabled;
        private @Nullable Input<String> engine;
        private @Nullable Input<String> engineVersionActual;
        private @Nullable Input<String> globalReplicationGroupDescription;
        private @Nullable Input<String> globalReplicationGroupId;
        private @Nullable Input<String> globalReplicationGroupIdSuffix;
        private @Nullable Input<String> primaryReplicationGroupId;
        private @Nullable Input<Boolean> transitEncryptionEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalReplicationGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actualEngineVersion = defaults.actualEngineVersion;
    	      this.arn = defaults.arn;
    	      this.atRestEncryptionEnabled = defaults.atRestEncryptionEnabled;
    	      this.authTokenEnabled = defaults.authTokenEnabled;
    	      this.cacheNodeType = defaults.cacheNodeType;
    	      this.clusterEnabled = defaults.clusterEnabled;
    	      this.engine = defaults.engine;
    	      this.engineVersionActual = defaults.engineVersionActual;
    	      this.globalReplicationGroupDescription = defaults.globalReplicationGroupDescription;
    	      this.globalReplicationGroupId = defaults.globalReplicationGroupId;
    	      this.globalReplicationGroupIdSuffix = defaults.globalReplicationGroupIdSuffix;
    	      this.primaryReplicationGroupId = defaults.primaryReplicationGroupId;
    	      this.transitEncryptionEnabled = defaults.transitEncryptionEnabled;
        }

        public Builder setActualEngineVersion(@Nullable Input<String> actualEngineVersion) {
            this.actualEngineVersion = actualEngineVersion;
            return this;
        }

        public Builder setActualEngineVersion(@Nullable String actualEngineVersion) {
            this.actualEngineVersion = Input.ofNullable(actualEngineVersion);
            return this;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setAtRestEncryptionEnabled(@Nullable Input<Boolean> atRestEncryptionEnabled) {
            this.atRestEncryptionEnabled = atRestEncryptionEnabled;
            return this;
        }

        public Builder setAtRestEncryptionEnabled(@Nullable Boolean atRestEncryptionEnabled) {
            this.atRestEncryptionEnabled = Input.ofNullable(atRestEncryptionEnabled);
            return this;
        }

        public Builder setAuthTokenEnabled(@Nullable Input<Boolean> authTokenEnabled) {
            this.authTokenEnabled = authTokenEnabled;
            return this;
        }

        public Builder setAuthTokenEnabled(@Nullable Boolean authTokenEnabled) {
            this.authTokenEnabled = Input.ofNullable(authTokenEnabled);
            return this;
        }

        public Builder setCacheNodeType(@Nullable Input<String> cacheNodeType) {
            this.cacheNodeType = cacheNodeType;
            return this;
        }

        public Builder setCacheNodeType(@Nullable String cacheNodeType) {
            this.cacheNodeType = Input.ofNullable(cacheNodeType);
            return this;
        }

        public Builder setClusterEnabled(@Nullable Input<Boolean> clusterEnabled) {
            this.clusterEnabled = clusterEnabled;
            return this;
        }

        public Builder setClusterEnabled(@Nullable Boolean clusterEnabled) {
            this.clusterEnabled = Input.ofNullable(clusterEnabled);
            return this;
        }

        public Builder setEngine(@Nullable Input<String> engine) {
            this.engine = engine;
            return this;
        }

        public Builder setEngine(@Nullable String engine) {
            this.engine = Input.ofNullable(engine);
            return this;
        }

        public Builder setEngineVersionActual(@Nullable Input<String> engineVersionActual) {
            this.engineVersionActual = engineVersionActual;
            return this;
        }

        public Builder setEngineVersionActual(@Nullable String engineVersionActual) {
            this.engineVersionActual = Input.ofNullable(engineVersionActual);
            return this;
        }

        public Builder setGlobalReplicationGroupDescription(@Nullable Input<String> globalReplicationGroupDescription) {
            this.globalReplicationGroupDescription = globalReplicationGroupDescription;
            return this;
        }

        public Builder setGlobalReplicationGroupDescription(@Nullable String globalReplicationGroupDescription) {
            this.globalReplicationGroupDescription = Input.ofNullable(globalReplicationGroupDescription);
            return this;
        }

        public Builder setGlobalReplicationGroupId(@Nullable Input<String> globalReplicationGroupId) {
            this.globalReplicationGroupId = globalReplicationGroupId;
            return this;
        }

        public Builder setGlobalReplicationGroupId(@Nullable String globalReplicationGroupId) {
            this.globalReplicationGroupId = Input.ofNullable(globalReplicationGroupId);
            return this;
        }

        public Builder setGlobalReplicationGroupIdSuffix(@Nullable Input<String> globalReplicationGroupIdSuffix) {
            this.globalReplicationGroupIdSuffix = globalReplicationGroupIdSuffix;
            return this;
        }

        public Builder setGlobalReplicationGroupIdSuffix(@Nullable String globalReplicationGroupIdSuffix) {
            this.globalReplicationGroupIdSuffix = Input.ofNullable(globalReplicationGroupIdSuffix);
            return this;
        }

        public Builder setPrimaryReplicationGroupId(@Nullable Input<String> primaryReplicationGroupId) {
            this.primaryReplicationGroupId = primaryReplicationGroupId;
            return this;
        }

        public Builder setPrimaryReplicationGroupId(@Nullable String primaryReplicationGroupId) {
            this.primaryReplicationGroupId = Input.ofNullable(primaryReplicationGroupId);
            return this;
        }

        public Builder setTransitEncryptionEnabled(@Nullable Input<Boolean> transitEncryptionEnabled) {
            this.transitEncryptionEnabled = transitEncryptionEnabled;
            return this;
        }

        public Builder setTransitEncryptionEnabled(@Nullable Boolean transitEncryptionEnabled) {
            this.transitEncryptionEnabled = Input.ofNullable(transitEncryptionEnabled);
            return this;
        }
        public GlobalReplicationGroupState build() {
            return new GlobalReplicationGroupState(actualEngineVersion, arn, atRestEncryptionEnabled, authTokenEnabled, cacheNodeType, clusterEnabled, engine, engineVersionActual, globalReplicationGroupDescription, globalReplicationGroupId, globalReplicationGroupIdSuffix, primaryReplicationGroupId, transitEncryptionEnabled);
        }
    }
}
