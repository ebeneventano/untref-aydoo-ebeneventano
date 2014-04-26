package untref.aydoo.graficador.tests;

import org.junit.Assert;
import org.junit.Test;
import untref.aydoo.graficador.FuncionConstante;

public class FuncionConstanteTests {

    @Test
    public void evaluarEnDeberiaRetornar3CuandoConstanteEs3() {

        final float constante = 3.0f;
        float x = 5.0f;

        FuncionConstante funcionConstante = new FuncionConstante(constante);

        Assert.assertEquals(constante, funcionConstante.evaluarEn(x), 0.0001);

    }

    @Test
    public void evaluarEnDeberiaRetornar2CuandoConstanteEs2() {

        final float constante = 2.0f;
        float x = 5.0f;

        FuncionConstante funcionConstante = new FuncionConstante(constante);

        Assert.assertEquals(constante, funcionConstante.evaluarEn(x), 0.0001);

    }


}
