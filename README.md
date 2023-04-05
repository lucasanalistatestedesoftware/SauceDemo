# SauceDemo

Login com credenciais válidas:

Dado que estou na página de login do site
Quando eu inserir um nome de usuário e senha válidos
E clicar no botão de login
Então eu devo ser redirecionado para a página de inventário da loja
Login com credenciais inválidas:

Dado que estou na página de login do site
Quando eu inserir um nome de usuário e senha inválidos
E clicar no botão de login
Então eu devo ver uma mensagem de erro informando que as credenciais são inválidas
Conta bloqueada por tentativas de login inválidas:

Dado que estou na página de login do site
Quando eu inserir um nome de usuário e senha inválidos várias vezes
E clicar no botão de login
Então eu devo ver uma mensagem de erro informando que a conta foi bloqueada por tentativas de login inválidas.
