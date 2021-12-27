#language: en

Feature: Validar cadastro no site Seu Barriga

@CT001 @All
Scenario: validar tela de cadastro do site
Given 	  que o usuario esteja na tela de cadastro do site
Then 	    a tela e validada com sucesso

@CT002 @All
Scenario: validar cadastro de novo usuario
Given 		que o usuario esteja na tela de cadastro do site
When 			o usuario se cadastrar apos preencher os campos solicitados 
Then 			sera exibido a mensagem de cadastro inserido com sucesso

@CT003  @All @Erro
Scenario: validar novo cadastro com um email ja utilizado
Given 		que o usuario esteja na tela de cadastro do site
When 			o usuario se cadastrar utilizando um email ja usado
Then 			sera exibida a mensagem de erro de email ja utilizado

@CT004  @All @Erro
Scenario: validar novo cadastro sem preencher senha
Given 		que o usuario esteja na tela de cadastro do site
When 			o usuario se cadastrar sem preencher o campo de senha
Then 			sera exibida a mensagem de erro do campo ser obrigatorio
