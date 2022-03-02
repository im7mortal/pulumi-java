// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CloudServiceConfigurationResponse {
    /**
     * Possible values are: 2 - OS Family 2, equivalent to Windows Server 2008 R2 SP1. 3 - OS Family 3, equivalent to Windows Server 2012. 4 - OS Family 4, equivalent to Windows Server 2012 R2. 5 - OS Family 5, equivalent to Windows Server 2016. 6 - OS Family 6, equivalent to Windows Server 2019. For more information, see Azure Guest OS Releases (https://azure.microsoft.com/documentation/articles/cloud-services-guestos-update-matrix/#releases).
     * 
     */
    private final String osFamily;
    /**
     * The default value is * which specifies the latest operating system version for the specified OS family.
     * 
     */
    private final @Nullable String osVersion;

    @OutputCustomType.Constructor({"osFamily","osVersion"})
    private CloudServiceConfigurationResponse(
        String osFamily,
        @Nullable String osVersion) {
        this.osFamily = Objects.requireNonNull(osFamily);
        this.osVersion = osVersion;
    }

    /**
     * Possible values are: 2 - OS Family 2, equivalent to Windows Server 2008 R2 SP1. 3 - OS Family 3, equivalent to Windows Server 2012. 4 - OS Family 4, equivalent to Windows Server 2012 R2. 5 - OS Family 5, equivalent to Windows Server 2016. 6 - OS Family 6, equivalent to Windows Server 2019. For more information, see Azure Guest OS Releases (https://azure.microsoft.com/documentation/articles/cloud-services-guestos-update-matrix/#releases).
     * 
    */
    public String getOsFamily() {
        return this.osFamily;
    }
    /**
     * The default value is * which specifies the latest operating system version for the specified OS family.
     * 
    */
    public Optional<String> getOsVersion() {
        return Optional.ofNullable(this.osVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String osFamily;
        private @Nullable String osVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.osFamily = defaults.osFamily;
    	      this.osVersion = defaults.osVersion;
        }

        public Builder setOsFamily(String osFamily) {
            this.osFamily = Objects.requireNonNull(osFamily);
            return this;
        }

        public Builder setOsVersion(@Nullable String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public CloudServiceConfigurationResponse build() {
            return new CloudServiceConfigurationResponse(osFamily, osVersion);
        }
    }
}
