// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterS3Import {
    /**
     * The bucket name where your backup is stored
     * 
     */
    private final String bucketName;
    /**
     * Can be blank, but is the path to your backup
     * 
     */
    private final @Nullable String bucketPrefix;
    /**
     * Role applied to load the data.
     * 
     */
    private final String ingestionRole;
    /**
     * Source engine for the backup
     * 
     */
    private final String sourceEngine;
    /**
     * Version of the source engine used to make the backup
     * 
     */
    private final String sourceEngineVersion;

    @OutputCustomType.Constructor({"bucketName","bucketPrefix","ingestionRole","sourceEngine","sourceEngineVersion"})
    private ClusterS3Import(
        String bucketName,
        @Nullable String bucketPrefix,
        String ingestionRole,
        String sourceEngine,
        String sourceEngineVersion) {
        this.bucketName = Objects.requireNonNull(bucketName);
        this.bucketPrefix = bucketPrefix;
        this.ingestionRole = Objects.requireNonNull(ingestionRole);
        this.sourceEngine = Objects.requireNonNull(sourceEngine);
        this.sourceEngineVersion = Objects.requireNonNull(sourceEngineVersion);
    }

    /**
     * The bucket name where your backup is stored
     * 
    */
    public String getBucketName() {
        return this.bucketName;
    }
    /**
     * Can be blank, but is the path to your backup
     * 
    */
    public Optional<String> getBucketPrefix() {
        return Optional.ofNullable(this.bucketPrefix);
    }
    /**
     * Role applied to load the data.
     * 
    */
    public String getIngestionRole() {
        return this.ingestionRole;
    }
    /**
     * Source engine for the backup
     * 
    */
    public String getSourceEngine() {
        return this.sourceEngine;
    }
    /**
     * Version of the source engine used to make the backup
     * 
    */
    public String getSourceEngineVersion() {
        return this.sourceEngineVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterS3Import defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketName;
        private @Nullable String bucketPrefix;
        private String ingestionRole;
        private String sourceEngine;
        private String sourceEngineVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterS3Import defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.ingestionRole = defaults.ingestionRole;
    	      this.sourceEngine = defaults.sourceEngine;
    	      this.sourceEngineVersion = defaults.sourceEngineVersion;
        }

        public Builder setBucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setBucketPrefix(@Nullable String bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }

        public Builder setIngestionRole(String ingestionRole) {
            this.ingestionRole = Objects.requireNonNull(ingestionRole);
            return this;
        }

        public Builder setSourceEngine(String sourceEngine) {
            this.sourceEngine = Objects.requireNonNull(sourceEngine);
            return this;
        }

        public Builder setSourceEngineVersion(String sourceEngineVersion) {
            this.sourceEngineVersion = Objects.requireNonNull(sourceEngineVersion);
            return this;
        }
        public ClusterS3Import build() {
            return new ClusterS3Import(bucketName, bucketPrefix, ingestionRole, sourceEngine, sourceEngineVersion);
        }
    }
}
