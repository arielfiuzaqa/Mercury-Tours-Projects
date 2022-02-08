#language: pt
  Funcionalidade: Telas de Cadastro e Login

    Cenário: Cadastrar e logo após entrar com login
      Dado que entro no site
      E completo o campo para registrar o usuario
      E confirmo com mensagem que usuario foi registrado com sucesso
      E for para a area de login
      Quando preencher com login e senha
      Então confirmar com mensagem
