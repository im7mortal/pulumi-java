// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.communication.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListCommunicationServiceKeysResult {
    /**
     * CommunicationService connection string constructed via the primaryKey
     * 
     */
    private final @Nullable String primaryConnectionString;
    /**
     * The primary access key.
     * 
     */
    private final @Nullable String primaryKey;
    /**
     * CommunicationService connection string constructed via the secondaryKey
     * 
     */
    private final @Nullable String secondaryConnectionString;
    /**
     * The secondary access key.
     * 
     */
    private final @Nullable String secondaryKey;

    @OutputCustomType.Constructor({"primaryConnectionString","primaryKey","secondaryConnectionString","secondaryKey"})
    private ListCommunicationServiceKeysResult(
        @Nullable String primaryConnectionString,
        @Nullable String primaryKey,
        @Nullable String secondaryConnectionString,
        @Nullable String secondaryKey) {
        this.primaryConnectionString = primaryConnectionString;
        this.primaryKey = primaryKey;
        this.secondaryConnectionString = secondaryConnectionString;
        this.secondaryKey = secondaryKey;
    }

    /**
     * CommunicationService connection string constructed via the primaryKey
     * 
    */
    public Optional<String> getPrimaryConnectionString() {
        return Optional.ofNullable(this.primaryConnectionString);
    }
    /**
     * The primary access key.
     * 
    */
    public Optional<String> getPrimaryKey() {
        return Optional.ofNullable(this.primaryKey);
    }
    /**
     * CommunicationService connection string constructed via the secondaryKey
     * 
    */
    public Optional<String> getSecondaryConnectionString() {
        return Optional.ofNullable(this.secondaryConnectionString);
    }
    /**
     * The secondary access key.
     * 
    */
    public Optional<String> getSecondaryKey() {
        return Optional.ofNullable(this.secondaryKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListCommunicationServiceKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String primaryConnectionString;
        private @Nullable String primaryKey;
        private @Nullable String secondaryConnectionString;
        private @Nullable String secondaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ListCommunicationServiceKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primaryConnectionString = defaults.primaryConnectionString;
    	      this.primaryKey = defaults.primaryKey;
    	      this.secondaryConnectionString = defaults.secondaryConnectionString;
    	      this.secondaryKey = defaults.secondaryKey;
        }

        public Builder setPrimaryConnectionString(@Nullable String primaryConnectionString) {
            this.primaryConnectionString = primaryConnectionString;
            return this;
        }

        public Builder setPrimaryKey(@Nullable String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }

        public Builder setSecondaryConnectionString(@Nullable String secondaryConnectionString) {
            this.secondaryConnectionString = secondaryConnectionString;
            return this;
        }

        public Builder setSecondaryKey(@Nullable String secondaryKey) {
            this.secondaryKey = secondaryKey;
            return this;
        }
        public ListCommunicationServiceKeysResult build() {
            return new ListCommunicationServiceKeysResult(primaryConnectionString, primaryKey, secondaryConnectionString, secondaryKey);
        }
    }
}
