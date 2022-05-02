// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkconnectivity_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceInstanceIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceInstanceIamPolicyArgs Empty = new GetServiceInstanceIamPolicyArgs();

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="serviceInstanceId", required=true)
    private String serviceInstanceId;

    public String serviceInstanceId() {
        return this.serviceInstanceId;
    }

    private GetServiceInstanceIamPolicyArgs() {}

    private GetServiceInstanceIamPolicyArgs(GetServiceInstanceIamPolicyArgs $) {
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
        this.serviceInstanceId = $.serviceInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceInstanceIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceInstanceIamPolicyArgs $;

        public Builder() {
            $ = new GetServiceInstanceIamPolicyArgs();
        }

        public Builder(GetServiceInstanceIamPolicyArgs defaults) {
            $ = new GetServiceInstanceIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder serviceInstanceId(String serviceInstanceId) {
            $.serviceInstanceId = serviceInstanceId;
            return this;
        }

        public GetServiceInstanceIamPolicyArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.serviceInstanceId = Objects.requireNonNull($.serviceInstanceId, "expected parameter 'serviceInstanceId' to be non-null");
            return $;
        }
    }

}
