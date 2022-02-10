// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.signalrservice.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UpstreamTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final UpstreamTemplateArgs Empty = new UpstreamTemplateArgs();

    @InputImport(name="categoryPattern")
    private final @Nullable Input<String> categoryPattern;

    public Input<String> getCategoryPattern() {
        return this.categoryPattern == null ? Input.empty() : this.categoryPattern;
    }

    @InputImport(name="eventPattern")
    private final @Nullable Input<String> eventPattern;

    public Input<String> getEventPattern() {
        return this.eventPattern == null ? Input.empty() : this.eventPattern;
    }

    @InputImport(name="hubPattern")
    private final @Nullable Input<String> hubPattern;

    public Input<String> getHubPattern() {
        return this.hubPattern == null ? Input.empty() : this.hubPattern;
    }

    @InputImport(name="urlTemplate", required=true)
    private final Input<String> urlTemplate;

    public Input<String> getUrlTemplate() {
        return this.urlTemplate;
    }

    public UpstreamTemplateArgs(
        @Nullable Input<String> categoryPattern,
        @Nullable Input<String> eventPattern,
        @Nullable Input<String> hubPattern,
        Input<String> urlTemplate) {
        this.categoryPattern = categoryPattern;
        this.eventPattern = eventPattern;
        this.hubPattern = hubPattern;
        this.urlTemplate = Objects.requireNonNull(urlTemplate, "expected parameter 'urlTemplate' to be non-null");
    }

    private UpstreamTemplateArgs() {
        this.categoryPattern = Input.empty();
        this.eventPattern = Input.empty();
        this.hubPattern = Input.empty();
        this.urlTemplate = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpstreamTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> categoryPattern;
        private @Nullable Input<String> eventPattern;
        private @Nullable Input<String> hubPattern;
        private Input<String> urlTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(UpstreamTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categoryPattern = defaults.categoryPattern;
    	      this.eventPattern = defaults.eventPattern;
    	      this.hubPattern = defaults.hubPattern;
    	      this.urlTemplate = defaults.urlTemplate;
        }

        public Builder setCategoryPattern(@Nullable Input<String> categoryPattern) {
            this.categoryPattern = categoryPattern;
            return this;
        }

        public Builder setCategoryPattern(@Nullable String categoryPattern) {
            this.categoryPattern = Input.ofNullable(categoryPattern);
            return this;
        }

        public Builder setEventPattern(@Nullable Input<String> eventPattern) {
            this.eventPattern = eventPattern;
            return this;
        }

        public Builder setEventPattern(@Nullable String eventPattern) {
            this.eventPattern = Input.ofNullable(eventPattern);
            return this;
        }

        public Builder setHubPattern(@Nullable Input<String> hubPattern) {
            this.hubPattern = hubPattern;
            return this;
        }

        public Builder setHubPattern(@Nullable String hubPattern) {
            this.hubPattern = Input.ofNullable(hubPattern);
            return this;
        }

        public Builder setUrlTemplate(Input<String> urlTemplate) {
            this.urlTemplate = Objects.requireNonNull(urlTemplate);
            return this;
        }

        public Builder setUrlTemplate(String urlTemplate) {
            this.urlTemplate = Input.of(Objects.requireNonNull(urlTemplate));
            return this;
        }

        public UpstreamTemplateArgs build() {
            return new UpstreamTemplateArgs(categoryPattern, eventPattern, hubPattern, urlTemplate);
        }
    }
}