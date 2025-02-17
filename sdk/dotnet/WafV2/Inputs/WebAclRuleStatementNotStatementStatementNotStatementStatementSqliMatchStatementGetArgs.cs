// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Inputs
{

    public sealed class WebAclRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Part of a web request that you want AWS WAF to inspect. See `field_to_match` below for details.
        /// </summary>
        [Input("fieldToMatch")]
        public Input<Inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchGetArgs>? FieldToMatch { get; set; }

        [Input("textTransformations", required: true)]
        private InputList<Inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementTextTransformationGetArgs>? _textTransformations;

        /// <summary>
        /// Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
        /// At least one required.
        /// See `text_transformation` below for details.
        /// </summary>
        public InputList<Inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementTextTransformationGetArgs> TextTransformations
        {
            get => _textTransformations ?? (_textTransformations = new InputList<Inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementTextTransformationGetArgs>());
            set => _textTransformations = value;
        }

        public WebAclRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementGetArgs()
        {
        }
        public static new WebAclRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementGetArgs Empty => new WebAclRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementGetArgs();
    }
}
