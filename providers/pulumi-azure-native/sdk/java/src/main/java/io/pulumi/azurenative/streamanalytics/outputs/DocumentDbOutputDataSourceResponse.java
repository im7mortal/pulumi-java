// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DocumentDbOutputDataSourceResponse {
    /**
     * The DocumentDB account name or ID. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String accountId;
    /**
     * The account key for the DocumentDB account. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String accountKey;
    /**
     * The collection name pattern for the collections to be used. The collection name format can be constructed using the optional {partition} token, where partitions start from 0. See the DocumentDB section of https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output for more information. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String collectionNamePattern;
    /**
     * The name of the DocumentDB database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String database;
    /**
     * The name of the field in output events used to specify the primary key which insert or update operations are based on.
     * 
     */
    private final @Nullable String documentId;
    /**
     * The name of the field in output events used to specify the key for partitioning output across collections. If 'collectionNamePattern' contains the {partition} token, this property is required to be specified.
     * 
     */
    private final @Nullable String partitionKey;
    /**
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.Storage/DocumentDB'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"accountId","accountKey","collectionNamePattern","database","documentId","partitionKey","type"})
    private DocumentDbOutputDataSourceResponse(
        @Nullable String accountId,
        @Nullable String accountKey,
        @Nullable String collectionNamePattern,
        @Nullable String database,
        @Nullable String documentId,
        @Nullable String partitionKey,
        String type) {
        this.accountId = accountId;
        this.accountKey = accountKey;
        this.collectionNamePattern = collectionNamePattern;
        this.database = database;
        this.documentId = documentId;
        this.partitionKey = partitionKey;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The DocumentDB account name or ID. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> getAccountId() {
        return Optional.ofNullable(this.accountId);
    }
    /**
     * The account key for the DocumentDB account. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> getAccountKey() {
        return Optional.ofNullable(this.accountKey);
    }
    /**
     * The collection name pattern for the collections to be used. The collection name format can be constructed using the optional {partition} token, where partitions start from 0. See the DocumentDB section of https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output for more information. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> getCollectionNamePattern() {
        return Optional.ofNullable(this.collectionNamePattern);
    }
    /**
     * The name of the DocumentDB database. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> getDatabase() {
        return Optional.ofNullable(this.database);
    }
    /**
     * The name of the field in output events used to specify the primary key which insert or update operations are based on.
     * 
    */
    public Optional<String> getDocumentId() {
        return Optional.ofNullable(this.documentId);
    }
    /**
     * The name of the field in output events used to specify the key for partitioning output across collections. If 'collectionNamePattern' contains the {partition} token, this property is required to be specified.
     * 
    */
    public Optional<String> getPartitionKey() {
        return Optional.ofNullable(this.partitionKey);
    }
    /**
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.Storage/DocumentDB'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentDbOutputDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accountId;
        private @Nullable String accountKey;
        private @Nullable String collectionNamePattern;
        private @Nullable String database;
        private @Nullable String documentId;
        private @Nullable String partitionKey;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentDbOutputDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.accountKey = defaults.accountKey;
    	      this.collectionNamePattern = defaults.collectionNamePattern;
    	      this.database = defaults.database;
    	      this.documentId = defaults.documentId;
    	      this.partitionKey = defaults.partitionKey;
    	      this.type = defaults.type;
        }

        public Builder setAccountId(@Nullable String accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder setAccountKey(@Nullable String accountKey) {
            this.accountKey = accountKey;
            return this;
        }

        public Builder setCollectionNamePattern(@Nullable String collectionNamePattern) {
            this.collectionNamePattern = collectionNamePattern;
            return this;
        }

        public Builder setDatabase(@Nullable String database) {
            this.database = database;
            return this;
        }

        public Builder setDocumentId(@Nullable String documentId) {
            this.documentId = documentId;
            return this;
        }

        public Builder setPartitionKey(@Nullable String partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public DocumentDbOutputDataSourceResponse build() {
            return new DocumentDbOutputDataSourceResponse(accountId, accountKey, collectionNamePattern, database, documentId, partitionKey, type);
        }
    }
}
