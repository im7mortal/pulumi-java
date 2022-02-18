// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Information needed to configure the payload.
 * 
 * By default, AWS IoT Events generates a standard payload in JSON for any action. This action payload contains all attribute-value pairs that have the information about the detector model instance and the event triggered the action. To configure the action payload, you can use `contentExpression`.
 * 
 */
public final class DetectorModelPayload extends io.pulumi.resources.InvokeArgs {

    public static final DetectorModelPayload Empty = new DetectorModelPayload();

    /**
     * The content of the payload. You can use a string expression that includes quoted strings (`'<string>'`), variables (`$variable.<variable-name>`), input values (`$input.<input-name>.<path-to-datum>`), string concatenations, and quoted strings that contain `${}` as the content. The recommended maximum size of a content expression is 1 KB.
     * 
     */
    @InputImport(name="contentExpression", required=true)
    private final String contentExpression;

    public String getContentExpression() {
        return this.contentExpression;
    }

    /**
     * The value of the payload type can be either `STRING` or `JSON`.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public DetectorModelPayload(
        String contentExpression,
        String type) {
        this.contentExpression = Objects.requireNonNull(contentExpression, "expected parameter 'contentExpression' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DetectorModelPayload() {
        this.contentExpression = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelPayload defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contentExpression;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelPayload defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentExpression = defaults.contentExpression;
    	      this.type = defaults.type;
        }

        public Builder setContentExpression(String contentExpression) {
            this.contentExpression = Objects.requireNonNull(contentExpression);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public DetectorModelPayload build() {
            return new DetectorModelPayload(contentExpression, type);
        }
    }
}
