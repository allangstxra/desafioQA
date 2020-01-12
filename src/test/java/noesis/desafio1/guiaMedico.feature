#language: pt
Funcionalidade: Acessar Guia Médico
  Eu como usuário quero realizar consultas no Guia Médico da Unimed

  Cenário: Realizar pesquisa de médico no Rio de Janeiro
    Dado que eu esteja no site da Unimed
    E acesso o Guia Médico
    E pesquiso por um médico no Rio de Janeiro
    Quando eu clico em Pesquisar
    E no combo de estado e cidade eu seleciono Rio de Janeiro
    E seleciono a opção UNIMED RIO
    Quando eu clico no botão Continuar
    Então valido a especialidade e a cidade

  Cenário: Realizar pesquisa de médico no Rio de Janeiro e não apresentar médicos de São Paulo
    Dado que eu esteja no site da Unimed
    E acesso o Guia Médico
    E pesquiso por um médico no Rio de Janeiro
    Quando eu clico em Pesquisar
    E no combo de estado e cidade eu seleciono Rio de Janeiro
    E seleciono a opção UNIMED RIO
    Quando eu clico no botão Continuar
    Então valido a não apresentação de médicos de São Paulo nas páginas de um a três
