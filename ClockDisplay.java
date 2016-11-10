
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    private NumberDisplay horas;
    
    private NumberDisplay minutos;

    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
    }
    
    public void fixHour(int hora1, int minutos1)
    {
		horas.setValue(hora1);
		minutos.setValue(minutos1);
    }

	public void incrementMinutes()
	{
		minutos.increment();
		if (minutos.getValue() == 0){
			horas.increment();
		}
	}
	
	public String mostrarFecha() {
		return horas.getDisplayValue() + ":" + minutos.getDisplayValue();
	}
	
}
