# Pessoa CRUD Application

Esta é uma aplicação web Java desenvolvida para manter dados de pessoas. Permite operações básicas de CRUD (Create, Read, Update, Delete) e utiliza tecnologias como Java Server Faces (JSF), PrimeFaces, Hibernate, PostgreSQL e Tomcat.

## Decisões Técnicas e Arquiteturais

- **Framework Web:** Utilizamos Java Server Faces (JSF) como o framework web principal devido à sua integração nativa com Java EE e suporte robusto para desenvolvimento de interfaces web.
- **Banco de Dados:** Optamos por PostgreSQL como o SGBD relacional devido à sua confiabilidade, desempenho e recursos avançados de SQL.
- **Persistência:** Hibernate foi escolhido como a implementação de JPA devido à sua popularidade, recursos avançados de mapeamento objeto-relacional e integração com Java EE.
- **Injeção de Dependências:** Utilizamos EJB para injeção de dependências devido à sua integração com Java EE e facilidade de uso.
- **Interface Gráfica:** PrimeFaces foi escolhido como o framework de interface de usuário devido à sua rica biblioteca de componentes e facilidade de uso com JSF.
- **Deploy:** A aplicação pode ser implantada em um contêiner Servlet como Tomcat.

## Planejamento e execução

Como a execução do projeto é num período curto optei por fazer num formato mais básico, mantendo as características das entidades, sem ferir nenhum tipo de relacionamento (Mantive o OneToMany) sem adicionar nada e também não adicionei proteções maiores nas entidades como validators nem autenticação, por exemplo.

## Compilar e Executar o Projeto

1. Clone o repositório para sua máquina local.
2. Certifique-se de ter o Java JDK, Maven e PostgreSQL instalados em seu sistema.
3. Configure o banco de dados PostgreSQL e ajuste as configurações de conexão no arquivo `persistence.xml` no diretório `src/main/resources/META-INF`.
4. Execute o comando `mvn clean install` na raiz do projeto para compilar e empacotar o projeto em um arquivo WAR.
5. Implante o arquivo WAR gerado no Tomcat, colocando-o no diretório `webapps` do Tomcat.
6. Inicie o Tomcat e acesse a aplicação em `http://localhost:8080/nome-da-sua-aplicacao`.

## Executar Testes da Solução

Os testes unitários podem ser executados com o comando `mvn test`.

## Lista de Atividades

1. Implementação da camada de modelo (`src/main/java/org/hbenjamim/modelo`).
2. Implementação da camada DAO (`src/main/java/org/hbenjamim/dao`).
3. Implementação dos beans de controle (`src/main/java/org/hbenjamim/controle`).
4. Desenvolvimento das views utilizando JSF e PrimeFaces (`src/main/webapp`).

## Possíveis Melhorias

- Implementação de testes de unidade e integração para garantir a robustez do código.
- Utilização do Docker para containerização da aplicação, simplificando o processo de implantação e garantindo a consistência do ambiente de execução.
- Adição de recursos de autenticação de usuários para proteger áreas sensíveis da aplicação.
- Melhorias na interface do usuário para tornar a experiência do usuário mais agradável e intuitiva.
- Validações nos campos (pessoa e endereco)