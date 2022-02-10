// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.OrganizationArgs;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1AddonsConfigResponse;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1PropertiesResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="google-native:apigee/v1:Organization")
public class Organization extends io.pulumi.resources.CustomResource {
    @OutputExport(name="addonsConfig", type=GoogleCloudApigeeV1AddonsConfigResponse.class, parameters={})
    private Output<GoogleCloudApigeeV1AddonsConfigResponse> addonsConfig;

    public Output<GoogleCloudApigeeV1AddonsConfigResponse> getAddonsConfig() {
        return this.addonsConfig;
    }
    @OutputExport(name="analyticsRegion", type=String.class, parameters={})
    private Output<String> analyticsRegion;

    public Output<String> getAnalyticsRegion() {
        return this.analyticsRegion;
    }
    @OutputExport(name="attributes", type=List.class, parameters={String.class})
    private Output<List<String>> attributes;

    public Output<List<String>> getAttributes() {
        return this.attributes;
    }
    @OutputExport(name="authorizedNetwork", type=String.class, parameters={})
    private Output<String> authorizedNetwork;

    public Output<String> getAuthorizedNetwork() {
        return this.authorizedNetwork;
    }
    @OutputExport(name="billingType", type=String.class, parameters={})
    private Output<String> billingType;

    public Output<String> getBillingType() {
        return this.billingType;
    }
    @OutputExport(name="caCertificate", type=String.class, parameters={})
    private Output<String> caCertificate;

    public Output<String> getCaCertificate() {
        return this.caCertificate;
    }
    @OutputExport(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    public Output<String> getCreatedAt() {
        return this.createdAt;
    }
    @OutputExport(name="customerName", type=String.class, parameters={})
    private Output<String> customerName;

    public Output<String> getCustomerName() {
        return this.customerName;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    public Output<String> getDescription() {
        return this.description;
    }
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }
    @OutputExport(name="environments", type=List.class, parameters={String.class})
    private Output<List<String>> environments;

    public Output<List<String>> getEnvironments() {
        return this.environments;
    }
    @OutputExport(name="expiresAt", type=String.class, parameters={})
    private Output<String> expiresAt;

    public Output<String> getExpiresAt() {
        return this.expiresAt;
    }
    @OutputExport(name="lastModifiedAt", type=String.class, parameters={})
    private Output<String> lastModifiedAt;

    public Output<String> getLastModifiedAt() {
        return this.lastModifiedAt;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="portalDisabled", type=Boolean.class, parameters={})
    private Output<Boolean> portalDisabled;

    public Output<Boolean> getPortalDisabled() {
        return this.portalDisabled;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="properties", type=GoogleCloudApigeeV1PropertiesResponse.class, parameters={})
    private Output<GoogleCloudApigeeV1PropertiesResponse> properties;

    public Output<GoogleCloudApigeeV1PropertiesResponse> getProperties() {
        return this.properties;
    }
    @OutputExport(name="runtimeDatabaseEncryptionKeyName", type=String.class, parameters={})
    private Output<String> runtimeDatabaseEncryptionKeyName;

    public Output<String> getRuntimeDatabaseEncryptionKeyName() {
        return this.runtimeDatabaseEncryptionKeyName;
    }
    @OutputExport(name="runtimeType", type=String.class, parameters={})
    private Output<String> runtimeType;

    public Output<String> getRuntimeType() {
        return this.runtimeType;
    }
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    public Output<String> getState() {
        return this.state;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public Organization(String name, OrganizationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:Organization", name, args == null ? OrganizationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Organization(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:Organization", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Organization get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Organization(name, id, options);
    }
}