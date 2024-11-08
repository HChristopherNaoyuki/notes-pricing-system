package Solution;

/**
 * Abstract class representing Notes with a summary name and price.
 * Provides a template for subclasses to define specific pricing.
 */
public abstract class Notes 
{
    // Field for the summary name
    private String summaryName;
    
    // Field for the price of the summary
    protected double price;

    /**
     * Constructor initializes the summary name.
     * @param summaryName - Name of the summary
     */
    public Notes(String summaryName)
    {
        this.summaryName = summaryName;
    }

    /**
     * Gets the summary name of the note.
     * @return summary name as String
     */
    public String getSummaryName()
    {
        return summaryName;
    }

    /**
     * Gets the price of the summary.
     * @return price as double
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * Abstract method for setting the price.
     * This must be implemented by subclasses.
     */
    public abstract void setPrice();
}
