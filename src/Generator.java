public class Generator
{
	private String color;
	private Engine engine;
	
	public Generator (String color) {		
	 this.color = color;
	 
		engine = new Engine();
	}
	
	public void setColor (String color) {
		this.color = color;
	} 
	
	public String start() {
		return engine.startEngine();
	}
	
}
