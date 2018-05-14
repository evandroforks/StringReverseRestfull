# Desafio de desenvolvimento

Desenvolva uma aplicação web que permita ao usuário inserir um texto qualquer e que o sistema retorne o inverso dessa string.

Exemplo: ao inserir o texto `"bridge"`, o sistema retorna na tela a resposta `"egdirb"`.

A operação de inversão de string deve ser **obrigatoriamente** executada no backend da aplicação.

## Requisitos técnicos

* Utilize Java 8 para o backend
* Utilize a tecnologia de sua preferência para o frontend
* Monte o design da aplicação de acordo com sua preferência
* Utilize Git para versionamento de seu código

## Extras

Os seguintes itens são opcionais e valerão pontos extras no desafio:

* Apresente na tela o histórico de todas as strings previamente enviadas pelo usuário
* Utilize uma API REST de comunicação entre o backend e o frontend da aplicação
* Utilize testes unitários
* Utilize React, Angular ou Vue no frontend da aplicação

## Instruções de envio

* Inclua no arquivo `README.md` as instruções para execução e uma breve descrição das tecnologias utilizadas, junto com seu nome completo.
* Serão aceitos somentes commits feitos até o dia **13/05 às 23h59**.


___
## Instructions by Evandro Coan

The used tools were Java 8 as backend runner for the Servlet's with,
Java Server Pages (.jsp) and Java Server Faces (.xhtml with facelets) pages for generating
the frontend HTMl pages based on the processed input from the Java 8 backend application.

The Servlet Container used was Tomcat 9.
Initially was attempted to use Payara 5,
however could not be found an out-of-the-box integration with Eclipse or Netbeans IDE's.
Therefore,
given the limited time to implement and deploy the application,
was chosen to stick up with the well know and integrated Apache Tomcat Servlet Container.

There are 4 Eclipse projects included on this repository.
Among them, the one which is most important is **StringReverseRestfull**:

1. **StringReverseRestfull** this one was the last implemented,
   after learning better about Java Server technologies.
   For running it,
   was chosen Jersey because seemed to better integrate with the current Servlet Container Apache Tomcat 9.
   Jersey was chosen because it is one of the implementations of JAX-RS Specification for Java Restful Web Services.
1. **StringReverseServlet** Uses the old and well know Java Server Pages technology.
   This was the first implemented project because seemed more easy to do things with it.
   However, after implementing it,
   it seemed too create much boiler plate code.
   Hence,
1. **StringReverseFacelets** was implemented seeking a newer,
   simple and more maintainable technology.
   Lastly,
   but not less important,
1. **HelloWorldServlet** contains the initial Servlets applications,
   created while installing/setting up the Servlet Container server,
   used on this challenge development.


### Downloads

