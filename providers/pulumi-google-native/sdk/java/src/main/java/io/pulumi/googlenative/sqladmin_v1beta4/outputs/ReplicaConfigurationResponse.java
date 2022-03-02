// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.sqladmin_v1beta4.outputs.MySqlReplicaConfigurationResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ReplicaConfigurationResponse {
    /**
     * Specifies if the replica is the failover target. If the field is set to `true` the replica will be designated as a failover replica. In case the primary instance fails, the replica instance will be promoted as the new primary instance. Only one replica can be specified as failover target, and the replica has to be in different zone with the primary instance.
     * 
     */
    private final Boolean failoverTarget;
    /**
     * This is always `sql#replicaConfiguration`.
     * 
     */
    private final String kind;
    /**
     * MySQL specific configuration when replicating from a MySQL on-premises primary instance. Replication configuration information such as the username, password, certificates, and keys are not stored in the instance metadata. The configuration information is used only to set up the replication connection and is stored by MySQL in a file named `master.info` in the data directory.
     * 
     */
    private final MySqlReplicaConfigurationResponse mysqlReplicaConfiguration;

    @OutputCustomType.Constructor({"failoverTarget","kind","mysqlReplicaConfiguration"})
    private ReplicaConfigurationResponse(
        Boolean failoverTarget,
        String kind,
        MySqlReplicaConfigurationResponse mysqlReplicaConfiguration) {
        this.failoverTarget = Objects.requireNonNull(failoverTarget);
        this.kind = Objects.requireNonNull(kind);
        this.mysqlReplicaConfiguration = Objects.requireNonNull(mysqlReplicaConfiguration);
    }

    /**
     * Specifies if the replica is the failover target. If the field is set to `true` the replica will be designated as a failover replica. In case the primary instance fails, the replica instance will be promoted as the new primary instance. Only one replica can be specified as failover target, and the replica has to be in different zone with the primary instance.
     * 
    */
    public Boolean getFailoverTarget() {
        return this.failoverTarget;
    }
    /**
     * This is always `sql#replicaConfiguration`.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * MySQL specific configuration when replicating from a MySQL on-premises primary instance. Replication configuration information such as the username, password, certificates, and keys are not stored in the instance metadata. The configuration information is used only to set up the replication connection and is stored by MySQL in a file named `master.info` in the data directory.
     * 
    */
    public MySqlReplicaConfigurationResponse getMysqlReplicaConfiguration() {
        return this.mysqlReplicaConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicaConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean failoverTarget;
        private String kind;
        private MySqlReplicaConfigurationResponse mysqlReplicaConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicaConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failoverTarget = defaults.failoverTarget;
    	      this.kind = defaults.kind;
    	      this.mysqlReplicaConfiguration = defaults.mysqlReplicaConfiguration;
        }

        public Builder setFailoverTarget(Boolean failoverTarget) {
            this.failoverTarget = Objects.requireNonNull(failoverTarget);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setMysqlReplicaConfiguration(MySqlReplicaConfigurationResponse mysqlReplicaConfiguration) {
            this.mysqlReplicaConfiguration = Objects.requireNonNull(mysqlReplicaConfiguration);
            return this;
        }
        public ReplicaConfigurationResponse build() {
            return new ReplicaConfigurationResponse(failoverTarget, kind, mysqlReplicaConfiguration);
        }
    }
}
