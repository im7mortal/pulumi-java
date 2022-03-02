// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_v1.outputs.AllocationSpecificSKUReservationResponse;
import io.pulumi.googlenative.compute_v1.outputs.ShareSettingsResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ReservationResponse {
    /**
     * Full or partial URL to a parent commitment. This field displays for reservations that are tied to a commitment.
     * 
     */
    private final String commitment;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * Type of the resource. Always compute#reservations for reservations.
     * 
     */
    private final String kind;
    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * Reserved for future use.
     * 
     */
    private final Boolean satisfiesPzs;
    /**
     * Server-defined fully-qualified URL for this resource.
     * 
     */
    private final String selfLink;
    /**
     * Share-settings for shared-reservation
     * 
     */
    private final ShareSettingsResponse shareSettings;
    /**
     * Reservation for instances with specific machine shapes.
     * 
     */
    private final AllocationSpecificSKUReservationResponse specificReservation;
    /**
     * Indicates whether the reservation can be consumed by VMs with affinity for "any" reservation. If the field is set, then only VMs that target the reservation by name can consume from this reservation.
     * 
     */
    private final Boolean specificReservationRequired;
    /**
     * The status of the reservation.
     * 
     */
    private final String status;
    /**
     * Zone in which the reservation resides. A zone must be provided if the reservation is created within a commitment.
     * 
     */
    private final String zone;

    @OutputCustomType.Constructor({"commitment","creationTimestamp","description","kind","name","satisfiesPzs","selfLink","shareSettings","specificReservation","specificReservationRequired","status","zone"})
    private ReservationResponse(
        String commitment,
        String creationTimestamp,
        String description,
        String kind,
        String name,
        Boolean satisfiesPzs,
        String selfLink,
        ShareSettingsResponse shareSettings,
        AllocationSpecificSKUReservationResponse specificReservation,
        Boolean specificReservationRequired,
        String status,
        String zone) {
        this.commitment = Objects.requireNonNull(commitment);
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.description = Objects.requireNonNull(description);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.satisfiesPzs = Objects.requireNonNull(satisfiesPzs);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.shareSettings = Objects.requireNonNull(shareSettings);
        this.specificReservation = Objects.requireNonNull(specificReservation);
        this.specificReservationRequired = Objects.requireNonNull(specificReservationRequired);
        this.status = Objects.requireNonNull(status);
        this.zone = Objects.requireNonNull(zone);
    }

    /**
     * Full or partial URL to a parent commitment. This field displays for reservations that are tied to a commitment.
     * 
    */
    public String getCommitment() {
        return this.commitment;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
    */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Type of the resource. Always compute#reservations for reservations.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Reserved for future use.
     * 
    */
    public Boolean getSatisfiesPzs() {
        return this.satisfiesPzs;
    }
    /**
     * Server-defined fully-qualified URL for this resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * Share-settings for shared-reservation
     * 
    */
    public ShareSettingsResponse getShareSettings() {
        return this.shareSettings;
    }
    /**
     * Reservation for instances with specific machine shapes.
     * 
    */
    public AllocationSpecificSKUReservationResponse getSpecificReservation() {
        return this.specificReservation;
    }
    /**
     * Indicates whether the reservation can be consumed by VMs with affinity for "any" reservation. If the field is set, then only VMs that target the reservation by name can consume from this reservation.
     * 
    */
    public Boolean getSpecificReservationRequired() {
        return this.specificReservationRequired;
    }
    /**
     * The status of the reservation.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Zone in which the reservation resides. A zone must be provided if the reservation is created within a commitment.
     * 
    */
    public String getZone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String commitment;
        private String creationTimestamp;
        private String description;
        private String kind;
        private String name;
        private Boolean satisfiesPzs;
        private String selfLink;
        private ShareSettingsResponse shareSettings;
        private AllocationSpecificSKUReservationResponse specificReservation;
        private Boolean specificReservationRequired;
        private String status;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commitment = defaults.commitment;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.satisfiesPzs = defaults.satisfiesPzs;
    	      this.selfLink = defaults.selfLink;
    	      this.shareSettings = defaults.shareSettings;
    	      this.specificReservation = defaults.specificReservation;
    	      this.specificReservationRequired = defaults.specificReservationRequired;
    	      this.status = defaults.status;
    	      this.zone = defaults.zone;
        }

        public Builder setCommitment(String commitment) {
            this.commitment = Objects.requireNonNull(commitment);
            return this;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSatisfiesPzs(Boolean satisfiesPzs) {
            this.satisfiesPzs = Objects.requireNonNull(satisfiesPzs);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setShareSettings(ShareSettingsResponse shareSettings) {
            this.shareSettings = Objects.requireNonNull(shareSettings);
            return this;
        }

        public Builder setSpecificReservation(AllocationSpecificSKUReservationResponse specificReservation) {
            this.specificReservation = Objects.requireNonNull(specificReservation);
            return this;
        }

        public Builder setSpecificReservationRequired(Boolean specificReservationRequired) {
            this.specificReservationRequired = Objects.requireNonNull(specificReservationRequired);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setZone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }
        public ReservationResponse build() {
            return new ReservationResponse(commitment, creationTimestamp, description, kind, name, satisfiesPzs, selfLink, shareSettings, specificReservation, specificReservationRequired, status, zone);
        }
    }
}
