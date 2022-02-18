// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.lookoutmetrics.AlertArgs;
import io.pulumi.awsnative.lookoutmetrics.outputs.AlertAction;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::LookoutMetrics::Alert
 * 
 */
@ResourceType(type="aws-native:lookoutmetrics:Alert")
public class Alert extends io.pulumi.resources.CustomResource {
    /**
     * The action to be taken by the alert when an anomaly is detected.
     * 
     */
    @OutputExport(name="action", type=AlertAction.class, parameters={})
    private Output<AlertAction> action;

    /**
     * @return The action to be taken by the alert when an anomaly is detected.
     * 
     */
    public Output<AlertAction> getAction() {
        return this.action;
    }
    /**
     * A description for the alert.
     * 
     */
    @OutputExport(name="alertDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> alertDescription;

    /**
     * @return A description for the alert.
     * 
     */
    public Output</* @Nullable */ String> getAlertDescription() {
        return this.alertDescription;
    }
    /**
     * The name of the alert. If not provided, a name is generated automatically.
     * 
     */
    @OutputExport(name="alertName", type=String.class, parameters={})
    private Output</* @Nullable */ String> alertName;

    /**
     * @return The name of the alert. If not provided, a name is generated automatically.
     * 
     */
    public Output</* @Nullable */ String> getAlertName() {
        return this.alertName;
    }
    /**
     * A number between 0 and 100 (inclusive) that tunes the sensitivity of the alert.
     * 
     */
    @OutputExport(name="alertSensitivityThreshold", type=Integer.class, parameters={})
    private Output<Integer> alertSensitivityThreshold;

    /**
     * @return A number between 0 and 100 (inclusive) that tunes the sensitivity of the alert.
     * 
     */
    public Output<Integer> getAlertSensitivityThreshold() {
        return this.alertSensitivityThreshold;
    }
    /**
     * The Amazon resource name (ARN) of the Anomaly Detector to alert.
     * 
     */
    @OutputExport(name="anomalyDetectorArn", type=String.class, parameters={})
    private Output<String> anomalyDetectorArn;

    /**
     * @return The Amazon resource name (ARN) of the Anomaly Detector to alert.
     * 
     */
    public Output<String> getAnomalyDetectorArn() {
        return this.anomalyDetectorArn;
    }
    /**
     * ARN assigned to the alert.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN assigned to the alert.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Alert(String name, AlertArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:lookoutmetrics:Alert", name, args == null ? AlertArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Alert(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:lookoutmetrics:Alert", name, null, makeResourceOptions(options, id));
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
    public static Alert get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Alert(name, id, options);
    }
}