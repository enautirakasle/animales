import java.util.Random;
	public class caballitoDeMar {
		 private String nombre, reproducion, genero, familia;
		 private int hedad, peso_medio;
		 
		 
		 public void presentarme() {
			 System.out.println("un dia un pescador, me vio... un animal invertebrado,");
			 System.out.println("con cabeza tobular carente de dientes");
			 System.out.println("de 10 cm...");
			 System.out.println(" y dijo :");
			 System.out.println("--coño!! un caballo--");
		 }
		 
		 public String getNombre() {
			return nombre;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public String getReproducion() {
			return reproducion;
		}
		
		public void setReproducion(String reproducion) {
			this.reproducion = reproducion;
		}
		
		public String getGenero() {
			return genero;
		}
		
		public void setGenero(String genero) {
			this.genero = genero;
		}
		
		public String getFamilia() {
			return familia;
		}
		
		public void setFamilia(String familia) {
			this.familia = familia;
		}
		
		public int getHedad() {
			return hedad;
		}
		
		public void setHedad(int hedad) {
			this.hedad = hedad;
		}
		
		public int getPeso_medio() {
			return peso_medio;
		}
		
		public void setPeso_medio(int peso_medio) {
			this.peso_medio = peso_medio;
		}
		
		public int[] colorRGB () {
			 int[] res = {-1,-1,-1};
			 Random random = new Random();
			 while(res[0]>0 && res[0]<255) {
				res[0]=random.nextInt(); 
			 }
			 while(res[1]>0 && res[1]<255) {
					res[0]=random.nextInt(); 
			 }
			 while(res[2]>0 && res[2]<255) {
					res[0]=random.nextInt(); 
			 }
			 return res;
		 }
	}
