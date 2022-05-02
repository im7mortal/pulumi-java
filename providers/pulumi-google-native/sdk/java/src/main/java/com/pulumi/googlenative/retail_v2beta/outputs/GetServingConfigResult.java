// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.retail_v2beta.outputs.GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServingConfigResult {
    /**
     * @return Condition boost specifications. If a product matches multiple conditions in the specifications, boost scores from these specifications are all applied and combined in a non-linear way. Maximum number of specifications is 100. Notice that if both ServingConfig.boost_control_ids and [SearchRequest.boost_spec] are set, the boost conditions from both places are evaluated. If a search request matches multiple boost conditions, the final boost score is equal to the sum of the boost scores from all matched boost conditions. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    private final List<String> boostControlIds;
    /**
     * @return The human readable serving config display name. Used in Retail UI. This field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    private final String displayName;
    /**
     * @return How much diversity to use in recommendation model results e.g. &#39;medium-diversity&#39; or &#39;high-diversity&#39;. Currently supported values: * &#39;no-diversity&#39; * &#39;low-diversity&#39; * &#39;medium-diversity&#39; * &#39;high-diversity&#39; * &#39;auto-diversity&#39; If not specified, we choose default based on recommendation model type. Default value: &#39;no-diversity&#39;. Can only be set if solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
     */
    private final String diversityLevel;
    /**
     * @return Condition do not associate specifications. If multiple do not associate conditions match, all matching do not associate controls in the list will execute. - Order does not matter. - Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    private final List<String> doNotAssociateControlIds;
    /**
     * @return The specification for dynamically generated facets. Notice that only textual facets can be dynamically generated. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    private final GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecResponse dynamicFacetSpec;
    /**
     * @return Whether to add additional category filters on the &#39;similar-items&#39; model. If not specified, we enable it by default. Allowed values are: * &#39;no-category-match&#39;: No additional filtering of original results from the model and the customer&#39;s filters. * &#39;relaxed-category-match&#39;: Only keep results with categories that match at least one item categories in the PredictRequests&#39;s context item. * If customer also sends filters in the PredictRequest, then the results will satisfy both conditions (user given and category match). Can only be set if solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
     */
    private final String enableCategoryFilterLevel;
    /**
     * @return Facet specifications for faceted search. If empty, no facets are returned. The ids refer to the ids of Control resources with only the Facet control set. These controls are assumed to be in the same Catalog as the ServingConfig. A maximum of 100 values are allowed. Otherwise, an INVALID_ARGUMENT error is returned. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    private final List<String> facetControlIds;
    /**
     * @return Condition filter specifications. If a product matches multiple conditions in the specifications, filters from these specifications are all applied and combined via the AND operator. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    private final List<String> filterControlIds;
    /**
     * @return Condition ignore specifications. If multiple ignore conditions match, all matching ignore controls in the list will execute. - Order does not matter. - Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    private final List<String> ignoreControlIds;
    /**
     * @return The id of the model to use at serving time. Currently only RecommendationModels are supported: https://cloud.google.com/retail/recommendations-ai/docs/create-models Can be changed but only to a compatible model (e.g. others-you-may-like CTR to others-you-may-like CVR). Required when solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
     */
    private final String modelId;
    /**
     * @return Immutable. Fully qualified name projects/*{@literal /}locations/global/catalogs/*{@literal /}servingConfig/*
     * 
     */
    private final String name;
    /**
     * @return Condition oneway synonyms specifications. If multiple oneway synonyms conditions match, all matching oneway synonyms controls in the list will execute. Order of controls in the list will not matter. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    private final List<String> onewaySynonymsControlIds;
    /**
     * @return How much price ranking we want in serving results. Price reranking causes product items with a similar recommendation probability to be ordered by price, with the highest-priced items first. This setting could result in a decrease in click-through and conversion rates. Allowed values are: * &#39;no-price-reranking&#39; * &#39;low-price-raranking&#39; * &#39;medium-price-reranking&#39; * &#39;high-price-reranking&#39; If not specified, we choose default based on model type. Default value: &#39;no-price-reranking&#39;. Can only be set if solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
     */
    private final String priceRerankingLevel;
    /**
     * @return Condition redirect specifications. Only the first triggered redirect action is applied, even if multiple apply. Maximum number of specifications is 1000. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    private final List<String> redirectControlIds;
    /**
     * @return Condition replacement specifications. - Applied according to the order in the list. - A previously replaced term can not be re-replaced. - Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    private final List<String> replacementControlIds;
    /**
     * @return Immutable. Specifies the solution types that a serving config can be associated with. Currently we support setting only one type of solution.
     * 
     */
    private final List<String> solutionTypes;
    /**
     * @return Condition synonyms specifications. If multiple syonyms conditions match, all matching synonyms control in the list will execute. Order of controls in the list will not matter. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    private final List<String> twowaySynonymsControlIds;

    @CustomType.Constructor
    private GetServingConfigResult(
        @CustomType.Parameter("boostControlIds") List<String> boostControlIds,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("diversityLevel") String diversityLevel,
        @CustomType.Parameter("doNotAssociateControlIds") List<String> doNotAssociateControlIds,
        @CustomType.Parameter("dynamicFacetSpec") GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecResponse dynamicFacetSpec,
        @CustomType.Parameter("enableCategoryFilterLevel") String enableCategoryFilterLevel,
        @CustomType.Parameter("facetControlIds") List<String> facetControlIds,
        @CustomType.Parameter("filterControlIds") List<String> filterControlIds,
        @CustomType.Parameter("ignoreControlIds") List<String> ignoreControlIds,
        @CustomType.Parameter("modelId") String modelId,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("onewaySynonymsControlIds") List<String> onewaySynonymsControlIds,
        @CustomType.Parameter("priceRerankingLevel") String priceRerankingLevel,
        @CustomType.Parameter("redirectControlIds") List<String> redirectControlIds,
        @CustomType.Parameter("replacementControlIds") List<String> replacementControlIds,
        @CustomType.Parameter("solutionTypes") List<String> solutionTypes,
        @CustomType.Parameter("twowaySynonymsControlIds") List<String> twowaySynonymsControlIds) {
        this.boostControlIds = boostControlIds;
        this.displayName = displayName;
        this.diversityLevel = diversityLevel;
        this.doNotAssociateControlIds = doNotAssociateControlIds;
        this.dynamicFacetSpec = dynamicFacetSpec;
        this.enableCategoryFilterLevel = enableCategoryFilterLevel;
        this.facetControlIds = facetControlIds;
        this.filterControlIds = filterControlIds;
        this.ignoreControlIds = ignoreControlIds;
        this.modelId = modelId;
        this.name = name;
        this.onewaySynonymsControlIds = onewaySynonymsControlIds;
        this.priceRerankingLevel = priceRerankingLevel;
        this.redirectControlIds = redirectControlIds;
        this.replacementControlIds = replacementControlIds;
        this.solutionTypes = solutionTypes;
        this.twowaySynonymsControlIds = twowaySynonymsControlIds;
    }

    /**
     * @return Condition boost specifications. If a product matches multiple conditions in the specifications, boost scores from these specifications are all applied and combined in a non-linear way. Maximum number of specifications is 100. Notice that if both ServingConfig.boost_control_ids and [SearchRequest.boost_spec] are set, the boost conditions from both places are evaluated. If a search request matches multiple boost conditions, the final boost score is equal to the sum of the boost scores from all matched boost conditions. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    public List<String> boostControlIds() {
        return this.boostControlIds;
    }
    /**
     * @return The human readable serving config display name. Used in Retail UI. This field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return How much diversity to use in recommendation model results e.g. &#39;medium-diversity&#39; or &#39;high-diversity&#39;. Currently supported values: * &#39;no-diversity&#39; * &#39;low-diversity&#39; * &#39;medium-diversity&#39; * &#39;high-diversity&#39; * &#39;auto-diversity&#39; If not specified, we choose default based on recommendation model type. Default value: &#39;no-diversity&#39;. Can only be set if solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
     */
    public String diversityLevel() {
        return this.diversityLevel;
    }
    /**
     * @return Condition do not associate specifications. If multiple do not associate conditions match, all matching do not associate controls in the list will execute. - Order does not matter. - Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    public List<String> doNotAssociateControlIds() {
        return this.doNotAssociateControlIds;
    }
    /**
     * @return The specification for dynamically generated facets. Notice that only textual facets can be dynamically generated. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    public GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecResponse dynamicFacetSpec() {
        return this.dynamicFacetSpec;
    }
    /**
     * @return Whether to add additional category filters on the &#39;similar-items&#39; model. If not specified, we enable it by default. Allowed values are: * &#39;no-category-match&#39;: No additional filtering of original results from the model and the customer&#39;s filters. * &#39;relaxed-category-match&#39;: Only keep results with categories that match at least one item categories in the PredictRequests&#39;s context item. * If customer also sends filters in the PredictRequest, then the results will satisfy both conditions (user given and category match). Can only be set if solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
     */
    public String enableCategoryFilterLevel() {
        return this.enableCategoryFilterLevel;
    }
    /**
     * @return Facet specifications for faceted search. If empty, no facets are returned. The ids refer to the ids of Control resources with only the Facet control set. These controls are assumed to be in the same Catalog as the ServingConfig. A maximum of 100 values are allowed. Otherwise, an INVALID_ARGUMENT error is returned. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    public List<String> facetControlIds() {
        return this.facetControlIds;
    }
    /**
     * @return Condition filter specifications. If a product matches multiple conditions in the specifications, filters from these specifications are all applied and combined via the AND operator. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    public List<String> filterControlIds() {
        return this.filterControlIds;
    }
    /**
     * @return Condition ignore specifications. If multiple ignore conditions match, all matching ignore controls in the list will execute. - Order does not matter. - Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    public List<String> ignoreControlIds() {
        return this.ignoreControlIds;
    }
    /**
     * @return The id of the model to use at serving time. Currently only RecommendationModels are supported: https://cloud.google.com/retail/recommendations-ai/docs/create-models Can be changed but only to a compatible model (e.g. others-you-may-like CTR to others-you-may-like CVR). Required when solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
     */
    public String modelId() {
        return this.modelId;
    }
    /**
     * @return Immutable. Fully qualified name projects/*{@literal /}locations/global/catalogs/*{@literal /}servingConfig/*
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Condition oneway synonyms specifications. If multiple oneway synonyms conditions match, all matching oneway synonyms controls in the list will execute. Order of controls in the list will not matter. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    public List<String> onewaySynonymsControlIds() {
        return this.onewaySynonymsControlIds;
    }
    /**
     * @return How much price ranking we want in serving results. Price reranking causes product items with a similar recommendation probability to be ordered by price, with the highest-priced items first. This setting could result in a decrease in click-through and conversion rates. Allowed values are: * &#39;no-price-reranking&#39; * &#39;low-price-raranking&#39; * &#39;medium-price-reranking&#39; * &#39;high-price-reranking&#39; If not specified, we choose default based on model type. Default value: &#39;no-price-reranking&#39;. Can only be set if solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
     */
    public String priceRerankingLevel() {
        return this.priceRerankingLevel;
    }
    /**
     * @return Condition redirect specifications. Only the first triggered redirect action is applied, even if multiple apply. Maximum number of specifications is 1000. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    public List<String> redirectControlIds() {
        return this.redirectControlIds;
    }
    /**
     * @return Condition replacement specifications. - Applied according to the order in the list. - A previously replaced term can not be re-replaced. - Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    public List<String> replacementControlIds() {
        return this.replacementControlIds;
    }
    /**
     * @return Immutable. Specifies the solution types that a serving config can be associated with. Currently we support setting only one type of solution.
     * 
     */
    public List<String> solutionTypes() {
        return this.solutionTypes;
    }
    /**
     * @return Condition synonyms specifications. If multiple syonyms conditions match, all matching synonyms control in the list will execute. Order of controls in the list will not matter. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    public List<String> twowaySynonymsControlIds() {
        return this.twowaySynonymsControlIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServingConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> boostControlIds;
        private String displayName;
        private String diversityLevel;
        private List<String> doNotAssociateControlIds;
        private GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecResponse dynamicFacetSpec;
        private String enableCategoryFilterLevel;
        private List<String> facetControlIds;
        private List<String> filterControlIds;
        private List<String> ignoreControlIds;
        private String modelId;
        private String name;
        private List<String> onewaySynonymsControlIds;
        private String priceRerankingLevel;
        private List<String> redirectControlIds;
        private List<String> replacementControlIds;
        private List<String> solutionTypes;
        private List<String> twowaySynonymsControlIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServingConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boostControlIds = defaults.boostControlIds;
    	      this.displayName = defaults.displayName;
    	      this.diversityLevel = defaults.diversityLevel;
    	      this.doNotAssociateControlIds = defaults.doNotAssociateControlIds;
    	      this.dynamicFacetSpec = defaults.dynamicFacetSpec;
    	      this.enableCategoryFilterLevel = defaults.enableCategoryFilterLevel;
    	      this.facetControlIds = defaults.facetControlIds;
    	      this.filterControlIds = defaults.filterControlIds;
    	      this.ignoreControlIds = defaults.ignoreControlIds;
    	      this.modelId = defaults.modelId;
    	      this.name = defaults.name;
    	      this.onewaySynonymsControlIds = defaults.onewaySynonymsControlIds;
    	      this.priceRerankingLevel = defaults.priceRerankingLevel;
    	      this.redirectControlIds = defaults.redirectControlIds;
    	      this.replacementControlIds = defaults.replacementControlIds;
    	      this.solutionTypes = defaults.solutionTypes;
    	      this.twowaySynonymsControlIds = defaults.twowaySynonymsControlIds;
        }

        public Builder boostControlIds(List<String> boostControlIds) {
            this.boostControlIds = Objects.requireNonNull(boostControlIds);
            return this;
        }
        public Builder boostControlIds(String... boostControlIds) {
            return boostControlIds(List.of(boostControlIds));
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder diversityLevel(String diversityLevel) {
            this.diversityLevel = Objects.requireNonNull(diversityLevel);
            return this;
        }
        public Builder doNotAssociateControlIds(List<String> doNotAssociateControlIds) {
            this.doNotAssociateControlIds = Objects.requireNonNull(doNotAssociateControlIds);
            return this;
        }
        public Builder doNotAssociateControlIds(String... doNotAssociateControlIds) {
            return doNotAssociateControlIds(List.of(doNotAssociateControlIds));
        }
        public Builder dynamicFacetSpec(GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecResponse dynamicFacetSpec) {
            this.dynamicFacetSpec = Objects.requireNonNull(dynamicFacetSpec);
            return this;
        }
        public Builder enableCategoryFilterLevel(String enableCategoryFilterLevel) {
            this.enableCategoryFilterLevel = Objects.requireNonNull(enableCategoryFilterLevel);
            return this;
        }
        public Builder facetControlIds(List<String> facetControlIds) {
            this.facetControlIds = Objects.requireNonNull(facetControlIds);
            return this;
        }
        public Builder facetControlIds(String... facetControlIds) {
            return facetControlIds(List.of(facetControlIds));
        }
        public Builder filterControlIds(List<String> filterControlIds) {
            this.filterControlIds = Objects.requireNonNull(filterControlIds);
            return this;
        }
        public Builder filterControlIds(String... filterControlIds) {
            return filterControlIds(List.of(filterControlIds));
        }
        public Builder ignoreControlIds(List<String> ignoreControlIds) {
            this.ignoreControlIds = Objects.requireNonNull(ignoreControlIds);
            return this;
        }
        public Builder ignoreControlIds(String... ignoreControlIds) {
            return ignoreControlIds(List.of(ignoreControlIds));
        }
        public Builder modelId(String modelId) {
            this.modelId = Objects.requireNonNull(modelId);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder onewaySynonymsControlIds(List<String> onewaySynonymsControlIds) {
            this.onewaySynonymsControlIds = Objects.requireNonNull(onewaySynonymsControlIds);
            return this;
        }
        public Builder onewaySynonymsControlIds(String... onewaySynonymsControlIds) {
            return onewaySynonymsControlIds(List.of(onewaySynonymsControlIds));
        }
        public Builder priceRerankingLevel(String priceRerankingLevel) {
            this.priceRerankingLevel = Objects.requireNonNull(priceRerankingLevel);
            return this;
        }
        public Builder redirectControlIds(List<String> redirectControlIds) {
            this.redirectControlIds = Objects.requireNonNull(redirectControlIds);
            return this;
        }
        public Builder redirectControlIds(String... redirectControlIds) {
            return redirectControlIds(List.of(redirectControlIds));
        }
        public Builder replacementControlIds(List<String> replacementControlIds) {
            this.replacementControlIds = Objects.requireNonNull(replacementControlIds);
            return this;
        }
        public Builder replacementControlIds(String... replacementControlIds) {
            return replacementControlIds(List.of(replacementControlIds));
        }
        public Builder solutionTypes(List<String> solutionTypes) {
            this.solutionTypes = Objects.requireNonNull(solutionTypes);
            return this;
        }
        public Builder solutionTypes(String... solutionTypes) {
            return solutionTypes(List.of(solutionTypes));
        }
        public Builder twowaySynonymsControlIds(List<String> twowaySynonymsControlIds) {
            this.twowaySynonymsControlIds = Objects.requireNonNull(twowaySynonymsControlIds);
            return this;
        }
        public Builder twowaySynonymsControlIds(String... twowaySynonymsControlIds) {
            return twowaySynonymsControlIds(List.of(twowaySynonymsControlIds));
        }        public GetServingConfigResult build() {
            return new GetServingConfigResult(boostControlIds, displayName, diversityLevel, doNotAssociateControlIds, dynamicFacetSpec, enableCategoryFilterLevel, facetControlIds, filterControlIds, ignoreControlIds, modelId, name, onewaySynonymsControlIds, priceRerankingLevel, redirectControlIds, replacementControlIds, solutionTypes, twowaySynonymsControlIds);
        }
    }
}
