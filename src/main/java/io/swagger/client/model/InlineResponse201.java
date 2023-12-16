/*
 * Taxi Service API
 * API para el servicio de taxis
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InlineResponse201
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-16T22:23:21.937Z")
public class InlineResponse201 {
  @SerializedName("mensaje")
  private String mensaje = null;

  @SerializedName("cliente_id")
  private String clienteId = null;

  public InlineResponse201 mensaje(String mensaje) {
    this.mensaje = mensaje;
    return this;
  }

   /**
   * Mensaje de éxito
   * @return mensaje
  **/
  @ApiModelProperty(example = "Se ha registrado con éxito", value = "Mensaje de éxito")
  public String getMensaje() {
    return mensaje;
  }

  public void setMensaje(String mensaje) {
    this.mensaje = mensaje;
  }

  public InlineResponse201 clienteId(String clienteId) {
    this.clienteId = clienteId;
    return this;
  }

   /**
   * ID único del cliente registrado
   * @return clienteId
  **/
  @ApiModelProperty(example = "001", value = "ID único del cliente registrado")
  public String getClienteId() {
    return clienteId;
  }

  public void setClienteId(String clienteId) {
    this.clienteId = clienteId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse201 inlineResponse201 = (InlineResponse201) o;
    return Objects.equals(this.mensaje, inlineResponse201.mensaje) &&
        Objects.equals(this.clienteId, inlineResponse201.clienteId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mensaje, clienteId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse201 {\n");
    
    sb.append("    mensaje: ").append(toIndentedString(mensaje)).append("\n");
    sb.append("    clienteId: ").append(toIndentedString(clienteId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

