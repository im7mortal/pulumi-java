// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.azurenative.migrate.outputs.VmUptimeResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class AssessmentPropertiesResponse {
    /**
     * Storage type selected for this disk.
     * 
     */
    private final String azureDiskType;
    /**
     * AHUB discount on windows virtual machines.
     * 
     */
    private final String azureHybridUseBenefit;
    /**
     * Target Azure location for which the machines should be assessed. These enums are the same as used by Compute API.
     * 
     */
    private final String azureLocation;
    /**
     * Offer code according to which cost estimation is done.
     * 
     */
    private final String azureOfferCode;
    /**
     * Pricing tier for Size evaluation.
     * 
     */
    private final String azurePricingTier;
    /**
     * Storage Redundancy type offered by Azure.
     * 
     */
    private final String azureStorageRedundancy;
    /**
     * List of azure VM families.
     * 
     */
    private final List<String> azureVmFamilies;
    /**
     * Confidence rating percentage for assessment. Can be in the range [0, 100].
     * 
     */
    private final Double confidenceRatingInPercentage;
    /**
     * Time when this project was created. Date-Time represented in ISO-8601 format.
     * 
     */
    private final String createdTimestamp;
    /**
     * Currency to report prices in.
     * 
     */
    private final String currency;
    /**
     * Custom discount percentage to be applied on final costs. Can be in the range [0, 100].
     * 
     */
    private final Double discountPercentage;
    /**
     * Enterprise agreement subscription arm id.
     * 
     */
    private final String eaSubscriptionId;
    /**
     * Monthly network cost estimate for the machines that are part of this assessment as a group, for a 31-day month.
     * 
     */
    private final Double monthlyBandwidthCost;
    /**
     * Monthly compute cost estimate for the machines that are part of this assessment as a group, for a 31-day month.
     * 
     */
    private final Double monthlyComputeCost;
    /**
     * Monthly premium storage cost estimate for the machines that are part of this assessment as a group, for a 31-day month.
     * 
     */
    private final Double monthlyPremiumStorageCost;
    /**
     * Monthly standard SSD storage cost estimate for the machines that are part of this assessment as a group, for a 31-day month.
     * 
     */
    private final Double monthlyStandardSSDStorageCost;
    /**
     * Monthly storage cost estimate for the machines that are part of this assessment as a group, for a 31-day month.
     * 
     */
    private final Double monthlyStorageCost;
    /**
     * Number of assessed machines part of this assessment.
     * 
     */
    private final Integer numberOfMachines;
    /**
     * Percentile of performance data used to recommend Azure size.
     * 
     */
    private final String percentile;
    /**
     * End time to consider performance data for assessment
     * 
     */
    private final String perfDataEndTime;
    /**
     * Start time to consider performance data for assessment
     * 
     */
    private final String perfDataStartTime;
    /**
     * Time when the Azure Prices were queried. Date-Time represented in ISO-8601 format.
     * 
     */
    private final String pricesTimestamp;
    /**
     * Azure reserved instance.
     * 
     */
    private final String reservedInstance;
    /**
     * Scaling factor used over utilization data to add a performance buffer for new machines to be created in Azure. Min Value = 1.0, Max value = 1.9, Default = 1.3.
     * 
     */
    private final Double scalingFactor;
    /**
     * Assessment sizing criterion.
     * 
     */
    private final String sizingCriterion;
    /**
     * User configurable setting that describes the status of the assessment.
     * 
     */
    private final String stage;
    /**
     * Whether the assessment has been created and is valid.
     * 
     */
    private final String status;
    /**
     * Time range of performance data used to recommend a size.
     * 
     */
    private final String timeRange;
    /**
     * Time when this project was last updated. Date-Time represented in ISO-8601 format.
     * 
     */
    private final String updatedTimestamp;
    /**
     * Specify the duration for which the VMs are up in the on-premises environment.
     * 
     */
    private final VmUptimeResponse vmUptime;

    @OutputCustomType.Constructor({"azureDiskType","azureHybridUseBenefit","azureLocation","azureOfferCode","azurePricingTier","azureStorageRedundancy","azureVmFamilies","confidenceRatingInPercentage","createdTimestamp","currency","discountPercentage","eaSubscriptionId","monthlyBandwidthCost","monthlyComputeCost","monthlyPremiumStorageCost","monthlyStandardSSDStorageCost","monthlyStorageCost","numberOfMachines","percentile","perfDataEndTime","perfDataStartTime","pricesTimestamp","reservedInstance","scalingFactor","sizingCriterion","stage","status","timeRange","updatedTimestamp","vmUptime"})
    private AssessmentPropertiesResponse(
        String azureDiskType,
        String azureHybridUseBenefit,
        String azureLocation,
        String azureOfferCode,
        String azurePricingTier,
        String azureStorageRedundancy,
        List<String> azureVmFamilies,
        Double confidenceRatingInPercentage,
        String createdTimestamp,
        String currency,
        Double discountPercentage,
        String eaSubscriptionId,
        Double monthlyBandwidthCost,
        Double monthlyComputeCost,
        Double monthlyPremiumStorageCost,
        Double monthlyStandardSSDStorageCost,
        Double monthlyStorageCost,
        Integer numberOfMachines,
        String percentile,
        String perfDataEndTime,
        String perfDataStartTime,
        String pricesTimestamp,
        String reservedInstance,
        Double scalingFactor,
        String sizingCriterion,
        String stage,
        String status,
        String timeRange,
        String updatedTimestamp,
        VmUptimeResponse vmUptime) {
        this.azureDiskType = Objects.requireNonNull(azureDiskType);
        this.azureHybridUseBenefit = Objects.requireNonNull(azureHybridUseBenefit);
        this.azureLocation = Objects.requireNonNull(azureLocation);
        this.azureOfferCode = Objects.requireNonNull(azureOfferCode);
        this.azurePricingTier = Objects.requireNonNull(azurePricingTier);
        this.azureStorageRedundancy = Objects.requireNonNull(azureStorageRedundancy);
        this.azureVmFamilies = Objects.requireNonNull(azureVmFamilies);
        this.confidenceRatingInPercentage = Objects.requireNonNull(confidenceRatingInPercentage);
        this.createdTimestamp = Objects.requireNonNull(createdTimestamp);
        this.currency = Objects.requireNonNull(currency);
        this.discountPercentage = Objects.requireNonNull(discountPercentage);
        this.eaSubscriptionId = Objects.requireNonNull(eaSubscriptionId);
        this.monthlyBandwidthCost = Objects.requireNonNull(monthlyBandwidthCost);
        this.monthlyComputeCost = Objects.requireNonNull(monthlyComputeCost);
        this.monthlyPremiumStorageCost = Objects.requireNonNull(monthlyPremiumStorageCost);
        this.monthlyStandardSSDStorageCost = Objects.requireNonNull(monthlyStandardSSDStorageCost);
        this.monthlyStorageCost = Objects.requireNonNull(monthlyStorageCost);
        this.numberOfMachines = Objects.requireNonNull(numberOfMachines);
        this.percentile = Objects.requireNonNull(percentile);
        this.perfDataEndTime = Objects.requireNonNull(perfDataEndTime);
        this.perfDataStartTime = Objects.requireNonNull(perfDataStartTime);
        this.pricesTimestamp = Objects.requireNonNull(pricesTimestamp);
        this.reservedInstance = Objects.requireNonNull(reservedInstance);
        this.scalingFactor = Objects.requireNonNull(scalingFactor);
        this.sizingCriterion = Objects.requireNonNull(sizingCriterion);
        this.stage = Objects.requireNonNull(stage);
        this.status = Objects.requireNonNull(status);
        this.timeRange = Objects.requireNonNull(timeRange);
        this.updatedTimestamp = Objects.requireNonNull(updatedTimestamp);
        this.vmUptime = Objects.requireNonNull(vmUptime);
    }

    /**
     * Storage type selected for this disk.
     * 
    */
    public String getAzureDiskType() {
        return this.azureDiskType;
    }
    /**
     * AHUB discount on windows virtual machines.
     * 
    */
    public String getAzureHybridUseBenefit() {
        return this.azureHybridUseBenefit;
    }
    /**
     * Target Azure location for which the machines should be assessed. These enums are the same as used by Compute API.
     * 
    */
    public String getAzureLocation() {
        return this.azureLocation;
    }
    /**
     * Offer code according to which cost estimation is done.
     * 
    */
    public String getAzureOfferCode() {
        return this.azureOfferCode;
    }
    /**
     * Pricing tier for Size evaluation.
     * 
    */
    public String getAzurePricingTier() {
        return this.azurePricingTier;
    }
    /**
     * Storage Redundancy type offered by Azure.
     * 
    */
    public String getAzureStorageRedundancy() {
        return this.azureStorageRedundancy;
    }
    /**
     * List of azure VM families.
     * 
    */
    public List<String> getAzureVmFamilies() {
        return this.azureVmFamilies;
    }
    /**
     * Confidence rating percentage for assessment. Can be in the range [0, 100].
     * 
    */
    public Double getConfidenceRatingInPercentage() {
        return this.confidenceRatingInPercentage;
    }
    /**
     * Time when this project was created. Date-Time represented in ISO-8601 format.
     * 
    */
    public String getCreatedTimestamp() {
        return this.createdTimestamp;
    }
    /**
     * Currency to report prices in.
     * 
    */
    public String getCurrency() {
        return this.currency;
    }
    /**
     * Custom discount percentage to be applied on final costs. Can be in the range [0, 100].
     * 
    */
    public Double getDiscountPercentage() {
        return this.discountPercentage;
    }
    /**
     * Enterprise agreement subscription arm id.
     * 
    */
    public String getEaSubscriptionId() {
        return this.eaSubscriptionId;
    }
    /**
     * Monthly network cost estimate for the machines that are part of this assessment as a group, for a 31-day month.
     * 
    */
    public Double getMonthlyBandwidthCost() {
        return this.monthlyBandwidthCost;
    }
    /**
     * Monthly compute cost estimate for the machines that are part of this assessment as a group, for a 31-day month.
     * 
    */
    public Double getMonthlyComputeCost() {
        return this.monthlyComputeCost;
    }
    /**
     * Monthly premium storage cost estimate for the machines that are part of this assessment as a group, for a 31-day month.
     * 
    */
    public Double getMonthlyPremiumStorageCost() {
        return this.monthlyPremiumStorageCost;
    }
    /**
     * Monthly standard SSD storage cost estimate for the machines that are part of this assessment as a group, for a 31-day month.
     * 
    */
    public Double getMonthlyStandardSSDStorageCost() {
        return this.monthlyStandardSSDStorageCost;
    }
    /**
     * Monthly storage cost estimate for the machines that are part of this assessment as a group, for a 31-day month.
     * 
    */
    public Double getMonthlyStorageCost() {
        return this.monthlyStorageCost;
    }
    /**
     * Number of assessed machines part of this assessment.
     * 
    */
    public Integer getNumberOfMachines() {
        return this.numberOfMachines;
    }
    /**
     * Percentile of performance data used to recommend Azure size.
     * 
    */
    public String getPercentile() {
        return this.percentile;
    }
    /**
     * End time to consider performance data for assessment
     * 
    */
    public String getPerfDataEndTime() {
        return this.perfDataEndTime;
    }
    /**
     * Start time to consider performance data for assessment
     * 
    */
    public String getPerfDataStartTime() {
        return this.perfDataStartTime;
    }
    /**
     * Time when the Azure Prices were queried. Date-Time represented in ISO-8601 format.
     * 
    */
    public String getPricesTimestamp() {
        return this.pricesTimestamp;
    }
    /**
     * Azure reserved instance.
     * 
    */
    public String getReservedInstance() {
        return this.reservedInstance;
    }
    /**
     * Scaling factor used over utilization data to add a performance buffer for new machines to be created in Azure. Min Value = 1.0, Max value = 1.9, Default = 1.3.
     * 
    */
    public Double getScalingFactor() {
        return this.scalingFactor;
    }
    /**
     * Assessment sizing criterion.
     * 
    */
    public String getSizingCriterion() {
        return this.sizingCriterion;
    }
    /**
     * User configurable setting that describes the status of the assessment.
     * 
    */
    public String getStage() {
        return this.stage;
    }
    /**
     * Whether the assessment has been created and is valid.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Time range of performance data used to recommend a size.
     * 
    */
    public String getTimeRange() {
        return this.timeRange;
    }
    /**
     * Time when this project was last updated. Date-Time represented in ISO-8601 format.
     * 
    */
    public String getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }
    /**
     * Specify the duration for which the VMs are up in the on-premises environment.
     * 
    */
    public VmUptimeResponse getVmUptime() {
        return this.vmUptime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssessmentPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String azureDiskType;
        private String azureHybridUseBenefit;
        private String azureLocation;
        private String azureOfferCode;
        private String azurePricingTier;
        private String azureStorageRedundancy;
        private List<String> azureVmFamilies;
        private Double confidenceRatingInPercentage;
        private String createdTimestamp;
        private String currency;
        private Double discountPercentage;
        private String eaSubscriptionId;
        private Double monthlyBandwidthCost;
        private Double monthlyComputeCost;
        private Double monthlyPremiumStorageCost;
        private Double monthlyStandardSSDStorageCost;
        private Double monthlyStorageCost;
        private Integer numberOfMachines;
        private String percentile;
        private String perfDataEndTime;
        private String perfDataStartTime;
        private String pricesTimestamp;
        private String reservedInstance;
        private Double scalingFactor;
        private String sizingCriterion;
        private String stage;
        private String status;
        private String timeRange;
        private String updatedTimestamp;
        private VmUptimeResponse vmUptime;

        public Builder() {
    	      // Empty
        }

        public Builder(AssessmentPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureDiskType = defaults.azureDiskType;
    	      this.azureHybridUseBenefit = defaults.azureHybridUseBenefit;
    	      this.azureLocation = defaults.azureLocation;
    	      this.azureOfferCode = defaults.azureOfferCode;
    	      this.azurePricingTier = defaults.azurePricingTier;
    	      this.azureStorageRedundancy = defaults.azureStorageRedundancy;
    	      this.azureVmFamilies = defaults.azureVmFamilies;
    	      this.confidenceRatingInPercentage = defaults.confidenceRatingInPercentage;
    	      this.createdTimestamp = defaults.createdTimestamp;
    	      this.currency = defaults.currency;
    	      this.discountPercentage = defaults.discountPercentage;
    	      this.eaSubscriptionId = defaults.eaSubscriptionId;
    	      this.monthlyBandwidthCost = defaults.monthlyBandwidthCost;
    	      this.monthlyComputeCost = defaults.monthlyComputeCost;
    	      this.monthlyPremiumStorageCost = defaults.monthlyPremiumStorageCost;
    	      this.monthlyStandardSSDStorageCost = defaults.monthlyStandardSSDStorageCost;
    	      this.monthlyStorageCost = defaults.monthlyStorageCost;
    	      this.numberOfMachines = defaults.numberOfMachines;
    	      this.percentile = defaults.percentile;
    	      this.perfDataEndTime = defaults.perfDataEndTime;
    	      this.perfDataStartTime = defaults.perfDataStartTime;
    	      this.pricesTimestamp = defaults.pricesTimestamp;
    	      this.reservedInstance = defaults.reservedInstance;
    	      this.scalingFactor = defaults.scalingFactor;
    	      this.sizingCriterion = defaults.sizingCriterion;
    	      this.stage = defaults.stage;
    	      this.status = defaults.status;
    	      this.timeRange = defaults.timeRange;
    	      this.updatedTimestamp = defaults.updatedTimestamp;
    	      this.vmUptime = defaults.vmUptime;
        }

        public Builder setAzureDiskType(String azureDiskType) {
            this.azureDiskType = Objects.requireNonNull(azureDiskType);
            return this;
        }

        public Builder setAzureHybridUseBenefit(String azureHybridUseBenefit) {
            this.azureHybridUseBenefit = Objects.requireNonNull(azureHybridUseBenefit);
            return this;
        }

        public Builder setAzureLocation(String azureLocation) {
            this.azureLocation = Objects.requireNonNull(azureLocation);
            return this;
        }

        public Builder setAzureOfferCode(String azureOfferCode) {
            this.azureOfferCode = Objects.requireNonNull(azureOfferCode);
            return this;
        }

        public Builder setAzurePricingTier(String azurePricingTier) {
            this.azurePricingTier = Objects.requireNonNull(azurePricingTier);
            return this;
        }

        public Builder setAzureStorageRedundancy(String azureStorageRedundancy) {
            this.azureStorageRedundancy = Objects.requireNonNull(azureStorageRedundancy);
            return this;
        }

        public Builder setAzureVmFamilies(List<String> azureVmFamilies) {
            this.azureVmFamilies = Objects.requireNonNull(azureVmFamilies);
            return this;
        }

        public Builder setConfidenceRatingInPercentage(Double confidenceRatingInPercentage) {
            this.confidenceRatingInPercentage = Objects.requireNonNull(confidenceRatingInPercentage);
            return this;
        }

        public Builder setCreatedTimestamp(String createdTimestamp) {
            this.createdTimestamp = Objects.requireNonNull(createdTimestamp);
            return this;
        }

        public Builder setCurrency(String currency) {
            this.currency = Objects.requireNonNull(currency);
            return this;
        }

        public Builder setDiscountPercentage(Double discountPercentage) {
            this.discountPercentage = Objects.requireNonNull(discountPercentage);
            return this;
        }

        public Builder setEaSubscriptionId(String eaSubscriptionId) {
            this.eaSubscriptionId = Objects.requireNonNull(eaSubscriptionId);
            return this;
        }

        public Builder setMonthlyBandwidthCost(Double monthlyBandwidthCost) {
            this.monthlyBandwidthCost = Objects.requireNonNull(monthlyBandwidthCost);
            return this;
        }

        public Builder setMonthlyComputeCost(Double monthlyComputeCost) {
            this.monthlyComputeCost = Objects.requireNonNull(monthlyComputeCost);
            return this;
        }

        public Builder setMonthlyPremiumStorageCost(Double monthlyPremiumStorageCost) {
            this.monthlyPremiumStorageCost = Objects.requireNonNull(monthlyPremiumStorageCost);
            return this;
        }

        public Builder setMonthlyStandardSSDStorageCost(Double monthlyStandardSSDStorageCost) {
            this.monthlyStandardSSDStorageCost = Objects.requireNonNull(monthlyStandardSSDStorageCost);
            return this;
        }

        public Builder setMonthlyStorageCost(Double monthlyStorageCost) {
            this.monthlyStorageCost = Objects.requireNonNull(monthlyStorageCost);
            return this;
        }

        public Builder setNumberOfMachines(Integer numberOfMachines) {
            this.numberOfMachines = Objects.requireNonNull(numberOfMachines);
            return this;
        }

        public Builder setPercentile(String percentile) {
            this.percentile = Objects.requireNonNull(percentile);
            return this;
        }

        public Builder setPerfDataEndTime(String perfDataEndTime) {
            this.perfDataEndTime = Objects.requireNonNull(perfDataEndTime);
            return this;
        }

        public Builder setPerfDataStartTime(String perfDataStartTime) {
            this.perfDataStartTime = Objects.requireNonNull(perfDataStartTime);
            return this;
        }

        public Builder setPricesTimestamp(String pricesTimestamp) {
            this.pricesTimestamp = Objects.requireNonNull(pricesTimestamp);
            return this;
        }

        public Builder setReservedInstance(String reservedInstance) {
            this.reservedInstance = Objects.requireNonNull(reservedInstance);
            return this;
        }

        public Builder setScalingFactor(Double scalingFactor) {
            this.scalingFactor = Objects.requireNonNull(scalingFactor);
            return this;
        }

        public Builder setSizingCriterion(String sizingCriterion) {
            this.sizingCriterion = Objects.requireNonNull(sizingCriterion);
            return this;
        }

        public Builder setStage(String stage) {
            this.stage = Objects.requireNonNull(stage);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTimeRange(String timeRange) {
            this.timeRange = Objects.requireNonNull(timeRange);
            return this;
        }

        public Builder setUpdatedTimestamp(String updatedTimestamp) {
            this.updatedTimestamp = Objects.requireNonNull(updatedTimestamp);
            return this;
        }

        public Builder setVmUptime(VmUptimeResponse vmUptime) {
            this.vmUptime = Objects.requireNonNull(vmUptime);
            return this;
        }
        public AssessmentPropertiesResponse build() {
            return new AssessmentPropertiesResponse(azureDiskType, azureHybridUseBenefit, azureLocation, azureOfferCode, azurePricingTier, azureStorageRedundancy, azureVmFamilies, confidenceRatingInPercentage, createdTimestamp, currency, discountPercentage, eaSubscriptionId, monthlyBandwidthCost, monthlyComputeCost, monthlyPremiumStorageCost, monthlyStandardSSDStorageCost, monthlyStorageCost, numberOfMachines, percentile, perfDataEndTime, perfDataStartTime, pricesTimestamp, reservedInstance, scalingFactor, sizingCriterion, stage, status, timeRange, updatedTimestamp, vmUptime);
        }
    }
}
