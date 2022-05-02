// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.binaryauthorization_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.binaryauthorization_v1.outputs.UserOwnedGrafeasNoteResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAttestorResult {
    /**
     * @return Optional. A descriptive comment. This field may be updated. The field may be displayed in chooser dialogs.
     * 
     */
    private final String description;
    /**
     * @return Optional. A checksum, returned by the server, that can be sent on update requests to ensure the attestor has an up-to-date value before attempting to update it. See https://google.aip.dev/154.
     * 
     */
    private final String etag;
    /**
     * @return The resource name, in the format: `projects/*{@literal /}attestors/*`. This field may not be updated.
     * 
     */
    private final String name;
    /**
     * @return Time when the attestor was last updated.
     * 
     */
    private final String updateTime;
    /**
     * @return This specifies how an attestation will be read, and how it will be used during policy enforcement.
     * 
     */
    private final UserOwnedGrafeasNoteResponse userOwnedGrafeasNote;

    @CustomType.Constructor
    private GetAttestorResult(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("updateTime") String updateTime,
        @CustomType.Parameter("userOwnedGrafeasNote") UserOwnedGrafeasNoteResponse userOwnedGrafeasNote) {
        this.description = description;
        this.etag = etag;
        this.name = name;
        this.updateTime = updateTime;
        this.userOwnedGrafeasNote = userOwnedGrafeasNote;
    }

    /**
     * @return Optional. A descriptive comment. This field may be updated. The field may be displayed in chooser dialogs.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Optional. A checksum, returned by the server, that can be sent on update requests to ensure the attestor has an up-to-date value before attempting to update it. See https://google.aip.dev/154.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return The resource name, in the format: `projects/*{@literal /}attestors/*`. This field may not be updated.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Time when the attestor was last updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }
    /**
     * @return This specifies how an attestation will be read, and how it will be used during policy enforcement.
     * 
     */
    public UserOwnedGrafeasNoteResponse userOwnedGrafeasNote() {
        return this.userOwnedGrafeasNote;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAttestorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String etag;
        private String name;
        private String updateTime;
        private UserOwnedGrafeasNoteResponse userOwnedGrafeasNote;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAttestorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.name = defaults.name;
    	      this.updateTime = defaults.updateTime;
    	      this.userOwnedGrafeasNote = defaults.userOwnedGrafeasNote;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public Builder userOwnedGrafeasNote(UserOwnedGrafeasNoteResponse userOwnedGrafeasNote) {
            this.userOwnedGrafeasNote = Objects.requireNonNull(userOwnedGrafeasNote);
            return this;
        }        public GetAttestorResult build() {
            return new GetAttestorResult(description, etag, name, updateTime, userOwnedGrafeasNote);
        }
    }
}
