// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datadog.outputs;

import io.pulumi.azurenative.datadog.outputs.DatadogHostResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListMonitorHostsResult {
    private final @Nullable String nextLink;
    private final @Nullable List<DatadogHostResponse> value;

    @OutputCustomType.Constructor({"nextLink","value"})
    private ListMonitorHostsResult(
        @Nullable String nextLink,
        @Nullable List<DatadogHostResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    public Optional<String> getNextLink() {
        return Optional.ofNullable(this.nextLink);
    }
    public List<DatadogHostResponse> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListMonitorHostsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nextLink;
        private @Nullable List<DatadogHostResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListMonitorHostsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder setNextLink(@Nullable String nextLink) {
            this.nextLink = nextLink;
            return this;
        }

        public Builder setValue(@Nullable List<DatadogHostResponse> value) {
            this.value = value;
            return this;
        }

        public ListMonitorHostsResult build() {
            return new ListMonitorHostsResult(nextLink, value);
        }
    }
}