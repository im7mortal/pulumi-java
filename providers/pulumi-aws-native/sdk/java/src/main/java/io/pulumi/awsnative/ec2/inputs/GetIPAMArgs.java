// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetIPAMArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetIPAMArgs Empty = new GetIPAMArgs();

    /**
     * Id of the IPAM.
     * 
     */
    @InputImport(name="ipamId", required=true)
    private final String ipamId;

    public String getIpamId() {
        return this.ipamId;
    }

    public GetIPAMArgs(String ipamId) {
        this.ipamId = Objects.requireNonNull(ipamId, "expected parameter 'ipamId' to be non-null");
    }

    private GetIPAMArgs() {
        this.ipamId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIPAMArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipamId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIPAMArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipamId = defaults.ipamId;
        }

        public Builder setIpamId(String ipamId) {
            this.ipamId = Objects.requireNonNull(ipamId);
            return this;
        }

        public GetIPAMArgs build() {
            return new GetIPAMArgs(ipamId);
        }
    }
}