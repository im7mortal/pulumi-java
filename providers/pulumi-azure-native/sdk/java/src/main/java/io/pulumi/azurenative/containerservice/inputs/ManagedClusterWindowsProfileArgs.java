// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.azurenative.containerservice.enums.LicenseType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedClusterWindowsProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedClusterWindowsProfileArgs Empty = new ManagedClusterWindowsProfileArgs();

    @InputImport(name="adminPassword")
    private final @Nullable Input<String> adminPassword;

    public Input<String> getAdminPassword() {
        return this.adminPassword == null ? Input.empty() : this.adminPassword;
    }

    @InputImport(name="adminUsername", required=true)
    private final Input<String> adminUsername;

    public Input<String> getAdminUsername() {
        return this.adminUsername;
    }

    @InputImport(name="enableCSIProxy")
    private final @Nullable Input<Boolean> enableCSIProxy;

    public Input<Boolean> getEnableCSIProxy() {
        return this.enableCSIProxy == null ? Input.empty() : this.enableCSIProxy;
    }

    @InputImport(name="licenseType")
    private final @Nullable Input<Either<String,LicenseType>> licenseType;

    public Input<Either<String,LicenseType>> getLicenseType() {
        return this.licenseType == null ? Input.empty() : this.licenseType;
    }

    public ManagedClusterWindowsProfileArgs(
        @Nullable Input<String> adminPassword,
        Input<String> adminUsername,
        @Nullable Input<Boolean> enableCSIProxy,
        @Nullable Input<Either<String,LicenseType>> licenseType) {
        this.adminPassword = adminPassword;
        this.adminUsername = Objects.requireNonNull(adminUsername, "expected parameter 'adminUsername' to be non-null");
        this.enableCSIProxy = enableCSIProxy;
        this.licenseType = licenseType;
    }

    private ManagedClusterWindowsProfileArgs() {
        this.adminPassword = Input.empty();
        this.adminUsername = Input.empty();
        this.enableCSIProxy = Input.empty();
        this.licenseType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterWindowsProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> adminPassword;
        private Input<String> adminUsername;
        private @Nullable Input<Boolean> enableCSIProxy;
        private @Nullable Input<Either<String,LicenseType>> licenseType;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterWindowsProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminPassword = defaults.adminPassword;
    	      this.adminUsername = defaults.adminUsername;
    	      this.enableCSIProxy = defaults.enableCSIProxy;
    	      this.licenseType = defaults.licenseType;
        }

        public Builder setAdminPassword(@Nullable Input<String> adminPassword) {
            this.adminPassword = adminPassword;
            return this;
        }

        public Builder setAdminPassword(@Nullable String adminPassword) {
            this.adminPassword = Input.ofNullable(adminPassword);
            return this;
        }

        public Builder setAdminUsername(Input<String> adminUsername) {
            this.adminUsername = Objects.requireNonNull(adminUsername);
            return this;
        }

        public Builder setAdminUsername(String adminUsername) {
            this.adminUsername = Input.of(Objects.requireNonNull(adminUsername));
            return this;
        }

        public Builder setEnableCSIProxy(@Nullable Input<Boolean> enableCSIProxy) {
            this.enableCSIProxy = enableCSIProxy;
            return this;
        }

        public Builder setEnableCSIProxy(@Nullable Boolean enableCSIProxy) {
            this.enableCSIProxy = Input.ofNullable(enableCSIProxy);
            return this;
        }

        public Builder setLicenseType(@Nullable Input<Either<String,LicenseType>> licenseType) {
            this.licenseType = licenseType;
            return this;
        }

        public Builder setLicenseType(@Nullable Either<String,LicenseType> licenseType) {
            this.licenseType = Input.ofNullable(licenseType);
            return this;
        }

        public ManagedClusterWindowsProfileArgs build() {
            return new ManagedClusterWindowsProfileArgs(adminPassword, adminUsername, enableCSIProxy, licenseType);
        }
    }
}