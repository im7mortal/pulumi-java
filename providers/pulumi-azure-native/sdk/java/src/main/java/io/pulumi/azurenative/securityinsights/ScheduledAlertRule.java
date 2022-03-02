// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityinsights.ScheduledAlertRuleArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents scheduled alert rule.
 * API Version: 2020-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:securityinsights:ScheduledAlertRule 73e01a99-5cd7-4139-a149-9f2736ff2ab5 /subscriptions/d0cfe6b2-9ac0-4464-9919-dccaee2e48c0/resourceGroups/myRg/providers/Microsoft.OperationalInsights/workspaces/myWorkspace/providers/Microsoft.SecurityInsights/alertRules/73e01a99-5cd7-4139-a149-9f2736ff2ab5 
 * ```
 * 
 */
@ResourceType(type="azure-native:securityinsights:ScheduledAlertRule")
public class ScheduledAlertRule extends io.pulumi.resources.CustomResource {
    /**
     * The Name of the alert rule template used to create this rule.
     * 
     */
    @OutputExport(name="alertRuleTemplateName", type=String.class, parameters={})
    private Output</* @Nullable */ String> alertRuleTemplateName;

    /**
     * @return The Name of the alert rule template used to create this rule.
     * 
     */
    public Output</* @Nullable */ String> getAlertRuleTemplateName() {
        return this.alertRuleTemplateName;
    }
    /**
     * The description of the alert rule.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the alert rule.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The display name for alerts created by this alert rule.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The display name for alerts created by this alert rule.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Determines whether this alert rule is enabled or disabled.
     * 
     */
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output<Boolean> enabled;

    /**
     * @return Determines whether this alert rule is enabled or disabled.
     * 
     */
    public Output<Boolean> getEnabled() {
        return this.enabled;
    }
    /**
     * Etag of the azure resource
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Etag of the azure resource
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    /**
     * The kind of the alert rule
     * Expected value is 'Scheduled'.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of the alert rule
     * Expected value is 'Scheduled'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The last time that this alert rule has been modified.
     * 
     */
    @OutputExport(name="lastModifiedUtc", type=String.class, parameters={})
    private Output<String> lastModifiedUtc;

    /**
     * @return The last time that this alert rule has been modified.
     * 
     */
    public Output<String> getLastModifiedUtc() {
        return this.lastModifiedUtc;
    }
    /**
     * Azure resource name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The query that creates alerts for this rule.
     * 
     */
    @OutputExport(name="query", type=String.class, parameters={})
    private Output<String> query;

    /**
     * @return The query that creates alerts for this rule.
     * 
     */
    public Output<String> getQuery() {
        return this.query;
    }
    /**
     * The frequency (in ISO 8601 duration format) for this alert rule to run.
     * 
     */
    @OutputExport(name="queryFrequency", type=String.class, parameters={})
    private Output<String> queryFrequency;

    /**
     * @return The frequency (in ISO 8601 duration format) for this alert rule to run.
     * 
     */
    public Output<String> getQueryFrequency() {
        return this.queryFrequency;
    }
    /**
     * The period (in ISO 8601 duration format) that this alert rule looks at.
     * 
     */
    @OutputExport(name="queryPeriod", type=String.class, parameters={})
    private Output<String> queryPeriod;

    /**
     * @return The period (in ISO 8601 duration format) that this alert rule looks at.
     * 
     */
    public Output<String> getQueryPeriod() {
        return this.queryPeriod;
    }
    /**
     * The severity for alerts created by this alert rule.
     * 
     */
    @OutputExport(name="severity", type=String.class, parameters={})
    private Output<String> severity;

    /**
     * @return The severity for alerts created by this alert rule.
     * 
     */
    public Output<String> getSeverity() {
        return this.severity;
    }
    /**
     * The suppression (in ISO 8601 duration format) to wait since last time this alert rule been triggered.
     * 
     */
    @OutputExport(name="suppressionDuration", type=String.class, parameters={})
    private Output<String> suppressionDuration;

    /**
     * @return The suppression (in ISO 8601 duration format) to wait since last time this alert rule been triggered.
     * 
     */
    public Output<String> getSuppressionDuration() {
        return this.suppressionDuration;
    }
    /**
     * Determines whether the suppression for this alert rule is enabled or disabled.
     * 
     */
    @OutputExport(name="suppressionEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> suppressionEnabled;

    /**
     * @return Determines whether the suppression for this alert rule is enabled or disabled.
     * 
     */
    public Output<Boolean> getSuppressionEnabled() {
        return this.suppressionEnabled;
    }
    /**
     * The tactics of the alert rule
     * 
     */
    @OutputExport(name="tactics", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tactics;

    /**
     * @return The tactics of the alert rule
     * 
     */
    public Output</* @Nullable */ List<String>> getTactics() {
        return this.tactics;
    }
    /**
     * The operation against the threshold that triggers alert rule.
     * 
     */
    @OutputExport(name="triggerOperator", type=String.class, parameters={})
    private Output<String> triggerOperator;

    /**
     * @return The operation against the threshold that triggers alert rule.
     * 
     */
    public Output<String> getTriggerOperator() {
        return this.triggerOperator;
    }
    /**
     * The threshold triggers this alert rule.
     * 
     */
    @OutputExport(name="triggerThreshold", type=Integer.class, parameters={})
    private Output<Integer> triggerThreshold;

    /**
     * @return The threshold triggers this alert rule.
     * 
     */
    public Output<Integer> getTriggerThreshold() {
        return this.triggerThreshold;
    }
    /**
     * Azure resource type
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(ScheduledAlertRuleArgs.Builder a);
    }
    private static io.pulumi.azurenative.securityinsights.ScheduledAlertRuleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.securityinsights.ScheduledAlertRuleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ScheduledAlertRule(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ScheduledAlertRule(String name) {
        this(name, ScheduledAlertRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ScheduledAlertRule(String name, ScheduledAlertRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ScheduledAlertRule(String name, ScheduledAlertRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:ScheduledAlertRule", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private ScheduledAlertRule(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:ScheduledAlertRule", name, null, makeResourceOptions(options, id));
    }

    private static ScheduledAlertRuleArgs makeArgs(ScheduledAlertRuleArgs args) {
        var builder = args == null ? ScheduledAlertRuleArgs.builder() : ScheduledAlertRuleArgs.builder(args);
        return builder
            .setKind("Scheduled")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20190101preview:ScheduledAlertRule").build()),
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20200101:ScheduledAlertRule").build()),
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20210301preview:ScheduledAlertRule").build()),
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20210901preview:ScheduledAlertRule").build())
            ))
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
    public static ScheduledAlertRule get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ScheduledAlertRule(name, id, options);
    }
}
