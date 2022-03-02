// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AppRegistrationResponse {
    /**
     * The App ID of the app used for login.
     * 
     */
    private final @Nullable String appId;
    /**
     * The app setting name that contains the app secret.
     * 
     */
    private final @Nullable String appSecretSettingName;

    @OutputCustomType.Constructor({"appId","appSecretSettingName"})
    private AppRegistrationResponse(
        @Nullable String appId,
        @Nullable String appSecretSettingName) {
        this.appId = appId;
        this.appSecretSettingName = appSecretSettingName;
    }

    /**
     * The App ID of the app used for login.
     * 
    */
    public Optional<String> getAppId() {
        return Optional.ofNullable(this.appId);
    }
    /**
     * The app setting name that contains the app secret.
     * 
    */
    public Optional<String> getAppSecretSettingName() {
        return Optional.ofNullable(this.appSecretSettingName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppRegistrationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String appId;
        private @Nullable String appSecretSettingName;

        public Builder() {
    	      // Empty
        }

        public Builder(AppRegistrationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.appSecretSettingName = defaults.appSecretSettingName;
        }

        public Builder setAppId(@Nullable String appId) {
            this.appId = appId;
            return this;
        }

        public Builder setAppSecretSettingName(@Nullable String appSecretSettingName) {
            this.appSecretSettingName = appSecretSettingName;
            return this;
        }
        public AppRegistrationResponse build() {
            return new AppRegistrationResponse(appId, appSecretSettingName);
        }
    }
}
