// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.certificatemanager_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCertificateMapEntryArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCertificateMapEntryArgs Empty = new GetCertificateMapEntryArgs();

    @Import(name="certificateMapEntryId", required=true)
    private String certificateMapEntryId;

    public String certificateMapEntryId() {
        return this.certificateMapEntryId;
    }

    @Import(name="certificateMapId", required=true)
    private String certificateMapId;

    public String certificateMapId() {
        return this.certificateMapId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetCertificateMapEntryArgs() {}

    private GetCertificateMapEntryArgs(GetCertificateMapEntryArgs $) {
        this.certificateMapEntryId = $.certificateMapEntryId;
        this.certificateMapId = $.certificateMapId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCertificateMapEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCertificateMapEntryArgs $;

        public Builder() {
            $ = new GetCertificateMapEntryArgs();
        }

        public Builder(GetCertificateMapEntryArgs defaults) {
            $ = new GetCertificateMapEntryArgs(Objects.requireNonNull(defaults));
        }

        public Builder certificateMapEntryId(String certificateMapEntryId) {
            $.certificateMapEntryId = certificateMapEntryId;
            return this;
        }

        public Builder certificateMapId(String certificateMapId) {
            $.certificateMapId = certificateMapId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetCertificateMapEntryArgs build() {
            $.certificateMapEntryId = Objects.requireNonNull($.certificateMapEntryId, "expected parameter 'certificateMapEntryId' to be non-null");
            $.certificateMapId = Objects.requireNonNull($.certificateMapId, "expected parameter 'certificateMapId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
