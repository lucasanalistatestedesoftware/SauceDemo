# SauceDemo

Login com credenciais válidas e inválidas:

Cenário 1 
Dado que estou na página de login do site
Quando eu inserir um nome de usuário e senha válidos
E clicar no botão de login
Então eu devo ser redirecionado para a página de inventário da loja
Login com credenciais inválidas:

Cenário 2 
Dado que estou na página de login do site
Quando eu inserir um nome de usuário e senha inválidos
E clicar no botão de login
Então eu devo ver uma mensagem de erro informando que as credenciais são inválidas
Conta bloqueada por tentativas de login inválidas:

Cenário 3
Dado que estou na página de login do site
Quando eu inserir um nome de usuário e senha inválidos várias vezes
E clicar no botão de login
Então eu devo ver uma mensagem de erro informando que a conta foi bloqueada por tentativas de login inválidas.

Cenário 4
Adicionar um item ao carrinho no site saucedemo.com
Dado que estou na página inicial do saucedemo.com
Quando eu faço login com as credenciais válidas:
| usuário | senha |
| standard_user | secret_sauce |
Então eu deveria ser redirecionado para a página "Produtos"
Quando eu clico no botão "Adicionar ao carrinho" para o item "Sauce Labs Backpack"
Então o item deve ser adicionado com sucesso ao carrinho
E o ícone do carrinho na barra de navegação deve exibir o número de itens corretamente.

Cenário 5 
Remover um item do carrinho no site saucedemo.com
Dado que eu tenho um item no carrinho no saucedemo.com
Quando eu clico no ícone do carrinho na barra de navegação
Então eu deveria ser redirecionado para a página do carrinho
Quando eu clico no botão "Remover" para o item "Sauce Labs Backpack"
Então o item deve ser removido com sucesso do carrinho
E a mensagem "Seu carrinho está vazio!" deve ser exibida.

Cenário 6 
Atualizar a quantidade de um item no carrinho no site saucedemo.com
Dado que eu tenho um item no carrinho no saucedemo.com
Quando eu clico no ícone do carrinho na barra de navegação
Então eu deveria ser redirecionado para a página do carrinho
Quando eu atualizo a quantidade do item "Sauce Labs Backpack" para "2"
Então a quantidade do item no carrinho deve ser atualizada para "2".
