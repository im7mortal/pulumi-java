// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.outputs;

import io.pulumi.azurenative.storsimple.outputs.FailoverSetResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListDeviceFailoverSetsResult {
    /**
     * The list of failover sets.
     * 
     */
    private final @Nullable List<FailoverSetResponse> value;

    @OutputCustomType.Constructor({"value"})
    private ListDeviceFailoverSetsResult(@Nullable List<FailoverSetResponse> value) {
        this.value = value;
    }

    /**
     * The list of failover sets.
     * 
    */
    public List<FailoverSetResponse> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListDeviceFailoverSetsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FailoverSetResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListDeviceFailoverSetsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder setValue(@Nullable List<FailoverSetResponse> value) {
            this.value = value;
            return this;
        }
        public ListDeviceFailoverSetsResult build() {
            return new ListDeviceFailoverSetsResult(value);
        }
    }
}
