Synidcation SDK - JAVA
=======================

This is a java library for communicating with the Syndication APIs.
  CTAC Syndication 3.0 API.
  CTAC CMS_Manager 3.0 API.

Requirements
---------------------------
- Java 1.5 or newer

Building
---------------------------
The build system is [gradle](http://www.gradle.org). If you already have gradle installed, then use the commands specified below. If you do not have gradle, you can use the gradle wrapper. Substitute any `gradle` commands listed with `./gradlew`.

	:::bash
		gradle build
		
By default, jars that are created either by result of the `build` task, or the `jar` task are fat. That is to say that they include any dependencies within the jar codebase. If you would like to manage dependencies yourself, try:

	:::bash
		gradle skinnyjar

You will be responsible for managing the classpath yourself using this technique.

Documentation
---------------------------
Documentation is in JavaDoc format, and can be generated as needed with gradle:

	:::bash
		gradle javadoc
		
Documentation files are created in projectRoot/build/docs.

API
---------------------------
  - Client Website is registered to a CMS Manager belonging to Syndication.
  - Client Website registers a callback URL for receviing updates and messages.
  - Client Webiste is assigned an Id, an API Key.
  - Client Website includes the API Key in a http header with each api call.
