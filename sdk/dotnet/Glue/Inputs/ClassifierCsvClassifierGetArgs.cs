// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Glue.Inputs
{

    public sealed class ClassifierCsvClassifierGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enables the processing of files that contain only one column.
        /// </summary>
        [Input("allowSingleColumn")]
        public Input<bool>? AllowSingleColumn { get; set; }

        /// <summary>
        /// Indicates whether the CSV file contains a header. This can be one of "ABSENT", "PRESENT", or "UNKNOWN".
        /// </summary>
        [Input("containsHeader")]
        public Input<string>? ContainsHeader { get; set; }

        /// <summary>
        /// A custom symbol to denote what combines content into a single column value. It must be different from the column delimiter.
        /// </summary>
        [Input("customDatatypeConfigured")]
        public Input<bool>? CustomDatatypeConfigured { get; set; }

        [Input("customDatatypes")]
        private InputList<string>? _customDatatypes;

        /// <summary>
        /// A list of supported custom datatypes. Valid values are `BINARY`, `BOOLEAN`, `DATE`, `DECIMAL`, `DOUBLE`, `FLOAT`, `INT`, `LONG`, `SHORT`, `STRING`, `TIMESTAMP`.
        /// </summary>
        public InputList<string> CustomDatatypes
        {
            get => _customDatatypes ?? (_customDatatypes = new InputList<string>());
            set => _customDatatypes = value;
        }

        /// <summary>
        /// The delimiter used in the Csv to separate columns.
        /// </summary>
        [Input("delimiter")]
        public Input<string>? Delimiter { get; set; }

        /// <summary>
        /// Specifies whether to trim column values.
        /// </summary>
        [Input("disableValueTrimming")]
        public Input<bool>? DisableValueTrimming { get; set; }

        [Input("headers")]
        private InputList<string>? _headers;

        /// <summary>
        /// A list of strings representing column names.
        /// </summary>
        public InputList<string> Headers
        {
            get => _headers ?? (_headers = new InputList<string>());
            set => _headers = value;
        }

        /// <summary>
        /// A custom symbol to denote what combines content into a single column value. It must be different from the column delimiter.
        /// </summary>
        [Input("quoteSymbol")]
        public Input<string>? QuoteSymbol { get; set; }

        public ClassifierCsvClassifierGetArgs()
        {
        }
        public static new ClassifierCsvClassifierGetArgs Empty => new ClassifierCsvClassifierGetArgs();
    }
}
