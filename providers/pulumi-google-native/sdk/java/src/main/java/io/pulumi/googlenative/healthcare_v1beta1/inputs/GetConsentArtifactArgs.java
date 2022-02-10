// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConsentArtifactArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetConsentArtifactArgs Empty = new GetConsentArtifactArgs();

    @InputImport(name="consentArtifactId", required=true)
    private final String consentArtifactId;

    public String getConsentArtifactId() {
        return this.consentArtifactId;
    }

    @InputImport(name="consentStoreId", required=true)
    private final String consentStoreId;

    public String getConsentStoreId() {
        return this.consentStoreId;
    }

    @InputImport(name="datasetId", required=true)
    private final String datasetId;

    public String getDatasetId() {
        return this.datasetId;
    }

    @InputImport(name="location", required=true)
    private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetConsentArtifactArgs(
        String consentArtifactId,
        String consentStoreId,
        String datasetId,
        String location,
        @Nullable String project) {
        this.consentArtifactId = Objects.requireNonNull(consentArtifactId, "expected parameter 'consentArtifactId' to be non-null");
        this.consentStoreId = Objects.requireNonNull(consentStoreId, "expected parameter 'consentStoreId' to be non-null");
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetConsentArtifactArgs() {
        this.consentArtifactId = null;
        this.consentStoreId = null;
        this.datasetId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConsentArtifactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String consentArtifactId;
        private String consentStoreId;
        private String datasetId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConsentArtifactArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consentArtifactId = defaults.consentArtifactId;
    	      this.consentStoreId = defaults.consentStoreId;
    	      this.datasetId = defaults.datasetId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder setConsentArtifactId(String consentArtifactId) {
            this.consentArtifactId = Objects.requireNonNull(consentArtifactId);
            return this;
        }

        public Builder setConsentStoreId(String consentStoreId) {
            this.consentStoreId = Objects.requireNonNull(consentStoreId);
            return this;
        }

        public Builder setDatasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public GetConsentArtifactArgs build() {
            return new GetConsentArtifactArgs(consentArtifactId, consentStoreId, datasetId, location, project);
        }
    }
}