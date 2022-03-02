// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SecurityProfileResponse {
    /**
     * The resource ID of the user's Azure Active Directory Domain Service.
     * 
     */
    private final @Nullable String aaddsResourceId;
    /**
     * Optional. The Distinguished Names for cluster user groups
     * 
     */
    private final @Nullable List<String> clusterUsersGroupDNs;
    /**
     * The directory type.
     * 
     */
    private final @Nullable String directoryType;
    /**
     * The organization's active directory domain.
     * 
     */
    private final @Nullable String domain;
    /**
     * The domain admin password.
     * 
     */
    private final @Nullable String domainUserPassword;
    /**
     * The domain user account that will have admin privileges on the cluster.
     * 
     */
    private final @Nullable String domainUsername;
    /**
     * The LDAPS protocol URLs to communicate with the Active Directory.
     * 
     */
    private final @Nullable List<String> ldapsUrls;
    /**
     * User assigned identity that has permissions to read and create cluster-related artifacts in the user's AADDS.
     * 
     */
    private final @Nullable String msiResourceId;
    /**
     * The organizational unit within the Active Directory to place the cluster and service accounts.
     * 
     */
    private final @Nullable String organizationalUnitDN;

    @OutputCustomType.Constructor({"aaddsResourceId","clusterUsersGroupDNs","directoryType","domain","domainUserPassword","domainUsername","ldapsUrls","msiResourceId","organizationalUnitDN"})
    private SecurityProfileResponse(
        @Nullable String aaddsResourceId,
        @Nullable List<String> clusterUsersGroupDNs,
        @Nullable String directoryType,
        @Nullable String domain,
        @Nullable String domainUserPassword,
        @Nullable String domainUsername,
        @Nullable List<String> ldapsUrls,
        @Nullable String msiResourceId,
        @Nullable String organizationalUnitDN) {
        this.aaddsResourceId = aaddsResourceId;
        this.clusterUsersGroupDNs = clusterUsersGroupDNs;
        this.directoryType = directoryType;
        this.domain = domain;
        this.domainUserPassword = domainUserPassword;
        this.domainUsername = domainUsername;
        this.ldapsUrls = ldapsUrls;
        this.msiResourceId = msiResourceId;
        this.organizationalUnitDN = organizationalUnitDN;
    }

    /**
     * The resource ID of the user's Azure Active Directory Domain Service.
     * 
    */
    public Optional<String> getAaddsResourceId() {
        return Optional.ofNullable(this.aaddsResourceId);
    }
    /**
     * Optional. The Distinguished Names for cluster user groups
     * 
    */
    public List<String> getClusterUsersGroupDNs() {
        return this.clusterUsersGroupDNs == null ? List.of() : this.clusterUsersGroupDNs;
    }
    /**
     * The directory type.
     * 
    */
    public Optional<String> getDirectoryType() {
        return Optional.ofNullable(this.directoryType);
    }
    /**
     * The organization's active directory domain.
     * 
    */
    public Optional<String> getDomain() {
        return Optional.ofNullable(this.domain);
    }
    /**
     * The domain admin password.
     * 
    */
    public Optional<String> getDomainUserPassword() {
        return Optional.ofNullable(this.domainUserPassword);
    }
    /**
     * The domain user account that will have admin privileges on the cluster.
     * 
    */
    public Optional<String> getDomainUsername() {
        return Optional.ofNullable(this.domainUsername);
    }
    /**
     * The LDAPS protocol URLs to communicate with the Active Directory.
     * 
    */
    public List<String> getLdapsUrls() {
        return this.ldapsUrls == null ? List.of() : this.ldapsUrls;
    }
    /**
     * User assigned identity that has permissions to read and create cluster-related artifacts in the user's AADDS.
     * 
    */
    public Optional<String> getMsiResourceId() {
        return Optional.ofNullable(this.msiResourceId);
    }
    /**
     * The organizational unit within the Active Directory to place the cluster and service accounts.
     * 
    */
    public Optional<String> getOrganizationalUnitDN() {
        return Optional.ofNullable(this.organizationalUnitDN);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String aaddsResourceId;
        private @Nullable List<String> clusterUsersGroupDNs;
        private @Nullable String directoryType;
        private @Nullable String domain;
        private @Nullable String domainUserPassword;
        private @Nullable String domainUsername;
        private @Nullable List<String> ldapsUrls;
        private @Nullable String msiResourceId;
        private @Nullable String organizationalUnitDN;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aaddsResourceId = defaults.aaddsResourceId;
    	      this.clusterUsersGroupDNs = defaults.clusterUsersGroupDNs;
    	      this.directoryType = defaults.directoryType;
    	      this.domain = defaults.domain;
    	      this.domainUserPassword = defaults.domainUserPassword;
    	      this.domainUsername = defaults.domainUsername;
    	      this.ldapsUrls = defaults.ldapsUrls;
    	      this.msiResourceId = defaults.msiResourceId;
    	      this.organizationalUnitDN = defaults.organizationalUnitDN;
        }

        public Builder setAaddsResourceId(@Nullable String aaddsResourceId) {
            this.aaddsResourceId = aaddsResourceId;
            return this;
        }

        public Builder setClusterUsersGroupDNs(@Nullable List<String> clusterUsersGroupDNs) {
            this.clusterUsersGroupDNs = clusterUsersGroupDNs;
            return this;
        }

        public Builder setDirectoryType(@Nullable String directoryType) {
            this.directoryType = directoryType;
            return this;
        }

        public Builder setDomain(@Nullable String domain) {
            this.domain = domain;
            return this;
        }

        public Builder setDomainUserPassword(@Nullable String domainUserPassword) {
            this.domainUserPassword = domainUserPassword;
            return this;
        }

        public Builder setDomainUsername(@Nullable String domainUsername) {
            this.domainUsername = domainUsername;
            return this;
        }

        public Builder setLdapsUrls(@Nullable List<String> ldapsUrls) {
            this.ldapsUrls = ldapsUrls;
            return this;
        }

        public Builder setMsiResourceId(@Nullable String msiResourceId) {
            this.msiResourceId = msiResourceId;
            return this;
        }

        public Builder setOrganizationalUnitDN(@Nullable String organizationalUnitDN) {
            this.organizationalUnitDN = organizationalUnitDN;
            return this;
        }
        public SecurityProfileResponse build() {
            return new SecurityProfileResponse(aaddsResourceId, clusterUsersGroupDNs, directoryType, domain, domainUserPassword, domainUsername, ldapsUrls, msiResourceId, organizationalUnitDN);
        }
    }
}
