// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A single label name condition.
 * 
 */
public final class LoggingConfigurationConditionLabelNameConditionPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoggingConfigurationConditionLabelNameConditionPropertiesArgs Empty = new LoggingConfigurationConditionLabelNameConditionPropertiesArgs();

    /**
     * The label name that a log record must contain in order to meet the condition. This must be a fully qualified label name. Fully qualified labels have a prefix, optional namespaces, and label name. The prefix identifies the rule group or web ACL context of the rule that added the label.
     * 
     */
    @InputImport(name="labelName", required=true)
    private final Input<String> labelName;

    public Input<String> getLabelName() {
        return this.labelName;
    }

    public LoggingConfigurationConditionLabelNameConditionPropertiesArgs(Input<String> labelName) {
        this.labelName = Objects.requireNonNull(labelName, "expected parameter 'labelName' to be non-null");
    }

    private LoggingConfigurationConditionLabelNameConditionPropertiesArgs() {
        this.labelName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigurationConditionLabelNameConditionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> labelName;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigurationConditionLabelNameConditionPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labelName = defaults.labelName;
        }

        public Builder setLabelName(Input<String> labelName) {
            this.labelName = Objects.requireNonNull(labelName);
            return this;
        }

        public Builder setLabelName(String labelName) {
            this.labelName = Input.of(Objects.requireNonNull(labelName));
            return this;
        }

        public LoggingConfigurationConditionLabelNameConditionPropertiesArgs build() {
            return new LoggingConfigurationConditionLabelNameConditionPropertiesArgs(labelName);
        }
    }
}
