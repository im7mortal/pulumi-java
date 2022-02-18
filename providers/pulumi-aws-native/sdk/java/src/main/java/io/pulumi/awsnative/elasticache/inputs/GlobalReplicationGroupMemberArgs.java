// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticache.inputs;

import io.pulumi.awsnative.elasticache.enums.GlobalReplicationGroupMemberRole;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalReplicationGroupMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlobalReplicationGroupMemberArgs Empty = new GlobalReplicationGroupMemberArgs();

    /**
     * Regionally unique identifier for the member i.e. ReplicationGroupId.
     * 
     */
    @InputImport(name="replicationGroupId")
    private final @Nullable Input<String> replicationGroupId;

    public Input<String> getReplicationGroupId() {
        return this.replicationGroupId == null ? Input.empty() : this.replicationGroupId;
    }

    /**
     * The AWS region of the Global Datastore member.
     * 
     */
    @InputImport(name="replicationGroupRegion")
    private final @Nullable Input<String> replicationGroupRegion;

    public Input<String> getReplicationGroupRegion() {
        return this.replicationGroupRegion == null ? Input.empty() : this.replicationGroupRegion;
    }

    /**
     * Indicates the role of the member, primary or secondary.
     * 
     */
    @InputImport(name="role")
    private final @Nullable Input<GlobalReplicationGroupMemberRole> role;

    public Input<GlobalReplicationGroupMemberRole> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    public GlobalReplicationGroupMemberArgs(
        @Nullable Input<String> replicationGroupId,
        @Nullable Input<String> replicationGroupRegion,
        @Nullable Input<GlobalReplicationGroupMemberRole> role) {
        this.replicationGroupId = replicationGroupId;
        this.replicationGroupRegion = replicationGroupRegion;
        this.role = role;
    }

    private GlobalReplicationGroupMemberArgs() {
        this.replicationGroupId = Input.empty();
        this.replicationGroupRegion = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalReplicationGroupMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> replicationGroupId;
        private @Nullable Input<String> replicationGroupRegion;
        private @Nullable Input<GlobalReplicationGroupMemberRole> role;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalReplicationGroupMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicationGroupId = defaults.replicationGroupId;
    	      this.replicationGroupRegion = defaults.replicationGroupRegion;
    	      this.role = defaults.role;
        }

        public Builder setReplicationGroupId(@Nullable Input<String> replicationGroupId) {
            this.replicationGroupId = replicationGroupId;
            return this;
        }

        public Builder setReplicationGroupId(@Nullable String replicationGroupId) {
            this.replicationGroupId = Input.ofNullable(replicationGroupId);
            return this;
        }

        public Builder setReplicationGroupRegion(@Nullable Input<String> replicationGroupRegion) {
            this.replicationGroupRegion = replicationGroupRegion;
            return this;
        }

        public Builder setReplicationGroupRegion(@Nullable String replicationGroupRegion) {
            this.replicationGroupRegion = Input.ofNullable(replicationGroupRegion);
            return this;
        }

        public Builder setRole(@Nullable Input<GlobalReplicationGroupMemberRole> role) {
            this.role = role;
            return this;
        }

        public Builder setRole(@Nullable GlobalReplicationGroupMemberRole role) {
            this.role = Input.ofNullable(role);
            return this;
        }

        public GlobalReplicationGroupMemberArgs build() {
            return new GlobalReplicationGroupMemberArgs(replicationGroupId, replicationGroupRegion, role);
        }
    }
}
