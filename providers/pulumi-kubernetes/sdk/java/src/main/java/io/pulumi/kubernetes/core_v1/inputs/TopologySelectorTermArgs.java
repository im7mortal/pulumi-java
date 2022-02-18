// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.TopologySelectorLabelRequirementArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A topology selector term represents the result of label queries. A null or empty topology selector term matches no objects. The requirements of them are ANDed. It provides a subset of functionality as NodeSelectorTerm. This is an alpha feature and may change in the future.
 * 
 */
public final class TopologySelectorTermArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopologySelectorTermArgs Empty = new TopologySelectorTermArgs();

    /**
     * A list of topology selector requirements by labels.
     * 
     */
    @InputImport(name="matchLabelExpressions")
    private final @Nullable Input<List<TopologySelectorLabelRequirementArgs>> matchLabelExpressions;

    public Input<List<TopologySelectorLabelRequirementArgs>> getMatchLabelExpressions() {
        return this.matchLabelExpressions == null ? Input.empty() : this.matchLabelExpressions;
    }

    public TopologySelectorTermArgs(@Nullable Input<List<TopologySelectorLabelRequirementArgs>> matchLabelExpressions) {
        this.matchLabelExpressions = matchLabelExpressions;
    }

    private TopologySelectorTermArgs() {
        this.matchLabelExpressions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopologySelectorTermArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<TopologySelectorLabelRequirementArgs>> matchLabelExpressions;

        public Builder() {
    	      // Empty
        }

        public Builder(TopologySelectorTermArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchLabelExpressions = defaults.matchLabelExpressions;
        }

        public Builder setMatchLabelExpressions(@Nullable Input<List<TopologySelectorLabelRequirementArgs>> matchLabelExpressions) {
            this.matchLabelExpressions = matchLabelExpressions;
            return this;
        }

        public Builder setMatchLabelExpressions(@Nullable List<TopologySelectorLabelRequirementArgs> matchLabelExpressions) {
            this.matchLabelExpressions = Input.ofNullable(matchLabelExpressions);
            return this;
        }

        public TopologySelectorTermArgs build() {
            return new TopologySelectorTermArgs(matchLabelExpressions);
        }
    }
}
