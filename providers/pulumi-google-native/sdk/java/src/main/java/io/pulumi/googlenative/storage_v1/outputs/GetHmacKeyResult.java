// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetHmacKeyResult {
    /**
     * The ID of the HMAC Key.
     * 
     */
    private final String accessId;
    /**
     * HTTP 1.1 Entity tag for the HMAC key.
     * 
     */
    private final String etag;
    /**
     * The kind of item this is. For HMAC Key metadata, this is always storage#hmacKeyMetadata.
     * 
     */
    private final String kind;
    /**
     * Project ID owning the service account to which the key authenticates.
     * 
     */
    private final String project;
    /**
     * The link to this resource.
     * 
     */
    private final String selfLink;
    /**
     * The email address of the key's associated service account.
     * 
     */
    private final String serviceAccountEmail;
    /**
     * The state of the key. Can be one of ACTIVE, INACTIVE, or DELETED.
     * 
     */
    private final String state;
    /**
     * The creation time of the HMAC key in RFC 3339 format.
     * 
     */
    private final String timeCreated;
    /**
     * The last modification time of the HMAC key metadata in RFC 3339 format.
     * 
     */
    private final String updated;

    @OutputCustomType.Constructor({"accessId","etag","kind","project","selfLink","serviceAccountEmail","state","timeCreated","updated"})
    private GetHmacKeyResult(
        String accessId,
        String etag,
        String kind,
        String project,
        String selfLink,
        String serviceAccountEmail,
        String state,
        String timeCreated,
        String updated) {
        this.accessId = Objects.requireNonNull(accessId);
        this.etag = Objects.requireNonNull(etag);
        this.kind = Objects.requireNonNull(kind);
        this.project = Objects.requireNonNull(project);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail);
        this.state = Objects.requireNonNull(state);
        this.timeCreated = Objects.requireNonNull(timeCreated);
        this.updated = Objects.requireNonNull(updated);
    }

    /**
     * The ID of the HMAC Key.
     * 
    */
    public String getAccessId() {
        return this.accessId;
    }
    /**
     * HTTP 1.1 Entity tag for the HMAC key.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The kind of item this is. For HMAC Key metadata, this is always storage#hmacKeyMetadata.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Project ID owning the service account to which the key authenticates.
     * 
    */
    public String getProject() {
        return this.project;
    }
    /**
     * The link to this resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * The email address of the key's associated service account.
     * 
    */
    public String getServiceAccountEmail() {
        return this.serviceAccountEmail;
    }
    /**
     * The state of the key. Can be one of ACTIVE, INACTIVE, or DELETED.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The creation time of the HMAC key in RFC 3339 format.
     * 
    */
    public String getTimeCreated() {
        return this.timeCreated;
    }
    /**
     * The last modification time of the HMAC key metadata in RFC 3339 format.
     * 
    */
    public String getUpdated() {
        return this.updated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHmacKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessId;
        private String etag;
        private String kind;
        private String project;
        private String selfLink;
        private String serviceAccountEmail;
        private String state;
        private String timeCreated;
        private String updated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHmacKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessId = defaults.accessId;
    	      this.etag = defaults.etag;
    	      this.kind = defaults.kind;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
    	      this.state = defaults.state;
    	      this.timeCreated = defaults.timeCreated;
    	      this.updated = defaults.updated;
        }

        public Builder setAccessId(String accessId) {
            this.accessId = Objects.requireNonNull(accessId);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setServiceAccountEmail(String serviceAccountEmail) {
            this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setTimeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }

        public Builder setUpdated(String updated) {
            this.updated = Objects.requireNonNull(updated);
            return this;
        }
        public GetHmacKeyResult build() {
            return new GetHmacKeyResult(accessId, etag, kind, project, selfLink, serviceAccountEmail, state, timeCreated, updated);
        }
    }
}
