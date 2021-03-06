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


import com.squareup.moshi.Json
import java.io.Serializable
/**
 * 
 * @param enumFormStringArray Form parameter enum test (string array)
 * @param enumFormString Form parameter enum test (string)
 */

data class InlineObject2 (
    /* Form parameter enum test (string array) */
    @Json(name = "enum_form_string_array")
    val enumFormStringArray: kotlin.Array<InlineObject2.EnumFormStringArray>? = null,
    /* Form parameter enum test (string) */
    @Json(name = "enum_form_string")
    val enumFormString: InlineObject2.EnumFormString? = null
) 
: Serializable 

{
	companion object {
		private const val serialVersionUID: Long = 123
	}
    /**
    * Form parameter enum test (string array)
    * Values: greaterThan,dollar
    */
    
    enum class EnumFormStringArray(val value: kotlin.String){
        @Json(name = ">") greaterThan(">"),
        @Json(name = "$") dollar("$");
    }
    /**
    * Form parameter enum test (string)
    * Values: abc,minusEfg,leftParenthesisXyzRightParenthesis
    */
    
    enum class EnumFormString(val value: kotlin.String){
        @Json(name = "_abc") abc("_abc"),
        @Json(name = "-efg") minusEfg("-efg"),
        @Json(name = "(xyz)") leftParenthesisXyzRightParenthesis("(xyz)");
    }
}

