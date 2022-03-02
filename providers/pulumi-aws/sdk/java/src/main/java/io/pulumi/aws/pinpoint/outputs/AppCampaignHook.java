// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.pinpoint.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AppCampaignHook {
    /**
     * Lambda function name or ARN to be called for delivery. Conflicts with `web_url`
     * 
     */
    private final @Nullable String lambdaFunctionName;
    /**
     * What mode Lambda should be invoked in. Valid values for this parameter are `DELIVERY`, `FILTER`.
     * 
     */
    private final @Nullable String mode;
    /**
     * Web URL to call for hook. If the URL has authentication specified it will be added as authentication to the request. Conflicts with `lambda_function_name`
     * 
     */
    private final @Nullable String webUrl;

    @OutputCustomType.Constructor({"lambdaFunctionName","mode","webUrl"})
    private AppCampaignHook(
        @Nullable String lambdaFunctionName,
        @Nullable String mode,
        @Nullable String webUrl) {
        this.lambdaFunctionName = lambdaFunctionName;
        this.mode = mode;
        this.webUrl = webUrl;
    }

    /**
     * Lambda function name or ARN to be called for delivery. Conflicts with `web_url`
     * 
    */
    public Optional<String> getLambdaFunctionName() {
        return Optional.ofNullable(this.lambdaFunctionName);
    }
    /**
     * What mode Lambda should be invoked in. Valid values for this parameter are `DELIVERY`, `FILTER`.
     * 
    */
    public Optional<String> getMode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * Web URL to call for hook. If the URL has authentication specified it will be added as authentication to the request. Conflicts with `lambda_function_name`
     * 
    */
    public Optional<String> getWebUrl() {
        return Optional.ofNullable(this.webUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppCampaignHook defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String lambdaFunctionName;
        private @Nullable String mode;
        private @Nullable String webUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(AppCampaignHook defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lambdaFunctionName = defaults.lambdaFunctionName;
    	      this.mode = defaults.mode;
    	      this.webUrl = defaults.webUrl;
        }

        public Builder setLambdaFunctionName(@Nullable String lambdaFunctionName) {
            this.lambdaFunctionName = lambdaFunctionName;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }

        public Builder setWebUrl(@Nullable String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public AppCampaignHook build() {
            return new AppCampaignHook(lambdaFunctionName, mode, webUrl);
        }
    }
}
