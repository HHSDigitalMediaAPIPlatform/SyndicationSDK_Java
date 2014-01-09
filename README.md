Synidcation SDK - JAVA
=======================

This is a java library for communicating with the Syndication APIs.
  CTAC Syndication 3.0 API.
  CTAC CMS_Manager 3.0 API.

-- Java6+

Building
---------------------------
The build system is [gradle](http://www.gradle.org). If you already have gradle installed, the project can be compiled simply by running:

:::java
	gradle build


Documentation
---------------------------


API
---------------------------

  Client Website is registered to a CMS Manager belonging to Syndication.
  Client Website registers a callback URL for receviing updates and messages.
  Client Webiste is assigned an Id, an API Key.
  Client Website includes the API Key in a http header with each api call.
  

This is a random Javascript:   
 
        :::javascript
        if (window.name=='' || (window.name.indexOf('wicket') > -1 && window.name!='wicket-wicket:default')) {
        window.location="register/wicket:pageMapName/wicket-0" + (window.location.hash != null ? window.location.hash : "");
        }
 
This is some very random Java:
 
    :::java
        function foo() {
            int poo = 1;
                return;
        }
 
Here is some random Python
 
    :::python
        friends = ['john', 'pat', 'gary', 'michael']
        for i, name in enumerate(friends):
            print "iteration {iteration} is {name}".format(iteration=i, name=name)
 
Try your own!
