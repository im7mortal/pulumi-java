// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConsentStoreArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConsentStoreArgs Empty = new ConsentStoreArgs();

    @InputImport(name="consentStoreId", required=true)
    private final Input<String> consentStoreId;

    public Input<String> getConsentStoreId() {
        return this.consentStoreId;
    }

    @InputImport(name="datasetId", required=true)
    private final Input<String> datasetId;

    public Input<String> getDatasetId() {
        return this.datasetId;
    }

    @InputImport(name="defaultConsentTtl")
    private final @Nullable Input<String> defaultConsentTtl;

    public Input<String> getDefaultConsentTtl() {
        return this.defaultConsentTtl == null ? Input.empty() : this.defaultConsentTtl;
    }

    @InputImport(name="enableConsentCreateOnUpdate")
    private final @Nullable Input<Boolean> enableConsentCreateOnUpdate;

    public Input<Boolean> getEnableConsentCreateOnUpdate() {
        return this.enableConsentCreateOnUpdate == null ? Input.empty() : this.enableConsentCreateOnUpdate;
    }

    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public ConsentStoreArgs(
        Input<String> consentStoreId,
        Input<String> datasetId,
        @Nullable Input<String> defaultConsentTtl,
        @Nullable Input<Boolean> enableConsentCreateOnUpdate,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project) {
        this.consentStoreId = Objects.requireNonNull(consentStoreId, "expected parameter 'consentStoreId' to be non-null");
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.defaultConsentTtl = defaultConsentTtl;
        this.enableConsentCreateOnUpdate = enableConsentCreateOnUpdate;
        this.labels = labels;
        this.location = location;
        this.name = name;
        this.project = project;
    }

    private ConsentStoreArgs() {
        this.consentStoreId = Input.empty();
        this.datasetId = Input.empty();
        this.defaultConsentTtl = Input.empty();
        this.enableConsentCreateOnUpdate = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsentStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> consentStoreId;
        private Input<String> datasetId;
        private @Nullable Input<String> defaultConsentTtl;
        private @Nullable Input<Boolean> enableConsentCreateOnUpdate;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsentStoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consentStoreId = defaults.consentStoreId;
    	      this.datasetId = defaults.datasetId;
    	      this.defaultConsentTtl = defaults.defaultConsentTtl;
    	      this.enableConsentCreateOnUpdate = defaults.enableConsentCreateOnUpdate;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder setConsentStoreId(Input<String> consentStoreId) {
            this.consentStoreId = Objects.requireNonNull(consentStoreId);
            return this;
        }

        public Builder setConsentStoreId(String consentStoreId) {
            this.consentStoreId = Input.of(Objects.requireNonNull(consentStoreId));
            return this;
        }

        public Builder setDatasetId(Input<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder setDatasetId(String datasetId) {
            this.datasetId = Input.of(Objects.requireNonNull(datasetId));
            return this;
        }

        public Builder setDefaultConsentTtl(@Nullable Input<String> defaultConsentTtl) {
            this.defaultConsentTtl = defaultConsentTtl;
            return this;
        }

        public Builder setDefaultConsentTtl(@Nullable String defaultConsentTtl) {
            this.defaultConsentTtl = Input.ofNullable(defaultConsentTtl);
            return this;
        }

        public Builder setEnableConsentCreateOnUpdate(@Nullable Input<Boolean> enableConsentCreateOnUpdate) {
            this.enableConsentCreateOnUpdate = enableConsentCreateOnUpdate;
            return this;
        }

        public Builder setEnableConsentCreateOnUpdate(@Nullable Boolean enableConsentCreateOnUpdate) {
            this.enableConsentCreateOnUpdate = Input.ofNullable(enableConsentCreateOnUpdate);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public ConsentStoreArgs build() {
            return new ConsentStoreArgs(consentStoreId, datasetId, defaultConsentTtl, enableConsentCreateOnUpdate, labels, location, name, project);
        }
    }
}