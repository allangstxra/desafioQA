$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("guiaMedico.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 2,
  "name": "Acessar Guia Médico",
  "description": "Eu como usuário quero realizar consultas no Guia Médico da Unimed",
  "id": "acessar-guia-médico",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 5,
  "name": "Realizar pesquisa de médico no Rio de Janeiro",
  "description": "",
  "id": "acessar-guia-médico;realizar-pesquisa-de-médico-no-rio-de-janeiro",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 6,
  "name": "que eu esteja no site da Unimed",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "acesso o Guia Médico",
  "keyword": "E "
});
formatter.step({
  "line": 8,
  "name": "pesquiso por um médico no Rio de Janeiro",
  "keyword": "E "
});
formatter.step({
  "line": 9,
  "name": "eu clico em Pesquisar",
  "keyword": "Quando "
});
formatter.step({
  "line": 10,
  "name": "no combo de estado e cidade eu seleciono Rio de Janeiro",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "seleciono a opção UNIMED RIO",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "eu clico no botão Continuar",
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "valido a especialidade e a cidade",
  "keyword": "Então "
});
formatter.match({
  "location": "GuiaMedicoTest.que_eu_esteja_no_site_da_Unimed()"
});
formatter.result({
  "duration": 9097945082,
  "status": "passed"
});
formatter.match({
  "location": "GuiaMedicoTest.acesso_o_Guia_Médico()"
});
formatter.result({
  "duration": 310863473,
  "status": "passed"
});
formatter.match({
  "location": "GuiaMedicoTest.pesquiso_por_um_médico_no_Rio_de_Janeiro()"
});
formatter.result({
  "duration": 2560641423,
  "status": "passed"
});
formatter.match({
  "location": "GuiaMedicoTest.eu_clico_em_Pesquisar()"
});
formatter.result({
  "duration": 195435792,
  "status": "passed"
});
formatter.match({
  "location": "GuiaMedicoTest.no_combo_de_estado_e_cidade_eu_seleciono_Rio_de_Janeiro()"
});
formatter.result({
  "duration": 1459397542,
  "status": "passed"
});
formatter.match({
  "location": "GuiaMedicoTest.seleciono_a_opção_UNIMED_RIO()"
});
formatter.result({
  "duration": 622826935,
  "status": "passed"
});
formatter.match({
  "location": "GuiaMedicoTest.eu_clico_no_botão_Continuar()"
});
formatter.result({
  "duration": 146752515,
  "status": "passed"
});
formatter.match({
  "location": "GuiaMedicoTest.valido_a_especialidade_e_a_cidade()"
});
formatter.result({
  "duration": 1954399146,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Realizar pesquisa de médico no Rio de Janeiro e não apresentar médicos de São Paulo",
  "description": "",
  "id": "acessar-guia-médico;realizar-pesquisa-de-médico-no-rio-de-janeiro-e-não-apresentar-médicos-de-são-paulo",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 16,
  "name": "que eu esteja no site da Unimed",
  "keyword": "Dado "
});
formatter.step({
  "line": 17,
  "name": "acesso o Guia Médico",
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "pesquiso por um médico no Rio de Janeiro",
  "keyword": "E "
});
formatter.step({
  "line": 19,
  "name": "eu clico em Pesquisar",
  "keyword": "Quando "
});
formatter.step({
  "line": 20,
  "name": "no combo de estado e cidade eu seleciono Rio de Janeiro",
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "seleciono a opção UNIMED RIO",
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "eu clico no botão Continuar",
  "keyword": "Quando "
});
formatter.step({
  "line": 23,
  "name": "valido a não apresentação de médicos de São Paulo nas páginas de um a três",
  "keyword": "Então "
});
formatter.match({
  "location": "GuiaMedicoTest.que_eu_esteja_no_site_da_Unimed()"
});
formatter.result({
  "duration": 5126510334,
  "status": "passed"
});
formatter.match({
  "location": "GuiaMedicoTest.acesso_o_Guia_Médico()"
});
formatter.result({
  "duration": 707124321,
  "status": "passed"
});
formatter.match({
  "location": "GuiaMedicoTest.pesquiso_por_um_médico_no_Rio_de_Janeiro()"
});
formatter.result({
  "duration": 1571229571,
  "status": "passed"
});
formatter.match({
  "location": "GuiaMedicoTest.eu_clico_em_Pesquisar()"
});
formatter.result({
  "duration": 199798428,
  "status": "passed"
});
formatter.match({
  "location": "GuiaMedicoTest.no_combo_de_estado_e_cidade_eu_seleciono_Rio_de_Janeiro()"
});
formatter.result({
  "duration": 1606587382,
  "status": "passed"
});
formatter.match({
  "location": "GuiaMedicoTest.seleciono_a_opção_UNIMED_RIO()"
});
formatter.result({
  "duration": 941199923,
  "status": "passed"
});
formatter.match({
  "location": "GuiaMedicoTest.eu_clico_no_botão_Continuar()"
});
formatter.result({
  "duration": 179888273,
  "status": "passed"
});
formatter.match({
  "location": "GuiaMedicoTest.valido_a_não_apresentação_de_médicos_de_São_Paulo_nas_páginas_de_um_a_três()"
});
formatter.result({
  "duration": 4867522471,
  "status": "passed"
});
});