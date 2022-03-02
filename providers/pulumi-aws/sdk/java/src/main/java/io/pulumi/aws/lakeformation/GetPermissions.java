// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lakeformation;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.lakeformation.inputs.GetPermissionsArgs;
import io.pulumi.aws.lakeformation.outputs.GetPermissionsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPermissions {
    private GetPermissions() {}
    public interface BuilderApplicator {
        public void apply(GetPermissionsArgs.Builder a);
    }
    private static GetPermissionsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetPermissionsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Get permissions for a principal to access metadata in the Data Catalog and data organized in underlying data storage such as Amazon S3. Permissions are granted to a principal, in a Data Catalog, relative to a Lake Formation resource, which includes the Data Catalog, databases, and tables. For more information, see [Security and Access Control to Metadata and Data in Lake Formation](https://docs.aws.amazon.com/lake-formation/latest/dg/security-data-access.html).
 * 
 * > **NOTE:** This data source deals with explicitly granted permissions. Lake Formation grants implicit permissions to data lake administrators, database creators, and table creators. For more information, see [Implicit Lake Formation Permissions](https://docs.aws.amazon.com/lake-formation/latest/dg/implicit-permissions.html).
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getPermissions.
 * 
     *
     * A collection of values returned by getPermissions.
 * 
     */
    public static CompletableFuture<GetPermissionsResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Get permissions for a principal to access metadata in the Data Catalog and data organized in underlying data storage such as Amazon S3. Permissions are granted to a principal, in a Data Catalog, relative to a Lake Formation resource, which includes the Data Catalog, databases, and tables. For more information, see [Security and Access Control to Metadata and Data in Lake Formation](https://docs.aws.amazon.com/lake-formation/latest/dg/security-data-access.html).
     * 
     * > **NOTE:** This data source deals with explicitly granted permissions. Lake Formation grants implicit permissions to data lake administrators, database creators, and table creators. For more information, see [Implicit Lake Formation Permissions](https://docs.aws.amazon.com/lake-formation/latest/dg/implicit-permissions.html).
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getPermissions.
     * 
     *
         * A collection of values returned by getPermissions.
     * 
     */
    public static CompletableFuture<GetPermissionsResult> invokeAsync(GetPermissionsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:lakeformation/getPermissions:getPermissions", TypeShape.of(GetPermissionsResult.class), args == null ? GetPermissionsArgs.Empty : args, Utilities.withVersion(options));
    }
}
