// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ListTopicKeysResult {
    /**
     * Primary connection string of the alias if GEO DR is enabled
     * 
     */
    private final String aliasPrimaryConnectionString;
    /**
     * Secondary  connection string of the alias if GEO DR is enabled
     * 
     */
    private final String aliasSecondaryConnectionString;
    /**
     * A string that describes the authorization rule.
     * 
     */
    private final String keyName;
    /**
     * Primary connection string of the created namespace authorization rule.
     * 
     */
    private final String primaryConnectionString;
    /**
     * A base64-encoded 256-bit primary key for signing and validating the SAS token.
     * 
     */
    private final String primaryKey;
    /**
     * Secondary connection string of the created namespace authorization rule.
     * 
     */
    private final String secondaryConnectionString;
    /**
     * A base64-encoded 256-bit primary key for signing and validating the SAS token.
     * 
     */
    private final String secondaryKey;

    @OutputCustomType.Constructor({"aliasPrimaryConnectionString","aliasSecondaryConnectionString","keyName","primaryConnectionString","primaryKey","secondaryConnectionString","secondaryKey"})
    private ListTopicKeysResult(
        String aliasPrimaryConnectionString,
        String aliasSecondaryConnectionString,
        String keyName,
        String primaryConnectionString,
        String primaryKey,
        String secondaryConnectionString,
        String secondaryKey) {
        this.aliasPrimaryConnectionString = Objects.requireNonNull(aliasPrimaryConnectionString);
        this.aliasSecondaryConnectionString = Objects.requireNonNull(aliasSecondaryConnectionString);
        this.keyName = Objects.requireNonNull(keyName);
        this.primaryConnectionString = Objects.requireNonNull(primaryConnectionString);
        this.primaryKey = Objects.requireNonNull(primaryKey);
        this.secondaryConnectionString = Objects.requireNonNull(secondaryConnectionString);
        this.secondaryKey = Objects.requireNonNull(secondaryKey);
    }

    /**
     * Primary connection string of the alias if GEO DR is enabled
     * 
    */
    public String getAliasPrimaryConnectionString() {
        return this.aliasPrimaryConnectionString;
    }
    /**
     * Secondary  connection string of the alias if GEO DR is enabled
     * 
    */
    public String getAliasSecondaryConnectionString() {
        return this.aliasSecondaryConnectionString;
    }
    /**
     * A string that describes the authorization rule.
     * 
    */
    public String getKeyName() {
        return this.keyName;
    }
    /**
     * Primary connection string of the created namespace authorization rule.
     * 
    */
    public String getPrimaryConnectionString() {
        return this.primaryConnectionString;
    }
    /**
     * A base64-encoded 256-bit primary key for signing and validating the SAS token.
     * 
    */
    public String getPrimaryKey() {
        return this.primaryKey;
    }
    /**
     * Secondary connection string of the created namespace authorization rule.
     * 
    */
    public String getSecondaryConnectionString() {
        return this.secondaryConnectionString;
    }
    /**
     * A base64-encoded 256-bit primary key for signing and validating the SAS token.
     * 
    */
    public String getSecondaryKey() {
        return this.secondaryKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListTopicKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String aliasPrimaryConnectionString;
        private String aliasSecondaryConnectionString;
        private String keyName;
        private String primaryConnectionString;
        private String primaryKey;
        private String secondaryConnectionString;
        private String secondaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ListTopicKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliasPrimaryConnectionString = defaults.aliasPrimaryConnectionString;
    	      this.aliasSecondaryConnectionString = defaults.aliasSecondaryConnectionString;
    	      this.keyName = defaults.keyName;
    	      this.primaryConnectionString = defaults.primaryConnectionString;
    	      this.primaryKey = defaults.primaryKey;
    	      this.secondaryConnectionString = defaults.secondaryConnectionString;
    	      this.secondaryKey = defaults.secondaryKey;
        }

        public Builder setAliasPrimaryConnectionString(String aliasPrimaryConnectionString) {
            this.aliasPrimaryConnectionString = Objects.requireNonNull(aliasPrimaryConnectionString);
            return this;
        }

        public Builder setAliasSecondaryConnectionString(String aliasSecondaryConnectionString) {
            this.aliasSecondaryConnectionString = Objects.requireNonNull(aliasSecondaryConnectionString);
            return this;
        }

        public Builder setKeyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }

        public Builder setPrimaryConnectionString(String primaryConnectionString) {
            this.primaryConnectionString = Objects.requireNonNull(primaryConnectionString);
            return this;
        }

        public Builder setPrimaryKey(String primaryKey) {
            this.primaryKey = Objects.requireNonNull(primaryKey);
            return this;
        }

        public Builder setSecondaryConnectionString(String secondaryConnectionString) {
            this.secondaryConnectionString = Objects.requireNonNull(secondaryConnectionString);
            return this;
        }

        public Builder setSecondaryKey(String secondaryKey) {
            this.secondaryKey = Objects.requireNonNull(secondaryKey);
            return this;
        }
        public ListTopicKeysResult build() {
            return new ListTopicKeysResult(aliasPrimaryConnectionString, aliasSecondaryConnectionString, keyName, primaryConnectionString, primaryKey, secondaryConnectionString, secondaryKey);
        }
    }
}
