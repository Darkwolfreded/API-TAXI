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
 * Cliente
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-16T22:23:21.937Z")
public class Cliente {
  @SerializedName("nombre")
  private String nombre = null;

  @SerializedName("telefono")
  private String telefono = null;

  @SerializedName("dni")
  private String dni = null;

  public Cliente nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

   /**
   * Nombre completo del cliente
   * @return nombre
  **/
  @ApiModelProperty(example = "Estefano Quito", required = true, value = "Nombre completo del cliente")
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Cliente telefono(String telefono) {
    this.telefono = telefono;
    return this;
  }

   /**
   * Número de teléfono del cliente
   * @return telefono
  **/
  @ApiModelProperty(example = "942969269", required = true, value = "Número de teléfono del cliente")
  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public Cliente dni(String dni) {
    this.dni = dni;
    return this;
  }

   /**
   * Número de DNI del cliente
   * @return dni
  **/
  @ApiModelProperty(example = "75415051", required = true, value = "Número de DNI del cliente")
  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cliente cliente = (Cliente) o;
    return Objects.equals(this.nombre, cliente.nombre) &&
        Objects.equals(this.telefono, cliente.telefono) &&
        Objects.equals(this.dni, cliente.dni);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre, telefono, dni);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cliente {\n");
    
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
    sb.append("    dni: ").append(toIndentedString(dni)).append("\n");
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

