// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudchannel_v1.outputs.GoogleCloudChannelV1CloudIdentityInfoResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetChannelPartnerLinkResult {
    /**
     * Cloud Identity info of the channel partner (IR).
     * 
     */
    private final GoogleCloudChannelV1CloudIdentityInfoResponse channelPartnerCloudIdentityInfo;
    /**
     * Timestamp of when the channel partner link is created.
     * 
     */
    private final String createTime;
    /**
     * URI of the web page where partner accepts the link invitation.
     * 
     */
    private final String inviteLinkUri;
    /**
     * State of the channel partner link.
     * 
     */
    private final String linkState;
    /**
     * Resource name for the channel partner link, in the format accounts/{account_id}/channelPartnerLinks/{id}.
     * 
     */
    private final String name;
    /**
     * Public identifier that a customer must use to generate a transfer token to move to this distributor-reseller combination.
     * 
     */
    private final String publicId;
    /**
     * Cloud Identity ID of the linked reseller.
     * 
     */
    private final String resellerCloudIdentityId;
    /**
     * Timestamp of when the channel partner link is updated.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor({"channelPartnerCloudIdentityInfo","createTime","inviteLinkUri","linkState","name","publicId","resellerCloudIdentityId","updateTime"})
    private GetChannelPartnerLinkResult(
        GoogleCloudChannelV1CloudIdentityInfoResponse channelPartnerCloudIdentityInfo,
        String createTime,
        String inviteLinkUri,
        String linkState,
        String name,
        String publicId,
        String resellerCloudIdentityId,
        String updateTime) {
        this.channelPartnerCloudIdentityInfo = Objects.requireNonNull(channelPartnerCloudIdentityInfo);
        this.createTime = Objects.requireNonNull(createTime);
        this.inviteLinkUri = Objects.requireNonNull(inviteLinkUri);
        this.linkState = Objects.requireNonNull(linkState);
        this.name = Objects.requireNonNull(name);
        this.publicId = Objects.requireNonNull(publicId);
        this.resellerCloudIdentityId = Objects.requireNonNull(resellerCloudIdentityId);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    /**
     * Cloud Identity info of the channel partner (IR).
     * 
    */
    public GoogleCloudChannelV1CloudIdentityInfoResponse getChannelPartnerCloudIdentityInfo() {
        return this.channelPartnerCloudIdentityInfo;
    }
    /**
     * Timestamp of when the channel partner link is created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * URI of the web page where partner accepts the link invitation.
     * 
    */
    public String getInviteLinkUri() {
        return this.inviteLinkUri;
    }
    /**
     * State of the channel partner link.
     * 
    */
    public String getLinkState() {
        return this.linkState;
    }
    /**
     * Resource name for the channel partner link, in the format accounts/{account_id}/channelPartnerLinks/{id}.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Public identifier that a customer must use to generate a transfer token to move to this distributor-reseller combination.
     * 
    */
    public String getPublicId() {
        return this.publicId;
    }
    /**
     * Cloud Identity ID of the linked reseller.
     * 
    */
    public String getResellerCloudIdentityId() {
        return this.resellerCloudIdentityId;
    }
    /**
     * Timestamp of when the channel partner link is updated.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetChannelPartnerLinkResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudChannelV1CloudIdentityInfoResponse channelPartnerCloudIdentityInfo;
        private String createTime;
        private String inviteLinkUri;
        private String linkState;
        private String name;
        private String publicId;
        private String resellerCloudIdentityId;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetChannelPartnerLinkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelPartnerCloudIdentityInfo = defaults.channelPartnerCloudIdentityInfo;
    	      this.createTime = defaults.createTime;
    	      this.inviteLinkUri = defaults.inviteLinkUri;
    	      this.linkState = defaults.linkState;
    	      this.name = defaults.name;
    	      this.publicId = defaults.publicId;
    	      this.resellerCloudIdentityId = defaults.resellerCloudIdentityId;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setChannelPartnerCloudIdentityInfo(GoogleCloudChannelV1CloudIdentityInfoResponse channelPartnerCloudIdentityInfo) {
            this.channelPartnerCloudIdentityInfo = Objects.requireNonNull(channelPartnerCloudIdentityInfo);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setInviteLinkUri(String inviteLinkUri) {
            this.inviteLinkUri = Objects.requireNonNull(inviteLinkUri);
            return this;
        }

        public Builder setLinkState(String linkState) {
            this.linkState = Objects.requireNonNull(linkState);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPublicId(String publicId) {
            this.publicId = Objects.requireNonNull(publicId);
            return this;
        }

        public Builder setResellerCloudIdentityId(String resellerCloudIdentityId) {
            this.resellerCloudIdentityId = Objects.requireNonNull(resellerCloudIdentityId);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetChannelPartnerLinkResult build() {
            return new GetChannelPartnerLinkResult(channelPartnerCloudIdentityInfo, createTime, inviteLinkUri, linkState, name, publicId, resellerCloudIdentityId, updateTime);
        }
    }
}
