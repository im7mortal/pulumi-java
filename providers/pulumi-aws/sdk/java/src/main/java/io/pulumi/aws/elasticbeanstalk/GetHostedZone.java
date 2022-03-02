// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticbeanstalk;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.elasticbeanstalk.inputs.GetHostedZoneArgs;
import io.pulumi.aws.elasticbeanstalk.outputs.GetHostedZoneResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetHostedZone {
    private GetHostedZone() {}
    public interface BuilderApplicator {
        public void apply(GetHostedZoneArgs.Builder a);
    }
    private static GetHostedZoneArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetHostedZoneArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Use this data source to get the ID of an [elastic beanstalk hosted zone](http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region).
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getHostedZone.
 * 
     *
     * A collection of values returned by getHostedZone.
 * 
     */
    public static CompletableFuture<GetHostedZoneResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Use this data source to get the ID of an [elastic beanstalk hosted zone](http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region).
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getHostedZone.
     * 
     *
         * A collection of values returned by getHostedZone.
     * 
     */
    public static CompletableFuture<GetHostedZoneResult> invokeAsync(@Nullable GetHostedZoneArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:elasticbeanstalk/getHostedZone:getHostedZone", TypeShape.of(GetHostedZoneResult.class), args == null ? GetHostedZoneArgs.Empty : args, Utilities.withVersion(options));
    }
}
