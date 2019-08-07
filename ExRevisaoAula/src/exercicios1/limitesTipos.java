package exercicios1;

public class limitesTipos {
		public void tipos() {// ??
		info(Boolean.class, 8, null, null);
		System.out.println("-------------------------------");

		info(Character.class, Character.SIZE, Character.MIN_VALUE, Character.MAX_VALUE);
		System.out.println("-------------------------------");

		info(Integer.class, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.println("-------------------------------");

		info(Byte.class, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
		System.out.println("-------------------------------");

		info(Short.class, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
		System.out.println("-------------------------------");

		info(Long.class, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
		System.out.println("-------------------------------");
		
		info(Float.class, Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
		System.out.println("-------------------------------");

		info(Double.class, Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
		System.out.println("-------------------------------");
		
	}
	
	public static void info(Class c, Integer tam, Object min, Object max) {
		System.out.println("Classe: " + c.getName());
		System.out.println("Tamanho: " + tam + " bits");
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
	}
}
