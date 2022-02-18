// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.connect.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The queue configuration. This is required only if QuickConnectType is QUEUE.
 * 
 */
public final class QuickConnectQueueQuickConnectConfig extends io.pulumi.resources.InvokeArgs {

    public static final QuickConnectQueueQuickConnectConfig Empty = new QuickConnectQueueQuickConnectConfig();

    @InputImport(name="contactFlowArn", required=true)
    private final String contactFlowArn;

    public String getContactFlowArn() {
        return this.contactFlowArn;
    }

    @InputImport(name="queueArn", required=true)
    private final String queueArn;

    public String getQueueArn() {
        return this.queueArn;
    }

    public QuickConnectQueueQuickConnectConfig(
        String contactFlowArn,
        String queueArn) {
        this.contactFlowArn = Objects.requireNonNull(contactFlowArn, "expected parameter 'contactFlowArn' to be non-null");
        this.queueArn = Objects.requireNonNull(queueArn, "expected parameter 'queueArn' to be non-null");
    }

    private QuickConnectQueueQuickConnectConfig() {
        this.contactFlowArn = null;
        this.queueArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuickConnectQueueQuickConnectConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contactFlowArn;
        private String queueArn;

        public Builder() {
    	      // Empty
        }

        public Builder(QuickConnectQueueQuickConnectConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactFlowArn = defaults.contactFlowArn;
    	      this.queueArn = defaults.queueArn;
        }

        public Builder setContactFlowArn(String contactFlowArn) {
            this.contactFlowArn = Objects.requireNonNull(contactFlowArn);
            return this;
        }

        public Builder setQueueArn(String queueArn) {
            this.queueArn = Objects.requireNonNull(queueArn);
            return this;
        }

        public QuickConnectQueueQuickConnectConfig build() {
            return new QuickConnectQueueQuickConnectConfig(contactFlowArn, queueArn);
        }
    }
}
