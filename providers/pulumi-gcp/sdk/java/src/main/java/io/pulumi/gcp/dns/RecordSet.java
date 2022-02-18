// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.dns.RecordSetArgs;
import io.pulumi.gcp.dns.inputs.RecordSetState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * DNS record sets can be imported using either of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:dns/recordSet:RecordSet frontend projects/{{project}}/managedZones/{{zone}}/rrsets/{{name}}/{{type}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dns/recordSet:RecordSet frontend {{project}}/{{zone}}/{{name}}/{{type}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dns/recordSet:RecordSet frontend {{zone}}/{{name}}/{{type}}
 * ```
 * 
 *  NoteThe record name must include the trailing dot at the end.
 * 
 */
@ResourceType(type="gcp:dns/recordSet:RecordSet")
public class RecordSet extends io.pulumi.resources.CustomResource {
    /**
     * The name of the zone in which this record set will
     * reside.
     * 
     */
    @OutputExport(name="managedZone", type=String.class, parameters={})
    private Output<String> managedZone;

    /**
     * @return The name of the zone in which this record set will
     * reside.
     * 
     */
    public Output<String> getManagedZone() {
        return this.managedZone;
    }
    /**
     * The DNS name this record set will apply to.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The DNS name this record set will apply to.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The string data for the records in this record set whose meaning depends on the DNS type. For TXT record, if the string
     * data contains spaces, add surrounding \" if you don't want your string to get split on spaces. To specify a single
     * record value longer than 255 characters such as a TXT record for DKIM, add \"\" inside the Terraform configuration
     * string (e.g. "first255characters\"\"morecharacters").
     * 
     */
    @OutputExport(name="rrdatas", type=List.class, parameters={String.class})
    private Output<List<String>> rrdatas;

    /**
     * @return The string data for the records in this record set whose meaning depends on the DNS type. For TXT record, if the string
     * data contains spaces, add surrounding \" if you don't want your string to get split on spaces. To specify a single
     * record value longer than 255 characters such as a TXT record for DKIM, add \"\" inside the Terraform configuration
     * string (e.g. "first255characters\"\"morecharacters").
     * 
     */
    public Output<List<String>> getRrdatas() {
        return this.rrdatas;
    }
    /**
     * The time-to-live of this record set (seconds).
     * 
     */
    @OutputExport(name="ttl", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> ttl;

    /**
     * @return The time-to-live of this record set (seconds).
     * 
     */
    public Output</* @Nullable */ Integer> getTtl() {
        return this.ttl;
    }
    /**
     * The DNS record set type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The DNS record set type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RecordSet(String name, RecordSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dns/recordSet:RecordSet", name, args == null ? RecordSetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RecordSet(String name, Input<String> id, @Nullable RecordSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dns/recordSet:RecordSet", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RecordSet get(String name, Input<String> id, @Nullable RecordSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RecordSet(name, id, state, options);
    }
}