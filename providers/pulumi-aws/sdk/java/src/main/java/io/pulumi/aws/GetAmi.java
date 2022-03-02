// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.inputs.GetAmiArgs;
import io.pulumi.aws.outputs.GetAmiResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

@Deprecated /* aws.getAmi has been deprecated in favor of aws.ec2.getAmi */
public class GetAmi {
    private GetAmi() {}
    public interface BuilderApplicator {
        public void apply(GetAmiArgs.Builder a);
    }
    private static GetAmiArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetAmiArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Use this data source to get the ID of a registered AMI for use in other
 * resources.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getAmi.
 * 
     *
     * A collection of values returned by getAmi.
 * 
     * @Deprecated
     * aws.getAmi has been deprecated in favor of aws.ec2.getAmi
 * 
     */
    public static CompletableFuture<GetAmiResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Use this data source to get the ID of a registered AMI for use in other
     * resources.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getAmi.
     * 
     *
         * A collection of values returned by getAmi.
     * 
     * @Deprecated
         * aws.getAmi has been deprecated in favor of aws.ec2.getAmi
     * 
     */
    @Deprecated /* aws.getAmi has been deprecated in favor of aws.ec2.getAmi */
    public static CompletableFuture<GetAmiResult> invokeAsync(GetAmiArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:index/getAmi:getAmi", TypeShape.of(GetAmiResult.class), args == null ? GetAmiArgs.Empty : args, Utilities.withVersion(options));
    }
}
