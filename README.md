# Sistema de Gerenciamento de Produtos

## Descrição
Este é um sistema simples de gerenciamento de produtos baseado na arquitetura hexagonal. O sistema permite cadastrar produtos e alterar o preço dos mesmos.

## Requisitos
- Java 11 ou superior
- Maven para gerenciamento de dependências

## Como Executar

1. Clone o repositório:
    ```bash
    git clone https://github.com/seuusuario/sistema-gerenciamento-produtos.git
    ```

2. Navegue até o diretório do projeto:
    ```bash
    cd sistema-gerenciamento-produtos
    ```

3. Compile o projeto:
    ```bash
    mvn clean install
    ```

4. Execute os testes:
    ```bash
    mvn test
    ```

## Testes
O projeto já contém testes unitários para validar o cadastro de produtos e a alteração de preço. Eles estão localizados no pacote `src/test/java/`.

## Tecnologias Usadas
- Java
- Arquitetura Hexagonal
