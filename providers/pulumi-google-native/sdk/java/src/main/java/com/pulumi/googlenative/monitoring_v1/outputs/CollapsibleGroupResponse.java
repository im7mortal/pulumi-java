// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class CollapsibleGroupResponse {
    /**
     * @return The collapsed state of the widget on first page load.
     * 
     */
    private final Boolean collapsed;

    @CustomType.Constructor
    private CollapsibleGroupResponse(@CustomType.Parameter("collapsed") Boolean collapsed) {
        this.collapsed = collapsed;
    }

    /**
     * @return The collapsed state of the widget on first page load.
     * 
     */
    public Boolean collapsed() {
        return this.collapsed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CollapsibleGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean collapsed;

        public Builder() {
    	      // Empty
        }

        public Builder(CollapsibleGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collapsed = defaults.collapsed;
        }

        public Builder collapsed(Boolean collapsed) {
            this.collapsed = Objects.requireNonNull(collapsed);
            return this;
        }        public CollapsibleGroupResponse build() {
            return new CollapsibleGroupResponse(collapsed);
        }
    }
}
