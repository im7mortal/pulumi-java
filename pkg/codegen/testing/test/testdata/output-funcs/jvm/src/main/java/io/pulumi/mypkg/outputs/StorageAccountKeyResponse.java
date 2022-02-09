// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.mypkg.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class StorageAccountKeyResponse {
    private final String creationTime;
    private final String keyName;
    private final String permissions;
    private final String value;

    @OutputCustomType.Constructor({"creationTime","keyName","permissions","value"})
    private StorageAccountKeyResponse(
        String creationTime,
        String keyName,
        String permissions,
        String value) {
        this.creationTime = Objects.requireNonNull(creationTime);
        this.keyName = Objects.requireNonNull(keyName);
        this.permissions = Objects.requireNonNull(permissions);
        this.value = Objects.requireNonNull(value);
    }

    public String getCreationTime() {
        return this.creationTime;
    }
    public String getKeyName() {
        return this.keyName;
    }
    public String getPermissions() {
        return this.permissions;
    }
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTime;
        private String keyName;
        private String permissions;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.keyName = defaults.keyName;
    	      this.permissions = defaults.permissions;
    	      this.value = defaults.value;
        }

        public Builder setCreationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }

        public Builder setKeyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }

        public Builder setPermissions(String permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public StorageAccountKeyResponse build() {
            return new StorageAccountKeyResponse(creationTime, keyName, permissions, value);
        }
    }
}
