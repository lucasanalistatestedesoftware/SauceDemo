#language:pt

Funcionalidade: teste exemplo cucumber

  Cenario: teste cucumber swaglabs

  Esquema do Cenário:
    Dado que esteja na pagina da "https://www.saucedemo.com/"
    Quando utiizar username com <usuario> e password com <senha>
    E clica no botão login
    Então deve ter <resultado>

    Exemplos:
      | usuario                   | senha           | resultado |
      | "standard_user"           | "secret_sauce"  | "sucesso" |
      | "locked_out_user"         | "secret_sauce"  | "bloqueio"|
      | "problem_user"            | "secret_sauce"  | "problema"|