// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.enums.BucketRedirectAllRequestsToProtocol;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the redirect behavior of all requests to a website endpoint of an Amazon S3 bucket.
 * 
 */
public final class BucketRedirectAllRequestsToArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketRedirectAllRequestsToArgs Empty = new BucketRedirectAllRequestsToArgs();

    /**
     * Name of the host where requests are redirected.
     * 
     */
    @InputImport(name="hostName", required=true)
    private final Input<String> hostName;

    public Input<String> getHostName() {
        return this.hostName;
    }

    /**
     * Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
     * 
     */
    @InputImport(name="protocol")
    private final @Nullable Input<BucketRedirectAllRequestsToProtocol> protocol;

    public Input<BucketRedirectAllRequestsToProtocol> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
    }

    public BucketRedirectAllRequestsToArgs(
        Input<String> hostName,
        @Nullable Input<BucketRedirectAllRequestsToProtocol> protocol) {
        this.hostName = Objects.requireNonNull(hostName, "expected parameter 'hostName' to be non-null");
        this.protocol = protocol;
    }

    private BucketRedirectAllRequestsToArgs() {
        this.hostName = Input.empty();
        this.protocol = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketRedirectAllRequestsToArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> hostName;
        private @Nullable Input<BucketRedirectAllRequestsToProtocol> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketRedirectAllRequestsToArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostName = defaults.hostName;
    	      this.protocol = defaults.protocol;
        }

        public Builder setHostName(Input<String> hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }

        public Builder setHostName(String hostName) {
            this.hostName = Input.of(Objects.requireNonNull(hostName));
            return this;
        }

        public Builder setProtocol(@Nullable Input<BucketRedirectAllRequestsToProtocol> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setProtocol(@Nullable BucketRedirectAllRequestsToProtocol protocol) {
            this.protocol = Input.ofNullable(protocol);
            return this;
        }

        public BucketRedirectAllRequestsToArgs build() {
            return new BucketRedirectAllRequestsToArgs(hostName, protocol);
        }
    }
}
