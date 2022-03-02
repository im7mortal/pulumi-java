// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hanaonazure.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SAPSystemIDResponse {
    /**
     * Group ID of the HANA database user.
     * 
     */
    private final @Nullable String gid;
    /**
     * Percent of memory to allocate to this SID.
     * 
     */
    private final String memoryAllocation;
    /**
     * SAP system ID as database identifier.
     * 
     */
    private final @Nullable String sid;
    /**
     * User ID of the HANA database user.
     * 
     */
    private final @Nullable String uid;
    /**
     * Name of the HANA database user.
     * 
     */
    private final @Nullable String username;

    @OutputCustomType.Constructor({"gid","memoryAllocation","sid","uid","username"})
    private SAPSystemIDResponse(
        @Nullable String gid,
        String memoryAllocation,
        @Nullable String sid,
        @Nullable String uid,
        @Nullable String username) {
        this.gid = gid;
        this.memoryAllocation = Objects.requireNonNull(memoryAllocation);
        this.sid = sid;
        this.uid = uid;
        this.username = username;
    }

    /**
     * Group ID of the HANA database user.
     * 
    */
    public Optional<String> getGid() {
        return Optional.ofNullable(this.gid);
    }
    /**
     * Percent of memory to allocate to this SID.
     * 
    */
    public String getMemoryAllocation() {
        return this.memoryAllocation;
    }
    /**
     * SAP system ID as database identifier.
     * 
    */
    public Optional<String> getSid() {
        return Optional.ofNullable(this.sid);
    }
    /**
     * User ID of the HANA database user.
     * 
    */
    public Optional<String> getUid() {
        return Optional.ofNullable(this.uid);
    }
    /**
     * Name of the HANA database user.
     * 
    */
    public Optional<String> getUsername() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SAPSystemIDResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String gid;
        private String memoryAllocation;
        private @Nullable String sid;
        private @Nullable String uid;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(SAPSystemIDResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gid = defaults.gid;
    	      this.memoryAllocation = defaults.memoryAllocation;
    	      this.sid = defaults.sid;
    	      this.uid = defaults.uid;
    	      this.username = defaults.username;
        }

        public Builder setGid(@Nullable String gid) {
            this.gid = gid;
            return this;
        }

        public Builder setMemoryAllocation(String memoryAllocation) {
            this.memoryAllocation = Objects.requireNonNull(memoryAllocation);
            return this;
        }

        public Builder setSid(@Nullable String sid) {
            this.sid = sid;
            return this;
        }

        public Builder setUid(@Nullable String uid) {
            this.uid = uid;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = username;
            return this;
        }
        public SAPSystemIDResponse build() {
            return new SAPSystemIDResponse(gid, memoryAllocation, sid, uid, username);
        }
    }
}
