// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.insights.ProactiveDetectionConfigurationArgs;
import io.pulumi.azurenative.insights.outputs.ApplicationInsightsComponentProactiveDetectionConfigurationResponseRuleDefinitions;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:insights:ProactiveDetectionConfiguration")
public class ProactiveDetectionConfiguration extends io.pulumi.resources.CustomResource {
    @OutputExport(name="customEmails", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> customEmails;

    public Output</* @Nullable */ List<String>> getCustomEmails() {
        return this.customEmails;
    }
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    @OutputExport(name="lastUpdatedTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastUpdatedTime;

    public Output</* @Nullable */ String> getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    @OutputExport(name="ruleDefinitions", type=ApplicationInsightsComponentProactiveDetectionConfigurationResponseRuleDefinitions.class, parameters={})
    private Output</* @Nullable */ ApplicationInsightsComponentProactiveDetectionConfigurationResponseRuleDefinitions> ruleDefinitions;

    public Output</* @Nullable */ ApplicationInsightsComponentProactiveDetectionConfigurationResponseRuleDefinitions> getRuleDefinitions() {
        return this.ruleDefinitions;
    }
    @OutputExport(name="sendEmailsToSubscriptionOwners", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> sendEmailsToSubscriptionOwners;

    public Output</* @Nullable */ Boolean> getSendEmailsToSubscriptionOwners() {
        return this.sendEmailsToSubscriptionOwners;
    }

    public ProactiveDetectionConfiguration(String name, ProactiveDetectionConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:ProactiveDetectionConfiguration", name, args == null ? ProactiveDetectionConfigurationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ProactiveDetectionConfiguration(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:ProactiveDetectionConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:insights/v20150501:ProactiveDetectionConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:insights/v20180501preview:ProactiveDetectionConfiguration").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ProactiveDetectionConfiguration get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ProactiveDetectionConfiguration(name, id, options);
    }
}