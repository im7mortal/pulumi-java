// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.gameservices_v1beta.RealmArgs;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new realm in a given project and location.
 * 
 */
@ResourceType(type="google-native:gameservices/v1beta:Realm")
public class Realm extends io.pulumi.resources.CustomResource {
    /**
     * The creation time.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The creation time.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Human readable description of the realm.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Human readable description of the realm.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * ETag of the resource.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return ETag of the resource.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The labels associated with this realm. Each label is a key-value pair.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return The labels associated with this realm. Each label is a key-value pair.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The resource name of the realm, in the following form: `projects/{project}/locations/{location}/realms/{realm}`. For example, `projects/my-project/locations/{location}/realms/my-realm`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the realm, in the following form: `projects/{project}/locations/{location}/realms/{realm}`. For example, `projects/my-project/locations/{location}/realms/my-realm`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Time zone where all policies targeting this realm are evaluated. The value of this field must be from the IANA time zone database: https://www.iana.org/time-zones.
     * 
     */
    @OutputExport(name="timeZone", type=String.class, parameters={})
    private Output<String> timeZone;

    /**
     * @return Time zone where all policies targeting this realm are evaluated. The value of this field must be from the IANA time zone database: https://www.iana.org/time-zones.
     * 
     */
    public Output<String> getTimeZone() {
        return this.timeZone;
    }
    /**
     * The last-modified time.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The last-modified time.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(RealmArgs.Builder a);
    }
    private static io.pulumi.googlenative.gameservices_v1beta.RealmArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.gameservices_v1beta.RealmArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Realm(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Realm(String name) {
        this(name, RealmArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Realm(String name, RealmArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Realm(String name, RealmArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:gameservices/v1beta:Realm", name, args == null ? RealmArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Realm(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:gameservices/v1beta:Realm", name, null, makeResourceOptions(options, id));
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
    public static Realm get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Realm(name, id, options);
    }
}
