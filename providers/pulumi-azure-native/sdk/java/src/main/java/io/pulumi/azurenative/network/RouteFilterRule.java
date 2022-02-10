// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.RouteFilterRuleArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:network:RouteFilterRule")
public class RouteFilterRule extends io.pulumi.resources.CustomResource {
    @OutputExport(name="access", type=String.class, parameters={})
    private Output<String> access;

    public Output<String> getAccess() {
        return this.access;
    }
    @OutputExport(name="communities", type=List.class, parameters={String.class})
    private Output<List<String>> communities;

    public Output<List<String>> getCommunities() {
        return this.communities;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="routeFilterRuleType", type=String.class, parameters={})
    private Output<String> routeFilterRuleType;

    public Output<String> getRouteFilterRuleType() {
        return this.routeFilterRuleType;
    }

    public RouteFilterRule(String name, RouteFilterRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:RouteFilterRule", name, args == null ? RouteFilterRuleArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RouteFilterRule(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:RouteFilterRule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20161201:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20170301:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20170601:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20170801:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20170901:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20171001:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20171101:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180101:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180201:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180401:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180601:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180701:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180801:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181001:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181101:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181201:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190201:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190401:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190601:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190701:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190801:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190901:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191101:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191201:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200301:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200401:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200501:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200701:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200801:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:RouteFilterRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:RouteFilterRule").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static RouteFilterRule get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RouteFilterRule(name, id, options);
    }
}