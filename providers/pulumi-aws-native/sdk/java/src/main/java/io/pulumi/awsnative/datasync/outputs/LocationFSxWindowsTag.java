// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LocationFSxWindowsTag {
    /**
     * The key for an AWS resource tag.
     * 
     */
    private final String key;
    /**
     * The value for an AWS resource tag.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"key","value"})
    private LocationFSxWindowsTag(
        String key,
        String value) {
        this.key = Objects.requireNonNull(key);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * The key for an AWS resource tag.
     * 
     */
    public String getKey() {
        return this.key;
    }
    /**
     * The value for an AWS resource tag.
     * 
     */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationFSxWindowsTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationFSxWindowsTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public LocationFSxWindowsTag build() {
            return new LocationFSxWindowsTag(key, value);
        }
    }
}
