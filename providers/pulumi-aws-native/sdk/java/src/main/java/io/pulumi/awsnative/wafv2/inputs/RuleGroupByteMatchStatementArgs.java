// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.RuleGroupPositionalConstraint;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupFieldToMatchArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupTextTransformationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Byte Match statement.
 * 
 */
public final class RuleGroupByteMatchStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupByteMatchStatementArgs Empty = new RuleGroupByteMatchStatementArgs();

    @InputImport(name="fieldToMatch", required=true)
    private final Input<RuleGroupFieldToMatchArgs> fieldToMatch;

    public Input<RuleGroupFieldToMatchArgs> getFieldToMatch() {
        return this.fieldToMatch;
    }

    @InputImport(name="positionalConstraint", required=true)
    private final Input<RuleGroupPositionalConstraint> positionalConstraint;

    public Input<RuleGroupPositionalConstraint> getPositionalConstraint() {
        return this.positionalConstraint;
    }

    @InputImport(name="searchString")
    private final @Nullable Input<String> searchString;

    public Input<String> getSearchString() {
        return this.searchString == null ? Input.empty() : this.searchString;
    }

    @InputImport(name="searchStringBase64")
    private final @Nullable Input<String> searchStringBase64;

    public Input<String> getSearchStringBase64() {
        return this.searchStringBase64 == null ? Input.empty() : this.searchStringBase64;
    }

    @InputImport(name="textTransformations", required=true)
    private final Input<List<RuleGroupTextTransformationArgs>> textTransformations;

    public Input<List<RuleGroupTextTransformationArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public RuleGroupByteMatchStatementArgs(
        Input<RuleGroupFieldToMatchArgs> fieldToMatch,
        Input<RuleGroupPositionalConstraint> positionalConstraint,
        @Nullable Input<String> searchString,
        @Nullable Input<String> searchStringBase64,
        Input<List<RuleGroupTextTransformationArgs>> textTransformations) {
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
        this.positionalConstraint = Objects.requireNonNull(positionalConstraint, "expected parameter 'positionalConstraint' to be non-null");
        this.searchString = searchString;
        this.searchStringBase64 = searchStringBase64;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private RuleGroupByteMatchStatementArgs() {
        this.fieldToMatch = Input.empty();
        this.positionalConstraint = Input.empty();
        this.searchString = Input.empty();
        this.searchStringBase64 = Input.empty();
        this.textTransformations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupByteMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<RuleGroupFieldToMatchArgs> fieldToMatch;
        private Input<RuleGroupPositionalConstraint> positionalConstraint;
        private @Nullable Input<String> searchString;
        private @Nullable Input<String> searchStringBase64;
        private Input<List<RuleGroupTextTransformationArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupByteMatchStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.positionalConstraint = defaults.positionalConstraint;
    	      this.searchString = defaults.searchString;
    	      this.searchStringBase64 = defaults.searchStringBase64;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder setFieldToMatch(Input<RuleGroupFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }

        public Builder setFieldToMatch(RuleGroupFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Input.of(Objects.requireNonNull(fieldToMatch));
            return this;
        }

        public Builder setPositionalConstraint(Input<RuleGroupPositionalConstraint> positionalConstraint) {
            this.positionalConstraint = Objects.requireNonNull(positionalConstraint);
            return this;
        }

        public Builder setPositionalConstraint(RuleGroupPositionalConstraint positionalConstraint) {
            this.positionalConstraint = Input.of(Objects.requireNonNull(positionalConstraint));
            return this;
        }

        public Builder setSearchString(@Nullable Input<String> searchString) {
            this.searchString = searchString;
            return this;
        }

        public Builder setSearchString(@Nullable String searchString) {
            this.searchString = Input.ofNullable(searchString);
            return this;
        }

        public Builder setSearchStringBase64(@Nullable Input<String> searchStringBase64) {
            this.searchStringBase64 = searchStringBase64;
            return this;
        }

        public Builder setSearchStringBase64(@Nullable String searchStringBase64) {
            this.searchStringBase64 = Input.ofNullable(searchStringBase64);
            return this;
        }

        public Builder setTextTransformations(Input<List<RuleGroupTextTransformationArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }

        public Builder setTextTransformations(List<RuleGroupTextTransformationArgs> textTransformations) {
            this.textTransformations = Input.of(Objects.requireNonNull(textTransformations));
            return this;
        }

        public RuleGroupByteMatchStatementArgs build() {
            return new RuleGroupByteMatchStatementArgs(fieldToMatch, positionalConstraint, searchString, searchStringBase64, textTransformations);
        }
    }
}
