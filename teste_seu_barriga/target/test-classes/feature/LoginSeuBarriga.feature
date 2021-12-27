#language: en

Feature: Validar tela login no site Seu Barriga

@CT001 @All
Scenario: validar tela de login do site
Given 		que o usuario esteja na tela de login
Then 			a tela de login e validada com sucesso

@CT002 @All
Scenario: validar login de usuario
Given 		que o usuario esteja na tela de login
When 			o usuario entrar com seu email e senha preenchidos corretamente
Then 			sera exibido a tela inicial do site

@CT003 @All @Erro
Scenario: validar erro ao logar com senha incorreta
Given 		que o usuario esteja na tela de login
When 			o usuario entrar com uma senha incorreta
Then 			sera exibida uma mensagem de erro de login

@CT004 @All @Erro
Scenario: validar erro ao logar sem preencher email
Given 		que o usuario esteja na tela de login
When 			o usuaria entrar sem preencher o email
Then 			sera exibida uma mensagem de campo obrigatorio