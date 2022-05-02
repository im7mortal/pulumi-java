// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1DocumentReloadStatusResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetDocumentResult {
    /**
     * @return The raw content of the document. This field is only permitted for EXTRACTIVE_QA and FAQ knowledge types. Note: This field is in the process of being deprecated, please use raw_content instead.
     * 
     */
    private final String content;
    /**
     * @return The URI where the file content is located. For documents stored in Google Cloud Storage, these URIs must have the form `gs:///`. NOTE: External URLs must correspond to public webpages, i.e., they must be indexed by Google Search. In particular, URLs for showing documents in Google Cloud Storage (i.e. the URL in your browser) are not supported. Instead use the `gs://` format URI described above.
     * 
     */
    private final String contentUri;
    /**
     * @return The display name of the document. The name must be 1024 bytes or less; otherwise, the creation request fails.
     * 
     */
    private final String displayName;
    /**
     * @return Optional. If true, we try to automatically reload the document every day (at a time picked by the system). If false or unspecified, we don&#39;t try to automatically reload the document. Currently you can only enable automatic reload for documents sourced from a public url, see `source` field for the source types. Reload status can be tracked in `latest_reload_status`. If a reload fails, we will keep the document unchanged. If a reload fails with internal errors, the system will try to reload the document on the next day. If a reload fails with non-retriable errors (e.g. PERMISSION_DENIED), the system will not try to reload the document anymore. You need to manually reload the document successfully by calling `ReloadDocument` and clear the errors.
     * 
     */
    private final Boolean enableAutoReload;
    /**
     * @return The knowledge type of document content.
     * 
     */
    private final List<String> knowledgeTypes;
    /**
     * @return The time and status of the latest reload. This reload may have been triggered automatically or manually and may not have succeeded.
     * 
     */
    private final GoogleCloudDialogflowV2beta1DocumentReloadStatusResponse latestReloadStatus;
    /**
     * @return Optional. Metadata for the document. The metadata supports arbitrary key-value pairs. Suggested use cases include storing a document&#39;s title, an external URL distinct from the document&#39;s content_uri, etc. The max size of a `key` or a `value` of the metadata is 1024 bytes.
     * 
     */
    private final Map<String,String> metadata;
    /**
     * @return The MIME type of this document.
     * 
     */
    private final String mimeType;
    /**
     * @return Optional. The document resource name. The name must be empty when creating a document. Format: `projects//locations//knowledgeBases//documents/`.
     * 
     */
    private final String name;
    /**
     * @return The raw content of the document. This field is only permitted for EXTRACTIVE_QA and FAQ knowledge types.
     * 
     */
    private final String rawContent;
    /**
     * @return The current state of the document.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private GetDocumentResult(
        @CustomType.Parameter("content") String content,
        @CustomType.Parameter("contentUri") String contentUri,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("enableAutoReload") Boolean enableAutoReload,
        @CustomType.Parameter("knowledgeTypes") List<String> knowledgeTypes,
        @CustomType.Parameter("latestReloadStatus") GoogleCloudDialogflowV2beta1DocumentReloadStatusResponse latestReloadStatus,
        @CustomType.Parameter("metadata") Map<String,String> metadata,
        @CustomType.Parameter("mimeType") String mimeType,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("rawContent") String rawContent,
        @CustomType.Parameter("state") String state) {
        this.content = content;
        this.contentUri = contentUri;
        this.displayName = displayName;
        this.enableAutoReload = enableAutoReload;
        this.knowledgeTypes = knowledgeTypes;
        this.latestReloadStatus = latestReloadStatus;
        this.metadata = metadata;
        this.mimeType = mimeType;
        this.name = name;
        this.rawContent = rawContent;
        this.state = state;
    }

    /**
     * @return The raw content of the document. This field is only permitted for EXTRACTIVE_QA and FAQ knowledge types. Note: This field is in the process of being deprecated, please use raw_content instead.
     * 
     */
    public String content() {
        return this.content;
    }
    /**
     * @return The URI where the file content is located. For documents stored in Google Cloud Storage, these URIs must have the form `gs:///`. NOTE: External URLs must correspond to public webpages, i.e., they must be indexed by Google Search. In particular, URLs for showing documents in Google Cloud Storage (i.e. the URL in your browser) are not supported. Instead use the `gs://` format URI described above.
     * 
     */
    public String contentUri() {
        return this.contentUri;
    }
    /**
     * @return The display name of the document. The name must be 1024 bytes or less; otherwise, the creation request fails.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Optional. If true, we try to automatically reload the document every day (at a time picked by the system). If false or unspecified, we don&#39;t try to automatically reload the document. Currently you can only enable automatic reload for documents sourced from a public url, see `source` field for the source types. Reload status can be tracked in `latest_reload_status`. If a reload fails, we will keep the document unchanged. If a reload fails with internal errors, the system will try to reload the document on the next day. If a reload fails with non-retriable errors (e.g. PERMISSION_DENIED), the system will not try to reload the document anymore. You need to manually reload the document successfully by calling `ReloadDocument` and clear the errors.
     * 
     */
    public Boolean enableAutoReload() {
        return this.enableAutoReload;
    }
    /**
     * @return The knowledge type of document content.
     * 
     */
    public List<String> knowledgeTypes() {
        return this.knowledgeTypes;
    }
    /**
     * @return The time and status of the latest reload. This reload may have been triggered automatically or manually and may not have succeeded.
     * 
     */
    public GoogleCloudDialogflowV2beta1DocumentReloadStatusResponse latestReloadStatus() {
        return this.latestReloadStatus;
    }
    /**
     * @return Optional. Metadata for the document. The metadata supports arbitrary key-value pairs. Suggested use cases include storing a document&#39;s title, an external URL distinct from the document&#39;s content_uri, etc. The max size of a `key` or a `value` of the metadata is 1024 bytes.
     * 
     */
    public Map<String,String> metadata() {
        return this.metadata;
    }
    /**
     * @return The MIME type of this document.
     * 
     */
    public String mimeType() {
        return this.mimeType;
    }
    /**
     * @return Optional. The document resource name. The name must be empty when creating a document. Format: `projects//locations//knowledgeBases//documents/`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The raw content of the document. This field is only permitted for EXTRACTIVE_QA and FAQ knowledge types.
     * 
     */
    public String rawContent() {
        return this.rawContent;
    }
    /**
     * @return The current state of the document.
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDocumentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String content;
        private String contentUri;
        private String displayName;
        private Boolean enableAutoReload;
        private List<String> knowledgeTypes;
        private GoogleCloudDialogflowV2beta1DocumentReloadStatusResponse latestReloadStatus;
        private Map<String,String> metadata;
        private String mimeType;
        private String name;
        private String rawContent;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDocumentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.contentUri = defaults.contentUri;
    	      this.displayName = defaults.displayName;
    	      this.enableAutoReload = defaults.enableAutoReload;
    	      this.knowledgeTypes = defaults.knowledgeTypes;
    	      this.latestReloadStatus = defaults.latestReloadStatus;
    	      this.metadata = defaults.metadata;
    	      this.mimeType = defaults.mimeType;
    	      this.name = defaults.name;
    	      this.rawContent = defaults.rawContent;
    	      this.state = defaults.state;
        }

        public Builder content(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }
        public Builder contentUri(String contentUri) {
            this.contentUri = Objects.requireNonNull(contentUri);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder enableAutoReload(Boolean enableAutoReload) {
            this.enableAutoReload = Objects.requireNonNull(enableAutoReload);
            return this;
        }
        public Builder knowledgeTypes(List<String> knowledgeTypes) {
            this.knowledgeTypes = Objects.requireNonNull(knowledgeTypes);
            return this;
        }
        public Builder knowledgeTypes(String... knowledgeTypes) {
            return knowledgeTypes(List.of(knowledgeTypes));
        }
        public Builder latestReloadStatus(GoogleCloudDialogflowV2beta1DocumentReloadStatusResponse latestReloadStatus) {
            this.latestReloadStatus = Objects.requireNonNull(latestReloadStatus);
            return this;
        }
        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public Builder mimeType(String mimeType) {
            this.mimeType = Objects.requireNonNull(mimeType);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder rawContent(String rawContent) {
            this.rawContent = Objects.requireNonNull(rawContent);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public GetDocumentResult build() {
            return new GetDocumentResult(content, contentUri, displayName, enableAutoReload, knowledgeTypes, latestReloadStatus, metadata, mimeType, name, rawContent, state);
        }
    }
}
