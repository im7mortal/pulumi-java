// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.inputs;

import io.pulumi.awsnative.nimblestudio.inputs.StudioComponentActiveDirectoryComputerAttribute;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * <p>The configuration for a Microsoft Active Directory (Microsoft AD) studio resource.</p>
 * 
 */
public final class StudioComponentActiveDirectoryConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final StudioComponentActiveDirectoryConfiguration Empty = new StudioComponentActiveDirectoryConfiguration();

    /**
     * <p>A collection of custom attributes for an Active Directory computer.</p>
     * 
     */
    @InputImport(name="computerAttributes")
    private final @Nullable List<StudioComponentActiveDirectoryComputerAttribute> computerAttributes;

    public List<StudioComponentActiveDirectoryComputerAttribute> getComputerAttributes() {
        return this.computerAttributes == null ? List.of() : this.computerAttributes;
    }

    /**
     * <p>The directory ID of the Directory Service for Microsoft Active Directory to access using this studio component.</p>
     * 
     */
    @InputImport(name="directoryId")
    private final @Nullable String directoryId;

    public Optional<String> getDirectoryId() {
        return this.directoryId == null ? Optional.empty() : Optional.ofNullable(this.directoryId);
    }

    /**
     * <p>The distinguished name (DN) and organizational unit (OU) of an Active Directory computer.</p>
     * 
     */
    @InputImport(name="organizationalUnitDistinguishedName")
    private final @Nullable String organizationalUnitDistinguishedName;

    public Optional<String> getOrganizationalUnitDistinguishedName() {
        return this.organizationalUnitDistinguishedName == null ? Optional.empty() : Optional.ofNullable(this.organizationalUnitDistinguishedName);
    }

    public StudioComponentActiveDirectoryConfiguration(
        @Nullable List<StudioComponentActiveDirectoryComputerAttribute> computerAttributes,
        @Nullable String directoryId,
        @Nullable String organizationalUnitDistinguishedName) {
        this.computerAttributes = computerAttributes;
        this.directoryId = directoryId;
        this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
    }

    private StudioComponentActiveDirectoryConfiguration() {
        this.computerAttributes = List.of();
        this.directoryId = null;
        this.organizationalUnitDistinguishedName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioComponentActiveDirectoryConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<StudioComponentActiveDirectoryComputerAttribute> computerAttributes;
        private @Nullable String directoryId;
        private @Nullable String organizationalUnitDistinguishedName;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioComponentActiveDirectoryConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computerAttributes = defaults.computerAttributes;
    	      this.directoryId = defaults.directoryId;
    	      this.organizationalUnitDistinguishedName = defaults.organizationalUnitDistinguishedName;
        }

        public Builder setComputerAttributes(@Nullable List<StudioComponentActiveDirectoryComputerAttribute> computerAttributes) {
            this.computerAttributes = computerAttributes;
            return this;
        }

        public Builder setDirectoryId(@Nullable String directoryId) {
            this.directoryId = directoryId;
            return this;
        }

        public Builder setOrganizationalUnitDistinguishedName(@Nullable String organizationalUnitDistinguishedName) {
            this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
            return this;
        }

        public StudioComponentActiveDirectoryConfiguration build() {
            return new StudioComponentActiveDirectoryConfiguration(computerAttributes, directoryId, organizationalUnitDistinguishedName);
        }
    }
}
