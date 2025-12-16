# Projeto: Sistema de Cadastro para a Clínica PMI do Bebê

## Descrição
Este projeto é uma implementação em Java baseada no estudo de caso apresentado na avaliação do primeiro bimestre do curso de Bacharelado em Ciência da Computação. O objetivo é criar um sistema para cadastrar e gerenciar informações sobre bebês, suas mães, médicos e medicamentos administrados na Clínica PMI do Bebê.

## Funcionalidades
- Cadastro de medicamentos
- Cadastro de mães
- Cadastro de médicos
- Cadastro de bebês
- Listagem de medicamentos cadastrados
- Listagem de pessoas cadastradas
- Interface de menu interativo

## Regras do Programa
1. O programa deve utilizar as classes especificadas no diagrama de classes.
2. O sistema deve exibir um menu com as seguintes opções:
   - **1**: Incluir um Medicamento
   - **2**: Incluir uma Mãe
   - **3**: Incluir um Médico
   - **4**: Incluir um Bebê
   - **5**: Listar medicamentos cadastrados
   - **6**: Listar pessoas cadastradas
   - **9**: Sair
3. Os dados cadastrados devem ser armazenados em vetores (arrays).
4. O programa deve utilizar entrada via teclado e exibir a saída no monitor.
5. O processamento se repete até que a opção **9** seja escolhida para encerrar o sistema.

## Tecnologias Utilizadas
- **Linguagem**: Java
- **IDE recomendada**: Eclipse

  ```mermaid
   classDiagram
    class Pessoa {
        +Nome: String
        +CPF: String
        +DataNascimento: Date
    }
    
    class Medico {
        +CRM: String
        +Endereco: String
        +TelefoneCelular: String
    }
    
    class Mae {
        
        +Sobrenome: String
        +DataNascimento: Date
        +Endereco: String
        +Telefone: String
    }
    
    class Bebe {
        +Nome: String
        +DataNascimento: Date
    }
    
    class Medicamento {
        +Descricao: String
        +Quantidade: int
        +UnidadeMedida: String
        +Estoque: int
    }
    
    Pessoa <|-- Medico
    Pessoa <|-- Mae
    Pessoa <|-- Bebe
    Medico "1" --> "0..*" Bebe : Faz parte
    Mae "1" --> "0..*" Bebe : Possui
    Bebe "0..*" --> "0..*" Medicamento : Recebe 
 
## Como Executar o Projeto
1. Clone este repositório:
   
sh
   git clone (https://github.com/MundaoRJS/Maternity-Project.git)

2. Abra o projeto no Eclipse.
3. Compile e execute o arquivo principal.
4. Utilize o menu interativo para testar as funcionalidades.

## Autores
- [Lucas Chagas Santos](#)
- [Raimundo Júnio Santos](#)

## Licença
Este projeto é desenvolvido para fins acadêmicos e não possui licença comercial
