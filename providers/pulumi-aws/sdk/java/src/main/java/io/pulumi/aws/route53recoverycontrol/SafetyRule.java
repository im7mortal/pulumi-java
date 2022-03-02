// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53recoverycontrol;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.route53recoverycontrol.SafetyRuleArgs;
import io.pulumi.aws.route53recoverycontrol.inputs.SafetyRuleState;
import io.pulumi.aws.route53recoverycontrol.outputs.SafetyRuleRuleConfig;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides an AWS Route 53 Recovery Control Config Safety Rule
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Route53 Recovery Control Config Safety Rule can be imported via the safety rule ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:route53recoverycontrol/safetyRule:SafetyRule myrule arn:aws:route53-recovery-control::313517334327:controlpanel/1bfba17df8684f5dab0467b71424f7e8/safetyrule/3bacc77003364c0f
 * ```
 * 
 */
@ResourceType(type="aws:route53recoverycontrol/safetyRule:SafetyRule")
public class SafetyRule extends io.pulumi.resources.CustomResource {
    /**
     * ARN of the safety rule.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the safety rule.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Routing controls that are part of transactions that are evaluated to determine if a request to change a routing control state is allowed.
     * 
     */
    @OutputExport(name="assertedControls", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> assertedControls;

    /**
     * @return Routing controls that are part of transactions that are evaluated to determine if a request to change a routing control state is allowed.
     * 
     */
    public Output</* @Nullable */ List<String>> getAssertedControls() {
        return this.assertedControls;
    }
    /**
     * ARN of the control panel in which this safety rule will reside.
     * 
     */
    @OutputExport(name="controlPanelArn", type=String.class, parameters={})
    private Output<String> controlPanelArn;

    /**
     * @return ARN of the control panel in which this safety rule will reside.
     * 
     */
    public Output<String> getControlPanelArn() {
        return this.controlPanelArn;
    }
    /**
     * Gating controls for the new gating rule. That is, routing controls that are evaluated by the rule configuration that you specify.
     * 
     */
    @OutputExport(name="gatingControls", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> gatingControls;

    /**
     * @return Gating controls for the new gating rule. That is, routing controls that are evaluated by the rule configuration that you specify.
     * 
     */
    public Output</* @Nullable */ List<String>> getGatingControls() {
        return this.gatingControls;
    }
    /**
     * Name describing the safety rule.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name describing the safety rule.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Configuration block for safety rule criteria. See below.
     * 
     */
    @OutputExport(name="ruleConfig", type=SafetyRuleRuleConfig.class, parameters={})
    private Output<SafetyRuleRuleConfig> ruleConfig;

    /**
     * @return Configuration block for safety rule criteria. See below.
     * 
     */
    public Output<SafetyRuleRuleConfig> getRuleConfig() {
        return this.ruleConfig;
    }
    /**
     * Status of the safety rule. `PENDING` when it is being created/updated, `PENDING_DELETION` when it is being deleted, and `DEPLOYED` otherwise.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of the safety rule. `PENDING` when it is being created/updated, `PENDING_DELETION` when it is being deleted, and `DEPLOYED` otherwise.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * Routing controls that can only be set or unset if the specified `rule_config` evaluates to true for the specified `gating_controls`.
     * 
     */
    @OutputExport(name="targetControls", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> targetControls;

    /**
     * @return Routing controls that can only be set or unset if the specified `rule_config` evaluates to true for the specified `gating_controls`.
     * 
     */
    public Output</* @Nullable */ List<String>> getTargetControls() {
        return this.targetControls;
    }
    /**
     * Evaluation period, in milliseconds (ms), during which any request against the target routing controls will fail.
     * 
     */
    @OutputExport(name="waitPeriodMs", type=Integer.class, parameters={})
    private Output<Integer> waitPeriodMs;

    /**
     * @return Evaluation period, in milliseconds (ms), during which any request against the target routing controls will fail.
     * 
     */
    public Output<Integer> getWaitPeriodMs() {
        return this.waitPeriodMs;
    }

    public interface BuilderApplicator {
        public void apply(SafetyRuleArgs.Builder a);
    }
    private static io.pulumi.aws.route53recoverycontrol.SafetyRuleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.route53recoverycontrol.SafetyRuleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SafetyRule(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SafetyRule(String name) {
        this(name, SafetyRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SafetyRule(String name, SafetyRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SafetyRule(String name, SafetyRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53recoverycontrol/safetyRule:SafetyRule", name, args == null ? SafetyRuleArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SafetyRule(String name, Input<String> id, @Nullable SafetyRuleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53recoverycontrol/safetyRule:SafetyRule", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SafetyRule get(String name, Input<String> id, @Nullable SafetyRuleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SafetyRule(name, id, state, options);
    }
}
