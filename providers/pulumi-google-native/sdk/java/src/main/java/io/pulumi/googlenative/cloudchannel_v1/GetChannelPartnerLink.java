// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudchannel_v1.inputs.GetChannelPartnerLinkArgs;
import io.pulumi.googlenative.cloudchannel_v1.outputs.GetChannelPartnerLinkResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetChannelPartnerLink {
    private GetChannelPartnerLink() {}
    public interface BuilderApplicator {
        public void apply(GetChannelPartnerLinkArgs.Builder a);
    }
    private static GetChannelPartnerLinkArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetChannelPartnerLinkArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Returns the requested ChannelPartnerLink resource. You must be a distributor to call this method. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: ChannelPartnerLink resource not found because of an invalid channel partner link name. Return value: The ChannelPartnerLink resource.
 * 
     */
    public static CompletableFuture<GetChannelPartnerLinkResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Returns the requested ChannelPartnerLink resource. You must be a distributor to call this method. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: ChannelPartnerLink resource not found because of an invalid channel partner link name. Return value: The ChannelPartnerLink resource.
     * 
     */
    public static CompletableFuture<GetChannelPartnerLinkResult> invokeAsync(GetChannelPartnerLinkArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudchannel/v1:getChannelPartnerLink", TypeShape.of(GetChannelPartnerLinkResult.class), args == null ? GetChannelPartnerLinkArgs.Empty : args, Utilities.withVersion(options));
    }
}
