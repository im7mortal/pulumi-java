// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.networkservices_v1beta1.inputs.GrpcRouteRouteActionArgs;
import com.pulumi.googlenative.networkservices_v1beta1.inputs.GrpcRouteRouteMatchArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes how to route traffic.
 * 
 */
public final class GrpcRouteRouteRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final GrpcRouteRouteRuleArgs Empty = new GrpcRouteRouteRuleArgs();

    /**
     * A detailed rule defining how to route traffic. This field is required.
     * 
     */
    @Import(name="action", required=true)
    private Output<GrpcRouteRouteActionArgs> action;

    /**
     * @return A detailed rule defining how to route traffic. This field is required.
     * 
     */
    public Output<GrpcRouteRouteActionArgs> action() {
        return this.action;
    }

    /**
     * Optional. Matches define conditions used for matching the rule against incoming gRPC requests. Each match is independent, i.e. this rule will be matched if ANY one of the matches is satisfied. If no matches field is specified, this rule will unconditionally match traffic.
     * 
     */
    @Import(name="matches")
    private @Nullable Output<List<GrpcRouteRouteMatchArgs>> matches;

    /**
     * @return Optional. Matches define conditions used for matching the rule against incoming gRPC requests. Each match is independent, i.e. this rule will be matched if ANY one of the matches is satisfied. If no matches field is specified, this rule will unconditionally match traffic.
     * 
     */
    public Optional<Output<List<GrpcRouteRouteMatchArgs>>> matches() {
        return Optional.ofNullable(this.matches);
    }

    private GrpcRouteRouteRuleArgs() {}

    private GrpcRouteRouteRuleArgs(GrpcRouteRouteRuleArgs $) {
        this.action = $.action;
        this.matches = $.matches;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GrpcRouteRouteRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GrpcRouteRouteRuleArgs $;

        public Builder() {
            $ = new GrpcRouteRouteRuleArgs();
        }

        public Builder(GrpcRouteRouteRuleArgs defaults) {
            $ = new GrpcRouteRouteRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action A detailed rule defining how to route traffic. This field is required.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<GrpcRouteRouteActionArgs> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action A detailed rule defining how to route traffic. This field is required.
         * 
         * @return builder
         * 
         */
        public Builder action(GrpcRouteRouteActionArgs action) {
            return action(Output.of(action));
        }

        /**
         * @param matches Optional. Matches define conditions used for matching the rule against incoming gRPC requests. Each match is independent, i.e. this rule will be matched if ANY one of the matches is satisfied. If no matches field is specified, this rule will unconditionally match traffic.
         * 
         * @return builder
         * 
         */
        public Builder matches(@Nullable Output<List<GrpcRouteRouteMatchArgs>> matches) {
            $.matches = matches;
            return this;
        }

        /**
         * @param matches Optional. Matches define conditions used for matching the rule against incoming gRPC requests. Each match is independent, i.e. this rule will be matched if ANY one of the matches is satisfied. If no matches field is specified, this rule will unconditionally match traffic.
         * 
         * @return builder
         * 
         */
        public Builder matches(List<GrpcRouteRouteMatchArgs> matches) {
            return matches(Output.of(matches));
        }

        /**
         * @param matches Optional. Matches define conditions used for matching the rule against incoming gRPC requests. Each match is independent, i.e. this rule will be matched if ANY one of the matches is satisfied. If no matches field is specified, this rule will unconditionally match traffic.
         * 
         * @return builder
         * 
         */
        public Builder matches(GrpcRouteRouteMatchArgs... matches) {
            return matches(List.of(matches));
        }

        public GrpcRouteRouteRuleArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            return $;
        }
    }

}
