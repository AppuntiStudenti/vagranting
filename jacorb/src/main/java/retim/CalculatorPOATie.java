package retim;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "Calculator"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class CalculatorPOATie
	extends CalculatorPOA
{
	private CalculatorOperations _delegate;

	private POA _poa;
	public CalculatorPOATie(CalculatorOperations delegate)
	{
		_delegate = delegate;
	}
	public CalculatorPOATie(CalculatorOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public retim.Calculator _this()
	{
		return retim.CalculatorHelper.narrow(_this_object());
	}
	public retim.Calculator _this(org.omg.CORBA.ORB orb)
	{
		return retim.CalculatorHelper.narrow(_this_object(orb));
	}
	public CalculatorOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(CalculatorOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		else
		{
			return super._default_POA();
		}
	}
	public int sum(int a, int b)
	{
		return _delegate.sum(a,b);
	}

}
