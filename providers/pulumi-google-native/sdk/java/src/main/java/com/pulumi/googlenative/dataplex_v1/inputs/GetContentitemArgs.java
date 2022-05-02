// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetContentitemArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetContentitemArgs Empty = new GetContentitemArgs();

    @Import(name="contentitemId", required=true)
    private String contentitemId;

    public String contentitemId() {
        return this.contentitemId;
    }

    @Import(name="lakeId", required=true)
    private String lakeId;

    public String lakeId() {
        return this.lakeId;
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

    @Import(name="view")
    private @Nullable String view;

    public Optional<String> view() {
        return Optional.ofNullable(this.view);
    }

    private GetContentitemArgs() {}

    private GetContentitemArgs(GetContentitemArgs $) {
        this.contentitemId = $.contentitemId;
        this.lakeId = $.lakeId;
        this.location = $.location;
        this.project = $.project;
        this.view = $.view;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetContentitemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetContentitemArgs $;

        public Builder() {
            $ = new GetContentitemArgs();
        }

        public Builder(GetContentitemArgs defaults) {
            $ = new GetContentitemArgs(Objects.requireNonNull(defaults));
        }

        public Builder contentitemId(String contentitemId) {
            $.contentitemId = contentitemId;
            return this;
        }

        public Builder lakeId(String lakeId) {
            $.lakeId = lakeId;
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

        public Builder view(@Nullable String view) {
            $.view = view;
            return this;
        }

        public GetContentitemArgs build() {
            $.contentitemId = Objects.requireNonNull($.contentitemId, "expected parameter 'contentitemId' to be non-null");
            $.lakeId = Objects.requireNonNull($.lakeId, "expected parameter 'lakeId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
