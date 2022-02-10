// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.outputs;

import io.pulumi.azurenative.netapp.outputs.ExportPolicyRuleResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class VolumePropertiesResponseExportPolicy {
    private final @Nullable List<ExportPolicyRuleResponse> rules;

    @OutputCustomType.Constructor({"rules"})
    private VolumePropertiesResponseExportPolicy(@Nullable List<ExportPolicyRuleResponse> rules) {
        this.rules = rules;
    }

    public List<ExportPolicyRuleResponse> getRules() {
        return this.rules == null ? List.of() : this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumePropertiesResponseExportPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ExportPolicyRuleResponse> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumePropertiesResponseExportPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder setRules(@Nullable List<ExportPolicyRuleResponse> rules) {
            this.rules = rules;
            return this;
        }

        public VolumePropertiesResponseExportPolicy build() {
            return new VolumePropertiesResponseExportPolicy(rules);
        }
    }
}