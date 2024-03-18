# PROJETO SELENIUM-JAVA-ESTUDOS

![seleniumJava](./assets/seleniumJava.jpg)

Projeto de estudo focado na automação de testes de front-end

## Índice

- <a href="#objetivos">Objetivos </a>
- <a href="#funcionalidades-do-projeto">Funcionalidades do projeto </a>
- <a href="#layout">Layout </a>
- <a href="#como-rodar-este-projeto">Como rodar este projeto? </a>
- <a href="#tecnologias-utilizadas">Tecnologias utilizadas </a>
- <a href="#pessoas-autoras">Pessoas autoras </a>
- <a href="#contatos">Contatos </a>

## Objetivos

- Aprender e praticar a automação de testes de front-end.
- Utilizar o Selenium WebDriver para interagir com elementos web.
- Implementar testes para garantir a funcionalidade e integridade da interface do usuário.
- Explorar boas práticas e padrões de design para automação de testes em Java.

## 👨🏻‍💻Funcionalidades do Projeto

- [x] Pesquisar Médicos
- [x] Canais de Atendimentos
- [x] Fazer Pedido

## 📸Layout
![tela Home](./assets/home.png)
![tela de Pesquisar Medicos](./assets/guia%20medico.png)
![Detalhes dos Canais de atendimento](./assets/canais%20de%20atendimento.png)

## 🎡Como rodar este projeto?

``` bash
# Clone este repositório
$ git clone https://github.com/LucasFelice/selenium-front-end.git

# Acesse a pasta do projeto no seu terminal
$ cd selenium-front-end

# Instale as dependências
$ mvn clean install

# Execute a aplicação
$ Antes da execução certifique-se que não há dados na pasta "allure-results" para não gerar resultados diferentes da execução que será realizada.
$ mvn clean test ---> Executará todo os testes contidos no projeto dentro do pacote "test".
$ mvn clean test -Dpackage=TestesDesejáveis ---> Executará os testes apontados no caminho;
$ Ex.: mvn clean test -Dtest=suiteTest ---> Executará todos os testes dentro do pacote "test" na classe "suiteTest".

# Abra o relatório Allure
$ allure serve --port 8080 C:\caminho\para\diretório\llure-results --clean
$ Ex.: allure serve --port 8080 C:\Users\lucas\IdeaProjects\ProjetoSelenium\selenium-front-end\src\test\resources\allure-results --clean

# Apague dados gerados no relatório Allure
$ rd /s C:\caminho\para\diretório\allure-results
$ Ex.: rd /s C:\Users\lucas\IdeaProjects\ProjetoSelenium\selenium-front-end\src\test\resources\allure-results

```

## 🛠Tecnologias Utilizadas
1. [React](https://www.unimed.coop.br/site/)
2. [Java](https://www.oracle.com/java/technologies/javase/jdk16-archive-downloads.html)
3. [Selenium WebDriver](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java )
4. [JUnit](https://mvnrepository.com/artifact/junit/junit)

## Pessoas Autoras

<img style="width:200px" src="https://media.licdn.com/dms/image/C4E03AQH_NVm9GHJyQQ/profile-displayphoto-shrink_800_800/0/1614859902829?e=1710374400&v=beta&t=Ckyr87cwifmDdTQZyI1pZQGuU4wdeC5heZk2baLkrLU" alt="Imagem da Pessoa autora">

## Contatos
[Linkedin](https://www.linkedin.com/in/lucas-de-felice-fernandes-92122b149/)
- E-mail: lucasfelice92@gmail.com