1. Download the Tomcat 9 Servlet Container from https://tomcat.apache.org/download-90.cgi
1. Unpack it to `C:\Bridge\apache-tomcat-9.0.8`
1. Download the latest version of [Eclipse IDE for Java EE Developers](http://www.eclipse.org/downloads/eclipse-packages/)
1. Unpack it to `C:\Bridge\eclipse`
1. Download the JDK 8 from http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
1. Unpack it to `C:\Bridge\Java8JDK`
1. Download and install on the system path NodeJS from https://nodejs.org/en/
1. Download and install on the system path `rsync` from https://rsync.samba.org/


### Tomcat setup on Eclipse

1. Open Eclipse and select the `Java EE` Perspective
1. Select the tab/view `Servers` and hit `Create a new server`
   1. Under the server's list, select `Apache -> Tomcat 9`, and *hit next*
   1. Select the directory `C:\Bridge\apache-tomcat-9.0.8` as the Tomcat directory
   1. Select the directory `C:\Bridge\Java8JDK` as the Java Virtual Machine required
   1. Hit next until finish
   1. Also on the Servers' tab/view, right click on the created server and select `Properties`
   1. Now, select the button `Switch Location` and then `Apply and Close`
1. Also, on the Server's tab/view, double click on the recent created server.
   1. On the opened page, select `Use Tomcat installation (takes control of Tomcat installation)` under `Server Locations`
   1. Press `Ctrl+S` to save the changes and close the page

Opcional steps for admin access on the Tomcat 9 Servlet Container:
1. On the Eclipse Project Explorer tab/view, select the `Tomcat 9.0 Server at localhost-config`
   1. Select and open the file `tomcat-users.xml` as plain text and add the following contents
      ```
      <role rolename="manager"/>
      <user username="admin" password="admin" roles="manager-gui,manager-script,manager-status,manager-jmx,admin-script,admin-gui"/>
      ```
1. Go to the file `C:\Bridge\apache-tomcat-9.0.8\webapps\manager\META-INF\context.xml` and comment out the lines
    ```
    <!--   <Valve className="org.apache.catalina.valves.RemoteAddrValve"
             allow="127\.\d+\.\d+\.\d+|::1|0:0:0:0:0:0:0:1" /> -->
    ```


#### Installation references
<details>
<p>

1. http://www.srccodes.com/p/article/3/Tomcat-Hello-World-Servlet-using-Eclipse-IDE
1. https://stackoverflow.com/questions/16517659/tomcat-7-overrides-the-tomcat-users-xml-when-using-eclipse
1. https://stackoverflow.com/questions/11731377/servlet-returns-http-status-404-the-requested-resource-servlet-is-not-availa
1. https://stackoverflow.com/questions/43189901/eclipse-neon-w-tomcat-9-new-servlet-http-status-404-not-found
1. https://stackoverflow.com/questions/43232878/apache-tomcat-9-unable-to-access-manager-webapp
1. https://stackoverflow.com/questions/1321933/how-do-i-set-tomcat-manager-application-user-name-and-password-for-netbeans
1. https://stackoverflow.com/questions/18122336/cannot-change-version-of-project-facet-dynamic-web-module-to-3-0
1. https://stackoverflow.com/questions/48649041/eclipse-irreversible-dynamic-web-module-4-0-selection-tomcat-9-doesnt-support
1. https://stackoverflow.com/questions/3805262/what-is-a-servlets-display-name-for
1. https://www.pegaxchange.com/2016/09/02/java-eclipse-tomcat/
1. https://stackoverflow.com/questions/14854760/not-getting-automatically-web-xml-file-while-creating-servlet-in-eclipse-juno-4
1. https://tomcat.apache.org/tomcat-9.0-doc/default-servlet.html
1. https://stackoverflow.com/questions/31248977/eclipse-tomcat-not-updating
1. https://stackoverflow.com/questions/11818384/how-to-add-pom-xml-to-existing-eclipse-project
1. https://stackoverflow.com/questions/10972770/how-to-add-maven-repository-jars-to-eclipse-buildpath
1. https://stackoverflow.com/questions/8884818/eclipse-warning-xxxxxxxxxxx-jar-will-not-be-exported-or-published-runtime-clas
1. https://github.com/javaserverfaces/mojarra
1. https://mvnrepository.com/artifact/org.glassfish/javax.faces
1. https://stackoverflow.com/questions/42611249/import-javax-enterprise-context-in-eclipse
1. http://help.eclipse.org/kepler/index.jsp?topic=%2Forg.eclipse.jst.jsf.doc.user%2Fhtml%2Fgettingstarted%2Ftutorial%2FJSFTools_tutorial_JSF20.html
1. https://stackoverflow.com/questions/46750501/what-jersey-version-do-i-need-to-download-for-jdk-1-9
1. https://howtodoinjava.com/jersey/jersey-2-hello-world-application-tutorial/
1. https://docs.npmjs.com/files/package.json
1. https://www.tutorialspoint.com/reactjs/reactjs_environment_setup.htm
1. https://stackoverflow.com/questions/3131878/how-do-i-remove-javascript-validation-from-my-eclipse-project
1. https://github.com/facebook/create-react-app
1. https://docs.npmjs.com/cli/install
1. https://stackoverflow.com/questions/42772860/how-to-make-create-react-app-auto-build
1. https://www.npmjs.com/package/cra-build-watch
1. https://www.fullstackreact.com/articles/using-create-react-app-with-a-server/
</p>
</details><br>


### Running the application

1. After completing the **Setup** and **Installation** process,
   go to the Eclipse menu `File -> Import...`
1. Then, type `Projects from Folder or Archive` on the `Select an import wizard` and hit next
1. On the `Import source` field type the address to this cloned repository project directory, for example,
   `C:\Bridge\desafio-de-desenvolvimento-evandrocoan`
   1. And then select the three created projects to import:
      1. `StringReverseServlet`,
      1. `StringReverseFacelets` and
      1. `StringReverseRestfull`
1. And hit `Finish`
1. Now on Eclipse Project Explorer tab/view,
   one project by time, right click on each imported project and select `Run As -> Run on Server`
1. Then, select the just created server on the *Tomcat setup on Eclipse* section and hit `Finish`


#### Building ReactJS files

1. Open a command line on the folder `C:\Bridge\desafio-de-desenvolvimento-evandrocoan\StringReverseRestfull\src-react`
1. Then, run these commands:
   ```
   npm run install
   npm run build
   ```
1. Optionally,
   you can run the command `npm run start` and a proxy server will start running on the address `http://localhost:3000/`.
   This server will be forwarding all Rest API calls to the address `http://localhost:8080/StringReverseRestfull/api/`

Now,
you can access the **StringReverse** application by going on your Web Browser and typing the following addresses:
```
http://localhost:8080/StringReverseRestfull/app/
http://localhost:8080/StringReverseServlet/
http://localhost:8080/StringReverseFacelets/
```


#### Programming references
<details>
<p>

1. https://stackoverflow.com/questions/2349633/doget-and-dopost-in-servlets
1. https://en.wikipedia.org/wiki/Representational_state_transfer
1. https://stackoverflow.com/questions/14734962/front-end-frameworks-for-restful-backend
1. https://medium.com/unicorn-supplies/angular-vs-react-vs-vue-a-2017-comparison-c5c52d620176
1. https://www.diffen.com/difference/GET-vs-POST-HTTP-Requests
1. https://stackoverflow.com/questions/7569335/reverse-a-string-in-java
1. https://stackoverflow.com/questions/13702713/how-to-check-presence-of-optional-attribute-inside-a-composite-component
1. https://stackoverflow.com/questions/12478640/is-not-allowed-in-template-text
1. https://stackoverflow.com/questions/4787730/jsf-houtputtext-how-to-show-a-dash-when-the-value-is-empty-string
1. https://stackoverflow.com/questions/4870462/conditionally-displaying-jsf-components
1. https://stackoverflow.com/questions/33474926/how-not-to-set-an-attribute-of-a-component-inside-a-composite-component-if-it-is
1. https://www.ntu.edu.sg/home/ehchua/programming/java/JSPByExample.html
1. https://en.wikipedia.org/wiki/JavaServer_Pages
1. http://www.vogella.com/tutorials/JavaServerFaces/article.html
1. https://stackoverflow.com/tags/jstl/info
1. https://stackoverflow.com/questions/4901647/whats-the-difference-between-the-various-jstl-libraries-out-there-and-which-to
1. http://www.javawebtutor.com/articles/jsp/jstl_example_in_eclipse.php
1. https://stackoverflow.com/questions/5766521/how-do-you-store-java-objects-in-httpsession
1. https://www.journaldev.com/1907/java-session-management-servlet-httpsession-url-rewriting
1. https://stackoverflow.com/questions/11941943/pass-input-text-value-to-bean-method-without-binding-input-value-to-bean-propert
1. https://stackoverflow.com/questions/8631029/calling-bean-methods-with-arguments-from-jsf-pages
1. https://stackoverflow.com/questions/6594920/calling-methods-from-jsf-page-doubts
1. https://stackoverflow.com/questions/44254653/the-entity-nbsp-was-referenced-but-not-declared
1. https://stackoverflow.com/questions/13012327/error-parsing-page-xhtml-error-tracedline-42-the-entity-nbsp-was-referenc/28720699
1. https://stackoverflow.com/questions/20656297/character-encoding-garbled-characters-in-post-jsf
1. https://stackoverflow.com/questions/17628354/set-request-character-encoding-of-jsf-input-submitted-values-to-utf-8
1. https://stackoverflow.com/questions/13594945/how-correctly-produce-json-by-restful-web-service
1. https://stackoverflow.com/questions/18026296/jersey-how-to-generate-json-and-xml-output-depending-on-url-param
1. https://stackoverflow.com/questions/296873/basic-html-how-to-set-relative-path-to-current-folder
1. https://www.sitepoint.com/getting-started-react-beginners-guide/
1. https://www.robinwieruch.de/react-fetching-data/
1. https://jsonlint.com/
1. https://stackoverflow.com/questions/36840396/react-fetch-gives-an-empty-response-body
1. https://stackoverflow.com/questions/44331581/convert-promise-in-json-object
1. https://www.quora.com/Is-it-possible-to-consume-a-RESTful-API-with-React-js-alone-i-e-without-any-server-side-language-provided-the-API-if-all-I-want-is-to-consume-JSON-data-and-output-it-rendered-on-my-application
1. https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise
1. https://stackoverflow.com/questions/31875158/unable-to-get-property-length-of-undefined-or-null-reference
1. https://stackoverflow.com/questions/5861536/getting-the-size-of-an-array-in-an-object
1. https://stackoverflow.com/questions/45969531/get-size-of-array-returned-by-map-in-react-render
1. https://stackoverflow.com/questions/22876978/loop-inside-react-jsx
1. https://stackoverflow.com/questions/28320438/react-js-create-loop-through-array
1. https://stackoverflow.com/questions/610406/javascript-equivalent-to-printf-string-format
1. https://stackoverflow.com/questions/34786358/what-does-this-error-mean-uncaught-typeerror-already-read
1. https://stackoverflow.com/questions/33645243/how-do-i-merge-two-components-in-react
1. https://github.com/goatslacker/alt/issues/283
1. https://stackoverflow.com/questions/40109698/react-call-parent-method-in-child-component
1. https://reactjs.org/docs/components-and-props.html#es6-classes
1. https://daveceddia.com/avoid-bind-when-passing-props/
1. https://medium.com/@js_tut/react-js-props-tutorial-a3aceb69999c
1. https://stackoverflow.com/questions/27991366/what-is-the-difference-between-state-and-props-in-react
1. https://stackoverflow.com/questions/34012830/passing-parameters-to-components-in-react-native
1. https://reactjs.org/docs/forms.html
1. https://www.sitepoint.com/work-with-forms-in-react/
1. https://stackoverflow.com/questions/36683770/react-how-to-get-the-value-of-an-input-field
1. https://stackoverflow.com/questions/41618192/react-force-componentdidmount
1. https://engineering.musefind.com/react-lifecycle-methods-how-and-when-to-use-them-2111a1b692b1
1. https://stackoverflow.com/questions/32814970/is-componentdidmount-of-parent-called-after-all-componentdidmount-of-children
1. https://reactjs.org/docs/react-component.html#shouldcomponentupdate
1. https://stackoverflow.com/questions/49128558/how-to-re-render-child-component-on-state-changeparent-reactjs
1. https://stackoverflow.com/questions/39041710/react-js-change-child-components-state-from-parent-component
1. https://stackoverflow.com/questions/37923035/how-to-reload-a-component-in-reacts-on-url-parameter-change
1. https://stackoverflow.com/questions/29074690/react-why-components-constructor-is-called-only-once
1. https://mxstbr.blog/2017/02/react-children-deepdive/
1. https://stackoverflow.com/questions/44851056/react-component-not-re-rendering-on-setstate
1. https://stackoverflow.com/questions/20851533/react-js-wrapping-one-component-into-another
1. https://developmentarc.gitbooks.io/react-indepth/content/life_cycle/birth/post_mount_with_component_did_mount.html
1. https://stackoverflow.com/questions/1187868/how-can-i-exclude-some-folders-from-my-eclipse-project
1. https://stackoverflow.com/questions/13514570/jackson-best-way-writes-a-java-list-to-a-json-array
1. https://stackoverflow.com/questions/39823681/read-the-current-full-url-with-react
1. https://stackoverflow.com/questions/35380077/if-text-begins-or-ends-with-these-characters-remove-characters
1. https://stackoverflow.com/questions/909185/jersey-security-and-session-management
</p>
</details><br>


#### Unit Testing references
<details>
<p>

1. https://stackoverflow.com/questions/5434419/how-to-test-my-servlet-using-junit
1. https://stackoverflow.com/questions/5131897/how-to-create-unit-tests-easily-in-eclipse
1. https://stackoverflow.com/questions/9164893/how-do-i-add-a-maven-dependency-in-eclipse
1. https://javapapers.com/servlet/why-not-declare-a-constructor-in-servlet/
1. https://stackoverflow.com/questions/1276082/how-to-initialize-a-servlet-during-startup-with-parameters
1. https://jar-download.com/?detail_search=g%25253A%252522org.mockito%252522&search_type=1&a=mockito-core
1. https://examples.javacodegeeks.com/core-java/mockito/mockito-thenreturn-example/
1. https://stackoverflow.com/questions/1913168/what-are-java-object-fields-initialized-with
1. https://stackoverflow.com/questions/22357046/error-in-writing-junit-test-case-request-dispatcher
1. https://stackoverflow.com/questions/6455359/creating-a-mock-httpservletrequest-out-of-a-url-string
1. https://stackoverflow.com/questions/11721622/how-do-i-pass-the-httpservletrequest-object-to-the-test-case
1. https://stackoverflow.com/questions/44652424/how-to-mock-httpservletrequest-and-httpservletresponse-objects
1. https://stackoverflow.com/questions/34542397/how-can-i-use-mockito-to-test-forward-only
</p>
</details><br>


#### Concept references
<details>
<p>

1. https://stackoverflow.com/questions/21947300/reasons-for-not-directly-writing-servlets-for-creating-a-rest-api
1. https://stackoverflow.com/questions/16035349/how-should-a-doctype-section-look-in-jsf-html5-or-xhtml
1. https://stackoverflow.com/questions/19189372/javaserver-faces-2-2-and-html5-support-why-is-xhtml-still-being-used
1. https://stackoverflow.com/questions/13092161/why-facelets-is-preferred-over-jsp-as-the-view-definition-language-from-jsf2-0-o
1. https://stackoverflow.com/questions/4815722/jsf-vs-facelets-vs-jsp
1. https://stackoverflow.com/questions/2095397/what-is-the-difference-between-jsf-servlet-and-jsp
1. https://www.freelancinggig.com/blog/2018/03/16/difference-jsp-jsf/
1. https://www.reddit.com/r/java/comments/2jccyc/oracle_keeps_telling_us_that_jsp_is_dead_so_what/
1. https://docs.oracle.com/javaee/7/tutorial/jsf-facelets.htm
1. https://stackoverflow.com/questions/3342984/jstl-in-jsf2-facelets-makes-sense
1. https://www.tutorialspoint.com/jsf/jsf_validation_tags.htm
1. https://stackoverflow.com/questions/2935759/is-it-possible-to-use-jsffacelets-with-html-4-5
1. https://docs.oracle.com/javaee/6/javaserverfaces/2.1/docs/vdldocs/facelets/
1. https://stackoverflow.com/tags/xhtml/info
1. https://stackoverflow.com/questions/1428418/is-restful-jsf-possible
1. http://www.universidadejava.com.br/materiais/webservice-rest-jsf/
1. http://blog.algaworks.com/prettyfaces/
1. https://en.wikipedia.org/wiki/Java_API_for_RESTful_Web_Services
1. http://www.vogella.com/tutorials/REST/article.html
1. https://www.tutorialspoint.com/restful/restful_quick_guide.htm
1. https://stormpath.com/blog/jax-rs-vs-spring-rest-endpoints
1. http://www.totalcross.com/blog/angularjs-consumindo-uma-api-restful-com-java/
1. https://dzone.com/articles/why-you-should-avoid-jsf
1. https://www.quora.com/How-can-I-use-React-JS-with-JSF
1. https://stackoverflow.com/questions/9943445/what-do-i-need-to-create-a-restful-api-server-in-java
1. https://docs.spring.io/spring/docs/3.0.0.M3/spring-framework-reference/html/ch18s02.html
1. https://stackoverflow.com/questions/42944777/difference-between-jax-rs-and-spring-rest
1. https://stackoverflow.com/questions/9508478/rest-using-jax-rs-or-spring-mvc
1. https://dzone.com/articles/7-reasons-i-do-not-use-jax-rs-in-spring-boot-web-a
1. https://www.quora.com/What-is-difference-between-spring-MVC-and-spring-boot
1. https://docs.spring.io/spring-boot/docs/current/reference/html/howto-traditional-deployment.html
1. https://crunchify.com/simplest-spring-mvc-hello-world-example-tutorial-spring-model-view-controller-tips/
1. https://stackoverflow.com/questions/29416804/creating-spring-rest-services-without-using-spring-boot
1. https://stackoverflow.com/questions/20442632/create-restful-web-service-with-jax-rs-and-deploy-it-to-tomcat
1. https://stackoverflow.com/questions/43373733/restful-java-with-jax-rs-2-and-tomcat-9
1. https://jersey.github.io/documentation/latest/getting-started.html
1. https://crunchify.com/how-to-build-restful-service-with-java-using-jax-rs-and-jersey/
</p>
</details><br>


___
### Old instructions

<details>
<p>

Was chosen to use ~Eclipse~ Netbeans run the Java 8 server as backend because it is faster to run
the servlet directly from ~Eclipse~ Netbeans other than install and deploy it on a external server.

After searching for some Java `servlet container` to run the server,
was chosen `Payara 5` because it is open source,
seems the most up to date and has the status of maintained as of now.
See [List Of Application Servers](https://en.wikipedia.org/wiki/List_of_application_servers).

1. ~Install the latest version of [Eclipse IDE for Java EE Developers](http://www.eclipse.org/downloads/eclipse-packages/)~
1. ~Open it and select the perspective Java EE and go to the view `Servers`~
1. **Abort Eclipse usage...**

Eclipse was taking too long to download and install Payara. Therefore, now on, Netbeans IDE will be used.

1. Install the latest version of Netbeans `All Bundle` from https://netbeans.org/downloads/
1. **Fail,
   falling back to standard Tomcat 9** Could not be found an out-of-the-box plugin support for Payara 5 on Eclipse,
   neither Netbeans.


#### Old References

<details>
<p>

1. https://en.wikipedia.org/wiki/Web_container
1. https://en.wikipedia.org/wiki/List_of_application_servers
1. https://blog.payara.fish/adding-payara-server-to-eclipse-ide
1. https://github.com/payara/Payara
1. https://plumbr.io/blog/java/most-popular-java-application-servers-2017-edition
1. https://blog.payara.fish/adding-payara-server-to-netbeans
</p>
</details><br>

</p>
</details><br>

