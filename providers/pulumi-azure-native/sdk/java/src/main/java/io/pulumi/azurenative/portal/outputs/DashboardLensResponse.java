// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.outputs;

import io.pulumi.azurenative.portal.outputs.DashboardPartsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class DashboardLensResponse {
    /**
     * The dashboard len's metadata.
     * 
     */
    private final @Nullable Map<String,Object> metadata;
    /**
     * The lens order.
     * 
     */
    private final Integer order;
    /**
     * The dashboard parts.
     * 
     */
    private final List<DashboardPartsResponse> parts;

    @OutputCustomType.Constructor({"metadata","order","parts"})
    private DashboardLensResponse(
        @Nullable Map<String,Object> metadata,
        Integer order,
        List<DashboardPartsResponse> parts) {
        this.metadata = metadata;
        this.order = Objects.requireNonNull(order);
        this.parts = Objects.requireNonNull(parts);
    }

    /**
     * The dashboard len's metadata.
     * 
    */
    public Map<String,Object> getMetadata() {
        return this.metadata == null ? Map.of() : this.metadata;
    }
    /**
     * The lens order.
     * 
    */
    public Integer getOrder() {
        return this.order;
    }
    /**
     * The dashboard parts.
     * 
    */
    public List<DashboardPartsResponse> getParts() {
        return this.parts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardLensResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,Object> metadata;
        private Integer order;
        private List<DashboardPartsResponse> parts;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardLensResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
    	      this.order = defaults.order;
    	      this.parts = defaults.parts;
        }

        public Builder setMetadata(@Nullable Map<String,Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setOrder(Integer order) {
            this.order = Objects.requireNonNull(order);
            return this;
        }

        public Builder setParts(List<DashboardPartsResponse> parts) {
            this.parts = Objects.requireNonNull(parts);
            return this;
        }
        public DashboardLensResponse build() {
            return new DashboardLensResponse(metadata, order, parts);
        }
    }
}
