package get_set;

public class FechaImpl implements Fecha{
	private Integer dia;
    private Integer mes;
    private Integer anyo;

    public FechaImpl(Integer d, Integer m, Integer a){
        dia=d;
        mes=m;
        anyo=a;
    }

    public Integer getDia() {
        return dia;
    }
    public Integer getMes() {
        return mes;
    }
    public Integer getAnyo() {
        return anyo;
    }

    public String toString(){
        return getDia()+"/"+getMes()+"/"+getAnyo();
    }

	@Override
	public int getdia() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getmes() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getanyo() {
		// TODO Auto-generated method stub
		return 0;
	}
}
