#language: en

Feature: Validar funcionalidade de contas do site Seu Barriga

@CT001 @All
Scenario: validar funcionalidade contas
Given 		que o usuario esteja na tela inicial
When 			o usuario clicar na aba contas
Then 			sera exibida as opcoes de contas 

@CT002 @All
Scenario: validar sucesso ao criar uma conta
Given 		que o usuario esteja na tela inicial
When 			o usuario adicionar uma conta na aba de contas
Then 		  sera exibida a mensagem de conta adicionada com sucesso

@CT003 @All
Scenario: validar sucesso ao listar contas existentes
Given 		que o usuario esteja na tela inicial
When 			o usuario listar uma conta na aba de contas
Then 			sera exibida a tela de listagem das contas existentes

@CT004 @All @Erro
Scenario: validar a criacao de uma conta com nome ja existente
Given 		que o usuario esteja na tela inicial
When 			o usuario adicionar uma conta com nome ja existente
Then 			sera exibida uma mensagem de erro
	
@CT005 @All 
Scenario: validar exclusao de conta da listagem
Given 		que o usuario esteja na tela inicial
When 			o usuario remover uma conta existente na tela de listagem de contas
Then 			sera exibida mensagem de sucesso na exclusao da conta

@CT006 @All 
Scenario: validar edicao de conta existente
Given 		que o usuario esteja na tela inicial
When 			o usuario editar uma conta existente
Then 			sera exibida a tela de edicao daquela conta