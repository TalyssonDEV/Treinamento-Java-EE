# 📀 Treinamento-Java-EE: Sistema de Locadora

Este repositório contém um **Sistema de Gerenciamento de Locação** desenvolvido em Java. O projeto foi concebido como uma ferramenta de aprendizado prático para consolidar fundamentos de programação e arquitetura de software orientada a objetos.

---

## 📝 Sobre o Projeto
O sistema simula as operações reais de uma locadora de DVDs. O foco principal foi a aplicação de conceitos de **Orientação a Objetos (POO)**, manipulação de coleções em memória e a implementação de regras de negócio em um cenário estruturado.

## 🚀 Funcionalidades Principais
O sistema é operado via console através de um menu interativo com as seguintes capacidades:

* **Gestão de Clientes:** Cadastro completo e motores de busca por CPF ou Nome.
* **Gestão de Acervo:** Cadastro de novos títulos e consultas por código identificador ou título.
* **Fluxo de Locação:** Processo de check-out (locar) e check-in (devolver) de filmes.
* **Relatórios e Inteligência:** Listagem de DVDs atualmente locados e histórico detalhado de filmes por cliente via CPF.

## 🛠️ Tecnologias e Conceitos Aplicados
* **Linguagem:** Java 17+
* **Paradigma:** Orientação a Objetos.
    * *Encapsulamento:* Proteção de dados sensíveis nas classes.
    * *Herança:* Especialização de tipos de clientes (Pessoa Física).
    * *Polimorfismo:* Flexibilidade no tratamento de diferentes objetos de negócio.
* **Estrutura:** Organização modular no pacote `src`, separando a lógica de entrada/saída das entidades de negócio.

---

## 🏗️ Documentação de Arquitetura
O sistema utiliza um modelo de **Arquitetura Monolítica Simples**, onde toda a lógica reside em uma única unidade de execução.



### 🗂️ Responsabilidade das Classes
| Classe | Responsabilidade |
| :--- | :--- |
| **`App.java`** | Ponto de entrada (`main`). Orquestra o loop do menu e a interação direta com o usuário via console. |
| **`Locadora.java`** | Atua como um *Controller/Fachada*. Centraliza as listas de dados e valida as regras de negócio. |
| **`Cliente.java`** | Classe base que define os atributos comuns de todos os usuários do sistema. |
| **`pessoaFisica.java`** | Especialização de Cliente, aplicando herança para tratar atributos específicos como CPF. |
| **`Dvd.java`** | Representa o item físico do acervo, contendo status de disponibilidade e informações do filme. |
| **`Locacao.java`** | Classe associativa que registra o vínculo entre um Cliente e um DVD, gerindo o período de locação. |
| **`Genero.java`** | Define as categorias dos filmes para fins de organização e filtragem. |

---

## 🎯 Casos de Uso e Processos
Para facilitar o entendimento do fluxo de trabalho do atendente, o processo de locação segue a lógica padronizada:



1.  **Identificação:** O atendente busca o cliente pelo CPF.
2.  **Validação:** O sistema verifica se o cliente está ativo e se o DVD solicitado está disponível no acervo.
3.  **Registro:** Uma nova instância de `Locacao` é criada, associando as entidades, e o status do `Dvd` é atualizado para "Locado".



---

## 💻 Como Executar
1. Certifique-se de ter o **JDK 17** ou superior instalado.
2. Clone o repositório:
   ```bash
   git clone [https://github.com/seu-usuario/Treinamento-Java-EE.git](https://github.com/seu-usuario/Treinamento-Java-EE.git)
