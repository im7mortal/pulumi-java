// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.efs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AccessPointCreationInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessPointCreationInfoArgs Empty = new AccessPointCreationInfoArgs();

    /**
     * Specifies the POSIX group ID to apply to the RootDirectory. Accepts values from 0 to 2^32 (4294967295).
     * 
     */
    @InputImport(name="ownerGid", required=true)
    private final Input<String> ownerGid;

    public Input<String> getOwnerGid() {
        return this.ownerGid;
    }

    /**
     * Specifies the POSIX user ID to apply to the RootDirectory. Accepts values from 0 to 2^32 (4294967295).
     * 
     */
    @InputImport(name="ownerUid", required=true)
    private final Input<String> ownerUid;

    public Input<String> getOwnerUid() {
        return this.ownerUid;
    }

    /**
     * Specifies the POSIX permissions to apply to the RootDirectory, in the format of an octal number representing the file's mode bits.
     * 
     */
    @InputImport(name="permissions", required=true)
    private final Input<String> permissions;

    public Input<String> getPermissions() {
        return this.permissions;
    }

    public AccessPointCreationInfoArgs(
        Input<String> ownerGid,
        Input<String> ownerUid,
        Input<String> permissions) {
        this.ownerGid = Objects.requireNonNull(ownerGid, "expected parameter 'ownerGid' to be non-null");
        this.ownerUid = Objects.requireNonNull(ownerUid, "expected parameter 'ownerUid' to be non-null");
        this.permissions = Objects.requireNonNull(permissions, "expected parameter 'permissions' to be non-null");
    }

    private AccessPointCreationInfoArgs() {
        this.ownerGid = Input.empty();
        this.ownerUid = Input.empty();
        this.permissions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPointCreationInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> ownerGid;
        private Input<String> ownerUid;
        private Input<String> permissions;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPointCreationInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ownerGid = defaults.ownerGid;
    	      this.ownerUid = defaults.ownerUid;
    	      this.permissions = defaults.permissions;
        }

        public Builder setOwnerGid(Input<String> ownerGid) {
            this.ownerGid = Objects.requireNonNull(ownerGid);
            return this;
        }

        public Builder setOwnerGid(String ownerGid) {
            this.ownerGid = Input.of(Objects.requireNonNull(ownerGid));
            return this;
        }

        public Builder setOwnerUid(Input<String> ownerUid) {
            this.ownerUid = Objects.requireNonNull(ownerUid);
            return this;
        }

        public Builder setOwnerUid(String ownerUid) {
            this.ownerUid = Input.of(Objects.requireNonNull(ownerUid));
            return this;
        }

        public Builder setPermissions(Input<String> permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }

        public Builder setPermissions(String permissions) {
            this.permissions = Input.of(Objects.requireNonNull(permissions));
            return this;
        }

        public AccessPointCreationInfoArgs build() {
            return new AccessPointCreationInfoArgs(ownerGid, ownerUid, permissions);
        }
    }
}
