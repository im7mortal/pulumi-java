// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetMigrationConfigResult {
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * State in which Standard to Premium Migration is, possible values : Unknown, Reverting, Completing, Initiating, Syncing, Active
     * 
     */
    private final String migrationState;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * Number of entities pending to be replicated.
     * 
     */
    private final Double pendingReplicationOperationsCount;
    /**
     * Name to access Standard Namespace after migration
     * 
     */
    private final String postMigrationName;
    /**
     * Provisioning state of Migration Configuration
     * 
     */
    private final String provisioningState;
    /**
     * Existing premium Namespace ARM Id name which has no entities, will be used for migration
     * 
     */
    private final String targetNamespace;
    /**
     * Resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","migrationState","name","pendingReplicationOperationsCount","postMigrationName","provisioningState","targetNamespace","type"})
    private GetMigrationConfigResult(
        String id,
        String migrationState,
        String name,
        Double pendingReplicationOperationsCount,
        String postMigrationName,
        String provisioningState,
        String targetNamespace,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.migrationState = Objects.requireNonNull(migrationState);
        this.name = Objects.requireNonNull(name);
        this.pendingReplicationOperationsCount = Objects.requireNonNull(pendingReplicationOperationsCount);
        this.postMigrationName = Objects.requireNonNull(postMigrationName);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.targetNamespace = Objects.requireNonNull(targetNamespace);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * State in which Standard to Premium Migration is, possible values : Unknown, Reverting, Completing, Initiating, Syncing, Active
     * 
    */
    public String getMigrationState() {
        return this.migrationState;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Number of entities pending to be replicated.
     * 
    */
    public Double getPendingReplicationOperationsCount() {
        return this.pendingReplicationOperationsCount;
    }
    /**
     * Name to access Standard Namespace after migration
     * 
    */
    public String getPostMigrationName() {
        return this.postMigrationName;
    }
    /**
     * Provisioning state of Migration Configuration
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Existing premium Namespace ARM Id name which has no entities, will be used for migration
     * 
    */
    public String getTargetNamespace() {
        return this.targetNamespace;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMigrationConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String migrationState;
        private String name;
        private Double pendingReplicationOperationsCount;
        private String postMigrationName;
        private String provisioningState;
        private String targetNamespace;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMigrationConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.migrationState = defaults.migrationState;
    	      this.name = defaults.name;
    	      this.pendingReplicationOperationsCount = defaults.pendingReplicationOperationsCount;
    	      this.postMigrationName = defaults.postMigrationName;
    	      this.provisioningState = defaults.provisioningState;
    	      this.targetNamespace = defaults.targetNamespace;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setMigrationState(String migrationState) {
            this.migrationState = Objects.requireNonNull(migrationState);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPendingReplicationOperationsCount(Double pendingReplicationOperationsCount) {
            this.pendingReplicationOperationsCount = Objects.requireNonNull(pendingReplicationOperationsCount);
            return this;
        }

        public Builder setPostMigrationName(String postMigrationName) {
            this.postMigrationName = Objects.requireNonNull(postMigrationName);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setTargetNamespace(String targetNamespace) {
            this.targetNamespace = Objects.requireNonNull(targetNamespace);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetMigrationConfigResult build() {
            return new GetMigrationConfigResult(id, migrationState, name, pendingReplicationOperationsCount, postMigrationName, provisioningState, targetNamespace, type);
        }
    }
}
