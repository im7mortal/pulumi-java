// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAppImageConfigArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAppImageConfigArgs Empty = new GetAppImageConfigArgs();

    /**
     * The Name of the AppImageConfig.
     * 
     */
    @InputImport(name="appImageConfigName", required=true)
    private final String appImageConfigName;

    public String getAppImageConfigName() {
        return this.appImageConfigName;
    }

    public GetAppImageConfigArgs(String appImageConfigName) {
        this.appImageConfigName = Objects.requireNonNull(appImageConfigName, "expected parameter 'appImageConfigName' to be non-null");
    }

    private GetAppImageConfigArgs() {
        this.appImageConfigName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppImageConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appImageConfigName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppImageConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appImageConfigName = defaults.appImageConfigName;
        }

        public Builder setAppImageConfigName(String appImageConfigName) {
            this.appImageConfigName = Objects.requireNonNull(appImageConfigName);
            return this;
        }

        public GetAppImageConfigArgs build() {
            return new GetAppImageConfigArgs(appImageConfigName);
        }
    }
}