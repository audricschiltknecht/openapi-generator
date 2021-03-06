/**
* OpenAPI Petstore
* This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models

import org.openapitools.client.models.ReadOnlyFirst

import com.squareup.moshi.Json
import java.io.Serializable
/**
 * 
 * @param arrayOfString 
 * @param arrayArrayOfInteger 
 * @param arrayArrayOfModel 
 */

data class ArrayTest (
    @Json(name = "array_of_string")
    val arrayOfString: kotlin.Array<kotlin.String>? = null,
    @Json(name = "array_array_of_integer")
    val arrayArrayOfInteger: kotlin.Array<kotlin.Array<kotlin.Long>>? = null,
    @Json(name = "array_array_of_model")
    val arrayArrayOfModel: kotlin.Array<kotlin.Array<ReadOnlyFirst>>? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

