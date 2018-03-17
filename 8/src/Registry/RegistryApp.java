package Registry;


/**
 * Entry point to students registry application.
 *
 * @author Dominik Harmim harmim6@gmail.com
 */
public class RegistryApp
{
	public static void main(String[] args)
	{
		new RegistryCli(new Registry()).run();
	}
}
