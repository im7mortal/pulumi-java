// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ByteMatchSetByteMatchTupleFieldToMatch {
    /**
     * When the value of Type is HEADER, enter the name of the header that you want AWS WAF to search, for example, User-Agent or Referer. If the value of Type is any other value, omit Data.
     * 
     */
    private final @Nullable String data;
    /**
     * The part of the web request that you want AWS WAF to search for a specified string.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"data","type"})
    private ByteMatchSetByteMatchTupleFieldToMatch(
        @Nullable String data,
        String type) {
        this.data = data;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * When the value of Type is HEADER, enter the name of the header that you want AWS WAF to search, for example, User-Agent or Referer. If the value of Type is any other value, omit Data.
     * 
    */
    public Optional<String> getData() {
        return Optional.ofNullable(this.data);
    }
    /**
     * The part of the web request that you want AWS WAF to search for a specified string.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ByteMatchSetByteMatchTupleFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String data;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ByteMatchSetByteMatchTupleFieldToMatch defaults) {
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
        public ByteMatchSetByteMatchTupleFieldToMatch build() {
            return new ByteMatchSetByteMatchTupleFieldToMatch(data, type);
        }
    }
}
