// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.myedgeorder.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.myedgeorder.outputs.AvailabilityInformationResponse;
import io.pulumi.myedgeorder.outputs.CostInformationResponse;
import io.pulumi.myedgeorder.outputs.DescriptionResponse;
import io.pulumi.myedgeorder.outputs.FilterablePropertyResponse;
import io.pulumi.myedgeorder.outputs.HierarchyInformationResponse;
import io.pulumi.myedgeorder.outputs.ImageInformationResponse;
import io.pulumi.myedgeorder.outputs.ProductLineResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ProductFamilyResponse {
    /**
     * Availability information of the product system.
     * 
     */
    private final AvailabilityInformationResponse availabilityInformation;
    /**
     * Cost information for the product system.
     * 
     */
    private final CostInformationResponse costInformation;
    /**
     * Description related to the product system.
     * 
     */
    private final DescriptionResponse description;
    /**
     * Display Name for the product system.
     * 
     */
    private final String displayName;
    /**
     * list of filters supported for a product
     * 
     */
    private final List<FilterablePropertyResponse> filterableProperties;
    /**
     * Hierarchy information of a product.
     * 
     */
    private final HierarchyInformationResponse hierarchyInformation;
    /**
     * Image information for the product system.
     * 
     */
    private final List<ImageInformationResponse> imageInformation;
    /**
     * List of product lines supported in the product family
     * 
     */
    private final List<ProductLineResponse> productLines;

    @OutputCustomType.Constructor({"availabilityInformation","costInformation","description","displayName","filterableProperties","hierarchyInformation","imageInformation","productLines"})
    private ProductFamilyResponse(
        AvailabilityInformationResponse availabilityInformation,
        CostInformationResponse costInformation,
        DescriptionResponse description,
        String displayName,
        List<FilterablePropertyResponse> filterableProperties,
        HierarchyInformationResponse hierarchyInformation,
        List<ImageInformationResponse> imageInformation,
        List<ProductLineResponse> productLines) {
        this.availabilityInformation = Objects.requireNonNull(availabilityInformation);
        this.costInformation = Objects.requireNonNull(costInformation);
        this.description = Objects.requireNonNull(description);
        this.displayName = Objects.requireNonNull(displayName);
        this.filterableProperties = Objects.requireNonNull(filterableProperties);
        this.hierarchyInformation = Objects.requireNonNull(hierarchyInformation);
        this.imageInformation = Objects.requireNonNull(imageInformation);
        this.productLines = Objects.requireNonNull(productLines);
    }

    /**
     * Availability information of the product system.
     * 
     */
    public AvailabilityInformationResponse getAvailabilityInformation() {
        return this.availabilityInformation;
    }
    /**
     * Cost information for the product system.
     * 
     */
    public CostInformationResponse getCostInformation() {
        return this.costInformation;
    }
    /**
     * Description related to the product system.
     * 
     */
    public DescriptionResponse getDescription() {
        return this.description;
    }
    /**
     * Display Name for the product system.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * list of filters supported for a product
     * 
     */
    public List<FilterablePropertyResponse> getFilterableProperties() {
        return this.filterableProperties;
    }
    /**
     * Hierarchy information of a product.
     * 
     */
    public HierarchyInformationResponse getHierarchyInformation() {
        return this.hierarchyInformation;
    }
    /**
     * Image information for the product system.
     * 
     */
    public List<ImageInformationResponse> getImageInformation() {
        return this.imageInformation;
    }
    /**
     * List of product lines supported in the product family
     * 
     */
    public List<ProductLineResponse> getProductLines() {
        return this.productLines;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProductFamilyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AvailabilityInformationResponse availabilityInformation;
        private CostInformationResponse costInformation;
        private DescriptionResponse description;
        private String displayName;
        private List<FilterablePropertyResponse> filterableProperties;
        private HierarchyInformationResponse hierarchyInformation;
        private List<ImageInformationResponse> imageInformation;
        private List<ProductLineResponse> productLines;

        public Builder() {
    	      // Empty
        }

        public Builder(ProductFamilyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityInformation = defaults.availabilityInformation;
    	      this.costInformation = defaults.costInformation;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.filterableProperties = defaults.filterableProperties;
    	      this.hierarchyInformation = defaults.hierarchyInformation;
    	      this.imageInformation = defaults.imageInformation;
    	      this.productLines = defaults.productLines;
        }

        public Builder setAvailabilityInformation(AvailabilityInformationResponse availabilityInformation) {
            this.availabilityInformation = Objects.requireNonNull(availabilityInformation);
            return this;
        }

        public Builder setCostInformation(CostInformationResponse costInformation) {
            this.costInformation = Objects.requireNonNull(costInformation);
            return this;
        }

        public Builder setDescription(DescriptionResponse description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setFilterableProperties(List<FilterablePropertyResponse> filterableProperties) {
            this.filterableProperties = Objects.requireNonNull(filterableProperties);
            return this;
        }

        public Builder setHierarchyInformation(HierarchyInformationResponse hierarchyInformation) {
            this.hierarchyInformation = Objects.requireNonNull(hierarchyInformation);
            return this;
        }

        public Builder setImageInformation(List<ImageInformationResponse> imageInformation) {
            this.imageInformation = Objects.requireNonNull(imageInformation);
            return this;
        }

        public Builder setProductLines(List<ProductLineResponse> productLines) {
            this.productLines = Objects.requireNonNull(productLines);
            return this;
        }

        public ProductFamilyResponse build() {
            return new ProductFamilyResponse(availabilityInformation, costInformation, description, displayName, filterableProperties, hierarchyInformation, imageInformation, productLines);
        }
    }
}
