// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.UserProfileJupyterServerAppSettings;
import io.pulumi.awsnative.sagemaker.inputs.UserProfileKernelGatewayAppSettings;
import io.pulumi.awsnative.sagemaker.inputs.UserProfileSharingSettings;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A collection of settings that apply to users of Amazon SageMaker Studio. These settings are specified when the CreateUserProfile API is called, and as DefaultUserSettings when the CreateDomain API is called.
 * 
 */
public final class UserProfileUserSettings extends io.pulumi.resources.InvokeArgs {

    public static final UserProfileUserSettings Empty = new UserProfileUserSettings();

    /**
     * The user profile Amazon Resource Name (ARN).
     * 
     */
    @InputImport(name="executionRole")
    private final @Nullable String executionRole;

    public Optional<String> getExecutionRole() {
        return this.executionRole == null ? Optional.empty() : Optional.ofNullable(this.executionRole);
    }

    /**
     * The Jupyter server's app settings.
     * 
     */
    @InputImport(name="jupyterServerAppSettings")
    private final @Nullable UserProfileJupyterServerAppSettings jupyterServerAppSettings;

    public Optional<UserProfileJupyterServerAppSettings> getJupyterServerAppSettings() {
        return this.jupyterServerAppSettings == null ? Optional.empty() : Optional.ofNullable(this.jupyterServerAppSettings);
    }

    /**
     * The kernel gateway app settings.
     * 
     */
    @InputImport(name="kernelGatewayAppSettings")
    private final @Nullable UserProfileKernelGatewayAppSettings kernelGatewayAppSettings;

    public Optional<UserProfileKernelGatewayAppSettings> getKernelGatewayAppSettings() {
        return this.kernelGatewayAppSettings == null ? Optional.empty() : Optional.ofNullable(this.kernelGatewayAppSettings);
    }

    /**
     * The security groups for the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * 
     */
    @InputImport(name="securityGroups")
    private final @Nullable List<String> securityGroups;

    public List<String> getSecurityGroups() {
        return this.securityGroups == null ? List.of() : this.securityGroups;
    }

    /**
     * The sharing settings.
     * 
     */
    @InputImport(name="sharingSettings")
    private final @Nullable UserProfileSharingSettings sharingSettings;

    public Optional<UserProfileSharingSettings> getSharingSettings() {
        return this.sharingSettings == null ? Optional.empty() : Optional.ofNullable(this.sharingSettings);
    }

    public UserProfileUserSettings(
        @Nullable String executionRole,
        @Nullable UserProfileJupyterServerAppSettings jupyterServerAppSettings,
        @Nullable UserProfileKernelGatewayAppSettings kernelGatewayAppSettings,
        @Nullable List<String> securityGroups,
        @Nullable UserProfileSharingSettings sharingSettings) {
        this.executionRole = executionRole;
        this.jupyterServerAppSettings = jupyterServerAppSettings;
        this.kernelGatewayAppSettings = kernelGatewayAppSettings;
        this.securityGroups = securityGroups;
        this.sharingSettings = sharingSettings;
    }

    private UserProfileUserSettings() {
        this.executionRole = null;
        this.jupyterServerAppSettings = null;
        this.kernelGatewayAppSettings = null;
        this.securityGroups = List.of();
        this.sharingSettings = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileUserSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String executionRole;
        private @Nullable UserProfileJupyterServerAppSettings jupyterServerAppSettings;
        private @Nullable UserProfileKernelGatewayAppSettings kernelGatewayAppSettings;
        private @Nullable List<String> securityGroups;
        private @Nullable UserProfileSharingSettings sharingSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(UserProfileUserSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executionRole = defaults.executionRole;
    	      this.jupyterServerAppSettings = defaults.jupyterServerAppSettings;
    	      this.kernelGatewayAppSettings = defaults.kernelGatewayAppSettings;
    	      this.securityGroups = defaults.securityGroups;
    	      this.sharingSettings = defaults.sharingSettings;
        }

        public Builder setExecutionRole(@Nullable String executionRole) {
            this.executionRole = executionRole;
            return this;
        }

        public Builder setJupyterServerAppSettings(@Nullable UserProfileJupyterServerAppSettings jupyterServerAppSettings) {
            this.jupyterServerAppSettings = jupyterServerAppSettings;
            return this;
        }

        public Builder setKernelGatewayAppSettings(@Nullable UserProfileKernelGatewayAppSettings kernelGatewayAppSettings) {
            this.kernelGatewayAppSettings = kernelGatewayAppSettings;
            return this;
        }

        public Builder setSecurityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        public Builder setSharingSettings(@Nullable UserProfileSharingSettings sharingSettings) {
            this.sharingSettings = sharingSettings;
            return this;
        }

        public UserProfileUserSettings build() {
            return new UserProfileUserSettings(executionRole, jupyterServerAppSettings, kernelGatewayAppSettings, securityGroups, sharingSettings);
        }
    }
}
