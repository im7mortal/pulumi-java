// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.monitoring.inputs.GetMeshIstioServiceArgs;
import io.pulumi.gcp.monitoring.outputs.GetMeshIstioServiceResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetMeshIstioService {
/**
 * A Monitoring Service is the root resource under which operational aspects of a
 * generic service are accessible. A service is some discrete, autonomous, and
 * network-accessible unit, designed to solve an individual concern
 * 
 * An Mesh Istio monitoring service is automatically created by GCP to monitor
 * Mesh Istio services.
 * 
 * To get more information about Service, see:
 * 
 * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services)
 * * How-to Guides
 *     * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
 *     * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getMeshIstioService.
 * 
 *
 * A collection of values returned by getMeshIstioService.
 * 
 */
    public static CompletableFuture<GetMeshIstioServiceResult> invokeAsync(GetMeshIstioServiceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:monitoring/getMeshIstioService:getMeshIstioService", TypeShape.of(GetMeshIstioServiceResult.class), args == null ? GetMeshIstioServiceArgs.Empty : args, Utilities.withVersion(options));
    }
}