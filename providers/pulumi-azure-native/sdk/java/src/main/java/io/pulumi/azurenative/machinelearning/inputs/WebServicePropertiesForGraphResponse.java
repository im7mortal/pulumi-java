// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.azurenative.machinelearning.inputs.AssetItemResponse;
import io.pulumi.azurenative.machinelearning.inputs.BlobLocationResponse;
import io.pulumi.azurenative.machinelearning.inputs.CommitmentPlanResponse;
import io.pulumi.azurenative.machinelearning.inputs.DiagnosticsConfigurationResponse;
import io.pulumi.azurenative.machinelearning.inputs.ExampleRequestResponse;
import io.pulumi.azurenative.machinelearning.inputs.GraphPackageResponse;
import io.pulumi.azurenative.machinelearning.inputs.MachineLearningWorkspaceResponse;
import io.pulumi.azurenative.machinelearning.inputs.RealtimeConfigurationResponse;
import io.pulumi.azurenative.machinelearning.inputs.ServiceInputOutputSpecificationResponse;
import io.pulumi.azurenative.machinelearning.inputs.StorageAccountResponse;
import io.pulumi.azurenative.machinelearning.inputs.WebServiceKeysResponse;
import io.pulumi.azurenative.machinelearning.inputs.WebServiceParameterResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebServicePropertiesForGraphResponse extends io.pulumi.resources.InvokeArgs {

    public static final WebServicePropertiesForGraphResponse Empty = new WebServicePropertiesForGraphResponse();

    @InputImport(name="assets")
    private final @Nullable Map<String,AssetItemResponse> assets;

    public Map<String,AssetItemResponse> getAssets() {
        return this.assets == null ? Map.of() : this.assets;
    }

    @InputImport(name="commitmentPlan")
    private final @Nullable CommitmentPlanResponse commitmentPlan;

    public Optional<CommitmentPlanResponse> getCommitmentPlan() {
        return this.commitmentPlan == null ? Optional.empty() : Optional.ofNullable(this.commitmentPlan);
    }

    @InputImport(name="createdOn", required=true)
    private final String createdOn;

    public String getCreatedOn() {
        return this.createdOn;
    }

    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    @InputImport(name="diagnostics")
    private final @Nullable DiagnosticsConfigurationResponse diagnostics;

    public Optional<DiagnosticsConfigurationResponse> getDiagnostics() {
        return this.diagnostics == null ? Optional.empty() : Optional.ofNullable(this.diagnostics);
    }

    @InputImport(name="exampleRequest")
    private final @Nullable ExampleRequestResponse exampleRequest;

    public Optional<ExampleRequestResponse> getExampleRequest() {
        return this.exampleRequest == null ? Optional.empty() : Optional.ofNullable(this.exampleRequest);
    }

    @InputImport(name="exposeSampleData")
    private final @Nullable Boolean exposeSampleData;

    public Optional<Boolean> getExposeSampleData() {
        return this.exposeSampleData == null ? Optional.empty() : Optional.ofNullable(this.exposeSampleData);
    }

    @InputImport(name="input")
    private final @Nullable ServiceInputOutputSpecificationResponse input;

    public Optional<ServiceInputOutputSpecificationResponse> getInput() {
        return this.input == null ? Optional.empty() : Optional.ofNullable(this.input);
    }

    @InputImport(name="keys")
    private final @Nullable WebServiceKeysResponse keys;

    public Optional<WebServiceKeysResponse> getKeys() {
        return this.keys == null ? Optional.empty() : Optional.ofNullable(this.keys);
    }

    @InputImport(name="machineLearningWorkspace")
    private final @Nullable MachineLearningWorkspaceResponse machineLearningWorkspace;

    public Optional<MachineLearningWorkspaceResponse> getMachineLearningWorkspace() {
        return this.machineLearningWorkspace == null ? Optional.empty() : Optional.ofNullable(this.machineLearningWorkspace);
    }

    @InputImport(name="modifiedOn", required=true)
    private final String modifiedOn;

    public String getModifiedOn() {
        return this.modifiedOn;
    }

    @InputImport(name="output")
    private final @Nullable ServiceInputOutputSpecificationResponse output;

    public Optional<ServiceInputOutputSpecificationResponse> getOutput() {
        return this.output == null ? Optional.empty() : Optional.ofNullable(this.output);
    }

    @InputImport(name="package")
    private final @Nullable GraphPackageResponse $package;

    public Optional<GraphPackageResponse> get$package() {
        return this.$package == null ? Optional.empty() : Optional.ofNullable(this.$package);
    }

    @InputImport(name="packageType", required=true)
    private final String packageType;

    public String getPackageType() {
        return this.packageType;
    }

    @InputImport(name="parameters")
    private final @Nullable Map<String,WebServiceParameterResponse> parameters;

    public Map<String,WebServiceParameterResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    @InputImport(name="payloadsInBlobStorage")
    private final @Nullable Boolean payloadsInBlobStorage;

    public Optional<Boolean> getPayloadsInBlobStorage() {
        return this.payloadsInBlobStorage == null ? Optional.empty() : Optional.ofNullable(this.payloadsInBlobStorage);
    }

    @InputImport(name="payloadsLocation")
    private final @Nullable BlobLocationResponse payloadsLocation;

    public Optional<BlobLocationResponse> getPayloadsLocation() {
        return this.payloadsLocation == null ? Optional.empty() : Optional.ofNullable(this.payloadsLocation);
    }

    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    @InputImport(name="readOnly")
    private final @Nullable Boolean readOnly;

    public Optional<Boolean> getReadOnly() {
        return this.readOnly == null ? Optional.empty() : Optional.ofNullable(this.readOnly);
    }

    @InputImport(name="realtimeConfiguration")
    private final @Nullable RealtimeConfigurationResponse realtimeConfiguration;

    public Optional<RealtimeConfigurationResponse> getRealtimeConfiguration() {
        return this.realtimeConfiguration == null ? Optional.empty() : Optional.ofNullable(this.realtimeConfiguration);
    }

    @InputImport(name="storageAccount")
    private final @Nullable StorageAccountResponse storageAccount;

    public Optional<StorageAccountResponse> getStorageAccount() {
        return this.storageAccount == null ? Optional.empty() : Optional.ofNullable(this.storageAccount);
    }

    @InputImport(name="swaggerLocation", required=true)
    private final String swaggerLocation;

    public String getSwaggerLocation() {
        return this.swaggerLocation;
    }

    @InputImport(name="title")
    private final @Nullable String title;

    public Optional<String> getTitle() {
        return this.title == null ? Optional.empty() : Optional.ofNullable(this.title);
    }

    public WebServicePropertiesForGraphResponse(
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
        this.createdOn = Objects.requireNonNull(createdOn, "expected parameter 'createdOn' to be non-null");
        this.description = description;
        this.diagnostics = diagnostics;
        this.exampleRequest = exampleRequest;
        this.exposeSampleData = exposeSampleData;
        this.input = input;
        this.keys = keys;
        this.machineLearningWorkspace = machineLearningWorkspace;
        this.modifiedOn = Objects.requireNonNull(modifiedOn, "expected parameter 'modifiedOn' to be non-null");
        this.output = output;
        this.$package = $package;
        this.packageType = Objects.requireNonNull(packageType, "expected parameter 'packageType' to be non-null");
        this.parameters = parameters;
        this.payloadsInBlobStorage = payloadsInBlobStorage;
        this.payloadsLocation = payloadsLocation;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.readOnly = readOnly;
        this.realtimeConfiguration = realtimeConfiguration;
        this.storageAccount = storageAccount;
        this.swaggerLocation = Objects.requireNonNull(swaggerLocation, "expected parameter 'swaggerLocation' to be non-null");
        this.title = title;
    }

    private WebServicePropertiesForGraphResponse() {
        this.assets = Map.of();
        this.commitmentPlan = null;
        this.createdOn = null;
        this.description = null;
        this.diagnostics = null;
        this.exampleRequest = null;
        this.exposeSampleData = null;
        this.input = null;
        this.keys = null;
        this.machineLearningWorkspace = null;
        this.modifiedOn = null;
        this.output = null;
        this.$package = null;
        this.packageType = null;
        this.parameters = Map.of();
        this.payloadsInBlobStorage = null;
        this.payloadsLocation = null;
        this.provisioningState = null;
        this.readOnly = null;
        this.realtimeConfiguration = null;
        this.storageAccount = null;
        this.swaggerLocation = null;
        this.title = null;
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