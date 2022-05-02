// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.securitycenter_v1;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.securitycenter_v1.inputs.GetFolderBigQueryExportArgs;
import com.pulumi.googlenative.securitycenter_v1.inputs.GetMuteConfigArgs;
import com.pulumi.googlenative.securitycenter_v1.inputs.GetNotificationConfigArgs;
import com.pulumi.googlenative.securitycenter_v1.inputs.GetOrganizationBigQueryExportArgs;
import com.pulumi.googlenative.securitycenter_v1.inputs.GetOrganizationMuteConfigArgs;
import com.pulumi.googlenative.securitycenter_v1.inputs.GetOrganizationSourceIamPolicyArgs;
import com.pulumi.googlenative.securitycenter_v1.inputs.GetProjectBigQueryExportArgs;
import com.pulumi.googlenative.securitycenter_v1.inputs.GetSourceArgs;
import com.pulumi.googlenative.securitycenter_v1.outputs.GetFolderBigQueryExportResult;
import com.pulumi.googlenative.securitycenter_v1.outputs.GetMuteConfigResult;
import com.pulumi.googlenative.securitycenter_v1.outputs.GetNotificationConfigResult;
import com.pulumi.googlenative.securitycenter_v1.outputs.GetOrganizationBigQueryExportResult;
import com.pulumi.googlenative.securitycenter_v1.outputs.GetOrganizationMuteConfigResult;
import com.pulumi.googlenative.securitycenter_v1.outputs.GetOrganizationSourceIamPolicyResult;
import com.pulumi.googlenative.securitycenter_v1.outputs.GetProjectBigQueryExportResult;
import com.pulumi.googlenative.securitycenter_v1.outputs.GetSourceResult;
import java.util.concurrent.CompletableFuture;

public final class Securitycenter_v1Functions {
    /**
     * Gets a big query export.
     * 
     */
    public static CompletableFuture<GetFolderBigQueryExportResult> getFolderBigQueryExport(GetFolderBigQueryExportArgs args) {
        return getFolderBigQueryExport(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetFolderBigQueryExportResult> getFolderBigQueryExport(GetFolderBigQueryExportArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:securitycenter/v1:getFolderBigQueryExport", TypeShape.of(GetFolderBigQueryExportResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a mute config.
     * 
     */
    public static CompletableFuture<GetMuteConfigResult> getMuteConfig(GetMuteConfigArgs args) {
        return getMuteConfig(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetMuteConfigResult> getMuteConfig(GetMuteConfigArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:securitycenter/v1:getMuteConfig", TypeShape.of(GetMuteConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a notification config.
     * 
     */
    public static CompletableFuture<GetNotificationConfigResult> getNotificationConfig(GetNotificationConfigArgs args) {
        return getNotificationConfig(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetNotificationConfigResult> getNotificationConfig(GetNotificationConfigArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:securitycenter/v1:getNotificationConfig", TypeShape.of(GetNotificationConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a big query export.
     * 
     */
    public static CompletableFuture<GetOrganizationBigQueryExportResult> getOrganizationBigQueryExport(GetOrganizationBigQueryExportArgs args) {
        return getOrganizationBigQueryExport(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetOrganizationBigQueryExportResult> getOrganizationBigQueryExport(GetOrganizationBigQueryExportArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:securitycenter/v1:getOrganizationBigQueryExport", TypeShape.of(GetOrganizationBigQueryExportResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a mute config.
     * 
     */
    public static CompletableFuture<GetOrganizationMuteConfigResult> getOrganizationMuteConfig(GetOrganizationMuteConfigArgs args) {
        return getOrganizationMuteConfig(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetOrganizationMuteConfigResult> getOrganizationMuteConfig(GetOrganizationMuteConfigArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:securitycenter/v1:getOrganizationMuteConfig", TypeShape.of(GetOrganizationMuteConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy on the specified Source.
     * 
     */
    public static CompletableFuture<GetOrganizationSourceIamPolicyResult> getOrganizationSourceIamPolicy(GetOrganizationSourceIamPolicyArgs args) {
        return getOrganizationSourceIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetOrganizationSourceIamPolicyResult> getOrganizationSourceIamPolicy(GetOrganizationSourceIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:securitycenter/v1:getOrganizationSourceIamPolicy", TypeShape.of(GetOrganizationSourceIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a big query export.
     * 
     */
    public static CompletableFuture<GetProjectBigQueryExportResult> getProjectBigQueryExport(GetProjectBigQueryExportArgs args) {
        return getProjectBigQueryExport(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetProjectBigQueryExportResult> getProjectBigQueryExport(GetProjectBigQueryExportArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:securitycenter/v1:getProjectBigQueryExport", TypeShape.of(GetProjectBigQueryExportResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a source.
     * 
     */
    public static CompletableFuture<GetSourceResult> getSource(GetSourceArgs args) {
        return getSource(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSourceResult> getSource(GetSourceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:securitycenter/v1:getSource", TypeShape.of(GetSourceResult.class), args, Utilities.withVersion(options));
    }
}
