// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAppArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAppArgs Empty = new GetAppArgs();

    @InputImport(name="appId", required=true)
    private final String appId;

    public String getAppId() {
        return this.appId;
    }

    public GetAppArgs(String appId) {
        this.appId = Objects.requireNonNull(appId, "expected parameter 'appId' to be non-null");
    }

    private GetAppArgs() {
        this.appId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
        }

        public Builder setAppId(String appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }

        public GetAppArgs build() {
            return new GetAppArgs(appId);
        }
    }
}