// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dataproc_v1.inputs.GetRegionJobIamPolicyArgs;
import io.pulumi.googlenative.dataproc_v1.outputs.GetRegionJobIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRegionJobIamPolicy {
    private GetRegionJobIamPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetRegionJobIamPolicyArgs.Builder a);
    }
    private static GetRegionJobIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetRegionJobIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
     */
    public static CompletableFuture<GetRegionJobIamPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetRegionJobIamPolicyResult> invokeAsync(GetRegionJobIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dataproc/v1:getRegionJobIamPolicy", TypeShape.of(GetRegionJobIamPolicyResult.class), args == null ? GetRegionJobIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
