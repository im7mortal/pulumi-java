// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.codestarnotifications;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.codestarnotifications.NotificationRuleArgs;
import io.pulumi.awsnative.codestarnotifications.enums.NotificationRuleDetailType;
import io.pulumi.awsnative.codestarnotifications.enums.NotificationRuleStatus;
import io.pulumi.awsnative.codestarnotifications.outputs.NotificationRuleTarget;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::CodeStarNotifications::NotificationRule
 * 
 */
@ResourceType(type="aws-native:codestarnotifications:NotificationRule")
public class NotificationRule extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="createdBy", type=String.class, parameters={})
    private Output</* @Nullable */ String> createdBy;

    public Output</* @Nullable */ String> getCreatedBy() {
        return this.createdBy;
    }
    @OutputExport(name="detailType", type=NotificationRuleDetailType.class, parameters={})
    private Output<NotificationRuleDetailType> detailType;

    public Output<NotificationRuleDetailType> getDetailType() {
        return this.detailType;
    }
    @OutputExport(name="eventTypeId", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventTypeId;

    public Output</* @Nullable */ String> getEventTypeId() {
        return this.eventTypeId;
    }
    @OutputExport(name="eventTypeIds", type=List.class, parameters={String.class})
    private Output<List<String>> eventTypeIds;

    public Output<List<String>> getEventTypeIds() {
        return this.eventTypeIds;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="resource", type=String.class, parameters={})
    private Output<String> resource;

    public Output<String> getResource() {
        return this.resource;
    }
    @OutputExport(name="status", type=NotificationRuleStatus.class, parameters={})
    private Output</* @Nullable */ NotificationRuleStatus> status;

    public Output</* @Nullable */ NotificationRuleStatus> getStatus() {
        return this.status;
    }
    @OutputExport(name="tags", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> tags;

    public Output</* @Nullable */ Object> getTags() {
        return this.tags;
    }
    @OutputExport(name="targetAddress", type=String.class, parameters={})
    private Output</* @Nullable */ String> targetAddress;

    public Output</* @Nullable */ String> getTargetAddress() {
        return this.targetAddress;
    }
    @OutputExport(name="targets", type=List.class, parameters={NotificationRuleTarget.class})
    private Output<List<NotificationRuleTarget>> targets;

    public Output<List<NotificationRuleTarget>> getTargets() {
        return this.targets;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NotificationRule(String name, NotificationRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:codestarnotifications:NotificationRule", name, args == null ? NotificationRuleArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private NotificationRule(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:codestarnotifications:NotificationRule", name, null, makeResourceOptions(options, id));
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
    public static NotificationRule get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NotificationRule(name, id, options);
    }
}
