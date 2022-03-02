// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.essentialcontacts_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetOrganizationContactResult {
    /**
     * The email address to send notifications to. This does not need to be a Google account.
     * 
     */
    private final String email;
    /**
     * The preferred language for notifications, as a ISO 639-1 language code. See [Supported languages](https://cloud.google.com/resource-manager/docs/managing-notification-contacts#supported-languages) for a list of supported languages.
     * 
     */
    private final String languageTag;
    /**
     * The identifier for the contact. Format: {resource_type}/{resource_id}/contacts/{contact_id}
     * 
     */
    private final String name;
    /**
     * The categories of notifications that the contact will receive communications for.
     * 
     */
    private final List<String> notificationCategorySubscriptions;
    /**
     * The last time the validation_state was updated, either manually or automatically. A contact is considered stale if its validation state was updated more than 1 year ago.
     * 
     */
    private final String validateTime;
    /**
     * The validity of the contact. A contact is considered valid if it is the correct recipient for notifications for a particular resource.
     * 
     */
    private final String validationState;

    @OutputCustomType.Constructor({"email","languageTag","name","notificationCategorySubscriptions","validateTime","validationState"})
    private GetOrganizationContactResult(
        String email,
        String languageTag,
        String name,
        List<String> notificationCategorySubscriptions,
        String validateTime,
        String validationState) {
        this.email = Objects.requireNonNull(email);
        this.languageTag = Objects.requireNonNull(languageTag);
        this.name = Objects.requireNonNull(name);
        this.notificationCategorySubscriptions = Objects.requireNonNull(notificationCategorySubscriptions);
        this.validateTime = Objects.requireNonNull(validateTime);
        this.validationState = Objects.requireNonNull(validationState);
    }

    /**
     * The email address to send notifications to. This does not need to be a Google account.
     * 
    */
    public String getEmail() {
        return this.email;
    }
    /**
     * The preferred language for notifications, as a ISO 639-1 language code. See [Supported languages](https://cloud.google.com/resource-manager/docs/managing-notification-contacts#supported-languages) for a list of supported languages.
     * 
    */
    public String getLanguageTag() {
        return this.languageTag;
    }
    /**
     * The identifier for the contact. Format: {resource_type}/{resource_id}/contacts/{contact_id}
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The categories of notifications that the contact will receive communications for.
     * 
    */
    public List<String> getNotificationCategorySubscriptions() {
        return this.notificationCategorySubscriptions;
    }
    /**
     * The last time the validation_state was updated, either manually or automatically. A contact is considered stale if its validation state was updated more than 1 year ago.
     * 
    */
    public String getValidateTime() {
        return this.validateTime;
    }
    /**
     * The validity of the contact. A contact is considered valid if it is the correct recipient for notifications for a particular resource.
     * 
    */
    public String getValidationState() {
        return this.validationState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationContactResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String email;
        private String languageTag;
        private String name;
        private List<String> notificationCategorySubscriptions;
        private String validateTime;
        private String validationState;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationContactResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.languageTag = defaults.languageTag;
    	      this.name = defaults.name;
    	      this.notificationCategorySubscriptions = defaults.notificationCategorySubscriptions;
    	      this.validateTime = defaults.validateTime;
    	      this.validationState = defaults.validationState;
        }

        public Builder setEmail(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder setLanguageTag(String languageTag) {
            this.languageTag = Objects.requireNonNull(languageTag);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNotificationCategorySubscriptions(List<String> notificationCategorySubscriptions) {
            this.notificationCategorySubscriptions = Objects.requireNonNull(notificationCategorySubscriptions);
            return this;
        }

        public Builder setValidateTime(String validateTime) {
            this.validateTime = Objects.requireNonNull(validateTime);
            return this;
        }

        public Builder setValidationState(String validationState) {
            this.validationState = Objects.requireNonNull(validationState);
            return this;
        }
        public GetOrganizationContactResult build() {
            return new GetOrganizationContactResult(email, languageTag, name, notificationCategorySubscriptions, validateTime, validationState);
        }
    }
}
