\# Sistema de Gerenciamento de Trabalhadores



\## 📝 Descrição do Projeto



Este é um projeto em Java que simula um sistema simples para gerenciar trabalhadores, seus departamentos e contratos de trabalho por hora. O objetivo principal é calcular o ganho total de um trabalhador em um determinado mês, somando seu salário base com os valores de todos os contratos firmados naquele período.



Este projeto foi desenvolvido como parte de um exercício de Programação Orientada a Objetos, com foco em \*\*composição de objetos\*\* e \*\*enumerações\*\*.



\*\*Status do Projeto:\*\* `Parte 1 - Modelagem e Lógica de Negócio (Concluída)`



---



\## 🗺️ Mapa Mental e Arquitetura do Projeto



O projeto é estruturado em torno da entidade `Worker` (Trabalhador), que se relaciona com outras classes para formar um modelo de dados coeso.



A relação entre as classes pode ser entendida da seguinte forma:



\* \*\*`Worker` (Trabalhador)\*\*

&nbsp;   \* É a classe central do sistema.

&nbsp;   \* \*\*TEM UM\*\* `Department` (Departamento).

&nbsp;       \* Esta é uma relação de composição \*\*"tem-um"\*\*: cada trabalhador pertence a um único departamento.

&nbsp;   \* \*\*TEM MUITOS\*\* `HourContract` (Contratos por Hora).

&nbsp;       \* Esta é uma relação de composição \*\*"tem-muitos"\*\*: um trabalhador pode ter uma lista com vários contratos associados a ele.

&nbsp;   \* \*\*TEM UM\*\* `WorkerLevel` (Nível do Trabalhador).

&nbsp;       \* Usa uma enumeração para garantir que o nível seja sempre um valor válido (JUNIOR, MID\_LEVEL ou SENIOR).



\### Diagrama Simplificado da Relação:



```

+----------------+       1       +---------------+

|    Worker      |<>------------ |   Department  |

+----------------+               +---------------+

&nbsp;      |

&nbsp;      | 1

&nbsp;      |

&nbsp;      |

&nbsp;      | \*

+----------------+

|  HourContract  |

+----------------+

```



---



\## 🛠️ Funcionalidades Implementadas (Parte 1)



\* \*\*Modelagem de Entidades:\*\*

&nbsp;   \* `Worker`: Armazena dados do trabalhador, seu departamento e uma lista de contratos.

&nbsp;   \* `Department`: Armazena o nome do departamento.

&nbsp;   \* `HourContract`: Armazena os detalhes de um contrato por hora (data, valor/hora, duração).

&nbsp;   \* `WorkerLevel`: Enumeração para os níveis de senioridade.

\* \*\*Lógica de Negócio:\*\*

&nbsp;   \* Adicionar e remover contratos de um trabalhador.

&nbsp;   \* Calcular o valor total de um contrato individual (`HourContract.totalValue()`).

&nbsp;   \* Calcular o ganho total de um trabalhador em um mês e ano específicos (`Worker.income()`).



---



\## 🚀 Próximos Passos (Parte 2)



A próxima parte deste projeto envolverá a criação da camada de aplicação, que será responsável por:



1\.  Ler os dados de entrada do usuário (dados do trabalhador, quantidade de contratos, etc.).

2\.  Instanciar os objetos com base nos dados fornecidos.

3\.  Chamar os métodos de negócio (como `income()`) para realizar os cálculos.

4\.  Exibir o resultado final para o usuário no console.

