Synidcation SDK - JAVA
=======================

This is a java library for communicating with the Syndication APIs.
  CTAC Syndication 3.0 API.
  CTAC CMS_Manager 3.0 API.

-- Java6+

Building
---------------------------
The build system is [gradle](http://www.gradle.org). If you already have gradle installed, the project can be compiled simply by running:

	:::bash
		gradle build
		
If you do not have gradle installed, a gradle wrapper is included in the project (a self contained gradle instance). To build with the gradle wrapper:

	:::bash
		./gradlew build

Documentation
---------------------------
Documentation is in JavaDoc format, and can be generated as needed with gradle. If you already have gradle installed:

	:::bash
		gradle javadoc
		
without:

	:::bash
		gradlew javadoc

API
---------------------------

  - Client Website is registered to a CMS Manager belonging to Syndication.
  - Client Website registers a callback URL for receviing updates and messages.
  - Client Webiste is assigned an Id, an API Key.
  - Client Website includes the API Key in a http header with each api call.
