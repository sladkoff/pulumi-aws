// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Outputs
{

    [OutputType]
    public sealed class WebAclRuleStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatch
    {
        /// <summary>
        /// Inspect all query arguments.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchAllQueryArguments? AllQueryArguments;
        /// <summary>
        /// Inspect the request body, which immediately follows the request headers. See `body` below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchBody? Body;
        /// <summary>
        /// Inspect the cookies in the web request. See `cookies` below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchCookies? Cookies;
        /// <summary>
        /// Inspect the request headers. See `headers` below for details.
        /// </summary>
        public readonly ImmutableArray<Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchHeader> Headers;
        /// <summary>
        /// Inspect the request body as JSON. See `json_body` for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchJsonBody? JsonBody;
        /// <summary>
        /// Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchMethod? Method;
        /// <summary>
        /// Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchQueryString? QueryString;
        /// <summary>
        /// Inspect a single header. See `single_header` below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchSingleHeader? SingleHeader;
        /// <summary>
        /// Inspect a single query argument. See `single_query_argument` below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchSingleQueryArgument? SingleQueryArgument;
        /// <summary>
        /// Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchUriPath? UriPath;

        [OutputConstructor]
        private WebAclRuleStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatch(
            Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchAllQueryArguments? allQueryArguments,

            Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchBody? body,

            Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchCookies? cookies,

            ImmutableArray<Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchHeader> headers,

            Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchJsonBody? jsonBody,

            Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchMethod? method,

            Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchQueryString? queryString,

            Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchSingleHeader? singleHeader,

            Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchSingleQueryArgument? singleQueryArgument,

            Outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchUriPath? uriPath)
        {
            AllQueryArguments = allQueryArguments;
            Body = body;
            Cookies = cookies;
            Headers = headers;
            JsonBody = jsonBody;
            Method = method;
            QueryString = queryString;
            SingleHeader = singleHeader;
            SingleQueryArgument = singleQueryArgument;
            UriPath = uriPath;
        }
    }
}
