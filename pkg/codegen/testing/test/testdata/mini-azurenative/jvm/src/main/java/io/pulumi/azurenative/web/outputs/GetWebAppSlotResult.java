// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.SiteConfigResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWebAppSlotResult {
    /**
     * Configuration of the app.
     * 
     */
    private final @Nullable SiteConfigResponse siteConfig;

    @OutputCustomType.Constructor({"siteConfig"})
    private GetWebAppSlotResult(@Nullable SiteConfigResponse siteConfig) {
        this.siteConfig = siteConfig;
    }

    /**
     * Configuration of the app.
     * 
    */
    public Optional<SiteConfigResponse> getSiteConfig() {
        return Optional.ofNullable(this.siteConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppSlotResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SiteConfigResponse siteConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppSlotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.siteConfig = defaults.siteConfig;
        }

        public Builder setSiteConfig(@Nullable SiteConfigResponse siteConfig) {
            this.siteConfig = siteConfig;
            return this;
        }
        public GetWebAppSlotResult build() {
            return new GetWebAppSlotResult(siteConfig);
        }
    }
}
