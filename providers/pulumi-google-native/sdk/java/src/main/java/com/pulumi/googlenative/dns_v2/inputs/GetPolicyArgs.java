// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPolicyArgs Empty = new GetPolicyArgs();

    @Import(name="clientOperationId")
    private @Nullable String clientOperationId;

    public Optional<String> clientOperationId() {
        return Optional.ofNullable(this.clientOperationId);
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="policy", required=true)
    private String policy;

    public String policy() {
        return this.policy;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetPolicyArgs() {}

    private GetPolicyArgs(GetPolicyArgs $) {
        this.clientOperationId = $.clientOperationId;
        this.location = $.location;
        this.policy = $.policy;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPolicyArgs $;

        public Builder() {
            $ = new GetPolicyArgs();
        }

        public Builder(GetPolicyArgs defaults) {
            $ = new GetPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientOperationId(@Nullable String clientOperationId) {
            $.clientOperationId = clientOperationId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder policy(String policy) {
            $.policy = policy;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetPolicyArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.policy = Objects.requireNonNull($.policy, "expected parameter 'policy' to be non-null");
            return $;
        }
    }

}
