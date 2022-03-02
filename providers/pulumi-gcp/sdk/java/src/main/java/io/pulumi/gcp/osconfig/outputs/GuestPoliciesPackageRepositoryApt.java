// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GuestPoliciesPackageRepositoryApt {
    /**
     * Type of archive files in this repository. The default behavior is DEB.
     * Default value is `DEB`.
     * Possible values are `DEB` and `DEB_SRC`.
     * 
     */
    private final @Nullable String archiveType;
    /**
     * List of components for this repository. Must contain at least one item.
     * 
     */
    private final List<String> components;
    /**
     * Distribution of this repository.
     * 
     */
    private final String distribution;
    /**
     * URI of the key file for this repository. The agent maintains a keyring at
     * /etc/apt/trusted.gpg.d/osconfig_agent_managed.gpg containing all the keys in any applied guest policy.
     * 
     */
    private final @Nullable String gpgKey;
    /**
     * URI from which to fetch the object. It should contain both the protocol and path following the format {protocol}://{location}.
     * 
     */
    private final String uri;

    @OutputCustomType.Constructor({"archiveType","components","distribution","gpgKey","uri"})
    private GuestPoliciesPackageRepositoryApt(
        @Nullable String archiveType,
        List<String> components,
        String distribution,
        @Nullable String gpgKey,
        String uri) {
        this.archiveType = archiveType;
        this.components = Objects.requireNonNull(components);
        this.distribution = Objects.requireNonNull(distribution);
        this.gpgKey = gpgKey;
        this.uri = Objects.requireNonNull(uri);
    }

    /**
     * Type of archive files in this repository. The default behavior is DEB.
     * Default value is `DEB`.
     * Possible values are `DEB` and `DEB_SRC`.
     * 
    */
    public Optional<String> getArchiveType() {
        return Optional.ofNullable(this.archiveType);
    }
    /**
     * List of components for this repository. Must contain at least one item.
     * 
    */
    public List<String> getComponents() {
        return this.components;
    }
    /**
     * Distribution of this repository.
     * 
    */
    public String getDistribution() {
        return this.distribution;
    }
    /**
     * URI of the key file for this repository. The agent maintains a keyring at
     * /etc/apt/trusted.gpg.d/osconfig_agent_managed.gpg containing all the keys in any applied guest policy.
     * 
    */
    public Optional<String> getGpgKey() {
        return Optional.ofNullable(this.gpgKey);
    }
    /**
     * URI from which to fetch the object. It should contain both the protocol and path following the format {protocol}://{location}.
     * 
    */
    public String getUri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesPackageRepositoryApt defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String archiveType;
        private List<String> components;
        private String distribution;
        private @Nullable String gpgKey;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesPackageRepositoryApt defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveType = defaults.archiveType;
    	      this.components = defaults.components;
    	      this.distribution = defaults.distribution;
    	      this.gpgKey = defaults.gpgKey;
    	      this.uri = defaults.uri;
        }

        public Builder setArchiveType(@Nullable String archiveType) {
            this.archiveType = archiveType;
            return this;
        }

        public Builder setComponents(List<String> components) {
            this.components = Objects.requireNonNull(components);
            return this;
        }

        public Builder setDistribution(String distribution) {
            this.distribution = Objects.requireNonNull(distribution);
            return this;
        }

        public Builder setGpgKey(@Nullable String gpgKey) {
            this.gpgKey = gpgKey;
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public GuestPoliciesPackageRepositoryApt build() {
            return new GuestPoliciesPackageRepositoryApt(archiveType, components, distribution, gpgKey, uri);
        }
    }
}
