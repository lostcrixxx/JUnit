# JUnit

Anotações para teste Junit
A estrutura do Junit 4.x é baseada em anotações.

@Test especifica que o método é o método de teste.

@Test(timeout=1000) especifica que o método falhará se demorar mais de 1000 milissegundos (1 segundo).

@BeforeClass especifica que o método será chamado apenas uma vez, antes de iniciar todos os testes.

@Before especifica que o método será chamado antes de cada teste.

@After especifica que o método será chamado após cada teste.

@AfterClass especifica que o método será chamado apenas uma vez, após concluir todos os testes.


Métodos da classe Assert
Os métodos comuns da classe Assert são os seguintes:

void assertEquals (booleano esperado, booleano real) : verifica se dois primitivos / objetos são iguais. Ele está sobrecarregado.

void assertTrue (condição booleana) : verifica se uma condição é verdadeira.

void assertFalse (condição booleana) : verifica se uma condição é falsa.

assertNull void (Object obj) : verifica esse objeto é nulo.

void assertNotNull (Object obj) : verifica se o objeto não é nulo.

Carrega e seleciona o Spinner
onView(withId(R.id.spinner)).perform(click());

Abre o menu de configurações
openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
