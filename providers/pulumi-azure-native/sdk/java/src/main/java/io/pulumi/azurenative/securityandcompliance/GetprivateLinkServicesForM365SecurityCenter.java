// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityandcompliance;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityandcompliance.inputs.GetprivateLinkServicesForM365SecurityCenterArgs;
import io.pulumi.azurenative.securityandcompliance.outputs.GetprivateLinkServicesForM365SecurityCenterResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetprivateLinkServicesForM365SecurityCenter {
    private GetprivateLinkServicesForM365SecurityCenter() {}
    public interface BuilderApplicator {
        public void apply(GetprivateLinkServicesForM365SecurityCenterArgs.Builder a);
    }
    private static GetprivateLinkServicesForM365SecurityCenterArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetprivateLinkServicesForM365SecurityCenterArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The description of the service.
 * API Version: 2021-03-08.
 * 
     *
     * The description of the service.
 * 
     */
    public static CompletableFuture<GetprivateLinkServicesForM365SecurityCenterResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The description of the service.
     * API Version: 2021-03-08.
     * 
     *
         * The description of the service.
     * 
     */
    public static CompletableFuture<GetprivateLinkServicesForM365SecurityCenterResult> invokeAsync(GetprivateLinkServicesForM365SecurityCenterArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:securityandcompliance:getprivateLinkServicesForM365SecurityCenter", TypeShape.of(GetprivateLinkServicesForM365SecurityCenterResult.class), args == null ? GetprivateLinkServicesForM365SecurityCenterArgs.Empty : args, Utilities.withVersion(options));
    }
}
