package retim;


/**
 *	Generated from IDL interface "Calculator"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _CalculatorStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements retim.Calculator
{
	private String[] ids = {"IDL:retim/Calculator:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = retim.CalculatorOperations.class;
	public int sum(int a, int b)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "sum", true);
				_os.write_long(a);
				_os.write_long(b);
				_is = _invoke(_os);
				int _result = _is.read_long();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "sum", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CalculatorOperations _localServant = (CalculatorOperations)_so.servant;
			int _result;			try
			{
			_result = _localServant.sum(a,b);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

}
