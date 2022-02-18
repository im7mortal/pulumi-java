// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.backup.inputs.GetBackupPlanArgs;
import io.pulumi.awsnative.backup.outputs.GetBackupPlanResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBackupPlan {
/**
 * Resource Type definition for AWS::Backup::BackupPlan
 * 
 */
    public static CompletableFuture<GetBackupPlanResult> invokeAsync(GetBackupPlanArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:backup:getBackupPlan", TypeShape.of(GetBackupPlanResult.class), args == null ? GetBackupPlanArgs.Empty : args, Utilities.withVersion(options));
    }
}