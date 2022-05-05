# Proposta da atividade: 
Criar um protótipo de pagamento por QRcode, x) Mercado pago
- permite o pagamento por QRcode único por transação - por hora a QRcode é ma **string**
- **pagamento** o usuário informa o nome de quem ele quer fazer a transação, o valor e o QRcode 
-  **recebimento** o usuário informa o valor apenas e então manda o QRcode ao outro

#
## **Classes**
- Usuário
- Conta
- Transações 

## Usuário
- nome
- senha 
- email

## Conta
- id-Conta
- saldo

## Transação
- sem tributos
- infos para seguir obrigatóriamente:
    - Toda transação deve ser composta pelo id da conta;
    - A String gerada deve conter o nome do usuário que vai receber o valor;
    - A String gerada deve conter o valor da transação;

# 
## O que ter também no código:
- forma de atualizar as infos das classes
- criar 3 contas para testar
    - valores iniciais de saldo: 1000, 250, 3000
    
