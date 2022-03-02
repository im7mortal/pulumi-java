// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch {
    /**
     * When `type` is `HEADER`, enter the name of the header that you want to search, e.g., `User-Agent` or `Referer`.
     * If `type` is any other value, omit this field.
     * 
     */
    private final @Nullable String data;
    /**
     * The part of the web request that you want AWS WAF to search for a specified string.
     * e.g., `HEADER`, `METHOD` or `BODY`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_FieldToMatch.html)
     * for all supported values.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"data","type"})
    private SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch(
        @Nullable String data,
        String type) {
        this.data = data;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * When `type` is `HEADER`, enter the name of the header that you want to search, e.g., `User-Agent` or `Referer`.
     * If `type` is any other value, omit this field.
     * 
    */
    public Optional<String> getData() {
        return Optional.ofNullable(this.data);
    }
    /**
     * The part of the web request that you want AWS WAF to search for a specified string.
     * e.g., `HEADER`, `METHOD` or `BODY`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_FieldToMatch.html)
     * for all supported values.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String data;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.type = defaults.type;
        }

        public Builder setData(@Nullable String data) {
            this.data = data;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch build() {
            return new SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch(data, type);
        }
    }
}
