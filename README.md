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

# Instructions

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
1.


## References

1. https://en.wikipedia.org/wiki/Web_container
1. https://en.wikipedia.org/wiki/List_of_application_servers
1. https://blog.payara.fish/adding-payara-server-to-eclipse-ide
1. https://github.com/payara/Payara
1. https://plumbr.io/blog/java/most-popular-java-application-servers-2017-edition
1. https://blog.payara.fish/adding-payara-server-to-netbeans

