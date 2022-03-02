// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.awsnative.lex.outputs.BotAliasCodeHookSpecification;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BotAliasLocaleSettings {
    private final @Nullable BotAliasCodeHookSpecification codeHookSpecification;
    /**
     * Whether the Lambda code hook is enabled
     * 
     */
    private final Boolean enabled;

    @OutputCustomType.Constructor({"codeHookSpecification","enabled"})
    private BotAliasLocaleSettings(
        @Nullable BotAliasCodeHookSpecification codeHookSpecification,
        Boolean enabled) {
        this.codeHookSpecification = codeHookSpecification;
        this.enabled = Objects.requireNonNull(enabled);
    }

    public Optional<BotAliasCodeHookSpecification> getCodeHookSpecification() {
        return Optional.ofNullable(this.codeHookSpecification);
    }
    /**
     * Whether the Lambda code hook is enabled
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasLocaleSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BotAliasCodeHookSpecification codeHookSpecification;
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasLocaleSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeHookSpecification = defaults.codeHookSpecification;
    	      this.enabled = defaults.enabled;
        }

        public Builder setCodeHookSpecification(@Nullable BotAliasCodeHookSpecification codeHookSpecification) {
            this.codeHookSpecification = codeHookSpecification;
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public BotAliasLocaleSettings build() {
            return new BotAliasLocaleSettings(codeHookSpecification, enabled);
        }
    }
}
