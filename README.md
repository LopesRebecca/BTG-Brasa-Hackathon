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
### Informações tecnicas 
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
<img src = "https://github.com/LopesRebecca/BTG-Brasa-Hackathon/blob/main/brasa-BTG/body.jpeg" width="800"> 

Sendo, 
  * organizationId - Id da organização
  * creditCardAccountId - Id referente a parte do crédito do cliente

Já na parte do head deve ser passado os seguintes dados:
   * customerId - Id do cliente (CPF OU CNPJ)
   * acoountId - Id da conta do cliente
<img src = "https://github.com/LopesRebecca/BTG-Brasa-Hackathon/blob/main/brasa-BTG/head.jpeg" width="800">

* Dados ilustrativos, insira os dados referente ao cliente que deseja consultar 

## Descrição do criterio
Para ser aprovado o crédito o cliente precisa seguir as seguintes inposições:
   *  deve ter saldo positivo
   *  não pode ter dinheiro bloqueado em conta
   *  cartão de crédito como meio principal de pagamento 
   *  não pode está utilizando cheque especial
   *  não pode execeder o valor de gastos em relação ao valor minimo de crédito 
   
Depois de aprovado na aplicação para considerar um aumento razoavel de crédito foi armazenado em uma lista todos os limites de crédito referente aquele cliente, 
feito uma comparação e então acrescentado 25% do maior limite disponivel dele.

```
AumentoCredito = maiorCreditoCliente + (maiorCreditoCliente * 0.25).
```

## Resultado dos testes

1. Caso feliz 
   O crédito para o cliente foi aprovado e aumentado
   <img src = "https://github.com/LopesRebecca/BTG-Brasa-Hackathon/blob/main/brasa-BTG/resultAprovado.jpeg" width="700">

2. Caso triste 
   O crédito para o cliente foi reprovado 
   <img src = "https://github.com/LopesRebecca/BTG-Brasa-Hackathon/blob/main/brasa-BTG/resultNegado.jpeg" width="800">
   
# Possiveis melhorias:
Para uma segunda versão da aplicação pensa se em ser considerado beneficios para clientes com uma linha de crédito maior, como
o cashback e anuidade gratuita

# Desenvolvedores

## Membros
 [<img src = "https://avatars.githubusercontent.com/u/62263916?v=4" width="115"><br><sub>Eriky Ryan</sub>](https://github.com/erikyryan) 
 
 [<img src = "https://avatars.githubusercontent.com/u/57471802?v=4" width="115"><br><sub>Davi Fernandes</sub>](https://github.com/Davizex)
 
 [<img src = "https://avatars.githubusercontent.com/u/82542224?v=4" width="115"><br><sub>Rebecca Lelis</sub>](https://github.com/LopesRebecca)


## Licença

licenciado sob [MIT](https://github.com/erikyryan/trabalho-de-poo/blob/main/LICENSE)
   



