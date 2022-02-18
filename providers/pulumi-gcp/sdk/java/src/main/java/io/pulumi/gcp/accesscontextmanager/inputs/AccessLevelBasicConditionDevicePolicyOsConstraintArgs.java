// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessLevelBasicConditionDevicePolicyOsConstraintArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessLevelBasicConditionDevicePolicyOsConstraintArgs Empty = new AccessLevelBasicConditionDevicePolicyOsConstraintArgs();

    /**
     * The minimum allowed OS version. If not set, any version
     * of this OS satisfies the constraint.
     * Format: "major.minor.patch" such as "10.5.301", "9.2.1".
     * 
     */
    @InputImport(name="minimumVersion")
    private final @Nullable Input<String> minimumVersion;

    public Input<String> getMinimumVersion() {
        return this.minimumVersion == null ? Input.empty() : this.minimumVersion;
    }

    /**
     * The operating system type of the device.
     * Possible values are `OS_UNSPECIFIED`, `DESKTOP_MAC`, `DESKTOP_WINDOWS`, `DESKTOP_LINUX`, `DESKTOP_CHROME_OS`, `ANDROID`, and `IOS`.
     * 
     */
    @InputImport(name="osType", required=true)
    private final Input<String> osType;

    public Input<String> getOsType() {
        return this.osType;
    }

    /**
     * If you specify DESKTOP_CHROME_OS for osType, you can optionally include requireVerifiedChromeOs to require Chrome Verified Access.
     * 
     */
    @InputImport(name="requireVerifiedChromeOs")
    private final @Nullable Input<Boolean> requireVerifiedChromeOs;

    public Input<Boolean> getRequireVerifiedChromeOs() {
        return this.requireVerifiedChromeOs == null ? Input.empty() : this.requireVerifiedChromeOs;
    }

    public AccessLevelBasicConditionDevicePolicyOsConstraintArgs(
        @Nullable Input<String> minimumVersion,
        Input<String> osType,
        @Nullable Input<Boolean> requireVerifiedChromeOs) {
        this.minimumVersion = minimumVersion;
        this.osType = Objects.requireNonNull(osType, "expected parameter 'osType' to be non-null");
        this.requireVerifiedChromeOs = requireVerifiedChromeOs;
    }

    private AccessLevelBasicConditionDevicePolicyOsConstraintArgs() {
        this.minimumVersion = Input.empty();
        this.osType = Input.empty();
        this.requireVerifiedChromeOs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelBasicConditionDevicePolicyOsConstraintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> minimumVersion;
        private Input<String> osType;
        private @Nullable Input<Boolean> requireVerifiedChromeOs;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelBasicConditionDevicePolicyOsConstraintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minimumVersion = defaults.minimumVersion;
    	      this.osType = defaults.osType;
    	      this.requireVerifiedChromeOs = defaults.requireVerifiedChromeOs;
        }

        public Builder setMinimumVersion(@Nullable Input<String> minimumVersion) {
            this.minimumVersion = minimumVersion;
            return this;
        }

        public Builder setMinimumVersion(@Nullable String minimumVersion) {
            this.minimumVersion = Input.ofNullable(minimumVersion);
            return this;
        }

        public Builder setOsType(Input<String> osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }

        public Builder setOsType(String osType) {
            this.osType = Input.of(Objects.requireNonNull(osType));
            return this;
        }

        public Builder setRequireVerifiedChromeOs(@Nullable Input<Boolean> requireVerifiedChromeOs) {
            this.requireVerifiedChromeOs = requireVerifiedChromeOs;
            return this;
        }

        public Builder setRequireVerifiedChromeOs(@Nullable Boolean requireVerifiedChromeOs) {
            this.requireVerifiedChromeOs = Input.ofNullable(requireVerifiedChromeOs);
            return this;
        }

        public AccessLevelBasicConditionDevicePolicyOsConstraintArgs build() {
            return new AccessLevelBasicConditionDevicePolicyOsConstraintArgs(minimumVersion, osType, requireVerifiedChromeOs);
        }
    }
}