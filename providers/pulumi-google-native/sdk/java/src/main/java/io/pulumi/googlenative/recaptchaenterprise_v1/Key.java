// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recaptchaenterprise_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.recaptchaenterprise_v1.KeyArgs;
import io.pulumi.googlenative.recaptchaenterprise_v1.outputs.GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse;
import io.pulumi.googlenative.recaptchaenterprise_v1.outputs.GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse;
import io.pulumi.googlenative.recaptchaenterprise_v1.outputs.GoogleCloudRecaptchaenterpriseV1TestingOptionsResponse;
import io.pulumi.googlenative.recaptchaenterprise_v1.outputs.GoogleCloudRecaptchaenterpriseV1WafSettingsResponse;
import io.pulumi.googlenative.recaptchaenterprise_v1.outputs.GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="google-native:recaptchaenterprise/v1:Key")
public class Key extends io.pulumi.resources.CustomResource {
    @OutputExport(name="androidSettings", type=GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse.class, parameters={})
    private Output<GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse> androidSettings;

    public Output<GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse> getAndroidSettings() {
        return this.androidSettings;
    }
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime;
    }
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }
    @OutputExport(name="iosSettings", type=GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse.class, parameters={})
    private Output<GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse> iosSettings;

    public Output<GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse> getIosSettings() {
        return this.iosSettings;
    }
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="testingOptions", type=GoogleCloudRecaptchaenterpriseV1TestingOptionsResponse.class, parameters={})
    private Output<GoogleCloudRecaptchaenterpriseV1TestingOptionsResponse> testingOptions;

    public Output<GoogleCloudRecaptchaenterpriseV1TestingOptionsResponse> getTestingOptions() {
        return this.testingOptions;
    }
    @OutputExport(name="wafSettings", type=GoogleCloudRecaptchaenterpriseV1WafSettingsResponse.class, parameters={})
    private Output<GoogleCloudRecaptchaenterpriseV1WafSettingsResponse> wafSettings;

    public Output<GoogleCloudRecaptchaenterpriseV1WafSettingsResponse> getWafSettings() {
        return this.wafSettings;
    }
    @OutputExport(name="webSettings", type=GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse.class, parameters={})
    private Output<GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse> webSettings;

    public Output<GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse> getWebSettings() {
        return this.webSettings;
    }

    public Key(String name, @Nullable KeyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:recaptchaenterprise/v1:Key", name, args == null ? KeyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Key(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:recaptchaenterprise/v1:Key", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Key get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Key(name, id, options);
    }
}