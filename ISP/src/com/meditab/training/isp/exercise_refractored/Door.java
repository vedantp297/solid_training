package com.meditab.training.isp.exercise;

public interface Door_LUOC
{
    void lock();
	
    void unlock();

    void open();

    void close();

}
public interface timeOut
{
	
    void timeOutCallback();

}
public interface proximity
{
	
    void proximityCallback();
	
}

public class Door implements Door_LUOC
{
	private boolean _locked;
    private boolean _opened;
	
	@Override
    public void lock()
    {
        _locked = true;
    }

    @Override
    public void unlock()
    {
        _locked = false;
    }

    @Override
    public void open()
    {
        if (!_locked) {
            _opened = true;
        }
    }

    @Override
    public void close()
    {
        _opened = false;
    }
	
}
