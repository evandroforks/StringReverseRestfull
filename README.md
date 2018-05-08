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

## Instructions


### Downloads

1. Download the Tomcat 9 Servler Container from https://tomcat.apache.org/download-90.cgi
1. Unpack it to `C:\Bridge\apache-tomcat-9.0.8`
1. Download the latest version of [Eclipse IDE for Java EE Developers](http://www.eclipse.org/downloads/eclipse-packages/)
1. Unpack it to `C:\Bridge\eclipse`


### Tomcat setup on Eclipse

1. Open Eclipse and select the `Java EE` Perspective
1. Select the tab/view `Servers` and hit `Create a new server`
   1. Under the server's list, select Apache -> Tomcat 9
   1. Hit next and select the directory `C:\Bridge\apache-tomcat-9.0.8` as the Tomcat directory and hit next until finish.
   1. Also on the Servers' tab/view, right click on the created server and select `Properties`
   1. Now, select the button `Switch Location` and then `Apply and Close`
1. Also on the Server's tab/view, double click on the recent created server.
   1. On the opened page, select `Use Tomcat installation (takes control of Tomcat installation)` under `Server Locations`
   1. Press `Ctrl+S` to save the changes and close the page
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



### Running the application


1.



## References

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
1. https://en.wikipedia.org/wiki/Representational_state_transfer
1. https://stackoverflow.com/questions/14734962/front-end-frameworks-for-restful-backend
1. https://medium.com/unicorn-supplies/angular-vs-react-vs-vue-a-2017-comparison-c5c52d620176
1. https://tomcat.apache.org/tomcat-9.0-doc/default-servlet.html



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
   falling back to standard Tomcat 9** Could not be found out-of-the-box plugin support for Payara 5 on Eclipse,
   neither Netbeans.


### Old References

1. https://en.wikipedia.org/wiki/Web_container
1. https://en.wikipedia.org/wiki/List_of_application_servers
1. https://blog.payara.fish/adding-payara-server-to-eclipse-ide
1. https://github.com/payara/Payara
1. https://plumbr.io/blog/java/most-popular-java-application-servers-2017-edition
1. https://blog.payara.fish/adding-payara-server-to-netbeans
</p>
</details><br>

