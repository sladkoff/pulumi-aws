// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Iam
{
    public static class GetAccountAlias
    {
        /// <summary>
        /// The IAM Account Alias data source allows access to the account alias
        /// for the effective account in which this provider is working.
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
        ///     var current = Aws.Iam.GetAccountAlias.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["accountId"] = current.Apply(getAccountAliasResult =&gt; getAccountAliasResult.AccountAlias),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetAccountAliasResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAccountAliasResult>("aws:iam/getAccountAlias:getAccountAlias", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetAccountAliasResult
    {
        /// <summary>
        /// Alias associated with the AWS account.
        /// </summary>
        public readonly string AccountAlias;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetAccountAliasResult(
            string accountAlias,

            string id)
        {
            AccountAlias = accountAlias;
            Id = id;
        }
    }
}
