// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.analysisservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IPv4FirewallRuleResponse {
    /**
     * The rule name.
     * 
     */
    private final @Nullable String firewallRuleName;
    /**
     * The end range of IPv4.
     * 
     */
    private final @Nullable String rangeEnd;
    /**
     * The start range of IPv4.
     * 
     */
    private final @Nullable String rangeStart;

    @OutputCustomType.Constructor({"firewallRuleName","rangeEnd","rangeStart"})
    private IPv4FirewallRuleResponse(
        @Nullable String firewallRuleName,
        @Nullable String rangeEnd,
        @Nullable String rangeStart) {
        this.firewallRuleName = firewallRuleName;
        this.rangeEnd = rangeEnd;
        this.rangeStart = rangeStart;
    }

    /**
     * The rule name.
     * 
    */
    public Optional<String> getFirewallRuleName() {
        return Optional.ofNullable(this.firewallRuleName);
    }
    /**
     * The end range of IPv4.
     * 
    */
    public Optional<String> getRangeEnd() {
        return Optional.ofNullable(this.rangeEnd);
    }
    /**
     * The start range of IPv4.
     * 
    */
    public Optional<String> getRangeStart() {
        return Optional.ofNullable(this.rangeStart);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPv4FirewallRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String firewallRuleName;
        private @Nullable String rangeEnd;
        private @Nullable String rangeStart;

        public Builder() {
    	      // Empty
        }

        public Builder(IPv4FirewallRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.firewallRuleName = defaults.firewallRuleName;
    	      this.rangeEnd = defaults.rangeEnd;
    	      this.rangeStart = defaults.rangeStart;
        }

        public Builder setFirewallRuleName(@Nullable String firewallRuleName) {
            this.firewallRuleName = firewallRuleName;
            return this;
        }

        public Builder setRangeEnd(@Nullable String rangeEnd) {
            this.rangeEnd = rangeEnd;
            return this;
        }

        public Builder setRangeStart(@Nullable String rangeStart) {
            this.rangeStart = rangeStart;
            return this;
        }
        public IPv4FirewallRuleResponse build() {
            return new IPv4FirewallRuleResponse(firewallRuleName, rangeEnd, rangeStart);
        }
    }
}
