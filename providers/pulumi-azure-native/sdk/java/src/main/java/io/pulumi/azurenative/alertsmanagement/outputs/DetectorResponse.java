// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DetectorResponse {
    /**
     * The Smart Detector description. By default this is not populated, unless it's specified in expandDetector
     * 
     */
    private final @Nullable String description;
    /**
     * The detector id.
     * 
     */
    private final String id;
    /**
     * The Smart Detector image path. By default this is not populated, unless it's specified in expandDetector
     * 
     */
    private final @Nullable List<String> imagePaths;
    /**
     * The Smart Detector name. By default this is not populated, unless it's specified in expandDetector
     * 
     */
    private final @Nullable String name;
    /**
     * The detector's parameters.'
     * 
     */
    private final @Nullable Map<String,Object> parameters;
    /**
     * The Smart Detector supported resource types. By default this is not populated, unless it's specified in expandDetector
     * 
     */
    private final @Nullable List<String> supportedResourceTypes;

    @OutputCustomType.Constructor({"description","id","imagePaths","name","parameters","supportedResourceTypes"})
    private DetectorResponse(
        @Nullable String description,
        String id,
        @Nullable List<String> imagePaths,
        @Nullable String name,
        @Nullable Map<String,Object> parameters,
        @Nullable List<String> supportedResourceTypes) {
        this.description = description;
        this.id = Objects.requireNonNull(id);
        this.imagePaths = imagePaths;
        this.name = name;
        this.parameters = parameters;
        this.supportedResourceTypes = supportedResourceTypes;
    }

    /**
     * The Smart Detector description. By default this is not populated, unless it's specified in expandDetector
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The detector id.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The Smart Detector image path. By default this is not populated, unless it's specified in expandDetector
     * 
    */
    public List<String> getImagePaths() {
        return this.imagePaths == null ? List.of() : this.imagePaths;
    }
    /**
     * The Smart Detector name. By default this is not populated, unless it's specified in expandDetector
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The detector's parameters.'
     * 
    */
    public Map<String,Object> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * The Smart Detector supported resource types. By default this is not populated, unless it's specified in expandDetector
     * 
    */
    public List<String> getSupportedResourceTypes() {
        return this.supportedResourceTypes == null ? List.of() : this.supportedResourceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String id;
        private @Nullable List<String> imagePaths;
        private @Nullable String name;
        private @Nullable Map<String,Object> parameters;
        private @Nullable List<String> supportedResourceTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.imagePaths = defaults.imagePaths;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.supportedResourceTypes = defaults.supportedResourceTypes;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setImagePaths(@Nullable List<String> imagePaths) {
            this.imagePaths = imagePaths;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,Object> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setSupportedResourceTypes(@Nullable List<String> supportedResourceTypes) {
            this.supportedResourceTypes = supportedResourceTypes;
            return this;
        }
        public DetectorResponse build() {
            return new DetectorResponse(description, id, imagePaths, name, parameters, supportedResourceTypes);
        }
    }
}
