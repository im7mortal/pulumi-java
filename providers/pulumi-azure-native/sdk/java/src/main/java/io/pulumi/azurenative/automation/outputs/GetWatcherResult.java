// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWatcherResult {
    /**
     * Gets or sets the creation time.
     * 
     */
    private final String creationTime;
    /**
     * Gets or sets the description.
     * 
     */
    private final @Nullable String description;
    /**
     * Gets or sets the etag of the resource.
     * 
     */
    private final @Nullable String etag;
    /**
     * Gets or sets the frequency at which the watcher is invoked.
     * 
     */
    private final @Nullable Double executionFrequencyInSeconds;
    /**
     * Fully qualified resource Id for the resource
     * 
     */
    private final String id;
    /**
     * Details of the user who last modified the watcher.
     * 
     */
    private final String lastModifiedBy;
    /**
     * Gets or sets the last modified time.
     * 
     */
    private final String lastModifiedTime;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Gets or sets the name of the script the watcher is attached to, i.e. the name of an existing runbook.
     * 
     */
    private final @Nullable String scriptName;
    /**
     * Gets or sets the parameters of the script.
     * 
     */
    private final @Nullable Map<String,String> scriptParameters;
    /**
     * Gets or sets the name of the hybrid worker group the watcher will run on.
     * 
     */
    private final @Nullable String scriptRunOn;
    /**
     * Gets the current status of the watcher.
     * 
     */
    private final String status;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"creationTime","description","etag","executionFrequencyInSeconds","id","lastModifiedBy","lastModifiedTime","location","name","scriptName","scriptParameters","scriptRunOn","status","tags","type"})
    private GetWatcherResult(
        String creationTime,
        @Nullable String description,
        @Nullable String etag,
        @Nullable Double executionFrequencyInSeconds,
        String id,
        String lastModifiedBy,
        String lastModifiedTime,
        @Nullable String location,
        String name,
        @Nullable String scriptName,
        @Nullable Map<String,String> scriptParameters,
        @Nullable String scriptRunOn,
        String status,
        @Nullable Map<String,String> tags,
        String type) {
        this.creationTime = Objects.requireNonNull(creationTime);
        this.description = description;
        this.etag = etag;
        this.executionFrequencyInSeconds = executionFrequencyInSeconds;
        this.id = Objects.requireNonNull(id);
        this.lastModifiedBy = Objects.requireNonNull(lastModifiedBy);
        this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.scriptName = scriptName;
        this.scriptParameters = scriptParameters;
        this.scriptRunOn = scriptRunOn;
        this.status = Objects.requireNonNull(status);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Gets or sets the creation time.
     * 
    */
    public String getCreationTime() {
        return this.creationTime;
    }
    /**
     * Gets or sets the description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Gets or sets the etag of the resource.
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Gets or sets the frequency at which the watcher is invoked.
     * 
    */
    public Optional<Double> getExecutionFrequencyInSeconds() {
        return Optional.ofNullable(this.executionFrequencyInSeconds);
    }
    /**
     * Fully qualified resource Id for the resource
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Details of the user who last modified the watcher.
     * 
    */
    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets or sets the last modified time.
     * 
    */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * The geo-location where the resource lives
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Gets or sets the name of the script the watcher is attached to, i.e. the name of an existing runbook.
     * 
    */
    public Optional<String> getScriptName() {
        return Optional.ofNullable(this.scriptName);
    }
    /**
     * Gets or sets the parameters of the script.
     * 
    */
    public Map<String,String> getScriptParameters() {
        return this.scriptParameters == null ? Map.of() : this.scriptParameters;
    }
    /**
     * Gets or sets the name of the hybrid worker group the watcher will run on.
     * 
    */
    public Optional<String> getScriptRunOn() {
        return Optional.ofNullable(this.scriptRunOn);
    }
    /**
     * Gets the current status of the watcher.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWatcherResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTime;
        private @Nullable String description;
        private @Nullable String etag;
        private @Nullable Double executionFrequencyInSeconds;
        private String id;
        private String lastModifiedBy;
        private String lastModifiedTime;
        private @Nullable String location;
        private String name;
        private @Nullable String scriptName;
        private @Nullable Map<String,String> scriptParameters;
        private @Nullable String scriptRunOn;
        private String status;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWatcherResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.executionFrequencyInSeconds = defaults.executionFrequencyInSeconds;
    	      this.id = defaults.id;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.scriptName = defaults.scriptName;
    	      this.scriptParameters = defaults.scriptParameters;
    	      this.scriptRunOn = defaults.scriptRunOn;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setCreationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setExecutionFrequencyInSeconds(@Nullable Double executionFrequencyInSeconds) {
            this.executionFrequencyInSeconds = executionFrequencyInSeconds;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastModifiedBy(String lastModifiedBy) {
            this.lastModifiedBy = Objects.requireNonNull(lastModifiedBy);
            return this;
        }

        public Builder setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setScriptName(@Nullable String scriptName) {
            this.scriptName = scriptName;
            return this;
        }

        public Builder setScriptParameters(@Nullable Map<String,String> scriptParameters) {
            this.scriptParameters = scriptParameters;
            return this;
        }

        public Builder setScriptRunOn(@Nullable String scriptRunOn) {
            this.scriptRunOn = scriptRunOn;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetWatcherResult build() {
            return new GetWatcherResult(creationTime, description, etag, executionFrequencyInSeconds, id, lastModifiedBy, lastModifiedTime, location, name, scriptName, scriptParameters, scriptRunOn, status, tags, type);
        }
    }
}
