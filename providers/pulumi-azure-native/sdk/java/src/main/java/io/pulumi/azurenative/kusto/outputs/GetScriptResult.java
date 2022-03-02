// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.outputs;

import io.pulumi.azurenative.kusto.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetScriptResult {
    /**
     * Flag that indicates whether to continue if one of the command fails.
     * 
     */
    private final @Nullable Boolean continueOnErrors;
    /**
     * A unique string. If changed the script will be applied again.
     * 
     */
    private final @Nullable String forceUpdateTag;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The provisioned state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * The url to the KQL script blob file.
     * 
     */
    private final String scriptUrl;
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"continueOnErrors","forceUpdateTag","id","name","provisioningState","scriptUrl","systemData","type"})
    private GetScriptResult(
        @Nullable Boolean continueOnErrors,
        @Nullable String forceUpdateTag,
        String id,
        String name,
        String provisioningState,
        String scriptUrl,
        SystemDataResponse systemData,
        String type) {
        this.continueOnErrors = continueOnErrors;
        this.forceUpdateTag = forceUpdateTag;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.scriptUrl = Objects.requireNonNull(scriptUrl);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Flag that indicates whether to continue if one of the command fails.
     * 
    */
    public Optional<Boolean> getContinueOnErrors() {
        return Optional.ofNullable(this.continueOnErrors);
    }
    /**
     * A unique string. If changed the script will be applied again.
     * 
    */
    public Optional<String> getForceUpdateTag() {
        return Optional.ofNullable(this.forceUpdateTag);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioned state of the resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The url to the KQL script blob file.
     * 
    */
    public String getScriptUrl() {
        return this.scriptUrl;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScriptResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean continueOnErrors;
        private @Nullable String forceUpdateTag;
        private String id;
        private String name;
        private String provisioningState;
        private String scriptUrl;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScriptResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.continueOnErrors = defaults.continueOnErrors;
    	      this.forceUpdateTag = defaults.forceUpdateTag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.scriptUrl = defaults.scriptUrl;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setContinueOnErrors(@Nullable Boolean continueOnErrors) {
            this.continueOnErrors = continueOnErrors;
            return this;
        }

        public Builder setForceUpdateTag(@Nullable String forceUpdateTag) {
            this.forceUpdateTag = forceUpdateTag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setScriptUrl(String scriptUrl) {
            this.scriptUrl = Objects.requireNonNull(scriptUrl);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetScriptResult build() {
            return new GetScriptResult(continueOnErrors, forceUpdateTag, id, name, provisioningState, scriptUrl, systemData, type);
        }
    }
}
