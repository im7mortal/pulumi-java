// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ScriptStringExecutionParameterResponse {
    /**
     * The parameter name
     * 
     */
    private final String name;
    /**
     * The type of execution parameter
     * Expected value is 'Value'.
     * 
     */
    private final String type;
    /**
     * The value for the passed parameter
     * 
     */
    private final @Nullable String value;

    @OutputCustomType.Constructor({"name","type","value"})
    private ScriptStringExecutionParameterResponse(
        String name,
        String type,
        @Nullable String value) {
        this.name = Objects.requireNonNull(name);
        this.type = Objects.requireNonNull(type);
        this.value = value;
    }

    /**
     * The parameter name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The type of execution parameter
     * Expected value is 'Value'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The value for the passed parameter
     * 
    */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScriptStringExecutionParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String type;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ScriptStringExecutionParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }
        public ScriptStringExecutionParameterResponse build() {
            return new ScriptStringExecutionParameterResponse(name, type, value);
        }
    }
}
