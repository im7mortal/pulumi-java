// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.inputs;

import io.pulumi.awsnative.datasync.enums.TaskFilterRuleFilterType;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies which files folders and objects to include or exclude when transferring files from source to destination.
 * 
 */
public final class TaskFilterRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskFilterRuleArgs Empty = new TaskFilterRuleArgs();

    /**
     * The type of filter rule to apply. AWS DataSync only supports the SIMPLE_PATTERN rule type.
     * 
     */
    @InputImport(name="filterType")
    private final @Nullable Input<TaskFilterRuleFilterType> filterType;

    public Input<TaskFilterRuleFilterType> getFilterType() {
        return this.filterType == null ? Input.empty() : this.filterType;
    }

    /**
     * A single filter string that consists of the patterns to include or exclude. The patterns are delimited by "|".
     * 
     */
    @InputImport(name="value")
    private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public TaskFilterRuleArgs(
        @Nullable Input<TaskFilterRuleFilterType> filterType,
        @Nullable Input<String> value) {
        this.filterType = filterType;
        this.value = value;
    }

    private TaskFilterRuleArgs() {
        this.filterType = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskFilterRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TaskFilterRuleFilterType> filterType;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskFilterRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterType = defaults.filterType;
    	      this.value = defaults.value;
        }

        public Builder setFilterType(@Nullable Input<TaskFilterRuleFilterType> filterType) {
            this.filterType = filterType;
            return this;
        }

        public Builder setFilterType(@Nullable TaskFilterRuleFilterType filterType) {
            this.filterType = Input.ofNullable(filterType);
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public TaskFilterRuleArgs build() {
            return new TaskFilterRuleArgs(filterType, value);
        }
    }
}
