// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Inputs
{

    public sealed class RuleGroupRuleStatementAndStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchSingleQueryArgumentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the query header to inspect. This setting must be provided as lower case characters.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public RuleGroupRuleStatementAndStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchSingleQueryArgumentArgs()
        {
        }
        public static new RuleGroupRuleStatementAndStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchSingleQueryArgumentArgs Empty => new RuleGroupRuleStatementAndStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchSingleQueryArgumentArgs();
    }
}
