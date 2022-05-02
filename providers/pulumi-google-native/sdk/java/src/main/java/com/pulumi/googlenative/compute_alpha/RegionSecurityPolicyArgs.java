// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.enums.RegionSecurityPolicyType;
import com.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyAdaptiveProtectionConfigArgs;
import com.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyAdvancedOptionsConfigArgs;
import com.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyAssociationArgs;
import com.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyCloudArmorConfigArgs;
import com.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyDdosProtectionConfigArgs;
import com.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyRecaptchaOptionsConfigArgs;
import com.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionSecurityPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionSecurityPolicyArgs Empty = new RegionSecurityPolicyArgs();

    @Import(name="adaptiveProtectionConfig")
    private @Nullable Output<SecurityPolicyAdaptiveProtectionConfigArgs> adaptiveProtectionConfig;

    public Optional<Output<SecurityPolicyAdaptiveProtectionConfigArgs>> adaptiveProtectionConfig() {
        return Optional.ofNullable(this.adaptiveProtectionConfig);
    }

    @Import(name="advancedOptionsConfig")
    private @Nullable Output<SecurityPolicyAdvancedOptionsConfigArgs> advancedOptionsConfig;

    public Optional<Output<SecurityPolicyAdvancedOptionsConfigArgs>> advancedOptionsConfig() {
        return Optional.ofNullable(this.advancedOptionsConfig);
    }

    /**
     * A list of associations that belong to this policy.
     * 
     */
    @Import(name="associations")
    private @Nullable Output<List<SecurityPolicyAssociationArgs>> associations;

    /**
     * @return A list of associations that belong to this policy.
     * 
     */
    public Optional<Output<List<SecurityPolicyAssociationArgs>>> associations() {
        return Optional.ofNullable(this.associations);
    }

    @Import(name="cloudArmorConfig")
    private @Nullable Output<SecurityPolicyCloudArmorConfigArgs> cloudArmorConfig;

    public Optional<Output<SecurityPolicyCloudArmorConfigArgs>> cloudArmorConfig() {
        return Optional.ofNullable(this.cloudArmorConfig);
    }

    @Import(name="ddosProtectionConfig")
    private @Nullable Output<SecurityPolicyDdosProtectionConfigArgs> ddosProtectionConfig;

    public Optional<Output<SecurityPolicyDdosProtectionConfigArgs>> ddosProtectionConfig() {
        return Optional.ofNullable(this.ddosProtectionConfig);
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * User-provided name of the Organization security plicy. The name should be unique in the organization in which the security policy is created. This should only be used when SecurityPolicyType is FIREWALL. The name must be 1-63 characters long, and comply with https://www.ietf.org/rfc/rfc1035.txt. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return User-provided name of the Organization security plicy. The name should be unique in the organization in which the security policy is created. This should only be used when SecurityPolicyType is FIREWALL. The name must be 1-63 characters long, and comply with https://www.ietf.org/rfc/rfc1035.txt. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="recaptchaOptionsConfig")
    private @Nullable Output<SecurityPolicyRecaptchaOptionsConfigArgs> recaptchaOptionsConfig;

    public Optional<Output<SecurityPolicyRecaptchaOptionsConfigArgs>> recaptchaOptionsConfig() {
        return Optional.ofNullable(this.recaptchaOptionsConfig);
    }

    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    /**
     * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    /**
     * @return An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match &#34;*&#34;). If no rules are provided when creating a security policy, a default rule with action &#34;allow&#34; will be added.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<SecurityPolicyRuleArgs>> rules;

    /**
     * @return A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match &#34;*&#34;). If no rules are provided when creating a security policy, a default rule with action &#34;allow&#34; will be added.
     * 
     */
    public Optional<Output<List<SecurityPolicyRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    /**
     * The type indicates the intended use of the security policy. - CLOUD_ARMOR: Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers. - CLOUD_ARMOR_EDGE: Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google&#39;s cache. - CLOUD_ARMOR_INTERNAL_SERVICE: Cloud Armor internal service policies can be configured to filter HTTP requests targeting services managed by Traffic Director in a service mesh. They filter requests before the request is served from the application. This field can be set only at resource creation time.
     * 
     */
    @Import(name="type")
    private @Nullable Output<RegionSecurityPolicyType> type;

    /**
     * @return The type indicates the intended use of the security policy. - CLOUD_ARMOR: Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers. - CLOUD_ARMOR_EDGE: Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google&#39;s cache. - CLOUD_ARMOR_INTERNAL_SERVICE: Cloud Armor internal service policies can be configured to filter HTTP requests targeting services managed by Traffic Director in a service mesh. They filter requests before the request is served from the application. This field can be set only at resource creation time.
     * 
     */
    public Optional<Output<RegionSecurityPolicyType>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * If true, the request will not be committed.
     * 
     */
    @Import(name="validateOnly")
    private @Nullable Output<String> validateOnly;

    /**
     * @return If true, the request will not be committed.
     * 
     */
    public Optional<Output<String>> validateOnly() {
        return Optional.ofNullable(this.validateOnly);
    }

    private RegionSecurityPolicyArgs() {}

    private RegionSecurityPolicyArgs(RegionSecurityPolicyArgs $) {
        this.adaptiveProtectionConfig = $.adaptiveProtectionConfig;
        this.advancedOptionsConfig = $.advancedOptionsConfig;
        this.associations = $.associations;
        this.cloudArmorConfig = $.cloudArmorConfig;
        this.ddosProtectionConfig = $.ddosProtectionConfig;
        this.description = $.description;
        this.displayName = $.displayName;
        this.labels = $.labels;
        this.name = $.name;
        this.project = $.project;
        this.recaptchaOptionsConfig = $.recaptchaOptionsConfig;
        this.region = $.region;
        this.requestId = $.requestId;
        this.rules = $.rules;
        this.type = $.type;
        this.validateOnly = $.validateOnly;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionSecurityPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionSecurityPolicyArgs $;

        public Builder() {
            $ = new RegionSecurityPolicyArgs();
        }

        public Builder(RegionSecurityPolicyArgs defaults) {
            $ = new RegionSecurityPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder adaptiveProtectionConfig(@Nullable Output<SecurityPolicyAdaptiveProtectionConfigArgs> adaptiveProtectionConfig) {
            $.adaptiveProtectionConfig = adaptiveProtectionConfig;
            return this;
        }

        public Builder adaptiveProtectionConfig(SecurityPolicyAdaptiveProtectionConfigArgs adaptiveProtectionConfig) {
            return adaptiveProtectionConfig(Output.of(adaptiveProtectionConfig));
        }

        public Builder advancedOptionsConfig(@Nullable Output<SecurityPolicyAdvancedOptionsConfigArgs> advancedOptionsConfig) {
            $.advancedOptionsConfig = advancedOptionsConfig;
            return this;
        }

        public Builder advancedOptionsConfig(SecurityPolicyAdvancedOptionsConfigArgs advancedOptionsConfig) {
            return advancedOptionsConfig(Output.of(advancedOptionsConfig));
        }

        /**
         * @param associations A list of associations that belong to this policy.
         * 
         * @return builder
         * 
         */
        public Builder associations(@Nullable Output<List<SecurityPolicyAssociationArgs>> associations) {
            $.associations = associations;
            return this;
        }

        /**
         * @param associations A list of associations that belong to this policy.
         * 
         * @return builder
         * 
         */
        public Builder associations(List<SecurityPolicyAssociationArgs> associations) {
            return associations(Output.of(associations));
        }

        /**
         * @param associations A list of associations that belong to this policy.
         * 
         * @return builder
         * 
         */
        public Builder associations(SecurityPolicyAssociationArgs... associations) {
            return associations(List.of(associations));
        }

        public Builder cloudArmorConfig(@Nullable Output<SecurityPolicyCloudArmorConfigArgs> cloudArmorConfig) {
            $.cloudArmorConfig = cloudArmorConfig;
            return this;
        }

        public Builder cloudArmorConfig(SecurityPolicyCloudArmorConfigArgs cloudArmorConfig) {
            return cloudArmorConfig(Output.of(cloudArmorConfig));
        }

        public Builder ddosProtectionConfig(@Nullable Output<SecurityPolicyDdosProtectionConfigArgs> ddosProtectionConfig) {
            $.ddosProtectionConfig = ddosProtectionConfig;
            return this;
        }

        public Builder ddosProtectionConfig(SecurityPolicyDdosProtectionConfigArgs ddosProtectionConfig) {
            return ddosProtectionConfig(Output.of(ddosProtectionConfig));
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName User-provided name of the Organization security plicy. The name should be unique in the organization in which the security policy is created. This should only be used when SecurityPolicyType is FIREWALL. The name must be 1-63 characters long, and comply with https://www.ietf.org/rfc/rfc1035.txt. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName User-provided name of the Organization security plicy. The name should be unique in the organization in which the security policy is created. This should only be used when SecurityPolicyType is FIREWALL. The name must be 1-63 characters long, and comply with https://www.ietf.org/rfc/rfc1035.txt. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param labels Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder recaptchaOptionsConfig(@Nullable Output<SecurityPolicyRecaptchaOptionsConfigArgs> recaptchaOptionsConfig) {
            $.recaptchaOptionsConfig = recaptchaOptionsConfig;
            return this;
        }

        public Builder recaptchaOptionsConfig(SecurityPolicyRecaptchaOptionsConfigArgs recaptchaOptionsConfig) {
            return recaptchaOptionsConfig(Output.of(recaptchaOptionsConfig));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        /**
         * @param requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param rules A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match &#34;*&#34;). If no rules are provided when creating a security policy, a default rule with action &#34;allow&#34; will be added.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<SecurityPolicyRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match &#34;*&#34;). If no rules are provided when creating a security policy, a default rule with action &#34;allow&#34; will be added.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<SecurityPolicyRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match &#34;*&#34;). If no rules are provided when creating a security policy, a default rule with action &#34;allow&#34; will be added.
         * 
         * @return builder
         * 
         */
        public Builder rules(SecurityPolicyRuleArgs... rules) {
            return rules(List.of(rules));
        }

        /**
         * @param type The type indicates the intended use of the security policy. - CLOUD_ARMOR: Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers. - CLOUD_ARMOR_EDGE: Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google&#39;s cache. - CLOUD_ARMOR_INTERNAL_SERVICE: Cloud Armor internal service policies can be configured to filter HTTP requests targeting services managed by Traffic Director in a service mesh. They filter requests before the request is served from the application. This field can be set only at resource creation time.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<RegionSecurityPolicyType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type indicates the intended use of the security policy. - CLOUD_ARMOR: Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers. - CLOUD_ARMOR_EDGE: Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google&#39;s cache. - CLOUD_ARMOR_INTERNAL_SERVICE: Cloud Armor internal service policies can be configured to filter HTTP requests targeting services managed by Traffic Director in a service mesh. They filter requests before the request is served from the application. This field can be set only at resource creation time.
         * 
         * @return builder
         * 
         */
        public Builder type(RegionSecurityPolicyType type) {
            return type(Output.of(type));
        }

        /**
         * @param validateOnly If true, the request will not be committed.
         * 
         * @return builder
         * 
         */
        public Builder validateOnly(@Nullable Output<String> validateOnly) {
            $.validateOnly = validateOnly;
            return this;
        }

        /**
         * @param validateOnly If true, the request will not be committed.
         * 
         * @return builder
         * 
         */
        public Builder validateOnly(String validateOnly) {
            return validateOnly(Output.of(validateOnly));
        }

        public RegionSecurityPolicyArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
