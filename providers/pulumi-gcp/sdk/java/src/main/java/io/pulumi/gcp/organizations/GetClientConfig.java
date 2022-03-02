// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.organizations.outputs.GetClientConfigResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetClientConfig {
    private GetClientConfig() {}
    /**
         * Use this data source to access the configuration of the Google Cloud provider.
     * 
     * ## Example Usage
     * 
     *
         * A collection of values returned by getClientConfig.
     * 
     */
    public static CompletableFuture<GetClientConfigResult> invokeAsync(@Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:organizations/getClientConfig:getClientConfig", TypeShape.of(GetClientConfigResult.class), io.pulumi.resources.InvokeArgs.Empty, Utilities.withVersion(options));
    }
}
