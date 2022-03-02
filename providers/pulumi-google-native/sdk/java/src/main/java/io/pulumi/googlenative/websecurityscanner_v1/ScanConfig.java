// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.websecurityscanner_v1.ScanConfigArgs;
import io.pulumi.googlenative.websecurityscanner_v1.outputs.AuthenticationResponse;
import io.pulumi.googlenative.websecurityscanner_v1.outputs.ScheduleResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a new ScanConfig.
 * 
 */
@ResourceType(type="google-native:websecurityscanner/v1:ScanConfig")
public class ScanConfig extends io.pulumi.resources.CustomResource {
    /**
     * The authentication configuration. If specified, service will use the authentication configuration during scanning.
     * 
     */
    @OutputExport(name="authentication", type=AuthenticationResponse.class, parameters={})
    private Output<AuthenticationResponse> authentication;

    /**
     * @return The authentication configuration. If specified, service will use the authentication configuration during scanning.
     * 
     */
    public Output<AuthenticationResponse> getAuthentication() {
        return this.authentication;
    }
    /**
     * The excluded URL patterns as described in https://cloud.google.com/security-command-center/docs/how-to-use-web-security-scanner#excluding_urls
     * 
     */
    @OutputExport(name="blacklistPatterns", type=List.class, parameters={String.class})
    private Output<List<String>> blacklistPatterns;

    /**
     * @return The excluded URL patterns as described in https://cloud.google.com/security-command-center/docs/how-to-use-web-security-scanner#excluding_urls
     * 
     */
    public Output<List<String>> getBlacklistPatterns() {
        return this.blacklistPatterns;
    }
    /**
     * The user provided display name of the ScanConfig.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The user provided display name of the ScanConfig.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Controls export of scan configurations and results to Security Command Center.
     * 
     */
    @OutputExport(name="exportToSecurityCommandCenter", type=String.class, parameters={})
    private Output<String> exportToSecurityCommandCenter;

    /**
     * @return Controls export of scan configurations and results to Security Command Center.
     * 
     */
    public Output<String> getExportToSecurityCommandCenter() {
        return this.exportToSecurityCommandCenter;
    }
    /**
     * Whether to keep scanning even if most requests return HTTP error codes.
     * 
     */
    @OutputExport(name="ignoreHttpStatusErrors", type=Boolean.class, parameters={})
    private Output<Boolean> ignoreHttpStatusErrors;

    /**
     * @return Whether to keep scanning even if most requests return HTTP error codes.
     * 
     */
    public Output<Boolean> getIgnoreHttpStatusErrors() {
        return this.ignoreHttpStatusErrors;
    }
    /**
     * Whether the scan config is managed by Web Security Scanner, output only.
     * 
     */
    @OutputExport(name="managedScan", type=Boolean.class, parameters={})
    private Output<Boolean> managedScan;

    /**
     * @return Whether the scan config is managed by Web Security Scanner, output only.
     * 
     */
    public Output<Boolean> getManagedScan() {
        return this.managedScan;
    }
    /**
     * The maximum QPS during scanning. A valid value ranges from 5 to 20 inclusively. If the field is unspecified or its value is set 0, server will default to 15. Other values outside of [5, 20] range will be rejected with INVALID_ARGUMENT error.
     * 
     */
    @OutputExport(name="maxQps", type=Integer.class, parameters={})
    private Output<Integer> maxQps;

    /**
     * @return The maximum QPS during scanning. A valid value ranges from 5 to 20 inclusively. If the field is unspecified or its value is set 0, server will default to 15. Other values outside of [5, 20] range will be rejected with INVALID_ARGUMENT error.
     * 
     */
    public Output<Integer> getMaxQps() {
        return this.maxQps;
    }
    /**
     * The resource name of the ScanConfig. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}'. The ScanConfig IDs are generated by the system.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the ScanConfig. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}'. The ScanConfig IDs are generated by the system.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The risk level selected for the scan
     * 
     */
    @OutputExport(name="riskLevel", type=String.class, parameters={})
    private Output<String> riskLevel;

    /**
     * @return The risk level selected for the scan
     * 
     */
    public Output<String> getRiskLevel() {
        return this.riskLevel;
    }
    /**
     * The schedule of the ScanConfig.
     * 
     */
    @OutputExport(name="schedule", type=ScheduleResponse.class, parameters={})
    private Output<ScheduleResponse> schedule;

    /**
     * @return The schedule of the ScanConfig.
     * 
     */
    public Output<ScheduleResponse> getSchedule() {
        return this.schedule;
    }
    /**
     * The starting URLs from which the scanner finds site pages.
     * 
     */
    @OutputExport(name="startingUrls", type=List.class, parameters={String.class})
    private Output<List<String>> startingUrls;

    /**
     * @return The starting URLs from which the scanner finds site pages.
     * 
     */
    public Output<List<String>> getStartingUrls() {
        return this.startingUrls;
    }
    /**
     * Whether the scan configuration has enabled static IP address scan feature. If enabled, the scanner will access applications from static IP addresses.
     * 
     */
    @OutputExport(name="staticIpScan", type=Boolean.class, parameters={})
    private Output<Boolean> staticIpScan;

    /**
     * @return Whether the scan configuration has enabled static IP address scan feature. If enabled, the scanner will access applications from static IP addresses.
     * 
     */
    public Output<Boolean> getStaticIpScan() {
        return this.staticIpScan;
    }
    /**
     * The user agent used during scanning.
     * 
     */
    @OutputExport(name="userAgent", type=String.class, parameters={})
    private Output<String> userAgent;

    /**
     * @return The user agent used during scanning.
     * 
     */
    public Output<String> getUserAgent() {
        return this.userAgent;
    }

    public interface BuilderApplicator {
        public void apply(ScanConfigArgs.Builder a);
    }
    private static io.pulumi.googlenative.websecurityscanner_v1.ScanConfigArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.websecurityscanner_v1.ScanConfigArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ScanConfig(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ScanConfig(String name) {
        this(name, ScanConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ScanConfig(String name, ScanConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ScanConfig(String name, ScanConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:websecurityscanner/v1:ScanConfig", name, args == null ? ScanConfigArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ScanConfig(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:websecurityscanner/v1:ScanConfig", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ScanConfig get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ScanConfig(name, id, options);
    }
}
