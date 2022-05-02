// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTcpRouteArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTcpRouteArgs Empty = new GetTcpRouteArgs();

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

    @Import(name="tcpRouteId", required=true)
    private String tcpRouteId;

    public String tcpRouteId() {
        return this.tcpRouteId;
    }

    private GetTcpRouteArgs() {}

    private GetTcpRouteArgs(GetTcpRouteArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.tcpRouteId = $.tcpRouteId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTcpRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTcpRouteArgs $;

        public Builder() {
            $ = new GetTcpRouteArgs();
        }

        public Builder(GetTcpRouteArgs defaults) {
            $ = new GetTcpRouteArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder tcpRouteId(String tcpRouteId) {
            $.tcpRouteId = tcpRouteId;
            return this;
        }

        public GetTcpRouteArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.tcpRouteId = Objects.requireNonNull($.tcpRouteId, "expected parameter 'tcpRouteId' to be non-null");
            return $;
        }
    }

}
