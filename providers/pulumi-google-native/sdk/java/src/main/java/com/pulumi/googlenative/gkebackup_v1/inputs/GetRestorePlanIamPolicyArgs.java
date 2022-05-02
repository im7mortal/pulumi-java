// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkebackup_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRestorePlanIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRestorePlanIamPolicyArgs Empty = new GetRestorePlanIamPolicyArgs();

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

    @Import(name="restorePlanId", required=true)
    private String restorePlanId;

    public String restorePlanId() {
        return this.restorePlanId;
    }

    private GetRestorePlanIamPolicyArgs() {}

    private GetRestorePlanIamPolicyArgs(GetRestorePlanIamPolicyArgs $) {
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
        this.restorePlanId = $.restorePlanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRestorePlanIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRestorePlanIamPolicyArgs $;

        public Builder() {
            $ = new GetRestorePlanIamPolicyArgs();
        }

        public Builder(GetRestorePlanIamPolicyArgs defaults) {
            $ = new GetRestorePlanIamPolicyArgs(Objects.requireNonNull(defaults));
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

        public Builder restorePlanId(String restorePlanId) {
            $.restorePlanId = restorePlanId;
            return this;
        }

        public GetRestorePlanIamPolicyArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.restorePlanId = Objects.requireNonNull($.restorePlanId, "expected parameter 'restorePlanId' to be non-null");
            return $;
        }
    }

}
