// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetPhraseMatcherResult {
    /**
     * The most recent time at which the activation status was updated.
     * 
     */
    private final String activationUpdateTime;
    /**
     * Applies the phrase matcher only when it is active.
     * 
     */
    private final Boolean active;
    /**
     * The human-readable name of the phrase matcher.
     * 
     */
    private final String displayName;
    /**
     * The resource name of the phrase matcher. Format: projects/{project}/locations/{location}/phraseMatchers/{phrase_matcher}
     * 
     */
    private final String name;
    /**
     * A list of phase match rule groups that are included in this matcher.
     * 
     */
    private final List<GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupResponse> phraseMatchRuleGroups;
    /**
     * The timestamp of when the revision was created. It is also the create time when a new matcher is added.
     * 
     */
    private final String revisionCreateTime;
    /**
     * Immutable. The revision ID of the phrase matcher. A new revision is committed whenever the matcher is changed, except when it is activated or deactivated. A server generated random ID will be used. Example: locations/global/phraseMatchers/my-first-matcher@1234567
     * 
     */
    private final String revisionId;
    /**
     * The role whose utterances the phrase matcher should be matched against. If the role is ROLE_UNSPECIFIED it will be matched against any utterances in the transcript.
     * 
     */
    private final String roleMatch;
    /**
     * The type of this phrase matcher.
     * 
     */
    private final String type;
    /**
     * The most recent time at which the phrase matcher was updated.
     * 
     */
    private final String updateTime;
    /**
     * The customized version tag to use for the phrase matcher. If not specified, it will default to `revision_id`.
     * 
     */
    private final String versionTag;

    @OutputCustomType.Constructor({"activationUpdateTime","active","displayName","name","phraseMatchRuleGroups","revisionCreateTime","revisionId","roleMatch","type","updateTime","versionTag"})
    private GetPhraseMatcherResult(
        String activationUpdateTime,
        Boolean active,
        String displayName,
        String name,
        List<GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupResponse> phraseMatchRuleGroups,
        String revisionCreateTime,
        String revisionId,
        String roleMatch,
        String type,
        String updateTime,
        String versionTag) {
        this.activationUpdateTime = Objects.requireNonNull(activationUpdateTime);
        this.active = Objects.requireNonNull(active);
        this.displayName = Objects.requireNonNull(displayName);
        this.name = Objects.requireNonNull(name);
        this.phraseMatchRuleGroups = Objects.requireNonNull(phraseMatchRuleGroups);
        this.revisionCreateTime = Objects.requireNonNull(revisionCreateTime);
        this.revisionId = Objects.requireNonNull(revisionId);
        this.roleMatch = Objects.requireNonNull(roleMatch);
        this.type = Objects.requireNonNull(type);
        this.updateTime = Objects.requireNonNull(updateTime);
        this.versionTag = Objects.requireNonNull(versionTag);
    }

    /**
     * The most recent time at which the activation status was updated.
     * 
    */
    public String getActivationUpdateTime() {
        return this.activationUpdateTime;
    }
    /**
     * Applies the phrase matcher only when it is active.
     * 
    */
    public Boolean getActive() {
        return this.active;
    }
    /**
     * The human-readable name of the phrase matcher.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The resource name of the phrase matcher. Format: projects/{project}/locations/{location}/phraseMatchers/{phrase_matcher}
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * A list of phase match rule groups that are included in this matcher.
     * 
    */
    public List<GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupResponse> getPhraseMatchRuleGroups() {
        return this.phraseMatchRuleGroups;
    }
    /**
     * The timestamp of when the revision was created. It is also the create time when a new matcher is added.
     * 
    */
    public String getRevisionCreateTime() {
        return this.revisionCreateTime;
    }
    /**
     * Immutable. The revision ID of the phrase matcher. A new revision is committed whenever the matcher is changed, except when it is activated or deactivated. A server generated random ID will be used. Example: locations/global/phraseMatchers/my-first-matcher@1234567
     * 
    */
    public String getRevisionId() {
        return this.revisionId;
    }
    /**
     * The role whose utterances the phrase matcher should be matched against. If the role is ROLE_UNSPECIFIED it will be matched against any utterances in the transcript.
     * 
    */
    public String getRoleMatch() {
        return this.roleMatch;
    }
    /**
     * The type of this phrase matcher.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The most recent time at which the phrase matcher was updated.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }
    /**
     * The customized version tag to use for the phrase matcher. If not specified, it will default to `revision_id`.
     * 
    */
    public String getVersionTag() {
        return this.versionTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPhraseMatcherResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String activationUpdateTime;
        private Boolean active;
        private String displayName;
        private String name;
        private List<GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupResponse> phraseMatchRuleGroups;
        private String revisionCreateTime;
        private String revisionId;
        private String roleMatch;
        private String type;
        private String updateTime;
        private String versionTag;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPhraseMatcherResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationUpdateTime = defaults.activationUpdateTime;
    	      this.active = defaults.active;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.phraseMatchRuleGroups = defaults.phraseMatchRuleGroups;
    	      this.revisionCreateTime = defaults.revisionCreateTime;
    	      this.revisionId = defaults.revisionId;
    	      this.roleMatch = defaults.roleMatch;
    	      this.type = defaults.type;
    	      this.updateTime = defaults.updateTime;
    	      this.versionTag = defaults.versionTag;
        }

        public Builder setActivationUpdateTime(String activationUpdateTime) {
            this.activationUpdateTime = Objects.requireNonNull(activationUpdateTime);
            return this;
        }

        public Builder setActive(Boolean active) {
            this.active = Objects.requireNonNull(active);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPhraseMatchRuleGroups(List<GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupResponse> phraseMatchRuleGroups) {
            this.phraseMatchRuleGroups = Objects.requireNonNull(phraseMatchRuleGroups);
            return this;
        }

        public Builder setRevisionCreateTime(String revisionCreateTime) {
            this.revisionCreateTime = Objects.requireNonNull(revisionCreateTime);
            return this;
        }

        public Builder setRevisionId(String revisionId) {
            this.revisionId = Objects.requireNonNull(revisionId);
            return this;
        }

        public Builder setRoleMatch(String roleMatch) {
            this.roleMatch = Objects.requireNonNull(roleMatch);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public Builder setVersionTag(String versionTag) {
            this.versionTag = Objects.requireNonNull(versionTag);
            return this;
        }
        public GetPhraseMatcherResult build() {
            return new GetPhraseMatcherResult(activationUpdateTime, active, displayName, name, phraseMatchRuleGroups, revisionCreateTime, revisionId, roleMatch, type, updateTime, versionTag);
        }
    }
}
