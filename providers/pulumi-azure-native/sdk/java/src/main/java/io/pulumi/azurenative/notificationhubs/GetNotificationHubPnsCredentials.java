// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notificationhubs;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.notificationhubs.inputs.GetNotificationHubPnsCredentialsArgs;
import io.pulumi.azurenative.notificationhubs.outputs.GetNotificationHubPnsCredentialsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNotificationHubPnsCredentials {
    private GetNotificationHubPnsCredentials() {}
    public interface BuilderApplicator {
        public void apply(GetNotificationHubPnsCredentialsArgs.Builder a);
    }
    private static GetNotificationHubPnsCredentialsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetNotificationHubPnsCredentialsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Description of a NotificationHub PNS Credentials.
 * API Version: 2017-04-01.
 * 
     *
     * Description of a NotificationHub PNS Credentials.
 * 
     */
    public static CompletableFuture<GetNotificationHubPnsCredentialsResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Description of a NotificationHub PNS Credentials.
     * API Version: 2017-04-01.
     * 
     *
         * Description of a NotificationHub PNS Credentials.
     * 
     */
    public static CompletableFuture<GetNotificationHubPnsCredentialsResult> invokeAsync(GetNotificationHubPnsCredentialsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:notificationhubs:getNotificationHubPnsCredentials", TypeShape.of(GetNotificationHubPnsCredentialsResult.class), args == null ? GetNotificationHubPnsCredentialsArgs.Empty : args, Utilities.withVersion(options));
    }
}
