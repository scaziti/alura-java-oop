
public class TesteConexao {

	public static void main(String[] args) {
		
		try (Conexao conexao = new Conexao()){
			conexao.LeDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conex�o");
		}
		
		//--------------------------------
		
//		Conexao con = null; // Declaro assim, pois ao declarar apenas no try, ser� local
//		try {
//			con = new Conexao();
//			con.LeDados();
//		} catch (IllegalStateException ex) {
//			System.out.println("Deu erro na conex�o");
//		} finally {
//			System.out.println("Finally");
//			if (con != null) {
//				con.close();
//			}
//		} 
	}
}
