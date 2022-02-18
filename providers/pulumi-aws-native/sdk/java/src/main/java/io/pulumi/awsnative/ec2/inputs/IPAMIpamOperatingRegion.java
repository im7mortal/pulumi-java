// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The regions IPAM is enabled for. Allows pools to be created in these regions, as well as enabling monitoring
 * 
 */
public final class IPAMIpamOperatingRegion extends io.pulumi.resources.InvokeArgs {

    public static final IPAMIpamOperatingRegion Empty = new IPAMIpamOperatingRegion();

    /**
     * The name of the region.
     * 
     */
    @InputImport(name="regionName", required=true)
    private final String regionName;

    public String getRegionName() {
        return this.regionName;
    }

    public IPAMIpamOperatingRegion(String regionName) {
        this.regionName = Objects.requireNonNull(regionName, "expected parameter 'regionName' to be non-null");
    }

    private IPAMIpamOperatingRegion() {
        this.regionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPAMIpamOperatingRegion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String regionName;

        public Builder() {
    	      // Empty
        }

        public Builder(IPAMIpamOperatingRegion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regionName = defaults.regionName;
        }

        public Builder setRegionName(String regionName) {
            this.regionName = Objects.requireNonNull(regionName);
            return this;
        }

        public IPAMIpamOperatingRegion build() {
            return new IPAMIpamOperatingRegion(regionName);
        }
    }
}
