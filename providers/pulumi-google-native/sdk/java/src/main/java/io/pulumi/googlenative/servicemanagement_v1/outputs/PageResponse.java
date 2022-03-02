// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class PageResponse {
    /**
     * The Markdown content of the page. You can use (== include {path} ==) to include content from a Markdown file. The content can be used to produce the documentation page such as HTML format page.
     * 
     */
    private final String content;
    /**
     * The name of the page. It will be used as an identity of the page to generate URI of the page, text of the link to this page in navigation, etc. The full page name (start from the root page name to this page concatenated with `.`) can be used as reference to the page in your documentation. For example: pages: - name: Tutorial content: (== include tutorial.md ==) subpages: - name: Java content: (== include tutorial_java.md ==) You can reference `Java` page using Markdown reference link syntax: `Java`.
     * 
     */
    private final String name;
    /**
     * Subpages of this page. The order of subpages specified here will be honored in the generated docset.
     * 
     */
    private final List<PageResponse> subpages;

    @OutputCustomType.Constructor({"content","name","subpages"})
    private PageResponse(
        String content,
        String name,
        List<PageResponse> subpages) {
        this.content = Objects.requireNonNull(content);
        this.name = Objects.requireNonNull(name);
        this.subpages = Objects.requireNonNull(subpages);
    }

    /**
     * The Markdown content of the page. You can use (== include {path} ==) to include content from a Markdown file. The content can be used to produce the documentation page such as HTML format page.
     * 
    */
    public String getContent() {
        return this.content;
    }
    /**
     * The name of the page. It will be used as an identity of the page to generate URI of the page, text of the link to this page in navigation, etc. The full page name (start from the root page name to this page concatenated with `.`) can be used as reference to the page in your documentation. For example: pages: - name: Tutorial content: (== include tutorial.md ==) subpages: - name: Java content: (== include tutorial_java.md ==) You can reference `Java` page using Markdown reference link syntax: `Java`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Subpages of this page. The order of subpages specified here will be honored in the generated docset.
     * 
    */
    public List<PageResponse> getSubpages() {
        return this.subpages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String content;
        private String name;
        private List<PageResponse> subpages;

        public Builder() {
    	      // Empty
        }

        public Builder(PageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.name = defaults.name;
    	      this.subpages = defaults.subpages;
        }

        public Builder setContent(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSubpages(List<PageResponse> subpages) {
            this.subpages = Objects.requireNonNull(subpages);
            return this;
        }
        public PageResponse build() {
            return new PageResponse(content, name, subpages);
        }
    }
}
