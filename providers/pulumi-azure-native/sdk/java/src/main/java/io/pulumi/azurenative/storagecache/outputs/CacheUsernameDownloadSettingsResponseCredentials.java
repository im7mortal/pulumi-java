// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CacheUsernameDownloadSettingsResponseCredentials {
    /**
     * The Bind Distinguished Name identity to be used in the secure LDAP connection. This value is stored encrypted and not returned on response.
     * 
     */
    private final @Nullable String bindDn;
    /**
     * The Bind password to be used in the secure LDAP connection. This value is stored encrypted and not returned on response.
     * 
     */
    private final @Nullable String bindPassword;

    @OutputCustomType.Constructor({"bindDn","bindPassword"})
    private CacheUsernameDownloadSettingsResponseCredentials(
        @Nullable String bindDn,
        @Nullable String bindPassword) {
        this.bindDn = bindDn;
        this.bindPassword = bindPassword;
    }

    /**
     * The Bind Distinguished Name identity to be used in the secure LDAP connection. This value is stored encrypted and not returned on response.
     * 
    */
    public Optional<String> getBindDn() {
        return Optional.ofNullable(this.bindDn);
    }
    /**
     * The Bind password to be used in the secure LDAP connection. This value is stored encrypted and not returned on response.
     * 
    */
    public Optional<String> getBindPassword() {
        return Optional.ofNullable(this.bindPassword);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheUsernameDownloadSettingsResponseCredentials defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bindDn;
        private @Nullable String bindPassword;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheUsernameDownloadSettingsResponseCredentials defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bindDn = defaults.bindDn;
    	      this.bindPassword = defaults.bindPassword;
        }

        public Builder setBindDn(@Nullable String bindDn) {
            this.bindDn = bindDn;
            return this;
        }

        public Builder setBindPassword(@Nullable String bindPassword) {
            this.bindPassword = bindPassword;
            return this;
        }
        public CacheUsernameDownloadSettingsResponseCredentials build() {
            return new CacheUsernameDownloadSettingsResponseCredentials(bindDn, bindPassword);
        }
    }
}
