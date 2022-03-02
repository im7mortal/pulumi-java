// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.monitoring_v1.outputs.WidgetResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GridLayoutResponse {
    /**
     * The number of columns into which the view's width is divided. If omitted or set to zero, a system default will be used while rendering.
     * 
     */
    private final String columns;
    /**
     * The informational elements that are arranged into the columns row-first.
     * 
     */
    private final List<WidgetResponse> widgets;

    @OutputCustomType.Constructor({"columns","widgets"})
    private GridLayoutResponse(
        String columns,
        List<WidgetResponse> widgets) {
        this.columns = Objects.requireNonNull(columns);
        this.widgets = Objects.requireNonNull(widgets);
    }

    /**
     * The number of columns into which the view's width is divided. If omitted or set to zero, a system default will be used while rendering.
     * 
    */
    public String getColumns() {
        return this.columns;
    }
    /**
     * The informational elements that are arranged into the columns row-first.
     * 
    */
    public List<WidgetResponse> getWidgets() {
        return this.widgets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GridLayoutResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String columns;
        private List<WidgetResponse> widgets;

        public Builder() {
    	      // Empty
        }

        public Builder(GridLayoutResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columns = defaults.columns;
    	      this.widgets = defaults.widgets;
        }

        public Builder setColumns(String columns) {
            this.columns = Objects.requireNonNull(columns);
            return this;
        }

        public Builder setWidgets(List<WidgetResponse> widgets) {
            this.widgets = Objects.requireNonNull(widgets);
            return this;
        }
        public GridLayoutResponse build() {
            return new GridLayoutResponse(columns, widgets);
        }
    }
}
