// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_beta.outputs.LicenseResourceRequirementsResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLicenseResult {
    /**
     * @return Deprecated. This field no longer reflects whether a license charges a usage fee.
     * 
     * @deprecated
     * [Output Only] Deprecated. This field no longer reflects whether a license charges a usage fee.
     * 
     */
    @Deprecated /* [Output Only] Deprecated. This field no longer reflects whether a license charges a usage fee. */
    private final Boolean chargesUseFee;
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * @return An optional textual description of the resource; provided by the client when the resource is created.
     * 
     */
    private final String description;
    /**
     * @return Type of resource. Always compute#license for licenses.
     * 
     */
    private final String kind;
    /**
     * @return The unique code used to attach this license to images, snapshots, and disks.
     * 
     */
    private final String licenseCode;
    /**
     * @return Name of the resource. The name must be 1-63 characters long and comply with RFC1035.
     * 
     */
    private final String name;
    private final LicenseResourceRequirementsResponse resourceRequirements;
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * @return If false, licenses will not be copied from the source resource when creating an image from a disk, disk from snapshot, or snapshot from disk.
     * 
     */
    private final Boolean transferable;

    @CustomType.Constructor
    private GetLicenseResult(
        @CustomType.Parameter("chargesUseFee") Boolean chargesUseFee,
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("licenseCode") String licenseCode,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceRequirements") LicenseResourceRequirementsResponse resourceRequirements,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("transferable") Boolean transferable) {
        this.chargesUseFee = chargesUseFee;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.kind = kind;
        this.licenseCode = licenseCode;
        this.name = name;
        this.resourceRequirements = resourceRequirements;
        this.selfLink = selfLink;
        this.transferable = transferable;
    }

    /**
     * @return Deprecated. This field no longer reflects whether a license charges a usage fee.
     * 
     * @deprecated
     * [Output Only] Deprecated. This field no longer reflects whether a license charges a usage fee.
     * 
     */
    @Deprecated /* [Output Only] Deprecated. This field no longer reflects whether a license charges a usage fee. */
    public Boolean chargesUseFee() {
        return this.chargesUseFee;
    }
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * @return An optional textual description of the resource; provided by the client when the resource is created.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Type of resource. Always compute#license for licenses.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The unique code used to attach this license to images, snapshots, and disks.
     * 
     */
    public String licenseCode() {
        return this.licenseCode;
    }
    /**
     * @return Name of the resource. The name must be 1-63 characters long and comply with RFC1035.
     * 
     */
    public String name() {
        return this.name;
    }
    public LicenseResourceRequirementsResponse resourceRequirements() {
        return this.resourceRequirements;
    }
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return If false, licenses will not be copied from the source resource when creating an image from a disk, disk from snapshot, or snapshot from disk.
     * 
     */
    public Boolean transferable() {
        return this.transferable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLicenseResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean chargesUseFee;
        private String creationTimestamp;
        private String description;
        private String kind;
        private String licenseCode;
        private String name;
        private LicenseResourceRequirementsResponse resourceRequirements;
        private String selfLink;
        private Boolean transferable;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLicenseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chargesUseFee = defaults.chargesUseFee;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.kind = defaults.kind;
    	      this.licenseCode = defaults.licenseCode;
    	      this.name = defaults.name;
    	      this.resourceRequirements = defaults.resourceRequirements;
    	      this.selfLink = defaults.selfLink;
    	      this.transferable = defaults.transferable;
        }

        public Builder chargesUseFee(Boolean chargesUseFee) {
            this.chargesUseFee = Objects.requireNonNull(chargesUseFee);
            return this;
        }
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder licenseCode(String licenseCode) {
            this.licenseCode = Objects.requireNonNull(licenseCode);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceRequirements(LicenseResourceRequirementsResponse resourceRequirements) {
            this.resourceRequirements = Objects.requireNonNull(resourceRequirements);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder transferable(Boolean transferable) {
            this.transferable = Objects.requireNonNull(transferable);
            return this;
        }        public GetLicenseResult build() {
            return new GetLicenseResult(chargesUseFee, creationTimestamp, description, kind, licenseCode, name, resourceRequirements, selfLink, transferable);
        }
    }
}
