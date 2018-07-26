
public class TestaSistemasInternos {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Desenvolvedor d = new Desenvolvedor();
		d.setSenha(3333);
		
		Cliente c = new Cliente();
		c.setSenha(2222);
		
		SistemasInternos s = new SistemasInternos();
		s.autentica(g);
		s.autentica(d);
		s.autentica(c);
	}

}
