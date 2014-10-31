package com.wordnik.swagger.codegen

// import com.wordnik.swagger.codegen.BasicJavaGenerator

object OlsetJavaGenerator extends BasicJavaGenerator {
  def main(args: Array[String]) = generateClient(args)

  // package for models
  override def modelPackage: Option[String] = Some("com.olset.traveler.client.model")

  // package for api classes
  override def apiPackage: Option[String] = Some("com.olset.traveler.client.api")

  /**
   * you should override these params for generating the pom.xml and processing
   * additional params
   **/
  additionalParams ++= Map(
    "artifactId" -> "java-traveler-client",
    "artifactVersion" -> "1.0.0",
    "groupId" -> "com.olset")
}
