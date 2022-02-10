// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1beta;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigateway_v1beta.ConfigArgs;
import io.pulumi.googlenative.apigateway_v1beta.outputs.ApigatewayApiConfigFileResponse;
import io.pulumi.googlenative.apigateway_v1beta.outputs.ApigatewayApiConfigGrpcServiceDefinitionResponse;
import io.pulumi.googlenative.apigateway_v1beta.outputs.ApigatewayApiConfigOpenApiDocumentResponse;
import io.pulumi.googlenative.apigateway_v1beta.outputs.ApigatewayGatewayConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="google-native:apigateway/v1beta:Config")
public class Config extends io.pulumi.resources.CustomResource {
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
    @OutputExport(name="gatewayConfig", type=ApigatewayGatewayConfigResponse.class, parameters={})
    private Output<ApigatewayGatewayConfigResponse> gatewayConfig;

    public Output<ApigatewayGatewayConfigResponse> getGatewayConfig() {
        return this.gatewayConfig;
    }
    @OutputExport(name="gatewayServiceAccount", type=String.class, parameters={})
    private Output<String> gatewayServiceAccount;

    public Output<String> getGatewayServiceAccount() {
        return this.gatewayServiceAccount;
    }
    @OutputExport(name="grpcServices", type=List.class, parameters={ApigatewayApiConfigGrpcServiceDefinitionResponse.class})
    private Output<List<ApigatewayApiConfigGrpcServiceDefinitionResponse>> grpcServices;

    public Output<List<ApigatewayApiConfigGrpcServiceDefinitionResponse>> getGrpcServices() {
        return this.grpcServices;
    }
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    @OutputExport(name="managedServiceConfigs", type=List.class, parameters={ApigatewayApiConfigFileResponse.class})
    private Output<List<ApigatewayApiConfigFileResponse>> managedServiceConfigs;

    public Output<List<ApigatewayApiConfigFileResponse>> getManagedServiceConfigs() {
        return this.managedServiceConfigs;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="openapiDocuments", type=List.class, parameters={ApigatewayApiConfigOpenApiDocumentResponse.class})
    private Output<List<ApigatewayApiConfigOpenApiDocumentResponse>> openapiDocuments;

    public Output<List<ApigatewayApiConfigOpenApiDocumentResponse>> getOpenapiDocuments() {
        return this.openapiDocuments;
    }
    @OutputExport(name="serviceConfigId", type=String.class, parameters={})
    private Output<String> serviceConfigId;

    public Output<String> getServiceConfigId() {
        return this.serviceConfigId;
    }
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    public Output<String> getState() {
        return this.state;
    }
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public Config(String name, ConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigateway/v1beta:Config", name, args == null ? ConfigArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Config(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigateway/v1beta:Config", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Config get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Config(name, id, options);
    }
}