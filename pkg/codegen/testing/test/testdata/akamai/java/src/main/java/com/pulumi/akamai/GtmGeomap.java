// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.GtmGeomapArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.GtmGeomapState;
import com.pulumi.akamai.outputs.GtmGeomapAssignment;
import com.pulumi.akamai.outputs.GtmGeomapDefaultDatacenter;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/gtmGeomap:GtmGeomap")
public class GtmGeomap extends com.pulumi.resources.CustomResource {
    @Export(name="assignments", refs={List.class,GtmGeomapAssignment.class}, tree="[0,1]")
    private Output</* @Nullable */ List<GtmGeomapAssignment>> assignments;

    public Output<Optional<List<GtmGeomapAssignment>>> assignments() {
        return Codegen.optional(this.assignments);
    }
    @Export(name="defaultDatacenter", refs={GtmGeomapDefaultDatacenter.class}, tree="[0]")
    private Output<GtmGeomapDefaultDatacenter> defaultDatacenter;

    public Output<GtmGeomapDefaultDatacenter> defaultDatacenter() {
        return this.defaultDatacenter;
    }
    @Export(name="domain", refs={String.class}, tree="[0]")
    private Output<String> domain;

    public Output<String> domain() {
        return this.domain;
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="waitOnComplete", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> waitOnComplete;

    public Output<Optional<Boolean>> waitOnComplete() {
        return Codegen.optional(this.waitOnComplete);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GtmGeomap(java.lang.String name) {
        this(name, GtmGeomapArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GtmGeomap(java.lang.String name, GtmGeomapArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GtmGeomap(java.lang.String name, GtmGeomapArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/gtmGeomap:GtmGeomap", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private GtmGeomap(java.lang.String name, Output<java.lang.String> id, @Nullable GtmGeomapState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/gtmGeomap:GtmGeomap", name, state, makeResourceOptions(options, id), false);
    }

    private static GtmGeomapArgs makeArgs(GtmGeomapArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GtmGeomapArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("akamai:trafficmanagement/gtmGeomap:GtmGeomap").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static GtmGeomap get(java.lang.String name, Output<java.lang.String> id, @Nullable GtmGeomapState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GtmGeomap(name, id, state, options);
    }
}
