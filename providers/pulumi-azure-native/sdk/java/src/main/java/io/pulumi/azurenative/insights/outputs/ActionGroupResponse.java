// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ActionGroupResponse {
    /**
     * The resource ID of the Action Group. This cannot be null or empty.
     * 
     */
    private final String actionGroupId;
    /**
     * the dictionary of custom properties to include with the post operation. These data are appended to the webhook payload.
     * 
     */
    private final @Nullable Map<String,String> webhookProperties;

    @OutputCustomType.Constructor({"actionGroupId","webhookProperties"})
    private ActionGroupResponse(
        String actionGroupId,
        @Nullable Map<String,String> webhookProperties) {
        this.actionGroupId = Objects.requireNonNull(actionGroupId);
        this.webhookProperties = webhookProperties;
    }

    /**
     * The resource ID of the Action Group. This cannot be null or empty.
     * 
    */
    public String getActionGroupId() {
        return this.actionGroupId;
    }
    /**
     * the dictionary of custom properties to include with the post operation. These data are appended to the webhook payload.
     * 
    */
    public Map<String,String> getWebhookProperties() {
        return this.webhookProperties == null ? Map.of() : this.webhookProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActionGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionGroupId;
        private @Nullable Map<String,String> webhookProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ActionGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionGroupId = defaults.actionGroupId;
    	      this.webhookProperties = defaults.webhookProperties;
        }

        public Builder setActionGroupId(String actionGroupId) {
            this.actionGroupId = Objects.requireNonNull(actionGroupId);
            return this;
        }

        public Builder setWebhookProperties(@Nullable Map<String,String> webhookProperties) {
            this.webhookProperties = webhookProperties;
            return this;
        }
        public ActionGroupResponse build() {
            return new ActionGroupResponse(actionGroupId, webhookProperties);
        }
    }
}
