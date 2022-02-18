// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.diagflow.inputs.FulfillmentFeatureGetArgs;
import io.pulumi.gcp.diagflow.inputs.FulfillmentGenericWebServiceGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FulfillmentState extends io.pulumi.resources.ResourceArgs {

    public static final FulfillmentState Empty = new FulfillmentState();

    /**
     * The human-readable name of the fulfillment, unique within the agent.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Whether fulfillment is enabled.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * The field defines whether the fulfillment is enabled for certain features.
     * Structure is documented below.
     * 
     */
    @InputImport(name="features")
    private final @Nullable Input<List<FulfillmentFeatureGetArgs>> features;

    public Input<List<FulfillmentFeatureGetArgs>> getFeatures() {
        return this.features == null ? Input.empty() : this.features;
    }

    /**
     * Represents configuration for a generic web service. Dialogflow supports two mechanisms for authentications: - Basic authentication with username and password. - Authentication with additional authentication headers.
     * Structure is documented below.
     * 
     */
    @InputImport(name="genericWebService")
    private final @Nullable Input<FulfillmentGenericWebServiceGetArgs> genericWebService;

    public Input<FulfillmentGenericWebServiceGetArgs> getGenericWebService() {
        return this.genericWebService == null ? Input.empty() : this.genericWebService;
    }

    /**
     * The unique identifier of the fulfillment. Format: projects/<Project ID>/agent/fulfillment - projects/<Project
     * ID>/locations/<Location ID>/agent/fulfillment
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public FulfillmentState(
        @Nullable Input<String> displayName,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<List<FulfillmentFeatureGetArgs>> features,
        @Nullable Input<FulfillmentGenericWebServiceGetArgs> genericWebService,
        @Nullable Input<String> name,
        @Nullable Input<String> project) {
        this.displayName = displayName;
        this.enabled = enabled;
        this.features = features;
        this.genericWebService = genericWebService;
        this.name = name;
        this.project = project;
    }

    private FulfillmentState() {
        this.displayName = Input.empty();
        this.enabled = Input.empty();
        this.features = Input.empty();
        this.genericWebService = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FulfillmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> displayName;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<List<FulfillmentFeatureGetArgs>> features;
        private @Nullable Input<FulfillmentGenericWebServiceGetArgs> genericWebService;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(FulfillmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.enabled = defaults.enabled;
    	      this.features = defaults.features;
    	      this.genericWebService = defaults.genericWebService;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setFeatures(@Nullable Input<List<FulfillmentFeatureGetArgs>> features) {
            this.features = features;
            return this;
        }

        public Builder setFeatures(@Nullable List<FulfillmentFeatureGetArgs> features) {
            this.features = Input.ofNullable(features);
            return this;
        }

        public Builder setGenericWebService(@Nullable Input<FulfillmentGenericWebServiceGetArgs> genericWebService) {
            this.genericWebService = genericWebService;
            return this;
        }

        public Builder setGenericWebService(@Nullable FulfillmentGenericWebServiceGetArgs genericWebService) {
            this.genericWebService = Input.ofNullable(genericWebService);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public FulfillmentState build() {
            return new FulfillmentState(displayName, enabled, features, genericWebService, name, project);
        }
    }
}