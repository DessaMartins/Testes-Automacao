#language: en

Feature: validar a criacao de movimentacao no site Seu Barriga

@CT001 @All
Scenario: validar tela de movimentacao do site
Given 		que o usuario esteja na tela de movimentacao
Then 			a tela de movimentacao e validada com sucesso


@CT002 @All
Scenario: Criar uma movimentacao com sucesso
Given 	  que o usuario esteja logado na tela de movimentacao
When 		  ele criar a movimentacao apos preencher todos os dados solicitados com uma conta existente/valida
Then 		  sera exibida mensagem de sucesso da criacao da movimentacao 


@CT003 @All @Erro
Scenario: Criar uma movimentacao com campos vazios
Given 		que o usuario esteja logado na tela de movimentacao
When		  ele criar movimentacao com os campos vazios
Then		  sera exibido uma mensagem de que os campos sao obrigatorios


@CT004 @All @Erro
Scenario: Criar uma movimentacao com valor nao numerico
Given 		que o usuario esteja logado na tela de movimentacao
When 			ele criar uma movimentacao com um valor nao numerico
Then 			sera exibido uma mensagem de que o valor deve ser um numero


@CT005 @All @Erro
Scenario: Criar uma movimentacao sem conta existente
Given 		que o usuario esteja logado na tela de movimentacao
When 			ele criar movimentaçao sem ter uma conta existente
Then 			sera exibido uma mensagem que a conta e obrigatorio


