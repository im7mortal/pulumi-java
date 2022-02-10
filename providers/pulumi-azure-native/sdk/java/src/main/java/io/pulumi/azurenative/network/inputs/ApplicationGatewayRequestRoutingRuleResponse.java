// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.SubResourceResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationGatewayRequestRoutingRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationGatewayRequestRoutingRuleResponse Empty = new ApplicationGatewayRequestRoutingRuleResponse();

    @InputImport(name="backendAddressPool")
    private final @Nullable SubResourceResponse backendAddressPool;

    public Optional<SubResourceResponse> getBackendAddressPool() {
        return this.backendAddressPool == null ? Optional.empty() : Optional.ofNullable(this.backendAddressPool);
    }

    @InputImport(name="backendHttpSettings")
    private final @Nullable SubResourceResponse backendHttpSettings;

    public Optional<SubResourceResponse> getBackendHttpSettings() {
        return this.backendHttpSettings == null ? Optional.empty() : Optional.ofNullable(this.backendHttpSettings);
    }

    @InputImport(name="etag", required=true)
    private final String etag;

    public String getEtag() {
        return this.etag;
    }

    @InputImport(name="httpListener")
    private final @Nullable SubResourceResponse httpListener;

    public Optional<SubResourceResponse> getHttpListener() {
        return this.httpListener == null ? Optional.empty() : Optional.ofNullable(this.httpListener);
    }

    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="priority")
    private final @Nullable Integer priority;

    public Optional<Integer> getPriority() {
        return this.priority == null ? Optional.empty() : Optional.ofNullable(this.priority);
    }

    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    @InputImport(name="redirectConfiguration")
    private final @Nullable SubResourceResponse redirectConfiguration;

    public Optional<SubResourceResponse> getRedirectConfiguration() {
        return this.redirectConfiguration == null ? Optional.empty() : Optional.ofNullable(this.redirectConfiguration);
    }

    @InputImport(name="rewriteRuleSet")
    private final @Nullable SubResourceResponse rewriteRuleSet;

    public Optional<SubResourceResponse> getRewriteRuleSet() {
        return this.rewriteRuleSet == null ? Optional.empty() : Optional.ofNullable(this.rewriteRuleSet);
    }

    @InputImport(name="ruleType")
    private final @Nullable String ruleType;

    public Optional<String> getRuleType() {
        return this.ruleType == null ? Optional.empty() : Optional.ofNullable(this.ruleType);
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    @InputImport(name="urlPathMap")
    private final @Nullable SubResourceResponse urlPathMap;

    public Optional<SubResourceResponse> getUrlPathMap() {
        return this.urlPathMap == null ? Optional.empty() : Optional.ofNullable(this.urlPathMap);
    }

    public ApplicationGatewayRequestRoutingRuleResponse(
        @Nullable SubResourceResponse backendAddressPool,
        @Nullable SubResourceResponse backendHttpSettings,
        String etag,
        @Nullable SubResourceResponse httpListener,
        @Nullable String id,
        @Nullable String name,
        @Nullable Integer priority,
        String provisioningState,
        @Nullable SubResourceResponse redirectConfiguration,
        @Nullable SubResourceResponse rewriteRuleSet,
        @Nullable String ruleType,
        String type,
        @Nullable SubResourceResponse urlPathMap) {
        this.backendAddressPool = backendAddressPool;
        this.backendHttpSettings = backendHttpSettings;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.httpListener = httpListener;
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.redirectConfiguration = redirectConfiguration;
        this.rewriteRuleSet = rewriteRuleSet;
        this.ruleType = ruleType;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.urlPathMap = urlPathMap;
    }

    private ApplicationGatewayRequestRoutingRuleResponse() {
        this.backendAddressPool = null;
        this.backendHttpSettings = null;
        this.etag = null;
        this.httpListener = null;
        this.id = null;
        this.name = null;
        this.priority = null;
        this.provisioningState = null;
        this.redirectConfiguration = null;
        this.rewriteRuleSet = null;
        this.ruleType = null;
        this.type = null;
        this.urlPathMap = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayRequestRoutingRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SubResourceResponse backendAddressPool;
        private @Nullable SubResourceResponse backendHttpSettings;
        private String etag;
        private @Nullable SubResourceResponse httpListener;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable Integer priority;
        private String provisioningState;
        private @Nullable SubResourceResponse redirectConfiguration;
        private @Nullable SubResourceResponse rewriteRuleSet;
        private @Nullable String ruleType;
        private String type;
        private @Nullable SubResourceResponse urlPathMap;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayRequestRoutingRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendAddressPool = defaults.backendAddressPool;
    	      this.backendHttpSettings = defaults.backendHttpSettings;
    	      this.etag = defaults.etag;
    	      this.httpListener = defaults.httpListener;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.provisioningState = defaults.provisioningState;
    	      this.redirectConfiguration = defaults.redirectConfiguration;
    	      this.rewriteRuleSet = defaults.rewriteRuleSet;
    	      this.ruleType = defaults.ruleType;
    	      this.type = defaults.type;
    	      this.urlPathMap = defaults.urlPathMap;
        }

        public Builder setBackendAddressPool(@Nullable SubResourceResponse backendAddressPool) {
            this.backendAddressPool = backendAddressPool;
            return this;
        }

        public Builder setBackendHttpSettings(@Nullable SubResourceResponse backendHttpSettings) {
            this.backendHttpSettings = backendHttpSettings;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setHttpListener(@Nullable SubResourceResponse httpListener) {
            this.httpListener = httpListener;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRedirectConfiguration(@Nullable SubResourceResponse redirectConfiguration) {
            this.redirectConfiguration = redirectConfiguration;
            return this;
        }

        public Builder setRewriteRuleSet(@Nullable SubResourceResponse rewriteRuleSet) {
            this.rewriteRuleSet = rewriteRuleSet;
            return this;
        }

        public Builder setRuleType(@Nullable String ruleType) {
            this.ruleType = ruleType;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUrlPathMap(@Nullable SubResourceResponse urlPathMap) {
            this.urlPathMap = urlPathMap;
            return this;
        }

        public ApplicationGatewayRequestRoutingRuleResponse build() {
            return new ApplicationGatewayRequestRoutingRuleResponse(backendAddressPool, backendHttpSettings, etag, httpListener, id, name, priority, provisioningState, redirectConfiguration, rewriteRuleSet, ruleType, type, urlPathMap);
        }
    }
}