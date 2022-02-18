// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.configuration;

import io.pulumi.awsnative.configuration.inputs.ConfigurationAggregatorAccountAggregationSourceArgs;
import io.pulumi.awsnative.configuration.inputs.ConfigurationAggregatorOrganizationAggregationSourceArgs;
import io.pulumi.awsnative.configuration.inputs.ConfigurationAggregatorTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigurationAggregatorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationAggregatorArgs Empty = new ConfigurationAggregatorArgs();

    @InputImport(name="accountAggregationSources")
    private final @Nullable Input<List<ConfigurationAggregatorAccountAggregationSourceArgs>> accountAggregationSources;

    public Input<List<ConfigurationAggregatorAccountAggregationSourceArgs>> getAccountAggregationSources() {
        return this.accountAggregationSources == null ? Input.empty() : this.accountAggregationSources;
    }

    /**
     * The name of the aggregator.
     * 
     */
    @InputImport(name="configurationAggregatorName")
    private final @Nullable Input<String> configurationAggregatorName;

    public Input<String> getConfigurationAggregatorName() {
        return this.configurationAggregatorName == null ? Input.empty() : this.configurationAggregatorName;
    }

    @InputImport(name="organizationAggregationSource")
    private final @Nullable Input<ConfigurationAggregatorOrganizationAggregationSourceArgs> organizationAggregationSource;

    public Input<ConfigurationAggregatorOrganizationAggregationSourceArgs> getOrganizationAggregationSource() {
        return this.organizationAggregationSource == null ? Input.empty() : this.organizationAggregationSource;
    }

    /**
     * The tags for the configuration aggregator.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<ConfigurationAggregatorTagArgs>> tags;

    public Input<List<ConfigurationAggregatorTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ConfigurationAggregatorArgs(
        @Nullable Input<List<ConfigurationAggregatorAccountAggregationSourceArgs>> accountAggregationSources,
        @Nullable Input<String> configurationAggregatorName,
        @Nullable Input<ConfigurationAggregatorOrganizationAggregationSourceArgs> organizationAggregationSource,
        @Nullable Input<List<ConfigurationAggregatorTagArgs>> tags) {
        this.accountAggregationSources = accountAggregationSources;
        this.configurationAggregatorName = configurationAggregatorName;
        this.organizationAggregationSource = organizationAggregationSource;
        this.tags = tags;
    }

    private ConfigurationAggregatorArgs() {
        this.accountAggregationSources = Input.empty();
        this.configurationAggregatorName = Input.empty();
        this.organizationAggregationSource = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationAggregatorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ConfigurationAggregatorAccountAggregationSourceArgs>> accountAggregationSources;
        private @Nullable Input<String> configurationAggregatorName;
        private @Nullable Input<ConfigurationAggregatorOrganizationAggregationSourceArgs> organizationAggregationSource;
        private @Nullable Input<List<ConfigurationAggregatorTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationAggregatorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountAggregationSources = defaults.accountAggregationSources;
    	      this.configurationAggregatorName = defaults.configurationAggregatorName;
    	      this.organizationAggregationSource = defaults.organizationAggregationSource;
    	      this.tags = defaults.tags;
        }

        public Builder setAccountAggregationSources(@Nullable Input<List<ConfigurationAggregatorAccountAggregationSourceArgs>> accountAggregationSources) {
            this.accountAggregationSources = accountAggregationSources;
            return this;
        }

        public Builder setAccountAggregationSources(@Nullable List<ConfigurationAggregatorAccountAggregationSourceArgs> accountAggregationSources) {
            this.accountAggregationSources = Input.ofNullable(accountAggregationSources);
            return this;
        }

        public Builder setConfigurationAggregatorName(@Nullable Input<String> configurationAggregatorName) {
            this.configurationAggregatorName = configurationAggregatorName;
            return this;
        }

        public Builder setConfigurationAggregatorName(@Nullable String configurationAggregatorName) {
            this.configurationAggregatorName = Input.ofNullable(configurationAggregatorName);
            return this;
        }

        public Builder setOrganizationAggregationSource(@Nullable Input<ConfigurationAggregatorOrganizationAggregationSourceArgs> organizationAggregationSource) {
            this.organizationAggregationSource = organizationAggregationSource;
            return this;
        }

        public Builder setOrganizationAggregationSource(@Nullable ConfigurationAggregatorOrganizationAggregationSourceArgs organizationAggregationSource) {
            this.organizationAggregationSource = Input.ofNullable(organizationAggregationSource);
            return this;
        }

        public Builder setTags(@Nullable Input<List<ConfigurationAggregatorTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<ConfigurationAggregatorTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public ConfigurationAggregatorArgs build() {
            return new ConfigurationAggregatorArgs(accountAggregationSources, configurationAggregatorName, organizationAggregationSource, tags);
        }
    }
}
