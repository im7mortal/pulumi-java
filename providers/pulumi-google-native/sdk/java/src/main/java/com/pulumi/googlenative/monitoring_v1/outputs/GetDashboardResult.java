// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.monitoring_v1.outputs.ColumnLayoutResponse;
import com.pulumi.googlenative.monitoring_v1.outputs.DashboardFilterResponse;
import com.pulumi.googlenative.monitoring_v1.outputs.GridLayoutResponse;
import com.pulumi.googlenative.monitoring_v1.outputs.MosaicLayoutResponse;
import com.pulumi.googlenative.monitoring_v1.outputs.RowLayoutResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetDashboardResult {
    /**
     * @return The content is divided into equally spaced columns and the widgets are arranged vertically.
     * 
     */
    private final ColumnLayoutResponse columnLayout;
    /**
     * @return Filters to reduce the amount of data charted based on the filter criteria.
     * 
     */
    private final List<DashboardFilterResponse> dashboardFilters;
    /**
     * @return The mutable, human-readable name.
     * 
     */
    private final String displayName;
    /**
     * @return etag is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other. An etag is returned in the response to GetDashboard, and users are expected to put that etag in the request to UpdateDashboard to ensure that their change will be applied to the same version of the Dashboard configuration. The field should not be passed during dashboard creation.
     * 
     */
    private final String etag;
    /**
     * @return Content is arranged with a basic layout that re-flows a simple list of informational elements like widgets or tiles.
     * 
     */
    private final GridLayoutResponse gridLayout;
    /**
     * @return Labels applied to the dashboard
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return The content is arranged as a grid of tiles, with each content widget occupying one or more grid blocks.
     * 
     */
    private final MosaicLayoutResponse mosaicLayout;
    /**
     * @return Immutable. The resource name of the dashboard.
     * 
     */
    private final String name;
    /**
     * @return The content is divided into equally spaced rows and the widgets are arranged horizontally.
     * 
     */
    private final RowLayoutResponse rowLayout;

    @CustomType.Constructor
    private GetDashboardResult(
        @CustomType.Parameter("columnLayout") ColumnLayoutResponse columnLayout,
        @CustomType.Parameter("dashboardFilters") List<DashboardFilterResponse> dashboardFilters,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("gridLayout") GridLayoutResponse gridLayout,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("mosaicLayout") MosaicLayoutResponse mosaicLayout,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("rowLayout") RowLayoutResponse rowLayout) {
        this.columnLayout = columnLayout;
        this.dashboardFilters = dashboardFilters;
        this.displayName = displayName;
        this.etag = etag;
        this.gridLayout = gridLayout;
        this.labels = labels;
        this.mosaicLayout = mosaicLayout;
        this.name = name;
        this.rowLayout = rowLayout;
    }

    /**
     * @return The content is divided into equally spaced columns and the widgets are arranged vertically.
     * 
     */
    public ColumnLayoutResponse columnLayout() {
        return this.columnLayout;
    }
    /**
     * @return Filters to reduce the amount of data charted based on the filter criteria.
     * 
     */
    public List<DashboardFilterResponse> dashboardFilters() {
        return this.dashboardFilters;
    }
    /**
     * @return The mutable, human-readable name.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return etag is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other. An etag is returned in the response to GetDashboard, and users are expected to put that etag in the request to UpdateDashboard to ensure that their change will be applied to the same version of the Dashboard configuration. The field should not be passed during dashboard creation.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Content is arranged with a basic layout that re-flows a simple list of informational elements like widgets or tiles.
     * 
     */
    public GridLayoutResponse gridLayout() {
        return this.gridLayout;
    }
    /**
     * @return Labels applied to the dashboard
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The content is arranged as a grid of tiles, with each content widget occupying one or more grid blocks.
     * 
     */
    public MosaicLayoutResponse mosaicLayout() {
        return this.mosaicLayout;
    }
    /**
     * @return Immutable. The resource name of the dashboard.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The content is divided into equally spaced rows and the widgets are arranged horizontally.
     * 
     */
    public RowLayoutResponse rowLayout() {
        return this.rowLayout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDashboardResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ColumnLayoutResponse columnLayout;
        private List<DashboardFilterResponse> dashboardFilters;
        private String displayName;
        private String etag;
        private GridLayoutResponse gridLayout;
        private Map<String,String> labels;
        private MosaicLayoutResponse mosaicLayout;
        private String name;
        private RowLayoutResponse rowLayout;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDashboardResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnLayout = defaults.columnLayout;
    	      this.dashboardFilters = defaults.dashboardFilters;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.gridLayout = defaults.gridLayout;
    	      this.labels = defaults.labels;
    	      this.mosaicLayout = defaults.mosaicLayout;
    	      this.name = defaults.name;
    	      this.rowLayout = defaults.rowLayout;
        }

        public Builder columnLayout(ColumnLayoutResponse columnLayout) {
            this.columnLayout = Objects.requireNonNull(columnLayout);
            return this;
        }
        public Builder dashboardFilters(List<DashboardFilterResponse> dashboardFilters) {
            this.dashboardFilters = Objects.requireNonNull(dashboardFilters);
            return this;
        }
        public Builder dashboardFilters(DashboardFilterResponse... dashboardFilters) {
            return dashboardFilters(List.of(dashboardFilters));
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder gridLayout(GridLayoutResponse gridLayout) {
            this.gridLayout = Objects.requireNonNull(gridLayout);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder mosaicLayout(MosaicLayoutResponse mosaicLayout) {
            this.mosaicLayout = Objects.requireNonNull(mosaicLayout);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder rowLayout(RowLayoutResponse rowLayout) {
            this.rowLayout = Objects.requireNonNull(rowLayout);
            return this;
        }        public GetDashboardResult build() {
            return new GetDashboardResult(columnLayout, dashboardFilters, displayName, etag, gridLayout, labels, mosaicLayout, name, rowLayout);
        }
    }
}
