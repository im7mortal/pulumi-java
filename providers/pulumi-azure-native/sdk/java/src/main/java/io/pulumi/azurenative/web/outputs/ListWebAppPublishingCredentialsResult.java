// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListWebAppPublishingCredentialsResult {
    private final String id;
    private final @Nullable String kind;
    private final String name;
    private final @Nullable String publishingPassword;
    private final @Nullable String publishingPasswordHash;
    private final @Nullable String publishingPasswordHashSalt;
    private final String publishingUserName;
    private final @Nullable String scmUri;
    private final String type;

    @OutputCustomType.Constructor({"id","kind","name","publishingPassword","publishingPasswordHash","publishingPasswordHashSalt","publishingUserName","scmUri","type"})
    private ListWebAppPublishingCredentialsResult(
        String id,
        @Nullable String kind,
        String name,
        @Nullable String publishingPassword,
        @Nullable String publishingPasswordHash,
        @Nullable String publishingPasswordHashSalt,
        String publishingUserName,
        @Nullable String scmUri,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.kind = kind;
        this.name = Objects.requireNonNull(name);
        this.publishingPassword = publishingPassword;
        this.publishingPasswordHash = publishingPasswordHash;
        this.publishingPasswordHashSalt = publishingPasswordHashSalt;
        this.publishingUserName = Objects.requireNonNull(publishingUserName);
        this.scmUri = scmUri;
        this.type = Objects.requireNonNull(type);
    }

    public String getId() {
        return this.id;
    }
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getPublishingPassword() {
        return Optional.ofNullable(this.publishingPassword);
    }
    public Optional<String> getPublishingPasswordHash() {
        return Optional.ofNullable(this.publishingPasswordHash);
    }
    public Optional<String> getPublishingPasswordHashSalt() {
        return Optional.ofNullable(this.publishingPasswordHashSalt);
    }
    public String getPublishingUserName() {
        return this.publishingUserName;
    }
    public Optional<String> getScmUri() {
        return Optional.ofNullable(this.scmUri);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWebAppPublishingCredentialsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String kind;
        private String name;
        private @Nullable String publishingPassword;
        private @Nullable String publishingPasswordHash;
        private @Nullable String publishingPasswordHashSalt;
        private String publishingUserName;
        private @Nullable String scmUri;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ListWebAppPublishingCredentialsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.publishingPassword = defaults.publishingPassword;
    	      this.publishingPasswordHash = defaults.publishingPasswordHash;
    	      this.publishingPasswordHashSalt = defaults.publishingPasswordHashSalt;
    	      this.publishingUserName = defaults.publishingUserName;
    	      this.scmUri = defaults.scmUri;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPublishingPassword(@Nullable String publishingPassword) {
            this.publishingPassword = publishingPassword;
            return this;
        }

        public Builder setPublishingPasswordHash(@Nullable String publishingPasswordHash) {
            this.publishingPasswordHash = publishingPasswordHash;
            return this;
        }

        public Builder setPublishingPasswordHashSalt(@Nullable String publishingPasswordHashSalt) {
            this.publishingPasswordHashSalt = publishingPasswordHashSalt;
            return this;
        }

        public Builder setPublishingUserName(String publishingUserName) {
            this.publishingUserName = Objects.requireNonNull(publishingUserName);
            return this;
        }

        public Builder setScmUri(@Nullable String scmUri) {
            this.scmUri = scmUri;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public ListWebAppPublishingCredentialsResult build() {
            return new ListWebAppPublishingCredentialsResult(id, kind, name, publishingPassword, publishingPasswordHash, publishingPasswordHashSalt, publishingUserName, scmUri, type);
        }
    }
}