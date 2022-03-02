// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutomationActionLogicAppResponse {
    /**
     * The type of the action that will be triggered by the Automation
     * Expected value is 'LogicApp'.
     * 
     */
    private final String actionType;
    /**
     * The triggered Logic App Azure Resource ID. This can also reside on other subscriptions, given that you have permissions to trigger the Logic App
     * 
     */
    private final @Nullable String logicAppResourceId;
    /**
     * The Logic App trigger URI endpoint (it will not be included in any response).
     * 
     */
    private final @Nullable String uri;

    @OutputCustomType.Constructor({"actionType","logicAppResourceId","uri"})
    private AutomationActionLogicAppResponse(
        String actionType,
        @Nullable String logicAppResourceId,
        @Nullable String uri) {
        this.actionType = Objects.requireNonNull(actionType);
        this.logicAppResourceId = logicAppResourceId;
        this.uri = uri;
    }

    /**
     * The type of the action that will be triggered by the Automation
     * Expected value is 'LogicApp'.
     * 
    */
    public String getActionType() {
        return this.actionType;
    }
    /**
     * The triggered Logic App Azure Resource ID. This can also reside on other subscriptions, given that you have permissions to trigger the Logic App
     * 
    */
    public Optional<String> getLogicAppResourceId() {
        return Optional.ofNullable(this.logicAppResourceId);
    }
    /**
     * The Logic App trigger URI endpoint (it will not be included in any response).
     * 
    */
    public Optional<String> getUri() {
        return Optional.ofNullable(this.uri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationActionLogicAppResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionType;
        private @Nullable String logicAppResourceId;
        private @Nullable String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationActionLogicAppResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionType = defaults.actionType;
    	      this.logicAppResourceId = defaults.logicAppResourceId;
    	      this.uri = defaults.uri;
        }

        public Builder setActionType(String actionType) {
            this.actionType = Objects.requireNonNull(actionType);
            return this;
        }

        public Builder setLogicAppResourceId(@Nullable String logicAppResourceId) {
            this.logicAppResourceId = logicAppResourceId;
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }
        public AutomationActionLogicAppResponse build() {
            return new AutomationActionLogicAppResponse(actionType, logicAppResourceId, uri);
        }
    }
}
