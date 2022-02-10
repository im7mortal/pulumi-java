// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigateway_v1.ApiConfigIamPolicyArgs;
import io.pulumi.googlenative.apigateway_v1.outputs.ApigatewayAuditConfigResponse;
import io.pulumi.googlenative.apigateway_v1.outputs.ApigatewayBindingResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="google-native:apigateway/v1:ApiConfigIamPolicy")
public class ApiConfigIamPolicy extends io.pulumi.resources.CustomResource {
    @OutputExport(name="auditConfigs", type=List.class, parameters={ApigatewayAuditConfigResponse.class})
    private Output<List<ApigatewayAuditConfigResponse>> auditConfigs;

    public Output<List<ApigatewayAuditConfigResponse>> getAuditConfigs() {
        return this.auditConfigs;
    }
    @OutputExport(name="bindings", type=List.class, parameters={ApigatewayBindingResponse.class})
    private Output<List<ApigatewayBindingResponse>> bindings;

    public Output<List<ApigatewayBindingResponse>> getBindings() {
        return this.bindings;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="version", type=Integer.class, parameters={})
    private Output<Integer> version;

    public Output<Integer> getVersion() {
        return this.version;
    }

    public ApiConfigIamPolicy(String name, ApiConfigIamPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigateway/v1:ApiConfigIamPolicy", name, args == null ? ApiConfigIamPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ApiConfigIamPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigateway/v1:ApiConfigIamPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ApiConfigIamPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ApiConfigIamPolicy(name, id, options);
    }
}