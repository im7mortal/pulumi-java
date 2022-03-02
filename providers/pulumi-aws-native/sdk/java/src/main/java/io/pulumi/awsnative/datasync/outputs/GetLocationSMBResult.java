// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.outputs;

import io.pulumi.awsnative.datasync.outputs.LocationSMBMountOptions;
import io.pulumi.awsnative.datasync.outputs.LocationSMBTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLocationSMBResult {
    /**
     * The Amazon Resource Names (ARNs) of agents to use for a Simple Message Block (SMB) location.
     * 
     */
    private final @Nullable List<String> agentArns;
    /**
     * The name of the Windows domain that the SMB server belongs to.
     * 
     */
    private final @Nullable String domain;
    /**
     * The Amazon Resource Name (ARN) of the SMB location that is created.
     * 
     */
    private final @Nullable String locationArn;
    /**
     * The URL of the SMB location that was described.
     * 
     */
    private final @Nullable String locationUri;
    private final @Nullable LocationSMBMountOptions mountOptions;
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<LocationSMBTag> tags;
    /**
     * The user who can mount the share, has the permissions to access files and folders in the SMB share.
     * 
     */
    private final @Nullable String user;

    @OutputCustomType.Constructor({"agentArns","domain","locationArn","locationUri","mountOptions","tags","user"})
    private GetLocationSMBResult(
        @Nullable List<String> agentArns,
        @Nullable String domain,
        @Nullable String locationArn,
        @Nullable String locationUri,
        @Nullable LocationSMBMountOptions mountOptions,
        @Nullable List<LocationSMBTag> tags,
        @Nullable String user) {
        this.agentArns = agentArns;
        this.domain = domain;
        this.locationArn = locationArn;
        this.locationUri = locationUri;
        this.mountOptions = mountOptions;
        this.tags = tags;
        this.user = user;
    }

    /**
     * The Amazon Resource Names (ARNs) of agents to use for a Simple Message Block (SMB) location.
     * 
    */
    public List<String> getAgentArns() {
        return this.agentArns == null ? List.of() : this.agentArns;
    }
    /**
     * The name of the Windows domain that the SMB server belongs to.
     * 
    */
    public Optional<String> getDomain() {
        return Optional.ofNullable(this.domain);
    }
    /**
     * The Amazon Resource Name (ARN) of the SMB location that is created.
     * 
    */
    public Optional<String> getLocationArn() {
        return Optional.ofNullable(this.locationArn);
    }
    /**
     * The URL of the SMB location that was described.
     * 
    */
    public Optional<String> getLocationUri() {
        return Optional.ofNullable(this.locationUri);
    }
    public Optional<LocationSMBMountOptions> getMountOptions() {
        return Optional.ofNullable(this.mountOptions);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
    */
    public List<LocationSMBTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * The user who can mount the share, has the permissions to access files and folders in the SMB share.
     * 
    */
    public Optional<String> getUser() {
        return Optional.ofNullable(this.user);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocationSMBResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> agentArns;
        private @Nullable String domain;
        private @Nullable String locationArn;
        private @Nullable String locationUri;
        private @Nullable LocationSMBMountOptions mountOptions;
        private @Nullable List<LocationSMBTag> tags;
        private @Nullable String user;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocationSMBResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentArns = defaults.agentArns;
    	      this.domain = defaults.domain;
    	      this.locationArn = defaults.locationArn;
    	      this.locationUri = defaults.locationUri;
    	      this.mountOptions = defaults.mountOptions;
    	      this.tags = defaults.tags;
    	      this.user = defaults.user;
        }

        public Builder setAgentArns(@Nullable List<String> agentArns) {
            this.agentArns = agentArns;
            return this;
        }

        public Builder setDomain(@Nullable String domain) {
            this.domain = domain;
            return this;
        }

        public Builder setLocationArn(@Nullable String locationArn) {
            this.locationArn = locationArn;
            return this;
        }

        public Builder setLocationUri(@Nullable String locationUri) {
            this.locationUri = locationUri;
            return this;
        }

        public Builder setMountOptions(@Nullable LocationSMBMountOptions mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }

        public Builder setTags(@Nullable List<LocationSMBTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setUser(@Nullable String user) {
            this.user = user;
            return this;
        }
        public GetLocationSMBResult build() {
            return new GetLocationSMBResult(agentArns, domain, locationArn, locationUri, mountOptions, tags, user);
        }
    }
}
