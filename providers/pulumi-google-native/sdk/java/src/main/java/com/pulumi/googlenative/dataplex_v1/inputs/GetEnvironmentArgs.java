// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEnvironmentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentArgs Empty = new GetEnvironmentArgs();

    @Import(name="environmentId", required=true)
    private String environmentId;

    public String environmentId() {
        return this.environmentId;
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

    private GetEnvironmentArgs() {}

    private GetEnvironmentArgs(GetEnvironmentArgs $) {
        this.environmentId = $.environmentId;
        this.lakeId = $.lakeId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEnvironmentArgs $;

        public Builder() {
            $ = new GetEnvironmentArgs();
        }

        public Builder(GetEnvironmentArgs defaults) {
            $ = new GetEnvironmentArgs(Objects.requireNonNull(defaults));
        }

        public Builder environmentId(String environmentId) {
            $.environmentId = environmentId;
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

        public GetEnvironmentArgs build() {
            $.environmentId = Objects.requireNonNull($.environmentId, "expected parameter 'environmentId' to be non-null");
            $.lakeId = Objects.requireNonNull($.lakeId, "expected parameter 'lakeId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
