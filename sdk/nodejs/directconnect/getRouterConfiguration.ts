// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Data source for retrieving Router Configuration instructions for a given AWS Direct Connect Virtual Interface and Router Type.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.directconnect.getRouterConfiguration({
 *     routerTypeIdentifier: "CiscoSystemsInc-2900SeriesRouters-IOS124",
 *     virtualInterfaceId: "dxvif-abcde123",
 * });
 * ```
 */
export function getRouterConfiguration(args: GetRouterConfigurationArgs, opts?: pulumi.InvokeOptions): Promise<GetRouterConfigurationResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:directconnect/getRouterConfiguration:getRouterConfiguration", {
        "routerTypeIdentifier": args.routerTypeIdentifier,
        "virtualInterfaceId": args.virtualInterfaceId,
    }, opts);
}

/**
 * A collection of arguments for invoking getRouterConfiguration.
 */
export interface GetRouterConfigurationArgs {
    /**
     * ID of the Router Type. For example: `CiscoSystemsInc-2900SeriesRouters-IOS124`
     */
    routerTypeIdentifier: string;
    /**
     * ID of the Direct Connect Virtual Interface
     */
    virtualInterfaceId: string;
}

/**
 * A collection of values returned by getRouterConfiguration.
 */
export interface GetRouterConfigurationResult {
    /**
     * Instructions for configuring your router
     */
    readonly customerRouterConfig: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Router type identifier
     */
    readonly routerTypeIdentifier: string;
    /**
     * Block of the router type details
     */
    readonly routers: outputs.directconnect.GetRouterConfigurationRouter[];
    readonly virtualInterfaceId: string;
    readonly virtualInterfaceName: string;
}
/**
 * Data source for retrieving Router Configuration instructions for a given AWS Direct Connect Virtual Interface and Router Type.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.directconnect.getRouterConfiguration({
 *     routerTypeIdentifier: "CiscoSystemsInc-2900SeriesRouters-IOS124",
 *     virtualInterfaceId: "dxvif-abcde123",
 * });
 * ```
 */
export function getRouterConfigurationOutput(args: GetRouterConfigurationOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRouterConfigurationResult> {
    return pulumi.output(args).apply((a: any) => getRouterConfiguration(a, opts))
}

/**
 * A collection of arguments for invoking getRouterConfiguration.
 */
export interface GetRouterConfigurationOutputArgs {
    /**
     * ID of the Router Type. For example: `CiscoSystemsInc-2900SeriesRouters-IOS124`
     */
    routerTypeIdentifier: pulumi.Input<string>;
    /**
     * ID of the Direct Connect Virtual Interface
     */
    virtualInterfaceId: pulumi.Input<string>;
}
