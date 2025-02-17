// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2
{
    /// <summary>
    /// Provides a security group resource.
    /// 
    /// &gt; **NOTE on Security Groups and Security Group Rules:** This provider currently provides a Security Group resource with `ingress` and `egress` rules defined in-line and a Security Group Rule resource which manages one or more `ingress` or
    /// `egress` rules. Both of these resource were added before AWS assigned a [security group rule unique ID](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules.html), and they do not work well in all scenarios using the`description` and `tags` attributes, which rely on the unique ID.
    /// The `aws_vpc_security_group_egress_rule` and `aws_vpc_security_group_ingress_rule` resources have been added to address these limitations and should be used for all new security group rules.
    /// You should not use the `aws_vpc_security_group_egress_rule` and `aws_vpc_security_group_ingress_rule` resources in conjunction with an `aws.ec2.SecurityGroup` resource with in-line rules or with `aws.ec2.SecurityGroupRule` resources defined for the same Security Group, as rule conflicts may occur and rules will be overwritten.
    /// 
    /// &gt; **NOTE:** Referencing Security Groups across VPC peering has certain restrictions. More information is available in the [VPC Peering User Guide](https://docs.aws.amazon.com/vpc/latest/peering/vpc-peering-security-groups.html).
    /// 
    /// &gt; **NOTE:** Due to [AWS Lambda improved VPC networking changes that began deploying in September 2019](https://aws.amazon.com/blogs/compute/announcing-improved-vpc-networking-for-aws-lambda-functions/), security groups associated with Lambda Functions can take up to 45 minutes to successfully delete.
    /// 
    /// &gt; **NOTE:** The `cidr_blocks` and `ipv6_cidr_blocks` parameters are optional in the `ingress` and `egress` blocks. If nothing is specified, traffic will be blocked as described in _NOTE on Egress rules_ later.
    /// 
    /// ## Example Usage
    /// ### Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var allowTls = new Aws.Ec2.SecurityGroup("allowTls", new()
    ///     {
    ///         Description = "Allow TLS inbound traffic",
    ///         VpcId = aws_vpc.Main.Id,
    ///         Ingress = new[]
    ///         {
    ///             new Aws.Ec2.Inputs.SecurityGroupIngressArgs
    ///             {
    ///                 Description = "TLS from VPC",
    ///                 FromPort = 443,
    ///                 ToPort = 443,
    ///                 Protocol = "tcp",
    ///                 CidrBlocks = new[]
    ///                 {
    ///                     aws_vpc.Main.Cidr_block,
    ///                 },
    ///                 Ipv6CidrBlocks = new[]
    ///                 {
    ///                     aws_vpc.Main.Ipv6_cidr_block,
    ///                 },
    ///             },
    ///         },
    ///         Egress = new[]
    ///         {
    ///             new Aws.Ec2.Inputs.SecurityGroupEgressArgs
    ///             {
    ///                 FromPort = 0,
    ///                 ToPort = 0,
    ///                 Protocol = "-1",
    ///                 CidrBlocks = new[]
    ///                 {
    ///                     "0.0.0.0/0",
    ///                 },
    ///                 Ipv6CidrBlocks = new[]
    ///                 {
    ///                     "::/0",
    ///                 },
    ///             },
    ///         },
    ///         Tags = 
    ///         {
    ///             { "Name", "allow_tls" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// &gt; **NOTE on Egress rules:** By default, AWS creates an `ALLOW ALL` egress rule when creating a new Security Group inside of a VPC. When creating a new Security Group inside a VPC, **this provider will remove this default rule**, and require you specifically re-create it if you desire that rule. We feel this leads to fewer surprises in terms of controlling your egress rules. If you desire this rule to be in place, you can use this `egress` block:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Ec2.SecurityGroup("example", new()
    ///     {
    ///         Egress = new[]
    ///         {
    ///             new Aws.Ec2.Inputs.SecurityGroupEgressArgs
    ///             {
    ///                 CidrBlocks = new[]
    ///                 {
    ///                     "0.0.0.0/0",
    ///                 },
    ///                 FromPort = 0,
    ///                 Ipv6CidrBlocks = new[]
    ///                 {
    ///                     "::/0",
    ///                 },
    ///                 Protocol = "-1",
    ///                 ToPort = 0,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Usage With Prefix List IDs
    /// 
    /// Prefix Lists are either managed by AWS internally, or created by the customer using a
    /// Prefix List resource. Prefix Lists provided by
    /// AWS are associated with a prefix list name, or service name, that is linked to a specific region.
    /// Prefix list IDs are exported on VPC Endpoints, so you can use this format:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var myEndpoint = new Aws.Ec2.VpcEndpoint("myEndpoint");
    /// 
    ///     // ... other configuration ...
    ///     // ... other configuration ...
    ///     var example = new Aws.Ec2.SecurityGroup("example", new()
    ///     {
    ///         Egress = new[]
    ///         {
    ///             new Aws.Ec2.Inputs.SecurityGroupEgressArgs
    ///             {
    ///                 FromPort = 0,
    ///                 ToPort = 0,
    ///                 Protocol = "-1",
    ///                 PrefixListIds = new[]
    ///                 {
    ///                     myEndpoint.PrefixListId,
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// You can also find a specific Prefix List using the `aws.ec2.getPrefixList` data source.
    /// ### Change of name or name-prefix value
    /// 
    /// Security Group's Name [cannot be edited after the resource is created](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/working-with-security-groups.html#creating-security-group). In fact, the `name` and `name-prefix` arguments force the creation of a new Security Group resource when they change value. In that case, this provider first deletes the existing Security Group resource and then it creates a new one. If the existing Security Group is associated to a Network Interface resource, the deletion cannot complete. The reason is that Network Interface resources cannot be left with no Security Group attached and the new one is not yet available at that point.
    /// 
    /// You must invert the default behavior of the provider. That is, first the new Security Group resource must be created, then associated to possible Network Interface resources and finally the old Security Group can be detached and deleted. To force this behavior, you must set the create_before_destroy property:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var sgWithChangeableName = new Aws.Ec2.SecurityGroup("sgWithChangeableName");
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Security Groups can be imported using the `security group id`, e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:ec2/securityGroup:SecurityGroup elb_sg sg-903004f8
    /// ```
    /// </summary>
    [AwsResourceType("aws:ec2/securityGroup:SecurityGroup")]
    public partial class SecurityGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ARN of the security group.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Security group description. Defaults to `Managed by Pulumi`. Cannot be `""`. **NOTE**: This field maps to the AWS `GroupDescription` attribute, for which there is no Update API. If you'd like to classify your security groups in a way that can be updated, use `tags`.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// Configuration block for egress rules. Can be specified multiple times for each egress rule. Each egress block supports fields documented below. This argument is processed in attribute-as-blocks mode.
        /// </summary>
        [Output("egress")]
        public Output<ImmutableArray<Outputs.SecurityGroupEgress>> Egress { get; private set; } = null!;

        /// <summary>
        /// Configuration block for ingress rules. Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below. This argument is processed in attribute-as-blocks mode.
        /// </summary>
        [Output("ingress")]
        public Output<ImmutableArray<Outputs.SecurityGroupIngress>> Ingress { get; private set; } = null!;

        /// <summary>
        /// Name of the security group. If omitted, this provider will assign a random, unique name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
        /// </summary>
        [Output("namePrefix")]
        public Output<string> NamePrefix { get; private set; } = null!;

        /// <summary>
        /// Owner ID.
        /// </summary>
        [Output("ownerId")]
        public Output<string> OwnerId { get; private set; } = null!;

        /// <summary>
        /// Instruct the provider to revoke all of the Security Groups attached ingress and egress rules before deleting the rule itself. This is normally not needed, however certain AWS services such as Elastic Map Reduce may automatically add required rules to security groups used with the service, and those rules may contain a cyclic dependency that prevent the security groups from being destroyed without removing the dependency first. Default `false`.
        /// </summary>
        [Output("revokeRulesOnDelete")]
        public Output<bool?> RevokeRulesOnDelete { get; private set; } = null!;

        /// <summary>
        /// Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// VPC ID.
        /// Defaults to the region's default VPC.
        /// </summary>
        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;


        /// <summary>
        /// Create a SecurityGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SecurityGroup(string name, SecurityGroupArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:ec2/securityGroup:SecurityGroup", name, args ?? new SecurityGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SecurityGroup(string name, Input<string> id, SecurityGroupState? state = null, CustomResourceOptions? options = null)
            : base("aws:ec2/securityGroup:SecurityGroup", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SecurityGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SecurityGroup Get(string name, Input<string> id, SecurityGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new SecurityGroup(name, id, state, options);
        }
    }

    public sealed class SecurityGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Security group description. Defaults to `Managed by Pulumi`. Cannot be `""`. **NOTE**: This field maps to the AWS `GroupDescription` attribute, for which there is no Update API. If you'd like to classify your security groups in a way that can be updated, use `tags`.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("egress")]
        private InputList<Inputs.SecurityGroupEgressArgs>? _egress;

        /// <summary>
        /// Configuration block for egress rules. Can be specified multiple times for each egress rule. Each egress block supports fields documented below. This argument is processed in attribute-as-blocks mode.
        /// </summary>
        public InputList<Inputs.SecurityGroupEgressArgs> Egress
        {
            get => _egress ?? (_egress = new InputList<Inputs.SecurityGroupEgressArgs>());
            set => _egress = value;
        }

        [Input("ingress")]
        private InputList<Inputs.SecurityGroupIngressArgs>? _ingress;

        /// <summary>
        /// Configuration block for ingress rules. Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below. This argument is processed in attribute-as-blocks mode.
        /// </summary>
        public InputList<Inputs.SecurityGroupIngressArgs> Ingress
        {
            get => _ingress ?? (_ingress = new InputList<Inputs.SecurityGroupIngressArgs>());
            set => _ingress = value;
        }

        /// <summary>
        /// Name of the security group. If omitted, this provider will assign a random, unique name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
        /// </summary>
        [Input("namePrefix")]
        public Input<string>? NamePrefix { get; set; }

        /// <summary>
        /// Instruct the provider to revoke all of the Security Groups attached ingress and egress rules before deleting the rule itself. This is normally not needed, however certain AWS services such as Elastic Map Reduce may automatically add required rules to security groups used with the service, and those rules may contain a cyclic dependency that prevent the security groups from being destroyed without removing the dependency first. Default `false`.
        /// </summary>
        [Input("revokeRulesOnDelete")]
        public Input<bool>? RevokeRulesOnDelete { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// VPC ID.
        /// Defaults to the region's default VPC.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public SecurityGroupArgs()
        {
            Description = "Managed by Pulumi";
        }
        public static new SecurityGroupArgs Empty => new SecurityGroupArgs();
    }

    public sealed class SecurityGroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the security group.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Security group description. Defaults to `Managed by Pulumi`. Cannot be `""`. **NOTE**: This field maps to the AWS `GroupDescription` attribute, for which there is no Update API. If you'd like to classify your security groups in a way that can be updated, use `tags`.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("egress")]
        private InputList<Inputs.SecurityGroupEgressGetArgs>? _egress;

        /// <summary>
        /// Configuration block for egress rules. Can be specified multiple times for each egress rule. Each egress block supports fields documented below. This argument is processed in attribute-as-blocks mode.
        /// </summary>
        public InputList<Inputs.SecurityGroupEgressGetArgs> Egress
        {
            get => _egress ?? (_egress = new InputList<Inputs.SecurityGroupEgressGetArgs>());
            set => _egress = value;
        }

        [Input("ingress")]
        private InputList<Inputs.SecurityGroupIngressGetArgs>? _ingress;

        /// <summary>
        /// Configuration block for ingress rules. Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below. This argument is processed in attribute-as-blocks mode.
        /// </summary>
        public InputList<Inputs.SecurityGroupIngressGetArgs> Ingress
        {
            get => _ingress ?? (_ingress = new InputList<Inputs.SecurityGroupIngressGetArgs>());
            set => _ingress = value;
        }

        /// <summary>
        /// Name of the security group. If omitted, this provider will assign a random, unique name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
        /// </summary>
        [Input("namePrefix")]
        public Input<string>? NamePrefix { get; set; }

        /// <summary>
        /// Owner ID.
        /// </summary>
        [Input("ownerId")]
        public Input<string>? OwnerId { get; set; }

        /// <summary>
        /// Instruct the provider to revoke all of the Security Groups attached ingress and egress rules before deleting the rule itself. This is normally not needed, however certain AWS services such as Elastic Map Reduce may automatically add required rules to security groups used with the service, and those rules may contain a cyclic dependency that prevent the security groups from being destroyed without removing the dependency first. Default `false`.
        /// </summary>
        [Input("revokeRulesOnDelete")]
        public Input<bool>? RevokeRulesOnDelete { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// VPC ID.
        /// Defaults to the region's default VPC.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public SecurityGroupState()
        {
            Description = "Managed by Pulumi";
        }
        public static new SecurityGroupState Empty => new SecurityGroupState();
    }
}
