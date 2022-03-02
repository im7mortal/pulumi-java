// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetBotAliasResult {
    /**
     * The ARN of the bot alias.
     * 
     */
    private final String arn;
    /**
     * The name of the bot.
     * 
     */
    private final String botName;
    /**
     * The version of the bot that the alias points to.
     * 
     */
    private final String botVersion;
    /**
     * Checksum of the bot alias.
     * 
     */
    private final String checksum;
    /**
     * The date that the bot alias was created.
     * 
     */
    private final String createdDate;
    /**
     * A description of the alias.
     * 
     */
    private final String description;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The date that the bot alias was updated. When you create a resource, the creation date and the last updated date are the same.
     * 
     */
    private final String lastUpdatedDate;
    /**
     * The name of the alias. The name is not case sensitive.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"arn","botName","botVersion","checksum","createdDate","description","id","lastUpdatedDate","name"})
    private GetBotAliasResult(
        String arn,
        String botName,
        String botVersion,
        String checksum,
        String createdDate,
        String description,
        String id,
        String lastUpdatedDate,
        String name) {
        this.arn = Objects.requireNonNull(arn);
        this.botName = Objects.requireNonNull(botName);
        this.botVersion = Objects.requireNonNull(botVersion);
        this.checksum = Objects.requireNonNull(checksum);
        this.createdDate = Objects.requireNonNull(createdDate);
        this.description = Objects.requireNonNull(description);
        this.id = Objects.requireNonNull(id);
        this.lastUpdatedDate = Objects.requireNonNull(lastUpdatedDate);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * The ARN of the bot alias.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The name of the bot.
     * 
    */
    public String getBotName() {
        return this.botName;
    }
    /**
     * The version of the bot that the alias points to.
     * 
    */
    public String getBotVersion() {
        return this.botVersion;
    }
    /**
     * Checksum of the bot alias.
     * 
    */
    public String getChecksum() {
        return this.checksum;
    }
    /**
     * The date that the bot alias was created.
     * 
    */
    public String getCreatedDate() {
        return this.createdDate;
    }
    /**
     * A description of the alias.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The date that the bot alias was updated. When you create a resource, the creation date and the last updated date are the same.
     * 
    */
    public String getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }
    /**
     * The name of the alias. The name is not case sensitive.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBotAliasResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String botName;
        private String botVersion;
        private String checksum;
        private String createdDate;
        private String description;
        private String id;
        private String lastUpdatedDate;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBotAliasResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.botName = defaults.botName;
    	      this.botVersion = defaults.botVersion;
    	      this.checksum = defaults.checksum;
    	      this.createdDate = defaults.createdDate;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.lastUpdatedDate = defaults.lastUpdatedDate;
    	      this.name = defaults.name;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setBotName(String botName) {
            this.botName = Objects.requireNonNull(botName);
            return this;
        }

        public Builder setBotVersion(String botVersion) {
            this.botVersion = Objects.requireNonNull(botVersion);
            return this;
        }

        public Builder setChecksum(String checksum) {
            this.checksum = Objects.requireNonNull(checksum);
            return this;
        }

        public Builder setCreatedDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastUpdatedDate(String lastUpdatedDate) {
            this.lastUpdatedDate = Objects.requireNonNull(lastUpdatedDate);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetBotAliasResult build() {
            return new GetBotAliasResult(arn, botName, botVersion, checksum, createdDate, description, id, lastUpdatedDate, name);
        }
    }
}
