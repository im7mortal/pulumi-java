// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1.outputs.UpgradeDistributionResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.VersionResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.WindowsUpdateResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class UpgradeOccurrenceResponse {
    /**
     * Metadata about the upgrade for available for the specific operating system for the resource_url. This allows efficient filtering, as well as making it easier to use the occurrence.
     * 
     */
    private final UpgradeDistributionResponse distribution;
    /**
     * Required for non-Windows OS. The package this Upgrade is for.
     * 
     */
    private final String $package;
    /**
     * Required for non-Windows OS. The version of the package in a machine + human readable form.
     * 
     */
    private final VersionResponse parsedVersion;
    /**
     * Required for Windows OS. Represents the metadata about the Windows update.
     * 
     */
    private final WindowsUpdateResponse windowsUpdate;

    @OutputCustomType.Constructor({"distribution","$package","parsedVersion","windowsUpdate"})
    private UpgradeOccurrenceResponse(
        UpgradeDistributionResponse distribution,
        String $package,
        VersionResponse parsedVersion,
        WindowsUpdateResponse windowsUpdate) {
        this.distribution = Objects.requireNonNull(distribution);
        this.$package = Objects.requireNonNull($package);
        this.parsedVersion = Objects.requireNonNull(parsedVersion);
        this.windowsUpdate = Objects.requireNonNull(windowsUpdate);
    }

    /**
     * Metadata about the upgrade for available for the specific operating system for the resource_url. This allows efficient filtering, as well as making it easier to use the occurrence.
     * 
    */
    public UpgradeDistributionResponse getDistribution() {
        return this.distribution;
    }
    /**
     * Required for non-Windows OS. The package this Upgrade is for.
     * 
    */
    public String get$package() {
        return this.$package;
    }
    /**
     * Required for non-Windows OS. The version of the package in a machine + human readable form.
     * 
    */
    public VersionResponse getParsedVersion() {
        return this.parsedVersion;
    }
    /**
     * Required for Windows OS. Represents the metadata about the Windows update.
     * 
    */
    public WindowsUpdateResponse getWindowsUpdate() {
        return this.windowsUpdate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpgradeOccurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UpgradeDistributionResponse distribution;
        private String $package;
        private VersionResponse parsedVersion;
        private WindowsUpdateResponse windowsUpdate;

        public Builder() {
    	      // Empty
        }

        public Builder(UpgradeOccurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distribution = defaults.distribution;
    	      this.$package = defaults.$package;
    	      this.parsedVersion = defaults.parsedVersion;
    	      this.windowsUpdate = defaults.windowsUpdate;
        }

        public Builder setDistribution(UpgradeDistributionResponse distribution) {
            this.distribution = Objects.requireNonNull(distribution);
            return this;
        }

        public Builder set$package(String $package) {
            this.$package = Objects.requireNonNull($package);
            return this;
        }

        public Builder setParsedVersion(VersionResponse parsedVersion) {
            this.parsedVersion = Objects.requireNonNull(parsedVersion);
            return this;
        }

        public Builder setWindowsUpdate(WindowsUpdateResponse windowsUpdate) {
            this.windowsUpdate = Objects.requireNonNull(windowsUpdate);
            return this;
        }
        public UpgradeOccurrenceResponse build() {
            return new UpgradeOccurrenceResponse(distribution, $package, parsedVersion, windowsUpdate);
        }
    }
}
