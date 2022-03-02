// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.route53.QueryLogArgs;
import io.pulumi.aws.route53.inputs.QueryLogState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Route53 query logging configuration resource.
 * 
 * > **NOTE:** There are restrictions on the configuration of query logging. Notably,
 * the CloudWatch log group must be in the `us-east-1` region,
 * a permissive CloudWatch log resource policy must be in place, and
 * the Route53 hosted zone must be public.
 * See [Configuring Logging for DNS Queries](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html?console_help=true#query-logs-configuring) for additional details.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Route53 query logging configurations can be imported using their ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:route53/queryLog:QueryLog example_com xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx
 * ```
 * 
 */
@ResourceType(type="aws:route53/queryLog:QueryLog")
public class QueryLog extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the Query Logging Config.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the Query Logging Config.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * CloudWatch log group ARN to send query logs.
     * 
     */
    @OutputExport(name="cloudwatchLogGroupArn", type=String.class, parameters={})
    private Output<String> cloudwatchLogGroupArn;

    /**
     * @return CloudWatch log group ARN to send query logs.
     * 
     */
    public Output<String> getCloudwatchLogGroupArn() {
        return this.cloudwatchLogGroupArn;
    }
    /**
     * Route53 hosted zone ID to enable query logs.
     * 
     */
    @OutputExport(name="zoneId", type=String.class, parameters={})
    private Output<String> zoneId;

    /**
     * @return Route53 hosted zone ID to enable query logs.
     * 
     */
    public Output<String> getZoneId() {
        return this.zoneId;
    }

    public interface BuilderApplicator {
        public void apply(QueryLogArgs.Builder a);
    }
    private static io.pulumi.aws.route53.QueryLogArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.route53.QueryLogArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public QueryLog(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public QueryLog(String name) {
        this(name, QueryLogArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public QueryLog(String name, QueryLogArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public QueryLog(String name, QueryLogArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/queryLog:QueryLog", name, args == null ? QueryLogArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private QueryLog(String name, Input<String> id, @Nullable QueryLogState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/queryLog:QueryLog", name, state, makeResourceOptions(options, id));
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
    public static QueryLog get(String name, Input<String> id, @Nullable QueryLogState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new QueryLog(name, id, state, options);
    }
}
