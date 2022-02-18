// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetLocationHDFSArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLocationHDFSArgs Empty = new GetLocationHDFSArgs();

    /**
     * The Amazon Resource Name (ARN) of the HDFS location.
     * 
     */
    @InputImport(name="locationArn", required=true)
    private final String locationArn;

    public String getLocationArn() {
        return this.locationArn;
    }

    public GetLocationHDFSArgs(String locationArn) {
        this.locationArn = Objects.requireNonNull(locationArn, "expected parameter 'locationArn' to be non-null");
    }

    private GetLocationHDFSArgs() {
        this.locationArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocationHDFSArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String locationArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocationHDFSArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locationArn = defaults.locationArn;
        }

        public Builder setLocationArn(String locationArn) {
            this.locationArn = Objects.requireNonNull(locationArn);
            return this;
        }

        public GetLocationHDFSArgs build() {
            return new GetLocationHDFSArgs(locationArn);
        }
    }
}
