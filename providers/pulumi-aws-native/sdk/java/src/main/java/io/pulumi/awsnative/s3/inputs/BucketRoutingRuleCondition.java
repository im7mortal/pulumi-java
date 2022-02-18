// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A container for describing a condition that must be met for the specified redirect to apply.You must specify at least one of HttpErrorCodeReturnedEquals and KeyPrefixEquals
 * 
 */
public final class BucketRoutingRuleCondition extends io.pulumi.resources.InvokeArgs {

    public static final BucketRoutingRuleCondition Empty = new BucketRoutingRuleCondition();

    /**
     * The HTTP error code when the redirect is applied.
     * 
     */
    @InputImport(name="httpErrorCodeReturnedEquals")
    private final @Nullable String httpErrorCodeReturnedEquals;

    public Optional<String> getHttpErrorCodeReturnedEquals() {
        return this.httpErrorCodeReturnedEquals == null ? Optional.empty() : Optional.ofNullable(this.httpErrorCodeReturnedEquals);
    }

    /**
     * The object key name prefix when the redirect is applied.
     * 
     */
    @InputImport(name="keyPrefixEquals")
    private final @Nullable String keyPrefixEquals;

    public Optional<String> getKeyPrefixEquals() {
        return this.keyPrefixEquals == null ? Optional.empty() : Optional.ofNullable(this.keyPrefixEquals);
    }

    public BucketRoutingRuleCondition(
        @Nullable String httpErrorCodeReturnedEquals,
        @Nullable String keyPrefixEquals) {
        this.httpErrorCodeReturnedEquals = httpErrorCodeReturnedEquals;
        this.keyPrefixEquals = keyPrefixEquals;
    }

    private BucketRoutingRuleCondition() {
        this.httpErrorCodeReturnedEquals = null;
        this.keyPrefixEquals = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketRoutingRuleCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String httpErrorCodeReturnedEquals;
        private @Nullable String keyPrefixEquals;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketRoutingRuleCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpErrorCodeReturnedEquals = defaults.httpErrorCodeReturnedEquals;
    	      this.keyPrefixEquals = defaults.keyPrefixEquals;
        }

        public Builder setHttpErrorCodeReturnedEquals(@Nullable String httpErrorCodeReturnedEquals) {
            this.httpErrorCodeReturnedEquals = httpErrorCodeReturnedEquals;
            return this;
        }

        public Builder setKeyPrefixEquals(@Nullable String keyPrefixEquals) {
            this.keyPrefixEquals = keyPrefixEquals;
            return this;
        }

        public BucketRoutingRuleCondition build() {
            return new BucketRoutingRuleCondition(httpErrorCodeReturnedEquals, keyPrefixEquals);
        }
    }
}