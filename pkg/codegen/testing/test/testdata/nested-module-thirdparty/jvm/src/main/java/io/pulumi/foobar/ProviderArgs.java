// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.foobar;

import java.util.Objects;


public final class ProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    public ProviderArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public ProviderArgs build() {
            return new ProviderArgs();
        }
    }
}
