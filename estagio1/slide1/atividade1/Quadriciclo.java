public class Quadriciclo implements ICarro, IMoto{
	
	/*
	 * Classe Quadriciclo implementa as interfaces ICarro e IMoto.
	 * Ambas interfaces possuem um metodo com mesma assinatura,
	 * então para não haver confusão, a Classe Quadriciclo sobreescreve
	 * o metodo obterNumeroDeRodas, escolhendo o implementado na interface ICarro
	 */
	
	@Override
	public int obterNumeroDeRodas() {
		return ICarro.super.obterNumeroDeRodas();
	}

}