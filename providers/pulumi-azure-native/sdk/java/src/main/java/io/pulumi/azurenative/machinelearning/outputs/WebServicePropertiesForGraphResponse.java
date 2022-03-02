// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.outputs;

import io.pulumi.azurenative.machinelearning.outputs.AssetItemResponse;
import io.pulumi.azurenative.machinelearning.outputs.BlobLocationResponse;
import io.pulumi.azurenative.machinelearning.outputs.CommitmentPlanResponse;
import io.pulumi.azurenative.machinelearning.outputs.DiagnosticsConfigurationResponse;
import io.pulumi.azurenative.machinelearning.outputs.ExampleRequestResponse;
import io.pulumi.azurenative.machinelearning.outputs.GraphPackageResponse;
import io.pulumi.azurenative.machinelearning.outputs.MachineLearningWorkspaceResponse;
import io.pulumi.azurenative.machinelearning.outputs.RealtimeConfigurationResponse;
import io.pulumi.azurenative.machinelearning.outputs.ServiceInputOutputSpecificationResponse;
import io.pulumi.azurenative.machinelearning.outputs.StorageAccountResponse;
import io.pulumi.azurenative.machinelearning.outputs.WebServiceKeysResponse;
import io.pulumi.azurenative.machinelearning.outputs.WebServiceParameterResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebServicePropertiesForGraphResponse {
    /**
     * Contains user defined properties describing web service assets. Properties are expressed as Key/Value pairs.
     * 
     */
    private final @Nullable Map<String,AssetItemResponse> assets;
    /**
     * Contains the commitment plan associated with this web service. Set at creation time. Once set, this value cannot be changed. Note: The commitment plan is not returned from calls to GET operations.
     * 
     */
    private final @Nullable CommitmentPlanResponse commitmentPlan;
    /**
     * Read Only: The date and time when the web service was created.
     * 
     */
    private final String createdOn;
    /**
     * The description of the web service.
     * 
     */
    private final @Nullable String description;
    /**
     * Settings controlling the diagnostics traces collection for the web service.
     * 
     */
    private final @Nullable DiagnosticsConfigurationResponse diagnostics;
    /**
     * Defines sample input data for one or more of the service's inputs.
     * 
     */
    private final @Nullable ExampleRequestResponse exampleRequest;
    /**
     * When set to true, sample data is included in the web service's swagger definition. The default value is true.
     * 
     */
    private final @Nullable Boolean exposeSampleData;
    /**
     * Contains the Swagger 2.0 schema describing one or more of the web service's inputs. For more information, see the Swagger specification.
     * 
     */
    private final @Nullable ServiceInputOutputSpecificationResponse input;
    /**
     * Contains the web service provisioning keys. If you do not specify provisioning keys, the Azure Machine Learning system generates them for you. Note: The keys are not returned from calls to GET operations.
     * 
     */
    private final @Nullable WebServiceKeysResponse keys;
    /**
     * Specifies the Machine Learning workspace containing the experiment that is source for the web service.
     * 
     */
    private final @Nullable MachineLearningWorkspaceResponse machineLearningWorkspace;
    /**
     * Read Only: The date and time when the web service was last modified.
     * 
     */
    private final String modifiedOn;
    /**
     * Contains the Swagger 2.0 schema describing one or more of the web service's outputs. For more information, see the Swagger specification.
     * 
     */
    private final @Nullable ServiceInputOutputSpecificationResponse output;
    /**
     * The definition of the graph package making up this web service.
     * 
     */
    private final @Nullable GraphPackageResponse $package;
    /**
     * Specifies the package type. Valid values are Graph (Specifies a web service published through the Machine Learning Studio) and Code (Specifies a web service published using code such as Python). Note: Code is not supported at this time.
     * Expected value is 'Graph'.
     * 
     */
    private final String packageType;
    /**
     * The set of global parameters values defined for the web service, given as a global parameter name to default value map. If no default value is specified, the parameter is considered to be required.
     * 
     */
    private final @Nullable Map<String,WebServiceParameterResponse> parameters;
    /**
     * When set to true, indicates that the payload size is larger than 3 MB. Otherwise false. If the payload size exceed 3 MB, the payload is stored in a blob and the PayloadsLocation parameter contains the URI of the blob. Otherwise, this will be set to false and Assets, Input, Output, Package, Parameters, ExampleRequest are inline. The Payload sizes is determined by adding the size of the Assets, Input, Output, Package, Parameters, and the ExampleRequest.
     * 
     */
    private final @Nullable Boolean payloadsInBlobStorage;
    /**
     * The URI of the payload blob. This parameter contains a value only if the payloadsInBlobStorage parameter is set to true. Otherwise is set to null.
     * 
     */
    private final @Nullable BlobLocationResponse payloadsLocation;
    /**
     * Read Only: The provision state of the web service. Valid values are Unknown, Provisioning, Succeeded, and Failed.
     * 
     */
    private final String provisioningState;
    /**
     * When set to true, indicates that the web service is read-only and can no longer be updated or patched, only removed. Default, is false. Note: Once set to true, you cannot change its value.
     * 
     */
    private final @Nullable Boolean readOnly;
    /**
     * Contains the configuration settings for the web service endpoint.
     * 
     */
    private final @Nullable RealtimeConfigurationResponse realtimeConfiguration;
    /**
     * Specifies the storage account that Azure Machine Learning uses to store information about the web service. Only the name of the storage account is returned from calls to GET operations. When updating the storage account information, you must ensure that all necessary assets are available in the new storage account or calls to your web service will fail.
     * 
     */
    private final @Nullable StorageAccountResponse storageAccount;
    /**
     * Read Only: Contains the URI of the swagger spec associated with this web service.
     * 
     */
    private final String swaggerLocation;
    /**
     * The title of the web service.
     * 
     */
    private final @Nullable String title;

    @OutputCustomType.Constructor({"assets","commitmentPlan","createdOn","description","diagnostics","exampleRequest","exposeSampleData","input","keys","machineLearningWorkspace","modifiedOn","output","$package","packageType","parameters","payloadsInBlobStorage","payloadsLocation","provisioningState","readOnly","realtimeConfiguration","storageAccount","swaggerLocation","title"})
    private WebServicePropertiesForGraphResponse(
        @Nullable Map<String,AssetItemResponse> assets,
        @Nullable CommitmentPlanResponse commitmentPlan,
        String createdOn,
        @Nullable String description,
        @Nullable DiagnosticsConfigurationResponse diagnostics,
        @Nullable ExampleRequestResponse exampleRequest,
        @Nullable Boolean exposeSampleData,
        @Nullable ServiceInputOutputSpecificationResponse input,
        @Nullable WebServiceKeysResponse keys,
        @Nullable MachineLearningWorkspaceResponse machineLearningWorkspace,
        String modifiedOn,
        @Nullable ServiceInputOutputSpecificationResponse output,
        @Nullable GraphPackageResponse $package,
        String packageType,
        @Nullable Map<String,WebServiceParameterResponse> parameters,
        @Nullable Boolean payloadsInBlobStorage,
        @Nullable BlobLocationResponse payloadsLocation,
        String provisioningState,
        @Nullable Boolean readOnly,
        @Nullable RealtimeConfigurationResponse realtimeConfiguration,
        @Nullable StorageAccountResponse storageAccount,
        String swaggerLocation,
        @Nullable String title) {
        this.assets = assets;
        this.commitmentPlan = commitmentPlan;
        this.createdOn = Objects.requireNonNull(createdOn);
        this.description = description;
        this.diagnostics = diagnostics;
        this.exampleRequest = exampleRequest;
        this.exposeSampleData = exposeSampleData;
        this.input = input;
        this.keys = keys;
        this.machineLearningWorkspace = machineLearningWorkspace;
        this.modifiedOn = Objects.requireNonNull(modifiedOn);
        this.output = output;
        this.$package = $package;
        this.packageType = Objects.requireNonNull(packageType);
        this.parameters = parameters;
        this.payloadsInBlobStorage = payloadsInBlobStorage;
        this.payloadsLocation = payloadsLocation;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.readOnly = readOnly;
        this.realtimeConfiguration = realtimeConfiguration;
        this.storageAccount = storageAccount;
        this.swaggerLocation = Objects.requireNonNull(swaggerLocation);
        this.title = title;
    }

    /**
     * Contains user defined properties describing web service assets. Properties are expressed as Key/Value pairs.
     * 
    */
    public Map<String,AssetItemResponse> getAssets() {
        return this.assets == null ? Map.of() : this.assets;
    }
    /**
     * Contains the commitment plan associated with this web service. Set at creation time. Once set, this value cannot be changed. Note: The commitment plan is not returned from calls to GET operations.
     * 
    */
    public Optional<CommitmentPlanResponse> getCommitmentPlan() {
        return Optional.ofNullable(this.commitmentPlan);
    }
    /**
     * Read Only: The date and time when the web service was created.
     * 
    */
    public String getCreatedOn() {
        return this.createdOn;
    }
    /**
     * The description of the web service.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Settings controlling the diagnostics traces collection for the web service.
     * 
    */
    public Optional<DiagnosticsConfigurationResponse> getDiagnostics() {
        return Optional.ofNullable(this.diagnostics);
    }
    /**
     * Defines sample input data for one or more of the service's inputs.
     * 
    */
    public Optional<ExampleRequestResponse> getExampleRequest() {
        return Optional.ofNullable(this.exampleRequest);
    }
    /**
     * When set to true, sample data is included in the web service's swagger definition. The default value is true.
     * 
    */
    public Optional<Boolean> getExposeSampleData() {
        return Optional.ofNullable(this.exposeSampleData);
    }
    /**
     * Contains the Swagger 2.0 schema describing one or more of the web service's inputs. For more information, see the Swagger specification.
     * 
    */
    public Optional<ServiceInputOutputSpecificationResponse> getInput() {
        return Optional.ofNullable(this.input);
    }
    /**
     * Contains the web service provisioning keys. If you do not specify provisioning keys, the Azure Machine Learning system generates them for you. Note: The keys are not returned from calls to GET operations.
     * 
    */
    public Optional<WebServiceKeysResponse> getKeys() {
        return Optional.ofNullable(this.keys);
    }
    /**
     * Specifies the Machine Learning workspace containing the experiment that is source for the web service.
     * 
    */
    public Optional<MachineLearningWorkspaceResponse> getMachineLearningWorkspace() {
        return Optional.ofNullable(this.machineLearningWorkspace);
    }
    /**
     * Read Only: The date and time when the web service was last modified.
     * 
    */
    public String getModifiedOn() {
        return this.modifiedOn;
    }
    /**
     * Contains the Swagger 2.0 schema describing one or more of the web service's outputs. For more information, see the Swagger specification.
     * 
    */
    public Optional<ServiceInputOutputSpecificationResponse> getOutput() {
        return Optional.ofNullable(this.output);
    }
    /**
     * The definition of the graph package making up this web service.
     * 
    */
    public Optional<GraphPackageResponse> get$package() {
        return Optional.ofNullable(this.$package);
    }
    /**
     * Specifies the package type. Valid values are Graph (Specifies a web service published through the Machine Learning Studio) and Code (Specifies a web service published using code such as Python). Note: Code is not supported at this time.
     * Expected value is 'Graph'.
     * 
    */
    public String getPackageType() {
        return this.packageType;
    }
    /**
     * The set of global parameters values defined for the web service, given as a global parameter name to default value map. If no default value is specified, the parameter is considered to be required.
     * 
    */
    public Map<String,WebServiceParameterResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * When set to true, indicates that the payload size is larger than 3 MB. Otherwise false. If the payload size exceed 3 MB, the payload is stored in a blob and the PayloadsLocation parameter contains the URI of the blob. Otherwise, this will be set to false and Assets, Input, Output, Package, Parameters, ExampleRequest are inline. The Payload sizes is determined by adding the size of the Assets, Input, Output, Package, Parameters, and the ExampleRequest.
     * 
    */
    public Optional<Boolean> getPayloadsInBlobStorage() {
        return Optional.ofNullable(this.payloadsInBlobStorage);
    }
    /**
     * The URI of the payload blob. This parameter contains a value only if the payloadsInBlobStorage parameter is set to true. Otherwise is set to null.
     * 
    */
    public Optional<BlobLocationResponse> getPayloadsLocation() {
        return Optional.ofNullable(this.payloadsLocation);
    }
    /**
     * Read Only: The provision state of the web service. Valid values are Unknown, Provisioning, Succeeded, and Failed.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * When set to true, indicates that the web service is read-only and can no longer be updated or patched, only removed. Default, is false. Note: Once set to true, you cannot change its value.
     * 
    */
    public Optional<Boolean> getReadOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * Contains the configuration settings for the web service endpoint.
     * 
    */
    public Optional<RealtimeConfigurationResponse> getRealtimeConfiguration() {
        return Optional.ofNullable(this.realtimeConfiguration);
    }
    /**
     * Specifies the storage account that Azure Machine Learning uses to store information about the web service. Only the name of the storage account is returned from calls to GET operations. When updating the storage account information, you must ensure that all necessary assets are available in the new storage account or calls to your web service will fail.
     * 
    */
    public Optional<StorageAccountResponse> getStorageAccount() {
        return Optional.ofNullable(this.storageAccount);
    }
    /**
     * Read Only: Contains the URI of the swagger spec associated with this web service.
     * 
    */
    public String getSwaggerLocation() {
        return this.swaggerLocation;
    }
    /**
     * The title of the web service.
     * 
    */
    public Optional<String> getTitle() {
        return Optional.ofNullable(this.title);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebServicePropertiesForGraphResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,AssetItemResponse> assets;
        private @Nullable CommitmentPlanResponse commitmentPlan;
        private String createdOn;
        private @Nullable String description;
        private @Nullable DiagnosticsConfigurationResponse diagnostics;
        private @Nullable ExampleRequestResponse exampleRequest;
        private @Nullable Boolean exposeSampleData;
        private @Nullable ServiceInputOutputSpecificationResponse input;
        private @Nullable WebServiceKeysResponse keys;
        private @Nullable MachineLearningWorkspaceResponse machineLearningWorkspace;
        private String modifiedOn;
        private @Nullable ServiceInputOutputSpecificationResponse output;
        private @Nullable GraphPackageResponse $package;
        private String packageType;
        private @Nullable Map<String,WebServiceParameterResponse> parameters;
        private @Nullable Boolean payloadsInBlobStorage;
        private @Nullable BlobLocationResponse payloadsLocation;
        private String provisioningState;
        private @Nullable Boolean readOnly;
        private @Nullable RealtimeConfigurationResponse realtimeConfiguration;
        private @Nullable StorageAccountResponse storageAccount;
        private String swaggerLocation;
        private @Nullable String title;

        public Builder() {
    	      // Empty
        }

        public Builder(WebServicePropertiesForGraphResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assets = defaults.assets;
    	      this.commitmentPlan = defaults.commitmentPlan;
    	      this.createdOn = defaults.createdOn;
    	      this.description = defaults.description;
    	      this.diagnostics = defaults.diagnostics;
    	      this.exampleRequest = defaults.exampleRequest;
    	      this.exposeSampleData = defaults.exposeSampleData;
    	      this.input = defaults.input;
    	      this.keys = defaults.keys;
    	      this.machineLearningWorkspace = defaults.machineLearningWorkspace;
    	      this.modifiedOn = defaults.modifiedOn;
    	      this.output = defaults.output;
    	      this.$package = defaults.$package;
    	      this.packageType = defaults.packageType;
    	      this.parameters = defaults.parameters;
    	      this.payloadsInBlobStorage = defaults.payloadsInBlobStorage;
    	      this.payloadsLocation = defaults.payloadsLocation;
    	      this.provisioningState = defaults.provisioningState;
    	      this.readOnly = defaults.readOnly;
    	      this.realtimeConfiguration = defaults.realtimeConfiguration;
    	      this.storageAccount = defaults.storageAccount;
    	      this.swaggerLocation = defaults.swaggerLocation;
    	      this.title = defaults.title;
        }

        public Builder setAssets(@Nullable Map<String,AssetItemResponse> assets) {
            this.assets = assets;
            return this;
        }

        public Builder setCommitmentPlan(@Nullable CommitmentPlanResponse commitmentPlan) {
            this.commitmentPlan = commitmentPlan;
            return this;
        }

        public Builder setCreatedOn(String createdOn) {
            this.createdOn = Objects.requireNonNull(createdOn);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDiagnostics(@Nullable DiagnosticsConfigurationResponse diagnostics) {
            this.diagnostics = diagnostics;
            return this;
        }

        public Builder setExampleRequest(@Nullable ExampleRequestResponse exampleRequest) {
            this.exampleRequest = exampleRequest;
            return this;
        }

        public Builder setExposeSampleData(@Nullable Boolean exposeSampleData) {
            this.exposeSampleData = exposeSampleData;
            return this;
        }

        public Builder setInput(@Nullable ServiceInputOutputSpecificationResponse input) {
            this.input = input;
            return this;
        }

        public Builder setKeys(@Nullable WebServiceKeysResponse keys) {
            this.keys = keys;
            return this;
        }

        public Builder setMachineLearningWorkspace(@Nullable MachineLearningWorkspaceResponse machineLearningWorkspace) {
            this.machineLearningWorkspace = machineLearningWorkspace;
            return this;
        }

        public Builder setModifiedOn(String modifiedOn) {
            this.modifiedOn = Objects.requireNonNull(modifiedOn);
            return this;
        }

        public Builder setOutput(@Nullable ServiceInputOutputSpecificationResponse output) {
            this.output = output;
            return this;
        }

        public Builder set$package(@Nullable GraphPackageResponse $package) {
            this.$package = $package;
            return this;
        }

        public Builder setPackageType(String packageType) {
            this.packageType = Objects.requireNonNull(packageType);
            return this;
        }

        public Builder setParameters(@Nullable Map<String,WebServiceParameterResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setPayloadsInBlobStorage(@Nullable Boolean payloadsInBlobStorage) {
            this.payloadsInBlobStorage = payloadsInBlobStorage;
            return this;
        }

        public Builder setPayloadsLocation(@Nullable BlobLocationResponse payloadsLocation) {
            this.payloadsLocation = payloadsLocation;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder setRealtimeConfiguration(@Nullable RealtimeConfigurationResponse realtimeConfiguration) {
            this.realtimeConfiguration = realtimeConfiguration;
            return this;
        }

        public Builder setStorageAccount(@Nullable StorageAccountResponse storageAccount) {
            this.storageAccount = storageAccount;
            return this;
        }

        public Builder setSwaggerLocation(String swaggerLocation) {
            this.swaggerLocation = Objects.requireNonNull(swaggerLocation);
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = title;
            return this;
        }
        public WebServicePropertiesForGraphResponse build() {
            return new WebServicePropertiesForGraphResponse(assets, commitmentPlan, createdOn, description, diagnostics, exampleRequest, exposeSampleData, input, keys, machineLearningWorkspace, modifiedOn, output, $package, packageType, parameters, payloadsInBlobStorage, payloadsLocation, provisioningState, readOnly, realtimeConfiguration, storageAccount, swaggerLocation, title);
        }
    }
}
