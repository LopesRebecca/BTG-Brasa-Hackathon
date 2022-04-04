# ASIMOV - Brasa - BTG

## Visão geral
Sistema de conseção de crédito de forma automatica para o cliente

## Problema
Os bancos em sua maioria demoram para liberar crédito para seus cliente, pois processo de análise consiste em verificar se ele realmente tem condições de honrar o contrato concedido. Porém, para os clientes, nem sempre atende a sua dor ou é eficiente. 
Desse modo, podemos explorar alguns padrões de comportamento do usuário, como seu fluxo de caixa nos demais bancos e sua renda pessoal.

## Proposta de solução
Pensando na dor do cliente e no novo sistema, OpenFinace, que permite um compartilhamento de dados entre os bancos. 
Nosso produto visa ofertar de forma automática e inteligente uma nova linha de créditos para os clientes que necessitam.
Buscando por meio de suas transações mensais no cartão de credito, e usufruindo do OpenFinace a nossa solução irá fornecer créditos mais altos para clientes BTG. 

## Sobre aplicação
## Informações tecnicas 
* Sistema Operacional - Linux, Windows, MacOs
* Linguagem Utilizadas
    * Back end - Git e Java, para esse algoritmo foi utilizado o java 11.11.0
    * Front end - Ausente*
* IDE's : IntelliJ, Spring Tools Suite 4, Postaman

* O front end nessa aplicação se encontra ausente, pois toda a comunicação é feita por meio de requisições feitas usando o Postaman

## Processo de execução
Para executar o algoritmo deve se iniciar a aplicação Spring e, por intermedio do Postamn realizar as requisições referente 
ao cliente que se vai ser analiasado.

Na requisição tem que ser passado no body:
```
{
    "organizations" : [
        {
            "organizationId" : "d3d2b0d5-903a-4f9f-b793-c139490d5ca7",
            "creditCardAccountId" : "ddd677f1-e293-4e7f-97cd-3a89905a6a46"
        }
    ]
    
}
```
<img src = "https://github.com/LopesRebecca/Analisadores/blob/main/testes/Captura%20de%20tela_2022-01-07_22-53-13.png" width="800">

Sendo, 
  * organizationId - Id da organização
  * creditCardAccountId - Id referente a parte do crédito do cliente

Já na parte do head deve ser passado os seguintes dados:

* Dados ilustrativos

## Formula matematica utilizada 
Nessa aplicação para considerar um aumento razoavel de crédito foi armazenado em uma lista todos os limites de crédito referente aquele cliente, 
feito uma comparação e então acrescentado 25% do maior limite disponivel dele.
```
AumentoCredito = maiorCreditoCliente + (maiorCreditoCliente0.25).
```

## Resultado dos testes




