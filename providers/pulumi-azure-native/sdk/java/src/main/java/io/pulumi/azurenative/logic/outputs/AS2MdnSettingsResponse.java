// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AS2MdnSettingsResponse {
    /**
     * The disposition notification to header value.
     * 
     */
    private final @Nullable String dispositionNotificationTo;
    /**
     * The MDN text.
     * 
     */
    private final @Nullable String mdnText;
    /**
     * The signing or hashing algorithm.
     * 
     */
    private final String micHashingAlgorithm;
    /**
     * The value indicating whether to send or request a MDN.
     * 
     */
    private final Boolean needMDN;
    /**
     * The receipt delivery URL.
     * 
     */
    private final @Nullable String receiptDeliveryUrl;
    /**
     * The value indicating whether to send inbound MDN to message box.
     * 
     */
    private final Boolean sendInboundMDNToMessageBox;
    /**
     * The value indicating whether to send the asynchronous MDN.
     * 
     */
    private final Boolean sendMDNAsynchronously;
    /**
     * The value indicating whether the MDN needs to be signed or not.
     * 
     */
    private final Boolean signMDN;
    /**
     * The value indicating whether to sign the outbound MDN if optional.
     * 
     */
    private final Boolean signOutboundMDNIfOptional;

    @OutputCustomType.Constructor({"dispositionNotificationTo","mdnText","micHashingAlgorithm","needMDN","receiptDeliveryUrl","sendInboundMDNToMessageBox","sendMDNAsynchronously","signMDN","signOutboundMDNIfOptional"})
    private AS2MdnSettingsResponse(
        @Nullable String dispositionNotificationTo,
        @Nullable String mdnText,
        String micHashingAlgorithm,
        Boolean needMDN,
        @Nullable String receiptDeliveryUrl,
        Boolean sendInboundMDNToMessageBox,
        Boolean sendMDNAsynchronously,
        Boolean signMDN,
        Boolean signOutboundMDNIfOptional) {
        this.dispositionNotificationTo = dispositionNotificationTo;
        this.mdnText = mdnText;
        this.micHashingAlgorithm = Objects.requireNonNull(micHashingAlgorithm);
        this.needMDN = Objects.requireNonNull(needMDN);
        this.receiptDeliveryUrl = receiptDeliveryUrl;
        this.sendInboundMDNToMessageBox = Objects.requireNonNull(sendInboundMDNToMessageBox);
        this.sendMDNAsynchronously = Objects.requireNonNull(sendMDNAsynchronously);
        this.signMDN = Objects.requireNonNull(signMDN);
        this.signOutboundMDNIfOptional = Objects.requireNonNull(signOutboundMDNIfOptional);
    }

    /**
     * The disposition notification to header value.
     * 
    */
    public Optional<String> getDispositionNotificationTo() {
        return Optional.ofNullable(this.dispositionNotificationTo);
    }
    /**
     * The MDN text.
     * 
    */
    public Optional<String> getMdnText() {
        return Optional.ofNullable(this.mdnText);
    }
    /**
     * The signing or hashing algorithm.
     * 
    */
    public String getMicHashingAlgorithm() {
        return this.micHashingAlgorithm;
    }
    /**
     * The value indicating whether to send or request a MDN.
     * 
    */
    public Boolean getNeedMDN() {
        return this.needMDN;
    }
    /**
     * The receipt delivery URL.
     * 
    */
    public Optional<String> getReceiptDeliveryUrl() {
        return Optional.ofNullable(this.receiptDeliveryUrl);
    }
    /**
     * The value indicating whether to send inbound MDN to message box.
     * 
    */
    public Boolean getSendInboundMDNToMessageBox() {
        return this.sendInboundMDNToMessageBox;
    }
    /**
     * The value indicating whether to send the asynchronous MDN.
     * 
    */
    public Boolean getSendMDNAsynchronously() {
        return this.sendMDNAsynchronously;
    }
    /**
     * The value indicating whether the MDN needs to be signed or not.
     * 
    */
    public Boolean getSignMDN() {
        return this.signMDN;
    }
    /**
     * The value indicating whether to sign the outbound MDN if optional.
     * 
    */
    public Boolean getSignOutboundMDNIfOptional() {
        return this.signOutboundMDNIfOptional;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AS2MdnSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dispositionNotificationTo;
        private @Nullable String mdnText;
        private String micHashingAlgorithm;
        private Boolean needMDN;
        private @Nullable String receiptDeliveryUrl;
        private Boolean sendInboundMDNToMessageBox;
        private Boolean sendMDNAsynchronously;
        private Boolean signMDN;
        private Boolean signOutboundMDNIfOptional;

        public Builder() {
    	      // Empty
        }

        public Builder(AS2MdnSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dispositionNotificationTo = defaults.dispositionNotificationTo;
    	      this.mdnText = defaults.mdnText;
    	      this.micHashingAlgorithm = defaults.micHashingAlgorithm;
    	      this.needMDN = defaults.needMDN;
    	      this.receiptDeliveryUrl = defaults.receiptDeliveryUrl;
    	      this.sendInboundMDNToMessageBox = defaults.sendInboundMDNToMessageBox;
    	      this.sendMDNAsynchronously = defaults.sendMDNAsynchronously;
    	      this.signMDN = defaults.signMDN;
    	      this.signOutboundMDNIfOptional = defaults.signOutboundMDNIfOptional;
        }

        public Builder setDispositionNotificationTo(@Nullable String dispositionNotificationTo) {
            this.dispositionNotificationTo = dispositionNotificationTo;
            return this;
        }

        public Builder setMdnText(@Nullable String mdnText) {
            this.mdnText = mdnText;
            return this;
        }

        public Builder setMicHashingAlgorithm(String micHashingAlgorithm) {
            this.micHashingAlgorithm = Objects.requireNonNull(micHashingAlgorithm);
            return this;
        }

        public Builder setNeedMDN(Boolean needMDN) {
            this.needMDN = Objects.requireNonNull(needMDN);
            return this;
        }

        public Builder setReceiptDeliveryUrl(@Nullable String receiptDeliveryUrl) {
            this.receiptDeliveryUrl = receiptDeliveryUrl;
            return this;
        }

        public Builder setSendInboundMDNToMessageBox(Boolean sendInboundMDNToMessageBox) {
            this.sendInboundMDNToMessageBox = Objects.requireNonNull(sendInboundMDNToMessageBox);
            return this;
        }

        public Builder setSendMDNAsynchronously(Boolean sendMDNAsynchronously) {
            this.sendMDNAsynchronously = Objects.requireNonNull(sendMDNAsynchronously);
            return this;
        }

        public Builder setSignMDN(Boolean signMDN) {
            this.signMDN = Objects.requireNonNull(signMDN);
            return this;
        }

        public Builder setSignOutboundMDNIfOptional(Boolean signOutboundMDNIfOptional) {
            this.signOutboundMDNIfOptional = Objects.requireNonNull(signOutboundMDNIfOptional);
            return this;
        }
        public AS2MdnSettingsResponse build() {
            return new AS2MdnSettingsResponse(dispositionNotificationTo, mdnText, micHashingAlgorithm, needMDN, receiptDeliveryUrl, sendInboundMDNToMessageBox, sendMDNAsynchronously, signMDN, signOutboundMDNIfOptional);
        }
    }
}
