// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBodyArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchCookiesArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchHeaderArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchJsonBodyArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethodArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPathArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs Empty = new WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @Import(name="allQueryArguments")
    private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;

    /**
     * @return Inspect all query arguments.
     * 
     */
    public Optional<Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs>> allQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }

    /**
     * Inspect the request body, which immediately follows the request headers. See `body` below for details.
     * 
     */
    @Import(name="body")
    private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBodyArgs> body;

    /**
     * @return Inspect the request body, which immediately follows the request headers. See `body` below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBodyArgs>> body() {
        return Optional.ofNullable(this.body);
    }

    /**
     * Inspect the cookies in the web request. See `cookies` below for details.
     * 
     */
    @Import(name="cookies")
    private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchCookiesArgs> cookies;

    /**
     * @return Inspect the cookies in the web request. See `cookies` below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchCookiesArgs>> cookies() {
        return Optional.ofNullable(this.cookies);
    }

    /**
     * Inspect the request headers. See `headers` below for details.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<List<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchHeaderArgs>> headers;

    /**
     * @return Inspect the request headers. See `headers` below for details.
     * 
     */
    public Optional<Output<List<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchHeaderArgs>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * Inspect the request body as JSON. See `json_body` for details.
     * 
     */
    @Import(name="jsonBody")
    private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchJsonBodyArgs> jsonBody;

    /**
     * @return Inspect the request body as JSON. See `json_body` for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchJsonBodyArgs>> jsonBody() {
        return Optional.ofNullable(this.jsonBody);
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
    private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethodArgs> method;

    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    public Optional<Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethodArgs>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
    private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> queryString;

    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    public Optional<Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs>> queryString() {
        return Optional.ofNullable(this.queryString);
    }

    /**
     * Inspect a single header. See `single_header` below for details.
     * 
     */
    @Import(name="singleHeader")
    private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;

    /**
     * @return Inspect a single header. See `single_header` below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs>> singleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }

    /**
     * Inspect a single query argument. See `single_query_argument` below for details.
     * 
     */
    @Import(name="singleQueryArgument")
    private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;

    /**
     * @return Inspect a single query argument. See `single_query_argument` below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs>> singleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
    private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> uriPath;

    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    public Optional<Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPathArgs>> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    private WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs() {}

    private WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs(WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs $) {
        this.allQueryArguments = $.allQueryArguments;
        this.body = $.body;
        this.cookies = $.cookies;
        this.headers = $.headers;
        this.jsonBody = $.jsonBody;
        this.method = $.method;
        this.queryString = $.queryString;
        this.singleHeader = $.singleHeader;
        this.singleQueryArgument = $.singleQueryArgument;
        this.uriPath = $.uriPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs $;

        public Builder() {
            $ = new WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs();
        }

        public Builder(WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs defaults) {
            $ = new WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allQueryArguments Inspect all query arguments.
         * 
         * @return builder
         * 
         */
        public Builder allQueryArguments(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments) {
            $.allQueryArguments = allQueryArguments;
            return this;
        }

        /**
         * @param allQueryArguments Inspect all query arguments.
         * 
         * @return builder
         * 
         */
        public Builder allQueryArguments(WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs allQueryArguments) {
            return allQueryArguments(Output.of(allQueryArguments));
        }

        /**
         * @param body Inspect the request body, which immediately follows the request headers. See `body` below for details.
         * 
         * @return builder
         * 
         */
        public Builder body(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBodyArgs> body) {
            $.body = body;
            return this;
        }

        /**
         * @param body Inspect the request body, which immediately follows the request headers. See `body` below for details.
         * 
         * @return builder
         * 
         */
        public Builder body(WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBodyArgs body) {
            return body(Output.of(body));
        }

        /**
         * @param cookies Inspect the cookies in the web request. See `cookies` below for details.
         * 
         * @return builder
         * 
         */
        public Builder cookies(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchCookiesArgs> cookies) {
            $.cookies = cookies;
            return this;
        }

        /**
         * @param cookies Inspect the cookies in the web request. See `cookies` below for details.
         * 
         * @return builder
         * 
         */
        public Builder cookies(WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchCookiesArgs cookies) {
            return cookies(Output.of(cookies));
        }

        /**
         * @param headers Inspect the request headers. See `headers` below for details.
         * 
         * @return builder
         * 
         */
        public Builder headers(@Nullable Output<List<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchHeaderArgs>> headers) {
            $.headers = headers;
            return this;
        }

        /**
         * @param headers Inspect the request headers. See `headers` below for details.
         * 
         * @return builder
         * 
         */
        public Builder headers(List<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchHeaderArgs> headers) {
            return headers(Output.of(headers));
        }

        /**
         * @param headers Inspect the request headers. See `headers` below for details.
         * 
         * @return builder
         * 
         */
        public Builder headers(WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchHeaderArgs... headers) {
            return headers(List.of(headers));
        }

        /**
         * @param jsonBody Inspect the request body as JSON. See `json_body` for details.
         * 
         * @return builder
         * 
         */
        public Builder jsonBody(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchJsonBodyArgs> jsonBody) {
            $.jsonBody = jsonBody;
            return this;
        }

        /**
         * @param jsonBody Inspect the request body as JSON. See `json_body` for details.
         * 
         * @return builder
         * 
         */
        public Builder jsonBody(WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchJsonBodyArgs jsonBody) {
            return jsonBody(Output.of(jsonBody));
        }

        /**
         * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
         * 
         * @return builder
         * 
         */
        public Builder method(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethodArgs> method) {
            $.method = method;
            return this;
        }

        /**
         * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
         * 
         * @return builder
         * 
         */
        public Builder method(WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethodArgs method) {
            return method(Output.of(method));
        }

        /**
         * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
         * 
         * @return builder
         * 
         */
        public Builder queryString(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> queryString) {
            $.queryString = queryString;
            return this;
        }

        /**
         * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
         * 
         * @return builder
         * 
         */
        public Builder queryString(WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs queryString) {
            return queryString(Output.of(queryString));
        }

        /**
         * @param singleHeader Inspect a single header. See `single_header` below for details.
         * 
         * @return builder
         * 
         */
        public Builder singleHeader(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> singleHeader) {
            $.singleHeader = singleHeader;
            return this;
        }

        /**
         * @param singleHeader Inspect a single header. See `single_header` below for details.
         * 
         * @return builder
         * 
         */
        public Builder singleHeader(WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs singleHeader) {
            return singleHeader(Output.of(singleHeader));
        }

        /**
         * @param singleQueryArgument Inspect a single query argument. See `single_query_argument` below for details.
         * 
         * @return builder
         * 
         */
        public Builder singleQueryArgument(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument) {
            $.singleQueryArgument = singleQueryArgument;
            return this;
        }

        /**
         * @param singleQueryArgument Inspect a single query argument. See `single_query_argument` below for details.
         * 
         * @return builder
         * 
         */
        public Builder singleQueryArgument(WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs singleQueryArgument) {
            return singleQueryArgument(Output.of(singleQueryArgument));
        }

        /**
         * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
         * 
         * @return builder
         * 
         */
        public Builder uriPath(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> uriPath) {
            $.uriPath = uriPath;
            return this;
        }

        /**
         * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
         * 
         * @return builder
         * 
         */
        public Builder uriPath(WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPathArgs uriPath) {
            return uriPath(Output.of(uriPath));
        }

        public WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs build() {
            return $;
        }
    }

}
