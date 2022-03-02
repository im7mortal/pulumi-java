// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DatabaseInstanceSettingsDatabaseFlag {
    /**
     * A name for this whitelist entry.
     * 
     */
    private final String name;
    /**
     * A CIDR notation IPv4 or IPv6 address that is allowed to
     * access this instance. Must be set even if other two attributes are not for
     * the whitelist to become active.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"name","value"})
    private DatabaseInstanceSettingsDatabaseFlag(
        String name,
        String value) {
        this.name = Objects.requireNonNull(name);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * A name for this whitelist entry.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * A CIDR notation IPv4 or IPv6 address that is allowed to
     * access this instance. Must be set even if other two attributes are not for
     * the whitelist to become active.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceSettingsDatabaseFlag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceSettingsDatabaseFlag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public DatabaseInstanceSettingsDatabaseFlag build() {
            return new DatabaseInstanceSettingsDatabaseFlag(name, value);
        }
    }
}
