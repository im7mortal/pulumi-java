// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebaserules_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.firebaserules_v1.ReleaseArgs;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="google-native:firebaserules/v1:Release")
public class Release extends io.pulumi.resources.CustomResource {
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="rulesetName", type=String.class, parameters={})
    private Output<String> rulesetName;

    public Output<String> getRulesetName() {
        return this.rulesetName;
    }
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public Release(String name, @Nullable ReleaseArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:firebaserules/v1:Release", name, args == null ? ReleaseArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Release(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:firebaserules/v1:Release", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Release get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Release(name, id, options);
    }
}