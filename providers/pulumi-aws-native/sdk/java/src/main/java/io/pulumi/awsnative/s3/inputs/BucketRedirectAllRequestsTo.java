// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.enums.BucketRedirectAllRequestsToProtocol;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the redirect behavior of all requests to a website endpoint of an Amazon S3 bucket.
 * 
 */
public final class BucketRedirectAllRequestsTo extends io.pulumi.resources.InvokeArgs {

    public static final BucketRedirectAllRequestsTo Empty = new BucketRedirectAllRequestsTo();

    /**
     * Name of the host where requests are redirected.
     * 
     */
    @InputImport(name="hostName", required=true)
    private final String hostName;

    public String getHostName() {
        return this.hostName;
    }

    /**
     * Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
     * 
     */
    @InputImport(name="protocol")
    private final @Nullable BucketRedirectAllRequestsToProtocol protocol;

    public Optional<BucketRedirectAllRequestsToProtocol> getProtocol() {
        return this.protocol == null ? Optional.empty() : Optional.ofNullable(this.protocol);
    }

    public BucketRedirectAllRequestsTo(
        String hostName,
        @Nullable BucketRedirectAllRequestsToProtocol protocol) {
        this.hostName = Objects.requireNonNull(hostName, "expected parameter 'hostName' to be non-null");
        this.protocol = protocol;
    }

    private BucketRedirectAllRequestsTo() {
        this.hostName = null;
        this.protocol = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketRedirectAllRequestsTo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hostName;
        private @Nullable BucketRedirectAllRequestsToProtocol protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketRedirectAllRequestsTo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostName = defaults.hostName;
    	      this.protocol = defaults.protocol;
        }

        public Builder setHostName(String hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }

        public Builder setProtocol(@Nullable BucketRedirectAllRequestsToProtocol protocol) {
            this.protocol = protocol;
            return this;
        }

        public BucketRedirectAllRequestsTo build() {
            return new BucketRedirectAllRequestsTo(hostName, protocol);
        }
    }
}
