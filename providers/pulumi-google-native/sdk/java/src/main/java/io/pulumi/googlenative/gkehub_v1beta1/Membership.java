// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.gkehub_v1beta1.MembershipArgs;
import io.pulumi.googlenative.gkehub_v1beta1.outputs.AuthorityResponse;
import io.pulumi.googlenative.gkehub_v1beta1.outputs.MembershipEndpointResponse;
import io.pulumi.googlenative.gkehub_v1beta1.outputs.MembershipStateResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="google-native:gkehub/v1beta1:Membership")
public class Membership extends io.pulumi.resources.CustomResource {
    @OutputExport(name="authority", type=AuthorityResponse.class, parameters={})
    private Output<AuthorityResponse> authority;

    public Output<AuthorityResponse> getAuthority() {
        return this.authority;
    }
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime;
    }
    @OutputExport(name="deleteTime", type=String.class, parameters={})
    private Output<String> deleteTime;

    public Output<String> getDeleteTime() {
        return this.deleteTime;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    public Output<String> getDescription() {
        return this.description;
    }
    @OutputExport(name="endpoint", type=MembershipEndpointResponse.class, parameters={})
    private Output<MembershipEndpointResponse> endpoint;

    public Output<MembershipEndpointResponse> getEndpoint() {
        return this.endpoint;
    }
    @OutputExport(name="externalId", type=String.class, parameters={})
    private Output<String> externalId;

    public Output<String> getExternalId() {
        return this.externalId;
    }
    @OutputExport(name="infrastructureType", type=String.class, parameters={})
    private Output<String> infrastructureType;

    public Output<String> getInfrastructureType() {
        return this.infrastructureType;
    }
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    @OutputExport(name="lastConnectionTime", type=String.class, parameters={})
    private Output<String> lastConnectionTime;

    public Output<String> getLastConnectionTime() {
        return this.lastConnectionTime;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="state", type=MembershipStateResponse.class, parameters={})
    private Output<MembershipStateResponse> state;

    public Output<MembershipStateResponse> getState() {
        return this.state;
    }
    @OutputExport(name="uniqueId", type=String.class, parameters={})
    private Output<String> uniqueId;

    public Output<String> getUniqueId() {
        return this.uniqueId;
    }
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public Membership(String name, MembershipArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:gkehub/v1beta1:Membership", name, args == null ? MembershipArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Membership(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:gkehub/v1beta1:Membership", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Membership get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Membership(name, id, options);
    }
}