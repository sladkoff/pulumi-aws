// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Iam
{
    public static class GetOpenidConnectProvider
    {
        /// <summary>
        /// This data source can be used to fetch information about a specific
        /// IAM OpenID Connect provider. By using this data source, you can retrieve the
        /// the resource information by either its `arn` or `url`.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.Iam.GetOpenidConnectProvider.Invoke(new()
        ///     {
        ///         Arn = "arn:aws:iam::123456789012:oidc-provider/accounts.google.com",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.Iam.GetOpenidConnectProvider.Invoke(new()
        ///     {
        ///         Url = "https://accounts.google.com",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetOpenidConnectProviderResult> InvokeAsync(GetOpenidConnectProviderArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetOpenidConnectProviderResult>("aws:iam/getOpenidConnectProvider:getOpenidConnectProvider", args ?? new GetOpenidConnectProviderArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can be used to fetch information about a specific
        /// IAM OpenID Connect provider. By using this data source, you can retrieve the
        /// the resource information by either its `arn` or `url`.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.Iam.GetOpenidConnectProvider.Invoke(new()
        ///     {
        ///         Arn = "arn:aws:iam::123456789012:oidc-provider/accounts.google.com",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.Iam.GetOpenidConnectProvider.Invoke(new()
        ///     {
        ///         Url = "https://accounts.google.com",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetOpenidConnectProviderResult> Invoke(GetOpenidConnectProviderInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetOpenidConnectProviderResult>("aws:iam/getOpenidConnectProvider:getOpenidConnectProvider", args ?? new GetOpenidConnectProviderInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetOpenidConnectProviderArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ARN of the OpenID Connect provider.
        /// </summary>
        [Input("arn")]
        public string? Arn { get; set; }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Map of resource tags for the IAM OIDC provider.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        /// <summary>
        /// URL of the OpenID Connect provider.
        /// </summary>
        [Input("url")]
        public string? Url { get; set; }

        public GetOpenidConnectProviderArgs()
        {
        }
        public static new GetOpenidConnectProviderArgs Empty => new GetOpenidConnectProviderArgs();
    }

    public sealed class GetOpenidConnectProviderInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ARN of the OpenID Connect provider.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of resource tags for the IAM OIDC provider.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// URL of the OpenID Connect provider.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public GetOpenidConnectProviderInvokeArgs()
        {
        }
        public static new GetOpenidConnectProviderInvokeArgs Empty => new GetOpenidConnectProviderInvokeArgs();
    }


    [OutputType]
    public sealed class GetOpenidConnectProviderResult
    {
        public readonly string Arn;
        /// <summary>
        /// List of client IDs (also known as audiences). When a mobile or web app registers with an OpenID Connect provider, they establish a value that identifies the application. (This is the value that's sent as the client_id parameter on OAuth requests.)
        /// </summary>
        public readonly ImmutableArray<string> ClientIdLists;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Map of resource tags for the IAM OIDC provider.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// List of server certificate thumbprints for the OpenID Connect (OIDC) identity provider's server certificate(s).
        /// </summary>
        public readonly ImmutableArray<string> ThumbprintLists;
        public readonly string Url;

        [OutputConstructor]
        private GetOpenidConnectProviderResult(
            string arn,

            ImmutableArray<string> clientIdLists,

            string id,

            ImmutableDictionary<string, string> tags,

            ImmutableArray<string> thumbprintLists,

            string url)
        {
            Arn = arn;
            ClientIdLists = clientIdLists;
            Id = id;
            Tags = tags;
            ThumbprintLists = thumbprintLists;
            Url = url;
        }
    }
}
