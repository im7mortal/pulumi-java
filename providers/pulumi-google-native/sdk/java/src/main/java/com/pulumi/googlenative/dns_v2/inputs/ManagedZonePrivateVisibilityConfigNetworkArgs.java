// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedZonePrivateVisibilityConfigNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedZonePrivateVisibilityConfigNetworkArgs Empty = new ManagedZonePrivateVisibilityConfigNetworkArgs();

    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * The fully qualified URL of the VPC network to bind to. Format this URL like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}
     * 
     */
    @Import(name="networkUrl")
    private @Nullable Output<String> networkUrl;

    /**
     * @return The fully qualified URL of the VPC network to bind to. Format this URL like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}
     * 
     */
    public Optional<Output<String>> networkUrl() {
        return Optional.ofNullable(this.networkUrl);
    }

    private ManagedZonePrivateVisibilityConfigNetworkArgs() {}

    private ManagedZonePrivateVisibilityConfigNetworkArgs(ManagedZonePrivateVisibilityConfigNetworkArgs $) {
        this.kind = $.kind;
        this.networkUrl = $.networkUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedZonePrivateVisibilityConfigNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedZonePrivateVisibilityConfigNetworkArgs $;

        public Builder() {
            $ = new ManagedZonePrivateVisibilityConfigNetworkArgs();
        }

        public Builder(ManagedZonePrivateVisibilityConfigNetworkArgs defaults) {
            $ = new ManagedZonePrivateVisibilityConfigNetworkArgs(Objects.requireNonNull(defaults));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param networkUrl The fully qualified URL of the VPC network to bind to. Format this URL like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}
         * 
         * @return builder
         * 
         */
        public Builder networkUrl(@Nullable Output<String> networkUrl) {
            $.networkUrl = networkUrl;
            return this;
        }

        /**
         * @param networkUrl The fully qualified URL of the VPC network to bind to. Format this URL like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}
         * 
         * @return builder
         * 
         */
        public Builder networkUrl(String networkUrl) {
            return networkUrl(Output.of(networkUrl));
        }

        public ManagedZonePrivateVisibilityConfigNetworkArgs build() {
            return $;
        }
    }

}
